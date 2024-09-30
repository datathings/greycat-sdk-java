// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package ai.greycat;
@SuppressWarnings({"unused", "unchecked"})
public final class std extends ai.greycat.GreyCat.Library {
  public static final java.lang.String name = "std";
  @Override
  public java.lang.String name() {
    return name;
  }
  public static final class core {
    public static final class type extends ai.greycat.std_n.core.type {
      public static final java.lang.String name = "core::type";
      private type(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static type create(ai.greycat.GreyCat greycat) {
        return new type(greycat.libs_by_name.get(ai.greycat.std.name).mapped[2]);
      }
    }
    public static final class field extends ai.greycat.std_n.core.field {
      public static final java.lang.String name = "core::field";
      private field(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static field create(ai.greycat.GreyCat greycat) {
        return new field(greycat.libs_by_name.get(ai.greycat.std.name).mapped[3]);
      }
    }
    public static final class function extends ai.greycat.std_n.core.function {
      public static final java.lang.String name = "core::function";
      private function(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static function create(ai.greycat.GreyCat greycat) {
        return new function(greycat.libs_by_name.get(ai.greycat.std.name).mapped[4]);
      }
    }
    public static final class FloatPrecision extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::FloatPrecision";
      private FloatPrecision(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.FloatPrecision p1(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.FloatPrecision p10(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.core.FloatPrecision p100(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.core.FloatPrecision p1000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[3]];
      }
      public static ai.greycat.std.core.FloatPrecision p10000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[4]];
      }
      public static ai.greycat.std.core.FloatPrecision p100000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[5]];
      }
      public static ai.greycat.std.core.FloatPrecision p1000000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[6]];
      }
      public static ai.greycat.std.core.FloatPrecision p10000000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[7]];
      }
      public static ai.greycat.std.core.FloatPrecision p100000000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[8]];
      }
      public static ai.greycat.std.core.FloatPrecision p1000000000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[9]];
      }
      public static ai.greycat.std.core.FloatPrecision p10000000000(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[9];
        return (ai.greycat.std.core.FloatPrecision) t.enum_values[t.generated_offsets[10]];
      }
      public static FloatPrecision create(ai.greycat.GreyCat greycat) {
        return new FloatPrecision(greycat.libs_by_name.get(ai.greycat.std.name).mapped[9]);
      }
    }
    public static final class nodeTime<T> extends ai.greycat.std_n.core.nodeTime<T> {
      public static final java.lang.String name = "core::nodeTime";
      private nodeTime(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static ai.greycat.std.core.Table sample(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeTime> refs, ai.greycat.std.core.time from, ai.greycat.std.core.time to, java.lang.Long maxRows, ai.greycat.std.core.SamplingMode mode, ai.greycat.std.core.duration maxDephasing, ai.greycat.std.core.TimeZone tz) throws java.io.IOException {
        return (ai.greycat.std.core.Table) greycat.call("core::nodeTime::sample", refs, from, to, maxRows, mode, maxDephasing, tz);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo<ai.greycat.std.core.time>> info(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeTime> nodes) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo<ai.greycat.std.core.time>>) greycat.call("core::nodeTime::info", nodes);
      }
      public static <T> nodeTime<T> create(ai.greycat.GreyCat greycat) {
        return new nodeTime<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[10]);
      }
    }
    public static final class nodeTimeSingleton extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::nodeTimeSingleton";
      private nodeTimeSingleton(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.time t() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[0]);
      }
      public void set_t(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Object v() {
        return (java.lang.Object) super.get(super.type.generated_offsets[1]);
      }
      public void set_v(java.lang.Object v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static nodeTimeSingleton create(ai.greycat.GreyCat greycat) {
        return new nodeTimeSingleton(greycat.libs_by_name.get(ai.greycat.std.name).mapped[11]);
      }
    }
    public static final class NodeInfo<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::NodeInfo";
      private NodeInfo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long size() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_size(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Object from() {
        return (java.lang.Object) super.get(super.type.generated_offsets[1]);
      }
      public void set_from(java.lang.Object v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Object to() {
        return (java.lang.Object) super.get(super.type.generated_offsets[2]);
      }
      public void set_to(java.lang.Object v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static <T> NodeInfo<T> create(ai.greycat.GreyCat greycat) {
        return new NodeInfo<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[12]);
      }
    }
    public static final class nodeTimeCursor<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::nodeTimeCursor";
      private nodeTimeCursor(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.nodeTime n() {
        return (ai.greycat.std.core.nodeTime) super.get(super.type.generated_offsets[0]);
      }
      public void set_n(ai.greycat.std.core.nodeTime v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.time req_time() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[1]);
      }
      public void set_req_time(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> nodeTimeCursor<T> create(ai.greycat.GreyCat greycat) {
        return new nodeTimeCursor<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[13]);
      }
    }
    public static final class node<T> extends ai.greycat.std_n.core.node<T> {
      public static final java.lang.String name = "core::node";
      private node(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static ai.greycat.std.core.Array resolve_all(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.node> n) throws java.io.IOException {
        return (ai.greycat.std.core.Array) greycat.call("core::node::resolve_all", n);
      }
      public static <T> node<T> create(ai.greycat.GreyCat greycat) {
        return new node<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[14]);
      }
    }
    public static final class nodeIndex<K, V> extends ai.greycat.std_n.core.nodeIndex<K, V> {
      public static final java.lang.String name = "core::nodeIndex";
      private nodeIndex(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static ai.greycat.std.core.Table sample(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeIndex> refs, java.lang.Object from, java.lang.Long maxRows, ai.greycat.std.core.SamplingMode mode) throws java.io.IOException {
        return (ai.greycat.std.core.Table) greycat.call("core::nodeIndex::sample", refs, from, maxRows, mode);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo> info(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeIndex> nodes) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo>) greycat.call("core::nodeIndex::info", nodes);
      }
      public static <K, V> nodeIndex<K, V> create(ai.greycat.GreyCat greycat) {
        return new nodeIndex<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[15]);
      }
    }
    public static final class nodeList<T> extends ai.greycat.std_n.core.nodeList<T> {
      public static final java.lang.String name = "core::nodeList";
      private nodeList(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static ai.greycat.std.core.Table sample(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeList> refs, java.lang.Long from, java.lang.Long to, java.lang.Long maxRows, ai.greycat.std.core.SamplingMode mode, java.lang.Long maxDephasing) throws java.io.IOException {
        return (ai.greycat.std.core.Table) greycat.call("core::nodeList::sample", refs, from, to, maxRows, mode, maxDephasing);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo<java.lang.Long>> info(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeList> nodes) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo<java.lang.Long>>) greycat.call("core::nodeList::info", nodes);
      }
      public static <T> nodeList<T> create(ai.greycat.GreyCat greycat) {
        return new nodeList<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[16]);
      }
    }
    public static final class duration extends ai.greycat.std_n.core.duration {
      public static final java.lang.String name = "core::duration";
      private duration(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static duration create(ai.greycat.GreyCat greycat) {
        return new duration(greycat.libs_by_name.get(ai.greycat.std.name).mapped[17]);
      }
    }
    public static final class CalendarUnit extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::CalendarUnit";
      private CalendarUnit(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.CalendarUnit year(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[18];
        return (ai.greycat.std.core.CalendarUnit) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.CalendarUnit month(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[18];
        return (ai.greycat.std.core.CalendarUnit) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.core.CalendarUnit day(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[18];
        return (ai.greycat.std.core.CalendarUnit) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.core.CalendarUnit hour(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[18];
        return (ai.greycat.std.core.CalendarUnit) t.enum_values[t.generated_offsets[3]];
      }
      public static ai.greycat.std.core.CalendarUnit minute(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[18];
        return (ai.greycat.std.core.CalendarUnit) t.enum_values[t.generated_offsets[4]];
      }
      public static ai.greycat.std.core.CalendarUnit second(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[18];
        return (ai.greycat.std.core.CalendarUnit) t.enum_values[t.generated_offsets[5]];
      }
      public static ai.greycat.std.core.CalendarUnit microsecond(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[18];
        return (ai.greycat.std.core.CalendarUnit) t.enum_values[t.generated_offsets[6]];
      }
      public static CalendarUnit create(ai.greycat.GreyCat greycat) {
        return new CalendarUnit(greycat.libs_by_name.get(ai.greycat.std.name).mapped[18]);
      }
    }
    public static final class time extends ai.greycat.std_n.core.time {
      public static final java.lang.String name = "core::time";
      private time(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static time create(ai.greycat.GreyCat greycat) {
        return new time(greycat.libs_by_name.get(ai.greycat.std.name).mapped[19]);
      }
    }
    public static final class ErrorCode extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::ErrorCode";
      private ErrorCode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.ErrorCode none(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[20];
        return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.ErrorCode interrupted(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[20];
        return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.core.ErrorCode await(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[20];
        return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.core.ErrorCode timeout(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[20];
        return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[3]];
      }
      public static ai.greycat.std.core.ErrorCode forbidden(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[20];
        return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[4]];
      }
      public static ai.greycat.std.core.ErrorCode runtime_error(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[20];
        return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[5]];
      }
      public static ErrorCode create(ai.greycat.GreyCat greycat) {
        return new ErrorCode(greycat.libs_by_name.get(ai.greycat.std.name).mapped[20]);
      }
    }
    public static final class ErrorFrame extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::ErrorFrame";
      private ErrorFrame(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String module() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_module(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String function() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_function(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long line() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_line(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Long column() {
        return (java.lang.Long) super.get(super.type.generated_offsets[3]);
      }
      public void set_column(java.lang.Long v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public static ErrorFrame create(ai.greycat.GreyCat greycat) {
        return new ErrorFrame(greycat.libs_by_name.get(ai.greycat.std.name).mapped[21]);
      }
    }
    public static final class Error extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::Error";
      private Error(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String message() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_message(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.ErrorFrame> stack() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.ErrorFrame>) super.get(super.type.generated_offsets[1]);
      }
      public void set_stack(ai.greycat.std.core.Array<ai.greycat.std.core.ErrorFrame> v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static Error create(ai.greycat.GreyCat greycat) {
        return new Error(greycat.libs_by_name.get(ai.greycat.std.name).mapped[22]);
      }
    }
    public static final class SamplingMode extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::SamplingMode";
      private SamplingMode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.SamplingMode fixed(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[23];
        return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.SamplingMode fixed_reg(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[23];
        return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.core.SamplingMode adaptative(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[23];
        return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.core.SamplingMode dense(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[23];
        return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[3]];
      }
      public static SamplingMode create(ai.greycat.GreyCat greycat) {
        return new SamplingMode(greycat.libs_by_name.get(ai.greycat.std.name).mapped[23]);
      }
    }
    public static final class SortOrder extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::SortOrder";
      private SortOrder(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.SortOrder asc(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[24];
        return (ai.greycat.std.core.SortOrder) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.SortOrder desc(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[24];
        return (ai.greycat.std.core.SortOrder) t.enum_values[t.generated_offsets[1]];
      }
      public static SortOrder create(ai.greycat.GreyCat greycat) {
        return new SortOrder(greycat.libs_by_name.get(ai.greycat.std.name).mapped[24]);
      }
    }
    public static final class Table<T> extends ai.greycat.std_n.core.Table<T> {
      public static final java.lang.String name = "core::Table";
      private Table(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static ai.greycat.std.core.Table applyMappings(ai.greycat.GreyCat greycat, ai.greycat.std.core.Table table, ai.greycat.std.core.Array<ai.greycat.std.core.TableColumnMapping> mappings) throws java.io.IOException {
        return (ai.greycat.std.core.Table) greycat.call("core::Table::applyMappings", table, mappings);
      }
      public static <T> Table<T> create(ai.greycat.GreyCat greycat) {
        return new Table<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[25]);
      }
    }
    public static final class TableColumnMapping extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::TableColumnMapping";
      private TableColumnMapping(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long column() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_column(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.Array<java.lang.Object> extractors() {
        return (ai.greycat.std.core.Array<java.lang.Object>) super.get(super.type.generated_offsets[1]);
      }
      public void set_extractors(ai.greycat.std.core.Array<java.lang.Object> v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static TableColumnMapping create(ai.greycat.GreyCat greycat) {
        return new TableColumnMapping(greycat.libs_by_name.get(ai.greycat.std.name).mapped[26]);
      }
    }
    public static final class DurationUnit extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::DurationUnit";
      private DurationUnit(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.DurationUnit microseconds(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[27];
        return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.DurationUnit milliseconds(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[27];
        return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.core.DurationUnit seconds(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[27];
        return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.core.DurationUnit minutes(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[27];
        return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[3]];
      }
      public static ai.greycat.std.core.DurationUnit hours(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[27];
        return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[4]];
      }
      public static ai.greycat.std.core.DurationUnit days(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[27];
        return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[5]];
      }
      public static DurationUnit create(ai.greycat.GreyCat greycat) {
        return new DurationUnit(greycat.libs_by_name.get(ai.greycat.std.name).mapped[27]);
      }
    }
    public static final class String extends ai.greycat.std_n.core.String {
      public static final java.lang.String name = "core::String";
      private String(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static String create(ai.greycat.GreyCat greycat) {
        return new String(greycat.libs_by_name.get(ai.greycat.std.name).mapped[28]);
      }
    }
    public static final class Buffer extends ai.greycat.std_n.core.Buffer {
      public static final java.lang.String name = "core::Buffer";
      private Buffer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static Buffer create(ai.greycat.GreyCat greycat) {
        return new Buffer(greycat.libs_by_name.get(ai.greycat.std.name).mapped[29]);
      }
    }
    public static final class Array<T> extends ai.greycat.std_n.core.Array<T> {
      public static final java.lang.String name = "core::Array";
      private Array(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static <T> Array<T> create(ai.greycat.GreyCat greycat) {
        return new Array<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[30]);
      }
    }
    public static final class TensorType extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::TensorType";
      private TensorType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.TensorType i32(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[31];
        return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.TensorType i64(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[31];
        return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.core.TensorType f32(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[31];
        return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.core.TensorType f64(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[31];
        return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[3]];
      }
      public static ai.greycat.std.core.TensorType c64(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[31];
        return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[4]];
      }
      public static ai.greycat.std.core.TensorType c128(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[31];
        return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[5]];
      }
      public static TensorType create(ai.greycat.GreyCat greycat) {
        return new TensorType(greycat.libs_by_name.get(ai.greycat.std.name).mapped[31]);
      }
    }
    public static final class Tensor extends ai.greycat.std_n.core.Tensor {
      public static final java.lang.String name = "core::Tensor";
      private Tensor(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static Tensor create(ai.greycat.GreyCat greycat) {
        return new Tensor(greycat.libs_by_name.get(ai.greycat.std.name).mapped[32]);
      }
    }
    public static final class Map<K, V> extends ai.greycat.std_n.core.Map<K, V> {
      public static final java.lang.String name = "core::Map";
      private Map(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static <K, V> Map<K, V> create(ai.greycat.GreyCat greycat) {
        return new Map<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[33]);
      }
    }
    public static final class Tuple<T, U> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::Tuple";
      private Tuple(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Object x() {
        return (java.lang.Object) super.get(super.type.generated_offsets[0]);
      }
      public void set_x(java.lang.Object v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Object y() {
        return (java.lang.Object) super.get(super.type.generated_offsets[1]);
      }
      public void set_y(java.lang.Object v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T, U> Tuple<T, U> create(ai.greycat.GreyCat greycat) {
        return new Tuple<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[34]);
      }
    }
    public static final class geo extends ai.greycat.std_n.core.geo {
      public static final java.lang.String name = "core::geo";
      private geo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static geo create(ai.greycat.GreyCat greycat) {
        return new geo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[35]);
      }
    }
    public static final class GeoCircle extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::GeoCircle";
      private GeoCircle(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.geo center() {
        return (ai.greycat.std.core.geo) super.get(super.type.generated_offsets[0]);
      }
      public void set_center(ai.greycat.std.core.geo v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Double radius() {
        return (java.lang.Double) super.get(super.type.generated_offsets[1]);
      }
      public void set_radius(java.lang.Double v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static GeoCircle create(ai.greycat.GreyCat greycat) {
        return new GeoCircle(greycat.libs_by_name.get(ai.greycat.std.name).mapped[36]);
      }
    }
    public static final class GeoPoly extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::GeoPoly";
      private GeoPoly(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.geo> points() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.geo>) super.get(super.type.generated_offsets[0]);
      }
      public void set_points(ai.greycat.std.core.Array<ai.greycat.std.core.geo> v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public static GeoPoly create(ai.greycat.GreyCat greycat) {
        return new GeoPoly(greycat.libs_by_name.get(ai.greycat.std.name).mapped[37]);
      }
    }
    public static final class GeoBox extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::GeoBox";
      private GeoBox(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.geo sw() {
        return (ai.greycat.std.core.geo) super.get(super.type.generated_offsets[0]);
      }
      public void set_sw(ai.greycat.std.core.geo v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.geo ne() {
        return (ai.greycat.std.core.geo) super.get(super.type.generated_offsets[1]);
      }
      public void set_ne(ai.greycat.std.core.geo v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static GeoBox create(ai.greycat.GreyCat greycat) {
        return new GeoBox(greycat.libs_by_name.get(ai.greycat.std.name).mapped[38]);
      }
    }
    public static final class nodeGeo<T> extends ai.greycat.std_n.core.nodeGeo<T> {
      public static final java.lang.String name = "core::nodeGeo";
      private nodeGeo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static ai.greycat.std.core.Table sample(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeGeo> refs, ai.greycat.std.core.geo from, ai.greycat.std.core.geo to, java.lang.Long maxRows, ai.greycat.std.core.SamplingMode mode) throws java.io.IOException {
        return (ai.greycat.std.core.Table) greycat.call("core::nodeGeo::sample", refs, from, to, maxRows, mode);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo<ai.greycat.std.core.geo>> info(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.nodeGeo> nodes) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.NodeInfo<ai.greycat.std.core.geo>>) greycat.call("core::nodeGeo::info", nodes);
      }
      public static <T> nodeGeo<T> create(ai.greycat.GreyCat greycat) {
        return new nodeGeo<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[39]);
      }
    }
    public static final class Date extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::Date";
      private Date(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long year() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_year(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long month() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_month(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long day() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_day(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Long hour() {
        return (java.lang.Long) super.get(super.type.generated_offsets[3]);
      }
      public void set_hour(java.lang.Long v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Long minute() {
        return (java.lang.Long) super.get(super.type.generated_offsets[4]);
      }
      public void set_minute(java.lang.Long v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Long second() {
        return (java.lang.Long) super.get(super.type.generated_offsets[5]);
      }
      public void set_second(java.lang.Long v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Long microsecond() {
        return (java.lang.Long) super.get(super.type.generated_offsets[6]);
      }
      public void set_microsecond(java.lang.Long v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public static ai.greycat.std.core.Date fromTime(ai.greycat.GreyCat greycat, ai.greycat.std.core.time time, ai.greycat.std.core.TimeZone tz) throws java.io.IOException {
        return (ai.greycat.std.core.Date) greycat.call("core::Date::fromTime", time, tz);
      }
      public static Date create(ai.greycat.GreyCat greycat) {
        return new Date(greycat.libs_by_name.get(ai.greycat.std.name).mapped[40]);
      }
    }
    public static final class t2 extends ai.greycat.std_n.core.t2 {
      public static final java.lang.String name = "core::t2";
      private t2(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static t2 create(ai.greycat.GreyCat greycat) {
        return new t2(greycat.libs_by_name.get(ai.greycat.std.name).mapped[41]);
      }
    }
    public static final class t3 extends ai.greycat.std_n.core.t3 {
      public static final java.lang.String name = "core::t3";
      private t3(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static t3 create(ai.greycat.GreyCat greycat) {
        return new t3(greycat.libs_by_name.get(ai.greycat.std.name).mapped[42]);
      }
    }
    public static final class t4 extends ai.greycat.std_n.core.t4 {
      public static final java.lang.String name = "core::t4";
      private t4(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static t4 create(ai.greycat.GreyCat greycat) {
        return new t4(greycat.libs_by_name.get(ai.greycat.std.name).mapped[43]);
      }
    }
    public static final class str extends ai.greycat.std_n.core.str {
      public static final java.lang.String name = "core::str";
      private str(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static str create(ai.greycat.GreyCat greycat) {
        return new str(greycat.libs_by_name.get(ai.greycat.std.name).mapped[44]);
      }
    }
    public static final class t2f extends ai.greycat.std_n.core.t2f {
      public static final java.lang.String name = "core::t2f";
      private t2f(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static t2f create(ai.greycat.GreyCat greycat) {
        return new t2f(greycat.libs_by_name.get(ai.greycat.std.name).mapped[45]);
      }
    }
    public static final class t3f extends ai.greycat.std_n.core.t3f {
      public static final java.lang.String name = "core::t3f";
      private t3f(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static t3f create(ai.greycat.GreyCat greycat) {
        return new t3f(greycat.libs_by_name.get(ai.greycat.std.name).mapped[46]);
      }
    }
    public static final class t4f extends ai.greycat.std_n.core.t4f {
      public static final java.lang.String name = "core::t4f";
      private t4f(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }
      public static t4f create(ai.greycat.GreyCat greycat) {
        return new t4f(greycat.libs_by_name.get(ai.greycat.std.name).mapped[47]);
      }
    }
    public static final class MathConstants extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "core::MathConstants";
      private MathConstants(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static MathConstants create(ai.greycat.GreyCat greycat) {
        return new MathConstants(greycat.libs_by_name.get(ai.greycat.std.name).mapped[48]);
      }
    }
    public static final class TimeZone extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "core::TimeZone";
      private TimeZone(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.core.TimeZone Africa_Accra(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Bamako(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Banjul(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Conakry(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[3]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Dakar(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[4]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Freetown(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[5]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Lome(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[6]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Nouakchott(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[7]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Ouagadougou(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[8]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Timbuktu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[9]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Reykjavik(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[10]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_St_Helena(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[11]];
      }
      public static ai.greycat.std.core.TimeZone Iceland(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[12]];
      }
      public static ai.greycat.std.core.TimeZone Egypt(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[13]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Maseru(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[14]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Mbabane(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[15]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Bangui(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[16]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Brazzaville(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[17]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Douala(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[18]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Kinshasa(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[19]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Libreville(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[20]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Luanda(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[21]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Malabo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[22]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Niamey(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[23]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Porto_Novo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[24]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Blantyre(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[25]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Bujumbura(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[26]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Gaborone(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[27]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Harare(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[28]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Kigali(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[29]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Lubumbashi(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[30]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Lusaka(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[31]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Addis_Ababa(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[32]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Asmara(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[33]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Asmera(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[34]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Dar_es_Salaam(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[35]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Djibouti(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[36]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Kampala(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[37]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Mogadishu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[38]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Antananarivo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[39]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Comoro(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[40]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Mayotte(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[41]];
      }
      public static ai.greycat.std.core.TimeZone Libya(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[42]];
      }
      public static ai.greycat.std.core.TimeZone America_Atka(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[43]];
      }
      public static ai.greycat.std.core.TimeZone US_Aleutian(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[44]];
      }
      public static ai.greycat.std.core.TimeZone US_Alaska(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[45]];
      }
      public static ai.greycat.std.core.TimeZone America_Buenos_Aires(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[46]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_ComodRivadavia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[47]];
      }
      public static ai.greycat.std.core.TimeZone America_Catamarca(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[48]];
      }
      public static ai.greycat.std.core.TimeZone America_Cordoba(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[49]];
      }
      public static ai.greycat.std.core.TimeZone America_Rosario(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[50]];
      }
      public static ai.greycat.std.core.TimeZone America_Jujuy(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[51]];
      }
      public static ai.greycat.std.core.TimeZone America_Mendoza(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[52]];
      }
      public static ai.greycat.std.core.TimeZone US_Central(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[53]];
      }
      public static ai.greycat.std.core.TimeZone America_Shiprock(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[54]];
      }
      public static ai.greycat.std.core.TimeZone Navajo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[55]];
      }
      public static ai.greycat.std.core.TimeZone US_Mountain(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[56]];
      }
      public static ai.greycat.std.core.TimeZone US_Michigan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[57]];
      }
      public static ai.greycat.std.core.TimeZone America_Yellowknife(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[58]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Mountain(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[59]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Atlantic(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[60]];
      }
      public static ai.greycat.std.core.TimeZone Cuba(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[61]];
      }
      public static ai.greycat.std.core.TimeZone America_Fort_Wayne(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[62]];
      }
      public static ai.greycat.std.core.TimeZone America_Indianapolis(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[63]];
      }
      public static ai.greycat.std.core.TimeZone US_East_Indiana(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[64]];
      }
      public static ai.greycat.std.core.TimeZone America_Knox_IN(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[65]];
      }
      public static ai.greycat.std.core.TimeZone US_Indiana_Starke(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[66]];
      }
      public static ai.greycat.std.core.TimeZone America_Pangnirtung(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[67]];
      }
      public static ai.greycat.std.core.TimeZone Jamaica(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[68]];
      }
      public static ai.greycat.std.core.TimeZone America_Louisville(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[69]];
      }
      public static ai.greycat.std.core.TimeZone US_Pacific(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[70]];
      }
      public static ai.greycat.std.core.TimeZone Brazil_West(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[71]];
      }
      public static ai.greycat.std.core.TimeZone Mexico_BajaSur(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[72]];
      }
      public static ai.greycat.std.core.TimeZone Mexico_General(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[73]];
      }
      public static ai.greycat.std.core.TimeZone US_Eastern(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[74]];
      }
      public static ai.greycat.std.core.TimeZone Brazil_DeNoronha(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[75]];
      }
      public static ai.greycat.std.core.TimeZone America_Godthab(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[76]];
      }
      public static ai.greycat.std.core.TimeZone America_Atikokan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[77]];
      }
      public static ai.greycat.std.core.TimeZone America_Cayman(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[78]];
      }
      public static ai.greycat.std.core.TimeZone America_Coral_Harbour(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[79]];
      }
      public static ai.greycat.std.core.TimeZone America_Creston(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[80]];
      }
      public static ai.greycat.std.core.TimeZone US_Arizona(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[81]];
      }
      public static ai.greycat.std.core.TimeZone America_Anguilla(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[82]];
      }
      public static ai.greycat.std.core.TimeZone America_Antigua(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[83]];
      }
      public static ai.greycat.std.core.TimeZone America_Aruba(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[84]];
      }
      public static ai.greycat.std.core.TimeZone America_Blanc_Sablon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[85]];
      }
      public static ai.greycat.std.core.TimeZone America_Curacao(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[86]];
      }
      public static ai.greycat.std.core.TimeZone America_Dominica(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[87]];
      }
      public static ai.greycat.std.core.TimeZone America_Grenada(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[88]];
      }
      public static ai.greycat.std.core.TimeZone America_Guadeloupe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[89]];
      }
      public static ai.greycat.std.core.TimeZone America_Kralendijk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[90]];
      }
      public static ai.greycat.std.core.TimeZone America_Lower_Princes(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[91]];
      }
      public static ai.greycat.std.core.TimeZone America_Marigot(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[92]];
      }
      public static ai.greycat.std.core.TimeZone America_Montserrat(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[93]];
      }
      public static ai.greycat.std.core.TimeZone America_Port_of_Spain(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[94]];
      }
      public static ai.greycat.std.core.TimeZone America_St_Barthelemy(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[95]];
      }
      public static ai.greycat.std.core.TimeZone America_St_Kitts(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[96]];
      }
      public static ai.greycat.std.core.TimeZone America_St_Lucia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[97]];
      }
      public static ai.greycat.std.core.TimeZone America_St_Thomas(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[98]];
      }
      public static ai.greycat.std.core.TimeZone America_St_Vincent(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[99]];
      }
      public static ai.greycat.std.core.TimeZone America_Tortola(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[100]];
      }
      public static ai.greycat.std.core.TimeZone America_Virgin(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[101]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Saskatchewan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[102]];
      }
      public static ai.greycat.std.core.TimeZone America_Porto_Acre(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[103]];
      }
      public static ai.greycat.std.core.TimeZone Brazil_Acre(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[104]];
      }
      public static ai.greycat.std.core.TimeZone Chile_Continental(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[105]];
      }
      public static ai.greycat.std.core.TimeZone Brazil_East(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[106]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Newfoundland(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[107]];
      }
      public static ai.greycat.std.core.TimeZone America_Ensenada(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[108]];
      }
      public static ai.greycat.std.core.TimeZone America_Santa_Isabel(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[109]];
      }
      public static ai.greycat.std.core.TimeZone Mexico_BajaNorte(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[110]];
      }
      public static ai.greycat.std.core.TimeZone America_Montreal(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[111]];
      }
      public static ai.greycat.std.core.TimeZone America_Nassau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[112]];
      }
      public static ai.greycat.std.core.TimeZone America_Nipigon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[113]];
      }
      public static ai.greycat.std.core.TimeZone America_Thunder_Bay(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[114]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Eastern(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[115]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Pacific(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[116]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Yukon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[117]];
      }
      public static ai.greycat.std.core.TimeZone America_Rainy_River(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[118]];
      }
      public static ai.greycat.std.core.TimeZone Canada_Central(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[119]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Ashkhabad(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[120]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Phnom_Penh(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[121]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Vientiane(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[122]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Christmas(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[123]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Dacca(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[124]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Muscat(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[125]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Mahe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[126]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Reunion(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[127]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Saigon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[128]];
      }
      public static ai.greycat.std.core.TimeZone Hongkong(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[129]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Tel_Aviv(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[130]];
      }
      public static ai.greycat.std.core.TimeZone Israel(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[131]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Katmandu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[132]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Calcutta(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[133]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Brunei(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[134]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Macao(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[135]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Ujung_Pandang(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[136]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Nicosia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[137]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Bahrain(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[138]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Syowa(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[139]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Aden(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[140]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kuwait(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[141]];
      }
      public static ai.greycat.std.core.TimeZone ROK(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[142]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Chongqing(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[143]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Chungking(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[144]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Harbin(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[145]];
      }
      public static ai.greycat.std.core.TimeZone PRC(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[146]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kuala_Lumpur(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[147]];
      }
      public static ai.greycat.std.core.TimeZone Singapore(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[148]];
      }
      public static ai.greycat.std.core.TimeZone ROC(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[149]];
      }
      public static ai.greycat.std.core.TimeZone Iran(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[150]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Thimbu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[151]];
      }
      public static ai.greycat.std.core.TimeZone Japan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[152]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Ulan_Bator(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[153]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kashgar(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[154]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Rangoon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[155]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Cocos(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[156]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Faeroe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[157]];
      }
      public static ai.greycat.std.core.TimeZone Australia_South(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[158]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Queensland(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[159]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Yancowinna(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[160]];
      }
      public static ai.greycat.std.core.TimeZone Australia_North(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[161]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Currie(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[162]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Tasmania(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[163]];
      }
      public static ai.greycat.std.core.TimeZone Australia_LHI(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[164]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Victoria(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[165]];
      }
      public static ai.greycat.std.core.TimeZone Australia_West(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[166]];
      }
      public static ai.greycat.std.core.TimeZone Australia_ACT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[167]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Canberra(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[168]];
      }
      public static ai.greycat.std.core.TimeZone Australia_NSW(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[169]];
      }
      public static ai.greycat.std.core.TimeZone GMT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[170]];
      }
      public static ai.greycat.std.core.TimeZone GMTx0(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[171]];
      }
      public static ai.greycat.std.core.TimeZone GMT_0(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[172]];
      }
      public static ai.greycat.std.core.TimeZone GMT0(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[173]];
      }
      public static ai.greycat.std.core.TimeZone Greenwich(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[174]];
      }
      public static ai.greycat.std.core.TimeZone UCT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[175]];
      }
      public static ai.greycat.std.core.TimeZone UTC(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[176]];
      }
      public static ai.greycat.std.core.TimeZone Universal(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[177]];
      }
      public static ai.greycat.std.core.TimeZone Zulu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[178]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Ljubljana(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[179]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Podgorica(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[180]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Sarajevo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[181]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Skopje(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[182]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Zagreb(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[183]];
      }
      public static ai.greycat.std.core.TimeZone Arctic_Longyearbyen(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[184]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Jan_Mayen(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[185]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Copenhagen(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[186]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Oslo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[187]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Stockholm(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[188]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Amsterdam(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[189]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Luxembourg(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[190]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Tiraspol(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[191]];
      }
      public static ai.greycat.std.core.TimeZone Eire(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[192]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Mariehamn(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[193]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Istanbul(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[194]];
      }
      public static ai.greycat.std.core.TimeZone Turkey(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[195]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Kiev(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[196]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Uzhgorod(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[197]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Zaporozhye(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[198]];
      }
      public static ai.greycat.std.core.TimeZone Portugal(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[199]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Belfast(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[200]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Guernsey(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[201]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Isle_of_Man(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[202]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Jersey(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[203]];
      }
      public static ai.greycat.std.core.TimeZone GB(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[204]];
      }
      public static ai.greycat.std.core.TimeZone GB_Eire(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[205]];
      }
      public static ai.greycat.std.core.TimeZone W_SU(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[206]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Monaco(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[207]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Bratislava(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[208]];
      }
      public static ai.greycat.std.core.TimeZone Europe_San_Marino(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[209]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Vatican(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[210]];
      }
      public static ai.greycat.std.core.TimeZone Poland(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[211]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Busingen(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[212]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Vaduz(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[213]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Kerguelen(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[214]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_McMurdo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[215]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_South_Pole(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[216]];
      }
      public static ai.greycat.std.core.TimeZone NZ(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[217]];
      }
      public static ai.greycat.std.core.TimeZone NZ_CHAT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[218]];
      }
      public static ai.greycat.std.core.TimeZone Chile_EasterIsland(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[219]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Pohnpei(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[220]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Ponape(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[221]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Saipan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[222]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Johnston(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[223]];
      }
      public static ai.greycat.std.core.TimeZone US_Hawaii(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[224]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Enderbury(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[225]];
      }
      public static ai.greycat.std.core.TimeZone Kwajalein(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[226]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Midway(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[227]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Samoa(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[228]];
      }
      public static ai.greycat.std.core.TimeZone US_Samoa(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[229]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_DumontDUrville(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[230]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Chuuk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[231]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Truk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[232]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Yap(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[233]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Funafuti(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[234]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Majuro(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[235]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Wake(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[236]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Wallis(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[237]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Abidjan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[238]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Algiers(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[239]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Bissau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[240]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Cairo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[241]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Casablanca(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[242]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Ceuta(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[243]];
      }
      public static ai.greycat.std.core.TimeZone Africa_El_Aaiun(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[244]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Johannesburg(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[245]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Juba(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[246]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Khartoum(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[247]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Lagos(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[248]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Maputo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[249]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Monrovia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[250]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Nairobi(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[251]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Ndjamena(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[252]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Sao_Tome(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[253]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Tripoli(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[254]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Tunis(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[255]];
      }
      public static ai.greycat.std.core.TimeZone Africa_Windhoek(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[256]];
      }
      public static ai.greycat.std.core.TimeZone America_Adak(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[257]];
      }
      public static ai.greycat.std.core.TimeZone America_Anchorage(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[258]];
      }
      public static ai.greycat.std.core.TimeZone America_Araguaina(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[259]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Buenos_Aires(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[260]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Catamarca(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[261]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Cordoba(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[262]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Jujuy(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[263]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_La_Rioja(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[264]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Mendoza(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[265]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Rio_Gallegos(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[266]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Salta(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[267]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_San_Juan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[268]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_San_Luis(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[269]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Tucuman(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[270]];
      }
      public static ai.greycat.std.core.TimeZone America_Argentina_Ushuaia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[271]];
      }
      public static ai.greycat.std.core.TimeZone America_Asuncion(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[272]];
      }
      public static ai.greycat.std.core.TimeZone America_Bahia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[273]];
      }
      public static ai.greycat.std.core.TimeZone America_Bahia_Banderas(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[274]];
      }
      public static ai.greycat.std.core.TimeZone America_Barbados(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[275]];
      }
      public static ai.greycat.std.core.TimeZone America_Belem(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[276]];
      }
      public static ai.greycat.std.core.TimeZone America_Belize(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[277]];
      }
      public static ai.greycat.std.core.TimeZone America_Boa_Vista(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[278]];
      }
      public static ai.greycat.std.core.TimeZone America_Bogota(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[279]];
      }
      public static ai.greycat.std.core.TimeZone America_Boise(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[280]];
      }
      public static ai.greycat.std.core.TimeZone America_Cambridge_Bay(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[281]];
      }
      public static ai.greycat.std.core.TimeZone America_Campo_Grande(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[282]];
      }
      public static ai.greycat.std.core.TimeZone America_Cancun(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[283]];
      }
      public static ai.greycat.std.core.TimeZone America_Caracas(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[284]];
      }
      public static ai.greycat.std.core.TimeZone America_Cayenne(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[285]];
      }
      public static ai.greycat.std.core.TimeZone America_Chicago(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[286]];
      }
      public static ai.greycat.std.core.TimeZone America_Chihuahua(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[287]];
      }
      public static ai.greycat.std.core.TimeZone America_Ciudad_Juarez(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[288]];
      }
      public static ai.greycat.std.core.TimeZone America_Costa_Rica(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[289]];
      }
      public static ai.greycat.std.core.TimeZone America_Cuiaba(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[290]];
      }
      public static ai.greycat.std.core.TimeZone America_Danmarkshavn(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[291]];
      }
      public static ai.greycat.std.core.TimeZone America_Dawson(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[292]];
      }
      public static ai.greycat.std.core.TimeZone America_Dawson_Creek(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[293]];
      }
      public static ai.greycat.std.core.TimeZone America_Denver(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[294]];
      }
      public static ai.greycat.std.core.TimeZone America_Detroit(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[295]];
      }
      public static ai.greycat.std.core.TimeZone America_Edmonton(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[296]];
      }
      public static ai.greycat.std.core.TimeZone America_Eirunepe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[297]];
      }
      public static ai.greycat.std.core.TimeZone America_El_Salvador(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[298]];
      }
      public static ai.greycat.std.core.TimeZone America_Fort_Nelson(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[299]];
      }
      public static ai.greycat.std.core.TimeZone America_Fortaleza(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[300]];
      }
      public static ai.greycat.std.core.TimeZone America_Glace_Bay(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[301]];
      }
      public static ai.greycat.std.core.TimeZone America_Goose_Bay(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[302]];
      }
      public static ai.greycat.std.core.TimeZone America_Grand_Turk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[303]];
      }
      public static ai.greycat.std.core.TimeZone America_Guatemala(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[304]];
      }
      public static ai.greycat.std.core.TimeZone America_Guayaquil(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[305]];
      }
      public static ai.greycat.std.core.TimeZone America_Guyana(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[306]];
      }
      public static ai.greycat.std.core.TimeZone America_Halifax(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[307]];
      }
      public static ai.greycat.std.core.TimeZone America_Havana(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[308]];
      }
      public static ai.greycat.std.core.TimeZone America_Hermosillo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[309]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Indianapolis(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[310]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Knox(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[311]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Marengo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[312]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Petersburg(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[313]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Tell_City(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[314]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Vevay(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[315]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Vincennes(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[316]];
      }
      public static ai.greycat.std.core.TimeZone America_Indiana_Winamac(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[317]];
      }
      public static ai.greycat.std.core.TimeZone America_Inuvik(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[318]];
      }
      public static ai.greycat.std.core.TimeZone America_Iqaluit(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[319]];
      }
      public static ai.greycat.std.core.TimeZone America_Jamaica(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[320]];
      }
      public static ai.greycat.std.core.TimeZone America_Juneau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[321]];
      }
      public static ai.greycat.std.core.TimeZone America_Kentucky_Louisville(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[322]];
      }
      public static ai.greycat.std.core.TimeZone America_Kentucky_Monticello(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[323]];
      }
      public static ai.greycat.std.core.TimeZone America_La_Paz(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[324]];
      }
      public static ai.greycat.std.core.TimeZone America_Lima(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[325]];
      }
      public static ai.greycat.std.core.TimeZone America_Los_Angeles(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[326]];
      }
      public static ai.greycat.std.core.TimeZone America_Maceio(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[327]];
      }
      public static ai.greycat.std.core.TimeZone America_Managua(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[328]];
      }
      public static ai.greycat.std.core.TimeZone America_Manaus(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[329]];
      }
      public static ai.greycat.std.core.TimeZone America_Martinique(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[330]];
      }
      public static ai.greycat.std.core.TimeZone America_Matamoros(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[331]];
      }
      public static ai.greycat.std.core.TimeZone America_Mazatlan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[332]];
      }
      public static ai.greycat.std.core.TimeZone America_Menominee(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[333]];
      }
      public static ai.greycat.std.core.TimeZone America_Merida(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[334]];
      }
      public static ai.greycat.std.core.TimeZone America_Metlakatla(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[335]];
      }
      public static ai.greycat.std.core.TimeZone America_Mexico_City(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[336]];
      }
      public static ai.greycat.std.core.TimeZone America_Miquelon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[337]];
      }
      public static ai.greycat.std.core.TimeZone America_Moncton(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[338]];
      }
      public static ai.greycat.std.core.TimeZone America_Monterrey(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[339]];
      }
      public static ai.greycat.std.core.TimeZone America_Montevideo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[340]];
      }
      public static ai.greycat.std.core.TimeZone America_New_York(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[341]];
      }
      public static ai.greycat.std.core.TimeZone America_Nome(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[342]];
      }
      public static ai.greycat.std.core.TimeZone America_Noronha(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[343]];
      }
      public static ai.greycat.std.core.TimeZone America_North_Dakota_Beulah(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[344]];
      }
      public static ai.greycat.std.core.TimeZone America_North_Dakota_Center(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[345]];
      }
      public static ai.greycat.std.core.TimeZone America_North_Dakota_New_Salem(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[346]];
      }
      public static ai.greycat.std.core.TimeZone America_Nuuk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[347]];
      }
      public static ai.greycat.std.core.TimeZone America_Ojinaga(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[348]];
      }
      public static ai.greycat.std.core.TimeZone America_Panama(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[349]];
      }
      public static ai.greycat.std.core.TimeZone America_Paramaribo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[350]];
      }
      public static ai.greycat.std.core.TimeZone America_Phoenix(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[351]];
      }
      public static ai.greycat.std.core.TimeZone America_Port_au_Prince(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[352]];
      }
      public static ai.greycat.std.core.TimeZone America_Porto_Velho(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[353]];
      }
      public static ai.greycat.std.core.TimeZone America_Puerto_Rico(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[354]];
      }
      public static ai.greycat.std.core.TimeZone America_Punta_Arenas(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[355]];
      }
      public static ai.greycat.std.core.TimeZone America_Rankin_Inlet(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[356]];
      }
      public static ai.greycat.std.core.TimeZone America_Recife(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[357]];
      }
      public static ai.greycat.std.core.TimeZone America_Regina(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[358]];
      }
      public static ai.greycat.std.core.TimeZone America_Resolute(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[359]];
      }
      public static ai.greycat.std.core.TimeZone America_Rio_Branco(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[360]];
      }
      public static ai.greycat.std.core.TimeZone America_Santarem(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[361]];
      }
      public static ai.greycat.std.core.TimeZone America_Santiago(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[362]];
      }
      public static ai.greycat.std.core.TimeZone America_Santo_Domingo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[363]];
      }
      public static ai.greycat.std.core.TimeZone America_Sao_Paulo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[364]];
      }
      public static ai.greycat.std.core.TimeZone America_Scoresbysund(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[365]];
      }
      public static ai.greycat.std.core.TimeZone America_Sitka(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[366]];
      }
      public static ai.greycat.std.core.TimeZone America_St_Johns(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[367]];
      }
      public static ai.greycat.std.core.TimeZone America_Swift_Current(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[368]];
      }
      public static ai.greycat.std.core.TimeZone America_Tegucigalpa(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[369]];
      }
      public static ai.greycat.std.core.TimeZone America_Thule(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[370]];
      }
      public static ai.greycat.std.core.TimeZone America_Tijuana(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[371]];
      }
      public static ai.greycat.std.core.TimeZone America_Toronto(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[372]];
      }
      public static ai.greycat.std.core.TimeZone America_Vancouver(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[373]];
      }
      public static ai.greycat.std.core.TimeZone America_Whitehorse(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[374]];
      }
      public static ai.greycat.std.core.TimeZone America_Winnipeg(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[375]];
      }
      public static ai.greycat.std.core.TimeZone America_Yakutat(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[376]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Casey(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[377]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Davis(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[378]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Macquarie(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[379]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Mawson(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[380]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Palmer(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[381]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Rothera(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[382]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Troll(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[383]];
      }
      public static ai.greycat.std.core.TimeZone Antarctica_Vostok(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[384]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Almaty(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[385]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Amman(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[386]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Anadyr(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[387]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Aqtau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[388]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Aqtobe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[389]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Ashgabat(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[390]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Atyrau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[391]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Baghdad(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[392]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Baku(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[393]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Bangkok(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[394]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Barnaul(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[395]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Beirut(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[396]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Bishkek(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[397]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Chita(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[398]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Choibalsan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[399]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Colombo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[400]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Damascus(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[401]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Dhaka(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[402]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Dili(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[403]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Dubai(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[404]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Dushanbe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[405]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Famagusta(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[406]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Gaza(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[407]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Hebron(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[408]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Ho_Chi_Minh(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[409]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Hong_Kong(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[410]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Hovd(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[411]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Irkutsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[412]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Jakarta(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[413]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Jayapura(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[414]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Jerusalem(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[415]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kabul(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[416]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kamchatka(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[417]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Karachi(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[418]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kathmandu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[419]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Khandyga(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[420]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kolkata(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[421]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Krasnoyarsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[422]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Kuching(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[423]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Macau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[424]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Magadan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[425]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Makassar(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[426]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Manila(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[427]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Nicosia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[428]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Novokuznetsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[429]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Novosibirsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[430]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Omsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[431]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Oral(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[432]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Pontianak(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[433]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Pyongyang(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[434]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Qatar(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[435]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Qostanay(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[436]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Qyzylorda(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[437]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Riyadh(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[438]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Sakhalin(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[439]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Samarkand(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[440]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Seoul(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[441]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Shanghai(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[442]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Singapore(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[443]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Srednekolymsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[444]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Taipei(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[445]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Tashkent(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[446]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Tbilisi(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[447]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Tehran(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[448]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Thimphu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[449]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Tokyo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[450]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Tomsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[451]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Ulaanbaatar(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[452]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Urumqi(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[453]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Ust_Nera(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[454]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Vladivostok(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[455]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Yakutsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[456]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Yangon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[457]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Yekaterinburg(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[458]];
      }
      public static ai.greycat.std.core.TimeZone Asia_Yerevan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[459]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Azores(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[460]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Bermuda(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[461]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Canary(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[462]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Cape_Verde(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[463]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Faroe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[464]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Madeira(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[465]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_South_Georgia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[466]];
      }
      public static ai.greycat.std.core.TimeZone Atlantic_Stanley(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[467]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Adelaide(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[468]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Brisbane(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[469]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Broken_Hill(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[470]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Darwin(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[471]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Eucla(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[472]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Hobart(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[473]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Lindeman(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[474]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Lord_Howe(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[475]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Melbourne(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[476]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Perth(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[477]];
      }
      public static ai.greycat.std.core.TimeZone Australia_Sydney(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[478]];
      }
      public static ai.greycat.std.core.TimeZone CET(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[479]];
      }
      public static ai.greycat.std.core.TimeZone CST6CDT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[480]];
      }
      public static ai.greycat.std.core.TimeZone EET(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[481]];
      }
      public static ai.greycat.std.core.TimeZone EST(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[482]];
      }
      public static ai.greycat.std.core.TimeZone EST5EDT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[483]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Andorra(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[484]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Astrakhan(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[485]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Athens(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[486]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Belgrade(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[487]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Berlin(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[488]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Brussels(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[489]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Bucharest(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[490]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Budapest(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[491]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Chisinau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[492]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Dublin(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[493]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Gibraltar(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[494]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Helsinki(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[495]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Istanbul(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[496]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Kaliningrad(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[497]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Kirov(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[498]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Kyiv(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[499]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Lisbon(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[500]];
      }
      public static ai.greycat.std.core.TimeZone Europe_London(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[501]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Madrid(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[502]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Malta(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[503]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Minsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[504]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Moscow(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[505]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Paris(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[506]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Prague(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[507]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Riga(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[508]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Rome(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[509]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Samara(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[510]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Saratov(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[511]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Simferopol(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[512]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Sofia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[513]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Tallinn(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[514]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Tirane(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[515]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Ulyanovsk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[516]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Vienna(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[517]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Vilnius(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[518]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Volgograd(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[519]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Warsaw(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[520]];
      }
      public static ai.greycat.std.core.TimeZone Europe_Zurich(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[521]];
      }
      public static ai.greycat.std.core.TimeZone Factory(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[522]];
      }
      public static ai.greycat.std.core.TimeZone HST(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[523]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Chagos(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[524]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Maldives(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[525]];
      }
      public static ai.greycat.std.core.TimeZone Indian_Mauritius(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[526]];
      }
      public static ai.greycat.std.core.TimeZone MET(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[527]];
      }
      public static ai.greycat.std.core.TimeZone MST(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[528]];
      }
      public static ai.greycat.std.core.TimeZone MST7MDT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[529]];
      }
      public static ai.greycat.std.core.TimeZone PST8PDT(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[530]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Apia(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[531]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Auckland(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[532]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Bougainville(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[533]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Chatham(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[534]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Easter(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[535]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Efate(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[536]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Fakaofo(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[537]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Fiji(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[538]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Galapagos(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[539]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Gambier(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[540]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Guadalcanal(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[541]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Guam(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[542]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Honolulu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[543]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Kanton(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[544]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Kiritimati(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[545]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Kosrae(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[546]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Kwajalein(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[547]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Marquesas(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[548]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Nauru(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[549]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Niue(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[550]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Norfolk(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[551]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Noumea(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[552]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Pago_Pago(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[553]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Palau(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[554]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Pitcairn(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[555]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Port_Moresby(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[556]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Rarotonga(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[557]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Tahiti(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[558]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Tarawa(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[559]];
      }
      public static ai.greycat.std.core.TimeZone Pacific_Tongatapu(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[560]];
      }
      public static ai.greycat.std.core.TimeZone WET(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[49];
        return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[561]];
      }
      public static TimeZone create(ai.greycat.GreyCat greycat) {
        return new TimeZone(greycat.libs_by_name.get(ai.greycat.std.name).mapped[49]);
      }
    }
  }
  public static final class runtime {
    public static final class StoreStat extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::StoreStat";
      private StoreStat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long capacity_bytes() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_capacity_bytes(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long allocated_bytes() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_allocated_bytes(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Double allocated_ratio() {
        return (java.lang.Double) super.get(super.type.generated_offsets[2]);
      }
      public void set_allocated_ratio(java.lang.Double v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Long remained_bytes() {
        return (java.lang.Long) super.get(super.type.generated_offsets[3]);
      }
      public void set_remained_bytes(java.lang.Long v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Double remained_ratio() {
        return (java.lang.Double) super.get(super.type.generated_offsets[4]);
      }
      public void set_remained_ratio(java.lang.Double v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Long used_bytes() {
        return (java.lang.Long) super.get(super.type.generated_offsets[5]);
      }
      public void set_used_bytes(java.lang.Long v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Double used_ratio() {
        return (java.lang.Double) super.get(super.type.generated_offsets[6]);
      }
      public void set_used_ratio(java.lang.Double v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public java.lang.Long available_bytes() {
        return (java.lang.Long) super.get(super.type.generated_offsets[7]);
      }
      public void set_available_bytes(java.lang.Long v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public java.lang.Double available_ratio() {
        return (java.lang.Double) super.get(super.type.generated_offsets[8]);
      }
      public void set_available_ratio(java.lang.Double v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public static StoreStat create(ai.greycat.GreyCat greycat) {
        return new StoreStat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[50]);
      }
    }
    public static final class RuntimeInfo extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::RuntimeInfo";
      private RuntimeInfo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String version() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_version(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String program_version() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_program_version(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.String arch() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[2]);
      }
      public void set_arch(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.TimeZone timezone() {
        return (ai.greycat.std.core.TimeZone) super.get(super.type.generated_offsets[3]);
      }
      public void set_timezone(ai.greycat.std.core.TimeZone v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.runtime.License license() {
        return (ai.greycat.std.runtime.License) super.get(super.type.generated_offsets[4]);
      }
      public void set_license(ai.greycat.std.runtime.License v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Long io_threads() {
        return (java.lang.Long) super.get(super.type.generated_offsets[5]);
      }
      public void set_io_threads(java.lang.Long v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Long bg_threads() {
        return (java.lang.Long) super.get(super.type.generated_offsets[6]);
      }
      public void set_bg_threads(java.lang.Long v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public java.lang.Long fg_threads() {
        return (java.lang.Long) super.get(super.type.generated_offsets[7]);
      }
      public void set_fg_threads(java.lang.Long v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public java.lang.Long mem_total() {
        return (java.lang.Long) super.get(super.type.generated_offsets[8]);
      }
      public void set_mem_total(java.lang.Long v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public java.lang.Long mem_worker() {
        return (java.lang.Long) super.get(super.type.generated_offsets[9]);
      }
      public void set_mem_worker(java.lang.Long v) {
        super.set(super.type.generated_offsets[9], v);
      }
      public java.lang.Long nb_ctx() {
        return (java.lang.Long) super.get(super.type.generated_offsets[10]);
      }
      public void set_nb_ctx(java.lang.Long v) {
        super.set(super.type.generated_offsets[10], v);
      }
      public ai.greycat.std.runtime.StoreStat store_stats() {
        return (ai.greycat.std.runtime.StoreStat) super.get(super.type.generated_offsets[11]);
      }
      public void set_store_stats(ai.greycat.std.runtime.StoreStat v) {
        super.set(super.type.generated_offsets[11], v);
      }
      public static RuntimeInfo create(ai.greycat.GreyCat greycat) {
        return new RuntimeInfo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[51]);
      }
    }
    public static final class Runtime extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::Runtime";
      private Runtime(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.runtime.RuntimeInfo info(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.runtime.RuntimeInfo) greycat.call("runtime::Runtime::info");
      }
      public static void abi(ai.greycat.GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::Runtime::abi");
      }
      public static void readModVar(ai.greycat.GreyCat greycat, ai.greycat.std.core.String mod_var) throws java.io.IOException {
        greycat.call("runtime::Runtime::readModVar", mod_var);
      }
      public static void root(ai.greycat.GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::Runtime::root");
      }
      public static Runtime create(ai.greycat.GreyCat greycat) {
        return new Runtime(greycat.libs_by_name.get(ai.greycat.std.name).mapped[52]);
      }
    }
    public static final class System extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::System";
      private System(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static System create(ai.greycat.GreyCat greycat) {
        return new System(greycat.libs_by_name.get(ai.greycat.std.name).mapped[53]);
      }
    }
    public static final class TaskStatus extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "runtime::TaskStatus";
      private TaskStatus(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.runtime.TaskStatus empty(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.runtime.TaskStatus waiting(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.runtime.TaskStatus running(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.runtime.TaskStatus await(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[3]];
      }
      public static ai.greycat.std.runtime.TaskStatus cancelled(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[4]];
      }
      public static ai.greycat.std.runtime.TaskStatus error(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[5]];
      }
      public static ai.greycat.std.runtime.TaskStatus ended(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[6]];
      }
      public static ai.greycat.std.runtime.TaskStatus ended_with_errors(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
        return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[7]];
      }
      public static TaskStatus create(ai.greycat.GreyCat greycat) {
        return new TaskStatus(greycat.libs_by_name.get(ai.greycat.std.name).mapped[54]);
      }
    }
    public static final class TaskBase extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::TaskBase";
      private TaskBase(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long user_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_user_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long task_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_task_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.String mod() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[2]);
      }
      public void set_mod(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String type() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_type(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.String fun() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[4]);
      }
      public void set_fun(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.time creation() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[5]);
      }
      public void set_creation(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public ai.greycat.std.core.time start() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[6]);
      }
      public void set_start(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public ai.greycat.std.core.duration duration() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[7]);
      }
      public void set_duration(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public ai.greycat.std.runtime.TaskStatus status() {
        return (ai.greycat.std.runtime.TaskStatus) super.get(super.type.generated_offsets[8]);
      }
      public void set_status(ai.greycat.std.runtime.TaskStatus v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public static TaskBase create(ai.greycat.GreyCat greycat) {
        return new TaskBase(greycat.libs_by_name.get(ai.greycat.std.name).mapped[55]);
      }
    }
    public static final class TaskMode extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "runtime::TaskMode";
      private TaskMode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.runtime.TaskMode commit(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[56];
        return (ai.greycat.std.runtime.TaskMode) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.runtime.TaskMode volatile_(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[56];
        return (ai.greycat.std.runtime.TaskMode) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.runtime.TaskMode exclusive(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[56];
        return (ai.greycat.std.runtime.TaskMode) t.enum_values[t.generated_offsets[2]];
      }
      public static TaskMode create(ai.greycat.GreyCat greycat) {
        return new TaskMode(greycat.libs_by_name.get(ai.greycat.std.name).mapped[56]);
      }
    }
    public static final class TaskRequest extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::TaskRequest";
      private TaskRequest(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.function function() {
        return (ai.greycat.std.core.function) super.get(super.type.generated_offsets[0]);
      }
      public void set_function(ai.greycat.std.core.function v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.Array arguments() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[1]);
      }
      public void set_arguments(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.runtime.TaskMode mode() {
        return (ai.greycat.std.runtime.TaskMode) super.get(super.type.generated_offsets[2]);
      }
      public void set_mode(ai.greycat.std.runtime.TaskMode v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static TaskRequest create(ai.greycat.GreyCat greycat) {
        return new TaskRequest(greycat.libs_by_name.get(ai.greycat.std.name).mapped[57]);
      }
    }
    public static final class TaskResult extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::TaskResult";
      private TaskResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array values() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[0]);
      }
      public void set_values(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long errors() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_errors(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static TaskResult create(ai.greycat.GreyCat greycat) {
        return new TaskResult(greycat.libs_by_name.get(ai.greycat.std.name).mapped[58]);
      }
    }
    public static final class Task extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::Task";
      private Task(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long user_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_user_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long task_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_task_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.String mod() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[2]);
      }
      public void set_mod(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String type() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_type(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.String fun() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[4]);
      }
      public void set_fun(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.time creation() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[5]);
      }
      public void set_creation(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public ai.greycat.std.core.time start() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[6]);
      }
      public void set_start(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public ai.greycat.std.core.duration duration() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[7]);
      }
      public void set_duration(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public ai.greycat.std.runtime.TaskStatus status() {
        return (ai.greycat.std.runtime.TaskStatus) super.get(super.type.generated_offsets[8]);
      }
      public void set_status(ai.greycat.std.runtime.TaskStatus v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.runtime.TaskInfo> running(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.TaskInfo>) greycat.call("runtime::Task::running");
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.runtime.Task> history(ai.greycat.GreyCat greycat, java.lang.Long offset, java.lang.Long max) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.Task>) greycat.call("runtime::Task::history", offset, max);
      }
      public static java.lang.Boolean cancel(ai.greycat.GreyCat greycat, java.lang.Long task_id) throws java.io.IOException {
        return (java.lang.Boolean) greycat.call("runtime::Task::cancel", task_id);
      }
      public static ai.greycat.std.runtime.TaskInfo info(ai.greycat.GreyCat greycat, java.lang.Long user_id, java.lang.Long task_id) throws java.io.IOException {
        return (ai.greycat.std.runtime.TaskInfo) greycat.call("runtime::Task::info", user_id, task_id);
      }
      public static Task create(ai.greycat.GreyCat greycat) {
        return new Task(greycat.libs_by_name.get(ai.greycat.std.name).mapped[59]);
      }
    }
    public static final class TaskInfo extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::TaskInfo";
      private TaskInfo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long user_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_user_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long task_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_task_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.String mod() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[2]);
      }
      public void set_mod(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String type() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_type(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.String fun() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[4]);
      }
      public void set_fun(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.time creation() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[5]);
      }
      public void set_creation(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public ai.greycat.std.core.time start() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[6]);
      }
      public void set_start(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public ai.greycat.std.core.duration duration() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[7]);
      }
      public void set_duration(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public ai.greycat.std.runtime.TaskStatus status() {
        return (ai.greycat.std.runtime.TaskStatus) super.get(super.type.generated_offsets[8]);
      }
      public void set_status(ai.greycat.std.runtime.TaskStatus v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public java.lang.Double progress() {
        return (java.lang.Double) super.get(super.type.generated_offsets[9]);
      }
      public void set_progress(java.lang.Double v) {
        super.set(super.type.generated_offsets[9], v);
      }
      public ai.greycat.std.core.duration remaining() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[10]);
      }
      public void set_remaining(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[10], v);
      }
      public java.lang.Long sub_waiting() {
        return (java.lang.Long) super.get(super.type.generated_offsets[11]);
      }
      public void set_sub_waiting(java.lang.Long v) {
        super.set(super.type.generated_offsets[11], v);
      }
      public java.lang.Long sub_tasks_all() {
        return (java.lang.Long) super.get(super.type.generated_offsets[12]);
      }
      public void set_sub_tasks_all(java.lang.Long v) {
        super.set(super.type.generated_offsets[12], v);
      }
      public static TaskInfo create(ai.greycat.GreyCat greycat) {
        return new TaskInfo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[60]);
      }
    }
    public static final class PeriodicTask extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::PeriodicTask";
      private PeriodicTask(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.function function() {
        return (ai.greycat.std.core.function) super.get(super.type.generated_offsets[0]);
      }
      public void set_function(ai.greycat.std.core.function v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long user_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_user_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.Array arguments() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[2]);
      }
      public void set_arguments(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.time start() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[3]);
      }
      public void set_start(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.duration every() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[4]);
      }
      public void set_every(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.runtime.PeriodicTask> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.PeriodicTask>) greycat.call("runtime::PeriodicTask::all");
      }
      public static void set(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.runtime.PeriodicTask> tasks) throws java.io.IOException {
        greycat.call("runtime::PeriodicTask::set", tasks);
      }
      public static PeriodicTask create(ai.greycat.GreyCat greycat) {
        return new PeriodicTask(greycat.libs_by_name.get(ai.greycat.std.name).mapped[61]);
      }
    }
    public static final class SecurityFields extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::SecurityFields";
      private SecurityFields(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String email() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_email(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.String first_name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[2]);
      }
      public void set_first_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String last_name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_last_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> roles() {
        return (ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String>) super.get(super.type.generated_offsets[4]);
      }
      public void set_roles(ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> groups() {
        return (ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String>) super.get(super.type.generated_offsets[5]);
      }
      public void set_groups(ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public static void set(ai.greycat.GreyCat greycat, ai.greycat.std.runtime.SecurityFields f) throws java.io.IOException {
        greycat.call("runtime::SecurityFields::set", f);
      }
      public static ai.greycat.std.runtime.SecurityFields get(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.runtime.SecurityFields) greycat.call("runtime::SecurityFields::get");
      }
      public static SecurityFields create(ai.greycat.GreyCat greycat) {
        return new SecurityFields(greycat.libs_by_name.get(ai.greycat.std.name).mapped[62]);
      }
    }
    public static final class SecurityPolicy extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::SecurityPolicy";
      private SecurityPolicy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> entities() {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity>) super.get(super.type.generated_offsets[0]);
      }
      public void set_entities(ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.runtime.UserCredential> credentials() {
        return (ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.runtime.UserCredential>) super.get(super.type.generated_offsets[1]);
      }
      public void set_credentials(ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.runtime.UserCredential> v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.runtime.UserRole> roles() {
        return (ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.runtime.UserRole>) super.get(super.type.generated_offsets[2]);
      }
      public void set_roles(ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.runtime.UserRole> v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.runtime.SecurityFields fields() {
        return (ai.greycat.std.runtime.SecurityFields) super.get(super.type.generated_offsets[3]);
      }
      public void set_fields(ai.greycat.std.runtime.SecurityFields v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> keys() {
        return (ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String>) super.get(super.type.generated_offsets[4]);
      }
      public void set_keys(ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.time keys_last_refresh() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[5]);
      }
      public void set_keys_last_refresh(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.core.String> permissions(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) greycat.call("runtime::SecurityPolicy::permissions");
      }
      public static SecurityPolicy create(ai.greycat.GreyCat greycat) {
        return new SecurityPolicy(greycat.libs_by_name.get(ai.greycat.std.name).mapped[63]);
      }
    }
    public static final class SecurityEntity extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::SecurityEntity";
      private SecurityEntity(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Boolean activated() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[2]);
      }
      public void set_activated(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity>) greycat.call("runtime::SecurityEntity::all");
      }
      public static java.lang.Long set(ai.greycat.GreyCat greycat, ai.greycat.std.runtime.SecurityEntity entity) throws java.io.IOException {
        return (java.lang.Long) greycat.call("runtime::SecurityEntity::set", entity);
      }
      public static SecurityEntity create(ai.greycat.GreyCat greycat) {
        return new SecurityEntity(greycat.libs_by_name.get(ai.greycat.std.name).mapped[64]);
      }
    }
    public static final class UserGroup extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::UserGroup";
      private UserGroup(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Boolean activated() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[2]);
      }
      public void set_activated(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static UserGroup create(ai.greycat.GreyCat greycat) {
        return new UserGroup(greycat.libs_by_name.get(ai.greycat.std.name).mapped[65]);
      }
    }
    public static final class UserGroupPolicyType extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "runtime::UserGroupPolicyType";
      private UserGroupPolicyType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.runtime.UserGroupPolicyType read(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[66];
        return (ai.greycat.std.runtime.UserGroupPolicyType) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.runtime.UserGroupPolicyType write(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[66];
        return (ai.greycat.std.runtime.UserGroupPolicyType) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.runtime.UserGroupPolicyType execute(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[66];
        return (ai.greycat.std.runtime.UserGroupPolicyType) t.enum_values[t.generated_offsets[2]];
      }
      public static UserGroupPolicyType create(ai.greycat.GreyCat greycat) {
        return new UserGroupPolicyType(greycat.libs_by_name.get(ai.greycat.std.name).mapped[66]);
      }
    }
    public static final class UserGroupPolicy extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::UserGroupPolicy";
      private UserGroupPolicy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long group_id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_group_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.runtime.UserGroupPolicyType type() {
        return (ai.greycat.std.runtime.UserGroupPolicyType) super.get(super.type.generated_offsets[1]);
      }
      public void set_type(ai.greycat.std.runtime.UserGroupPolicyType v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static UserGroupPolicy create(ai.greycat.GreyCat greycat) {
        return new UserGroupPolicy(greycat.libs_by_name.get(ai.greycat.std.name).mapped[67]);
      }
    }
    public static final class OpenIDConnect extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::OpenIDConnect";
      private OpenIDConnect(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String url() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_url(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String clientId() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_clientId(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static ai.greycat.std.runtime.OpenIDConnect config(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.runtime.OpenIDConnect) greycat.call("runtime::OpenIDConnect::config");
      }
      public static OpenIDConnect create(ai.greycat.GreyCat greycat) {
        return new OpenIDConnect(greycat.libs_by_name.get(ai.greycat.std.name).mapped[68]);
      }
    }
    public static final class User extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::User";
      private User(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long id() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Boolean activated() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[2]);
      }
      public void set_activated(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String full_name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_full_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.String email() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[4]);
      }
      public void set_email(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.String role() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[5]);
      }
      public void set_role(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Long permissions_flags() {
        return (java.lang.Long) super.get(super.type.generated_offsets[6]);
      }
      public void set_permissions_flags(java.lang.Long v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.runtime.UserGroupPolicy> groups() {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.UserGroupPolicy>) super.get(super.type.generated_offsets[7]);
      }
      public void set_groups(ai.greycat.std.core.Array<ai.greycat.std.runtime.UserGroupPolicy> v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public java.lang.Long groups_flags() {
        return (java.lang.Long) super.get(super.type.generated_offsets[8]);
      }
      public void set_groups_flags(java.lang.Long v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public java.lang.Boolean external() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[9]);
      }
      public void set_external(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[9], v);
      }
      public static ai.greycat.std.core.String login(ai.greycat.GreyCat greycat, ai.greycat.std.core.String credentials, java.lang.Boolean use_cookie) throws java.io.IOException {
        return (ai.greycat.std.core.String) greycat.call("runtime::User::login", credentials, use_cookie);
      }
      public static ai.greycat.std.core.String tokenLogin(ai.greycat.GreyCat greycat, ai.greycat.std.core.String token, java.lang.Boolean use_cookie) throws java.io.IOException {
        return (ai.greycat.std.core.String) greycat.call("runtime::User::tokenLogin", token, use_cookie);
      }
      public static void logout(ai.greycat.GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::User::logout");
      }
      public static ai.greycat.std.core.String renew(ai.greycat.GreyCat greycat, java.lang.Boolean use_cookie) throws java.io.IOException {
        return (ai.greycat.std.core.String) greycat.call("runtime::User::renew", use_cookie);
      }
      public static java.lang.Long current(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (java.lang.Long) greycat.call("runtime::User::current");
      }
      public static ai.greycat.std.runtime.User me(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.runtime.User) greycat.call("runtime::User::me");
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.core.String> permissions(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) greycat.call("runtime::User::permissions");
      }
      public static java.lang.Boolean setPassword(ai.greycat.GreyCat greycat, ai.greycat.std.core.String name, ai.greycat.std.core.String pass) throws java.io.IOException {
        return (java.lang.Boolean) greycat.call("runtime::User::setPassword", name, pass);
      }
      public static ai.greycat.std.core.String getToken(ai.greycat.GreyCat greycat, java.lang.Long id) throws java.io.IOException {
        return (ai.greycat.std.core.String) greycat.call("runtime::User::getToken", id);
      }
      public static User create(ai.greycat.GreyCat greycat) {
        return new User(greycat.libs_by_name.get(ai.greycat.std.name).mapped[69]);
      }
    }
    public static final class UserRole extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::UserRole";
      private UserRole(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.String> permissions() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) super.get(super.type.generated_offsets[1]);
      }
      public void set_permissions(ai.greycat.std.core.Array<ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static ai.greycat.std.core.Array<ai.greycat.std.runtime.UserRole> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.UserRole>) greycat.call("runtime::UserRole::all");
      }
      public static void remove(ai.greycat.GreyCat greycat, ai.greycat.std.core.String name) throws java.io.IOException {
        greycat.call("runtime::UserRole::remove", name);
      }
      public static void set(ai.greycat.GreyCat greycat, ai.greycat.std.runtime.UserRole value) throws java.io.IOException {
        greycat.call("runtime::UserRole::set", value);
      }
      public static UserRole create(ai.greycat.GreyCat greycat) {
        return new UserRole(greycat.libs_by_name.get(ai.greycat.std.name).mapped[70]);
      }
    }
    public static final class UserCredential extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::UserCredential";
      private UserCredential(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String pass() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_pass(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static UserCredential create(ai.greycat.GreyCat greycat) {
        return new UserCredential(greycat.libs_by_name.get(ai.greycat.std.name).mapped[71]);
      }
    }
    public static final class LicenseType extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "runtime::LicenseType";
      private LicenseType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.runtime.LicenseType community(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[72];
        return (ai.greycat.std.runtime.LicenseType) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.runtime.LicenseType enterprise(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[72];
        return (ai.greycat.std.runtime.LicenseType) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.runtime.LicenseType testing(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[72];
        return (ai.greycat.std.runtime.LicenseType) t.enum_values[t.generated_offsets[2]];
      }
      public static LicenseType create(ai.greycat.GreyCat greycat) {
        return new LicenseType(greycat.libs_by_name.get(ai.greycat.std.name).mapped[72]);
      }
    }
    public static final class License extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::License";
      private License(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.time start() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[1]);
      }
      public void set_start(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.time end() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[2]);
      }
      public void set_end(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String company() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_company(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Long max_memory() {
        return (java.lang.Long) super.get(super.type.generated_offsets[4]);
      }
      public void set_max_memory(java.lang.Long v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Long extra_1() {
        return (java.lang.Long) super.get(super.type.generated_offsets[5]);
      }
      public void set_extra_1(java.lang.Long v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Long extra_2() {
        return (java.lang.Long) super.get(super.type.generated_offsets[6]);
      }
      public void set_extra_2(java.lang.Long v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public ai.greycat.std.runtime.LicenseType type() {
        return (ai.greycat.std.runtime.LicenseType) super.get(super.type.generated_offsets[7]);
      }
      public void set_type(ai.greycat.std.runtime.LicenseType v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public static License create(ai.greycat.GreyCat greycat) {
        return new License(greycat.libs_by_name.get(ai.greycat.std.name).mapped[73]);
      }
    }
    public static final class DebugVariable extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::DebugVariable";
      private DebugVariable(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Object value() {
        return (java.lang.Object) super.get(super.type.generated_offsets[1]);
      }
      public void set_value(java.lang.Object v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static DebugVariable create(ai.greycat.GreyCat greycat) {
        return new DebugVariable(greycat.libs_by_name.get(ai.greycat.std.name).mapped[74]);
      }
    }
    public static final class DebugFrame extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::DebugFrame";
      private DebugFrame(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String module() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_module(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.function function() {
        return (ai.greycat.std.core.function) super.get(super.type.generated_offsets[1]);
      }
      public void set_function(ai.greycat.std.core.function v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long line() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_line(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Long column() {
        return (java.lang.Long) super.get(super.type.generated_offsets[3]);
      }
      public void set_column(java.lang.Long v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugVariable> scope() {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugVariable>) super.get(super.type.generated_offsets[4]);
      }
      public void set_scope(ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugVariable> v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public static DebugFrame create(ai.greycat.GreyCat greycat) {
        return new DebugFrame(greycat.libs_by_name.get(ai.greycat.std.name).mapped[75]);
      }
    }
    public static final class DebugInfo extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::DebugInfo";
      private DebugInfo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugFrame> scopes() {
        return (ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugFrame>) super.get(super.type.generated_offsets[0]);
      }
      public void set_scopes(ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugFrame> v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Object root() {
        return (java.lang.Object) super.get(super.type.generated_offsets[1]);
      }
      public void set_root(java.lang.Object v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static DebugInfo create(ai.greycat.GreyCat greycat) {
        return new DebugInfo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[76]);
      }
    }
    public static final class DebugBreakpoint extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::DebugBreakpoint";
      private DebugBreakpoint(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String module() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_module(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long line() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_line(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long column() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_column(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static DebugBreakpoint create(ai.greycat.GreyCat greycat) {
        return new DebugBreakpoint(greycat.libs_by_name.get(ai.greycat.std.name).mapped[77]);
      }
    }
    public static final class Debug extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "runtime::Debug";
      private Debug(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static void add(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugBreakpoint> bps) throws java.io.IOException {
        greycat.call("runtime::Debug::add", bps);
      }
      public static void remove(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.runtime.DebugBreakpoint> bps) throws java.io.IOException {
        greycat.call("runtime::Debug::remove", bps);
      }
      public static ai.greycat.std.core.Array<java.lang.Long> workers(ai.greycat.GreyCat greycat) throws java.io.IOException {
        return (ai.greycat.std.core.Array<java.lang.Long>) greycat.call("runtime::Debug::workers");
      }
      public static void pause(ai.greycat.GreyCat greycat, java.lang.Long worker) throws java.io.IOException {
        greycat.call("runtime::Debug::pause", worker);
      }
      public static void resume(ai.greycat.GreyCat greycat, java.lang.Long worker) throws java.io.IOException {
        greycat.call("runtime::Debug::resume", worker);
      }
      public static ai.greycat.std.runtime.DebugInfo info(ai.greycat.GreyCat greycat, java.lang.Long worker) throws java.io.IOException {
        return (ai.greycat.std.runtime.DebugInfo) greycat.call("runtime::Debug::info", worker);
      }
      public static Debug create(ai.greycat.GreyCat greycat) {
        return new Debug(greycat.libs_by_name.get(ai.greycat.std.name).mapped[78]);
      }
    }
  }
  public static final class io {
    public static final class Writer<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::Writer";
      private Writer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> Writer<T> create(ai.greycat.GreyCat greycat) {
        return new Writer<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[79]);
      }
    }
    public static final class Reader<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::Reader";
      private Reader(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> Reader<T> create(ai.greycat.GreyCat greycat) {
        return new Reader<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[80]);
      }
    }
    public static final class GcbWriter<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::GcbWriter";
      private GcbWriter(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> GcbWriter<T> create(ai.greycat.GreyCat greycat) {
        return new GcbWriter<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[81]);
      }
    }
    public static final class GcbReader<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::GcbReader";
      private GcbReader(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> GcbReader<T> create(ai.greycat.GreyCat greycat) {
        return new GcbReader<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[82]);
      }
    }
    public static final class TextWriter<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::TextWriter";
      private TextWriter(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> TextWriter<T> create(ai.greycat.GreyCat greycat) {
        return new TextWriter<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[83]);
      }
    }
    public static final class TextReader<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::TextReader";
      private TextReader(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> TextReader<T> create(ai.greycat.GreyCat greycat) {
        return new TextReader<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[84]);
      }
    }
    public static final class JsonWriter<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::JsonWriter";
      private JsonWriter(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> JsonWriter<T> create(ai.greycat.GreyCat greycat) {
        return new JsonWriter<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[85]);
      }
    }
    public static final class JsonReader<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::JsonReader";
      private JsonReader(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> JsonReader<T> create(ai.greycat.GreyCat greycat) {
        return new JsonReader<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[86]);
      }
    }
    public static final class CsvWriter<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvWriter";
      private CsvWriter(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.io.CsvFormat format() {
        return (ai.greycat.std.io.CsvFormat) super.get(super.type.generated_offsets[2]);
      }
      public void set_format(ai.greycat.std.io.CsvFormat v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static <T> CsvWriter<T> create(ai.greycat.GreyCat greycat) {
        return new CsvWriter<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[87]);
      }
    }
    public static final class CsvReader<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvReader";
      private CsvReader(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.io.CsvFormat format() {
        return (ai.greycat.std.io.CsvFormat) super.get(super.type.generated_offsets[2]);
      }
      public void set_format(ai.greycat.std.io.CsvFormat v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static <T> CsvReader<T> create(ai.greycat.GreyCat greycat) {
        return new CsvReader<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[88]);
      }
    }
    public static final class CsvValidateResult extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvValidateResult";
      private CsvValidateResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long line_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_line_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long fail_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_fail_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.Array<java.lang.Long> invalid_count() {
        return (ai.greycat.std.core.Array<java.lang.Long>) super.get(super.type.generated_offsets[2]);
      }
      public void set_invalid_count(ai.greycat.std.core.Array<java.lang.Long> v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static CsvValidateResult create(ai.greycat.GreyCat greycat) {
        return new CsvValidateResult(greycat.libs_by_name.get(ai.greycat.std.name).mapped[89]);
      }
    }
    public static final class TextEncoder extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "io::TextEncoder";
      private TextEncoder(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.io.TextEncoder plain(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[90];
        return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.io.TextEncoder base64(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[90];
        return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.io.TextEncoder base64url(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[90];
        return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[2]];
      }
      public static ai.greycat.std.io.TextEncoder hexadecimal(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[90];
        return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[3]];
      }
      public static TextEncoder create(ai.greycat.GreyCat greycat) {
        return new TextEncoder(greycat.libs_by_name.get(ai.greycat.std.name).mapped[90]);
      }
    }
    public static final class CsvColumn extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumn";
      private CsvColumn(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static CsvColumn create(ai.greycat.GreyCat greycat) {
        return new CsvColumn(greycat.libs_by_name.get(ai.greycat.std.name).mapped[91]);
      }
    }
    public static final class CsvColumnString extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnString";
      private CsvColumnString(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Boolean trim() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[3]);
      }
      public void set_trim(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Boolean try_number() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[4]);
      }
      public void set_try_number(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Boolean try_json() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[5]);
      }
      public void set_try_json(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.String> values() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) super.get(super.type.generated_offsets[6]);
      }
      public void set_values(ai.greycat.std.core.Array<ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public ai.greycat.std.io.TextEncoder encoder() {
        return (ai.greycat.std.io.TextEncoder) super.get(super.type.generated_offsets[7]);
      }
      public void set_encoder(ai.greycat.std.io.TextEncoder v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public static CsvColumnString create(ai.greycat.GreyCat greycat) {
        return new CsvColumnString(greycat.libs_by_name.get(ai.greycat.std.name).mapped[92]);
      }
    }
    public static final class CsvColumnInteger extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnInteger";
      private CsvColumnInteger(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static CsvColumnInteger create(ai.greycat.GreyCat greycat) {
        return new CsvColumnInteger(greycat.libs_by_name.get(ai.greycat.std.name).mapped[93]);
      }
    }
    public static final class CsvColumnFloat extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnFloat";
      private CsvColumnFloat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static CsvColumnFloat create(ai.greycat.GreyCat greycat) {
        return new CsvColumnFloat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[94]);
      }
    }
    public static final class CsvColumnBoolean extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnBoolean";
      private CsvColumnBoolean(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static CsvColumnBoolean create(ai.greycat.GreyCat greycat) {
        return new CsvColumnBoolean(greycat.libs_by_name.get(ai.greycat.std.name).mapped[95]);
      }
    }
    public static final class CsvColumnTime extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnTime";
      private CsvColumnTime(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.DurationUnit unit() {
        return (ai.greycat.std.core.DurationUnit) super.get(super.type.generated_offsets[3]);
      }
      public void set_unit(ai.greycat.std.core.DurationUnit v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public static CsvColumnTime create(ai.greycat.GreyCat greycat) {
        return new CsvColumnTime(greycat.libs_by_name.get(ai.greycat.std.name).mapped[96]);
      }
    }
    public static final class CsvColumnDuration extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnDuration";
      private CsvColumnDuration(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.DurationUnit unit() {
        return (ai.greycat.std.core.DurationUnit) super.get(super.type.generated_offsets[3]);
      }
      public void set_unit(ai.greycat.std.core.DurationUnit v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public static CsvColumnDuration create(ai.greycat.GreyCat greycat) {
        return new CsvColumnDuration(greycat.libs_by_name.get(ai.greycat.std.name).mapped[97]);
      }
    }
    public static final class CsvColumnDate extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnDate";
      private CsvColumnDate(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String format() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_format(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.TimeZone tz() {
        return (ai.greycat.std.core.TimeZone) super.get(super.type.generated_offsets[4]);
      }
      public void set_tz(ai.greycat.std.core.TimeZone v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Boolean as_time() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[5]);
      }
      public void set_as_time(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public static CsvColumnDate create(ai.greycat.GreyCat greycat) {
        return new CsvColumnDate(greycat.libs_by_name.get(ai.greycat.std.name).mapped[98]);
      }
    }
    public static final class CsvColumnIgnored extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnIgnored";
      private CsvColumnIgnored(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Boolean mandatory() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[1]);
      }
      public void set_mandatory(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long offset() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_offset(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static CsvColumnIgnored create(ai.greycat.GreyCat greycat) {
        return new CsvColumnIgnored(greycat.libs_by_name.get(ai.greycat.std.name).mapped[99]);
      }
    }
    public static final class CsvFormat extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvFormat";
      private CsvFormat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long header_lines() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_header_lines(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Character separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[1]);
      }
      public void set_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Character string_delimiter() {
        return (java.lang.Character) super.get(super.type.generated_offsets[2]);
      }
      public void set_string_delimiter(java.lang.Character v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Character decimal_separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[3]);
      }
      public void set_decimal_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Character thousands_separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[4]);
      }
      public void set_thousands_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Long columns_size() {
        return (java.lang.Long) super.get(super.type.generated_offsets[5]);
      }
      public void set_columns_size(java.lang.Long v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumn> columns() {
        return (ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumn>) super.get(super.type.generated_offsets[6]);
      }
      public void set_columns(ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumn> v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public static ai.greycat.std.core.String generate(ai.greycat.GreyCat greycat, ai.greycat.std.io.CsvFormat format, java.lang.Long ident_col, java.lang.Long time_col) throws java.io.IOException {
        return (ai.greycat.std.core.String) greycat.call("io::CsvFormat::generate", format, ident_col, time_col);
      }
      public static ai.greycat.std.io.CsvValidateResult validate(ai.greycat.GreyCat greycat, ai.greycat.std.core.String path, ai.greycat.std.io.CsvFormat format, java.lang.Long max_rows, java.lang.Long max_invalid, ai.greycat.std.core.String invalid_path) throws java.io.IOException {
        return (ai.greycat.std.io.CsvValidateResult) greycat.call("io::CsvFormat::validate", path, format, max_rows, max_invalid, invalid_path);
      }
      public static ai.greycat.std.core.Table sample(ai.greycat.GreyCat greycat, ai.greycat.std.core.String path, ai.greycat.std.io.CsvFormat format, java.lang.Long offset, java.lang.Long max) throws java.io.IOException {
        return (ai.greycat.std.core.Table) greycat.call("io::CsvFormat::sample", path, format, offset, max);
      }
      public static ai.greycat.std.io.CsvFormat infer(ai.greycat.GreyCat greycat, ai.greycat.std.io.CsvStatistics analysis) throws java.io.IOException {
        return (ai.greycat.std.io.CsvFormat) greycat.call("io::CsvFormat::infer", analysis);
      }
      public static CsvFormat create(ai.greycat.GreyCat greycat) {
        return new CsvFormat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[100]);
      }
    }
    public static final class CsvColumnStatistics extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnStatistics";
      private CsvColumnStatistics(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Object example() {
        return (java.lang.Object) super.get(super.type.generated_offsets[1]);
      }
      public void set_example(java.lang.Object v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long null_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_null_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Long bool_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[3]);
      }
      public void set_bool_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Long int_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[4]);
      }
      public void set_int_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Long float_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[5]);
      }
      public void set_float_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Long string_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[6]);
      }
      public void set_string_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public java.lang.Long date_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[7]);
      }
      public void set_date_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public ai.greycat.std.core.Map<ai.greycat.std.core.String, java.lang.Long> date_format_count() {
        return (ai.greycat.std.core.Map<ai.greycat.std.core.String, java.lang.Long>) super.get(super.type.generated_offsets[8]);
      }
      public void set_date_format_count(ai.greycat.std.core.Map<ai.greycat.std.core.String, java.lang.Long> v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public ai.greycat.std.core.Map<java.lang.Object, java.lang.Long> enumerable_count() {
        return (ai.greycat.std.core.Map<java.lang.Object, java.lang.Long>) super.get(super.type.generated_offsets[9]);
      }
      public void set_enumerable_count(ai.greycat.std.core.Map<java.lang.Object, java.lang.Long> v) {
        super.set(super.type.generated_offsets[9], v);
      }
      public ai.greycat.std.util.Gaussian profile() {
        return (ai.greycat.std.util.Gaussian) super.get(super.type.generated_offsets[10]);
      }
      public void set_profile(ai.greycat.std.util.Gaussian v) {
        super.set(super.type.generated_offsets[10], v);
      }
      public static CsvColumnStatistics create(ai.greycat.GreyCat greycat) {
        return new CsvColumnStatistics(greycat.libs_by_name.get(ai.greycat.std.name).mapped[101]);
      }
    }
    public static final class CsvStatistics extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvStatistics";
      private CsvStatistics(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long header_lines() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_header_lines(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Character separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[1]);
      }
      public void set_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Character string_delimiter() {
        return (java.lang.Character) super.get(super.type.generated_offsets[2]);
      }
      public void set_string_delimiter(java.lang.Character v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Character decimal_separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[3]);
      }
      public void set_decimal_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Character thousands_separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[4]);
      }
      public void set_thousands_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumnStatistics> columns() {
        return (ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumnStatistics>) super.get(super.type.generated_offsets[5]);
      }
      public void set_columns(ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumnStatistics> v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Long line_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[6]);
      }
      public void set_line_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public java.lang.Long fail_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[7]);
      }
      public void set_fail_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public java.lang.Long file_count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[8]);
      }
      public void set_file_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public static CsvStatistics create(ai.greycat.GreyCat greycat) {
        return new CsvStatistics(greycat.libs_by_name.get(ai.greycat.std.name).mapped[102]);
      }
    }
    public static final class CsvAnalysisConfig extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvAnalysisConfig";
      private CsvAnalysisConfig(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long header_lines() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_header_lines(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Character separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[1]);
      }
      public void set_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Character string_delimiter() {
        return (java.lang.Character) super.get(super.type.generated_offsets[2]);
      }
      public void set_string_delimiter(java.lang.Character v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Character decimal_separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[3]);
      }
      public void set_decimal_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Character thousands_separator() {
        return (java.lang.Character) super.get(super.type.generated_offsets[4]);
      }
      public void set_thousands_separator(java.lang.Character v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Long row_limit() {
        return (java.lang.Long) super.get(super.type.generated_offsets[5]);
      }
      public void set_row_limit(java.lang.Long v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Long enumerable_limit() {
        return (java.lang.Long) super.get(super.type.generated_offsets[6]);
      }
      public void set_enumerable_limit(java.lang.Long v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public java.lang.Long date_check_limit() {
        return (java.lang.Long) super.get(super.type.generated_offsets[7]);
      }
      public void set_date_check_limit(java.lang.Long v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.String> date_formats() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) super.get(super.type.generated_offsets[8]);
      }
      public void set_date_formats(ai.greycat.std.core.Array<ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public static CsvAnalysisConfig create(ai.greycat.GreyCat greycat) {
        return new CsvAnalysisConfig(greycat.libs_by_name.get(ai.greycat.std.name).mapped[103]);
      }
    }
    public static final class CsvAnalysis extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::CsvAnalysis";
      private CsvAnalysis(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.io.CsvAnalysisConfig config() {
        return (ai.greycat.std.io.CsvAnalysisConfig) super.get(super.type.generated_offsets[0]);
      }
      public void set_config(ai.greycat.std.io.CsvAnalysisConfig v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.io.CsvStatistics statistics() {
        return (ai.greycat.std.io.CsvStatistics) super.get(super.type.generated_offsets[1]);
      }
      public void set_statistics(ai.greycat.std.io.CsvStatistics v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static ai.greycat.std.io.CsvStatistics analyze(ai.greycat.GreyCat greycat, ai.greycat.std.core.String file_path, ai.greycat.std.io.CsvAnalysisConfig config) throws java.io.IOException {
        return (ai.greycat.std.io.CsvStatistics) greycat.call("io::CsvAnalysis::analyze", file_path, config);
      }
      public static CsvAnalysis create(ai.greycat.GreyCat greycat) {
        return new CsvAnalysis(greycat.libs_by_name.get(ai.greycat.std.name).mapped[104]);
      }
    }
    public static final class File extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::File";
      private File(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long size() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_size(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.time last_modification() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[2]);
      }
      public void set_last_modification(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static File create(ai.greycat.GreyCat greycat) {
        return new File(greycat.libs_by_name.get(ai.greycat.std.name).mapped[105]);
      }
    }
    public static final class FileWalker extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::FileWalker";
      private FileWalker(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public static FileWalker create(ai.greycat.GreyCat greycat) {
        return new FileWalker(greycat.libs_by_name.get(ai.greycat.std.name).mapped[106]);
      }
    }
    public static final class Url extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::Url";
      private Url(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String protocol() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_protocol(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String host() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_host(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long port() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_port(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.String path() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[3]);
      }
      public void set_path(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> params() {
        return (ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String>) super.get(super.type.generated_offsets[4]);
      }
      public void set_params(ai.greycat.std.core.Map<ai.greycat.std.core.String, ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.String hash() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[5]);
      }
      public void set_hash(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public static Url create(ai.greycat.GreyCat greycat) {
        return new Url(greycat.libs_by_name.get(ai.greycat.std.name).mapped[107]);
      }
    }
    public static final class HttpHeader extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::HttpHeader";
      private HttpHeader(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String name() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_name(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String value() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_value(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static HttpHeader create(ai.greycat.GreyCat greycat) {
        return new HttpHeader(greycat.libs_by_name.get(ai.greycat.std.name).mapped[108]);
      }
    }
    public static final class Http extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::Http";
      private Http(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static Http create(ai.greycat.GreyCat greycat) {
        return new Http(greycat.libs_by_name.get(ai.greycat.std.name).mapped[109]);
      }
    }
    public static final class Email extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::Email";
      private Email(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String from() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_from(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.String subject() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[1]);
      }
      public void set_subject(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.String body() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[2]);
      }
      public void set_body(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Boolean body_is_html() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[3]);
      }
      public void set_body_is_html(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.String> to() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) super.get(super.type.generated_offsets[4]);
      }
      public void set_to(ai.greycat.std.core.Array<ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.String> cc() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) super.get(super.type.generated_offsets[5]);
      }
      public void set_cc(ai.greycat.std.core.Array<ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public ai.greycat.std.core.Array<ai.greycat.std.core.String> bcc() {
        return (ai.greycat.std.core.Array<ai.greycat.std.core.String>) super.get(super.type.generated_offsets[6]);
      }
      public void set_bcc(ai.greycat.std.core.Array<ai.greycat.std.core.String> v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public static Email create(ai.greycat.GreyCat greycat) {
        return new Email(greycat.libs_by_name.get(ai.greycat.std.name).mapped[110]);
      }
    }
    public static final class SmtpMode extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "io::SmtpMode";
      private SmtpMode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.io.SmtpMode plain(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[111];
        return (ai.greycat.std.io.SmtpMode) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.io.SmtpMode ssl_tls(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[111];
        return (ai.greycat.std.io.SmtpMode) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.io.SmtpMode starttls(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[111];
        return (ai.greycat.std.io.SmtpMode) t.enum_values[t.generated_offsets[2]];
      }
      public static SmtpMode create(ai.greycat.GreyCat greycat) {
        return new SmtpMode(greycat.libs_by_name.get(ai.greycat.std.name).mapped[111]);
      }
    }
    public static final class SmtpAuth extends ai.greycat.GreyCat.Enum {
      public static final java.lang.String name = "io::SmtpAuth";
      private SmtpAuth(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static ai.greycat.std.io.SmtpAuth none(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[112];
        return (ai.greycat.std.io.SmtpAuth) t.enum_values[t.generated_offsets[0]];
      }
      public static ai.greycat.std.io.SmtpAuth plain(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[112];
        return (ai.greycat.std.io.SmtpAuth) t.enum_values[t.generated_offsets[1]];
      }
      public static ai.greycat.std.io.SmtpAuth login(ai.greycat.GreyCat greycat) {
        final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[112];
        return (ai.greycat.std.io.SmtpAuth) t.enum_values[t.generated_offsets[2]];
      }
      public static SmtpAuth create(ai.greycat.GreyCat greycat) {
        return new SmtpAuth(greycat.libs_by_name.get(ai.greycat.std.name).mapped[112]);
      }
    }
    public static final class Smtp extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "io::Smtp";
      private Smtp(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.String host() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[0]);
      }
      public void set_host(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long port() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_port(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.io.SmtpMode mode() {
        return (ai.greycat.std.io.SmtpMode) super.get(super.type.generated_offsets[2]);
      }
      public void set_mode(ai.greycat.std.io.SmtpMode v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.io.SmtpAuth authenticate() {
        return (ai.greycat.std.io.SmtpAuth) super.get(super.type.generated_offsets[3]);
      }
      public void set_authenticate(ai.greycat.std.io.SmtpAuth v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.String user() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[4]);
      }
      public void set_user(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public ai.greycat.std.core.String pass() {
        return (ai.greycat.std.core.String) super.get(super.type.generated_offsets[5]);
      }
      public void set_pass(ai.greycat.std.core.String v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public static Smtp create(ai.greycat.GreyCat greycat) {
        return new Smtp(greycat.libs_by_name.get(ai.greycat.std.name).mapped[113]);
      }
    }
  }
  public static final class util {
    public static final class Queue<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Queue";
      private Queue(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array values() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[0]);
      }
      public void set_values(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long capacity() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_capacity(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static <T> Queue<T> create(ai.greycat.GreyCat greycat) {
        return new Queue<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[114]);
      }
    }
    public static final class Stack<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Stack";
      private Stack(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array values() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[0]);
      }
      public void set_values(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public static <T> Stack<T> create(ai.greycat.GreyCat greycat) {
        return new Stack<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[115]);
      }
    }
    public static final class SlidingWindow<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::SlidingWindow";
      private SlidingWindow(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array values() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[0]);
      }
      public void set_values(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long capacity() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_capacity(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) super.get(super.type.generated_offsets[2]);
      }
      public void set_sum(java.lang.Double v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Double sumsq() {
        return (java.lang.Double) super.get(super.type.generated_offsets[3]);
      }
      public void set_sumsq(java.lang.Double v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.field field() {
        return (ai.greycat.std.core.field) super.get(super.type.generated_offsets[4]);
      }
      public void set_field(ai.greycat.std.core.field v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public static <T> SlidingWindow<T> create(ai.greycat.GreyCat greycat) {
        return new SlidingWindow<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[116]);
      }
    }
    public static final class TimeWindow<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::TimeWindow";
      private TimeWindow(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Table values() {
        return (ai.greycat.std.core.Table) super.get(super.type.generated_offsets[0]);
      }
      public void set_values(ai.greycat.std.core.Table v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.duration width() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[1]);
      }
      public void set_width(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) super.get(super.type.generated_offsets[2]);
      }
      public void set_sum(java.lang.Double v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Double sumsq() {
        return (java.lang.Double) super.get(super.type.generated_offsets[3]);
      }
      public void set_sumsq(java.lang.Double v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public ai.greycat.std.core.field field() {
        return (ai.greycat.std.core.field) super.get(super.type.generated_offsets[4]);
      }
      public void set_field(ai.greycat.std.core.field v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public static <T> TimeWindow<T> create(ai.greycat.GreyCat greycat) {
        return new TimeWindow<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[117]);
      }
    }
    public static final class Gaussian extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Gaussian";
      private Gaussian(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) super.get(super.type.generated_offsets[0]);
      }
      public void set_sum(java.lang.Double v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Double sumsq() {
        return (java.lang.Double) super.get(super.type.generated_offsets[1]);
      }
      public void set_sumsq(java.lang.Double v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long count() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_count(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Double min() {
        return (java.lang.Double) super.get(super.type.generated_offsets[3]);
      }
      public void set_min(java.lang.Double v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Double max() {
        return (java.lang.Double) super.get(super.type.generated_offsets[4]);
      }
      public void set_max(java.lang.Double v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public static Gaussian create(ai.greycat.GreyCat greycat) {
        return new Gaussian(greycat.libs_by_name.get(ai.greycat.std.name).mapped[118]);
      }
    }
    public static final class Random extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Random";
      private Random(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Long seed() {
        return (java.lang.Long) super.get(super.type.generated_offsets[0]);
      }
      public void set_seed(java.lang.Long v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Double v() {
        return (java.lang.Double) super.get(super.type.generated_offsets[1]);
      }
      public void set_v(java.lang.Double v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public static Random create(ai.greycat.GreyCat greycat) {
        return new Random(greycat.libs_by_name.get(ai.greycat.std.name).mapped[119]);
      }
    }
    public static final class Assert extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Assert";
      private Assert(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static Assert create(ai.greycat.GreyCat greycat) {
        return new Assert(greycat.libs_by_name.get(ai.greycat.std.name).mapped[120]);
      }
    }
    public static final class ProgressTracker extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::ProgressTracker";
      private ProgressTracker(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.time start() {
        return (ai.greycat.std.core.time) super.get(super.type.generated_offsets[0]);
      }
      public void set_start(ai.greycat.std.core.time v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Long total() {
        return (java.lang.Long) super.get(super.type.generated_offsets[1]);
      }
      public void set_total(java.lang.Long v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long counter() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_counter(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public ai.greycat.std.core.duration duration() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[3]);
      }
      public void set_duration(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Double progress() {
        return (java.lang.Double) super.get(super.type.generated_offsets[4]);
      }
      public void set_progress(java.lang.Double v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Double speed() {
        return (java.lang.Double) super.get(super.type.generated_offsets[5]);
      }
      public void set_speed(java.lang.Double v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public ai.greycat.std.core.duration remaining() {
        return (ai.greycat.std.core.duration) super.get(super.type.generated_offsets[6]);
      }
      public void set_remaining(ai.greycat.std.core.duration v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public static ProgressTracker create(ai.greycat.GreyCat greycat) {
        return new ProgressTracker(greycat.libs_by_name.get(ai.greycat.std.name).mapped[121]);
      }
    }
    public static final class Quantizer<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Quantizer";
      private Quantizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static <T> Quantizer<T> create(ai.greycat.GreyCat greycat) {
        return new Quantizer<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[122]);
      }
    }
    public static final class LinearQuantizer<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::LinearQuantizer";
      private LinearQuantizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Double min() {
        return (java.lang.Double) super.get(super.type.generated_offsets[0]);
      }
      public void set_min(java.lang.Double v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Double max() {
        return (java.lang.Double) super.get(super.type.generated_offsets[1]);
      }
      public void set_max(java.lang.Double v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long bins() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_bins(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Boolean open() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[3]);
      }
      public void set_open(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public static <T> LinearQuantizer<T> create(ai.greycat.GreyCat greycat) {
        return new LinearQuantizer<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[123]);
      }
    }
    public static final class LogQuantizer<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::LogQuantizer";
      private LogQuantizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Double min() {
        return (java.lang.Double) super.get(super.type.generated_offsets[0]);
      }
      public void set_min(java.lang.Double v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Double max() {
        return (java.lang.Double) super.get(super.type.generated_offsets[1]);
      }
      public void set_max(java.lang.Double v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long bins() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_bins(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Boolean open() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[3]);
      }
      public void set_open(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public static <T> LogQuantizer<T> create(ai.greycat.GreyCat greycat) {
        return new LogQuantizer<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[124]);
      }
    }
    public static final class CustomQuantizer<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::CustomQuantizer";
      private CustomQuantizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Double min() {
        return (java.lang.Double) super.get(super.type.generated_offsets[0]);
      }
      public void set_min(java.lang.Double v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Double max() {
        return (java.lang.Double) super.get(super.type.generated_offsets[1]);
      }
      public void set_max(java.lang.Double v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.Array step_starts() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[2]);
      }
      public void set_step_starts(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Boolean open() {
        return (java.lang.Boolean) super.get(super.type.generated_offsets[3]);
      }
      public void set_open(java.lang.Boolean v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public static <T> CustomQuantizer<T> create(ai.greycat.GreyCat greycat) {
        return new CustomQuantizer<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[125]);
      }
    }
    public static final class MultiQuantizer<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::MultiQuantizer";
      private MultiQuantizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.core.Array dimensions() {
        return (ai.greycat.std.core.Array) super.get(super.type.generated_offsets[0]);
      }
      public void set_dimensions(ai.greycat.std.core.Array v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public static <T> MultiQuantizer<T> create(ai.greycat.GreyCat greycat) {
        return new MultiQuantizer<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[126]);
      }
    }
    public static final class GaussianProfile<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::GaussianProfile";
      private GaussianProfile(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.util.Quantizer quantizer() {
        return (ai.greycat.std.util.Quantizer) super.get(super.type.generated_offsets[0]);
      }
      public void set_quantizer(ai.greycat.std.util.Quantizer v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.FloatPrecision precision() {
        return (ai.greycat.std.core.FloatPrecision) super.get(super.type.generated_offsets[1]);
      }
      public void set_precision(ai.greycat.std.core.FloatPrecision v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public ai.greycat.std.core.Table<java.lang.Long> bins() {
        return (ai.greycat.std.core.Table<java.lang.Long>) super.get(super.type.generated_offsets[2]);
      }
      public void set_bins(ai.greycat.std.core.Table<java.lang.Long> v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Double value_min() {
        return (java.lang.Double) super.get(super.type.generated_offsets[3]);
      }
      public void set_value_min(java.lang.Double v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Long nb_rejected() {
        return (java.lang.Long) super.get(super.type.generated_offsets[4]);
      }
      public void set_nb_rejected(java.lang.Long v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public static <T> GaussianProfile<T> create(ai.greycat.GreyCat greycat) {
        return new GaussianProfile<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[127]);
      }
    }
    public static final class Histogram<T> extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Histogram";
      private Histogram(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public ai.greycat.std.util.Quantizer quantizer() {
        return (ai.greycat.std.util.Quantizer) super.get(super.type.generated_offsets[0]);
      }
      public void set_quantizer(ai.greycat.std.util.Quantizer v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public ai.greycat.std.core.Array<java.lang.Long> bins() {
        return (ai.greycat.std.core.Array<java.lang.Long>) super.get(super.type.generated_offsets[1]);
      }
      public void set_bins(ai.greycat.std.core.Array<java.lang.Long> v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Long nb_rejected() {
        return (java.lang.Long) super.get(super.type.generated_offsets[2]);
      }
      public void set_nb_rejected(java.lang.Long v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public static <T> Histogram<T> create(ai.greycat.GreyCat greycat) {
        return new Histogram<>(greycat.libs_by_name.get(ai.greycat.std.name).mapped[128]);
      }
    }
    public static final class HistogramStats extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::HistogramStats";
      private HistogramStats(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public java.lang.Double min() {
        return (java.lang.Double) super.get(super.type.generated_offsets[0]);
      }
      public void set_min(java.lang.Double v) {
        super.set(super.type.generated_offsets[0], v);
      }
      public java.lang.Double max() {
        return (java.lang.Double) super.get(super.type.generated_offsets[1]);
      }
      public void set_max(java.lang.Double v) {
        super.set(super.type.generated_offsets[1], v);
      }
      public java.lang.Double whisker_low() {
        return (java.lang.Double) super.get(super.type.generated_offsets[2]);
      }
      public void set_whisker_low(java.lang.Double v) {
        super.set(super.type.generated_offsets[2], v);
      }
      public java.lang.Double whisker_high() {
        return (java.lang.Double) super.get(super.type.generated_offsets[3]);
      }
      public void set_whisker_high(java.lang.Double v) {
        super.set(super.type.generated_offsets[3], v);
      }
      public java.lang.Double percentile1() {
        return (java.lang.Double) super.get(super.type.generated_offsets[4]);
      }
      public void set_percentile1(java.lang.Double v) {
        super.set(super.type.generated_offsets[4], v);
      }
      public java.lang.Double percentile5() {
        return (java.lang.Double) super.get(super.type.generated_offsets[5]);
      }
      public void set_percentile5(java.lang.Double v) {
        super.set(super.type.generated_offsets[5], v);
      }
      public java.lang.Double percentile25() {
        return (java.lang.Double) super.get(super.type.generated_offsets[6]);
      }
      public void set_percentile25(java.lang.Double v) {
        super.set(super.type.generated_offsets[6], v);
      }
      public java.lang.Double percentile50() {
        return (java.lang.Double) super.get(super.type.generated_offsets[7]);
      }
      public void set_percentile50(java.lang.Double v) {
        super.set(super.type.generated_offsets[7], v);
      }
      public java.lang.Double percentile75() {
        return (java.lang.Double) super.get(super.type.generated_offsets[8]);
      }
      public void set_percentile75(java.lang.Double v) {
        super.set(super.type.generated_offsets[8], v);
      }
      public java.lang.Double percentile95() {
        return (java.lang.Double) super.get(super.type.generated_offsets[9]);
      }
      public void set_percentile95(java.lang.Double v) {
        super.set(super.type.generated_offsets[9], v);
      }
      public java.lang.Double percentile99() {
        return (java.lang.Double) super.get(super.type.generated_offsets[10]);
      }
      public void set_percentile99(java.lang.Double v) {
        super.set(super.type.generated_offsets[10], v);
      }
      public java.lang.Long count_outliers_low() {
        return (java.lang.Long) super.get(super.type.generated_offsets[11]);
      }
      public void set_count_outliers_low(java.lang.Long v) {
        super.set(super.type.generated_offsets[11], v);
      }
      public java.lang.Long count_outliers_high() {
        return (java.lang.Long) super.get(super.type.generated_offsets[12]);
      }
      public void set_count_outliers_high(java.lang.Long v) {
        super.set(super.type.generated_offsets[12], v);
      }
      public java.lang.Double percentage_outliers_low() {
        return (java.lang.Double) super.get(super.type.generated_offsets[13]);
      }
      public void set_percentage_outliers_low(java.lang.Double v) {
        super.set(super.type.generated_offsets[13], v);
      }
      public java.lang.Double percentage_outliers_high() {
        return (java.lang.Double) super.get(super.type.generated_offsets[14]);
      }
      public void set_percentage_outliers_high(java.lang.Double v) {
        super.set(super.type.generated_offsets[14], v);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) super.get(super.type.generated_offsets[15]);
      }
      public void set_sum(java.lang.Double v) {
        super.set(super.type.generated_offsets[15], v);
      }
      public java.lang.Double avg() {
        return (java.lang.Double) super.get(super.type.generated_offsets[16]);
      }
      public void set_avg(java.lang.Double v) {
        super.set(super.type.generated_offsets[16], v);
      }
      public java.lang.Double std() {
        return (java.lang.Double) super.get(super.type.generated_offsets[17]);
      }
      public void set_std(java.lang.Double v) {
        super.set(super.type.generated_offsets[17], v);
      }
      public java.lang.Long size() {
        return (java.lang.Long) super.get(super.type.generated_offsets[18]);
      }
      public void set_size(java.lang.Long v) {
        super.set(super.type.generated_offsets[18], v);
      }
      public static HistogramStats create(ai.greycat.GreyCat greycat) {
        return new HistogramStats(greycat.libs_by_name.get(ai.greycat.std.name).mapped[129]);
      }
    }
    public static final class Crypto extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Crypto";
      private Crypto(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static Crypto create(ai.greycat.GreyCat greycat) {
        return new Crypto(greycat.libs_by_name.get(ai.greycat.std.name).mapped[130]);
      }
    }
    public static final class Plot extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Plot";
      private Plot(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static Plot create(ai.greycat.GreyCat greycat) {
        return new Plot(greycat.libs_by_name.get(ai.greycat.std.name).mapped[131]);
      }
    }
    public static final class Root extends ai.greycat.GreyCat.Object {
      public static final java.lang.String name = "util::Root";
      private Root(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }
      public static Root create(ai.greycat.GreyCat greycat) {
        return new Root(greycat.libs_by_name.get(ai.greycat.std.name).mapped[171]);
      }
    }
  }
  @Override
  public void configure(java.util.Map<java.lang.String, ai.greycat.GreyCat.Loader> loaders, java.util.Map<java.lang.String, ai.greycat.GreyCat.Factory> factories) {
  }
  @Override
  public void init(ai.greycat.GreyCat greycat) {
  }
}

