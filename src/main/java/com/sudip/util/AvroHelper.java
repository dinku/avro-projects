package com.sudip.util;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileStream;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.avro.reflect.ReflectDatumWriter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by sbhattacharya on 12/1/2014.
 */
public class AvroHelper {

  public static <T> byte[] marshal(T object, Class<T> objectClass) throws IOException {
    Schema schema = ReflectData.get().getSchema(objectClass);
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ReflectDatumWriter<T> reflectDatumWriter = new ReflectDatumWriter<>(schema);
    DataFileWriter<T> writer = new DataFileWriter<>(reflectDatumWriter).create(schema, outputStream);
    writer.append(object);
    writer.close();
    return outputStream.toByteArray();
  }

  public static <T> T unmarshal(byte[] bytes, Class<T> returnType) throws IOException {
    Schema schema = ReflectData.get().getSchema(returnType);
    ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
    ReflectDatumReader<T> reflectDatumReader = new ReflectDatumReader<>(schema);
    DataFileStream<T> reader = new DataFileStream<>(inputStream, reflectDatumReader);
    T rv = reader.next();
    reader.close();
    inputStream.close();
    return rv;
  }

}
