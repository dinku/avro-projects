/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.sudip.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ScreenInstance extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ScreenInstance\",\"namespace\":\"com.sudip.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"eventTime\",\"type\":\"long\"},{\"name\":\"parentModule\",\"type\":{\"type\":\"record\",\"name\":\"ModuleInstance\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"eventTime\",\"type\":\"long\"},{\"name\":\"parentApp\",\"type\":{\"type\":\"record\",\"name\":\"ApplicationInstance\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"eventTime\",\"type\":\"long\"}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public long eventTime;
  @Deprecated public com.sudip.avro.ModuleInstance parentModule;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ScreenInstance() {}

  /**
   * All-args constructor.
   */
  public ScreenInstance(java.lang.CharSequence id, java.lang.Long eventTime, com.sudip.avro.ModuleInstance parentModule) {
    this.id = id;
    this.eventTime = eventTime;
    this.parentModule = parentModule;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return eventTime;
    case 2: return parentModule;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: eventTime = (java.lang.Long)value$; break;
    case 2: parentModule = (com.sudip.avro.ModuleInstance)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'eventTime' field.
   */
  public java.lang.Long getEventTime() {
    return eventTime;
  }

  /**
   * Sets the value of the 'eventTime' field.
   * @param value the value to set.
   */
  public void setEventTime(java.lang.Long value) {
    this.eventTime = value;
  }

  /**
   * Gets the value of the 'parentModule' field.
   */
  public com.sudip.avro.ModuleInstance getParentModule() {
    return parentModule;
  }

  /**
   * Sets the value of the 'parentModule' field.
   * @param value the value to set.
   */
  public void setParentModule(com.sudip.avro.ModuleInstance value) {
    this.parentModule = value;
  }

  /** Creates a new ScreenInstance RecordBuilder */
  public static com.sudip.avro.ScreenInstance.Builder newBuilder() {
    return new com.sudip.avro.ScreenInstance.Builder();
  }
  
  /** Creates a new ScreenInstance RecordBuilder by copying an existing Builder */
  public static com.sudip.avro.ScreenInstance.Builder newBuilder(com.sudip.avro.ScreenInstance.Builder other) {
    return new com.sudip.avro.ScreenInstance.Builder(other);
  }
  
  /** Creates a new ScreenInstance RecordBuilder by copying an existing ScreenInstance instance */
  public static com.sudip.avro.ScreenInstance.Builder newBuilder(com.sudip.avro.ScreenInstance other) {
    return new com.sudip.avro.ScreenInstance.Builder(other);
  }
  
  /**
   * RecordBuilder for ScreenInstance instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ScreenInstance>
    implements org.apache.avro.data.RecordBuilder<ScreenInstance> {

    private java.lang.CharSequence id;
    private long eventTime;
    private com.sudip.avro.ModuleInstance parentModule;

    /** Creates a new Builder */
    private Builder() {
      super(com.sudip.avro.ScreenInstance.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.sudip.avro.ScreenInstance.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[1].schema(), other.eventTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parentModule)) {
        this.parentModule = data().deepCopy(fields()[2].schema(), other.parentModule);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ScreenInstance instance */
    private Builder(com.sudip.avro.ScreenInstance other) {
            super(com.sudip.avro.ScreenInstance.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[1].schema(), other.eventTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parentModule)) {
        this.parentModule = data().deepCopy(fields()[2].schema(), other.parentModule);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.sudip.avro.ScreenInstance.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.sudip.avro.ScreenInstance.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'eventTime' field */
    public java.lang.Long getEventTime() {
      return eventTime;
    }
    
    /** Sets the value of the 'eventTime' field */
    public com.sudip.avro.ScreenInstance.Builder setEventTime(long value) {
      validate(fields()[1], value);
      this.eventTime = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'eventTime' field has been set */
    public boolean hasEventTime() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'eventTime' field */
    public com.sudip.avro.ScreenInstance.Builder clearEventTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'parentModule' field */
    public com.sudip.avro.ModuleInstance getParentModule() {
      return parentModule;
    }
    
    /** Sets the value of the 'parentModule' field */
    public com.sudip.avro.ScreenInstance.Builder setParentModule(com.sudip.avro.ModuleInstance value) {
      validate(fields()[2], value);
      this.parentModule = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'parentModule' field has been set */
    public boolean hasParentModule() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'parentModule' field */
    public com.sudip.avro.ScreenInstance.Builder clearParentModule() {
      parentModule = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public ScreenInstance build() {
      try {
        ScreenInstance record = new ScreenInstance();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.eventTime = fieldSetFlags()[1] ? this.eventTime : (java.lang.Long) defaultValue(fields()[1]);
        record.parentModule = fieldSetFlags()[2] ? this.parentModule : (com.sudip.avro.ModuleInstance) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
