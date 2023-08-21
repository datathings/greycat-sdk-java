// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package ai.greycat;
@SuppressWarnings({"unused", "unchecked"})
public final class std extends ai.greycat.GreyCat.Library {
	public static final java.lang.String name = "std";
	@Override
	public String name() {
		return name;
	}
	public static final class core {
		public static final class TableColumnMeta extends GreyCat.Object {
			public static final java.lang.String name = "core::TableColumnMeta";
			private TableColumnMeta(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String type(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_type(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_size(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean index(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_index(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Object min(){
				return super.get(super.type.generated_offsets[3]);
			}
			public void set_min(java.lang.Object v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Object max(){
				return super.get(super.type.generated_offsets[4]);
			}
			public void set_max(java.lang.Object v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Object avg(){
				return super.get(super.type.generated_offsets[5]);
			}
			public void set_avg(java.lang.Object v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Object std(){
				return super.get(super.type.generated_offsets[6]);
			}
			public void set_std(java.lang.Object v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static TableColumnMeta create(ai.greycat.GreyCat greycat, java.lang.String type, java.lang.Long size, java.lang.Boolean index, java.lang.Object min, java.lang.Object max, java.lang.Object avg, java.lang.Object std){
				return new TableColumnMeta(greycat.libs_by_name.get(ai.greycat.std.name).mapped[0], type, size, index, min, max, avg, std);
			}
		}
		public static final class SamplingMode extends GreyCat.Enum {
			public static final java.lang.String name = "core::SamplingMode";
			private SamplingMode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.core.SamplingMode fixed(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[1];
				return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.core.SamplingMode fixed_reg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[1];
				return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.core.SamplingMode adaptative(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[1];
				return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.core.SamplingMode dense(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[1];
				return (ai.greycat.std.core.SamplingMode) t.enum_values[t.generated_offsets[3]];
			}
			public static SamplingMode create(ai.greycat.GreyCat greycat){
				return new SamplingMode(greycat.libs_by_name.get(ai.greycat.std.name).mapped[1]);
			}
		}
		public static final class nodeList<T> extends ai.greycat.std_n.core.nodeList {
			public static final java.lang.String name = "core::nodeList";
			private nodeList(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static nodeList create(ai.greycat.GreyCat greycat){
				return new nodeList(greycat.libs_by_name.get(ai.greycat.std.name).mapped[2]);
			}
		}
		public static final class Table<T> extends ai.greycat.std_n.core.Table {
			public static final java.lang.String name = "core::Table";
			private Table(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Table create(ai.greycat.GreyCat greycat){
				return new Table(greycat.libs_by_name.get(ai.greycat.std.name).mapped[3]);
			}
		}
		public static final class DatePart extends GreyCat.Enum {
			public static final java.lang.String name = "core::DatePart";
			private DatePart(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.core.DatePart years(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[4];
				return (ai.greycat.std.core.DatePart) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.core.DatePart months(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[4];
				return (ai.greycat.std.core.DatePart) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.core.DatePart days(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[4];
				return (ai.greycat.std.core.DatePart) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.core.DatePart hours(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[4];
				return (ai.greycat.std.core.DatePart) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.std.core.DatePart minutes(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[4];
				return (ai.greycat.std.core.DatePart) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.std.core.DatePart seconds(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[4];
				return (ai.greycat.std.core.DatePart) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.std.core.DatePart microseconds(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[4];
				return (ai.greycat.std.core.DatePart) t.enum_values[t.generated_offsets[6]];
			}
			public static DatePart create(ai.greycat.GreyCat greycat){
				return new DatePart(greycat.libs_by_name.get(ai.greycat.std.name).mapped[4]);
			}
		}
		public static final class GeoCircle extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoCircle";
			private GeoCircle(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.geo center(){
				return (ai.greycat.std.core.geo)super.get(super.type.generated_offsets[0]);
			}
			public void set_center(ai.greycat.std.core.geo v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double radius(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_radius(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static GeoCircle create(ai.greycat.GreyCat greycat, ai.greycat.std.core.geo center, java.lang.Double radius){
				return new GeoCircle(greycat.libs_by_name.get(ai.greycat.std.name).mapped[5], center, radius);
			}
		}
		public static final class nodeIndexBucket extends ai.greycat.std_n.core.nodeIndexBucket {
			public static final java.lang.String name = "core::nodeIndexBucket";
			private nodeIndexBucket(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static nodeIndexBucket create(ai.greycat.GreyCat greycat){
				return new nodeIndexBucket(greycat.libs_by_name.get(ai.greycat.std.name).mapped[6]);
			}
		}
		public static final class time extends ai.greycat.std_n.core.time {
			public static final java.lang.String name = "core::time";
			private time(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static time create(ai.greycat.GreyCat greycat){
				return new time(greycat.libs_by_name.get(ai.greycat.std.name).mapped[7]);
			}
		}
		public static final class nodeTime<T> extends ai.greycat.std_n.core.nodeTime {
			public static final java.lang.String name = "core::nodeTime";
			private nodeTime(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static nodeTime create(ai.greycat.GreyCat greycat){
				return new nodeTime(greycat.libs_by_name.get(ai.greycat.std.name).mapped[8]);
			}
		}
		public static final class NodeTimeInfo extends GreyCat.Object {
			public static final java.lang.String name = "core::NodeTimeInfo";
			private NodeTimeInfo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_size(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.time from(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[1]);
			}
			public void set_from(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.time to(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[2]);
			}
			public void set_to(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static NodeTimeInfo create(ai.greycat.GreyCat greycat, java.lang.Long size, ai.greycat.std.core.time from, ai.greycat.std.core.time to){
				return new NodeTimeInfo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[9], size, from, to);
			}
		}
		public static final class ErrorCode extends GreyCat.Enum {
			public static final java.lang.String name = "core::ErrorCode";
			private ErrorCode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.core.ErrorCode none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.core.ErrorCode too_deep_workspace(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.core.ErrorCode too_deep_iterator(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_operand(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_params(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_param_type(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_numeric(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[6]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_state(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[7]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_null(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[8]];
			}
			public static ai.greycat.std.core.ErrorCode unresolved_ref(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[9]];
			}
			public static ai.greycat.std.core.ErrorCode assign_error(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[10]];
			}
			public static ai.greycat.std.core.ErrorCode interrupted(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[11]];
			}
			public static ai.greycat.std.core.ErrorCode throw_(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[12]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_type(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[13]];
			}
			public static ai.greycat.std.core.ErrorCode wrong_dimension(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[14]];
			}
			public static ai.greycat.std.core.ErrorCode unsupported_operation(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[15]];
			}
			public static ai.greycat.std.core.ErrorCode unsupported_type(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[16]];
			}
			public static ai.greycat.std.core.ErrorCode dimensions_mismatch(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[17]];
			}
			public static ai.greycat.std.core.ErrorCode timeout(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[18]];
			}
			public static ai.greycat.std.core.ErrorCode forbidden(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[19]];
			}
			public static ai.greycat.std.core.ErrorCode runtime_error(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[10];
				return (ai.greycat.std.core.ErrorCode) t.enum_values[t.generated_offsets[20]];
			}
			public static ErrorCode create(ai.greycat.GreyCat greycat){
				return new ErrorCode(greycat.libs_by_name.get(ai.greycat.std.name).mapped[10]);
			}
		}
		public static final class Error extends ai.greycat.std_n.core.Error {
			public static final java.lang.String name = "core::Error";
			private Error(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Error create(ai.greycat.GreyCat greycat){
				return new Error(greycat.libs_by_name.get(ai.greycat.std.name).mapped[11]);
			}
		}
		public static final class function extends ai.greycat.std_n.core.function {
			public static final java.lang.String name = "core::function";
			private function(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static function create(ai.greycat.GreyCat greycat){
				return new function(greycat.libs_by_name.get(ai.greycat.std.name).mapped[12]);
			}
		}
		public static final class Map<K,V> extends ai.greycat.std_n.core.Map {
			public static final java.lang.String name = "core::Map";
			private Map(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Map create(ai.greycat.GreyCat greycat){
				return new Map(greycat.libs_by_name.get(ai.greycat.std.name).mapped[13]);
			}
		}
		public static final class geo extends ai.greycat.std_n.core.geo {
			public static final java.lang.String name = "core::geo";
			private geo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static geo create(ai.greycat.GreyCat greycat){
				return new geo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[14]);
			}
		}
		public static final class ti2d extends ai.greycat.std_n.core.ti2d {
			public static final java.lang.String name = "core::ti2d";
			private ti2d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ti2d create(ai.greycat.GreyCat greycat){
				return new ti2d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[15]);
			}
		}
		public static final class tf3d extends ai.greycat.std_n.core.tf3d {
			public static final java.lang.String name = "core::tf3d";
			private tf3d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static tf3d create(ai.greycat.GreyCat greycat){
				return new tf3d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[16]);
			}
		}
		public static final class TensorType extends GreyCat.Enum {
			public static final java.lang.String name = "core::TensorType";
			private TensorType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.core.TensorType i32(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[17];
				return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.core.TensorType i64(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[17];
				return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.core.TensorType f32(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[17];
				return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.core.TensorType f64(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[17];
				return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.std.core.TensorType c64(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[17];
				return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.std.core.TensorType c128(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[17];
				return (ai.greycat.std.core.TensorType) t.enum_values[t.generated_offsets[5]];
			}
			public static TensorType create(ai.greycat.GreyCat greycat){
				return new TensorType(greycat.libs_by_name.get(ai.greycat.std.name).mapped[17]);
			}
		}
		public static final class GeoPoly extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoPoly";
			private GeoPoly(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.Array<ai.greycat.std.core.geo> points(){
				return (ai.greycat.std.core.Array<ai.greycat.std.core.geo>)super.get(super.type.generated_offsets[0]);
			}
			public void set_points(ai.greycat.std.core.Array<ai.greycat.std.core.geo> v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static GeoPoly create(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.core.geo> points){
				return new GeoPoly(greycat.libs_by_name.get(ai.greycat.std.name).mapped[18], points);
			}
		}
		public static final class DurationUnit extends GreyCat.Enum {
			public static final java.lang.String name = "core::DurationUnit";
			private DurationUnit(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.core.DurationUnit microseconds(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.core.DurationUnit milliseconds(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.core.DurationUnit seconds(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.core.DurationUnit minutes(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.std.core.DurationUnit hours(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.std.core.DurationUnit days(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.std.core.DurationUnit weeks(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[6]];
			}
			public static ai.greycat.std.core.DurationUnit months(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[7]];
			}
			public static ai.greycat.std.core.DurationUnit years(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[19];
				return (ai.greycat.std.core.DurationUnit) t.enum_values[t.generated_offsets[8]];
			}
			public static DurationUnit create(ai.greycat.GreyCat greycat){
				return new DurationUnit(greycat.libs_by_name.get(ai.greycat.std.name).mapped[19]);
			}
		}
		public static final class duration extends ai.greycat.std_n.core.duration {
			public static final java.lang.String name = "core::duration";
			private duration(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static duration create(ai.greycat.GreyCat greycat){
				return new duration(greycat.libs_by_name.get(ai.greycat.std.name).mapped[20]);
			}
		}
		public static final class node<T> extends ai.greycat.std_n.core.node {
			public static final java.lang.String name = "core::node";
			private node(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static node create(ai.greycat.GreyCat greycat){
				return new node(greycat.libs_by_name.get(ai.greycat.std.name).mapped[21]);
			}
		}
		public static final class Date extends ai.greycat.std_n.core.Date {
			public static final java.lang.String name = "core::Date";
			private Date(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Date create(ai.greycat.GreyCat greycat){
				return new Date(greycat.libs_by_name.get(ai.greycat.std.name).mapped[22]);
			}
		}
		public static final class tf4d extends ai.greycat.std_n.core.tf4d {
			public static final java.lang.String name = "core::tf4d";
			private tf4d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static tf4d create(ai.greycat.GreyCat greycat){
				return new tf4d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[23]);
			}
		}
		public static final class Tensor extends ai.greycat.std_n.core.Tensor {
			public static final java.lang.String name = "core::Tensor";
			private Tensor(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Tensor create(ai.greycat.GreyCat greycat){
				return new Tensor(greycat.libs_by_name.get(ai.greycat.std.name).mapped[24]);
			}
		}
		public static final class ti6d extends ai.greycat.std_n.core.ti6d {
			public static final java.lang.String name = "core::ti6d";
			private ti6d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ti6d create(ai.greycat.GreyCat greycat){
				return new ti6d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[25]);
			}
		}
		public static final class ti4d extends ai.greycat.std_n.core.ti4d {
			public static final java.lang.String name = "core::ti4d";
			private ti4d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ti4d create(ai.greycat.GreyCat greycat){
				return new ti4d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[26]);
			}
		}
		public static final class ti10d extends ai.greycat.std_n.core.ti10d {
			public static final java.lang.String name = "core::ti10d";
			private ti10d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ti10d create(ai.greycat.GreyCat greycat){
				return new ti10d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[27]);
			}
		}
		public static final class TimeZone extends GreyCat.Enum {
			public static final java.lang.String name = "core::TimeZone";
			private TimeZone(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.core.TimeZone Africa_Accra(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Bamako(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Banjul(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Conakry(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Dakar(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Freetown(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Lome(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[6]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Nouakchott(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[7]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Ouagadougou(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[8]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Timbuktu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[9]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Reykjavik(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[10]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_St_Helena(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[11]];
			}
			public static ai.greycat.std.core.TimeZone Iceland(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[12]];
			}
			public static ai.greycat.std.core.TimeZone Egypt(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[13]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Maseru(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[14]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Mbabane(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[15]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Bangui(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[16]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Brazzaville(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[17]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Douala(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[18]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Kinshasa(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[19]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Libreville(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[20]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Luanda(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[21]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Malabo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[22]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Niamey(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[23]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Porto_Novo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[24]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Blantyre(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[25]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Bujumbura(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[26]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Gaborone(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[27]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Harare(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[28]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Kigali(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[29]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Lubumbashi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[30]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Lusaka(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[31]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Addis_Ababa(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[32]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Asmara(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[33]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Asmera(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[34]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Dar_es_Salaam(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[35]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Djibouti(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[36]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Kampala(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[37]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Mogadishu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[38]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Antananarivo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[39]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Comoro(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[40]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Mayotte(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[41]];
			}
			public static ai.greycat.std.core.TimeZone Libya(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[42]];
			}
			public static ai.greycat.std.core.TimeZone America_Atka(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[43]];
			}
			public static ai.greycat.std.core.TimeZone US_Aleutian(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[44]];
			}
			public static ai.greycat.std.core.TimeZone US_Alaska(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[45]];
			}
			public static ai.greycat.std.core.TimeZone America_Buenos_Aires(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[46]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_ComodRivadavia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[47]];
			}
			public static ai.greycat.std.core.TimeZone America_Catamarca(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[48]];
			}
			public static ai.greycat.std.core.TimeZone America_Cordoba(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[49]];
			}
			public static ai.greycat.std.core.TimeZone America_Rosario(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[50]];
			}
			public static ai.greycat.std.core.TimeZone America_Jujuy(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[51]];
			}
			public static ai.greycat.std.core.TimeZone America_Mendoza(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[52]];
			}
			public static ai.greycat.std.core.TimeZone US_Central(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[53]];
			}
			public static ai.greycat.std.core.TimeZone America_Shiprock(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[54]];
			}
			public static ai.greycat.std.core.TimeZone Navajo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[55]];
			}
			public static ai.greycat.std.core.TimeZone US_Mountain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[56]];
			}
			public static ai.greycat.std.core.TimeZone US_Michigan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[57]];
			}
			public static ai.greycat.std.core.TimeZone America_Yellowknife(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[58]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Mountain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[59]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Atlantic(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[60]];
			}
			public static ai.greycat.std.core.TimeZone Cuba(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[61]];
			}
			public static ai.greycat.std.core.TimeZone America_Fort_Wayne(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[62]];
			}
			public static ai.greycat.std.core.TimeZone America_Indianapolis(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[63]];
			}
			public static ai.greycat.std.core.TimeZone US_East_Indiana(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[64]];
			}
			public static ai.greycat.std.core.TimeZone America_Knox_IN(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[65]];
			}
			public static ai.greycat.std.core.TimeZone US_Indiana_Starke(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[66]];
			}
			public static ai.greycat.std.core.TimeZone America_Pangnirtung(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[67]];
			}
			public static ai.greycat.std.core.TimeZone Jamaica(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[68]];
			}
			public static ai.greycat.std.core.TimeZone America_Louisville(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[69]];
			}
			public static ai.greycat.std.core.TimeZone US_Pacific(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[70]];
			}
			public static ai.greycat.std.core.TimeZone Brazil_West(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[71]];
			}
			public static ai.greycat.std.core.TimeZone Mexico_BajaSur(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[72]];
			}
			public static ai.greycat.std.core.TimeZone Mexico_General(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[73]];
			}
			public static ai.greycat.std.core.TimeZone US_Eastern(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[74]];
			}
			public static ai.greycat.std.core.TimeZone Brazil_DeNoronha(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[75]];
			}
			public static ai.greycat.std.core.TimeZone America_Godthab(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[76]];
			}
			public static ai.greycat.std.core.TimeZone America_Atikokan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[77]];
			}
			public static ai.greycat.std.core.TimeZone America_Cayman(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[78]];
			}
			public static ai.greycat.std.core.TimeZone America_Coral_Harbour(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[79]];
			}
			public static ai.greycat.std.core.TimeZone America_Creston(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[80]];
			}
			public static ai.greycat.std.core.TimeZone US_Arizona(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[81]];
			}
			public static ai.greycat.std.core.TimeZone America_Anguilla(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[82]];
			}
			public static ai.greycat.std.core.TimeZone America_Antigua(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[83]];
			}
			public static ai.greycat.std.core.TimeZone America_Aruba(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[84]];
			}
			public static ai.greycat.std.core.TimeZone America_Blanc_Sablon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[85]];
			}
			public static ai.greycat.std.core.TimeZone America_Curacao(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[86]];
			}
			public static ai.greycat.std.core.TimeZone America_Dominica(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[87]];
			}
			public static ai.greycat.std.core.TimeZone America_Grenada(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[88]];
			}
			public static ai.greycat.std.core.TimeZone America_Guadeloupe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[89]];
			}
			public static ai.greycat.std.core.TimeZone America_Kralendijk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[90]];
			}
			public static ai.greycat.std.core.TimeZone America_Lower_Princes(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[91]];
			}
			public static ai.greycat.std.core.TimeZone America_Marigot(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[92]];
			}
			public static ai.greycat.std.core.TimeZone America_Montserrat(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[93]];
			}
			public static ai.greycat.std.core.TimeZone America_Port_of_Spain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[94]];
			}
			public static ai.greycat.std.core.TimeZone America_St_Barthelemy(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[95]];
			}
			public static ai.greycat.std.core.TimeZone America_St_Kitts(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[96]];
			}
			public static ai.greycat.std.core.TimeZone America_St_Lucia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[97]];
			}
			public static ai.greycat.std.core.TimeZone America_St_Thomas(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[98]];
			}
			public static ai.greycat.std.core.TimeZone America_St_Vincent(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[99]];
			}
			public static ai.greycat.std.core.TimeZone America_Tortola(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[100]];
			}
			public static ai.greycat.std.core.TimeZone America_Virgin(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[101]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Saskatchewan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[102]];
			}
			public static ai.greycat.std.core.TimeZone America_Porto_Acre(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[103]];
			}
			public static ai.greycat.std.core.TimeZone Brazil_Acre(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[104]];
			}
			public static ai.greycat.std.core.TimeZone Chile_Continental(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[105]];
			}
			public static ai.greycat.std.core.TimeZone Brazil_East(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[106]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Newfoundland(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[107]];
			}
			public static ai.greycat.std.core.TimeZone America_Ensenada(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[108]];
			}
			public static ai.greycat.std.core.TimeZone America_Santa_Isabel(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[109]];
			}
			public static ai.greycat.std.core.TimeZone Mexico_BajaNorte(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[110]];
			}
			public static ai.greycat.std.core.TimeZone America_Montreal(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[111]];
			}
			public static ai.greycat.std.core.TimeZone America_Nassau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[112]];
			}
			public static ai.greycat.std.core.TimeZone America_Nipigon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[113]];
			}
			public static ai.greycat.std.core.TimeZone America_Thunder_Bay(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[114]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Eastern(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[115]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Pacific(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[116]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Yukon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[117]];
			}
			public static ai.greycat.std.core.TimeZone America_Rainy_River(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[118]];
			}
			public static ai.greycat.std.core.TimeZone Canada_Central(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[119]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Ashkhabad(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[120]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Phnom_Penh(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[121]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Vientiane(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[122]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Christmas(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[123]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Dacca(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[124]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Muscat(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[125]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Mahe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[126]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Reunion(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[127]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Saigon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[128]];
			}
			public static ai.greycat.std.core.TimeZone Hongkong(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[129]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Tel_Aviv(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[130]];
			}
			public static ai.greycat.std.core.TimeZone Israel(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[131]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Katmandu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[132]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Calcutta(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[133]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Brunei(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[134]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Macao(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[135]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Ujung_Pandang(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[136]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Nicosia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[137]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Bahrain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[138]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Syowa(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[139]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Aden(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[140]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kuwait(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[141]];
			}
			public static ai.greycat.std.core.TimeZone ROK(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[142]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Chongqing(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[143]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Chungking(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[144]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Harbin(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[145]];
			}
			public static ai.greycat.std.core.TimeZone PRC(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[146]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kuala_Lumpur(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[147]];
			}
			public static ai.greycat.std.core.TimeZone Singapore(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[148]];
			}
			public static ai.greycat.std.core.TimeZone ROC(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[149]];
			}
			public static ai.greycat.std.core.TimeZone Iran(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[150]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Thimbu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[151]];
			}
			public static ai.greycat.std.core.TimeZone Japan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[152]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Ulan_Bator(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[153]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Vostok(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[154]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kashgar(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[155]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Rangoon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[156]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Cocos(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[157]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Faeroe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[158]];
			}
			public static ai.greycat.std.core.TimeZone Australia_South(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[159]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Queensland(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[160]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Yancowinna(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[161]];
			}
			public static ai.greycat.std.core.TimeZone Australia_North(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[162]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Currie(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[163]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Tasmania(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[164]];
			}
			public static ai.greycat.std.core.TimeZone Australia_LHI(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[165]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Victoria(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[166]];
			}
			public static ai.greycat.std.core.TimeZone Australia_West(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[167]];
			}
			public static ai.greycat.std.core.TimeZone Australia_ACT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[168]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Canberra(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[169]];
			}
			public static ai.greycat.std.core.TimeZone Australia_NSW(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[170]];
			}
			public static ai.greycat.std.core.TimeZone GMT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[171]];
			}
			public static ai.greycat.std.core.TimeZone GMTx0(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[172]];
			}
			public static ai.greycat.std.core.TimeZone GMT_0(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[173]];
			}
			public static ai.greycat.std.core.TimeZone GMT0(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[174]];
			}
			public static ai.greycat.std.core.TimeZone Greenwich(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[175]];
			}
			public static ai.greycat.std.core.TimeZone UCT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[176]];
			}
			public static ai.greycat.std.core.TimeZone UTC(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[177]];
			}
			public static ai.greycat.std.core.TimeZone Universal(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[178]];
			}
			public static ai.greycat.std.core.TimeZone Zulu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[179]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Ljubljana(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[180]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Podgorica(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[181]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Sarajevo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[182]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Skopje(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[183]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Zagreb(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[184]];
			}
			public static ai.greycat.std.core.TimeZone Arctic_Longyearbyen(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[185]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Jan_Mayen(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[186]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Copenhagen(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[187]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Oslo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[188]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Stockholm(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[189]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Amsterdam(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[190]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Luxembourg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[191]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Tiraspol(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[192]];
			}
			public static ai.greycat.std.core.TimeZone Eire(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[193]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Mariehamn(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[194]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Istanbul(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[195]];
			}
			public static ai.greycat.std.core.TimeZone Turkey(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[196]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Kiev(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[197]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Uzhgorod(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[198]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Zaporozhye(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[199]];
			}
			public static ai.greycat.std.core.TimeZone Portugal(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[200]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Belfast(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[201]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Guernsey(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[202]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Isle_of_Man(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[203]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Jersey(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[204]];
			}
			public static ai.greycat.std.core.TimeZone GB(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[205]];
			}
			public static ai.greycat.std.core.TimeZone GB_Eire(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[206]];
			}
			public static ai.greycat.std.core.TimeZone W_SU(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[207]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Monaco(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[208]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Bratislava(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[209]];
			}
			public static ai.greycat.std.core.TimeZone Europe_San_Marino(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[210]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Vatican(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[211]];
			}
			public static ai.greycat.std.core.TimeZone Poland(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[212]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Busingen(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[213]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Vaduz(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[214]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Kerguelen(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[215]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_McMurdo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[216]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_South_Pole(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[217]];
			}
			public static ai.greycat.std.core.TimeZone NZ(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[218]];
			}
			public static ai.greycat.std.core.TimeZone NZ_CHAT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[219]];
			}
			public static ai.greycat.std.core.TimeZone Chile_EasterIsland(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[220]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Pohnpei(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[221]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Ponape(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[222]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Saipan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[223]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Johnston(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[224]];
			}
			public static ai.greycat.std.core.TimeZone US_Hawaii(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[225]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Enderbury(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[226]];
			}
			public static ai.greycat.std.core.TimeZone Kwajalein(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[227]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Midway(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[228]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Samoa(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[229]];
			}
			public static ai.greycat.std.core.TimeZone US_Samoa(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[230]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_DumontDUrville(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[231]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Chuuk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[232]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Truk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[233]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Yap(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[234]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Funafuti(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[235]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Majuro(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[236]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Wake(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[237]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Wallis(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[238]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Abidjan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[239]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Algiers(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[240]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Bissau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[241]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Cairo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[242]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Casablanca(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[243]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Ceuta(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[244]];
			}
			public static ai.greycat.std.core.TimeZone Africa_El_Aaiun(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[245]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Johannesburg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[246]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Juba(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[247]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Khartoum(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[248]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Lagos(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[249]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Maputo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[250]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Monrovia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[251]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Nairobi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[252]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Ndjamena(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[253]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Sao_Tome(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[254]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Tripoli(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[255]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Tunis(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[256]];
			}
			public static ai.greycat.std.core.TimeZone Africa_Windhoek(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[257]];
			}
			public static ai.greycat.std.core.TimeZone America_Adak(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[258]];
			}
			public static ai.greycat.std.core.TimeZone America_Anchorage(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[259]];
			}
			public static ai.greycat.std.core.TimeZone America_Araguaina(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[260]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Buenos_Aires(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[261]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Catamarca(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[262]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Cordoba(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[263]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Jujuy(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[264]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_La_Rioja(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[265]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Mendoza(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[266]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Rio_Gallegos(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[267]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Salta(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[268]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_San_Juan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[269]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_San_Luis(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[270]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Tucuman(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[271]];
			}
			public static ai.greycat.std.core.TimeZone America_Argentina_Ushuaia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[272]];
			}
			public static ai.greycat.std.core.TimeZone America_Asuncion(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[273]];
			}
			public static ai.greycat.std.core.TimeZone America_Bahia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[274]];
			}
			public static ai.greycat.std.core.TimeZone America_Bahia_Banderas(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[275]];
			}
			public static ai.greycat.std.core.TimeZone America_Barbados(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[276]];
			}
			public static ai.greycat.std.core.TimeZone America_Belem(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[277]];
			}
			public static ai.greycat.std.core.TimeZone America_Belize(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[278]];
			}
			public static ai.greycat.std.core.TimeZone America_Boa_Vista(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[279]];
			}
			public static ai.greycat.std.core.TimeZone America_Bogota(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[280]];
			}
			public static ai.greycat.std.core.TimeZone America_Boise(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[281]];
			}
			public static ai.greycat.std.core.TimeZone America_Cambridge_Bay(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[282]];
			}
			public static ai.greycat.std.core.TimeZone America_Campo_Grande(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[283]];
			}
			public static ai.greycat.std.core.TimeZone America_Cancun(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[284]];
			}
			public static ai.greycat.std.core.TimeZone America_Caracas(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[285]];
			}
			public static ai.greycat.std.core.TimeZone America_Cayenne(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[286]];
			}
			public static ai.greycat.std.core.TimeZone America_Chicago(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[287]];
			}
			public static ai.greycat.std.core.TimeZone America_Chihuahua(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[288]];
			}
			public static ai.greycat.std.core.TimeZone America_Ciudad_Juarez(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[289]];
			}
			public static ai.greycat.std.core.TimeZone America_Costa_Rica(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[290]];
			}
			public static ai.greycat.std.core.TimeZone America_Cuiaba(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[291]];
			}
			public static ai.greycat.std.core.TimeZone America_Danmarkshavn(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[292]];
			}
			public static ai.greycat.std.core.TimeZone America_Dawson(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[293]];
			}
			public static ai.greycat.std.core.TimeZone America_Dawson_Creek(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[294]];
			}
			public static ai.greycat.std.core.TimeZone America_Denver(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[295]];
			}
			public static ai.greycat.std.core.TimeZone America_Detroit(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[296]];
			}
			public static ai.greycat.std.core.TimeZone America_Edmonton(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[297]];
			}
			public static ai.greycat.std.core.TimeZone America_Eirunepe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[298]];
			}
			public static ai.greycat.std.core.TimeZone America_El_Salvador(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[299]];
			}
			public static ai.greycat.std.core.TimeZone America_Fort_Nelson(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[300]];
			}
			public static ai.greycat.std.core.TimeZone America_Fortaleza(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[301]];
			}
			public static ai.greycat.std.core.TimeZone America_Glace_Bay(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[302]];
			}
			public static ai.greycat.std.core.TimeZone America_Goose_Bay(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[303]];
			}
			public static ai.greycat.std.core.TimeZone America_Grand_Turk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[304]];
			}
			public static ai.greycat.std.core.TimeZone America_Guatemala(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[305]];
			}
			public static ai.greycat.std.core.TimeZone America_Guayaquil(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[306]];
			}
			public static ai.greycat.std.core.TimeZone America_Guyana(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[307]];
			}
			public static ai.greycat.std.core.TimeZone America_Halifax(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[308]];
			}
			public static ai.greycat.std.core.TimeZone America_Havana(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[309]];
			}
			public static ai.greycat.std.core.TimeZone America_Hermosillo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[310]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Indianapolis(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[311]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Knox(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[312]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Marengo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[313]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Petersburg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[314]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Tell_City(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[315]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Vevay(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[316]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Vincennes(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[317]];
			}
			public static ai.greycat.std.core.TimeZone America_Indiana_Winamac(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[318]];
			}
			public static ai.greycat.std.core.TimeZone America_Inuvik(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[319]];
			}
			public static ai.greycat.std.core.TimeZone America_Iqaluit(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[320]];
			}
			public static ai.greycat.std.core.TimeZone America_Jamaica(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[321]];
			}
			public static ai.greycat.std.core.TimeZone America_Juneau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[322]];
			}
			public static ai.greycat.std.core.TimeZone America_Kentucky_Louisville(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[323]];
			}
			public static ai.greycat.std.core.TimeZone America_Kentucky_Monticello(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[324]];
			}
			public static ai.greycat.std.core.TimeZone America_La_Paz(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[325]];
			}
			public static ai.greycat.std.core.TimeZone America_Lima(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[326]];
			}
			public static ai.greycat.std.core.TimeZone America_Los_Angeles(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[327]];
			}
			public static ai.greycat.std.core.TimeZone America_Maceio(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[328]];
			}
			public static ai.greycat.std.core.TimeZone America_Managua(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[329]];
			}
			public static ai.greycat.std.core.TimeZone America_Manaus(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[330]];
			}
			public static ai.greycat.std.core.TimeZone America_Martinique(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[331]];
			}
			public static ai.greycat.std.core.TimeZone America_Matamoros(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[332]];
			}
			public static ai.greycat.std.core.TimeZone America_Mazatlan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[333]];
			}
			public static ai.greycat.std.core.TimeZone America_Menominee(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[334]];
			}
			public static ai.greycat.std.core.TimeZone America_Merida(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[335]];
			}
			public static ai.greycat.std.core.TimeZone America_Metlakatla(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[336]];
			}
			public static ai.greycat.std.core.TimeZone America_Mexico_City(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[337]];
			}
			public static ai.greycat.std.core.TimeZone America_Miquelon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[338]];
			}
			public static ai.greycat.std.core.TimeZone America_Moncton(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[339]];
			}
			public static ai.greycat.std.core.TimeZone America_Monterrey(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[340]];
			}
			public static ai.greycat.std.core.TimeZone America_Montevideo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[341]];
			}
			public static ai.greycat.std.core.TimeZone America_New_York(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[342]];
			}
			public static ai.greycat.std.core.TimeZone America_Nome(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[343]];
			}
			public static ai.greycat.std.core.TimeZone America_Noronha(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[344]];
			}
			public static ai.greycat.std.core.TimeZone America_North_Dakota_Beulah(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[345]];
			}
			public static ai.greycat.std.core.TimeZone America_North_Dakota_Center(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[346]];
			}
			public static ai.greycat.std.core.TimeZone America_North_Dakota_New_Salem(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[347]];
			}
			public static ai.greycat.std.core.TimeZone America_Nuuk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[348]];
			}
			public static ai.greycat.std.core.TimeZone America_Ojinaga(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[349]];
			}
			public static ai.greycat.std.core.TimeZone America_Panama(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[350]];
			}
			public static ai.greycat.std.core.TimeZone America_Paramaribo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[351]];
			}
			public static ai.greycat.std.core.TimeZone America_Phoenix(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[352]];
			}
			public static ai.greycat.std.core.TimeZone America_Port_au_Prince(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[353]];
			}
			public static ai.greycat.std.core.TimeZone America_Porto_Velho(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[354]];
			}
			public static ai.greycat.std.core.TimeZone America_Puerto_Rico(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[355]];
			}
			public static ai.greycat.std.core.TimeZone America_Punta_Arenas(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[356]];
			}
			public static ai.greycat.std.core.TimeZone America_Rankin_Inlet(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[357]];
			}
			public static ai.greycat.std.core.TimeZone America_Recife(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[358]];
			}
			public static ai.greycat.std.core.TimeZone America_Regina(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[359]];
			}
			public static ai.greycat.std.core.TimeZone America_Resolute(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[360]];
			}
			public static ai.greycat.std.core.TimeZone America_Rio_Branco(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[361]];
			}
			public static ai.greycat.std.core.TimeZone America_Santarem(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[362]];
			}
			public static ai.greycat.std.core.TimeZone America_Santiago(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[363]];
			}
			public static ai.greycat.std.core.TimeZone America_Santo_Domingo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[364]];
			}
			public static ai.greycat.std.core.TimeZone America_Sao_Paulo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[365]];
			}
			public static ai.greycat.std.core.TimeZone America_Scoresbysund(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[366]];
			}
			public static ai.greycat.std.core.TimeZone America_Sitka(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[367]];
			}
			public static ai.greycat.std.core.TimeZone America_St_Johns(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[368]];
			}
			public static ai.greycat.std.core.TimeZone America_Swift_Current(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[369]];
			}
			public static ai.greycat.std.core.TimeZone America_Tegucigalpa(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[370]];
			}
			public static ai.greycat.std.core.TimeZone America_Thule(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[371]];
			}
			public static ai.greycat.std.core.TimeZone America_Tijuana(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[372]];
			}
			public static ai.greycat.std.core.TimeZone America_Toronto(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[373]];
			}
			public static ai.greycat.std.core.TimeZone America_Vancouver(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[374]];
			}
			public static ai.greycat.std.core.TimeZone America_Whitehorse(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[375]];
			}
			public static ai.greycat.std.core.TimeZone America_Winnipeg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[376]];
			}
			public static ai.greycat.std.core.TimeZone America_Yakutat(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[377]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Casey(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[378]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Davis(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[379]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Macquarie(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[380]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Mawson(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[381]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Palmer(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[382]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Rothera(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[383]];
			}
			public static ai.greycat.std.core.TimeZone Antarctica_Troll(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[384]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Almaty(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[385]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Amman(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[386]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Anadyr(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[387]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Aqtau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[388]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Aqtobe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[389]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Ashgabat(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[390]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Atyrau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[391]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Baghdad(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[392]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Baku(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[393]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Bangkok(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[394]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Barnaul(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[395]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Beirut(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[396]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Bishkek(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[397]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Chita(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[398]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Choibalsan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[399]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Colombo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[400]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Damascus(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[401]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Dhaka(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[402]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Dili(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[403]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Dubai(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[404]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Dushanbe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[405]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Famagusta(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[406]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Gaza(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[407]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Hebron(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[408]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Ho_Chi_Minh(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[409]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Hong_Kong(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[410]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Hovd(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[411]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Irkutsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[412]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Jakarta(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[413]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Jayapura(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[414]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Jerusalem(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[415]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kabul(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[416]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kamchatka(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[417]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Karachi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[418]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kathmandu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[419]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Khandyga(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[420]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kolkata(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[421]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Krasnoyarsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[422]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Kuching(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[423]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Macau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[424]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Magadan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[425]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Makassar(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[426]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Manila(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[427]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Nicosia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[428]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Novokuznetsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[429]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Novosibirsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[430]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Omsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[431]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Oral(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[432]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Pontianak(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[433]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Pyongyang(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[434]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Qatar(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[435]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Qostanay(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[436]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Qyzylorda(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[437]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Riyadh(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[438]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Sakhalin(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[439]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Samarkand(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[440]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Seoul(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[441]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Shanghai(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[442]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Singapore(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[443]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Srednekolymsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[444]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Taipei(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[445]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Tashkent(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[446]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Tbilisi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[447]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Tehran(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[448]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Thimphu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[449]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Tokyo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[450]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Tomsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[451]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Ulaanbaatar(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[452]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Urumqi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[453]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Ust_Nera(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[454]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Vladivostok(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[455]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Yakutsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[456]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Yangon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[457]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Yekaterinburg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[458]];
			}
			public static ai.greycat.std.core.TimeZone Asia_Yerevan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[459]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Azores(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[460]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Bermuda(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[461]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Canary(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[462]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Cape_Verde(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[463]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Faroe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[464]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Madeira(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[465]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_South_Georgia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[466]];
			}
			public static ai.greycat.std.core.TimeZone Atlantic_Stanley(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[467]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Adelaide(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[468]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Brisbane(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[469]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Broken_Hill(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[470]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Darwin(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[471]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Eucla(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[472]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Hobart(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[473]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Lindeman(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[474]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Lord_Howe(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[475]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Melbourne(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[476]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Perth(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[477]];
			}
			public static ai.greycat.std.core.TimeZone Australia_Sydney(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[478]];
			}
			public static ai.greycat.std.core.TimeZone CET(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[479]];
			}
			public static ai.greycat.std.core.TimeZone CST6CDT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[480]];
			}
			public static ai.greycat.std.core.TimeZone EET(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[481]];
			}
			public static ai.greycat.std.core.TimeZone EST(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[482]];
			}
			public static ai.greycat.std.core.TimeZone EST5EDT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[483]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Andorra(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[484]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Astrakhan(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[485]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Athens(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[486]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Belgrade(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[487]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Berlin(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[488]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Brussels(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[489]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Bucharest(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[490]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Budapest(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[491]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Chisinau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[492]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Dublin(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[493]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Gibraltar(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[494]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Helsinki(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[495]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Istanbul(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[496]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Kaliningrad(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[497]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Kirov(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[498]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Kyiv(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[499]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Lisbon(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[500]];
			}
			public static ai.greycat.std.core.TimeZone Europe_London(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[501]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Madrid(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[502]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Malta(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[503]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Minsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[504]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Moscow(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[505]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Paris(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[506]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Prague(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[507]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Riga(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[508]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Rome(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[509]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Samara(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[510]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Saratov(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[511]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Simferopol(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[512]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Sofia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[513]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Tallinn(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[514]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Tirane(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[515]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Ulyanovsk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[516]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Vienna(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[517]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Vilnius(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[518]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Volgograd(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[519]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Warsaw(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[520]];
			}
			public static ai.greycat.std.core.TimeZone Europe_Zurich(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[521]];
			}
			public static ai.greycat.std.core.TimeZone Factory(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[522]];
			}
			public static ai.greycat.std.core.TimeZone HST(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[523]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Chagos(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[524]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Maldives(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[525]];
			}
			public static ai.greycat.std.core.TimeZone Indian_Mauritius(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[526]];
			}
			public static ai.greycat.std.core.TimeZone MET(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[527]];
			}
			public static ai.greycat.std.core.TimeZone MST(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[528]];
			}
			public static ai.greycat.std.core.TimeZone MST7MDT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[529]];
			}
			public static ai.greycat.std.core.TimeZone PST8PDT(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[530]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Apia(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[531]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Auckland(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[532]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Bougainville(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[533]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Chatham(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[534]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Easter(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[535]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Efate(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[536]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Fakaofo(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[537]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Fiji(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[538]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Galapagos(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[539]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Gambier(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[540]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Guadalcanal(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[541]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Guam(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[542]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Honolulu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[543]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Kanton(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[544]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Kiritimati(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[545]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Kosrae(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[546]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Kwajalein(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[547]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Marquesas(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[548]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Nauru(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[549]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Niue(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[550]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Norfolk(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[551]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Noumea(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[552]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Pago_Pago(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[553]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Palau(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[554]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Pitcairn(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[555]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Port_Moresby(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[556]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Rarotonga(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[557]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Tahiti(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[558]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Tarawa(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[559]];
			}
			public static ai.greycat.std.core.TimeZone Pacific_Tongatapu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[560]];
			}
			public static ai.greycat.std.core.TimeZone WET(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[28];
				return (ai.greycat.std.core.TimeZone) t.enum_values[t.generated_offsets[561]];
			}
			public static TimeZone create(ai.greycat.GreyCat greycat){
				return new TimeZone(greycat.libs_by_name.get(ai.greycat.std.name).mapped[28]);
			}
		}
		public static final class nodeGeo<T> extends ai.greycat.std_n.core.nodeGeo {
			public static final java.lang.String name = "core::nodeGeo";
			private nodeGeo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static nodeGeo create(ai.greycat.GreyCat greycat){
				return new nodeGeo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[29]);
			}
		}
		public static final class ti3d extends ai.greycat.std_n.core.ti3d {
			public static final java.lang.String name = "core::ti3d";
			private ti3d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ti3d create(ai.greycat.GreyCat greycat){
				return new ti3d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[30]);
			}
		}
		public static final class Tuple<T,U> extends GreyCat.Object {
			public static final java.lang.String name = "core::Tuple";
			private Tuple(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Object x(){
				return super.get(super.type.generated_offsets[0]);
			}
			public void set_x(java.lang.Object v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Object y(){
				return super.get(super.type.generated_offsets[1]);
			}
			public void set_y(java.lang.Object v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static Tuple create(ai.greycat.GreyCat greycat, java.lang.Object x, java.lang.Object y){
				return new Tuple(greycat.libs_by_name.get(ai.greycat.std.name).mapped[31], x, y);
			}
		}
		public static final class nodeIndex<K,V> extends ai.greycat.std_n.core.nodeIndex {
			public static final java.lang.String name = "core::nodeIndex";
			private nodeIndex(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static nodeIndex create(ai.greycat.GreyCat greycat){
				return new nodeIndex(greycat.libs_by_name.get(ai.greycat.std.name).mapped[32]);
			}
		}
		public static final class tf2d extends ai.greycat.std_n.core.tf2d {
			public static final java.lang.String name = "core::tf2d";
			private tf2d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static tf2d create(ai.greycat.GreyCat greycat){
				return new tf2d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[33]);
			}
		}
		public static final class GeoBox extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoBox";
			private GeoBox(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.geo sw(){
				return (ai.greycat.std.core.geo)super.get(super.type.generated_offsets[0]);
			}
			public void set_sw(ai.greycat.std.core.geo v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.geo ne(){
				return (ai.greycat.std.core.geo)super.get(super.type.generated_offsets[1]);
			}
			public void set_ne(ai.greycat.std.core.geo v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static GeoBox create(ai.greycat.GreyCat greycat, ai.greycat.std.core.geo sw, ai.greycat.std.core.geo ne){
				return new GeoBox(greycat.libs_by_name.get(ai.greycat.std.name).mapped[34], sw, ne);
			}
		}
		public static final class Array<T> extends ai.greycat.std_n.core.Array {
			public static final java.lang.String name = "core::Array";
			private Array(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Array create(ai.greycat.GreyCat greycat){
				return new Array(greycat.libs_by_name.get(ai.greycat.std.name).mapped[35]);
			}
		}
		public static final class String extends ai.greycat.std_n.core.String {
			public static final java.lang.String name = "core::String";
			private String(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static String create(ai.greycat.GreyCat greycat){
				return new String(greycat.libs_by_name.get(ai.greycat.std.name).mapped[36]);
			}
		}
		public static final class ti5d extends ai.greycat.std_n.core.ti5d {
			public static final java.lang.String name = "core::ti5d";
			private ti5d(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ti5d create(ai.greycat.GreyCat greycat){
				return new ti5d(greycat.libs_by_name.get(ai.greycat.std.name).mapped[37]);
			}
		}
	}
	public static final class util {
		public static final class SlidingWindow extends ai.greycat.std_n.util.SlidingWindow {
			public static final java.lang.String name = "util::SlidingWindow";
			private SlidingWindow(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static SlidingWindow create(ai.greycat.GreyCat greycat){
				return new SlidingWindow(greycat.libs_by_name.get(ai.greycat.std.name).mapped[38]);
			}
		}
		public static final class Random extends GreyCat.Object {
			public static final java.lang.String name = "util::Random";
			private Random(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long seed(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_seed(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double v(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_v(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static Random create(ai.greycat.GreyCat greycat, java.lang.Long seed, java.lang.Double v){
				return new Random(greycat.libs_by_name.get(ai.greycat.std.name).mapped[39], seed, v);
			}
		}
		public static final class TimeWindow extends ai.greycat.std_n.util.TimeWindow {
			public static final java.lang.String name = "util::TimeWindow";
			private TimeWindow(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static TimeWindow create(ai.greycat.GreyCat greycat){
				return new TimeWindow(greycat.libs_by_name.get(ai.greycat.std.name).mapped[40]);
			}
		}
		public static final class HistogramInt extends ai.greycat.std_n.util.HistogramInt {
			public static final java.lang.String name = "util::HistogramInt";
			private HistogramInt(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static HistogramInt create(ai.greycat.GreyCat greycat){
				return new HistogramInt(greycat.libs_by_name.get(ai.greycat.std.name).mapped[41]);
			}
		}
		public static final class ProgressTracker extends GreyCat.Object {
			public static final java.lang.String name = "util::ProgressTracker";
			private ProgressTracker(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.time start(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[0]);
			}
			public void set_start(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long total(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_total(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long counter(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_counter(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.duration duration(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[3]);
			}
			public void set_duration(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double progress(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_progress(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Double speed(){
				return (java.lang.Double)super.get(super.type.generated_offsets[5]);
			}
			public void set_speed(java.lang.Double v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.duration remaining(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[6]);
			}
			public void set_remaining(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static ProgressTracker create(ai.greycat.GreyCat greycat, ai.greycat.std.core.time start, java.lang.Long total, java.lang.Long counter, ai.greycat.std.core.duration duration, java.lang.Double progress, java.lang.Double speed, ai.greycat.std.core.duration remaining){
				return new ProgressTracker(greycat.libs_by_name.get(ai.greycat.std.name).mapped[42], start, total, counter, duration, progress, speed, remaining);
			}
		}
		public static final class BoxPlotFloat extends GreyCat.Object {
			public static final java.lang.String name = "util::BoxPlotFloat";
			private BoxPlotFloat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double min(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_min(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double max(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_max(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double whiskerLow(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_whiskerLow(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double whiskerHigh(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_whiskerHigh(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double percentile1(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_percentile1(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Double percentile5(){
				return (java.lang.Double)super.get(super.type.generated_offsets[5]);
			}
			public void set_percentile5(java.lang.Double v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Double percentile25(){
				return (java.lang.Double)super.get(super.type.generated_offsets[6]);
			}
			public void set_percentile25(java.lang.Double v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Double percentile50(){
				return (java.lang.Double)super.get(super.type.generated_offsets[7]);
			}
			public void set_percentile50(java.lang.Double v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Double percentile75(){
				return (java.lang.Double)super.get(super.type.generated_offsets[8]);
			}
			public void set_percentile75(java.lang.Double v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Double percentile95(){
				return (java.lang.Double)super.get(super.type.generated_offsets[9]);
			}
			public void set_percentile95(java.lang.Double v){
				super.set(super.type.generated_offsets[9],v);
			}
			public java.lang.Double percentile99(){
				return (java.lang.Double)super.get(super.type.generated_offsets[10]);
			}
			public void set_percentile99(java.lang.Double v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Long countOutliersLow(){
				return (java.lang.Long)super.get(super.type.generated_offsets[11]);
			}
			public void set_countOutliersLow(java.lang.Long v){
				super.set(super.type.generated_offsets[11],v);
			}
			public java.lang.Long countOutliersHigh(){
				return (java.lang.Long)super.get(super.type.generated_offsets[12]);
			}
			public void set_countOutliersHigh(java.lang.Long v){
				super.set(super.type.generated_offsets[12],v);
			}
			public java.lang.Double percentageOutliersLow(){
				return (java.lang.Double)super.get(super.type.generated_offsets[13]);
			}
			public void set_percentageOutliersLow(java.lang.Double v){
				super.set(super.type.generated_offsets[13],v);
			}
			public java.lang.Double percentageOutliersHigh(){
				return (java.lang.Double)super.get(super.type.generated_offsets[14]);
			}
			public void set_percentageOutliersHigh(java.lang.Double v){
				super.set(super.type.generated_offsets[14],v);
			}
			public java.lang.Double sum(){
				return (java.lang.Double)super.get(super.type.generated_offsets[15]);
			}
			public void set_sum(java.lang.Double v){
				super.set(super.type.generated_offsets[15],v);
			}
			public java.lang.Double avg(){
				return (java.lang.Double)super.get(super.type.generated_offsets[16]);
			}
			public void set_avg(java.lang.Double v){
				super.set(super.type.generated_offsets[16],v);
			}
			public java.lang.Double std(){
				return (java.lang.Double)super.get(super.type.generated_offsets[17]);
			}
			public void set_std(java.lang.Double v){
				super.set(super.type.generated_offsets[17],v);
			}
			public java.lang.Long size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[18]);
			}
			public void set_size(java.lang.Long v){
				super.set(super.type.generated_offsets[18],v);
			}
			public static BoxPlotFloat create(ai.greycat.GreyCat greycat, java.lang.Double min, java.lang.Double max, java.lang.Double whiskerLow, java.lang.Double whiskerHigh, java.lang.Double percentile1, java.lang.Double percentile5, java.lang.Double percentile25, java.lang.Double percentile50, java.lang.Double percentile75, java.lang.Double percentile95, java.lang.Double percentile99, java.lang.Long countOutliersLow, java.lang.Long countOutliersHigh, java.lang.Double percentageOutliersLow, java.lang.Double percentageOutliersHigh, java.lang.Double sum, java.lang.Double avg, java.lang.Double std, java.lang.Long size){
				return new BoxPlotFloat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[43], min, max, whiskerLow, whiskerHigh, percentile1, percentile5, percentile25, percentile50, percentile75, percentile95, percentile99, countOutliersLow, countOutliersHigh, percentageOutliersLow, percentageOutliersHigh, sum, avg, std, size);
			}
		}
		public static final class Buffer extends ai.greycat.std_n.util.Buffer {
			public static final java.lang.String name = "util::Buffer";
			private Buffer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Buffer create(ai.greycat.GreyCat greycat){
				return new Buffer(greycat.libs_by_name.get(ai.greycat.std.name).mapped[44]);
			}
		}
		public static final class Crypto extends GreyCat.Object {
			public static final java.lang.String name = "util::Crypto";
			private Crypto(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static Crypto create(ai.greycat.GreyCat greycat){
				return new Crypto(greycat.libs_by_name.get(ai.greycat.std.name).mapped[45]);
			}
		}
		public static final class HistogramFloat extends ai.greycat.std_n.util.HistogramFloat {
			public static final java.lang.String name = "util::HistogramFloat";
			private HistogramFloat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static HistogramFloat create(ai.greycat.GreyCat greycat){
				return new HistogramFloat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[46]);
			}
		}
		public static final class Quantizer extends ai.greycat.std_n.util.Quantizer {
			public static final java.lang.String name = "util::Quantizer";
			private Quantizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Quantizer create(ai.greycat.GreyCat greycat){
				return new Quantizer(greycat.libs_by_name.get(ai.greycat.std.name).mapped[47]);
			}
		}
		public static final class Assert extends GreyCat.Object {
			public static final java.lang.String name = "util::Assert";
			private Assert(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static Assert create(ai.greycat.GreyCat greycat){
				return new Assert(greycat.libs_by_name.get(ai.greycat.std.name).mapped[48]);
			}
		}
		public static final class GaussianProfile extends ai.greycat.std_n.util.GaussianProfile {
			public static final java.lang.String name = "util::GaussianProfile";
			private GaussianProfile(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static GaussianProfile create(ai.greycat.GreyCat greycat){
				return new GaussianProfile(greycat.libs_by_name.get(ai.greycat.std.name).mapped[49]);
			}
		}
		public static final class Iban extends ai.greycat.std_n.util.Iban {
			public static final java.lang.String name = "util::Iban";
			private Iban(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Iban create(ai.greycat.GreyCat greycat){
				return new Iban(greycat.libs_by_name.get(ai.greycat.std.name).mapped[50]);
			}
		}
		public static final class BoxPlotInt extends GreyCat.Object {
			public static final java.lang.String name = "util::BoxPlotInt";
			private BoxPlotInt(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long min(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_min(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long max(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_max(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long whiskerLow(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_whiskerLow(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long whiskerHigh(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_whiskerHigh(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long percentile1(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_percentile1(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long percentile5(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_percentile5(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Long percentile25(){
				return (java.lang.Long)super.get(super.type.generated_offsets[6]);
			}
			public void set_percentile25(java.lang.Long v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long percentile50(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_percentile50(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Long percentile75(){
				return (java.lang.Long)super.get(super.type.generated_offsets[8]);
			}
			public void set_percentile75(java.lang.Long v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Long percentile95(){
				return (java.lang.Long)super.get(super.type.generated_offsets[9]);
			}
			public void set_percentile95(java.lang.Long v){
				super.set(super.type.generated_offsets[9],v);
			}
			public java.lang.Long percentile99(){
				return (java.lang.Long)super.get(super.type.generated_offsets[10]);
			}
			public void set_percentile99(java.lang.Long v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Long countOutliersLow(){
				return (java.lang.Long)super.get(super.type.generated_offsets[11]);
			}
			public void set_countOutliersLow(java.lang.Long v){
				super.set(super.type.generated_offsets[11],v);
			}
			public java.lang.Long countOutliersHigh(){
				return (java.lang.Long)super.get(super.type.generated_offsets[12]);
			}
			public void set_countOutliersHigh(java.lang.Long v){
				super.set(super.type.generated_offsets[12],v);
			}
			public java.lang.Double percentageOutliersLow(){
				return (java.lang.Double)super.get(super.type.generated_offsets[13]);
			}
			public void set_percentageOutliersLow(java.lang.Double v){
				super.set(super.type.generated_offsets[13],v);
			}
			public java.lang.Double percentageOutliersHigh(){
				return (java.lang.Double)super.get(super.type.generated_offsets[14]);
			}
			public void set_percentageOutliersHigh(java.lang.Double v){
				super.set(super.type.generated_offsets[14],v);
			}
			public java.lang.Double sum(){
				return (java.lang.Double)super.get(super.type.generated_offsets[15]);
			}
			public void set_sum(java.lang.Double v){
				super.set(super.type.generated_offsets[15],v);
			}
			public java.lang.Double avg(){
				return (java.lang.Double)super.get(super.type.generated_offsets[16]);
			}
			public void set_avg(java.lang.Double v){
				super.set(super.type.generated_offsets[16],v);
			}
			public java.lang.Double std(){
				return (java.lang.Double)super.get(super.type.generated_offsets[17]);
			}
			public void set_std(java.lang.Double v){
				super.set(super.type.generated_offsets[17],v);
			}
			public java.lang.Long size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[18]);
			}
			public void set_size(java.lang.Long v){
				super.set(super.type.generated_offsets[18],v);
			}
			public static BoxPlotInt create(ai.greycat.GreyCat greycat, java.lang.Long min, java.lang.Long max, java.lang.Long whiskerLow, java.lang.Long whiskerHigh, java.lang.Long percentile1, java.lang.Long percentile5, java.lang.Long percentile25, java.lang.Long percentile50, java.lang.Long percentile75, java.lang.Long percentile95, java.lang.Long percentile99, java.lang.Long countOutliersLow, java.lang.Long countOutliersHigh, java.lang.Double percentageOutliersLow, java.lang.Double percentageOutliersHigh, java.lang.Double sum, java.lang.Double avg, java.lang.Double std, java.lang.Long size){
				return new BoxPlotInt(greycat.libs_by_name.get(ai.greycat.std.name).mapped[51], min, max, whiskerLow, whiskerHigh, percentile1, percentile5, percentile25, percentile50, percentile75, percentile95, percentile99, countOutliersLow, countOutliersHigh, percentageOutliersLow, percentageOutliersHigh, sum, avg, std, size);
			}
		}
		public static final class Gaussian extends GreyCat.Object {
			public static final java.lang.String name = "util::Gaussian";
			private Gaussian(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double sum(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_sum(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double sum_sq(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_sum_sq(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long count(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_count(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double min(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_min(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double max(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_max(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static Gaussian create(ai.greycat.GreyCat greycat, java.lang.Double sum, java.lang.Double sum_sq, java.lang.Long count, java.lang.Double min, java.lang.Double max){
				return new Gaussian(greycat.libs_by_name.get(ai.greycat.std.name).mapped[52], sum, sum_sq, count, min, max);
			}
		}
		public static final class Queue<T> extends ai.greycat.std_n.util.Queue {
			public static final java.lang.String name = "util::Queue";
			private Queue(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Queue create(ai.greycat.GreyCat greycat){
				return new Queue(greycat.libs_by_name.get(ai.greycat.std.name).mapped[53]);
			}
		}
	}
	public static final class math {
		public static final class MathConstants extends GreyCat.Object {
			public static final java.lang.String name = "math::MathConstants";
			private MathConstants(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static java.lang.Double e(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double log_2e(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double log_10e(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[2];
			}
			public static java.lang.Double ln2(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[3];
			}
			public static java.lang.Double ln10(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[4];
			}
			public static java.lang.Double pi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[5];
			}
			public static java.lang.Double pi_2(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[6];
			}
			public static java.lang.Double pi_4(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[7];
			}
			public static java.lang.Double m1_pi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[8];
			}
			public static java.lang.Double m2_pi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[9];
			}
			public static java.lang.Double m2_sqrt_pi(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[10];
			}
			public static java.lang.Double sqrt2(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[11];
			}
			public static java.lang.Double sqrt1_2(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[54];
				return (java.lang.Double) t.static_values[12];
			}
			public static MathConstants create(ai.greycat.GreyCat greycat){
				return new MathConstants(greycat.libs_by_name.get(ai.greycat.std.name).mapped[54]);
			}
		}
	}
	public static final class runtime {
		public static final class Task extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Task";
			private Task(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long user_id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_user_id(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long task_id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_task_id(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String mod(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_mod(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String type(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_type(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.String fun(){
				return (java.lang.String)super.get(super.type.generated_offsets[4]);
			}
			public void set_fun(java.lang.String v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.time creation(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[5]);
			}
			public void set_creation(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.runtime.TaskStatus status(){
				return (ai.greycat.std.runtime.TaskStatus)super.get(super.type.generated_offsets[6]);
			}
			public void set_status(ai.greycat.std.runtime.TaskStatus v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static ai.greycat.std.core.Array<ai.greycat.std.runtime.TaskInfo> running(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.TaskInfo>) ai.greycat.GreyCat.call(greycat,"runtime::Task::running");
			}
			public static ai.greycat.std.core.Array<ai.greycat.std.runtime.Task> history(ai.greycat.GreyCat greycat,java.lang.Long offset,java.lang.Long max) throws java.io.IOException {
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.Task>) ai.greycat.GreyCat.call(greycat,"runtime::Task::history", offset, max);
			}
			public static java.lang.Boolean cancel(ai.greycat.GreyCat greycat,java.lang.Long task_id) throws java.io.IOException {
				return (java.lang.Boolean) ai.greycat.GreyCat.call(greycat,"runtime::Task::cancel", task_id);
			}
			public static ai.greycat.std.runtime.TaskInfo info(ai.greycat.GreyCat greycat,java.lang.Long user_id,java.lang.Long task_id) throws java.io.IOException {
				return (ai.greycat.std.runtime.TaskInfo) ai.greycat.GreyCat.call(greycat,"runtime::Task::info", user_id, task_id);
			}
			public static Task create(ai.greycat.GreyCat greycat, java.lang.Long user_id, java.lang.Long task_id, java.lang.String mod, java.lang.String type, java.lang.String fun, ai.greycat.std.core.time creation, ai.greycat.std.runtime.TaskStatus status){
				return new Task(greycat.libs_by_name.get(ai.greycat.std.name).mapped[55], user_id, task_id, mod, type, fun, creation, status);
			}
		}
		public static final class UserCredential extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserCredential";
			private UserCredential(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long offset(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_offset(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String pass(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_pass(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static UserCredential create(ai.greycat.GreyCat greycat, java.lang.Long offset, java.lang.String pass){
				return new UserCredential(greycat.libs_by_name.get(ai.greycat.std.name).mapped[56], offset, pass);
			}
		}
		public static final class SecurityPolicy extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityPolicy";
			private SecurityPolicy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> entities(){
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity>)super.get(super.type.generated_offsets[0]);
			}
			public void set_entities(ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserCredential> credentials(){
				return (ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserCredential>)super.get(super.type.generated_offsets[1]);
			}
			public void set_credentials(ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserCredential> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserRole> roles(){
				return (ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserRole>)super.get(super.type.generated_offsets[2]);
			}
			public void set_roles(ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserRole> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.runtime.SecurityFields fields(){
				return (ai.greycat.std.runtime.SecurityFields)super.get(super.type.generated_offsets[3]);
			}
			public void set_fields(ai.greycat.std.runtime.SecurityFields v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static ai.greycat.std.core.Array<java.lang.String> permissions(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<java.lang.String>) ai.greycat.GreyCat.call(greycat,"runtime::SecurityPolicy::permissions");
			}
			public static SecurityPolicy create(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> entities, ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserCredential> credentials, ai.greycat.std.core.Map<java.lang.String, ai.greycat.std.runtime.UserRole> roles, ai.greycat.std.runtime.SecurityFields fields){
				return new SecurityPolicy(greycat.libs_by_name.get(ai.greycat.std.name).mapped[57], entities, credentials, roles, fields);
			}
		}
		public static final class UserRole extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserRole";
			private UserRole(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> permissions(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[1]);
			}
			public void set_permissions(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ai.greycat.std.core.Array<ai.greycat.std.runtime.UserRole> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.UserRole>) ai.greycat.GreyCat.call(greycat,"runtime::UserRole::all");
			}
			public static void remove(ai.greycat.GreyCat greycat,java.lang.String name) throws java.io.IOException {
				ai.greycat.GreyCat.call(greycat,"runtime::UserRole::remove", name);
			}
			public static void set(ai.greycat.GreyCat greycat,ai.greycat.std.runtime.UserRole value) throws java.io.IOException {
				ai.greycat.GreyCat.call(greycat,"runtime::UserRole::set", value);
			}
			public static UserRole create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.Array<java.lang.String> permissions){
				return new UserRole(greycat.libs_by_name.get(ai.greycat.std.name).mapped[58], name, permissions);
			}
		}
		public static final class System extends GreyCat.Object {
			public static final java.lang.String name = "runtime::System";
			private System(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static System create(ai.greycat.GreyCat greycat){
				return new System(greycat.libs_by_name.get(ai.greycat.std.name).mapped[59]);
			}
		}
		public static final class SecurityFields extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityFields";
			private SecurityFields(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String email(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_email(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String first_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_first_name(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String last_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_last_name(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.Map<java.lang.String, java.lang.String> roles(){
				return (ai.greycat.std.core.Map<java.lang.String, java.lang.String>)super.get(super.type.generated_offsets[4]);
			}
			public void set_roles(ai.greycat.std.core.Map<java.lang.String, java.lang.String> v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.Map<java.lang.String, java.lang.String> groups(){
				return (ai.greycat.std.core.Map<java.lang.String, java.lang.String>)super.get(super.type.generated_offsets[5]);
			}
			public void set_groups(ai.greycat.std.core.Map<java.lang.String, java.lang.String> v){
				super.set(super.type.generated_offsets[5],v);
			}
			public static void set(ai.greycat.GreyCat greycat,ai.greycat.std.runtime.SecurityFields f) throws java.io.IOException {
				ai.greycat.GreyCat.call(greycat,"runtime::SecurityFields::set", f);
			}
			public static ai.greycat.std.runtime.SecurityFields get(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.runtime.SecurityFields) ai.greycat.GreyCat.call(greycat,"runtime::SecurityFields::get");
			}
			public static SecurityFields create(ai.greycat.GreyCat greycat, java.lang.String email, java.lang.String name, java.lang.String first_name, java.lang.String last_name, ai.greycat.std.core.Map<java.lang.String, java.lang.String> roles, ai.greycat.std.core.Map<java.lang.String, java.lang.String> groups){
				return new SecurityFields(greycat.libs_by_name.get(ai.greycat.std.name).mapped[60], email, name, first_name, last_name, roles, groups);
			}
		}
		public static final class UserGroupPolicyType extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::UserGroupPolicyType";
			private UserGroupPolicyType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.runtime.UserGroupPolicyType read(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[61];
				return (ai.greycat.std.runtime.UserGroupPolicyType) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.runtime.UserGroupPolicyType write(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[61];
				return (ai.greycat.std.runtime.UserGroupPolicyType) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.runtime.UserGroupPolicyType execute(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[61];
				return (ai.greycat.std.runtime.UserGroupPolicyType) t.enum_values[t.generated_offsets[2]];
			}
			public static UserGroupPolicyType create(ai.greycat.GreyCat greycat){
				return new UserGroupPolicyType(greycat.libs_by_name.get(ai.greycat.std.name).mapped[61]);
			}
		}
		public static final class License extends GreyCat.Object {
			public static final java.lang.String name = "runtime::License";
			private License(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.time start(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[1]);
			}
			public void set_start(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.time end(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[2]);
			}
			public void set_end(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String company(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_company(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long max_workers(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_max_workers(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long max_memory(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_max_memory(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Long extra_1(){
				return (java.lang.Long)super.get(super.type.generated_offsets[6]);
			}
			public void set_extra_1(java.lang.Long v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long extra_2(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_extra_2(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Long extra_3(){
				return (java.lang.Long)super.get(super.type.generated_offsets[8]);
			}
			public void set_extra_3(java.lang.Long v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Long extra_4(){
				return (java.lang.Long)super.get(super.type.generated_offsets[9]);
			}
			public void set_extra_4(java.lang.Long v){
				super.set(super.type.generated_offsets[9],v);
			}
			public static License create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.time start, ai.greycat.std.core.time end, java.lang.String company, java.lang.Long max_workers, java.lang.Long max_memory, java.lang.Long extra_1, java.lang.Long extra_2, java.lang.Long extra_3, java.lang.Long extra_4){
				return new License(greycat.libs_by_name.get(ai.greycat.std.name).mapped[62], name, start, end, company, max_workers, max_memory, extra_1, extra_2, extra_3, extra_4);
			}
		}
		public static final class SecurityEntity extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityEntity";
			private SecurityEntity(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean activated(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_activated(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity>) ai.greycat.GreyCat.call(greycat,"runtime::SecurityEntity::all");
			}
			public static java.lang.Long set(ai.greycat.GreyCat greycat,ai.greycat.std.runtime.SecurityEntity entity) throws java.io.IOException {
				return (java.lang.Long) ai.greycat.GreyCat.call(greycat,"runtime::SecurityEntity::set", entity);
			}
			public static SecurityEntity create(ai.greycat.GreyCat greycat, java.lang.Long id, java.lang.String name, java.lang.Boolean activated){
				return new SecurityEntity(greycat.libs_by_name.get(ai.greycat.std.name).mapped[63], id, name, activated);
			}
		}
		public static final class RuntimeInfo extends GreyCat.Object {
			public static final java.lang.String name = "runtime::RuntimeInfo";
			private RuntimeInfo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String version(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_version(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String arch(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_arch(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.TimeZone timezone(){
				return (ai.greycat.std.core.TimeZone)super.get(super.type.generated_offsets[2]);
			}
			public void set_timezone(ai.greycat.std.core.TimeZone v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.runtime.License license(){
				return (ai.greycat.std.runtime.License)super.get(super.type.generated_offsets[3]);
			}
			public void set_license(ai.greycat.std.runtime.License v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long io_threads(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_io_threads(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long bg_threads(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_bg_threads(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Long fg_threads(){
				return (java.lang.Long)super.get(super.type.generated_offsets[6]);
			}
			public void set_fg_threads(java.lang.Long v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long mem_total(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_mem_total(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Long mem_worker(){
				return (java.lang.Long)super.get(super.type.generated_offsets[8]);
			}
			public void set_mem_worker(java.lang.Long v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Long nb_ctx(){
				return (java.lang.Long)super.get(super.type.generated_offsets[9]);
			}
			public void set_nb_ctx(java.lang.Long v){
				super.set(super.type.generated_offsets[9],v);
			}
			public ai.greycat.std.runtime.StoreStat store_stats(){
				return (ai.greycat.std.runtime.StoreStat)super.get(super.type.generated_offsets[10]);
			}
			public void set_store_stats(ai.greycat.std.runtime.StoreStat v){
				super.set(super.type.generated_offsets[10],v);
			}
			public static RuntimeInfo create(ai.greycat.GreyCat greycat, java.lang.String version, java.lang.String arch, ai.greycat.std.core.TimeZone timezone, ai.greycat.std.runtime.License license, java.lang.Long io_threads, java.lang.Long bg_threads, java.lang.Long fg_threads, java.lang.Long mem_total, java.lang.Long mem_worker, java.lang.Long nb_ctx, ai.greycat.std.runtime.StoreStat store_stats){
				return new RuntimeInfo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[64], version, arch, timezone, license, io_threads, bg_threads, fg_threads, mem_total, mem_worker, nb_ctx, store_stats);
			}
		}
		public static final class User extends GreyCat.Object {
			public static final java.lang.String name = "runtime::User";
			private User(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean activated(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_activated(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String full_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_full_name(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.String email(){
				return (java.lang.String)super.get(super.type.generated_offsets[4]);
			}
			public void set_email(java.lang.String v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.String role(){
				return (java.lang.String)super.get(super.type.generated_offsets[5]);
			}
			public void set_role(java.lang.String v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Long permissions_flags(){
				return (java.lang.Long)super.get(super.type.generated_offsets[6]);
			}
			public void set_permissions_flags(java.lang.Long v){
				super.set(super.type.generated_offsets[6],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.std.runtime.UserGroupPolicy> groups(){
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.UserGroupPolicy>)super.get(super.type.generated_offsets[7]);
			}
			public void set_groups(ai.greycat.std.core.Array<ai.greycat.std.runtime.UserGroupPolicy> v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Long groups_flags(){
				return (java.lang.Long)super.get(super.type.generated_offsets[8]);
			}
			public void set_groups_flags(java.lang.Long v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Boolean external(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[9]);
			}
			public void set_external(java.lang.Boolean v){
				super.set(super.type.generated_offsets[9],v);
			}
			public static ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity>) ai.greycat.GreyCat.call(greycat,"runtime::SecurityEntity::all");
			}
			public static java.lang.Long set(ai.greycat.GreyCat greycat,ai.greycat.std.runtime.SecurityEntity entity) throws java.io.IOException {
				return (java.lang.Long) ai.greycat.GreyCat.call(greycat,"runtime::SecurityEntity::set", entity);
			}
			public static java.lang.String login(ai.greycat.GreyCat greycat,java.lang.String credentials,java.lang.Boolean use_cookie) throws java.io.IOException {
				return (java.lang.String) ai.greycat.GreyCat.call(greycat,"runtime::User::login", credentials, use_cookie);
			}
			public static java.lang.String tokenLogin(ai.greycat.GreyCat greycat,java.lang.String token,java.lang.Boolean use_cookie) throws java.io.IOException {
				return (java.lang.String) ai.greycat.GreyCat.call(greycat,"runtime::User::tokenLogin", token, use_cookie);
			}
			public static java.lang.String renew(ai.greycat.GreyCat greycat,java.lang.Boolean use_cookie) throws java.io.IOException {
				return (java.lang.String) ai.greycat.GreyCat.call(greycat,"runtime::User::renew", use_cookie);
			}
			public static void logout(ai.greycat.GreyCat greycat) throws java.io.IOException {
				ai.greycat.GreyCat.call(greycat,"runtime::User::logout");
			}
			public static java.lang.Long current(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (java.lang.Long) ai.greycat.GreyCat.call(greycat,"runtime::User::current");
			}
			public static ai.greycat.std.runtime.User me(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.runtime.User) ai.greycat.GreyCat.call(greycat,"runtime::User::me");
			}
			public static ai.greycat.std.core.Array<java.lang.String> permissions(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<java.lang.String>) ai.greycat.GreyCat.call(greycat,"runtime::User::permissions");
			}
			public static java.lang.Boolean setPassword(ai.greycat.GreyCat greycat,java.lang.String name,java.lang.String pass) throws java.io.IOException {
				return (java.lang.Boolean) ai.greycat.GreyCat.call(greycat,"runtime::User::setPassword", name, pass);
			}
			public static java.lang.String getToken(ai.greycat.GreyCat greycat,java.lang.Long id) throws java.io.IOException {
				return (java.lang.String) ai.greycat.GreyCat.call(greycat,"runtime::User::getToken", id);
			}
			public static User create(ai.greycat.GreyCat greycat, java.lang.Long id, java.lang.String name, java.lang.Boolean activated, java.lang.String full_name, java.lang.String email, java.lang.String role, java.lang.Long permissions_flags, ai.greycat.std.core.Array<ai.greycat.std.runtime.UserGroupPolicy> groups, java.lang.Long groups_flags, java.lang.Boolean external){
				return new User(greycat.libs_by_name.get(ai.greycat.std.name).mapped[65], id, name, activated, full_name, email, role, permissions_flags, groups, groups_flags, external);
			}
		}
		public static final class TaskInfo extends GreyCat.Object {
			public static final java.lang.String name = "runtime::TaskInfo";
			private TaskInfo(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long user_id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_user_id(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long task_id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_task_id(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String mod(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_mod(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String type(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_type(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.String fun(){
				return (java.lang.String)super.get(super.type.generated_offsets[4]);
			}
			public void set_fun(java.lang.String v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.time creation(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[5]);
			}
			public void set_creation(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.runtime.TaskStatus status(){
				return (ai.greycat.std.runtime.TaskStatus)super.get(super.type.generated_offsets[6]);
			}
			public void set_status(ai.greycat.std.runtime.TaskStatus v){
				super.set(super.type.generated_offsets[6],v);
			}
			public ai.greycat.std.core.time start(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[7]);
			}
			public void set_start(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Double progress(){
				return (java.lang.Double)super.get(super.type.generated_offsets[8]);
			}
			public void set_progress(java.lang.Double v){
				super.set(super.type.generated_offsets[8],v);
			}
			public ai.greycat.std.core.duration remaining(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[9]);
			}
			public void set_remaining(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[9],v);
			}
			public ai.greycat.std.core.duration duration(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[10]);
			}
			public void set_duration(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Long sub_waiting(){
				return (java.lang.Long)super.get(super.type.generated_offsets[11]);
			}
			public void set_sub_waiting(java.lang.Long v){
				super.set(super.type.generated_offsets[11],v);
			}
			public java.lang.Long sub_tasks_all(){
				return (java.lang.Long)super.get(super.type.generated_offsets[12]);
			}
			public void set_sub_tasks_all(java.lang.Long v){
				super.set(super.type.generated_offsets[12],v);
			}
			public static TaskInfo create(ai.greycat.GreyCat greycat, java.lang.Long user_id, java.lang.Long task_id, java.lang.String mod, java.lang.String type, java.lang.String fun, ai.greycat.std.core.time creation, ai.greycat.std.runtime.TaskStatus status, ai.greycat.std.core.time start, java.lang.Double progress, ai.greycat.std.core.duration remaining, ai.greycat.std.core.duration duration, java.lang.Long sub_waiting, java.lang.Long sub_tasks_all){
				return new TaskInfo(greycat.libs_by_name.get(ai.greycat.std.name).mapped[66], user_id, task_id, mod, type, fun, creation, status, start, progress, remaining, duration, sub_waiting, sub_tasks_all);
			}
		}
		public static final class PeriodicTask extends GreyCat.Object {
			public static final java.lang.String name = "runtime::PeriodicTask";
			private PeriodicTask(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long user_id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_user_id(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String args(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_args(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.time start(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[3]);
			}
			public void set_start(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.duration every(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[4]);
			}
			public void set_every(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static ai.greycat.std.core.Array<ai.greycat.std.runtime.PeriodicTask> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.PeriodicTask>) ai.greycat.GreyCat.call(greycat,"runtime::PeriodicTask::all");
			}
			public static void set(ai.greycat.GreyCat greycat,ai.greycat.std.core.Array<ai.greycat.std.runtime.PeriodicTask> tasks) throws java.io.IOException {
				ai.greycat.GreyCat.call(greycat,"runtime::PeriodicTask::set", tasks);
			}
			public static PeriodicTask create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Long user_id, java.lang.String args, ai.greycat.std.core.time start, ai.greycat.std.core.duration every){
				return new PeriodicTask(greycat.libs_by_name.get(ai.greycat.std.name).mapped[67], name, user_id, args, start, every);
			}
		}
		public static final class OpenIDConnect extends GreyCat.Object {
			public static final java.lang.String name = "runtime::OpenIDConnect";
			private OpenIDConnect(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String url(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_url(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String clientId(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_clientId(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ai.greycat.std.runtime.OpenIDConnect config(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.runtime.OpenIDConnect) ai.greycat.GreyCat.call(greycat,"runtime::OpenIDConnect::config");
			}
			public static OpenIDConnect create(ai.greycat.GreyCat greycat, java.lang.String url, java.lang.String clientId){
				return new OpenIDConnect(greycat.libs_by_name.get(ai.greycat.std.name).mapped[68], url, clientId);
			}
		}
		public static final class UserGroup extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserGroup";
			private UserGroup(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean activated(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_activated(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity> all(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.core.Array<ai.greycat.std.runtime.SecurityEntity>) ai.greycat.GreyCat.call(greycat,"runtime::SecurityEntity::all");
			}
			public static java.lang.Long set(ai.greycat.GreyCat greycat,ai.greycat.std.runtime.SecurityEntity entity) throws java.io.IOException {
				return (java.lang.Long) ai.greycat.GreyCat.call(greycat,"runtime::SecurityEntity::set", entity);
			}
			public static UserGroup create(ai.greycat.GreyCat greycat, java.lang.Long id, java.lang.String name, java.lang.Boolean activated){
				return new UserGroup(greycat.libs_by_name.get(ai.greycat.std.name).mapped[69], id, name, activated);
			}
		}
		public static final class StoreStat extends GreyCat.Object {
			public static final java.lang.String name = "runtime::StoreStat";
			private StoreStat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long capacity_bytes(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_capacity_bytes(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long allocated_bytes(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_allocated_bytes(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double allocated_ratio(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_allocated_ratio(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long remained_bytes(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_remained_bytes(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double remained_ratio(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_remained_ratio(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long used_bytes(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_used_bytes(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Double used_ratio(){
				return (java.lang.Double)super.get(super.type.generated_offsets[6]);
			}
			public void set_used_ratio(java.lang.Double v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long available_bytes(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_available_bytes(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Double available_ratio(){
				return (java.lang.Double)super.get(super.type.generated_offsets[8]);
			}
			public void set_available_ratio(java.lang.Double v){
				super.set(super.type.generated_offsets[8],v);
			}
			public static StoreStat create(ai.greycat.GreyCat greycat, java.lang.Long capacity_bytes, java.lang.Long allocated_bytes, java.lang.Double allocated_ratio, java.lang.Long remained_bytes, java.lang.Double remained_ratio, java.lang.Long used_bytes, java.lang.Double used_ratio, java.lang.Long available_bytes, java.lang.Double available_ratio){
				return new StoreStat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[70], capacity_bytes, allocated_bytes, allocated_ratio, remained_bytes, remained_ratio, used_bytes, used_ratio, available_bytes, available_ratio);
			}
		}
		public static final class TaskStatus extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::TaskStatus";
			private TaskStatus(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.runtime.TaskStatus empty(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[71];
				return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.runtime.TaskStatus waiting(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[71];
				return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.runtime.TaskStatus running(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[71];
				return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.runtime.TaskStatus cancelled(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[71];
				return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.std.runtime.TaskStatus error(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[71];
				return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.std.runtime.TaskStatus ended(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[71];
				return (ai.greycat.std.runtime.TaskStatus) t.enum_values[t.generated_offsets[5]];
			}
			public static TaskStatus create(ai.greycat.GreyCat greycat){
				return new TaskStatus(greycat.libs_by_name.get(ai.greycat.std.name).mapped[71]);
			}
		}
		public static final class Runtime extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Runtime";
			private Runtime(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.runtime.RuntimeInfo info(ai.greycat.GreyCat greycat) throws java.io.IOException {
				return (ai.greycat.std.runtime.RuntimeInfo) ai.greycat.GreyCat.call(greycat,"runtime::Runtime::info");
			}
			public static void abi(ai.greycat.GreyCat greycat) throws java.io.IOException {
				ai.greycat.GreyCat.call(greycat,"runtime::Runtime::abi");
			}
			public static java.lang.Object readModVar(ai.greycat.GreyCat greycat,java.lang.String module,java.lang.String name) throws java.io.IOException {
				return (java.lang.Object) ai.greycat.GreyCat.call(greycat,"runtime::Runtime::readModVar", module, name);
			}
			public static Runtime create(ai.greycat.GreyCat greycat){
				return new Runtime(greycat.libs_by_name.get(ai.greycat.std.name).mapped[72]);
			}
		}
		public static final class UserGroupPolicy extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserGroupPolicy";
			private UserGroupPolicy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long group_id(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_group_id(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.runtime.UserGroupPolicyType type(){
				return (ai.greycat.std.runtime.UserGroupPolicyType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.runtime.UserGroupPolicyType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static UserGroupPolicy create(ai.greycat.GreyCat greycat, java.lang.Long group_id, ai.greycat.std.runtime.UserGroupPolicyType type){
				return new UserGroupPolicy(greycat.libs_by_name.get(ai.greycat.std.name).mapped[73], group_id, type);
			}
		}
	}
	public static final class io {
		public static final class CsvColumnFloat extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnFloat";
			private CsvColumnFloat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static CsvColumnFloat create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory){
				return new CsvColumnFloat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[74], name, mandatory);
			}
		}
		public static final class Http extends GreyCat.Object {
			public static final java.lang.String name = "io::Http";
			private Http(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static Http create(ai.greycat.GreyCat greycat){
				return new Http(greycat.libs_by_name.get(ai.greycat.std.name).mapped[75]);
			}
		}
		public static final class HttpHeader extends GreyCat.Object {
			public static final java.lang.String name = "io::HttpHeader";
			private HttpHeader(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String value(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_value(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static HttpHeader create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.String value){
				return new HttpHeader(greycat.libs_by_name.get(ai.greycat.std.name).mapped[76], name, value);
			}
		}
		public static final class SmtpMode extends GreyCat.Enum {
			public static final java.lang.String name = "io::SmtpMode";
			private SmtpMode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.io.SmtpMode plain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[77];
				return (ai.greycat.std.io.SmtpMode) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.io.SmtpMode ssl_tls(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[77];
				return (ai.greycat.std.io.SmtpMode) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.io.SmtpMode starttls(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[77];
				return (ai.greycat.std.io.SmtpMode) t.enum_values[t.generated_offsets[2]];
			}
			public static SmtpMode create(ai.greycat.GreyCat greycat){
				return new SmtpMode(greycat.libs_by_name.get(ai.greycat.std.name).mapped[77]);
			}
		}
		public static final class Smtp extends GreyCat.Object {
			public static final java.lang.String name = "io::Smtp";
			private Smtp(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String host(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_host(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long port(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_port(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.io.SmtpMode mode(){
				return (ai.greycat.std.io.SmtpMode)super.get(super.type.generated_offsets[2]);
			}
			public void set_mode(ai.greycat.std.io.SmtpMode v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.io.SmtpAuth authenticate(){
				return (ai.greycat.std.io.SmtpAuth)super.get(super.type.generated_offsets[3]);
			}
			public void set_authenticate(ai.greycat.std.io.SmtpAuth v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.String user(){
				return (java.lang.String)super.get(super.type.generated_offsets[4]);
			}
			public void set_user(java.lang.String v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.String pass(){
				return (java.lang.String)super.get(super.type.generated_offsets[5]);
			}
			public void set_pass(java.lang.String v){
				super.set(super.type.generated_offsets[5],v);
			}
			public static Smtp create(ai.greycat.GreyCat greycat, java.lang.String host, java.lang.Long port, ai.greycat.std.io.SmtpMode mode, ai.greycat.std.io.SmtpAuth authenticate, java.lang.String user, java.lang.String pass){
				return new Smtp(greycat.libs_by_name.get(ai.greycat.std.name).mapped[78], host, port, mode, authenticate, user, pass);
			}
		}
		public static final class CsvColumnIgnored extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnIgnored";
			private CsvColumnIgnored(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static CsvColumnIgnored create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory){
				return new CsvColumnIgnored(greycat.libs_by_name.get(ai.greycat.std.name).mapped[79], name, mandatory);
			}
		}
		public static final class SmtpAuth extends GreyCat.Enum {
			public static final java.lang.String name = "io::SmtpAuth";
			private SmtpAuth(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.io.SmtpAuth none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[80];
				return (ai.greycat.std.io.SmtpAuth) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.io.SmtpAuth plain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[80];
				return (ai.greycat.std.io.SmtpAuth) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.io.SmtpAuth login(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[80];
				return (ai.greycat.std.io.SmtpAuth) t.enum_values[t.generated_offsets[2]];
			}
			public static SmtpAuth create(ai.greycat.GreyCat greycat){
				return new SmtpAuth(greycat.libs_by_name.get(ai.greycat.std.name).mapped[80]);
			}
		}
		public static final class TextEncoder extends GreyCat.Enum {
			public static final java.lang.String name = "io::TextEncoder";
			private TextEncoder(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.std.io.TextEncoder plain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[81];
				return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.std.io.TextEncoder base64(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[81];
				return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.std.io.TextEncoder base64url(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[81];
				return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.std.io.TextEncoder hexadecimal(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.std.name).mapped[81];
				return (ai.greycat.std.io.TextEncoder) t.enum_values[t.generated_offsets[3]];
			}
			public static TextEncoder create(ai.greycat.GreyCat greycat){
				return new TextEncoder(greycat.libs_by_name.get(ai.greycat.std.name).mapped[81]);
			}
		}
		public static final class CsvColumn extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumn";
			private CsvColumn(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static CsvColumn create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory){
				return new CsvColumn(greycat.libs_by_name.get(ai.greycat.std.name).mapped[82], name, mandatory);
			}
		}
		public static final class CsvColumnBoolean extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnBoolean";
			private CsvColumnBoolean(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static CsvColumnBoolean create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory){
				return new CsvColumnBoolean(greycat.libs_by_name.get(ai.greycat.std.name).mapped[83], name, mandatory);
			}
		}
		public static final class Url extends GreyCat.Object {
			public static final java.lang.String name = "io::Url";
			private Url(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String protocol(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_protocol(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String host(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_host(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long port(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_port(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String path(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_path(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.Map<java.lang.String, java.lang.String> params(){
				return (ai.greycat.std.core.Map<java.lang.String, java.lang.String>)super.get(super.type.generated_offsets[4]);
			}
			public void set_params(ai.greycat.std.core.Map<java.lang.String, java.lang.String> v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.String hash(){
				return (java.lang.String)super.get(super.type.generated_offsets[5]);
			}
			public void set_hash(java.lang.String v){
				super.set(super.type.generated_offsets[5],v);
			}
			public static Url create(ai.greycat.GreyCat greycat, java.lang.String protocol, java.lang.String host, java.lang.Long port, java.lang.String path, ai.greycat.std.core.Map<java.lang.String, java.lang.String> params, java.lang.String hash){
				return new Url(greycat.libs_by_name.get(ai.greycat.std.name).mapped[84], protocol, host, port, path, params, hash);
			}
		}
		public static final class CsvColumnDate extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnDate";
			private CsvColumnDate(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String format(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_format(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.TimeZone tz(){
				return (ai.greycat.std.core.TimeZone)super.get(super.type.generated_offsets[3]);
			}
			public void set_tz(ai.greycat.std.core.TimeZone v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Boolean as_time(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[4]);
			}
			public void set_as_time(java.lang.Boolean v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static CsvColumnDate create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory, java.lang.String format, ai.greycat.std.core.TimeZone tz, java.lang.Boolean as_time){
				return new CsvColumnDate(greycat.libs_by_name.get(ai.greycat.std.name).mapped[85], name, mandatory, format, tz, as_time);
			}
		}
		public static final class CsvColumnTime extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnTime";
			private CsvColumnTime(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.DurationUnit unit(){
				return (ai.greycat.std.core.DurationUnit)super.get(super.type.generated_offsets[2]);
			}
			public void set_unit(ai.greycat.std.core.DurationUnit v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static CsvColumnTime create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory, ai.greycat.std.core.DurationUnit unit){
				return new CsvColumnTime(greycat.libs_by_name.get(ai.greycat.std.name).mapped[86], name, mandatory, unit);
			}
		}
		public static final class Email extends GreyCat.Object {
			public static final java.lang.String name = "io::Email";
			private Email(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String from(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_from(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String subject(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_subject(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String body(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_body(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean body_is_html(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[3]);
			}
			public void set_body_is_html(java.lang.Boolean v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> to(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[4]);
			}
			public void set_to(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> cc(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[5]);
			}
			public void set_cc(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> bcc(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[6]);
			}
			public void set_bcc(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static Email create(ai.greycat.GreyCat greycat, java.lang.String from, java.lang.String subject, java.lang.String body, java.lang.Boolean body_is_html, ai.greycat.std.core.Array<java.lang.String> to, ai.greycat.std.core.Array<java.lang.String> cc, ai.greycat.std.core.Array<java.lang.String> bcc){
				return new Email(greycat.libs_by_name.get(ai.greycat.std.name).mapped[87], from, subject, body, body_is_html, to, cc, bcc);
			}
		}
		public static final class CsvColumnDuration extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnDuration";
			private CsvColumnDuration(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.DurationUnit unit(){
				return (ai.greycat.std.core.DurationUnit)super.get(super.type.generated_offsets[2]);
			}
			public void set_unit(ai.greycat.std.core.DurationUnit v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static CsvColumnDuration create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory, ai.greycat.std.core.DurationUnit unit){
				return new CsvColumnDuration(greycat.libs_by_name.get(ai.greycat.std.name).mapped[88], name, mandatory, unit);
			}
		}
		public static final class File extends GreyCat.Object {
			public static final java.lang.String name = "io::File";
			private File(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_size(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.time last_modification(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[2]);
			}
			public void set_last_modification(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static File create(ai.greycat.GreyCat greycat, java.lang.String path, java.lang.Long size, ai.greycat.std.core.time last_modification){
				return new File(greycat.libs_by_name.get(ai.greycat.std.name).mapped[89], path, size, last_modification);
			}
		}
		public static final class CsvColumnString extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnString";
			private CsvColumnString(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean trim(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_trim(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean try_number(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[3]);
			}
			public void set_try_number(java.lang.Boolean v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Boolean try_json(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[4]);
			}
			public void set_try_json(java.lang.Boolean v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> values(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[5]);
			}
			public void set_values(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.io.TextEncoder encoder(){
				return (ai.greycat.std.io.TextEncoder)super.get(super.type.generated_offsets[6]);
			}
			public void set_encoder(ai.greycat.std.io.TextEncoder v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static CsvColumnString create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory, java.lang.Boolean trim, java.lang.Boolean try_number, java.lang.Boolean try_json, ai.greycat.std.core.Array<java.lang.String> values, ai.greycat.std.io.TextEncoder encoder){
				return new CsvColumnString(greycat.libs_by_name.get(ai.greycat.std.name).mapped[90], name, mandatory, trim, try_number, try_json, values, encoder);
			}
		}
		public static final class CsvColumnInteger extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnInteger";
			private CsvColumnInteger(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean mandatory(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_mandatory(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static CsvColumnInteger create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean mandatory){
				return new CsvColumnInteger(greycat.libs_by_name.get(ai.greycat.std.name).mapped[91], name, mandatory);
			}
		}
		public static final class CsvFormat extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvFormat";
			private CsvFormat(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long header_lines(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_header_lines(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean infer(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_infer(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Character separator(){
				return (java.lang.Character)super.get(super.type.generated_offsets[2]);
			}
			public void set_separator(java.lang.Character v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Character string_delimiter(){
				return (java.lang.Character)super.get(super.type.generated_offsets[3]);
			}
			public void set_string_delimiter(java.lang.Character v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Character decimal_separator(){
				return (java.lang.Character)super.get(super.type.generated_offsets[4]);
			}
			public void set_decimal_separator(java.lang.Character v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Character thousands_separator(){
				return (java.lang.Character)super.get(super.type.generated_offsets[5]);
			}
			public void set_thousands_separator(java.lang.Character v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumn> columns(){
				return (ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumn>)super.get(super.type.generated_offsets[6]);
			}
			public void set_columns(ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumn> v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static CsvFormat create(ai.greycat.GreyCat greycat, java.lang.Long header_lines, java.lang.Boolean infer, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, ai.greycat.std.core.Array<ai.greycat.std.io.CsvColumn> columns){
				return new CsvFormat(greycat.libs_by_name.get(ai.greycat.std.name).mapped[92], header_lines, infer, separator, string_delimiter, decimal_separator, thousands_separator, columns);
			}
		}
	}
	@Override
	public void configure(java.util.Map<String, ai.greycat.GreyCat.Loader> loaders, java.util.Map<String, ai.greycat.GreyCat.Factory> factories) {
		factories.put(core.TableColumnMeta.name, core.TableColumnMeta::new);
		factories.put(core.SamplingMode.name, core.SamplingMode::new);
		factories.put(core.nodeList.name, core.nodeList::new);
		loaders.put(core.nodeList.name, ai.greycat.std_n.core.nodeList::load);
		factories.put(core.Table.name, core.Table::new);
		loaders.put(core.Table.name, ai.greycat.std_n.core.Table::load);
		factories.put(core.DatePart.name, core.DatePart::new);
		factories.put(core.GeoCircle.name, core.GeoCircle::new);
		factories.put(core.nodeIndexBucket.name, core.nodeIndexBucket::new);
		loaders.put(core.nodeIndexBucket.name, ai.greycat.std_n.core.nodeIndexBucket::load);
		factories.put(core.time.name, core.time::new);
		loaders.put(core.time.name, ai.greycat.std_n.core.time::load);
		factories.put(core.nodeTime.name, core.nodeTime::new);
		loaders.put(core.nodeTime.name, ai.greycat.std_n.core.nodeTime::load);
		factories.put(core.NodeTimeInfo.name, core.NodeTimeInfo::new);
		factories.put(core.ErrorCode.name, core.ErrorCode::new);
		factories.put(core.Error.name, core.Error::new);
		loaders.put(core.Error.name, ai.greycat.std_n.core.Error::load);
		factories.put(core.function.name, core.function::new);
		loaders.put(core.function.name, ai.greycat.std_n.core.function::load);
		factories.put(core.Map.name, core.Map::new);
		loaders.put(core.Map.name, ai.greycat.std_n.core.Map::load);
		factories.put(core.geo.name, core.geo::new);
		loaders.put(core.geo.name, ai.greycat.std_n.core.geo::load);
		factories.put(core.ti2d.name, core.ti2d::new);
		loaders.put(core.ti2d.name, ai.greycat.std_n.core.ti2d::load);
		factories.put(core.tf3d.name, core.tf3d::new);
		loaders.put(core.tf3d.name, ai.greycat.std_n.core.tf3d::load);
		factories.put(core.TensorType.name, core.TensorType::new);
		factories.put(core.GeoPoly.name, core.GeoPoly::new);
		factories.put(core.DurationUnit.name, core.DurationUnit::new);
		factories.put(core.duration.name, core.duration::new);
		loaders.put(core.duration.name, ai.greycat.std_n.core.duration::load);
		factories.put(core.node.name, core.node::new);
		loaders.put(core.node.name, ai.greycat.std_n.core.node::load);
		factories.put(core.Date.name, core.Date::new);
		loaders.put(core.Date.name, ai.greycat.std_n.core.Date::load);
		factories.put(core.tf4d.name, core.tf4d::new);
		loaders.put(core.tf4d.name, ai.greycat.std_n.core.tf4d::load);
		factories.put(core.Tensor.name, core.Tensor::new);
		loaders.put(core.Tensor.name, ai.greycat.std_n.core.Tensor::load);
		factories.put(core.ti6d.name, core.ti6d::new);
		loaders.put(core.ti6d.name, ai.greycat.std_n.core.ti6d::load);
		factories.put(core.ti4d.name, core.ti4d::new);
		loaders.put(core.ti4d.name, ai.greycat.std_n.core.ti4d::load);
		factories.put(core.ti10d.name, core.ti10d::new);
		loaders.put(core.ti10d.name, ai.greycat.std_n.core.ti10d::load);
		factories.put(core.TimeZone.name, core.TimeZone::new);
		factories.put(core.nodeGeo.name, core.nodeGeo::new);
		loaders.put(core.nodeGeo.name, ai.greycat.std_n.core.nodeGeo::load);
		factories.put(core.ti3d.name, core.ti3d::new);
		loaders.put(core.ti3d.name, ai.greycat.std_n.core.ti3d::load);
		factories.put(core.Tuple.name, core.Tuple::new);
		factories.put(core.nodeIndex.name, core.nodeIndex::new);
		loaders.put(core.nodeIndex.name, ai.greycat.std_n.core.nodeIndex::load);
		factories.put(core.tf2d.name, core.tf2d::new);
		loaders.put(core.tf2d.name, ai.greycat.std_n.core.tf2d::load);
		factories.put(core.GeoBox.name, core.GeoBox::new);
		factories.put(core.Array.name, core.Array::new);
		loaders.put(core.Array.name, ai.greycat.std_n.core.Array::load);
		factories.put(core.String.name, core.String::new);
		loaders.put(core.String.name, ai.greycat.std_n.core.String::load);
		factories.put(core.ti5d.name, core.ti5d::new);
		loaders.put(core.ti5d.name, ai.greycat.std_n.core.ti5d::load);
		factories.put(util.SlidingWindow.name, util.SlidingWindow::new);
		loaders.put(util.SlidingWindow.name, ai.greycat.std_n.util.SlidingWindow::load);
		factories.put(util.Random.name, util.Random::new);
		factories.put(util.TimeWindow.name, util.TimeWindow::new);
		loaders.put(util.TimeWindow.name, ai.greycat.std_n.util.TimeWindow::load);
		factories.put(util.HistogramInt.name, util.HistogramInt::new);
		loaders.put(util.HistogramInt.name, ai.greycat.std_n.util.HistogramInt::load);
		factories.put(util.ProgressTracker.name, util.ProgressTracker::new);
		factories.put(util.BoxPlotFloat.name, util.BoxPlotFloat::new);
		factories.put(util.Buffer.name, util.Buffer::new);
		loaders.put(util.Buffer.name, ai.greycat.std_n.util.Buffer::load);
		factories.put(util.Crypto.name, util.Crypto::new);
		factories.put(util.HistogramFloat.name, util.HistogramFloat::new);
		loaders.put(util.HistogramFloat.name, ai.greycat.std_n.util.HistogramFloat::load);
		factories.put(util.Quantizer.name, util.Quantizer::new);
		loaders.put(util.Quantizer.name, ai.greycat.std_n.util.Quantizer::load);
		factories.put(util.Assert.name, util.Assert::new);
		factories.put(util.GaussianProfile.name, util.GaussianProfile::new);
		loaders.put(util.GaussianProfile.name, ai.greycat.std_n.util.GaussianProfile::load);
		factories.put(util.Iban.name, util.Iban::new);
		loaders.put(util.Iban.name, ai.greycat.std_n.util.Iban::load);
		factories.put(util.BoxPlotInt.name, util.BoxPlotInt::new);
		factories.put(util.Gaussian.name, util.Gaussian::new);
		factories.put(util.Queue.name, util.Queue::new);
		loaders.put(util.Queue.name, ai.greycat.std_n.util.Queue::load);
		factories.put(math.MathConstants.name, math.MathConstants::new);
		factories.put(runtime.Task.name, runtime.Task::new);
		factories.put(runtime.UserCredential.name, runtime.UserCredential::new);
		factories.put(runtime.SecurityPolicy.name, runtime.SecurityPolicy::new);
		factories.put(runtime.UserRole.name, runtime.UserRole::new);
		factories.put(runtime.System.name, runtime.System::new);
		factories.put(runtime.SecurityFields.name, runtime.SecurityFields::new);
		factories.put(runtime.UserGroupPolicyType.name, runtime.UserGroupPolicyType::new);
		factories.put(runtime.License.name, runtime.License::new);
		factories.put(runtime.SecurityEntity.name, runtime.SecurityEntity::new);
		factories.put(runtime.RuntimeInfo.name, runtime.RuntimeInfo::new);
		factories.put(runtime.User.name, runtime.User::new);
		factories.put(runtime.TaskInfo.name, runtime.TaskInfo::new);
		factories.put(runtime.PeriodicTask.name, runtime.PeriodicTask::new);
		factories.put(runtime.OpenIDConnect.name, runtime.OpenIDConnect::new);
		factories.put(runtime.UserGroup.name, runtime.UserGroup::new);
		factories.put(runtime.StoreStat.name, runtime.StoreStat::new);
		factories.put(runtime.TaskStatus.name, runtime.TaskStatus::new);
		factories.put(runtime.Runtime.name, runtime.Runtime::new);
		factories.put(runtime.UserGroupPolicy.name, runtime.UserGroupPolicy::new);
		factories.put(io.CsvColumnFloat.name, io.CsvColumnFloat::new);
		factories.put(io.Http.name, io.Http::new);
		factories.put(io.HttpHeader.name, io.HttpHeader::new);
		factories.put(io.SmtpMode.name, io.SmtpMode::new);
		factories.put(io.Smtp.name, io.Smtp::new);
		factories.put(io.CsvColumnIgnored.name, io.CsvColumnIgnored::new);
		factories.put(io.SmtpAuth.name, io.SmtpAuth::new);
		factories.put(io.TextEncoder.name, io.TextEncoder::new);
		factories.put(io.CsvColumn.name, io.CsvColumn::new);
		factories.put(io.CsvColumnBoolean.name, io.CsvColumnBoolean::new);
		factories.put(io.Url.name, io.Url::new);
		factories.put(io.CsvColumnDate.name, io.CsvColumnDate::new);
		factories.put(io.CsvColumnTime.name, io.CsvColumnTime::new);
		factories.put(io.Email.name, io.Email::new);
		factories.put(io.CsvColumnDuration.name, io.CsvColumnDuration::new);
		factories.put(io.File.name, io.File::new);
		factories.put(io.CsvColumnString.name, io.CsvColumnString::new);
		factories.put(io.CsvColumnInteger.name, io.CsvColumnInteger::new);
		factories.put(io.CsvFormat.name, io.CsvFormat::new);
	}
	@Override
	public void init(ai.greycat.GreyCat greycat) {
		this.mapped = new ai.greycat.GreyCat.Type[93];
		this.mapped[0] = greycat.types_by_name.get(core.TableColumnMeta.name);
		this.mapped[0].resolveGeneratedOffsets("type","size","index","min","max","avg","std");
		this.mapped[1] = greycat.types_by_name.get(core.SamplingMode.name);
		this.mapped[1].resolveGeneratedOffsetWithValues("fixed", 0L,"fixed_reg", 1L,"adaptative", 2L,"dense", 3L);
		this.mapped[2] = greycat.types_by_name.get(core.nodeList.name);
		this.mapped[3] = greycat.types_by_name.get(core.Table.name);
		this.mapped[4] = greycat.types_by_name.get(core.DatePart.name);
		this.mapped[4].resolveGeneratedOffsetWithValues("years", 0L,"months", 1L,"days", 2L,"hours", 3L,"minutes", 4L,"seconds", 5L,"microseconds", 6L);
		this.mapped[5] = greycat.types_by_name.get(core.GeoCircle.name);
		this.mapped[5].resolveGeneratedOffsets("center","radius");
		this.mapped[6] = greycat.types_by_name.get(core.nodeIndexBucket.name);
		this.mapped[7] = greycat.types_by_name.get(core.time.name);
		this.mapped[7].static_values = new java.lang.Object[]{greycat.createTime(-9223372036854775808L),greycat.createTime(9223372036854775807L)};
		this.mapped[8] = greycat.types_by_name.get(core.nodeTime.name);
		this.mapped[9] = greycat.types_by_name.get(core.NodeTimeInfo.name);
		this.mapped[9].resolveGeneratedOffsets("size","from","to");
		this.mapped[10] = greycat.types_by_name.get(core.ErrorCode.name);
		this.mapped[10].resolveGeneratedOffsetWithValues("none", 0L,"too_deep_workspace", 1L,"too_deep_iterator", 2L,"wrong_operand", 3L,"wrong_params", 4L,"wrong_param_type", 5L,"wrong_numeric", 6L,"wrong_state", 7L,"wrong_null", 8L,"unresolved_ref", 9L,"assign_error", 10L,"interrupted", 11L,"throw", 12L,"wrong_type", 13L,"wrong_dimension", 14L,"unsupported_operation", 15L,"unsupported_type", 16L,"dimensions_mismatch", 17L,"timeout", 18L,"forbidden", 19L,"runtime_error", 20L);
		this.mapped[11] = greycat.types_by_name.get(core.Error.name);
		this.mapped[12] = greycat.types_by_name.get(core.function.name);
		this.mapped[13] = greycat.types_by_name.get(core.Map.name);
		this.mapped[14] = greycat.types_by_name.get(core.geo.name);
		this.mapped[14].static_values = new java.lang.Object[]{greycat.createGeo(-85.0511287602,-179.9999999581),greycat.createGeo(85.0511287602,179.9999999581)};
		this.mapped[15] = greycat.types_by_name.get(core.ti2d.name);
		this.mapped[16] = greycat.types_by_name.get(core.tf3d.name);
		this.mapped[17] = greycat.types_by_name.get(core.TensorType.name);
		this.mapped[17].resolveGeneratedOffsetWithValues("i32", 4L,"i64", 8L,"f32", 4L,"f64", 8L,"c64", 8L,"c128", 16L);
		this.mapped[18] = greycat.types_by_name.get(core.GeoPoly.name);
		this.mapped[18].resolveGeneratedOffsets("points");
		this.mapped[19] = greycat.types_by_name.get(core.DurationUnit.name);
		this.mapped[19].resolveGeneratedOffsetWithValues("microseconds", 1L,"milliseconds", 1000L,"seconds", 1000000L,"minutes", 60000000L,"hours", 3600000000L,"days", 86400000000L,"weeks", 604800000000L,"months", 2628000000000L,"years", 31536000000000L);
		this.mapped[20] = greycat.types_by_name.get(core.duration.name);
		this.mapped[21] = greycat.types_by_name.get(core.node.name);
		this.mapped[22] = greycat.types_by_name.get(core.Date.name);
		this.mapped[23] = greycat.types_by_name.get(core.tf4d.name);
		this.mapped[24] = greycat.types_by_name.get(core.Tensor.name);
		this.mapped[25] = greycat.types_by_name.get(core.ti6d.name);
		this.mapped[26] = greycat.types_by_name.get(core.ti4d.name);
		this.mapped[27] = greycat.types_by_name.get(core.ti10d.name);
		this.mapped[28] = greycat.types_by_name.get(core.TimeZone.name);
		this.mapped[28].resolveGeneratedOffsetWithValues("Africa_Accra", "AfricaAccra","Africa_Bamako", "AfricaBamako","Africa_Banjul", "AfricaBanjul","Africa_Conakry", "AfricaConakry","Africa_Dakar", "AfricaDakar","Africa_Freetown", "AfricaFreetown","Africa_Lome", "AfricaLome","Africa_Nouakchott", "AfricaNouakchott","Africa_Ouagadougou", "AfricaOuagadougou","Africa_Timbuktu", "AfricaTimbuktu","Atlantic_Reykjavik", "AtlanticReykjavik","Atlantic_St_Helena", "AtlanticSt_Helena","Iceland", "Iceland","Egypt", "Egypt","Africa_Maseru", "AfricaMaseru","Africa_Mbabane", "AfricaMbabane","Africa_Bangui", "AfricaBangui","Africa_Brazzaville", "AfricaBrazzaville","Africa_Douala", "AfricaDouala","Africa_Kinshasa", "AfricaKinshasa","Africa_Libreville", "AfricaLibreville","Africa_Luanda", "AfricaLuanda","Africa_Malabo", "AfricaMalabo","Africa_Niamey", "AfricaNiamey","Africa_Porto_Novo", "AfricaPorto-Novo","Africa_Blantyre", "AfricaBlantyre","Africa_Bujumbura", "AfricaBujumbura","Africa_Gaborone", "AfricaGaborone","Africa_Harare", "AfricaHarare","Africa_Kigali", "AfricaKigali","Africa_Lubumbashi", "AfricaLubumbashi","Africa_Lusaka", "AfricaLusaka","Africa_Addis_Ababa", "AfricaAddis_Ababa","Africa_Asmara", "AfricaAsmara","Africa_Asmera", "AfricaAsmera","Africa_Dar_es_Salaam", "AfricaDar_es_Salaam","Africa_Djibouti", "AfricaDjibouti","Africa_Kampala", "AfricaKampala","Africa_Mogadishu", "AfricaMogadishu","Indian_Antananarivo", "IndianAntananarivo","Indian_Comoro", "IndianComoro","Indian_Mayotte", "IndianMayotte","Libya", "Libya","America_Atka", "AmericaAtka","US_Aleutian", "USAleutian","US_Alaska", "USAlaska","America_Buenos_Aires", "AmericaBuenos_Aires","America_Argentina_ComodRivadavia", "AmericaArgentinaComodRivadavia","America_Catamarca", "AmericaCatamarca","America_Cordoba", "AmericaCordoba","America_Rosario", "AmericaRosario","America_Jujuy", "AmericaJujuy","America_Mendoza", "AmericaMendoza","US_Central", "USCentral","America_Shiprock", "AmericaShiprock","Navajo", "Navajo","US_Mountain", "USMountain","US_Michigan", "USMichigan","America_Yellowknife", "AmericaYellowknife","Canada_Mountain", "CanadaMountain","Canada_Atlantic", "CanadaAtlantic","Cuba", "Cuba","America_Fort_Wayne", "AmericaFort_Wayne","America_Indianapolis", "AmericaIndianapolis","US_East_Indiana", "USEast-Indiana","America_Knox_IN", "AmericaKnox_IN","US_Indiana_Starke", "USIndiana-Starke","America_Pangnirtung", "AmericaPangnirtung","Jamaica", "Jamaica","America_Louisville", "AmericaLouisville","US_Pacific", "USPacific","Brazil_West", "BrazilWest","Mexico_BajaSur", "MexicoBajaSur","Mexico_General", "MexicoGeneral","US_Eastern", "USEastern","Brazil_DeNoronha", "BrazilDeNoronha","America_Godthab", "AmericaGodthab","America_Atikokan", "AmericaAtikokan","America_Cayman", "AmericaCayman","America_Coral_Harbour", "AmericaCoral_Harbour","America_Creston", "AmericaCreston","US_Arizona", "USArizona","America_Anguilla", "AmericaAnguilla","America_Antigua", "AmericaAntigua","America_Aruba", "AmericaAruba","America_Blanc_Sablon", "AmericaBlanc-Sablon","America_Curacao", "AmericaCuracao","America_Dominica", "AmericaDominica","America_Grenada", "AmericaGrenada","America_Guadeloupe", "AmericaGuadeloupe","America_Kralendijk", "AmericaKralendijk","America_Lower_Princes", "AmericaLower_Princes","America_Marigot", "AmericaMarigot","America_Montserrat", "AmericaMontserrat","America_Port_of_Spain", "AmericaPort_of_Spain","America_St_Barthelemy", "AmericaSt_Barthelemy","America_St_Kitts", "AmericaSt_Kitts","America_St_Lucia", "AmericaSt_Lucia","America_St_Thomas", "AmericaSt_Thomas","America_St_Vincent", "AmericaSt_Vincent","America_Tortola", "AmericaTortola","America_Virgin", "AmericaVirgin","Canada_Saskatchewan", "CanadaSaskatchewan","America_Porto_Acre", "AmericaPorto_Acre","Brazil_Acre", "BrazilAcre","Chile_Continental", "ChileContinental","Brazil_East", "BrazilEast","Canada_Newfoundland", "CanadaNewfoundland","America_Ensenada", "AmericaEnsenada","America_Santa_Isabel", "AmericaSanta_Isabel","Mexico_BajaNorte", "MexicoBajaNorte","America_Montreal", "AmericaMontreal","America_Nassau", "AmericaNassau","America_Nipigon", "AmericaNipigon","America_Thunder_Bay", "AmericaThunder_Bay","Canada_Eastern", "CanadaEastern","Canada_Pacific", "CanadaPacific","Canada_Yukon", "CanadaYukon","America_Rainy_River", "AmericaRainy_River","Canada_Central", "CanadaCentral","Asia_Ashkhabad", "AsiaAshkhabad","Asia_Phnom_Penh", "AsiaPhnom_Penh","Asia_Vientiane", "AsiaVientiane","Indian_Christmas", "IndianChristmas","Asia_Dacca", "AsiaDacca","Asia_Muscat", "AsiaMuscat","Indian_Mahe", "IndianMahe","Indian_Reunion", "IndianReunion","Asia_Saigon", "AsiaSaigon","Hongkong", "Hongkong","Asia_Tel_Aviv", "AsiaTel_Aviv","Israel", "Israel","Asia_Katmandu", "AsiaKatmandu","Asia_Calcutta", "AsiaCalcutta","Asia_Brunei", "AsiaBrunei","Asia_Macao", "AsiaMacao","Asia_Ujung_Pandang", "AsiaUjung_Pandang","Europe_Nicosia", "EuropeNicosia","Asia_Bahrain", "AsiaBahrain","Antarctica_Syowa", "AntarcticaSyowa","Asia_Aden", "AsiaAden","Asia_Kuwait", "AsiaKuwait","ROK", "ROK","Asia_Chongqing", "AsiaChongqing","Asia_Chungking", "AsiaChungking","Asia_Harbin", "AsiaHarbin","PRC", "PRC","Asia_Kuala_Lumpur", "AsiaKuala_Lumpur","Singapore", "Singapore","ROC", "ROC","Iran", "Iran","Asia_Thimbu", "AsiaThimbu","Japan", "Japan","Asia_Ulan_Bator", "AsiaUlan_Bator","Antarctica_Vostok", "AntarcticaVostok","Asia_Kashgar", "AsiaKashgar","Asia_Rangoon", "AsiaRangoon","Indian_Cocos", "IndianCocos","Atlantic_Faeroe", "AtlanticFaeroe","Australia_South", "AustraliaSouth","Australia_Queensland", "AustraliaQueensland","Australia_Yancowinna", "AustraliaYancowinna","Australia_North", "AustraliaNorth","Australia_Currie", "AustraliaCurrie","Australia_Tasmania", "AustraliaTasmania","Australia_LHI", "AustraliaLHI","Australia_Victoria", "AustraliaVictoria","Australia_West", "AustraliaWest","Australia_ACT", "AustraliaACT","Australia_Canberra", "AustraliaCanberra","Australia_NSW", "AustraliaNSW","GMT", "GMT","GMTx0", "GMT+0","GMT_0", "GMT-0","GMT0", "GMT0","Greenwich", "Greenwich","UCT", "UCT","UTC", "UTC","Universal", "Universal","Zulu", "Zulu","Europe_Ljubljana", "EuropeLjubljana","Europe_Podgorica", "EuropePodgorica","Europe_Sarajevo", "EuropeSarajevo","Europe_Skopje", "EuropeSkopje","Europe_Zagreb", "EuropeZagreb","Arctic_Longyearbyen", "ArcticLongyearbyen","Atlantic_Jan_Mayen", "AtlanticJan_Mayen","Europe_Copenhagen", "EuropeCopenhagen","Europe_Oslo", "EuropeOslo","Europe_Stockholm", "EuropeStockholm","Europe_Amsterdam", "EuropeAmsterdam","Europe_Luxembourg", "EuropeLuxembourg","Europe_Tiraspol", "EuropeTiraspol","Eire", "Eire","Europe_Mariehamn", "EuropeMariehamn","Asia_Istanbul", "AsiaIstanbul","Turkey", "Turkey","Europe_Kiev", "EuropeKiev","Europe_Uzhgorod", "EuropeUzhgorod","Europe_Zaporozhye", "EuropeZaporozhye","Portugal", "Portugal","Europe_Belfast", "EuropeBelfast","Europe_Guernsey", "EuropeGuernsey","Europe_Isle_of_Man", "EuropeIsle_of_Man","Europe_Jersey", "EuropeJersey","GB", "GB","GB_Eire", "GB-Eire","W_SU", "W-SU","Europe_Monaco", "EuropeMonaco","Europe_Bratislava", "EuropeBratislava","Europe_San_Marino", "EuropeSan_Marino","Europe_Vatican", "EuropeVatican","Poland", "Poland","Europe_Busingen", "EuropeBusingen","Europe_Vaduz", "EuropeVaduz","Indian_Kerguelen", "IndianKerguelen","Antarctica_McMurdo", "AntarcticaMcMurdo","Antarctica_South_Pole", "AntarcticaSouth_Pole","NZ", "NZ","NZ_CHAT", "NZ-CHAT","Chile_EasterIsland", "ChileEasterIsland","Pacific_Pohnpei", "PacificPohnpei","Pacific_Ponape", "PacificPonape","Pacific_Saipan", "PacificSaipan","Pacific_Johnston", "PacificJohnston","US_Hawaii", "USHawaii","Pacific_Enderbury", "PacificEnderbury","Kwajalein", "Kwajalein","Pacific_Midway", "PacificMidway","Pacific_Samoa", "PacificSamoa","US_Samoa", "USSamoa","Antarctica_DumontDUrville", "AntarcticaDumontDUrville","Pacific_Chuuk", "PacificChuuk","Pacific_Truk", "PacificTruk","Pacific_Yap", "PacificYap","Pacific_Funafuti", "PacificFunafuti","Pacific_Majuro", "PacificMajuro","Pacific_Wake", "PacificWake","Pacific_Wallis", "PacificWallis","Africa_Abidjan", "AfricaAbidjan","Africa_Algiers", "AfricaAlgiers","Africa_Bissau", "AfricaBissau","Africa_Cairo", "AfricaCairo","Africa_Casablanca", "AfricaCasablanca","Africa_Ceuta", "AfricaCeuta","Africa_El_Aaiun", "AfricaEl_Aaiun","Africa_Johannesburg", "AfricaJohannesburg","Africa_Juba", "AfricaJuba","Africa_Khartoum", "AfricaKhartoum","Africa_Lagos", "AfricaLagos","Africa_Maputo", "AfricaMaputo","Africa_Monrovia", "AfricaMonrovia","Africa_Nairobi", "AfricaNairobi","Africa_Ndjamena", "AfricaNdjamena","Africa_Sao_Tome", "AfricaSao_Tome","Africa_Tripoli", "AfricaTripoli","Africa_Tunis", "AfricaTunis","Africa_Windhoek", "AfricaWindhoek","America_Adak", "AmericaAdak","America_Anchorage", "AmericaAnchorage","America_Araguaina", "AmericaAraguaina","America_Argentina_Buenos_Aires", "AmericaArgentinaBuenos_Aires","America_Argentina_Catamarca", "AmericaArgentinaCatamarca","America_Argentina_Cordoba", "AmericaArgentinaCordoba","America_Argentina_Jujuy", "AmericaArgentinaJujuy","America_Argentina_La_Rioja", "AmericaArgentinaLa_Rioja","America_Argentina_Mendoza", "AmericaArgentinaMendoza","America_Argentina_Rio_Gallegos", "AmericaArgentinaRio_Gallegos","America_Argentina_Salta", "AmericaArgentinaSalta","America_Argentina_San_Juan", "AmericaArgentinaSan_Juan","America_Argentina_San_Luis", "AmericaArgentinaSan_Luis","America_Argentina_Tucuman", "AmericaArgentinaTucuman","America_Argentina_Ushuaia", "AmericaArgentinaUshuaia","America_Asuncion", "AmericaAsuncion","America_Bahia", "AmericaBahia","America_Bahia_Banderas", "AmericaBahia_Banderas","America_Barbados", "AmericaBarbados","America_Belem", "AmericaBelem","America_Belize", "AmericaBelize","America_Boa_Vista", "AmericaBoa_Vista","America_Bogota", "AmericaBogota","America_Boise", "AmericaBoise","America_Cambridge_Bay", "AmericaCambridge_Bay","America_Campo_Grande", "AmericaCampo_Grande","America_Cancun", "AmericaCancun","America_Caracas", "AmericaCaracas","America_Cayenne", "AmericaCayenne","America_Chicago", "AmericaChicago","America_Chihuahua", "AmericaChihuahua","America_Ciudad_Juarez", "AmericaCiudad_Juarez","America_Costa_Rica", "AmericaCosta_Rica","America_Cuiaba", "AmericaCuiaba","America_Danmarkshavn", "AmericaDanmarkshavn","America_Dawson", "AmericaDawson","America_Dawson_Creek", "AmericaDawson_Creek","America_Denver", "AmericaDenver","America_Detroit", "AmericaDetroit","America_Edmonton", "AmericaEdmonton","America_Eirunepe", "AmericaEirunepe","America_El_Salvador", "AmericaEl_Salvador","America_Fort_Nelson", "AmericaFort_Nelson","America_Fortaleza", "AmericaFortaleza","America_Glace_Bay", "AmericaGlace_Bay","America_Goose_Bay", "AmericaGoose_Bay","America_Grand_Turk", "AmericaGrand_Turk","America_Guatemala", "AmericaGuatemala","America_Guayaquil", "AmericaGuayaquil","America_Guyana", "AmericaGuyana","America_Halifax", "AmericaHalifax","America_Havana", "AmericaHavana","America_Hermosillo", "AmericaHermosillo","America_Indiana_Indianapolis", "AmericaIndianaIndianapolis","America_Indiana_Knox", "AmericaIndianaKnox","America_Indiana_Marengo", "AmericaIndianaMarengo","America_Indiana_Petersburg", "AmericaIndianaPetersburg","America_Indiana_Tell_City", "AmericaIndianaTell_City","America_Indiana_Vevay", "AmericaIndianaVevay","America_Indiana_Vincennes", "AmericaIndianaVincennes","America_Indiana_Winamac", "AmericaIndianaWinamac","America_Inuvik", "AmericaInuvik","America_Iqaluit", "AmericaIqaluit","America_Jamaica", "AmericaJamaica","America_Juneau", "AmericaJuneau","America_Kentucky_Louisville", "AmericaKentuckyLouisville","America_Kentucky_Monticello", "AmericaKentuckyMonticello","America_La_Paz", "AmericaLa_Paz","America_Lima", "AmericaLima","America_Los_Angeles", "AmericaLos_Angeles","America_Maceio", "AmericaMaceio","America_Managua", "AmericaManagua","America_Manaus", "AmericaManaus","America_Martinique", "AmericaMartinique","America_Matamoros", "AmericaMatamoros","America_Mazatlan", "AmericaMazatlan","America_Menominee", "AmericaMenominee","America_Merida", "AmericaMerida","America_Metlakatla", "AmericaMetlakatla","America_Mexico_City", "AmericaMexico_City","America_Miquelon", "AmericaMiquelon","America_Moncton", "AmericaMoncton","America_Monterrey", "AmericaMonterrey","America_Montevideo", "AmericaMontevideo","America_New_York", "AmericaNew_York","America_Nome", "AmericaNome","America_Noronha", "AmericaNoronha","America_North_Dakota_Beulah", "AmericaNorth_DakotaBeulah","America_North_Dakota_Center", "AmericaNorth_DakotaCenter","America_North_Dakota_New_Salem", "AmericaNorth_DakotaNew_Salem","America_Nuuk", "AmericaNuuk","America_Ojinaga", "AmericaOjinaga","America_Panama", "AmericaPanama","America_Paramaribo", "AmericaParamaribo","America_Phoenix", "AmericaPhoenix","America_Port_au_Prince", "AmericaPort-au-Prince","America_Porto_Velho", "AmericaPorto_Velho","America_Puerto_Rico", "AmericaPuerto_Rico","America_Punta_Arenas", "AmericaPunta_Arenas","America_Rankin_Inlet", "AmericaRankin_Inlet","America_Recife", "AmericaRecife","America_Regina", "AmericaRegina","America_Resolute", "AmericaResolute","America_Rio_Branco", "AmericaRio_Branco","America_Santarem", "AmericaSantarem","America_Santiago", "AmericaSantiago","America_Santo_Domingo", "AmericaSanto_Domingo","America_Sao_Paulo", "AmericaSao_Paulo","America_Scoresbysund", "AmericaScoresbysund","America_Sitka", "AmericaSitka","America_St_Johns", "AmericaSt_Johns","America_Swift_Current", "AmericaSwift_Current","America_Tegucigalpa", "AmericaTegucigalpa","America_Thule", "AmericaThule","America_Tijuana", "AmericaTijuana","America_Toronto", "AmericaToronto","America_Vancouver", "AmericaVancouver","America_Whitehorse", "AmericaWhitehorse","America_Winnipeg", "AmericaWinnipeg","America_Yakutat", "AmericaYakutat","Antarctica_Casey", "AntarcticaCasey","Antarctica_Davis", "AntarcticaDavis","Antarctica_Macquarie", "AntarcticaMacquarie","Antarctica_Mawson", "AntarcticaMawson","Antarctica_Palmer", "AntarcticaPalmer","Antarctica_Rothera", "AntarcticaRothera","Antarctica_Troll", "AntarcticaTroll","Asia_Almaty", "AsiaAlmaty","Asia_Amman", "AsiaAmman","Asia_Anadyr", "AsiaAnadyr","Asia_Aqtau", "AsiaAqtau","Asia_Aqtobe", "AsiaAqtobe","Asia_Ashgabat", "AsiaAshgabat","Asia_Atyrau", "AsiaAtyrau","Asia_Baghdad", "AsiaBaghdad","Asia_Baku", "AsiaBaku","Asia_Bangkok", "AsiaBangkok","Asia_Barnaul", "AsiaBarnaul","Asia_Beirut", "AsiaBeirut","Asia_Bishkek", "AsiaBishkek","Asia_Chita", "AsiaChita","Asia_Choibalsan", "AsiaChoibalsan","Asia_Colombo", "AsiaColombo","Asia_Damascus", "AsiaDamascus","Asia_Dhaka", "AsiaDhaka","Asia_Dili", "AsiaDili","Asia_Dubai", "AsiaDubai","Asia_Dushanbe", "AsiaDushanbe","Asia_Famagusta", "AsiaFamagusta","Asia_Gaza", "AsiaGaza","Asia_Hebron", "AsiaHebron","Asia_Ho_Chi_Minh", "AsiaHo_Chi_Minh","Asia_Hong_Kong", "AsiaHong_Kong","Asia_Hovd", "AsiaHovd","Asia_Irkutsk", "AsiaIrkutsk","Asia_Jakarta", "AsiaJakarta","Asia_Jayapura", "AsiaJayapura","Asia_Jerusalem", "AsiaJerusalem","Asia_Kabul", "AsiaKabul","Asia_Kamchatka", "AsiaKamchatka","Asia_Karachi", "AsiaKarachi","Asia_Kathmandu", "AsiaKathmandu","Asia_Khandyga", "AsiaKhandyga","Asia_Kolkata", "AsiaKolkata","Asia_Krasnoyarsk", "AsiaKrasnoyarsk","Asia_Kuching", "AsiaKuching","Asia_Macau", "AsiaMacau","Asia_Magadan", "AsiaMagadan","Asia_Makassar", "AsiaMakassar","Asia_Manila", "AsiaManila","Asia_Nicosia", "AsiaNicosia","Asia_Novokuznetsk", "AsiaNovokuznetsk","Asia_Novosibirsk", "AsiaNovosibirsk","Asia_Omsk", "AsiaOmsk","Asia_Oral", "AsiaOral","Asia_Pontianak", "AsiaPontianak","Asia_Pyongyang", "AsiaPyongyang","Asia_Qatar", "AsiaQatar","Asia_Qostanay", "AsiaQostanay","Asia_Qyzylorda", "AsiaQyzylorda","Asia_Riyadh", "AsiaRiyadh","Asia_Sakhalin", "AsiaSakhalin","Asia_Samarkand", "AsiaSamarkand","Asia_Seoul", "AsiaSeoul","Asia_Shanghai", "AsiaShanghai","Asia_Singapore", "AsiaSingapore","Asia_Srednekolymsk", "AsiaSrednekolymsk","Asia_Taipei", "AsiaTaipei","Asia_Tashkent", "AsiaTashkent","Asia_Tbilisi", "AsiaTbilisi","Asia_Tehran", "AsiaTehran","Asia_Thimphu", "AsiaThimphu","Asia_Tokyo", "AsiaTokyo","Asia_Tomsk", "AsiaTomsk","Asia_Ulaanbaatar", "AsiaUlaanbaatar","Asia_Urumqi", "AsiaUrumqi","Asia_Ust_Nera", "AsiaUst-Nera","Asia_Vladivostok", "AsiaVladivostok","Asia_Yakutsk", "AsiaYakutsk","Asia_Yangon", "AsiaYangon","Asia_Yekaterinburg", "AsiaYekaterinburg","Asia_Yerevan", "AsiaYerevan","Atlantic_Azores", "AtlanticAzores","Atlantic_Bermuda", "AtlanticBermuda","Atlantic_Canary", "AtlanticCanary","Atlantic_Cape_Verde", "AtlanticCape_Verde","Atlantic_Faroe", "AtlanticFaroe","Atlantic_Madeira", "AtlanticMadeira","Atlantic_South_Georgia", "AtlanticSouth_Georgia","Atlantic_Stanley", "AtlanticStanley","Australia_Adelaide", "AustraliaAdelaide","Australia_Brisbane", "AustraliaBrisbane","Australia_Broken_Hill", "AustraliaBroken_Hill","Australia_Darwin", "AustraliaDarwin","Australia_Eucla", "AustraliaEucla","Australia_Hobart", "AustraliaHobart","Australia_Lindeman", "AustraliaLindeman","Australia_Lord_Howe", "AustraliaLord_Howe","Australia_Melbourne", "AustraliaMelbourne","Australia_Perth", "AustraliaPerth","Australia_Sydney", "AustraliaSydney","CET", "CET","CST6CDT", "CST6CDT","EET", "EET","EST", "EST","EST5EDT", "EST5EDT","Europe_Andorra", "EuropeAndorra","Europe_Astrakhan", "EuropeAstrakhan","Europe_Athens", "EuropeAthens","Europe_Belgrade", "EuropeBelgrade","Europe_Berlin", "EuropeBerlin","Europe_Brussels", "EuropeBrussels","Europe_Bucharest", "EuropeBucharest","Europe_Budapest", "EuropeBudapest","Europe_Chisinau", "EuropeChisinau","Europe_Dublin", "EuropeDublin","Europe_Gibraltar", "EuropeGibraltar","Europe_Helsinki", "EuropeHelsinki","Europe_Istanbul", "EuropeIstanbul","Europe_Kaliningrad", "EuropeKaliningrad","Europe_Kirov", "EuropeKirov","Europe_Kyiv", "EuropeKyiv","Europe_Lisbon", "EuropeLisbon","Europe_London", "EuropeLondon","Europe_Madrid", "EuropeMadrid","Europe_Malta", "EuropeMalta","Europe_Minsk", "EuropeMinsk","Europe_Moscow", "EuropeMoscow","Europe_Paris", "EuropeParis","Europe_Prague", "EuropePrague","Europe_Riga", "EuropeRiga","Europe_Rome", "EuropeRome","Europe_Samara", "EuropeSamara","Europe_Saratov", "EuropeSaratov","Europe_Simferopol", "EuropeSimferopol","Europe_Sofia", "EuropeSofia","Europe_Tallinn", "EuropeTallinn","Europe_Tirane", "EuropeTirane","Europe_Ulyanovsk", "EuropeUlyanovsk","Europe_Vienna", "EuropeVienna","Europe_Vilnius", "EuropeVilnius","Europe_Volgograd", "EuropeVolgograd","Europe_Warsaw", "EuropeWarsaw","Europe_Zurich", "EuropeZurich","Factory", "Factory","HST", "HST","Indian_Chagos", "IndianChagos","Indian_Maldives", "IndianMaldives","Indian_Mauritius", "IndianMauritius","MET", "MET","MST", "MST","MST7MDT", "MST7MDT","PST8PDT", "PST8PDT","Pacific_Apia", "PacificApia","Pacific_Auckland", "PacificAuckland","Pacific_Bougainville", "PacificBougainville","Pacific_Chatham", "PacificChatham","Pacific_Easter", "PacificEaster","Pacific_Efate", "PacificEfate","Pacific_Fakaofo", "PacificFakaofo","Pacific_Fiji", "PacificFiji","Pacific_Galapagos", "PacificGalapagos","Pacific_Gambier", "PacificGambier","Pacific_Guadalcanal", "PacificGuadalcanal","Pacific_Guam", "PacificGuam","Pacific_Honolulu", "PacificHonolulu","Pacific_Kanton", "PacificKanton","Pacific_Kiritimati", "PacificKiritimati","Pacific_Kosrae", "PacificKosrae","Pacific_Kwajalein", "PacificKwajalein","Pacific_Marquesas", "PacificMarquesas","Pacific_Nauru", "PacificNauru","Pacific_Niue", "PacificNiue","Pacific_Norfolk", "PacificNorfolk","Pacific_Noumea", "PacificNoumea","Pacific_Pago_Pago", "PacificPago_Pago","Pacific_Palau", "PacificPalau","Pacific_Pitcairn", "PacificPitcairn","Pacific_Port_Moresby", "PacificPort_Moresby","Pacific_Rarotonga", "PacificRarotonga","Pacific_Tahiti", "PacificTahiti","Pacific_Tarawa", "PacificTarawa","Pacific_Tongatapu", "PacificTongatapu","WET", "WET");
		this.mapped[29] = greycat.types_by_name.get(core.nodeGeo.name);
		this.mapped[30] = greycat.types_by_name.get(core.ti3d.name);
		this.mapped[31] = greycat.types_by_name.get(core.Tuple.name);
		this.mapped[31].resolveGeneratedOffsets("x","y");
		this.mapped[32] = greycat.types_by_name.get(core.nodeIndex.name);
		this.mapped[33] = greycat.types_by_name.get(core.tf2d.name);
		this.mapped[34] = greycat.types_by_name.get(core.GeoBox.name);
		this.mapped[34].resolveGeneratedOffsets("sw","ne");
		this.mapped[35] = greycat.types_by_name.get(core.Array.name);
		this.mapped[36] = greycat.types_by_name.get(core.String.name);
		this.mapped[37] = greycat.types_by_name.get(core.ti5d.name);
		this.mapped[38] = greycat.types_by_name.get(util.SlidingWindow.name);
		this.mapped[39] = greycat.types_by_name.get(util.Random.name);
		this.mapped[39].resolveGeneratedOffsets("seed","v");
		this.mapped[40] = greycat.types_by_name.get(util.TimeWindow.name);
		this.mapped[41] = greycat.types_by_name.get(util.HistogramInt.name);
		this.mapped[41].static_values = new java.lang.Object[]{0L,1L,2L,3L};
		this.mapped[42] = greycat.types_by_name.get(util.ProgressTracker.name);
		this.mapped[42].resolveGeneratedOffsets("start","total","counter","duration","progress","speed","remaining");
		this.mapped[43] = greycat.types_by_name.get(util.BoxPlotFloat.name);
		this.mapped[43].resolveGeneratedOffsets("min","max","whiskerLow","whiskerHigh","percentile1","percentile5","percentile25","percentile50","percentile75","percentile95","percentile99","countOutliersLow","countOutliersHigh","percentageOutliersLow","percentageOutliersHigh","sum","avg","std","size");
		this.mapped[44] = greycat.types_by_name.get(util.Buffer.name);
		this.mapped[45] = greycat.types_by_name.get(util.Crypto.name);
		this.mapped[46] = greycat.types_by_name.get(util.HistogramFloat.name);
		this.mapped[46].static_values = new java.lang.Object[]{0L,1L,2L,3L};
		this.mapped[47] = greycat.types_by_name.get(util.Quantizer.name);
		this.mapped[48] = greycat.types_by_name.get(util.Assert.name);
		this.mapped[49] = greycat.types_by_name.get(util.GaussianProfile.name);
		this.mapped[49].static_values = new java.lang.Object[]{0L,1L,2L,3L,4L,5L,6L};
		this.mapped[50] = greycat.types_by_name.get(util.Iban.name);
		this.mapped[51] = greycat.types_by_name.get(util.BoxPlotInt.name);
		this.mapped[51].resolveGeneratedOffsets("min","max","whiskerLow","whiskerHigh","percentile1","percentile5","percentile25","percentile50","percentile75","percentile95","percentile99","countOutliersLow","countOutliersHigh","percentageOutliersLow","percentageOutliersHigh","sum","avg","std","size");
		this.mapped[52] = greycat.types_by_name.get(util.Gaussian.name);
		this.mapped[52].resolveGeneratedOffsets("sum","sum_sq","count","min","max");
		this.mapped[53] = greycat.types_by_name.get(util.Queue.name);
		this.mapped[54] = greycat.types_by_name.get(math.MathConstants.name);
		this.mapped[54].static_values = new java.lang.Object[]{2.7182818285,1.4426950409,0.4342944819,0.6931471806,2.302585093,3.1415926536,1.5707963268,0.7853981634,0.3183098862,0.6366197724,1.1283791671,1.4142135624,0.7071067812};
		this.mapped[55] = greycat.types_by_name.get(runtime.Task.name);
		this.mapped[55].resolveGeneratedOffsets("user_id","task_id","mod","type","fun","creation","status");
		this.mapped[56] = greycat.types_by_name.get(runtime.UserCredential.name);
		this.mapped[56].resolveGeneratedOffsets("offset","pass");
		this.mapped[57] = greycat.types_by_name.get(runtime.SecurityPolicy.name);
		this.mapped[57].resolveGeneratedOffsets("entities","credentials","roles","fields");
		this.mapped[58] = greycat.types_by_name.get(runtime.UserRole.name);
		this.mapped[58].resolveGeneratedOffsets("name","permissions");
		this.mapped[59] = greycat.types_by_name.get(runtime.System.name);
		this.mapped[60] = greycat.types_by_name.get(runtime.SecurityFields.name);
		this.mapped[60].resolveGeneratedOffsets("email","name","first_name","last_name","roles","groups");
		this.mapped[61] = greycat.types_by_name.get(runtime.UserGroupPolicyType.name);
		this.mapped[61].resolveGeneratedOffsetWithValues("read", 0L,"write", 1L,"execute", 2L);
		this.mapped[62] = greycat.types_by_name.get(runtime.License.name);
		this.mapped[62].resolveGeneratedOffsets("name","start","end","company","max_workers","max_memory","extra_1","extra_2","extra_3","extra_4");
		this.mapped[63] = greycat.types_by_name.get(runtime.SecurityEntity.name);
		this.mapped[63].resolveGeneratedOffsets("id","name","activated");
		this.mapped[64] = greycat.types_by_name.get(runtime.RuntimeInfo.name);
		this.mapped[64].resolveGeneratedOffsets("version","arch","timezone","license","io_threads","bg_threads","fg_threads","mem_total","mem_worker","nb_ctx","store_stats");
		this.mapped[65] = greycat.types_by_name.get(runtime.User.name);
		this.mapped[65].resolveGeneratedOffsets("id","name","activated","full_name","email","role","permissions_flags","groups","groups_flags","external");
		this.mapped[66] = greycat.types_by_name.get(runtime.TaskInfo.name);
		this.mapped[66].resolveGeneratedOffsets("user_id","task_id","mod","type","fun","creation","status","start","progress","remaining","duration","sub_waiting","sub_tasks_all");
		this.mapped[67] = greycat.types_by_name.get(runtime.PeriodicTask.name);
		this.mapped[67].resolveGeneratedOffsets("name","user_id","args","start","every");
		this.mapped[68] = greycat.types_by_name.get(runtime.OpenIDConnect.name);
		this.mapped[68].resolveGeneratedOffsets("url","clientId");
		this.mapped[69] = greycat.types_by_name.get(runtime.UserGroup.name);
		this.mapped[69].resolveGeneratedOffsets("id","name","activated");
		this.mapped[70] = greycat.types_by_name.get(runtime.StoreStat.name);
		this.mapped[70].resolveGeneratedOffsets("capacity_bytes","allocated_bytes","allocated_ratio","remained_bytes","remained_ratio","used_bytes","used_ratio","available_bytes","available_ratio");
		this.mapped[71] = greycat.types_by_name.get(runtime.TaskStatus.name);
		this.mapped[71].resolveGeneratedOffsetWithValues("empty", 0L,"waiting", 1L,"running", 2L,"cancelled", 3L,"error", 4L,"ended", 5L);
		this.mapped[72] = greycat.types_by_name.get(runtime.Runtime.name);
		this.mapped[73] = greycat.types_by_name.get(runtime.UserGroupPolicy.name);
		this.mapped[73].resolveGeneratedOffsets("group_id","type");
		this.mapped[74] = greycat.types_by_name.get(io.CsvColumnFloat.name);
		this.mapped[74].resolveGeneratedOffsets("name","mandatory");
		this.mapped[75] = greycat.types_by_name.get(io.Http.name);
		this.mapped[76] = greycat.types_by_name.get(io.HttpHeader.name);
		this.mapped[76].resolveGeneratedOffsets("name","value");
		this.mapped[77] = greycat.types_by_name.get(io.SmtpMode.name);
		this.mapped[77].resolveGeneratedOffsetWithValues("plain", 0L,"ssl_tls", 1L,"starttls", 2L);
		this.mapped[78] = greycat.types_by_name.get(io.Smtp.name);
		this.mapped[78].resolveGeneratedOffsets("host","port","mode","authenticate","user","pass");
		this.mapped[79] = greycat.types_by_name.get(io.CsvColumnIgnored.name);
		this.mapped[79].resolveGeneratedOffsets("name","mandatory");
		this.mapped[80] = greycat.types_by_name.get(io.SmtpAuth.name);
		this.mapped[80].resolveGeneratedOffsetWithValues("none", 0L,"plain", 1L,"login", 2L);
		this.mapped[81] = greycat.types_by_name.get(io.TextEncoder.name);
		this.mapped[81].resolveGeneratedOffsetWithValues("plain", null,"base64", null,"base64url", null,"hexadecimal", null);
		this.mapped[82] = greycat.types_by_name.get(io.CsvColumn.name);
		this.mapped[82].resolveGeneratedOffsets("name","mandatory");
		this.mapped[83] = greycat.types_by_name.get(io.CsvColumnBoolean.name);
		this.mapped[83].resolveGeneratedOffsets("name","mandatory");
		this.mapped[84] = greycat.types_by_name.get(io.Url.name);
		this.mapped[84].resolveGeneratedOffsets("protocol","host","port","path","params","hash");
		this.mapped[85] = greycat.types_by_name.get(io.CsvColumnDate.name);
		this.mapped[85].resolveGeneratedOffsets("name","mandatory","format","tz","as_time");
		this.mapped[86] = greycat.types_by_name.get(io.CsvColumnTime.name);
		this.mapped[86].resolveGeneratedOffsets("name","mandatory","unit");
		this.mapped[87] = greycat.types_by_name.get(io.Email.name);
		this.mapped[87].resolveGeneratedOffsets("from","subject","body","body_is_html","to","cc","bcc");
		this.mapped[88] = greycat.types_by_name.get(io.CsvColumnDuration.name);
		this.mapped[88].resolveGeneratedOffsets("name","mandatory","unit");
		this.mapped[89] = greycat.types_by_name.get(io.File.name);
		this.mapped[89].resolveGeneratedOffsets("path","size","last_modification");
		this.mapped[90] = greycat.types_by_name.get(io.CsvColumnString.name);
		this.mapped[90].resolveGeneratedOffsets("name","mandatory","trim","try_number","try_json","values","encoder");
		this.mapped[91] = greycat.types_by_name.get(io.CsvColumnInteger.name);
		this.mapped[91].resolveGeneratedOffsets("name","mandatory");
		this.mapped[92] = greycat.types_by_name.get(io.CsvFormat.name);
		this.mapped[92].resolveGeneratedOffsets("header_lines","infer","separator","string_delimiter","decimal_separator","thousands_separator","columns");
	}
}
