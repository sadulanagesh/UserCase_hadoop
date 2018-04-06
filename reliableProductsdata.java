// ORM class for table 'reliableProductsdata'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Apr 05 16:52:41 IST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class reliableProductsdata extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("SENSEX_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        reliableProductsdata.this.SENSEX_ID = (Integer)value;
      }
    });
    setters.put("SENSEX_NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        reliableProductsdata.this.SENSEX_NAME = (String)value;
      }
    });
    setters.put("TYPEOF_TRADING", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        reliableProductsdata.this.TYPEOF_TRADING = (String)value;
      }
    });
    setters.put("LOCATION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        reliableProductsdata.this.LOCATION = (String)value;
      }
    });
    setters.put("OPENING_BALANCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        reliableProductsdata.this.OPENING_BALANCE = (Integer)value;
      }
    });
    setters.put("CLOSING_BALANCE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        reliableProductsdata.this.CLOSING_BALANCE = (Integer)value;
      }
    });
    setters.put("FLUTUATION_RATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        reliableProductsdata.this.FLUTUATION_RATE = (Integer)value;
      }
    });
  }
  public reliableProductsdata() {
    init0();
  }
  private Integer SENSEX_ID;
  public Integer get_SENSEX_ID() {
    return SENSEX_ID;
  }
  public void set_SENSEX_ID(Integer SENSEX_ID) {
    this.SENSEX_ID = SENSEX_ID;
  }
  public reliableProductsdata with_SENSEX_ID(Integer SENSEX_ID) {
    this.SENSEX_ID = SENSEX_ID;
    return this;
  }
  private String SENSEX_NAME;
  public String get_SENSEX_NAME() {
    return SENSEX_NAME;
  }
  public void set_SENSEX_NAME(String SENSEX_NAME) {
    this.SENSEX_NAME = SENSEX_NAME;
  }
  public reliableProductsdata with_SENSEX_NAME(String SENSEX_NAME) {
    this.SENSEX_NAME = SENSEX_NAME;
    return this;
  }
  private String TYPEOF_TRADING;
  public String get_TYPEOF_TRADING() {
    return TYPEOF_TRADING;
  }
  public void set_TYPEOF_TRADING(String TYPEOF_TRADING) {
    this.TYPEOF_TRADING = TYPEOF_TRADING;
  }
  public reliableProductsdata with_TYPEOF_TRADING(String TYPEOF_TRADING) {
    this.TYPEOF_TRADING = TYPEOF_TRADING;
    return this;
  }
  private String LOCATION;
  public String get_LOCATION() {
    return LOCATION;
  }
  public void set_LOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
  }
  public reliableProductsdata with_LOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }
  private Integer OPENING_BALANCE;
  public Integer get_OPENING_BALANCE() {
    return OPENING_BALANCE;
  }
  public void set_OPENING_BALANCE(Integer OPENING_BALANCE) {
    this.OPENING_BALANCE = OPENING_BALANCE;
  }
  public reliableProductsdata with_OPENING_BALANCE(Integer OPENING_BALANCE) {
    this.OPENING_BALANCE = OPENING_BALANCE;
    return this;
  }
  private Integer CLOSING_BALANCE;
  public Integer get_CLOSING_BALANCE() {
    return CLOSING_BALANCE;
  }
  public void set_CLOSING_BALANCE(Integer CLOSING_BALANCE) {
    this.CLOSING_BALANCE = CLOSING_BALANCE;
  }
  public reliableProductsdata with_CLOSING_BALANCE(Integer CLOSING_BALANCE) {
    this.CLOSING_BALANCE = CLOSING_BALANCE;
    return this;
  }
  private Integer FLUTUATION_RATE;
  public Integer get_FLUTUATION_RATE() {
    return FLUTUATION_RATE;
  }
  public void set_FLUTUATION_RATE(Integer FLUTUATION_RATE) {
    this.FLUTUATION_RATE = FLUTUATION_RATE;
  }
  public reliableProductsdata with_FLUTUATION_RATE(Integer FLUTUATION_RATE) {
    this.FLUTUATION_RATE = FLUTUATION_RATE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof reliableProductsdata)) {
      return false;
    }
    reliableProductsdata that = (reliableProductsdata) o;
    boolean equal = true;
    equal = equal && (this.SENSEX_ID == null ? that.SENSEX_ID == null : this.SENSEX_ID.equals(that.SENSEX_ID));
    equal = equal && (this.SENSEX_NAME == null ? that.SENSEX_NAME == null : this.SENSEX_NAME.equals(that.SENSEX_NAME));
    equal = equal && (this.TYPEOF_TRADING == null ? that.TYPEOF_TRADING == null : this.TYPEOF_TRADING.equals(that.TYPEOF_TRADING));
    equal = equal && (this.LOCATION == null ? that.LOCATION == null : this.LOCATION.equals(that.LOCATION));
    equal = equal && (this.OPENING_BALANCE == null ? that.OPENING_BALANCE == null : this.OPENING_BALANCE.equals(that.OPENING_BALANCE));
    equal = equal && (this.CLOSING_BALANCE == null ? that.CLOSING_BALANCE == null : this.CLOSING_BALANCE.equals(that.CLOSING_BALANCE));
    equal = equal && (this.FLUTUATION_RATE == null ? that.FLUTUATION_RATE == null : this.FLUTUATION_RATE.equals(that.FLUTUATION_RATE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof reliableProductsdata)) {
      return false;
    }
    reliableProductsdata that = (reliableProductsdata) o;
    boolean equal = true;
    equal = equal && (this.SENSEX_ID == null ? that.SENSEX_ID == null : this.SENSEX_ID.equals(that.SENSEX_ID));
    equal = equal && (this.SENSEX_NAME == null ? that.SENSEX_NAME == null : this.SENSEX_NAME.equals(that.SENSEX_NAME));
    equal = equal && (this.TYPEOF_TRADING == null ? that.TYPEOF_TRADING == null : this.TYPEOF_TRADING.equals(that.TYPEOF_TRADING));
    equal = equal && (this.LOCATION == null ? that.LOCATION == null : this.LOCATION.equals(that.LOCATION));
    equal = equal && (this.OPENING_BALANCE == null ? that.OPENING_BALANCE == null : this.OPENING_BALANCE.equals(that.OPENING_BALANCE));
    equal = equal && (this.CLOSING_BALANCE == null ? that.CLOSING_BALANCE == null : this.CLOSING_BALANCE.equals(that.CLOSING_BALANCE));
    equal = equal && (this.FLUTUATION_RATE == null ? that.FLUTUATION_RATE == null : this.FLUTUATION_RATE.equals(that.FLUTUATION_RATE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SENSEX_ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SENSEX_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TYPEOF_TRADING = JdbcWritableBridge.readString(3, __dbResults);
    this.LOCATION = JdbcWritableBridge.readString(4, __dbResults);
    this.OPENING_BALANCE = JdbcWritableBridge.readInteger(5, __dbResults);
    this.CLOSING_BALANCE = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLUTUATION_RATE = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SENSEX_ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SENSEX_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.TYPEOF_TRADING = JdbcWritableBridge.readString(3, __dbResults);
    this.LOCATION = JdbcWritableBridge.readString(4, __dbResults);
    this.OPENING_BALANCE = JdbcWritableBridge.readInteger(5, __dbResults);
    this.CLOSING_BALANCE = JdbcWritableBridge.readInteger(6, __dbResults);
    this.FLUTUATION_RATE = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SENSEX_ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SENSEX_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TYPEOF_TRADING, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOCATION, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(OPENING_BALANCE, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CLOSING_BALANCE, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLUTUATION_RATE, 7 + __off, 4, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SENSEX_ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SENSEX_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TYPEOF_TRADING, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOCATION, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(OPENING_BALANCE, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CLOSING_BALANCE, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(FLUTUATION_RATE, 7 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.SENSEX_ID = null;
    } else {
    this.SENSEX_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SENSEX_NAME = null;
    } else {
    this.SENSEX_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TYPEOF_TRADING = null;
    } else {
    this.TYPEOF_TRADING = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOCATION = null;
    } else {
    this.LOCATION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPENING_BALANCE = null;
    } else {
    this.OPENING_BALANCE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CLOSING_BALANCE = null;
    } else {
    this.CLOSING_BALANCE = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FLUTUATION_RATE = null;
    } else {
    this.FLUTUATION_RATE = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.SENSEX_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SENSEX_ID);
    }
    if (null == this.SENSEX_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SENSEX_NAME);
    }
    if (null == this.TYPEOF_TRADING) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TYPEOF_TRADING);
    }
    if (null == this.LOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCATION);
    }
    if (null == this.OPENING_BALANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OPENING_BALANCE);
    }
    if (null == this.CLOSING_BALANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CLOSING_BALANCE);
    }
    if (null == this.FLUTUATION_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLUTUATION_RATE);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.SENSEX_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SENSEX_ID);
    }
    if (null == this.SENSEX_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SENSEX_NAME);
    }
    if (null == this.TYPEOF_TRADING) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TYPEOF_TRADING);
    }
    if (null == this.LOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCATION);
    }
    if (null == this.OPENING_BALANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OPENING_BALANCE);
    }
    if (null == this.CLOSING_BALANCE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CLOSING_BALANCE);
    }
    if (null == this.FLUTUATION_RATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FLUTUATION_RATE);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(SENSEX_ID==null?"null":"" + SENSEX_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SENSEX_NAME==null?"null":SENSEX_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TYPEOF_TRADING==null?"null":TYPEOF_TRADING, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCATION==null?"null":LOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENING_BALANCE==null?"null":"" + OPENING_BALANCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSING_BALANCE==null?"null":"" + CLOSING_BALANCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLUTUATION_RATE==null?"null":"" + FLUTUATION_RATE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(SENSEX_ID==null?"null":"" + SENSEX_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SENSEX_NAME==null?"null":SENSEX_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TYPEOF_TRADING==null?"null":TYPEOF_TRADING, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCATION==null?"null":LOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPENING_BALANCE==null?"null":"" + OPENING_BALANCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSING_BALANCE==null?"null":"" + CLOSING_BALANCE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FLUTUATION_RATE==null?"null":"" + FLUTUATION_RATE, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SENSEX_ID = null; } else {
      this.SENSEX_ID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SENSEX_NAME = null; } else {
      this.SENSEX_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TYPEOF_TRADING = null; } else {
      this.TYPEOF_TRADING = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LOCATION = null; } else {
      this.LOCATION = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENING_BALANCE = null; } else {
      this.OPENING_BALANCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CLOSING_BALANCE = null; } else {
      this.CLOSING_BALANCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLUTUATION_RATE = null; } else {
      this.FLUTUATION_RATE = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SENSEX_ID = null; } else {
      this.SENSEX_ID = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SENSEX_NAME = null; } else {
      this.SENSEX_NAME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.TYPEOF_TRADING = null; } else {
      this.TYPEOF_TRADING = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LOCATION = null; } else {
      this.LOCATION = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPENING_BALANCE = null; } else {
      this.OPENING_BALANCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CLOSING_BALANCE = null; } else {
      this.CLOSING_BALANCE = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FLUTUATION_RATE = null; } else {
      this.FLUTUATION_RATE = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    reliableProductsdata o = (reliableProductsdata) super.clone();
    return o;
  }

  public void clone0(reliableProductsdata o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("SENSEX_ID", this.SENSEX_ID);
    __sqoop$field_map.put("SENSEX_NAME", this.SENSEX_NAME);
    __sqoop$field_map.put("TYPEOF_TRADING", this.TYPEOF_TRADING);
    __sqoop$field_map.put("LOCATION", this.LOCATION);
    __sqoop$field_map.put("OPENING_BALANCE", this.OPENING_BALANCE);
    __sqoop$field_map.put("CLOSING_BALANCE", this.CLOSING_BALANCE);
    __sqoop$field_map.put("FLUTUATION_RATE", this.FLUTUATION_RATE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SENSEX_ID", this.SENSEX_ID);
    __sqoop$field_map.put("SENSEX_NAME", this.SENSEX_NAME);
    __sqoop$field_map.put("TYPEOF_TRADING", this.TYPEOF_TRADING);
    __sqoop$field_map.put("LOCATION", this.LOCATION);
    __sqoop$field_map.put("OPENING_BALANCE", this.OPENING_BALANCE);
    __sqoop$field_map.put("CLOSING_BALANCE", this.CLOSING_BALANCE);
    __sqoop$field_map.put("FLUTUATION_RATE", this.FLUTUATION_RATE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
