package com.sudip.test;

import com.sudip.avro.ApplicationInstance;
import com.sudip.avro.ModuleInstance;
import com.sudip.avro.ScreenInstance;
import com.sudip.util.AvroHelper;

import java.io.IOException;

/**
 * Created by sbhattacharya on 12/1/2014.
 */
public class AvroTest {

  public static void main(String[] args) throws IOException {

    ApplicationInstance application = ApplicationInstance.newBuilder().setId("app1").setEventTime(10000L).build();
    System.out.println(application);

    ModuleInstance module = ModuleInstance.newBuilder().setId("m1").setEventTime(10000L).setParentApp(application).build();
    System.out.println(module);

    ScreenInstance screen = ScreenInstance.newBuilder().setId("s1").setEventTime(100020L).setParentModule(module).build();
    System.out.println(screen);

    // Serialize application to byte stream

    byte[] dataApplication = AvroHelper.marshal(application, ApplicationInstance.class);

    // Deserialize application from byte stream
    ApplicationInstance applicationFromData = AvroHelper.unmarshal(dataApplication, ApplicationInstance.class);
    System.out.println(applicationFromData);

    // Serialize module to byte stream
    byte[] dataModule = AvroHelper.marshal(module, ModuleInstance.class);

    // Deserialize Module from byte stream
    ModuleInstance moduleFromData = AvroHelper.unmarshal(dataModule, ModuleInstance.class);

    System.out.println(moduleFromData);
    ApplicationInstance parentApp = module.getParentApp();
    System.out.println(parentApp);

    // Serialize screen to byte stream
    byte[] dataScreen = AvroHelper.marshal(screen, ScreenInstance.class);

    // Deserialize screen from byte stream
    ScreenInstance screenFromData = AvroHelper.unmarshal(dataScreen, ScreenInstance.class);
    System.out.println(screenFromData);
    ModuleInstance parentModule = screen.getParentModule();
    System.out.println(parentModule);
    ApplicationInstance parentAppFromParentModule = parentModule.getParentApp();
    System.out.println(parentAppFromParentModule);

  }

}
