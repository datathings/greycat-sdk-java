// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package greycat;

@SuppressWarnings({"unused", "unchecked"})
public final class gc {
  public static final class core {
    public static final class geo extends greycat.std_n.core.geo {
      public static final java.lang.String name = "core::geo";

      public geo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public geo(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[0]);
      }
    }
    public static final class VectorIndex<T> extends GreyCat.Object {
      public static final java.lang.String name = "core::VectorIndex";

      private VectorIndex(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public VectorIndex(greycat.gc.core.nodeIndex<greycat.gc.core.node<core.Tensor>, T> values, java.lang.Long count, java.lang.Long max_level, greycat.gc.core.node<core.VectorVertex> entry_node_ref, util.Random rng, core.TensorDistance distance) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[1], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[1].map_attributes(new Object[] {values, count, max_level, entry_node_ref, rng, distance}));
      }
      public greycat.gc.core.nodeIndex<greycat.gc.core.node<core.Tensor>, T> values() {
        return (greycat.gc.core.nodeIndex<greycat.gc.core.node<core.Tensor>, T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_values(greycat.gc.core.nodeIndex<greycat.gc.core.node<core.Tensor>, T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long max_level() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_max_level(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public greycat.gc.core.node<core.VectorVertex> entry_node_ref() {
        return (greycat.gc.core.node<core.VectorVertex>) getAttribute(type.generated_offsets[3]);
      }
      public void set_entry_node_ref(greycat.gc.core.node<core.VectorVertex> v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public util.Random rng() {
        return (util.Random) getAttribute(type.generated_offsets[4]);
      }
      public void set_rng(util.Random v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public core.TensorDistance distance() {
        return (core.TensorDistance) getAttribute(type.generated_offsets[5]);
      }
      public void set_distance(core.TensorDistance v) {
        setAttribute(type.generated_offsets[5], v);
      }
    }
    public static final class t3 extends greycat.std_n.core.t3 {
      public static final java.lang.String name = "core::t3";

      public t3(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public t3(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[2]);
      }
    }
    public static final class t2f extends greycat.std_n.core.t2f {
      public static final java.lang.String name = "core::t2f";

      public t2f(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public t2f(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[3]);
      }
    }
    public static final class t4 extends greycat.std_n.core.t4 {
      public static final java.lang.String name = "core::t4";

      public t4(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public t4(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[4]);
      }
    }
    public static final class GeoBox extends GreyCat.Object {
      public static final java.lang.String name = "core::GeoBox";

      private GeoBox(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public GeoBox(greycat.gc.core.geo sw, greycat.gc.core.geo ne) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[5], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[5].map_attributes(new Object[] {sw, ne}));
      }
      public greycat.gc.core.geo sw() {
        return (greycat.gc.core.geo) getAttribute(type.generated_offsets[0]);
      }
      public void set_sw(greycat.gc.core.geo v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public greycat.gc.core.geo ne() {
        return (greycat.gc.core.geo) getAttribute(type.generated_offsets[1]);
      }
      public void set_ne(greycat.gc.core.geo v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class t2 extends greycat.std_n.core.t2 {
      public static final java.lang.String name = "core::t2";

      public t2(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public t2(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[6]);
      }
    }
    public static final class nodeTime<T> extends greycat.std_n.core.nodeTime<T> {
      public static final java.lang.String name = "core::nodeTime";

      public nodeTime(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public nodeTime(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[7]);
      }
    }
    public static final class nodeIndexBucket<K,V> extends GreyCat.Object {
      public static final java.lang.String name = "core::nodeIndexBucket";

      private nodeIndexBucket(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public nodeIndexBucket(K key, V value, core.nodeIndexBucket<K, V> next) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[8], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[8].map_attributes(new Object[] {key, value, next}));
      }
      public K key() {
        return (K) getAttribute(type.generated_offsets[0]);
      }
      public void set_key(K v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public V value() {
        return (V) getAttribute(type.generated_offsets[1]);
      }
      public void set_value(V v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.nodeIndexBucket<K, V> next() {
        return (core.nodeIndexBucket<K, V>) getAttribute(type.generated_offsets[2]);
      }
      public void set_next(core.nodeIndexBucket<K, V> v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class String extends greycat.std_n.core.String {
      public static final java.lang.String name = "core::String";

      public String(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public String(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[9]);
      }
    }
    public static final class FloatPrecision extends GreyCat.Enum {
      public static final java.lang.String name = "core::FloatPrecision";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("p1", 0);
        indicesByValues.put("p10", 1);
        indicesByValues.put("p100", 2);
        indicesByValues.put("p1000", 3);
        indicesByValues.put("p10000", 4);
        indicesByValues.put("p100000", 5);
        indicesByValues.put("p1000000", 6);
        indicesByValues.put("p10000000", 7);
        indicesByValues.put("p100000000", 8);
        indicesByValues.put("p1000000000", 9);
        indicesByValues.put("p10000000000", 10);
      }

      private FloatPrecision(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public FloatPrecision() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[10], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[10].map_attributes(new Object[] {}));
      }
      public static FloatPrecision get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static FloatPrecision get(java.lang.String key, GreyCat greycat) {
        return (FloatPrecision) greycat.libs_by_name.get(std.name).mapped[10].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class field extends greycat.std_n.core.field {
      public static final java.lang.String name = "core::field";

      public field(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public field(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[11]);
      }
    }
    public static final class nodeList<T> extends greycat.std_n.core.nodeList<T> {
      public static final java.lang.String name = "core::nodeList";

      public nodeList(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public nodeList(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[12]);
      }
    }
    public static final class Tensor extends greycat.std_n.core.Tensor {
      public static final java.lang.String name = "core::Tensor";

      public Tensor(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public Tensor(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[13]);
      }
    }
    public static final class time extends greycat.std_n.core.time {
      public static final java.lang.String name = "core::time";

      public time(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public time(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[14]);
      }
    }
    public static final class TensorType extends GreyCat.Enum {
      public static final java.lang.String name = "core::TensorType";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("i32", 0);
        indicesByValues.put("i64", 1);
        indicesByValues.put("f32", 2);
        indicesByValues.put("f64", 3);
        indicesByValues.put("c64", 4);
        indicesByValues.put("c128", 5);
      }

      private TensorType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TensorType() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[15], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[15].map_attributes(new Object[] {}));
      }
      public static TensorType get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static TensorType get(java.lang.String key, GreyCat greycat) {
        return (TensorType) greycat.libs_by_name.get(std.name).mapped[15].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class DurationUnit extends GreyCat.Enum {
      public static final java.lang.String name = "core::DurationUnit";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("microseconds", 0);
        indicesByValues.put("milliseconds", 1);
        indicesByValues.put("seconds", 2);
        indicesByValues.put("minutes", 3);
        indicesByValues.put("hours", 4);
        indicesByValues.put("days", 5);
      }

      private DurationUnit(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public DurationUnit() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[16], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[16].map_attributes(new Object[] {}));
      }
      public static DurationUnit get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static DurationUnit get(java.lang.String key, GreyCat greycat) {
        return (DurationUnit) greycat.libs_by_name.get(std.name).mapped[16].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class Map<K,V> extends greycat.std_n.core.Map<K,V> {
      public static final java.lang.String name = "core::Map";

      public Map(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public Map(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[17]);
      }
    }
    public static final class VectorVertex extends GreyCat.Object {
      public static final java.lang.String name = "core::VectorVertex";

      private VectorVertex(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public VectorVertex(greycat.gc.core.node<core.Tensor> vector, core.Array<java.lang.Long> level_sizes, core.Array<greycat.gc.core.node<core.VectorVertex>> neighbour_nodes) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[18], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[18].map_attributes(new Object[] {vector, level_sizes, neighbour_nodes}));
      }
      public greycat.gc.core.node<core.Tensor> vector() {
        return (greycat.gc.core.node<core.Tensor>) getAttribute(type.generated_offsets[0]);
      }
      public void set_vector(greycat.gc.core.node<core.Tensor> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<java.lang.Long> level_sizes() {
        return (core.Array<java.lang.Long>) getAttribute(type.generated_offsets[1]);
      }
      public void set_level_sizes(core.Array<java.lang.Long> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Array<greycat.gc.core.node<core.VectorVertex>> neighbour_nodes() {
        return (core.Array<greycat.gc.core.node<core.VectorVertex>>) getAttribute(type.generated_offsets[2]);
      }
      public void set_neighbour_nodes(core.Array<greycat.gc.core.node<core.VectorVertex>> v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class t4f extends greycat.std_n.core.t4f {
      public static final java.lang.String name = "core::t4f";

      public t4f(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public t4f(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[19]);
      }
    }
    public static final class SortOrder extends GreyCat.Enum {
      public static final java.lang.String name = "core::SortOrder";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("asc", 0);
        indicesByValues.put("desc", 1);
      }

      private SortOrder(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SortOrder() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[20], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[20].map_attributes(new Object[] {}));
      }
      public static SortOrder get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static SortOrder get(java.lang.String key, GreyCat greycat) {
        return (SortOrder) greycat.libs_by_name.get(std.name).mapped[20].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class TimeZone extends GreyCat.Enum {
      public static final java.lang.String name = "core::TimeZone";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("UTC", 0);
        indicesByValues.put("Africa/Abidjan", 1);
        indicesByValues.put("Africa/Accra", 2);
        indicesByValues.put("Africa/Addis_Ababa", 3);
        indicesByValues.put("Africa/Algiers", 4);
        indicesByValues.put("Africa/Asmara", 5);
        indicesByValues.put("Africa/Asmera", 6);
        indicesByValues.put("Africa/Bamako", 7);
        indicesByValues.put("Africa/Bangui", 8);
        indicesByValues.put("Africa/Banjul", 9);
        indicesByValues.put("Africa/Bissau", 10);
        indicesByValues.put("Africa/Blantyre", 11);
        indicesByValues.put("Africa/Brazzaville", 12);
        indicesByValues.put("Africa/Bujumbura", 13);
        indicesByValues.put("Africa/Cairo", 14);
        indicesByValues.put("Africa/Casablanca", 15);
        indicesByValues.put("Africa/Ceuta", 16);
        indicesByValues.put("Africa/Conakry", 17);
        indicesByValues.put("Africa/Dakar", 18);
        indicesByValues.put("Africa/Dar_es_Salaam", 19);
        indicesByValues.put("Africa/Djibouti", 20);
        indicesByValues.put("Africa/Douala", 21);
        indicesByValues.put("Africa/El_Aaiun", 22);
        indicesByValues.put("Africa/Freetown", 23);
        indicesByValues.put("Africa/Gaborone", 24);
        indicesByValues.put("Africa/Harare", 25);
        indicesByValues.put("Africa/Johannesburg", 26);
        indicesByValues.put("Africa/Juba", 27);
        indicesByValues.put("Africa/Kampala", 28);
        indicesByValues.put("Africa/Khartoum", 29);
        indicesByValues.put("Africa/Kigali", 30);
        indicesByValues.put("Africa/Kinshasa", 31);
        indicesByValues.put("Africa/Lagos", 32);
        indicesByValues.put("Africa/Libreville", 33);
        indicesByValues.put("Africa/Lome", 34);
        indicesByValues.put("Africa/Luanda", 35);
        indicesByValues.put("Africa/Lubumbashi", 36);
        indicesByValues.put("Africa/Lusaka", 37);
        indicesByValues.put("Africa/Malabo", 38);
        indicesByValues.put("Africa/Maputo", 39);
        indicesByValues.put("Africa/Maseru", 40);
        indicesByValues.put("Africa/Mbabane", 41);
        indicesByValues.put("Africa/Mogadishu", 42);
        indicesByValues.put("Africa/Monrovia", 43);
        indicesByValues.put("Africa/Nairobi", 44);
        indicesByValues.put("Africa/Ndjamena", 45);
        indicesByValues.put("Africa/Niamey", 46);
        indicesByValues.put("Africa/Nouakchott", 47);
        indicesByValues.put("Africa/Ouagadougou", 48);
        indicesByValues.put("Africa/Porto-Novo", 49);
        indicesByValues.put("Africa/Sao_Tome", 50);
        indicesByValues.put("Africa/Timbuktu", 51);
        indicesByValues.put("Africa/Tripoli", 52);
        indicesByValues.put("Africa/Tunis", 53);
        indicesByValues.put("Africa/Windhoek", 54);
        indicesByValues.put("America/Adak", 55);
        indicesByValues.put("America/Anchorage", 56);
        indicesByValues.put("America/Anguilla", 57);
        indicesByValues.put("America/Antigua", 58);
        indicesByValues.put("America/Araguaina", 59);
        indicesByValues.put("America/Argentina/Buenos_Aires", 60);
        indicesByValues.put("America/Argentina/Catamarca", 61);
        indicesByValues.put("America/Argentina/ComodRivadavia", 62);
        indicesByValues.put("America/Argentina/Cordoba", 63);
        indicesByValues.put("America/Argentina/Jujuy", 64);
        indicesByValues.put("America/Argentina/La_Rioja", 65);
        indicesByValues.put("America/Argentina/Mendoza", 66);
        indicesByValues.put("America/Argentina/Rio_Gallegos", 67);
        indicesByValues.put("America/Argentina/Salta", 68);
        indicesByValues.put("America/Argentina/San_Juan", 69);
        indicesByValues.put("America/Argentina/San_Luis", 70);
        indicesByValues.put("America/Argentina/Tucuman", 71);
        indicesByValues.put("America/Argentina/Ushuaia", 72);
        indicesByValues.put("America/Aruba", 73);
        indicesByValues.put("America/Asuncion", 74);
        indicesByValues.put("America/Atikokan", 75);
        indicesByValues.put("America/Atka", 76);
        indicesByValues.put("America/Bahia", 77);
        indicesByValues.put("America/Bahia_Banderas", 78);
        indicesByValues.put("America/Barbados", 79);
        indicesByValues.put("America/Belem", 80);
        indicesByValues.put("America/Belize", 81);
        indicesByValues.put("America/Blanc-Sablon", 82);
        indicesByValues.put("America/Boa_Vista", 83);
        indicesByValues.put("America/Bogota", 84);
        indicesByValues.put("America/Boise", 85);
        indicesByValues.put("America/Buenos_Aires", 86);
        indicesByValues.put("America/Cambridge_Bay", 87);
        indicesByValues.put("America/Campo_Grande", 88);
        indicesByValues.put("America/Cancun", 89);
        indicesByValues.put("America/Caracas", 90);
        indicesByValues.put("America/Catamarca", 91);
        indicesByValues.put("America/Cayenne", 92);
        indicesByValues.put("America/Cayman", 93);
        indicesByValues.put("America/Chicago", 94);
        indicesByValues.put("America/Chihuahua", 95);
        indicesByValues.put("America/Ciudad_Juarez", 96);
        indicesByValues.put("America/Coral_Harbour", 97);
        indicesByValues.put("America/Cordoba", 98);
        indicesByValues.put("America/Costa_Rica", 99);
        indicesByValues.put("America/Coyhaique", 100);
        indicesByValues.put("America/Creston", 101);
        indicesByValues.put("America/Cuiaba", 102);
        indicesByValues.put("America/Curacao", 103);
        indicesByValues.put("America/Danmarkshavn", 104);
        indicesByValues.put("America/Dawson", 105);
        indicesByValues.put("America/Dawson_Creek", 106);
        indicesByValues.put("America/Denver", 107);
        indicesByValues.put("America/Detroit", 108);
        indicesByValues.put("America/Dominica", 109);
        indicesByValues.put("America/Edmonton", 110);
        indicesByValues.put("America/Eirunepe", 111);
        indicesByValues.put("America/El_Salvador", 112);
        indicesByValues.put("America/Ensenada", 113);
        indicesByValues.put("America/Fort_Nelson", 114);
        indicesByValues.put("America/Fort_Wayne", 115);
        indicesByValues.put("America/Fortaleza", 116);
        indicesByValues.put("America/Glace_Bay", 117);
        indicesByValues.put("America/Godthab", 118);
        indicesByValues.put("America/Goose_Bay", 119);
        indicesByValues.put("America/Grand_Turk", 120);
        indicesByValues.put("America/Grenada", 121);
        indicesByValues.put("America/Guadeloupe", 122);
        indicesByValues.put("America/Guatemala", 123);
        indicesByValues.put("America/Guayaquil", 124);
        indicesByValues.put("America/Guyana", 125);
        indicesByValues.put("America/Halifax", 126);
        indicesByValues.put("America/Havana", 127);
        indicesByValues.put("America/Hermosillo", 128);
        indicesByValues.put("America/Indiana/Indianapolis", 129);
        indicesByValues.put("America/Indiana/Knox", 130);
        indicesByValues.put("America/Indiana/Marengo", 131);
        indicesByValues.put("America/Indiana/Petersburg", 132);
        indicesByValues.put("America/Indiana/Tell_City", 133);
        indicesByValues.put("America/Indiana/Vevay", 134);
        indicesByValues.put("America/Indiana/Vincennes", 135);
        indicesByValues.put("America/Indiana/Winamac", 136);
        indicesByValues.put("America/Indianapolis", 137);
        indicesByValues.put("America/Inuvik", 138);
        indicesByValues.put("America/Iqaluit", 139);
        indicesByValues.put("America/Jamaica", 140);
        indicesByValues.put("America/Jujuy", 141);
        indicesByValues.put("America/Juneau", 142);
        indicesByValues.put("America/Kentucky/Louisville", 143);
        indicesByValues.put("America/Kentucky/Monticello", 144);
        indicesByValues.put("America/Knox_IN", 145);
        indicesByValues.put("America/Kralendijk", 146);
        indicesByValues.put("America/La_Paz", 147);
        indicesByValues.put("America/Lima", 148);
        indicesByValues.put("America/Los_Angeles", 149);
        indicesByValues.put("America/Louisville", 150);
        indicesByValues.put("America/Lower_Princes", 151);
        indicesByValues.put("America/Maceio", 152);
        indicesByValues.put("America/Managua", 153);
        indicesByValues.put("America/Manaus", 154);
        indicesByValues.put("America/Marigot", 155);
        indicesByValues.put("America/Martinique", 156);
        indicesByValues.put("America/Matamoros", 157);
        indicesByValues.put("America/Mazatlan", 158);
        indicesByValues.put("America/Mendoza", 159);
        indicesByValues.put("America/Menominee", 160);
        indicesByValues.put("America/Merida", 161);
        indicesByValues.put("America/Metlakatla", 162);
        indicesByValues.put("America/Mexico_City", 163);
        indicesByValues.put("America/Miquelon", 164);
        indicesByValues.put("America/Moncton", 165);
        indicesByValues.put("America/Monterrey", 166);
        indicesByValues.put("America/Montevideo", 167);
        indicesByValues.put("America/Montreal", 168);
        indicesByValues.put("America/Montserrat", 169);
        indicesByValues.put("America/Nassau", 170);
        indicesByValues.put("America/New_York", 171);
        indicesByValues.put("America/Nipigon", 172);
        indicesByValues.put("America/Nome", 173);
        indicesByValues.put("America/Noronha", 174);
        indicesByValues.put("America/North_Dakota/Beulah", 175);
        indicesByValues.put("America/North_Dakota/Center", 176);
        indicesByValues.put("America/North_Dakota/New_Salem", 177);
        indicesByValues.put("America/Nuuk", 178);
        indicesByValues.put("America/Ojinaga", 179);
        indicesByValues.put("America/Panama", 180);
        indicesByValues.put("America/Pangnirtung", 181);
        indicesByValues.put("America/Paramaribo", 182);
        indicesByValues.put("America/Phoenix", 183);
        indicesByValues.put("America/Port-au-Prince", 184);
        indicesByValues.put("America/Port_of_Spain", 185);
        indicesByValues.put("America/Porto_Acre", 186);
        indicesByValues.put("America/Porto_Velho", 187);
        indicesByValues.put("America/Puerto_Rico", 188);
        indicesByValues.put("America/Punta_Arenas", 189);
        indicesByValues.put("America/Rainy_River", 190);
        indicesByValues.put("America/Rankin_Inlet", 191);
        indicesByValues.put("America/Recife", 192);
        indicesByValues.put("America/Regina", 193);
        indicesByValues.put("America/Resolute", 194);
        indicesByValues.put("America/Rio_Branco", 195);
        indicesByValues.put("America/Rosario", 196);
        indicesByValues.put("America/Santa_Isabel", 197);
        indicesByValues.put("America/Santarem", 198);
        indicesByValues.put("America/Santiago", 199);
        indicesByValues.put("America/Santo_Domingo", 200);
        indicesByValues.put("America/Sao_Paulo", 201);
        indicesByValues.put("America/Scoresbysund", 202);
        indicesByValues.put("America/Shiprock", 203);
        indicesByValues.put("America/Sitka", 204);
        indicesByValues.put("America/St_Barthelemy", 205);
        indicesByValues.put("America/St_Johns", 206);
        indicesByValues.put("America/St_Kitts", 207);
        indicesByValues.put("America/St_Lucia", 208);
        indicesByValues.put("America/St_Thomas", 209);
        indicesByValues.put("America/St_Vincent", 210);
        indicesByValues.put("America/Swift_Current", 211);
        indicesByValues.put("America/Tegucigalpa", 212);
        indicesByValues.put("America/Thule", 213);
        indicesByValues.put("America/Thunder_Bay", 214);
        indicesByValues.put("America/Tijuana", 215);
        indicesByValues.put("America/Toronto", 216);
        indicesByValues.put("America/Tortola", 217);
        indicesByValues.put("America/Vancouver", 218);
        indicesByValues.put("America/Virgin", 219);
        indicesByValues.put("America/Whitehorse", 220);
        indicesByValues.put("America/Winnipeg", 221);
        indicesByValues.put("America/Yakutat", 222);
        indicesByValues.put("America/Yellowknife", 223);
        indicesByValues.put("Antarctica/Casey", 224);
        indicesByValues.put("Antarctica/Davis", 225);
        indicesByValues.put("Antarctica/DumontDUrville", 226);
        indicesByValues.put("Antarctica/Macquarie", 227);
        indicesByValues.put("Antarctica/Mawson", 228);
        indicesByValues.put("Antarctica/McMurdo", 229);
        indicesByValues.put("Antarctica/Palmer", 230);
        indicesByValues.put("Antarctica/Rothera", 231);
        indicesByValues.put("Antarctica/South_Pole", 232);
        indicesByValues.put("Antarctica/Syowa", 233);
        indicesByValues.put("Antarctica/Troll", 234);
        indicesByValues.put("Antarctica/Vostok", 235);
        indicesByValues.put("Arctic/Longyearbyen", 236);
        indicesByValues.put("Asia/Aden", 237);
        indicesByValues.put("Asia/Almaty", 238);
        indicesByValues.put("Asia/Amman", 239);
        indicesByValues.put("Asia/Anadyr", 240);
        indicesByValues.put("Asia/Aqtau", 241);
        indicesByValues.put("Asia/Aqtobe", 242);
        indicesByValues.put("Asia/Ashgabat", 243);
        indicesByValues.put("Asia/Ashkhabad", 244);
        indicesByValues.put("Asia/Atyrau", 245);
        indicesByValues.put("Asia/Baghdad", 246);
        indicesByValues.put("Asia/Bahrain", 247);
        indicesByValues.put("Asia/Baku", 248);
        indicesByValues.put("Asia/Bangkok", 249);
        indicesByValues.put("Asia/Barnaul", 250);
        indicesByValues.put("Asia/Beirut", 251);
        indicesByValues.put("Asia/Bishkek", 252);
        indicesByValues.put("Asia/Brunei", 253);
        indicesByValues.put("Asia/Calcutta", 254);
        indicesByValues.put("Asia/Chita", 255);
        indicesByValues.put("Asia/Choibalsan", 256);
        indicesByValues.put("Asia/Chongqing", 257);
        indicesByValues.put("Asia/Chungking", 258);
        indicesByValues.put("Asia/Colombo", 259);
        indicesByValues.put("Asia/Dacca", 260);
        indicesByValues.put("Asia/Damascus", 261);
        indicesByValues.put("Asia/Dhaka", 262);
        indicesByValues.put("Asia/Dili", 263);
        indicesByValues.put("Asia/Dubai", 264);
        indicesByValues.put("Asia/Dushanbe", 265);
        indicesByValues.put("Asia/Famagusta", 266);
        indicesByValues.put("Asia/Gaza", 267);
        indicesByValues.put("Asia/Harbin", 268);
        indicesByValues.put("Asia/Hebron", 269);
        indicesByValues.put("Asia/Ho_Chi_Minh", 270);
        indicesByValues.put("Asia/Hong_Kong", 271);
        indicesByValues.put("Asia/Hovd", 272);
        indicesByValues.put("Asia/Irkutsk", 273);
        indicesByValues.put("Asia/Istanbul", 274);
        indicesByValues.put("Asia/Jakarta", 275);
        indicesByValues.put("Asia/Jayapura", 276);
        indicesByValues.put("Asia/Jerusalem", 277);
        indicesByValues.put("Asia/Kabul", 278);
        indicesByValues.put("Asia/Kamchatka", 279);
        indicesByValues.put("Asia/Karachi", 280);
        indicesByValues.put("Asia/Kashgar", 281);
        indicesByValues.put("Asia/Kathmandu", 282);
        indicesByValues.put("Asia/Katmandu", 283);
        indicesByValues.put("Asia/Khandyga", 284);
        indicesByValues.put("Asia/Kolkata", 285);
        indicesByValues.put("Asia/Krasnoyarsk", 286);
        indicesByValues.put("Asia/Kuala_Lumpur", 287);
        indicesByValues.put("Asia/Kuching", 288);
        indicesByValues.put("Asia/Kuwait", 289);
        indicesByValues.put("Asia/Macao", 290);
        indicesByValues.put("Asia/Macau", 291);
        indicesByValues.put("Asia/Magadan", 292);
        indicesByValues.put("Asia/Makassar", 293);
        indicesByValues.put("Asia/Manila", 294);
        indicesByValues.put("Asia/Muscat", 295);
        indicesByValues.put("Asia/Nicosia", 296);
        indicesByValues.put("Asia/Novokuznetsk", 297);
        indicesByValues.put("Asia/Novosibirsk", 298);
        indicesByValues.put("Asia/Omsk", 299);
        indicesByValues.put("Asia/Oral", 300);
        indicesByValues.put("Asia/Phnom_Penh", 301);
        indicesByValues.put("Asia/Pontianak", 302);
        indicesByValues.put("Asia/Pyongyang", 303);
        indicesByValues.put("Asia/Qatar", 304);
        indicesByValues.put("Asia/Qostanay", 305);
        indicesByValues.put("Asia/Qyzylorda", 306);
        indicesByValues.put("Asia/Rangoon", 307);
        indicesByValues.put("Asia/Riyadh", 308);
        indicesByValues.put("Asia/Saigon", 309);
        indicesByValues.put("Asia/Sakhalin", 310);
        indicesByValues.put("Asia/Samarkand", 311);
        indicesByValues.put("Asia/Seoul", 312);
        indicesByValues.put("Asia/Shanghai", 313);
        indicesByValues.put("Asia/Singapore", 314);
        indicesByValues.put("Asia/Srednekolymsk", 315);
        indicesByValues.put("Asia/Taipei", 316);
        indicesByValues.put("Asia/Tashkent", 317);
        indicesByValues.put("Asia/Tbilisi", 318);
        indicesByValues.put("Asia/Tehran", 319);
        indicesByValues.put("Asia/Tel_Aviv", 320);
        indicesByValues.put("Asia/Thimbu", 321);
        indicesByValues.put("Asia/Thimphu", 322);
        indicesByValues.put("Asia/Tokyo", 323);
        indicesByValues.put("Asia/Tomsk", 324);
        indicesByValues.put("Asia/Ujung_Pandang", 325);
        indicesByValues.put("Asia/Ulaanbaatar", 326);
        indicesByValues.put("Asia/Ulan_Bator", 327);
        indicesByValues.put("Asia/Urumqi", 328);
        indicesByValues.put("Asia/Ust-Nera", 329);
        indicesByValues.put("Asia/Vientiane", 330);
        indicesByValues.put("Asia/Vladivostok", 331);
        indicesByValues.put("Asia/Yakutsk", 332);
        indicesByValues.put("Asia/Yangon", 333);
        indicesByValues.put("Asia/Yekaterinburg", 334);
        indicesByValues.put("Asia/Yerevan", 335);
        indicesByValues.put("Atlantic/Azores", 336);
        indicesByValues.put("Atlantic/Bermuda", 337);
        indicesByValues.put("Atlantic/Canary", 338);
        indicesByValues.put("Atlantic/Cape_Verde", 339);
        indicesByValues.put("Atlantic/Faeroe", 340);
        indicesByValues.put("Atlantic/Faroe", 341);
        indicesByValues.put("Atlantic/Jan_Mayen", 342);
        indicesByValues.put("Atlantic/Madeira", 343);
        indicesByValues.put("Atlantic/Reykjavik", 344);
        indicesByValues.put("Atlantic/South_Georgia", 345);
        indicesByValues.put("Atlantic/St_Helena", 346);
        indicesByValues.put("Atlantic/Stanley", 347);
        indicesByValues.put("Australia/ACT", 348);
        indicesByValues.put("Australia/Adelaide", 349);
        indicesByValues.put("Australia/Brisbane", 350);
        indicesByValues.put("Australia/Broken_Hill", 351);
        indicesByValues.put("Australia/Canberra", 352);
        indicesByValues.put("Australia/Currie", 353);
        indicesByValues.put("Australia/Darwin", 354);
        indicesByValues.put("Australia/Eucla", 355);
        indicesByValues.put("Australia/Hobart", 356);
        indicesByValues.put("Australia/LHI", 357);
        indicesByValues.put("Australia/Lindeman", 358);
        indicesByValues.put("Australia/Lord_Howe", 359);
        indicesByValues.put("Australia/Melbourne", 360);
        indicesByValues.put("Australia/NSW", 361);
        indicesByValues.put("Australia/North", 362);
        indicesByValues.put("Australia/Perth", 363);
        indicesByValues.put("Australia/Queensland", 364);
        indicesByValues.put("Australia/South", 365);
        indicesByValues.put("Australia/Sydney", 366);
        indicesByValues.put("Australia/Tasmania", 367);
        indicesByValues.put("Australia/Victoria", 368);
        indicesByValues.put("Australia/West", 369);
        indicesByValues.put("Australia/Yancowinna", 370);
        indicesByValues.put("Brazil/Acre", 371);
        indicesByValues.put("Brazil/DeNoronha", 372);
        indicesByValues.put("Brazil/East", 373);
        indicesByValues.put("Brazil/West", 374);
        indicesByValues.put("CET", 375);
        indicesByValues.put("CST6CDT", 376);
        indicesByValues.put("Canada/Atlantic", 377);
        indicesByValues.put("Canada/Central", 378);
        indicesByValues.put("Canada/Eastern", 379);
        indicesByValues.put("Canada/Mountain", 380);
        indicesByValues.put("Canada/Newfoundland", 381);
        indicesByValues.put("Canada/Pacific", 382);
        indicesByValues.put("Canada/Saskatchewan", 383);
        indicesByValues.put("Canada/Yukon", 384);
        indicesByValues.put("Chile/Continental", 385);
        indicesByValues.put("Chile/EasterIsland", 386);
        indicesByValues.put("Cuba", 387);
        indicesByValues.put("EET", 388);
        indicesByValues.put("EST", 389);
        indicesByValues.put("EST5EDT", 390);
        indicesByValues.put("Egypt", 391);
        indicesByValues.put("Eire", 392);
        indicesByValues.put("Etc/GMT", 393);
        indicesByValues.put("Etc/GMT+0", 394);
        indicesByValues.put("Etc/GMT+1", 395);
        indicesByValues.put("Etc/GMT+10", 396);
        indicesByValues.put("Etc/GMT+11", 397);
        indicesByValues.put("Etc/GMT+12", 398);
        indicesByValues.put("Etc/GMT+2", 399);
        indicesByValues.put("Etc/GMT+3", 400);
        indicesByValues.put("Etc/GMT+4", 401);
        indicesByValues.put("Etc/GMT+5", 402);
        indicesByValues.put("Etc/GMT+6", 403);
        indicesByValues.put("Etc/GMT+7", 404);
        indicesByValues.put("Etc/GMT+8", 405);
        indicesByValues.put("Etc/GMT+9", 406);
        indicesByValues.put("Etc/GMT-0", 407);
        indicesByValues.put("Etc/GMT-1", 408);
        indicesByValues.put("Etc/GMT-10", 409);
        indicesByValues.put("Etc/GMT-11", 410);
        indicesByValues.put("Etc/GMT-12", 411);
        indicesByValues.put("Etc/GMT-13", 412);
        indicesByValues.put("Etc/GMT-14", 413);
        indicesByValues.put("Etc/GMT-2", 414);
        indicesByValues.put("Etc/GMT-3", 415);
        indicesByValues.put("Etc/GMT-4", 416);
        indicesByValues.put("Etc/GMT-5", 417);
        indicesByValues.put("Etc/GMT-6", 418);
        indicesByValues.put("Etc/GMT-7", 419);
        indicesByValues.put("Etc/GMT-8", 420);
        indicesByValues.put("Etc/GMT-9", 421);
        indicesByValues.put("Etc/GMT0", 422);
        indicesByValues.put("Etc/Greenwich", 423);
        indicesByValues.put("Etc/UCT", 424);
        indicesByValues.put("Etc/UTC", 425);
        indicesByValues.put("Etc/Universal", 426);
        indicesByValues.put("Etc/Zulu", 427);
        indicesByValues.put("Europe/Amsterdam", 428);
        indicesByValues.put("Europe/Andorra", 429);
        indicesByValues.put("Europe/Astrakhan", 430);
        indicesByValues.put("Europe/Athens", 431);
        indicesByValues.put("Europe/Belfast", 432);
        indicesByValues.put("Europe/Belgrade", 433);
        indicesByValues.put("Europe/Berlin", 434);
        indicesByValues.put("Europe/Bratislava", 435);
        indicesByValues.put("Europe/Brussels", 436);
        indicesByValues.put("Europe/Bucharest", 437);
        indicesByValues.put("Europe/Budapest", 438);
        indicesByValues.put("Europe/Busingen", 439);
        indicesByValues.put("Europe/Chisinau", 440);
        indicesByValues.put("Europe/Copenhagen", 441);
        indicesByValues.put("Europe/Dublin", 442);
        indicesByValues.put("Europe/Gibraltar", 443);
        indicesByValues.put("Europe/Guernsey", 444);
        indicesByValues.put("Europe/Helsinki", 445);
        indicesByValues.put("Europe/Isle_of_Man", 446);
        indicesByValues.put("Europe/Istanbul", 447);
        indicesByValues.put("Europe/Jersey", 448);
        indicesByValues.put("Europe/Kaliningrad", 449);
        indicesByValues.put("Europe/Kiev", 450);
        indicesByValues.put("Europe/Kirov", 451);
        indicesByValues.put("Europe/Kyiv", 452);
        indicesByValues.put("Europe/Lisbon", 453);
        indicesByValues.put("Europe/Ljubljana", 454);
        indicesByValues.put("Europe/London", 455);
        indicesByValues.put("Europe/Luxembourg", 456);
        indicesByValues.put("Europe/Madrid", 457);
        indicesByValues.put("Europe/Malta", 458);
        indicesByValues.put("Europe/Mariehamn", 459);
        indicesByValues.put("Europe/Minsk", 460);
        indicesByValues.put("Europe/Monaco", 461);
        indicesByValues.put("Europe/Moscow", 462);
        indicesByValues.put("Europe/Nicosia", 463);
        indicesByValues.put("Europe/Oslo", 464);
        indicesByValues.put("Europe/Paris", 465);
        indicesByValues.put("Europe/Podgorica", 466);
        indicesByValues.put("Europe/Prague", 467);
        indicesByValues.put("Europe/Riga", 468);
        indicesByValues.put("Europe/Rome", 469);
        indicesByValues.put("Europe/Samara", 470);
        indicesByValues.put("Europe/San_Marino", 471);
        indicesByValues.put("Europe/Sarajevo", 472);
        indicesByValues.put("Europe/Saratov", 473);
        indicesByValues.put("Europe/Simferopol", 474);
        indicesByValues.put("Europe/Skopje", 475);
        indicesByValues.put("Europe/Sofia", 476);
        indicesByValues.put("Europe/Stockholm", 477);
        indicesByValues.put("Europe/Tallinn", 478);
        indicesByValues.put("Europe/Tirane", 479);
        indicesByValues.put("Europe/Tiraspol", 480);
        indicesByValues.put("Europe/Ulyanovsk", 481);
        indicesByValues.put("Europe/Uzhgorod", 482);
        indicesByValues.put("Europe/Vaduz", 483);
        indicesByValues.put("Europe/Vatican", 484);
        indicesByValues.put("Europe/Vienna", 485);
        indicesByValues.put("Europe/Vilnius", 486);
        indicesByValues.put("Europe/Volgograd", 487);
        indicesByValues.put("Europe/Warsaw", 488);
        indicesByValues.put("Europe/Zagreb", 489);
        indicesByValues.put("Europe/Zaporozhye", 490);
        indicesByValues.put("Europe/Zurich", 491);
        indicesByValues.put("Factory", 492);
        indicesByValues.put("GB", 493);
        indicesByValues.put("GB-Eire", 494);
        indicesByValues.put("GMT", 495);
        indicesByValues.put("GMT+0", 496);
        indicesByValues.put("GMT-0", 497);
        indicesByValues.put("GMT0", 498);
        indicesByValues.put("Greenwich", 499);
        indicesByValues.put("HST", 500);
        indicesByValues.put("Hongkong", 501);
        indicesByValues.put("Iceland", 502);
        indicesByValues.put("Indian/Antananarivo", 503);
        indicesByValues.put("Indian/Chagos", 504);
        indicesByValues.put("Indian/Christmas", 505);
        indicesByValues.put("Indian/Cocos", 506);
        indicesByValues.put("Indian/Comoro", 507);
        indicesByValues.put("Indian/Kerguelen", 508);
        indicesByValues.put("Indian/Mahe", 509);
        indicesByValues.put("Indian/Maldives", 510);
        indicesByValues.put("Indian/Mauritius", 511);
        indicesByValues.put("Indian/Mayotte", 512);
        indicesByValues.put("Indian/Reunion", 513);
        indicesByValues.put("Iran", 514);
        indicesByValues.put("Israel", 515);
        indicesByValues.put("Jamaica", 516);
        indicesByValues.put("Japan", 517);
        indicesByValues.put("Kwajalein", 518);
        indicesByValues.put("Libya", 519);
        indicesByValues.put("MET", 520);
        indicesByValues.put("MST", 521);
        indicesByValues.put("MST7MDT", 522);
        indicesByValues.put("Mexico/BajaNorte", 523);
        indicesByValues.put("Mexico/BajaSur", 524);
        indicesByValues.put("Mexico/General", 525);
        indicesByValues.put("NZ", 526);
        indicesByValues.put("NZ-CHAT", 527);
        indicesByValues.put("Navajo", 528);
        indicesByValues.put("PRC", 529);
        indicesByValues.put("PST8PDT", 530);
        indicesByValues.put("Pacific/Apia", 531);
        indicesByValues.put("Pacific/Auckland", 532);
        indicesByValues.put("Pacific/Bougainville", 533);
        indicesByValues.put("Pacific/Chatham", 534);
        indicesByValues.put("Pacific/Chuuk", 535);
        indicesByValues.put("Pacific/Easter", 536);
        indicesByValues.put("Pacific/Efate", 537);
        indicesByValues.put("Pacific/Enderbury", 538);
        indicesByValues.put("Pacific/Fakaofo", 539);
        indicesByValues.put("Pacific/Fiji", 540);
        indicesByValues.put("Pacific/Funafuti", 541);
        indicesByValues.put("Pacific/Galapagos", 542);
        indicesByValues.put("Pacific/Gambier", 543);
        indicesByValues.put("Pacific/Guadalcanal", 544);
        indicesByValues.put("Pacific/Guam", 545);
        indicesByValues.put("Pacific/Honolulu", 546);
        indicesByValues.put("Pacific/Johnston", 547);
        indicesByValues.put("Pacific/Kanton", 548);
        indicesByValues.put("Pacific/Kiritimati", 549);
        indicesByValues.put("Pacific/Kosrae", 550);
        indicesByValues.put("Pacific/Kwajalein", 551);
        indicesByValues.put("Pacific/Majuro", 552);
        indicesByValues.put("Pacific/Marquesas", 553);
        indicesByValues.put("Pacific/Midway", 554);
        indicesByValues.put("Pacific/Nauru", 555);
        indicesByValues.put("Pacific/Niue", 556);
        indicesByValues.put("Pacific/Norfolk", 557);
        indicesByValues.put("Pacific/Noumea", 558);
        indicesByValues.put("Pacific/Pago_Pago", 559);
        indicesByValues.put("Pacific/Palau", 560);
        indicesByValues.put("Pacific/Pitcairn", 561);
        indicesByValues.put("Pacific/Pohnpei", 562);
        indicesByValues.put("Pacific/Ponape", 563);
        indicesByValues.put("Pacific/Port_Moresby", 564);
        indicesByValues.put("Pacific/Rarotonga", 565);
        indicesByValues.put("Pacific/Saipan", 566);
        indicesByValues.put("Pacific/Samoa", 567);
        indicesByValues.put("Pacific/Tahiti", 568);
        indicesByValues.put("Pacific/Tarawa", 569);
        indicesByValues.put("Pacific/Tongatapu", 570);
        indicesByValues.put("Pacific/Truk", 571);
        indicesByValues.put("Pacific/Wake", 572);
        indicesByValues.put("Pacific/Wallis", 573);
        indicesByValues.put("Pacific/Yap", 574);
        indicesByValues.put("Poland", 575);
        indicesByValues.put("Portugal", 576);
        indicesByValues.put("ROC", 577);
        indicesByValues.put("ROK", 578);
        indicesByValues.put("Singapore", 579);
        indicesByValues.put("Turkey", 580);
        indicesByValues.put("UCT", 581);
        indicesByValues.put("US/Alaska", 582);
        indicesByValues.put("US/Aleutian", 583);
        indicesByValues.put("US/Arizona", 584);
        indicesByValues.put("US/Central", 585);
        indicesByValues.put("US/East-Indiana", 586);
        indicesByValues.put("US/Eastern", 587);
        indicesByValues.put("US/Hawaii", 588);
        indicesByValues.put("US/Indiana-Starke", 589);
        indicesByValues.put("US/Michigan", 590);
        indicesByValues.put("US/Mountain", 591);
        indicesByValues.put("US/Pacific", 592);
        indicesByValues.put("US/Samoa", 593);
        indicesByValues.put("Universal", 594);
        indicesByValues.put("W-SU", 595);
        indicesByValues.put("WET", 596);
        indicesByValues.put("Zulu", 597);
      }

      private TimeZone(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TimeZone() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[21], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[21].map_attributes(new Object[] {}));
      }
      public static TimeZone get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static TimeZone get(java.lang.String key, GreyCat greycat) {
        return (TimeZone) greycat.libs_by_name.get(std.name).mapped[21].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class GeoCircle extends GreyCat.Object {
      public static final java.lang.String name = "core::GeoCircle";

      private GeoCircle(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public GeoCircle(greycat.gc.core.geo center, java.lang.Double radius) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[22], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[22].map_attributes(new Object[] {center, radius}));
      }
      public greycat.gc.core.geo center() {
        return (greycat.gc.core.geo) getAttribute(type.generated_offsets[0]);
      }
      public void set_center(greycat.gc.core.geo v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Double radius() {
        return (java.lang.Double) getAttribute(type.generated_offsets[1]);
      }
      public void set_radius(java.lang.Double v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class type extends greycat.std_n.core.type {
      public static final java.lang.String name = "core::type";

      public type(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public type(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[23]);
      }
    }
    public static final class SamplingMode extends GreyCat.Enum {
      public static final java.lang.String name = "core::SamplingMode";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("fixed", 0);
        indicesByValues.put("fixed_reg", 1);
        indicesByValues.put("adaptative", 2);
        indicesByValues.put("dense", 3);
      }

      private SamplingMode(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SamplingMode() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[24], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[24].map_attributes(new Object[] {}));
      }
      public static SamplingMode get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static SamplingMode get(java.lang.String key, GreyCat greycat) {
        return (SamplingMode) greycat.libs_by_name.get(std.name).mapped[24].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class node<T> extends greycat.std_n.core.node<T> {
      public static final java.lang.String name = "core::node";

      public node(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public node(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[25]);
      }
    }
    public static final class TableColumnMapping extends GreyCat.Object {
      public static final java.lang.String name = "core::TableColumnMapping";

      private TableColumnMapping(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TableColumnMapping(java.lang.Long column, core.Array<java.lang.Object> extractors) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[26], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[26].map_attributes(new Object[] {column, extractors}));
      }
      public java.lang.Long column() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_column(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<java.lang.Object> extractors() {
        return (core.Array<java.lang.Object>) getAttribute(type.generated_offsets[1]);
      }
      public void set_extractors(core.Array<java.lang.Object> v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class TensorDistance extends GreyCat.Enum {
      public static final java.lang.String name = "core::TensorDistance";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("euclidean", 0);
        indicesByValues.put("l2sq", 1);
        indicesByValues.put("cosine", 2);
      }

      private TensorDistance(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TensorDistance() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[27], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[27].map_attributes(new Object[] {}));
      }
      public static TensorDistance get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static TensorDistance get(java.lang.String key, GreyCat greycat) {
        return (TensorDistance) greycat.libs_by_name.get(std.name).mapped[27].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class nodeIndex<K,V> extends greycat.std_n.core.nodeIndex<K,V> {
      public static final java.lang.String name = "core::nodeIndex";

      public nodeIndex(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public nodeIndex(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[28]);
      }
    }
    public static final class Error extends GreyCat.Object {
      public static final java.lang.String name = "core::Error";

      private Error(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Error(java.lang.String message, core.Array<core.ErrorFrame> stack) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[29], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[29].map_attributes(new Object[] {message, stack}));
      }
      public java.lang.String message() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_message(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<core.ErrorFrame> stack() {
        return (core.Array<core.ErrorFrame>) getAttribute(type.generated_offsets[1]);
      }
      public void set_stack(core.Array<core.ErrorFrame> v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class GeoPoly extends GreyCat.Object {
      public static final java.lang.String name = "core::GeoPoly";

      private GeoPoly(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public GeoPoly(core.Array<greycat.gc.core.geo> points) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[30], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[30].map_attributes(new Object[] {points}));
      }
      public core.Array<greycat.gc.core.geo> points() {
        return (core.Array<greycat.gc.core.geo>) getAttribute(type.generated_offsets[0]);
      }
      public void set_points(core.Array<greycat.gc.core.geo> v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class Table<T> extends greycat.std_n.core.Table<T> {
      public static final java.lang.String name = "core::Table";

      public Table(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public Table(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[31]);
      }
    }
    public static final class str extends greycat.std_n.core.str {
      public static final java.lang.String name = "core::str";

      public str(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public str(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[32]);
      }
    }
    public static final class duration extends greycat.std_n.core.duration {
      public static final java.lang.String name = "core::duration";

      public duration(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public duration(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[33]);
      }
    }
    public static final class Array<T> extends greycat.std_n.core.Array<T> {
      public static final java.lang.String name = "core::Array";

      public Array(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public Array(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[34]);
      }
    }
    public static final class Tuple<T,U> extends GreyCat.Object {
      public static final java.lang.String name = "core::Tuple";

      private Tuple(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Tuple(T x, U y) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[35], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[35].map_attributes(new Object[] {x, y}));
      }
      public T x() {
        return (T) getAttribute(type.generated_offsets[0]);
      }
      public void set_x(T v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public U y() {
        return (U) getAttribute(type.generated_offsets[1]);
      }
      public void set_y(U v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class MathConstants extends GreyCat.Object {
      public static final java.lang.String name = "core::MathConstants";

      private MathConstants(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public MathConstants() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[36], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[36].map_attributes(new Object[] {}));
      }
    }
    public static final class nodeTimeCursor<T> extends GreyCat.Object {
      public static final java.lang.String name = "core::nodeTimeCursor";

      private nodeTimeCursor(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public nodeTimeCursor(greycat.gc.core.nodeTime<T> n, greycat.gc.core.time req_time) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[37], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[37].map_attributes(new Object[] {n, req_time}));
      }
      public greycat.gc.core.nodeTime<T> n() {
        return (greycat.gc.core.nodeTime<T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_n(greycat.gc.core.nodeTime<T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public greycat.gc.core.time req_time() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[1]);
      }
      public void set_req_time(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class t3f extends greycat.std_n.core.t3f {
      public static final java.lang.String name = "core::t3f";

      public t3f(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public t3f(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[38]);
      }
    }
    public static final class ErrorCode extends GreyCat.Enum {
      public static final java.lang.String name = "core::ErrorCode";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("none", 0);
        indicesByValues.put("interrupted", 1);
        indicesByValues.put("await", 2);
        indicesByValues.put("timeout", 3);
        indicesByValues.put("forbidden", 4);
        indicesByValues.put("runtime_error", 5);
      }

      private ErrorCode(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ErrorCode() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[39], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[39].map_attributes(new Object[] {}));
      }
      public static ErrorCode get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static ErrorCode get(java.lang.String key, GreyCat greycat) {
        return (ErrorCode) greycat.libs_by_name.get(std.name).mapped[39].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class ErrorFrame extends GreyCat.Object {
      public static final java.lang.String name = "core::ErrorFrame";

      private ErrorFrame(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ErrorFrame(java.lang.String module, java.lang.String function, java.lang.Long line, java.lang.Long column) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[40], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[40].map_attributes(new Object[] {module, function, line, column}));
      }
      public java.lang.String module() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_module(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String function() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_function(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long line() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_line(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Long column() {
        return (java.lang.Long) getAttribute(type.generated_offsets[3]);
      }
      public void set_column(java.lang.Long v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class Date extends GreyCat.Object {
      public static final java.lang.String name = "core::Date";

      private Date(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Date(java.lang.Long year, java.lang.Long month, java.lang.Long day, java.lang.Long hour, java.lang.Long minute, java.lang.Long second, java.lang.Long microsecond) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[41], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[41].map_attributes(new Object[] {year, month, day, hour, minute, second, microsecond}));
      }
      public java.lang.Long year() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_year(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long month() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_month(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long day() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_day(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Long hour() {
        return (java.lang.Long) getAttribute(type.generated_offsets[3]);
      }
      public void set_hour(java.lang.Long v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Long minute() {
        return (java.lang.Long) getAttribute(type.generated_offsets[4]);
      }
      public void set_minute(java.lang.Long v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long second() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_second(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long microsecond() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_microsecond(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
    }
    public static final class SearchResult<K,V> extends GreyCat.Object {
      public static final java.lang.String name = "core::SearchResult";

      private SearchResult(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SearchResult(K key, V value, java.lang.Double distance) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[42], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[42].map_attributes(new Object[] {key, value, distance}));
      }
      public K key() {
        return (K) getAttribute(type.generated_offsets[0]);
      }
      public void set_key(K v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public V value() {
        return (V) getAttribute(type.generated_offsets[1]);
      }
      public void set_value(V v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Double distance() {
        return (java.lang.Double) getAttribute(type.generated_offsets[2]);
      }
      public void set_distance(java.lang.Double v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class function extends greycat.std_n.core.function {
      public static final java.lang.String name = "core::function";

      public function(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public function(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[43]);
      }
    }
    public static final class nodeGeo<T> extends greycat.std_n.core.nodeGeo<T> {
      public static final java.lang.String name = "core::nodeGeo";

      public nodeGeo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public nodeGeo(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[44]);
      }
    }
    public static final class Buffer extends greycat.std_n.core.Buffer {
      public static final java.lang.String name = "core::Buffer";

      public Buffer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type);
      }

      public Buffer(java.lang.Object... attributes) {
        super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[45]);
      }
    }
    public static final class NodeInfo<T> extends GreyCat.Object {
      public static final java.lang.String name = "core::NodeInfo";

      private NodeInfo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public NodeInfo(java.lang.Long size, T from, T to) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[46], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[46].map_attributes(new Object[] {size, from, to}));
      }
      public java.lang.Long size() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_size(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public T from() {
        return (T) getAttribute(type.generated_offsets[1]);
      }
      public void set_from(T v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public T to() {
        return (T) getAttribute(type.generated_offsets[2]);
      }
      public void set_to(T v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class CalendarUnit extends GreyCat.Enum {
      public static final java.lang.String name = "core::CalendarUnit";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("year", 0);
        indicesByValues.put("month", 1);
        indicesByValues.put("day", 2);
        indicesByValues.put("hour", 3);
        indicesByValues.put("minute", 4);
        indicesByValues.put("second", 5);
        indicesByValues.put("microsecond", 6);
      }

      private CalendarUnit(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CalendarUnit() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[47], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[47].map_attributes(new Object[] {}));
      }
      public static CalendarUnit get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static CalendarUnit get(java.lang.String key, GreyCat greycat) {
        return (CalendarUnit) greycat.libs_by_name.get(std.name).mapped[47].enum_values[indicesByValues.get(key)];
      }
    }
  }
  public static final class io {
    public static final class CsvColumnStatistics extends GreyCat.Object {
      public static final java.lang.String name = "io::CsvColumnStatistics";

      private CsvColumnStatistics(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CsvColumnStatistics(java.lang.String name, java.lang.Object example, java.lang.Long null_count, java.lang.Long bool_count, java.lang.Long int_count, java.lang.Long float_count, java.lang.Long string_count, java.lang.Long date_count, core.Map<java.lang.String, java.lang.Long> date_format_count, core.Map<java.lang.Object, java.lang.Long> enumerable_count, util.Gaussian profile) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[48], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[48].map_attributes(new Object[] {name, example, null_count, bool_count, int_count, float_count, string_count, date_count, date_format_count, enumerable_count, profile}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Object example() {
        return getAttribute(type.generated_offsets[1]);
      }
      public void set_example(java.lang.Object v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long null_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_null_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Long bool_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[3]);
      }
      public void set_bool_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Long int_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[4]);
      }
      public void set_int_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long float_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_float_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long string_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_string_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public java.lang.Long date_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[7]);
      }
      public void set_date_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public core.Map<java.lang.String, java.lang.Long> date_format_count() {
        return (core.Map<java.lang.String, java.lang.Long>) getAttribute(type.generated_offsets[8]);
      }
      public void set_date_format_count(core.Map<java.lang.String, java.lang.Long> v) {
        setAttribute(type.generated_offsets[8], v);
      }
      public core.Map<java.lang.Object, java.lang.Long> enumerable_count() {
        return (core.Map<java.lang.Object, java.lang.Long>) getAttribute(type.generated_offsets[9]);
      }
      public void set_enumerable_count(core.Map<java.lang.Object, java.lang.Long> v) {
        setAttribute(type.generated_offsets[9], v);
      }
      public util.Gaussian profile() {
        return (util.Gaussian) getAttribute(type.generated_offsets[10]);
      }
      public void set_profile(util.Gaussian v) {
        setAttribute(type.generated_offsets[10], v);
      }
    }
    public static final class CsvReader<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::CsvReader";

      private CsvReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CsvReader(java.lang.String path, java.lang.Long pos, io.CsvFormat format, io.CsvSharding sharding) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[49], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[49].map_attributes(new Object[] {path, pos, format, sharding}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public io.CsvFormat format() {
        return (io.CsvFormat) getAttribute(type.generated_offsets[2]);
      }
      public void set_format(io.CsvFormat v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public io.CsvSharding sharding() {
        return (io.CsvSharding) getAttribute(type.generated_offsets[3]);
      }
      public void set_sharding(io.CsvSharding v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class BinReader extends GreyCat.Object {
      public static final java.lang.String name = "io::BinReader";

      private BinReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public BinReader(java.lang.String path, java.lang.Long pos) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[50], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[50].map_attributes(new Object[] {path, pos}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class HttpResponse<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::HttpResponse";

      private HttpResponse(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public HttpResponse(java.lang.Long status_code, core.Map<java.lang.String, java.lang.String> headers, T content, java.lang.String error_msg) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[51], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[51].map_attributes(new Object[] {status_code, headers, content, error_msg}));
      }
      public java.lang.Long status_code() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_status_code(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, java.lang.String> headers() {
        return (core.Map<java.lang.String, java.lang.String>) getAttribute(type.generated_offsets[1]);
      }
      public void set_headers(core.Map<java.lang.String, java.lang.String> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public T content() {
        return (T) getAttribute(type.generated_offsets[2]);
      }
      public void set_content(T v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String error_msg() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_error_msg(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class Url extends GreyCat.Object {
      public static final java.lang.String name = "io::Url";

      private Url(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Url(java.lang.String protocol, java.lang.String host, java.lang.Long port, java.lang.String path, core.Map<java.lang.String, java.lang.String> params, java.lang.String hash) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[52], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[52].map_attributes(new Object[] {protocol, host, port, path, params, hash}));
      }
      public java.lang.String protocol() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_protocol(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String host() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_host(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long port() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_port(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public core.Map<java.lang.String, java.lang.String> params() {
        return (core.Map<java.lang.String, java.lang.String>) getAttribute(type.generated_offsets[4]);
      }
      public void set_params(core.Map<java.lang.String, java.lang.String> v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.String hash() {
        return (java.lang.String) getAttribute(type.generated_offsets[5]);
      }
      public void set_hash(java.lang.String v) {
        setAttribute(type.generated_offsets[5], v);
      }
    }
    public static final class HttpMethod extends GreyCat.Enum {
      public static final java.lang.String name = "io::HttpMethod";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("GET", 0);
        indicesByValues.put("HEAD", 1);
        indicesByValues.put("POST", 2);
        indicesByValues.put("PUT", 3);
        indicesByValues.put("DELETE", 4);
        indicesByValues.put("CONNECT", 5);
        indicesByValues.put("OPTIONS", 6);
        indicesByValues.put("TRACE", 7);
        indicesByValues.put("PATCH", 8);
      }

      private HttpMethod(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public HttpMethod() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[53], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[53].map_attributes(new Object[] {}));
      }
      public static HttpMethod get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static HttpMethod get(java.lang.String key, GreyCat greycat) {
        return (HttpMethod) greycat.libs_by_name.get(std.name).mapped[53].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class Http<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::Http";

      private Http(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Http() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[54], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[54].map_attributes(new Object[] {}));
      }
    }
    public static final class HttpRequest extends GreyCat.Object {
      public static final java.lang.String name = "io::HttpRequest";

      private HttpRequest(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public HttpRequest(io.HttpMethod method, java.lang.String url, core.Map<java.lang.String, java.lang.String> headers, java.lang.String body) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[55], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[55].map_attributes(new Object[] {method, url, headers, body}));
      }
      public io.HttpMethod method() {
        return (io.HttpMethod) getAttribute(type.generated_offsets[0]);
      }
      public void set_method(io.HttpMethod v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String url() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_url(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Map<java.lang.String, java.lang.String> headers() {
        return (core.Map<java.lang.String, java.lang.String>) getAttribute(type.generated_offsets[2]);
      }
      public void set_headers(core.Map<java.lang.String, java.lang.String> v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String body() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_body(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class FileWalker extends GreyCat.Object {
      public static final java.lang.String name = "io::FileWalker";

      private FileWalker(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public FileWalker(java.lang.String path) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[56], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[56].map_attributes(new Object[] {path}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class Writer<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::Writer";

      private Writer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Writer(java.lang.String path, java.lang.Boolean append) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[57], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[57].map_attributes(new Object[] {path, append}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class TextWriter<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::TextWriter";

      private TextWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TextWriter(java.lang.String path, java.lang.Boolean append) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[58], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[58].map_attributes(new Object[] {path, append}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class GcbReader<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::GcbReader";

      private GcbReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public GcbReader(java.lang.String path, java.lang.Long pos) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[59], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[59].map_attributes(new Object[] {path, pos}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class JsonWriter<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::JsonWriter";

      private JsonWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public JsonWriter(java.lang.String path, java.lang.Boolean append) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[60], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[60].map_attributes(new Object[] {path, append}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class CsvAnalysisConfig extends GreyCat.Object {
      public static final java.lang.String name = "io::CsvAnalysisConfig";

      private CsvAnalysisConfig(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CsvAnalysisConfig(java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, java.lang.Long row_limit, java.lang.Long enumerable_limit, java.lang.Long date_check_limit, core.Array<java.lang.String> date_formats) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[61], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[61].map_attributes(new Object[] {header_lines, separator, string_delimiter, decimal_separator, thousands_separator, row_limit, enumerable_limit, date_check_limit, date_formats}));
      }
      public java.lang.Long header_lines() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_header_lines(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Character separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[1]);
      }
      public void set_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Character string_delimiter() {
        return (java.lang.Character) getAttribute(type.generated_offsets[2]);
      }
      public void set_string_delimiter(java.lang.Character v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Character decimal_separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[3]);
      }
      public void set_decimal_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Character thousands_separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[4]);
      }
      public void set_thousands_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long row_limit() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_row_limit(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long enumerable_limit() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_enumerable_limit(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public java.lang.Long date_check_limit() {
        return (java.lang.Long) getAttribute(type.generated_offsets[7]);
      }
      public void set_date_check_limit(java.lang.Long v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public core.Array<java.lang.String> date_formats() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[8]);
      }
      public void set_date_formats(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[8], v);
      }
    }
    public static final class XmlReader<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::XmlReader";

      private XmlReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public XmlReader(java.lang.String path, java.lang.Long pos) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[62], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[62].map_attributes(new Object[] {path, pos}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class SmtpMode extends GreyCat.Enum {
      public static final java.lang.String name = "io::SmtpMode";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("plain", 0);
        indicesByValues.put("ssl_tls", 1);
        indicesByValues.put("starttls", 2);
      }

      private SmtpMode(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SmtpMode() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[63], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[63].map_attributes(new Object[] {}));
      }
      public static SmtpMode get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static SmtpMode get(java.lang.String key, GreyCat greycat) {
        return (SmtpMode) greycat.libs_by_name.get(std.name).mapped[63].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class Csv extends GreyCat.Object {
      public static final java.lang.String name = "io::Csv";

      private Csv(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Csv() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[64], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[64].map_attributes(new Object[] {}));
      }
      public static <T> core.Table<T> sample(io.CsvReader<T>  reader, java.lang.Long max_lines) throws java.io.IOException {
        return sample(reader, max_lines, GreyCat.DEFAULT);
      }

      public static <T> core.Table<T> sample(io.CsvReader<T>  reader, java.lang.Long max_lines, GreyCat greycat) throws java.io.IOException {
        return (core.Table<T>) greycat.call("io::Csv::sample", reader, max_lines);
      }
      public static io.CsvStatistics analyze(core.Array<io.File> files, io.CsvAnalysisConfig config) throws java.io.IOException {
        return analyze(files, config, GreyCat.DEFAULT);
      }

      public static io.CsvStatistics analyze(core.Array<io.File> files, io.CsvAnalysisConfig config, GreyCat greycat) throws java.io.IOException {
        return (io.CsvStatistics) greycat.call("io::Csv::analyze", files, config);
      }
      public static java.lang.String generate(io.CsvStatistics stats) throws java.io.IOException {
        return generate(stats, GreyCat.DEFAULT);
      }

      public static java.lang.String generate(io.CsvStatistics stats, GreyCat greycat) throws java.io.IOException {
        return (java.lang.String) greycat.call("io::Csv::generate", stats);
      }
    }
    public static final class Smtp extends GreyCat.Object {
      public static final java.lang.String name = "io::Smtp";

      private Smtp(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Smtp(java.lang.String host, java.lang.Long port, io.SmtpMode mode, io.SmtpAuth authenticate, java.lang.String user, java.lang.String pass) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[65], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[65].map_attributes(new Object[] {host, port, mode, authenticate, user, pass}));
      }
      public java.lang.String host() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_host(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long port() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_port(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public io.SmtpMode mode() {
        return (io.SmtpMode) getAttribute(type.generated_offsets[2]);
      }
      public void set_mode(io.SmtpMode v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public io.SmtpAuth authenticate() {
        return (io.SmtpAuth) getAttribute(type.generated_offsets[3]);
      }
      public void set_authenticate(io.SmtpAuth v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.String user() {
        return (java.lang.String) getAttribute(type.generated_offsets[4]);
      }
      public void set_user(java.lang.String v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.String pass() {
        return (java.lang.String) getAttribute(type.generated_offsets[5]);
      }
      public void set_pass(java.lang.String v) {
        setAttribute(type.generated_offsets[5], v);
      }
    }
    public static final class File extends GreyCat.Object {
      public static final java.lang.String name = "io::File";

      private File(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public File(java.lang.String path, java.lang.Long size, greycat.gc.core.time last_modification) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[66], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[66].map_attributes(new Object[] {path, size, last_modification}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long size() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_size(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public greycat.gc.core.time last_modification() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[2]);
      }
      public void set_last_modification(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class Reader<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::Reader";

      private Reader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Reader(java.lang.String path, java.lang.Long pos) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[67], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[67].map_attributes(new Object[] {path, pos}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class GcbWriter<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::GcbWriter";

      private GcbWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public GcbWriter(java.lang.String path, java.lang.Boolean append) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[68], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[68].map_attributes(new Object[] {path, append}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class CsvStatistics extends GreyCat.Object {
      public static final java.lang.String name = "io::CsvStatistics";

      private CsvStatistics(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CsvStatistics(java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, core.Array<io.CsvColumnStatistics> columns, java.lang.Long line_count, java.lang.Long fail_count, java.lang.Long file_count) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[69], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[69].map_attributes(new Object[] {header_lines, separator, string_delimiter, decimal_separator, thousands_separator, columns, line_count, fail_count, file_count}));
      }
      public java.lang.Long header_lines() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_header_lines(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Character separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[1]);
      }
      public void set_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Character string_delimiter() {
        return (java.lang.Character) getAttribute(type.generated_offsets[2]);
      }
      public void set_string_delimiter(java.lang.Character v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Character decimal_separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[3]);
      }
      public void set_decimal_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Character thousands_separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[4]);
      }
      public void set_thousands_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public core.Array<io.CsvColumnStatistics> columns() {
        return (core.Array<io.CsvColumnStatistics>) getAttribute(type.generated_offsets[5]);
      }
      public void set_columns(core.Array<io.CsvColumnStatistics> v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long line_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_line_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public java.lang.Long fail_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[7]);
      }
      public void set_fail_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public java.lang.Long file_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[8]);
      }
      public void set_file_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[8], v);
      }
    }
    public static final class Email extends GreyCat.Object {
      public static final java.lang.String name = "io::Email";

      private Email(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Email(java.lang.String from, java.lang.String subject, java.lang.String body, java.lang.Boolean body_is_html, core.Array<java.lang.String> to, core.Array<java.lang.String> cc, core.Array<java.lang.String> bcc) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[70], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[70].map_attributes(new Object[] {from, subject, body, body_is_html, to, cc, bcc}));
      }
      public java.lang.String from() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_from(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String subject() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_subject(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String body() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_body(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Boolean body_is_html() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[3]);
      }
      public void set_body_is_html(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public core.Array<java.lang.String> to() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[4]);
      }
      public void set_to(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public core.Array<java.lang.String> cc() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[5]);
      }
      public void set_cc(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public core.Array<java.lang.String> bcc() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[6]);
      }
      public void set_bcc(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[6], v);
      }
    }
    public static final class CsvFormat extends GreyCat.Object {
      public static final java.lang.String name = "io::CsvFormat";

      private CsvFormat(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CsvFormat(java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, java.lang.Boolean trim, java.lang.String format, core.TimeZone tz, java.lang.Boolean strict, java.lang.Boolean nearest_time) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[71], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[71].map_attributes(new Object[] {header_lines, separator, string_delimiter, decimal_separator, thousands_separator, trim, format, tz, strict, nearest_time}));
      }
      public java.lang.Long header_lines() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_header_lines(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Character separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[1]);
      }
      public void set_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Character string_delimiter() {
        return (java.lang.Character) getAttribute(type.generated_offsets[2]);
      }
      public void set_string_delimiter(java.lang.Character v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Character decimal_separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[3]);
      }
      public void set_decimal_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Character thousands_separator() {
        return (java.lang.Character) getAttribute(type.generated_offsets[4]);
      }
      public void set_thousands_separator(java.lang.Character v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Boolean trim() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[5]);
      }
      public void set_trim(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.String format() {
        return (java.lang.String) getAttribute(type.generated_offsets[6]);
      }
      public void set_format(java.lang.String v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public core.TimeZone tz() {
        return (core.TimeZone) getAttribute(type.generated_offsets[7]);
      }
      public void set_tz(core.TimeZone v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public java.lang.Boolean strict() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[8]);
      }
      public void set_strict(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[8], v);
      }
      public java.lang.Boolean nearest_time() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[9]);
      }
      public void set_nearest_time(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[9], v);
      }
    }
    public static final class Json<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::Json";

      private Json(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Json() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[72], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[72].map_attributes(new Object[] {}));
      }
    }
    public static final class JsonReader<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::JsonReader";

      private JsonReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public JsonReader(java.lang.String path, java.lang.Long pos) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[73], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[73].map_attributes(new Object[] {path, pos}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class CsvWriter<T> extends GreyCat.Object {
      public static final java.lang.String name = "io::CsvWriter";

      private CsvWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CsvWriter(java.lang.String path, java.lang.Boolean append, io.CsvFormat format) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[74], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[74].map_attributes(new Object[] {path, append, format}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean append() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_append(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public io.CsvFormat format() {
        return (io.CsvFormat) getAttribute(type.generated_offsets[2]);
      }
      public void set_format(io.CsvFormat v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class CsvSharding extends GreyCat.Object {
      public static final java.lang.String name = "io::CsvSharding";

      private CsvSharding(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CsvSharding(java.lang.Long id, java.lang.Long column, java.lang.Long modulo) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[75], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[75].map_attributes(new Object[] {id, column, modulo}));
      }
      public java.lang.Long id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long column() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_column(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long modulo() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_modulo(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class TextReader extends GreyCat.Object {
      public static final java.lang.String name = "io::TextReader";

      private TextReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TextReader(java.lang.String path, java.lang.Long pos) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[76], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[76].map_attributes(new Object[] {path, pos}));
      }
      public java.lang.String path() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_path(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long pos() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_pos(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class SmtpAuth extends GreyCat.Enum {
      public static final java.lang.String name = "io::SmtpAuth";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("none", 0);
        indicesByValues.put("plain", 1);
        indicesByValues.put("login", 2);
      }

      private SmtpAuth(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SmtpAuth() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[77], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[77].map_attributes(new Object[] {}));
      }
      public static SmtpAuth get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static SmtpAuth get(java.lang.String key, GreyCat greycat) {
        return (SmtpAuth) greycat.libs_by_name.get(std.name).mapped[77].enum_values[indicesByValues.get(key)];
      }
    }
  }
  public static final class runtime {
    public static final class McpClientRoots extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpClientRoots";

      private McpClientRoots(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpClientRoots(java.lang.Boolean listChanged) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[78], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[78].map_attributes(new Object[] {listChanged}));
      }
      public java.lang.Boolean listChanged() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[0]);
      }
      public void set_listChanged(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class DateTuple extends GreyCat.Object {
      public static final java.lang.String name = "runtime::DateTuple";

      private DateTuple(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public DateTuple(java.lang.Long day, runtime.Month month) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[79], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[79].map_attributes(new Object[] {day, month}));
      }
      public java.lang.Long day() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_day(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.Month month() {
        return (runtime.Month) getAttribute(type.generated_offsets[1]);
      }
      public void set_month(runtime.Month v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class LogLevel extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::LogLevel";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("error", 0);
        indicesByValues.put("warn", 1);
        indicesByValues.put("info", 2);
        indicesByValues.put("perf", 3);
        indicesByValues.put("trace", 4);
      }

      private LogLevel(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public LogLevel() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[80], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[80].map_attributes(new Object[] {}));
      }
      public static LogLevel get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static LogLevel get(java.lang.String key, GreyCat greycat) {
        return (LogLevel) greycat.libs_by_name.get(std.name).mapped[80].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class Month extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::Month";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("Jan", 0);
        indicesByValues.put("Feb", 1);
        indicesByValues.put("Mar", 2);
        indicesByValues.put("Apr", 3);
        indicesByValues.put("May", 4);
        indicesByValues.put("Jun", 5);
        indicesByValues.put("Jul", 6);
        indicesByValues.put("Aug", 7);
        indicesByValues.put("Sep", 8);
        indicesByValues.put("Oct", 9);
        indicesByValues.put("Nov", 10);
        indicesByValues.put("Dec", 11);
      }

      private Month(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Month() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[81], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[81].map_attributes(new Object[] {}));
      }
      public static Month get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static Month get(java.lang.String key, GreyCat greycat) {
        return (Month) greycat.libs_by_name.get(std.name).mapped[81].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class PeriodicTask extends GreyCat.Object {
      public static final java.lang.String name = "runtime::PeriodicTask";

      private PeriodicTask(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public PeriodicTask(core.function function, runtime.Periodicity periodicity, runtime.PeriodicOptions options, java.lang.Boolean is_active, greycat.gc.core.time next_execution, java.lang.Long execution_count) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[82], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[82].map_attributes(new Object[] {function, periodicity, options, is_active, next_execution, execution_count}));
      }
      public core.function function() {
        return (core.function) getAttribute(type.generated_offsets[0]);
      }
      public void set_function(core.function v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.Periodicity periodicity() {
        return (runtime.Periodicity) getAttribute(type.generated_offsets[1]);
      }
      public void set_periodicity(runtime.Periodicity v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.PeriodicOptions options() {
        return (runtime.PeriodicOptions) getAttribute(type.generated_offsets[2]);
      }
      public void set_options(runtime.PeriodicOptions v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Boolean is_active() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[3]);
      }
      public void set_is_active(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public greycat.gc.core.time next_execution() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[4]);
      }
      public void set_next_execution(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long execution_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_execution_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
    }
    public static final class YearlyPeriodicity extends GreyCat.Object {
      public static final java.lang.String name = "runtime::YearlyPeriodicity";

      private YearlyPeriodicity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public YearlyPeriodicity(core.Array<runtime.DateTuple> dates, core.TimeZone timezone) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[83], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[83].map_attributes(new Object[] {dates, timezone}));
      }
      public core.Array<runtime.DateTuple> dates() {
        return (core.Array<runtime.DateTuple>) getAttribute(type.generated_offsets[0]);
      }
      public void set_dates(core.Array<runtime.DateTuple> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.TimeZone timezone() {
        return (core.TimeZone) getAttribute(type.generated_offsets[1]);
      }
      public void set_timezone(core.TimeZone v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class License extends GreyCat.Object {
      public static final java.lang.String name = "runtime::License";

      private License(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public License(java.lang.String name, greycat.gc.core.time start, greycat.gc.core.time end, java.lang.String company, java.lang.Long max_memory, java.lang.Long extra_1, java.lang.Long extra_2, runtime.LicenseType type) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[84], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[84].map_attributes(new Object[] {name, start, end, company, max_memory, extra_1, extra_2, type}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public greycat.gc.core.time start() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[1]);
      }
      public void set_start(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public greycat.gc.core.time end() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[2]);
      }
      public void set_end(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String company() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_company(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Long max_memory() {
        return (java.lang.Long) getAttribute(type.generated_offsets[4]);
      }
      public void set_max_memory(java.lang.Long v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long extra_1() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_extra_1(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long extra_2() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_extra_2(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public runtime.LicenseType type() {
        return (runtime.LicenseType) getAttribute(type.generated_offsets[7]);
      }
      public void set_type(runtime.LicenseType v) {
        setAttribute(type.generated_offsets[7], v);
      }
    }
    public static final class McpToolsCallParams extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpToolsCallParams";

      private McpToolsCallParams(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpToolsCallParams(core.Map<java.lang.String, java.lang.Object> _meta, java.lang.String name, java.lang.Object arguments) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[85], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[85].map_attributes(new Object[] {_meta, name, arguments}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Object arguments() {
        return getAttribute(type.generated_offsets[2]);
      }
      public void set_arguments(java.lang.Object v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class InfoObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::InfoObject";

      private InfoObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public InfoObject(java.lang.String title, java.lang.String version) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[86], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[86].map_attributes(new Object[] {title, version}));
      }
      public java.lang.String title() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_title(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String version() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_version(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class OpenApiV3 extends GreyCat.Object {
      public static final java.lang.String name = "runtime::OpenApiV3";

      private OpenApiV3(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public OpenApiV3(runtime.OpenApiVersion openapi, runtime.InfoObject info, core.Map<java.lang.String, runtime.PathItemObject> paths, runtime.ComponentsObject components) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[87], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[87].map_attributes(new Object[] {openapi, info, paths, components}));
      }
      public runtime.OpenApiVersion openapi() {
        return (runtime.OpenApiVersion) getAttribute(type.generated_offsets[0]);
      }
      public void set_openapi(runtime.OpenApiVersion v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.InfoObject info() {
        return (runtime.InfoObject) getAttribute(type.generated_offsets[1]);
      }
      public void set_info(runtime.InfoObject v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Map<java.lang.String, runtime.PathItemObject> paths() {
        return (core.Map<java.lang.String, runtime.PathItemObject>) getAttribute(type.generated_offsets[2]);
      }
      public void set_paths(core.Map<java.lang.String, runtime.PathItemObject> v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public runtime.ComponentsObject components() {
        return (runtime.ComponentsObject) getAttribute(type.generated_offsets[3]);
      }
      public void set_components(runtime.ComponentsObject v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class McpServerResourcesCapabilities extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpServerResourcesCapabilities";

      private McpServerResourcesCapabilities(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpServerResourcesCapabilities(java.lang.Boolean subscribe, java.lang.Boolean listChanged) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[88], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[88].map_attributes(new Object[] {subscribe, listChanged}));
      }
      public java.lang.Boolean subscribe() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[0]);
      }
      public void set_subscribe(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean listChanged() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_listChanged(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class Frame extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Frame";

      private Frame(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Frame(java.lang.String module, java.lang.String type, java.lang.String function, java.lang.String src, java.lang.Long line, java.lang.Long column, core.Array<runtime.Variable> scope) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[89], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[89].map_attributes(new Object[] {module, type, function, src, line, column, scope}));
      }
      public java.lang.String module() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_module(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String type() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_type(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String function() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_function(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String src() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_src(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Long line() {
        return (java.lang.Long) getAttribute(type.generated_offsets[4]);
      }
      public void set_line(java.lang.Long v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long column() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_column(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public core.Array<runtime.Variable> scope() {
        return (core.Array<runtime.Variable>) getAttribute(type.generated_offsets[6]);
      }
      public void set_scope(core.Array<runtime.Variable> v) {
        setAttribute(type.generated_offsets[6], v);
      }
    }
    public static final class DayOfWeek extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::DayOfWeek";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("Mon", 0);
        indicesByValues.put("Tue", 1);
        indicesByValues.put("Wed", 2);
        indicesByValues.put("Thu", 3);
        indicesByValues.put("Fri", 4);
        indicesByValues.put("Sat", 5);
        indicesByValues.put("Sun", 6);
      }

      private DayOfWeek(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public DayOfWeek() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[90], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[90].map_attributes(new Object[] {}));
      }
      public static DayOfWeek get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static DayOfWeek get(java.lang.String key, GreyCat greycat) {
        return (DayOfWeek) greycat.libs_by_name.get(std.name).mapped[90].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class OpenIDConnect extends GreyCat.Object {
      public static final java.lang.String name = "runtime::OpenIDConnect";

      private OpenIDConnect(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public OpenIDConnect(java.lang.String url, java.lang.String clientId) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[91], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[91].map_attributes(new Object[] {url, clientId}));
      }
      public java.lang.String url() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_url(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String clientId() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_clientId(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public static runtime.OpenIDConnect config() throws java.io.IOException {
        return config(GreyCat.DEFAULT);
      }

      public static runtime.OpenIDConnect config(GreyCat greycat) throws java.io.IOException {
        return (runtime.OpenIDConnect) greycat.call("runtime::OpenIDConnect::config");
      }
    }
    public static final class OperationObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::OperationObject";

      private OperationObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public OperationObject(core.Array<java.lang.String> tags, java.lang.String description, runtime.RequestBodyObject requestBody, core.Map<java.lang.String, runtime.ResponseObject> responses) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[92], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[92].map_attributes(new Object[] {tags, description, requestBody, responses}));
      }
      public core.Array<java.lang.String> tags() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[0]);
      }
      public void set_tags(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String description() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_description(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.RequestBodyObject requestBody() {
        return (runtime.RequestBodyObject) getAttribute(type.generated_offsets[2]);
      }
      public void set_requestBody(runtime.RequestBodyObject v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public core.Map<java.lang.String, runtime.ResponseObject> responses() {
        return (core.Map<java.lang.String, runtime.ResponseObject>) getAttribute(type.generated_offsets[3]);
      }
      public void set_responses(core.Map<java.lang.String, runtime.ResponseObject> v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class SecurityEntity extends GreyCat.Object {
      public static final java.lang.String name = "runtime::SecurityEntity";

      private SecurityEntity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SecurityEntity(java.lang.Long id, java.lang.String name, java.lang.Boolean activated) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[93], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[93].map_attributes(new Object[] {id, name, activated}));
      }
      public java.lang.Long id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Boolean activated() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[2]);
      }
      public void set_activated(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public static java.lang.Long set(runtime.SecurityEntity entity) throws java.io.IOException {
        return set(entity, GreyCat.DEFAULT);
      }

      public static java.lang.Long set(runtime.SecurityEntity entity, GreyCat greycat) throws java.io.IOException {
        return (java.lang.Long) greycat.call("runtime::SecurityEntity::set", entity);
      }
      public static core.Array<runtime.SecurityEntity> all() throws java.io.IOException {
        return all(GreyCat.DEFAULT);
      }

      public static core.Array<runtime.SecurityEntity> all(GreyCat greycat) throws java.io.IOException {
        return (core.Array<runtime.SecurityEntity>) greycat.call("runtime::SecurityEntity::all");
      }
    }
    public static final class SecurityFields extends GreyCat.Object {
      public static final java.lang.String name = "runtime::SecurityFields";

      private SecurityFields(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SecurityFields(java.lang.String email, java.lang.String name, java.lang.String first_name, java.lang.String last_name, core.Map<java.lang.String, java.lang.String> roles, core.Map<java.lang.String, java.lang.String> groups) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[94], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[94].map_attributes(new Object[] {email, name, first_name, last_name, roles, groups}));
      }
      public java.lang.String email() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_email(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String first_name() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_first_name(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String last_name() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_last_name(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public core.Map<java.lang.String, java.lang.String> roles() {
        return (core.Map<java.lang.String, java.lang.String>) getAttribute(type.generated_offsets[4]);
      }
      public void set_roles(core.Map<java.lang.String, java.lang.String> v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public core.Map<java.lang.String, java.lang.String> groups() {
        return (core.Map<java.lang.String, java.lang.String>) getAttribute(type.generated_offsets[5]);
      }
      public void set_groups(core.Map<java.lang.String, java.lang.String> v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public static runtime.SecurityFields get() throws java.io.IOException {
        return get(GreyCat.DEFAULT);
      }

      public static runtime.SecurityFields get(GreyCat greycat) throws java.io.IOException {
        return (runtime.SecurityFields) greycat.call("runtime::SecurityFields::get");
      }
      public static void set(runtime.SecurityFields f) throws java.io.IOException {
        set(f, GreyCat.DEFAULT);
      }

      public static void set(runtime.SecurityFields f, GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::SecurityFields::set", f);
      }
    }
    public static final class McpContentBlock extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpContentBlock";

      private McpContentBlock(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpContentBlock(runtime.McpContentType type, core.Map<java.lang.String, java.lang.Object> _meta, runtime.McpAnnotations annotations) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[95], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[95].map_attributes(new Object[] {type, _meta, annotations}));
      }
      public runtime.McpContentType type() {
        return (runtime.McpContentType) getAttribute(type.generated_offsets[0]);
      }
      public void set_type(runtime.McpContentType v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[1]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.McpAnnotations annotations() {
        return (runtime.McpAnnotations) getAttribute(type.generated_offsets[2]);
      }
      public void set_annotations(runtime.McpAnnotations v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class Periodicity extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Periodicity";

      private Periodicity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Periodicity() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[96], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[96].map_attributes(new Object[] {}));
      }
    }
    public static final class SchemaFormat extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::SchemaFormat";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("int32", 0);
        indicesByValues.put("int64", 1);
        indicesByValues.put("float_", 2);
        indicesByValues.put("double_", 3);
        indicesByValues.put("byte_", 4);
        indicesByValues.put("binary", 5);
        indicesByValues.put("date", 6);
        indicesByValues.put("date-time", 7);
        indicesByValues.put("password", 8);
      }

      private SchemaFormat(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SchemaFormat() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[97], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[97].map_attributes(new Object[] {}));
      }
      public static SchemaFormat get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static SchemaFormat get(java.lang.String key, GreyCat greycat) {
        return (SchemaFormat) greycat.libs_by_name.get(std.name).mapped[97].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class DailyPeriodicity extends GreyCat.Object {
      public static final java.lang.String name = "runtime::DailyPeriodicity";

      private DailyPeriodicity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public DailyPeriodicity(java.lang.Long hour, java.lang.Long minute, java.lang.Long second, core.TimeZone timezone) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[98], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[98].map_attributes(new Object[] {hour, minute, second, timezone}));
      }
      public java.lang.Long hour() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_hour(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long minute() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_minute(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long second() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_second(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public core.TimeZone timezone() {
        return (core.TimeZone) getAttribute(type.generated_offsets[3]);
      }
      public void set_timezone(core.TimeZone v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class RuntimeInfo extends GreyCat.Object {
      public static final java.lang.String name = "runtime::RuntimeInfo";

      private RuntimeInfo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public RuntimeInfo(java.lang.String version, java.lang.String program_version, java.lang.String arch, core.TimeZone timezone, runtime.License license, java.lang.Long io_threads, java.lang.Long bg_threads, java.lang.Long fg_threads, java.lang.Long mem_total, java.lang.Long mem_worker, java.lang.Long disk_data_bytes) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[99], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[99].map_attributes(new Object[] {version, program_version, arch, timezone, license, io_threads, bg_threads, fg_threads, mem_total, mem_worker, disk_data_bytes}));
      }
      public java.lang.String version() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_version(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String program_version() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_program_version(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String arch() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_arch(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public core.TimeZone timezone() {
        return (core.TimeZone) getAttribute(type.generated_offsets[3]);
      }
      public void set_timezone(core.TimeZone v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public runtime.License license() {
        return (runtime.License) getAttribute(type.generated_offsets[4]);
      }
      public void set_license(runtime.License v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long io_threads() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_io_threads(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long bg_threads() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_bg_threads(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public java.lang.Long fg_threads() {
        return (java.lang.Long) getAttribute(type.generated_offsets[7]);
      }
      public void set_fg_threads(java.lang.Long v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public java.lang.Long mem_total() {
        return (java.lang.Long) getAttribute(type.generated_offsets[8]);
      }
      public void set_mem_total(java.lang.Long v) {
        setAttribute(type.generated_offsets[8], v);
      }
      public java.lang.Long mem_worker() {
        return (java.lang.Long) getAttribute(type.generated_offsets[9]);
      }
      public void set_mem_worker(java.lang.Long v) {
        setAttribute(type.generated_offsets[9], v);
      }
      public java.lang.Long disk_data_bytes() {
        return (java.lang.Long) getAttribute(type.generated_offsets[10]);
      }
      public void set_disk_data_bytes(java.lang.Long v) {
        setAttribute(type.generated_offsets[10], v);
      }
    }
    public static final class OpenApiVersion extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::OpenApiVersion";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("3.0.4", 0);
        indicesByValues.put("3.1.0", 1);
      }

      private OpenApiVersion(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public OpenApiVersion() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[100], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[100].map_attributes(new Object[] {}));
      }
      public static OpenApiVersion get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static OpenApiVersion get(java.lang.String key, GreyCat greycat) {
        return (OpenApiVersion) greycat.libs_by_name.get(std.name).mapped[100].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class McpServerToolsCapabilities extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpServerToolsCapabilities";

      private McpServerToolsCapabilities(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpServerToolsCapabilities(java.lang.Boolean listChanged) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[101], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[101].map_attributes(new Object[] {listChanged}));
      }
      public java.lang.Boolean listChanged() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[0]);
      }
      public void set_listChanged(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class McpToolsCallResult extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpToolsCallResult";

      private McpToolsCallResult(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpToolsCallResult(core.Map<java.lang.String, java.lang.Object> _meta, core.Array<runtime.McpContentBlock> content, java.lang.Object structuredContent, java.lang.Boolean isError) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[102], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[102].map_attributes(new Object[] {_meta, content, structuredContent, isError}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<runtime.McpContentBlock> content() {
        return (core.Array<runtime.McpContentBlock>) getAttribute(type.generated_offsets[1]);
      }
      public void set_content(core.Array<runtime.McpContentBlock> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Object structuredContent() {
        return getAttribute(type.generated_offsets[2]);
      }
      public void set_structuredContent(java.lang.Object v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Boolean isError() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[3]);
      }
      public void set_isError(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class McpContentType extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::McpContentType";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("text", 0);
        indicesByValues.put("image", 1);
        indicesByValues.put("audio", 2);
        indicesByValues.put("resource_link", 3);
        indicesByValues.put("resource", 4);
      }

      private McpContentType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpContentType() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[103], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[103].map_attributes(new Object[] {}));
      }
      public static McpContentType get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static McpContentType get(java.lang.String key, GreyCat greycat) {
        return (McpContentType) greycat.libs_by_name.get(std.name).mapped[103].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class MergeStrategy extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::MergeStrategy";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("strict", 0);
        indicesByValues.put("first_wins", 1);
        indicesByValues.put("last_wins", 2);
      }

      private MergeStrategy(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public MergeStrategy() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[104], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[104].map_attributes(new Object[] {}));
      }
      public static MergeStrategy get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static MergeStrategy get(java.lang.String key, GreyCat greycat) {
        return (MergeStrategy) greycat.libs_by_name.get(std.name).mapped[104].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class McpAnnotations extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpAnnotations";

      private McpAnnotations(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpAnnotations(core.Array<runtime.McpRole> audience, runtime.McpPriority priority, java.lang.String lastModified) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[105], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[105].map_attributes(new Object[] {audience, priority, lastModified}));
      }
      public core.Array<runtime.McpRole> audience() {
        return (core.Array<runtime.McpRole>) getAttribute(type.generated_offsets[0]);
      }
      public void set_audience(core.Array<runtime.McpRole> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.McpPriority priority() {
        return (runtime.McpPriority) getAttribute(type.generated_offsets[1]);
      }
      public void set_priority(runtime.McpPriority v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String lastModified() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_lastModified(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class MediaTypeObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::MediaTypeObject";

      private MediaTypeObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public MediaTypeObject(runtime.SchemaObject schema) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[106], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[106].map_attributes(new Object[] {schema}));
      }
      public runtime.SchemaObject schema() {
        return (runtime.SchemaObject) getAttribute(type.generated_offsets[0]);
      }
      public void set_schema(runtime.SchemaObject v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class McpClientCapabilities extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpClientCapabilities";

      private McpClientCapabilities(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpClientCapabilities(core.Map<java.lang.String, java.lang.Object> experimental, runtime.McpClientRoots roots, core.Map<java.lang.String, java.lang.Object> sampling, core.Map<java.lang.String, java.lang.Object> elicitation) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[107], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[107].map_attributes(new Object[] {experimental, roots, sampling, elicitation}));
      }
      public core.Map<java.lang.String, java.lang.Object> experimental() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set_experimental(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.McpClientRoots roots() {
        return (runtime.McpClientRoots) getAttribute(type.generated_offsets[1]);
      }
      public void set_roots(runtime.McpClientRoots v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Map<java.lang.String, java.lang.Object> sampling() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[2]);
      }
      public void set_sampling(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public core.Map<java.lang.String, java.lang.Object> elicitation() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[3]);
      }
      public void set_elicitation(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class HeaderObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::HeaderObject";

      private HeaderObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public HeaderObject(java.lang.String description, java.lang.Boolean required) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[108], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[108].map_attributes(new Object[] {description, required}));
      }
      public java.lang.String description() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_description(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean required() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_required(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class Task extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Task";

      private Task(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Task(java.lang.Long user_id, java.lang.Long task_id, java.lang.String mod, java.lang.String type, java.lang.String fun, greycat.gc.core.time creation, greycat.gc.core.time start, greycat.gc.core.duration duration, runtime.TaskStatus status, java.lang.Double progress) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[109], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[109].map_attributes(new Object[] {user_id, task_id, mod, type, fun, creation, start, duration, status, progress}));
      }
      public java.lang.Long user_id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_user_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long task_id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_task_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String mod() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_mod(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String type() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_type(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.String fun() {
        return (java.lang.String) getAttribute(type.generated_offsets[4]);
      }
      public void set_fun(java.lang.String v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public greycat.gc.core.time creation() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[5]);
      }
      public void set_creation(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public greycat.gc.core.time start() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[6]);
      }
      public void set_start(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public greycat.gc.core.duration duration() {
        return (greycat.gc.core.duration) getAttribute(type.generated_offsets[7]);
      }
      public void set_duration(greycat.gc.core.duration v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public runtime.TaskStatus status() {
        return (runtime.TaskStatus) getAttribute(type.generated_offsets[8]);
      }
      public void set_status(runtime.TaskStatus v) {
        setAttribute(type.generated_offsets[8], v);
      }
      public java.lang.Double progress() {
        return (java.lang.Double) getAttribute(type.generated_offsets[9]);
      }
      public void set_progress(java.lang.Double v) {
        setAttribute(type.generated_offsets[9], v);
      }
      public static java.lang.Boolean is_running(java.lang.Long task_id) throws java.io.IOException {
        return is_running(task_id, GreyCat.DEFAULT);
      }

      public static java.lang.Boolean is_running(java.lang.Long task_id, GreyCat greycat) throws java.io.IOException {
        return (java.lang.Boolean) greycat.call("runtime::Task::is_running", task_id);
      }
      public static java.lang.Boolean cancel(java.lang.Long task_id) throws java.io.IOException {
        return cancel(task_id, GreyCat.DEFAULT);
      }

      public static java.lang.Boolean cancel(java.lang.Long task_id, GreyCat greycat) throws java.io.IOException {
        return (java.lang.Boolean) greycat.call("runtime::Task::cancel", task_id);
      }
      public static core.Array<runtime.Task> history(java.lang.Long offset, java.lang.Long max) throws java.io.IOException {
        return history(offset, max, GreyCat.DEFAULT);
      }

      public static core.Array<runtime.Task> history(java.lang.Long offset, java.lang.Long max, GreyCat greycat) throws java.io.IOException {
        return (core.Array<runtime.Task>) greycat.call("runtime::Task::history", offset, max);
      }
      public static core.Array<runtime.Task> running() throws java.io.IOException {
        return running(GreyCat.DEFAULT);
      }

      public static core.Array<runtime.Task> running(GreyCat greycat) throws java.io.IOException {
        return (core.Array<runtime.Task>) greycat.call("runtime::Task::running");
      }
    }
    public static final class Log extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Log";

      private Log(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Log(runtime.LogLevel level, greycat.gc.core.time time, java.lang.Long user_id, java.lang.Long id, java.lang.Long id2, core.function src, java.lang.Object data) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[110], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[110].map_attributes(new Object[] {level, time, user_id, id, id2, src, data}));
      }
      public runtime.LogLevel level() {
        return (runtime.LogLevel) getAttribute(type.generated_offsets[0]);
      }
      public void set_level(runtime.LogLevel v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public greycat.gc.core.time time() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[1]);
      }
      public void set_time(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long user_id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_user_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Long id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[3]);
      }
      public void set_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Long id2() {
        return (java.lang.Long) getAttribute(type.generated_offsets[4]);
      }
      public void set_id2(java.lang.Long v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public core.function src() {
        return (core.function) getAttribute(type.generated_offsets[5]);
      }
      public void set_src(core.function v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Object data() {
        return getAttribute(type.generated_offsets[6]);
      }
      public void set_data(java.lang.Object v) {
        setAttribute(type.generated_offsets[6], v);
      }
    }
    public static final class McpServerCapabilities extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpServerCapabilities";

      private McpServerCapabilities(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpServerCapabilities(core.Map<java.lang.String, core.Map<java.lang.String, java.lang.Object>> experimental, core.Map<java.lang.String, java.lang.Object> logging, core.Map<java.lang.String, java.lang.Object> completions, runtime.McpServerPromptsCapabilities prompts, runtime.McpServerResourcesCapabilities resources, runtime.McpServerToolsCapabilities tools) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[111], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[111].map_attributes(new Object[] {experimental, logging, completions, prompts, resources, tools}));
      }
      public core.Map<java.lang.String, core.Map<java.lang.String, java.lang.Object>> experimental() {
        return (core.Map<java.lang.String, core.Map<java.lang.String, java.lang.Object>>) getAttribute(type.generated_offsets[0]);
      }
      public void set_experimental(core.Map<java.lang.String, core.Map<java.lang.String, java.lang.Object>> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, java.lang.Object> logging() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[1]);
      }
      public void set_logging(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Map<java.lang.String, java.lang.Object> completions() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[2]);
      }
      public void set_completions(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public runtime.McpServerPromptsCapabilities prompts() {
        return (runtime.McpServerPromptsCapabilities) getAttribute(type.generated_offsets[3]);
      }
      public void set_prompts(runtime.McpServerPromptsCapabilities v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public runtime.McpServerResourcesCapabilities resources() {
        return (runtime.McpServerResourcesCapabilities) getAttribute(type.generated_offsets[4]);
      }
      public void set_resources(runtime.McpServerResourcesCapabilities v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public runtime.McpServerToolsCapabilities tools() {
        return (runtime.McpServerToolsCapabilities) getAttribute(type.generated_offsets[5]);
      }
      public void set_tools(runtime.McpServerToolsCapabilities v) {
        setAttribute(type.generated_offsets[5], v);
      }
    }
    public static final class MonthlyPeriodicity extends GreyCat.Object {
      public static final java.lang.String name = "runtime::MonthlyPeriodicity";

      private MonthlyPeriodicity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public MonthlyPeriodicity(core.Array<java.lang.Long> days, runtime.DailyPeriodicity daily) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[112], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[112].map_attributes(new Object[] {days, daily}));
      }
      public core.Array<java.lang.Long> days() {
        return (core.Array<java.lang.Long>) getAttribute(type.generated_offsets[0]);
      }
      public void set_days(core.Array<java.lang.Long> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.DailyPeriodicity daily() {
        return (runtime.DailyPeriodicity) getAttribute(type.generated_offsets[1]);
      }
      public void set_daily(runtime.DailyPeriodicity v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class WeeklyPeriodicity extends GreyCat.Object {
      public static final java.lang.String name = "runtime::WeeklyPeriodicity";

      private WeeklyPeriodicity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public WeeklyPeriodicity(core.Array<runtime.DayOfWeek> days, runtime.DailyPeriodicity daily) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[113], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[113].map_attributes(new Object[] {days, daily}));
      }
      public core.Array<runtime.DayOfWeek> days() {
        return (core.Array<runtime.DayOfWeek>) getAttribute(type.generated_offsets[0]);
      }
      public void set_days(core.Array<runtime.DayOfWeek> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.DailyPeriodicity daily() {
        return (runtime.DailyPeriodicity) getAttribute(type.generated_offsets[1]);
      }
      public void set_daily(runtime.DailyPeriodicity v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class Role extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Role";

      private Role(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Role(java.lang.String name, core.Array<java.lang.String> permissions) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[114], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[114].map_attributes(new Object[] {name, permissions}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<java.lang.String> permissions() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[1]);
      }
      public void set_permissions(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public static core.Array<runtime.Role> all() throws java.io.IOException {
        return all(GreyCat.DEFAULT);
      }

      public static core.Array<runtime.Role> all(GreyCat greycat) throws java.io.IOException {
        return (core.Array<runtime.Role>) greycat.call("runtime::Role::all");
      }
    }
    public static final class Job<T> extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Job";

      private Job(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Job(core.function function, core.Array arguments) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[115], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[115].map_attributes(new Object[] {function, arguments}));
      }
      public core.function function() {
        return (core.function) getAttribute(type.generated_offsets[0]);
      }
      public void set_function(core.function v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array arguments() {
        return (core.Array) getAttribute(type.generated_offsets[1]);
      }
      public void set_arguments(core.Array v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class McpImageContent extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpImageContent";

      private McpImageContent(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpImageContent(runtime.McpContentType type, core.Map<java.lang.String, java.lang.Object> _meta, runtime.McpAnnotations annotations, java.lang.String data, java.lang.String mimeType) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[116], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[116].map_attributes(new Object[] {type, _meta, annotations, data, mimeType}));
      }
      public runtime.McpContentType type() {
        return (runtime.McpContentType) getAttribute(type.generated_offsets[0]);
      }
      public void set_type(runtime.McpContentType v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[1]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.McpAnnotations annotations() {
        return (runtime.McpAnnotations) getAttribute(type.generated_offsets[2]);
      }
      public void set_annotations(runtime.McpAnnotations v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String data() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_data(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.String mimeType() {
        return (java.lang.String) getAttribute(type.generated_offsets[4]);
      }
      public void set_mimeType(java.lang.String v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class SchemaObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::SchemaObject";

      private SchemaObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SchemaObject(java.lang.String $ref, core.Map<java.lang.String, runtime.SchemaObject> $defs, java.lang.Object type, runtime.SchemaFormat format, java.lang.Boolean nullable, core.Map<java.lang.String, runtime.SchemaObject> properties, core.Array<java.lang.String> required, runtime.SchemaObject items, core.Array<runtime.SchemaObject> oneOf, core.Array<runtime.SchemaObject> allOf, core.Array<runtime.SchemaObject> anyOf, java.lang.Long minItems, java.lang.Long maxItems, core.Array<java.lang.String> enum_, runtime.SchemaObject additionalProperties) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[117], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[117].map_attributes(new Object[] {$ref, $defs, type, format, nullable, properties, required, items, oneOf, allOf, anyOf, minItems, maxItems, enum_, additionalProperties}));
      }
      public java.lang.String $ref() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_$ref(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, runtime.SchemaObject> $defs() {
        return (core.Map<java.lang.String, runtime.SchemaObject>) getAttribute(type.generated_offsets[1]);
      }
      public void set_$defs(core.Map<java.lang.String, runtime.SchemaObject> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Object type() {
        return getAttribute(type.generated_offsets[2]);
      }
      public void set_type(java.lang.Object v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public runtime.SchemaFormat format() {
        return (runtime.SchemaFormat) getAttribute(type.generated_offsets[3]);
      }
      public void set_format(runtime.SchemaFormat v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Boolean nullable() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[4]);
      }
      public void set_nullable(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public core.Map<java.lang.String, runtime.SchemaObject> properties() {
        return (core.Map<java.lang.String, runtime.SchemaObject>) getAttribute(type.generated_offsets[5]);
      }
      public void set_properties(core.Map<java.lang.String, runtime.SchemaObject> v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public core.Array<java.lang.String> required() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[6]);
      }
      public void set_required(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public runtime.SchemaObject items() {
        return (runtime.SchemaObject) getAttribute(type.generated_offsets[7]);
      }
      public void set_items(runtime.SchemaObject v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public core.Array<runtime.SchemaObject> oneOf() {
        return (core.Array<runtime.SchemaObject>) getAttribute(type.generated_offsets[8]);
      }
      public void set_oneOf(core.Array<runtime.SchemaObject> v) {
        setAttribute(type.generated_offsets[8], v);
      }
      public core.Array<runtime.SchemaObject> allOf() {
        return (core.Array<runtime.SchemaObject>) getAttribute(type.generated_offsets[9]);
      }
      public void set_allOf(core.Array<runtime.SchemaObject> v) {
        setAttribute(type.generated_offsets[9], v);
      }
      public core.Array<runtime.SchemaObject> anyOf() {
        return (core.Array<runtime.SchemaObject>) getAttribute(type.generated_offsets[10]);
      }
      public void set_anyOf(core.Array<runtime.SchemaObject> v) {
        setAttribute(type.generated_offsets[10], v);
      }
      public java.lang.Long minItems() {
        return (java.lang.Long) getAttribute(type.generated_offsets[11]);
      }
      public void set_minItems(java.lang.Long v) {
        setAttribute(type.generated_offsets[11], v);
      }
      public java.lang.Long maxItems() {
        return (java.lang.Long) getAttribute(type.generated_offsets[12]);
      }
      public void set_maxItems(java.lang.Long v) {
        setAttribute(type.generated_offsets[12], v);
      }
      public core.Array<java.lang.String> enum_() {
        return (core.Array<java.lang.String>) getAttribute(type.generated_offsets[13]);
      }
      public void set_enum_(core.Array<java.lang.String> v) {
        setAttribute(type.generated_offsets[13], v);
      }
      public runtime.SchemaObject additionalProperties() {
        return (runtime.SchemaObject) getAttribute(type.generated_offsets[14]);
      }
      public void set_additionalProperties(runtime.SchemaObject v) {
        setAttribute(type.generated_offsets[14], v);
      }
    }
    public static final class UserCredential extends GreyCat.Object {
      public static final java.lang.String name = "runtime::UserCredential";

      private UserCredential(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public UserCredential(java.lang.Long offset, java.lang.String pass) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[118], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[118].map_attributes(new Object[] {offset, pass}));
      }
      public java.lang.Long offset() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_offset(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String pass() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_pass(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class SecurityPolicy extends GreyCat.Object {
      public static final java.lang.String name = "runtime::SecurityPolicy";

      private SecurityPolicy(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SecurityPolicy(core.Array<runtime.SecurityEntity> entities, core.Map<java.lang.String, runtime.UserCredential> credentials, runtime.SecurityFields fields, core.Map<java.lang.String, java.lang.String> keys, greycat.gc.core.time keys_last_refresh) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[119], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[119].map_attributes(new Object[] {entities, credentials, fields, keys, keys_last_refresh}));
      }
      public core.Array<runtime.SecurityEntity> entities() {
        return (core.Array<runtime.SecurityEntity>) getAttribute(type.generated_offsets[0]);
      }
      public void set_entities(core.Array<runtime.SecurityEntity> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, runtime.UserCredential> credentials() {
        return (core.Map<java.lang.String, runtime.UserCredential>) getAttribute(type.generated_offsets[1]);
      }
      public void set_credentials(core.Map<java.lang.String, runtime.UserCredential> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.SecurityFields fields() {
        return (runtime.SecurityFields) getAttribute(type.generated_offsets[2]);
      }
      public void set_fields(runtime.SecurityFields v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public core.Map<java.lang.String, java.lang.String> keys() {
        return (core.Map<java.lang.String, java.lang.String>) getAttribute(type.generated_offsets[3]);
      }
      public void set_keys(core.Map<java.lang.String, java.lang.String> v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public greycat.gc.core.time keys_last_refresh() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[4]);
      }
      public void set_keys_last_refresh(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class UserGroupPolicy extends GreyCat.Object {
      public static final java.lang.String name = "runtime::UserGroupPolicy";

      private UserGroupPolicy(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public UserGroupPolicy(java.lang.Long group_id, runtime.UserGroupPolicyType type) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[120], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[120].map_attributes(new Object[] {group_id, type}));
      }
      public java.lang.Long group_id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_group_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.UserGroupPolicyType type() {
        return (runtime.UserGroupPolicyType) getAttribute(type.generated_offsets[1]);
      }
      public void set_type(runtime.UserGroupPolicyType v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class ComponentsObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::ComponentsObject";

      private ComponentsObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ComponentsObject(core.Map<java.lang.String, runtime.SchemaObject> schemas) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[121], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[121].map_attributes(new Object[] {schemas}));
      }
      public core.Map<java.lang.String, runtime.SchemaObject> schemas() {
        return (core.Map<java.lang.String, runtime.SchemaObject>) getAttribute(type.generated_offsets[0]);
      }
      public void set_schemas(core.Map<java.lang.String, runtime.SchemaObject> v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class McpTool extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpTool";

      private McpTool(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpTool(java.lang.String name, java.lang.String title, java.lang.String description, runtime.SchemaObject inputSchema, runtime.SchemaObject outputSchema, core.Map<java.lang.String, java.lang.Object> annotations) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[122], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[122].map_attributes(new Object[] {name, title, description, inputSchema, outputSchema, annotations}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String title() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_title(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String description() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_description(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public runtime.SchemaObject inputSchema() {
        return (runtime.SchemaObject) getAttribute(type.generated_offsets[3]);
      }
      public void set_inputSchema(runtime.SchemaObject v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public runtime.SchemaObject outputSchema() {
        return (runtime.SchemaObject) getAttribute(type.generated_offsets[4]);
      }
      public void set_outputSchema(runtime.SchemaObject v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public core.Map<java.lang.String, java.lang.Object> annotations() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[5]);
      }
      public void set_annotations(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[5], v);
      }
    }
    public static final class McpRole extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::McpRole";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("user", 0);
        indicesByValues.put("assistant", 1);
      }

      private McpRole(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpRole() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[123], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[123].map_attributes(new Object[] {}));
      }
      public static McpRole get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static McpRole get(java.lang.String key, GreyCat greycat) {
        return (McpRole) greycat.libs_by_name.get(std.name).mapped[123].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class LicenseType extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::LicenseType";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("community", 0);
        indicesByValues.put("enterprise", 1);
        indicesByValues.put("testing", 2);
      }

      private LicenseType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public LicenseType() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[124], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[124].map_attributes(new Object[] {}));
      }
      public static LicenseType get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static LicenseType get(java.lang.String key, GreyCat greycat) {
        return (LicenseType) greycat.libs_by_name.get(std.name).mapped[124].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class FixedPeriodicity extends GreyCat.Object {
      public static final java.lang.String name = "runtime::FixedPeriodicity";

      private FixedPeriodicity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public FixedPeriodicity(greycat.gc.core.duration every) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[125], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[125].map_attributes(new Object[] {every}));
      }
      public greycat.gc.core.duration every() {
        return (greycat.gc.core.duration) getAttribute(type.generated_offsets[0]);
      }
      public void set_every(greycat.gc.core.duration v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class SchemaType extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::SchemaType";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("string", 0);
        indicesByValues.put("number", 1);
        indicesByValues.put("integer", 2);
        indicesByValues.put("boolean_", 3);
        indicesByValues.put("object", 4);
        indicesByValues.put("array", 5);
        indicesByValues.put("null_", 6);
      }

      private SchemaType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SchemaType() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[126], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[126].map_attributes(new Object[] {}));
      }
      public static SchemaType get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static SchemaType get(java.lang.String key, GreyCat greycat) {
        return (SchemaType) greycat.libs_by_name.get(std.name).mapped[126].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class Debug extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Debug";

      private Debug(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Debug(java.lang.Long id, core.Array<runtime.Frame> frames, java.lang.Object root) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[127], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[127].map_attributes(new Object[] {id, frames, root}));
      }
      public java.lang.Long id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<runtime.Frame> frames() {
        return (core.Array<runtime.Frame>) getAttribute(type.generated_offsets[1]);
      }
      public void set_frames(core.Array<runtime.Frame> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Object root() {
        return getAttribute(type.generated_offsets[2]);
      }
      public void set_root(java.lang.Object v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public static void resume(java.lang.Long id) throws java.io.IOException {
        resume(id, GreyCat.DEFAULT);
      }

      public static void resume(java.lang.Long id, GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::Debug::resume", id);
      }
      public static runtime.Debug get(java.lang.Long id) throws java.io.IOException {
        return get(id, GreyCat.DEFAULT);
      }

      public static runtime.Debug get(java.lang.Long id, GreyCat greycat) throws java.io.IOException {
        return (runtime.Debug) greycat.call("runtime::Debug::get", id);
      }
      public static core.Array<java.lang.Long> all() throws java.io.IOException {
        return all(GreyCat.DEFAULT);
      }

      public static core.Array<java.lang.Long> all(GreyCat greycat) throws java.io.IOException {
        return (core.Array<java.lang.Long>) greycat.call("runtime::Debug::all");
      }
    }
    public static final class McpInitializeParams extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpInitializeParams";

      private McpInitializeParams(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpInitializeParams(core.Map<java.lang.String, java.lang.Object> _meta, java.lang.String protocolVersion, runtime.McpClientCapabilities capabilities, runtime.McpImplementation clientInfo) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[128], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[128].map_attributes(new Object[] {_meta, protocolVersion, capabilities, clientInfo}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String protocolVersion() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_protocolVersion(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.McpClientCapabilities capabilities() {
        return (runtime.McpClientCapabilities) getAttribute(type.generated_offsets[2]);
      }
      public void set_capabilities(runtime.McpClientCapabilities v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public runtime.McpImplementation clientInfo() {
        return (runtime.McpImplementation) getAttribute(type.generated_offsets[3]);
      }
      public void set_clientInfo(runtime.McpImplementation v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class McpPriority extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::McpPriority";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("MostImportant", 0);
        indicesByValues.put("LeastImportant", 1);
      }

      private McpPriority(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpPriority() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[129], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[129].map_attributes(new Object[] {}));
      }
      public static McpPriority get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static McpPriority get(java.lang.String key, GreyCat greycat) {
        return (McpPriority) greycat.libs_by_name.get(std.name).mapped[129].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class McpInitializeResult extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpInitializeResult";

      private McpInitializeResult(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpInitializeResult(core.Map<java.lang.String, java.lang.Object> _meta, java.lang.String protocolVersion, runtime.McpServerCapabilities capabilities, runtime.McpImplementation serverInfo, java.lang.String instructions) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[130], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[130].map_attributes(new Object[] {_meta, protocolVersion, capabilities, serverInfo, instructions}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String protocolVersion() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_protocolVersion(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.McpServerCapabilities capabilities() {
        return (runtime.McpServerCapabilities) getAttribute(type.generated_offsets[2]);
      }
      public void set_capabilities(runtime.McpServerCapabilities v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public runtime.McpImplementation serverInfo() {
        return (runtime.McpImplementation) getAttribute(type.generated_offsets[3]);
      }
      public void set_serverInfo(runtime.McpImplementation v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.String instructions() {
        return (java.lang.String) getAttribute(type.generated_offsets[4]);
      }
      public void set_instructions(java.lang.String v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class McpAudioContent extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpAudioContent";

      private McpAudioContent(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpAudioContent(runtime.McpContentType type, core.Map<java.lang.String, java.lang.Object> _meta, runtime.McpAnnotations annotations, java.lang.String data, java.lang.String mimeType) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[131], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[131].map_attributes(new Object[] {type, _meta, annotations, data, mimeType}));
      }
      public runtime.McpContentType type() {
        return (runtime.McpContentType) getAttribute(type.generated_offsets[0]);
      }
      public void set_type(runtime.McpContentType v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[1]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.McpAnnotations annotations() {
        return (runtime.McpAnnotations) getAttribute(type.generated_offsets[2]);
      }
      public void set_annotations(runtime.McpAnnotations v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String data() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_data(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.String mimeType() {
        return (java.lang.String) getAttribute(type.generated_offsets[4]);
      }
      public void set_mimeType(java.lang.String v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class Scheduler extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Scheduler";

      private Scheduler(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Scheduler() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[132], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[132].map_attributes(new Object[] {}));
      }
      public static java.lang.Boolean deactivate(core.function function) throws java.io.IOException {
        return deactivate(function, GreyCat.DEFAULT);
      }

      public static java.lang.Boolean deactivate(core.function function, GreyCat greycat) throws java.io.IOException {
        return (java.lang.Boolean) greycat.call("runtime::Scheduler::deactivate", function);
      }
      public static java.lang.Boolean activate(core.function function) throws java.io.IOException {
        return activate(function, GreyCat.DEFAULT);
      }

      public static java.lang.Boolean activate(core.function function, GreyCat greycat) throws java.io.IOException {
        return (java.lang.Boolean) greycat.call("runtime::Scheduler::activate", function);
      }
      public static runtime.PeriodicTask find(core.function function) throws java.io.IOException {
        return find(function, GreyCat.DEFAULT);
      }

      public static runtime.PeriodicTask find(core.function function, GreyCat greycat) throws java.io.IOException {
        return (runtime.PeriodicTask) greycat.call("runtime::Scheduler::find", function);
      }
      public static core.Array<runtime.PeriodicTask> list() throws java.io.IOException {
        return list(GreyCat.DEFAULT);
      }

      public static core.Array<runtime.PeriodicTask> list(GreyCat greycat) throws java.io.IOException {
        return (core.Array<runtime.PeriodicTask>) greycat.call("runtime::Scheduler::list");
      }
      public static void add(core.function function, runtime.Periodicity periodicity, runtime.PeriodicOptions options) throws java.io.IOException {
        add(function, periodicity, options, GreyCat.DEFAULT);
      }

      public static void add(core.function function, runtime.Periodicity periodicity, runtime.PeriodicOptions options, GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::Scheduler::add", function, periodicity, options);
      }
    }
    public static final class McpImplementation extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpImplementation";

      private McpImplementation(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpImplementation(java.lang.String name, java.lang.String title, java.lang.String version) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[133], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[133].map_attributes(new Object[] {name, title, version}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String title() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_title(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String version() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_version(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class System extends GreyCat.Object {
      public static final java.lang.String name = "runtime::System";

      private System(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public System() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[134], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[134].map_attributes(new Object[] {}));
      }
    }
    public static final class McpResourceContent extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpResourceContent";

      private McpResourceContent(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpResourceContent(runtime.McpContentType type, core.Map<java.lang.String, java.lang.Object> _meta, runtime.McpAnnotations annotations, java.lang.String uri, java.lang.String description, java.lang.String mimeType, java.lang.Long size) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[135], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[135].map_attributes(new Object[] {type, _meta, annotations, uri, description, mimeType, size}));
      }
      public runtime.McpContentType type() {
        return (runtime.McpContentType) getAttribute(type.generated_offsets[0]);
      }
      public void set_type(runtime.McpContentType v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[1]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.McpAnnotations annotations() {
        return (runtime.McpAnnotations) getAttribute(type.generated_offsets[2]);
      }
      public void set_annotations(runtime.McpAnnotations v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String uri() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_uri(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.String description() {
        return (java.lang.String) getAttribute(type.generated_offsets[4]);
      }
      public void set_description(java.lang.String v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.String mimeType() {
        return (java.lang.String) getAttribute(type.generated_offsets[5]);
      }
      public void set_mimeType(java.lang.String v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long size() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_size(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
    }
    public static final class UserGroupPolicyType extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::UserGroupPolicyType";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("read", 0);
        indicesByValues.put("write", 1);
        indicesByValues.put("execute", 2);
      }

      private UserGroupPolicyType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public UserGroupPolicyType() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[136], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[136].map_attributes(new Object[] {}));
      }
      public static UserGroupPolicyType get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static UserGroupPolicyType get(java.lang.String key, GreyCat greycat) {
        return (UserGroupPolicyType) greycat.libs_by_name.get(std.name).mapped[136].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class OpenApi extends GreyCat.Object {
      public static final java.lang.String name = "runtime::OpenApi";

      private OpenApi(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public OpenApi() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[137], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[137].map_attributes(new Object[] {}));
      }
      public static runtime.OpenApiV3 v3() throws java.io.IOException {
        return v3(GreyCat.DEFAULT);
      }

      public static runtime.OpenApiV3 v3(GreyCat greycat) throws java.io.IOException {
        return (runtime.OpenApiV3) greycat.call("runtime::OpenApi::v3");
      }
    }
    public static final class Runtime extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Runtime";

      private Runtime(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Runtime() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[138], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[138].map_attributes(new Object[] {}));
      }
      public static void backup_full() throws java.io.IOException {
        backup_full(GreyCat.DEFAULT);
      }

      public static void backup_full(GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::Runtime::backup_full");
      }
      public static java.lang.Object root() throws java.io.IOException {
        return root(GreyCat.DEFAULT);
      }

      public static java.lang.Object root(GreyCat greycat) throws java.io.IOException {
        return greycat.call("runtime::Runtime::root");
      }
      public static void abi() throws java.io.IOException {
        abi(GreyCat.DEFAULT);
      }

      public static void abi(GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::Runtime::abi");
      }
      public static runtime.RuntimeInfo info() throws java.io.IOException {
        return info(GreyCat.DEFAULT);
      }

      public static runtime.RuntimeInfo info(GreyCat greycat) throws java.io.IOException {
        return (runtime.RuntimeInfo) greycat.call("runtime::Runtime::info");
      }
    }
    public static final class RequestBodyObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::RequestBodyObject";

      private RequestBodyObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public RequestBodyObject(core.Map<java.lang.String, runtime.MediaTypeObject> content, java.lang.Boolean required) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[139], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[139].map_attributes(new Object[] {content, required}));
      }
      public core.Map<java.lang.String, runtime.MediaTypeObject> content() {
        return (core.Map<java.lang.String, runtime.MediaTypeObject>) getAttribute(type.generated_offsets[0]);
      }
      public void set_content(core.Map<java.lang.String, runtime.MediaTypeObject> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Boolean required() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[1]);
      }
      public void set_required(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class TaskStatus extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::TaskStatus";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("empty", 0);
        indicesByValues.put("waiting", 1);
        indicesByValues.put("running", 2);
        indicesByValues.put("await", 3);
        indicesByValues.put("cancelled", 4);
        indicesByValues.put("error", 5);
        indicesByValues.put("ended", 6);
        indicesByValues.put("ended_with_errors", 7);
        indicesByValues.put("breakpoint", 8);
      }

      private TaskStatus(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TaskStatus() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[140], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[140].map_attributes(new Object[] {}));
      }
      public static TaskStatus get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static TaskStatus get(java.lang.String key, GreyCat greycat) {
        return (TaskStatus) greycat.libs_by_name.get(std.name).mapped[140].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class User extends GreyCat.Object {
      public static final java.lang.String name = "runtime::User";

      private User(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public User(java.lang.Long id, java.lang.String name, java.lang.Boolean activated, java.lang.String full_name, java.lang.String email, java.lang.String role, core.Array<runtime.UserGroupPolicy> groups, java.lang.Long groups_flags, java.lang.Boolean external) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[141], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[141].map_attributes(new Object[] {id, name, activated, full_name, email, role, groups, groups_flags, external}));
      }
      public java.lang.Long id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Boolean activated() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[2]);
      }
      public void set_activated(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String full_name() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_full_name(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.String email() {
        return (java.lang.String) getAttribute(type.generated_offsets[4]);
      }
      public void set_email(java.lang.String v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.String role() {
        return (java.lang.String) getAttribute(type.generated_offsets[5]);
      }
      public void set_role(java.lang.String v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public core.Array<runtime.UserGroupPolicy> groups() {
        return (core.Array<runtime.UserGroupPolicy>) getAttribute(type.generated_offsets[6]);
      }
      public void set_groups(core.Array<runtime.UserGroupPolicy> v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public java.lang.Long groups_flags() {
        return (java.lang.Long) getAttribute(type.generated_offsets[7]);
      }
      public void set_groups_flags(java.lang.Long v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public java.lang.Boolean external() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[8]);
      }
      public void set_external(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[8], v);
      }
      public static java.lang.Boolean setPassword(java.lang.String name, java.lang.String pass) throws java.io.IOException {
        return setPassword(name, pass, GreyCat.DEFAULT);
      }

      public static java.lang.Boolean setPassword(java.lang.String name, java.lang.String pass, GreyCat greycat) throws java.io.IOException {
        return (java.lang.Boolean) greycat.call("runtime::User::setPassword", name, pass);
      }
      public static core.Array<java.lang.String> permissions() throws java.io.IOException {
        return permissions(GreyCat.DEFAULT);
      }

      public static core.Array<java.lang.String> permissions(GreyCat greycat) throws java.io.IOException {
        return (core.Array<java.lang.String>) greycat.call("runtime::User::permissions");
      }
      public static runtime.User me() throws java.io.IOException {
        return me(GreyCat.DEFAULT);
      }

      public static runtime.User me(GreyCat greycat) throws java.io.IOException {
        return (runtime.User) greycat.call("runtime::User::me");
      }
      public static java.lang.Long current() throws java.io.IOException {
        return current(GreyCat.DEFAULT);
      }

      public static java.lang.Long current(GreyCat greycat) throws java.io.IOException {
        return (java.lang.Long) greycat.call("runtime::User::current");
      }
      public static java.lang.String renew(java.lang.Boolean use_cookie) throws java.io.IOException {
        return renew(use_cookie, GreyCat.DEFAULT);
      }

      public static java.lang.String renew(java.lang.Boolean use_cookie, GreyCat greycat) throws java.io.IOException {
        return (java.lang.String) greycat.call("runtime::User::renew", use_cookie);
      }
      public static void logout() throws java.io.IOException {
        logout(GreyCat.DEFAULT);
      }

      public static void logout(GreyCat greycat) throws java.io.IOException {
        greycat.call("runtime::User::logout");
      }
      public static java.lang.String tokenLogin(java.lang.String token, java.lang.Boolean use_cookie) throws java.io.IOException {
        return tokenLogin(token, use_cookie, GreyCat.DEFAULT);
      }

      public static java.lang.String tokenLogin(java.lang.String token, java.lang.Boolean use_cookie, GreyCat greycat) throws java.io.IOException {
        return (java.lang.String) greycat.call("runtime::User::tokenLogin", token, use_cookie);
      }
      public static java.lang.String login(java.lang.String credentials, java.lang.Boolean use_cookie) throws java.io.IOException {
        return login(credentials, use_cookie, GreyCat.DEFAULT);
      }

      public static java.lang.String login(java.lang.String credentials, java.lang.Boolean use_cookie, GreyCat greycat) throws java.io.IOException {
        return (java.lang.String) greycat.call("runtime::User::login", credentials, use_cookie);
      }
    }
    public static final class ChildProcess extends GreyCat.Object {
      public static final java.lang.String name = "runtime::ChildProcess";

      private ChildProcess(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ChildProcess(java.lang.Long pid) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[142], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[142].map_attributes(new Object[] {pid}));
      }
      public java.lang.Long pid() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_pid(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class McpBaseMetadata extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpBaseMetadata";

      private McpBaseMetadata(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpBaseMetadata(java.lang.String name, java.lang.String title) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[143], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[143].map_attributes(new Object[] {name, title}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String title() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_title(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class Permission extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Permission";

      private Permission(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Permission(java.lang.String name, java.lang.String description) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[144], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[144].map_attributes(new Object[] {name, description}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String description() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_description(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public static core.Array<runtime.Permission> all() throws java.io.IOException {
        return all(GreyCat.DEFAULT);
      }

      public static core.Array<runtime.Permission> all(GreyCat greycat) throws java.io.IOException {
        return (core.Array<runtime.Permission>) greycat.call("runtime::Permission::all");
      }
    }
    public static final class McpServerPromptsCapabilities extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpServerPromptsCapabilities";

      private McpServerPromptsCapabilities(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpServerPromptsCapabilities(java.lang.Boolean listChanged) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[145], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[145].map_attributes(new Object[] {listChanged}));
      }
      public java.lang.Boolean listChanged() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[0]);
      }
      public void set_listChanged(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class PathItemObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::PathItemObject";

      private PathItemObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public PathItemObject(java.lang.String description, runtime.OperationObject post) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[146], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[146].map_attributes(new Object[] {description, post}));
      }
      public java.lang.String description() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_description(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public runtime.OperationObject post() {
        return (runtime.OperationObject) getAttribute(type.generated_offsets[1]);
      }
      public void set_post(runtime.OperationObject v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class McpTextContent extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpTextContent";

      private McpTextContent(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpTextContent(runtime.McpContentType type, core.Map<java.lang.String, java.lang.Object> _meta, runtime.McpAnnotations annotations, java.lang.String text) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[147], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[147].map_attributes(new Object[] {type, _meta, annotations, text}));
      }
      public runtime.McpContentType type() {
        return (runtime.McpContentType) getAttribute(type.generated_offsets[0]);
      }
      public void set_type(runtime.McpContentType v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[1]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public runtime.McpAnnotations annotations() {
        return (runtime.McpAnnotations) getAttribute(type.generated_offsets[2]);
      }
      public void set_annotations(runtime.McpAnnotations v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.String text() {
        return (java.lang.String) getAttribute(type.generated_offsets[3]);
      }
      public void set_text(java.lang.String v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class PeriodicOptions extends GreyCat.Object {
      public static final java.lang.String name = "runtime::PeriodicOptions";

      private PeriodicOptions(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public PeriodicOptions(java.lang.Boolean activated, greycat.gc.core.time start, greycat.gc.core.duration max_duration) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[148], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[148].map_attributes(new Object[] {activated, start, max_duration}));
      }
      public java.lang.Boolean activated() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[0]);
      }
      public void set_activated(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public greycat.gc.core.time start() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[1]);
      }
      public void set_start(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public greycat.gc.core.duration max_duration() {
        return (greycat.gc.core.duration) getAttribute(type.generated_offsets[2]);
      }
      public void set_max_duration(greycat.gc.core.duration v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class UserGroup extends GreyCat.Object {
      public static final java.lang.String name = "runtime::UserGroup";

      private UserGroup(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public UserGroup(java.lang.Long id, java.lang.String name, java.lang.Boolean activated) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[149], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[149].map_attributes(new Object[] {id, name, activated}));
      }
      public java.lang.Long id() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_id(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Boolean activated() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[2]);
      }
      public void set_activated(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class ChildProcessResult extends GreyCat.Object {
      public static final java.lang.String name = "runtime::ChildProcessResult";

      private ChildProcessResult(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ChildProcessResult(java.lang.Long code, java.lang.String stdout, java.lang.String stderr) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[150], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[150].map_attributes(new Object[] {code, stdout, stderr}));
      }
      public java.lang.Long code() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_code(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String stdout() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_stdout(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.String stderr() {
        return (java.lang.String) getAttribute(type.generated_offsets[2]);
      }
      public void set_stderr(java.lang.String v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class ResponseCode extends GreyCat.Enum {
      public static final java.lang.String name = "runtime::ResponseCode";

      private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

      static {
        indicesByValues.put("200", 0);
        indicesByValues.put("400", 1);
        indicesByValues.put("404", 2);
      }

      private ResponseCode(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ResponseCode() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[151], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[151].map_attributes(new Object[] {}));
      }
      public static ResponseCode get(java.lang.String key) {
        return get(key, GreyCat.DEFAULT);
      }

      public static ResponseCode get(java.lang.String key, GreyCat greycat) {
        return (ResponseCode) greycat.libs_by_name.get(std.name).mapped[151].enum_values[indicesByValues.get(key)];
      }
    }
    public static final class McpToolsListResult extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpToolsListResult";

      private McpToolsListResult(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpToolsListResult(core.Map<java.lang.String, java.lang.Object> _meta, core.Array<runtime.McpTool> tools) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[152], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[152].map_attributes(new Object[] {_meta, tools}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<runtime.McpTool> tools() {
        return (core.Array<runtime.McpTool>) getAttribute(type.generated_offsets[1]);
      }
      public void set_tools(core.Array<runtime.McpTool> v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class ResponseObject extends GreyCat.Object {
      public static final java.lang.String name = "runtime::ResponseObject";

      private ResponseObject(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ResponseObject(java.lang.String description, core.Map<java.lang.String, runtime.HeaderObject> headers, core.Map<java.lang.String, runtime.MediaTypeObject> content) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[153], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[153].map_attributes(new Object[] {description, headers, content}));
      }
      public java.lang.String description() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_description(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Map<java.lang.String, runtime.HeaderObject> headers() {
        return (core.Map<java.lang.String, runtime.HeaderObject>) getAttribute(type.generated_offsets[1]);
      }
      public void set_headers(core.Map<java.lang.String, runtime.HeaderObject> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Map<java.lang.String, runtime.MediaTypeObject> content() {
        return (core.Map<java.lang.String, runtime.MediaTypeObject>) getAttribute(type.generated_offsets[2]);
      }
      public void set_content(core.Map<java.lang.String, runtime.MediaTypeObject> v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class McpRequestParams extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpRequestParams";

      private McpRequestParams(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpRequestParams(core.Map<java.lang.String, java.lang.Object> _meta) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[154], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[154].map_attributes(new Object[] {_meta}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class Variable extends GreyCat.Object {
      public static final java.lang.String name = "runtime::Variable";

      private Variable(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Variable(java.lang.String name, java.lang.Object value) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[155], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[155].map_attributes(new Object[] {name, value}));
      }
      public java.lang.String name() {
        return (java.lang.String) getAttribute(type.generated_offsets[0]);
      }
      public void set_name(java.lang.String v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Object value() {
        return getAttribute(type.generated_offsets[1]);
      }
      public void set_value(java.lang.Object v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class LogDataUsage extends GreyCat.Object {
      public static final java.lang.String name = "runtime::LogDataUsage";

      private LogDataUsage(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public LogDataUsage(java.lang.Long read_bytes, java.lang.Long read_hits, java.lang.Long read_wasted, java.lang.Long write_bytes, java.lang.Long write_hits, java.lang.Long cache_bytes, java.lang.Long cache_hits) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[156], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[156].map_attributes(new Object[] {read_bytes, read_hits, read_wasted, write_bytes, write_hits, cache_bytes, cache_hits}));
      }
      public java.lang.Long read_bytes() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_read_bytes(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long read_hits() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_read_hits(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long read_wasted() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_read_wasted(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Long write_bytes() {
        return (java.lang.Long) getAttribute(type.generated_offsets[3]);
      }
      public void set_write_bytes(java.lang.Long v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Long write_hits() {
        return (java.lang.Long) getAttribute(type.generated_offsets[4]);
      }
      public void set_write_hits(java.lang.Long v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Long cache_bytes() {
        return (java.lang.Long) getAttribute(type.generated_offsets[5]);
      }
      public void set_cache_bytes(java.lang.Long v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Long cache_hits() {
        return (java.lang.Long) getAttribute(type.generated_offsets[6]);
      }
      public void set_cache_hits(java.lang.Long v) {
        setAttribute(type.generated_offsets[6], v);
      }
    }
    public static final class McpToolsListParams extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpToolsListParams";

      private McpToolsListParams(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpToolsListParams(core.Map<java.lang.String, java.lang.Object> _meta, java.lang.String cursor) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[157], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[157].map_attributes(new Object[] {_meta, cursor}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.String cursor() {
        return (java.lang.String) getAttribute(type.generated_offsets[1]);
      }
      public void set_cursor(java.lang.String v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class McpResult extends GreyCat.Object {
      public static final java.lang.String name = "runtime::McpResult";

      private McpResult(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public McpResult(core.Map<java.lang.String, java.lang.Object> _meta) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[158], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[158].map_attributes(new Object[] {_meta}));
      }
      public core.Map<java.lang.String, java.lang.Object> _meta() {
        return (core.Map<java.lang.String, java.lang.Object>) getAttribute(type.generated_offsets[0]);
      }
      public void set__meta(core.Map<java.lang.String, java.lang.Object> v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static runtime.McpInitializeResult mcp_initialize(runtime.McpInitializeParams params) throws java.io.IOException {
      return mcp_initialize(params, GreyCat.DEFAULT);
    }

    public static runtime.McpInitializeResult mcp_initialize(runtime.McpInitializeParams params, GreyCat greycat) throws java.io.IOException {
      return (runtime.McpInitializeResult) greycat.call("runtime::mcp_initialize", params);
    }
    public static runtime.McpToolsListResult mcp_tools_list(runtime.McpToolsListParams params) throws java.io.IOException {
      return mcp_tools_list(params, GreyCat.DEFAULT);
    }

    public static runtime.McpToolsListResult mcp_tools_list(runtime.McpToolsListParams params, GreyCat greycat) throws java.io.IOException {
      return (runtime.McpToolsListResult) greycat.call("runtime::mcp_tools_list", params);
    }
    public static runtime.McpToolsCallResult mcp_tools_call(runtime.McpToolsCallParams params) throws java.io.IOException {
      return mcp_tools_call(params, GreyCat.DEFAULT);
    }

    public static runtime.McpToolsCallResult mcp_tools_call(runtime.McpToolsCallParams params, GreyCat greycat) throws java.io.IOException {
      return (runtime.McpToolsCallResult) greycat.call("runtime::mcp_tools_call", params);
    }
  }
  public static final class util {
    public static final class Random extends GreyCat.Object {
      public static final java.lang.String name = "util::Random";

      private Random(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Random(java.lang.Long seed, java.lang.Double v) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[159], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[159].map_attributes(new Object[] {seed, v}));
      }
      public java.lang.Long seed() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_seed(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Double v() {
        return (java.lang.Double) getAttribute(type.generated_offsets[1]);
      }
      public void set_v(java.lang.Double v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class Histogram<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::Histogram";

      private Histogram(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Histogram(util.Quantizer<T> quantizer, core.Array<java.lang.Long> bins, java.lang.Long nb_rejected, java.lang.Long nb_accepted, T min, T max, java.lang.Double sum, java.lang.Double sumsq) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[160], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[160].map_attributes(new Object[] {quantizer, bins, nb_rejected, nb_accepted, min, max, sum, sumsq}));
      }
      public util.Quantizer<T> quantizer() {
        return (util.Quantizer<T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_quantizer(util.Quantizer<T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.Array<java.lang.Long> bins() {
        return (core.Array<java.lang.Long>) getAttribute(type.generated_offsets[1]);
      }
      public void set_bins(core.Array<java.lang.Long> v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long nb_rejected() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_nb_rejected(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Long nb_accepted() {
        return (java.lang.Long) getAttribute(type.generated_offsets[3]);
      }
      public void set_nb_accepted(java.lang.Long v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public T min() {
        return (T) getAttribute(type.generated_offsets[4]);
      }
      public void set_min(T v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public T max() {
        return (T) getAttribute(type.generated_offsets[5]);
      }
      public void set_max(T v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) getAttribute(type.generated_offsets[6]);
      }
      public void set_sum(java.lang.Double v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public java.lang.Double sumsq() {
        return (java.lang.Double) getAttribute(type.generated_offsets[7]);
      }
      public void set_sumsq(java.lang.Double v) {
        setAttribute(type.generated_offsets[7], v);
      }
    }
    public static final class MultiQuantizer<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::MultiQuantizer";

      private MultiQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public MultiQuantizer(core.Array<util.Quantizer<T>> quantizers) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[161], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[161].map_attributes(new Object[] {quantizers}));
      }
      public core.Array<util.Quantizer<T>> quantizers() {
        return (core.Array<util.Quantizer<T>>) getAttribute(type.generated_offsets[0]);
      }
      public void set_quantizers(core.Array<util.Quantizer<T>> v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class Gaussian<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::Gaussian";

      private Gaussian(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Gaussian(java.lang.Double sum, java.lang.Double sumsq, java.lang.Long count, T min, T max) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[162], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[162].map_attributes(new Object[] {sum, sumsq, count, min, max}));
      }
      public java.lang.Double sum() {
        return (java.lang.Double) getAttribute(type.generated_offsets[0]);
      }
      public void set_sum(java.lang.Double v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Double sumsq() {
        return (java.lang.Double) getAttribute(type.generated_offsets[1]);
      }
      public void set_sumsq(java.lang.Double v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public T min() {
        return (T) getAttribute(type.generated_offsets[3]);
      }
      public void set_min(T v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public T max() {
        return (T) getAttribute(type.generated_offsets[4]);
      }
      public void set_max(T v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class Assert extends GreyCat.Object {
      public static final java.lang.String name = "util::Assert";

      private Assert(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Assert() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[163], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[163].map_attributes(new Object[] {}));
      }
    }
    public static final class ProgressTracker extends GreyCat.Object {
      public static final java.lang.String name = "util::ProgressTracker";

      private ProgressTracker(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public ProgressTracker(greycat.gc.core.time start, java.lang.Long total, java.lang.Long counter, greycat.gc.core.duration duration, java.lang.Double progress, java.lang.Double speed, greycat.gc.core.duration remaining) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[164], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[164].map_attributes(new Object[] {start, total, counter, duration, progress, speed, remaining}));
      }
      public greycat.gc.core.time start() {
        return (greycat.gc.core.time) getAttribute(type.generated_offsets[0]);
      }
      public void set_start(greycat.gc.core.time v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long total() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_total(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long counter() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_counter(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public greycat.gc.core.duration duration() {
        return (greycat.gc.core.duration) getAttribute(type.generated_offsets[3]);
      }
      public void set_duration(greycat.gc.core.duration v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Double progress() {
        return (java.lang.Double) getAttribute(type.generated_offsets[4]);
      }
      public void set_progress(java.lang.Double v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public java.lang.Double speed() {
        return (java.lang.Double) getAttribute(type.generated_offsets[5]);
      }
      public void set_speed(java.lang.Double v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public greycat.gc.core.duration remaining() {
        return (greycat.gc.core.duration) getAttribute(type.generated_offsets[6]);
      }
      public void set_remaining(greycat.gc.core.duration v) {
        setAttribute(type.generated_offsets[6], v);
      }
    }
    public static final class GaussianProfileSlot extends GreyCat.Object {
      public static final java.lang.String name = "util::GaussianProfileSlot";

      private GaussianProfileSlot(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public GaussianProfileSlot(java.lang.Long sum, java.lang.Long sumsq, java.lang.Long count) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[165], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[165].map_attributes(new Object[] {sum, sumsq, count}));
      }
      public java.lang.Long sum() {
        return (java.lang.Long) getAttribute(type.generated_offsets[0]);
      }
      public void set_sum(java.lang.Long v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long sumsq() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_sumsq(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class TimeWindow<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::TimeWindow";

      private TimeWindow(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public TimeWindow(core.Table<core.Tuple<greycat.gc.core.time, T>> values, greycat.gc.core.duration span, java.lang.Double sum, java.lang.Double sumsq, core.field field) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[166], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[166].map_attributes(new Object[] {values, span, sum, sumsq, field}));
      }
      public core.Table<core.Tuple<greycat.gc.core.time, T>> values() {
        return (core.Table<core.Tuple<greycat.gc.core.time, T>>) getAttribute(type.generated_offsets[0]);
      }
      public void set_values(core.Table<core.Tuple<greycat.gc.core.time, T>> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public greycat.gc.core.duration span() {
        return (greycat.gc.core.duration) getAttribute(type.generated_offsets[1]);
      }
      public void set_span(greycat.gc.core.duration v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) getAttribute(type.generated_offsets[2]);
      }
      public void set_sum(java.lang.Double v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Double sumsq() {
        return (java.lang.Double) getAttribute(type.generated_offsets[3]);
      }
      public void set_sumsq(java.lang.Double v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public core.field field() {
        return (core.field) getAttribute(type.generated_offsets[4]);
      }
      public void set_field(core.field v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class LinearQuantizer<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::LinearQuantizer";

      private LinearQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public LinearQuantizer(T min, T max, java.lang.Long bins, java.lang.Boolean open) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[167], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[167].map_attributes(new Object[] {min, max, bins, open}));
      }
      public T min() {
        return (T) getAttribute(type.generated_offsets[0]);
      }
      public void set_min(T v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public T max() {
        return (T) getAttribute(type.generated_offsets[1]);
      }
      public void set_max(T v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long bins() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_bins(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Boolean open() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[3]);
      }
      public void set_open(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class Crypto extends GreyCat.Object {
      public static final java.lang.String name = "util::Crypto";

      private Crypto(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Crypto() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[168], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[168].map_attributes(new Object[] {}));
      }
    }
    public static final class SlidingWindow<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::SlidingWindow";

      private SlidingWindow(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public SlidingWindow(core.Array<T> values, java.lang.Long span, java.lang.Double sum, java.lang.Double sumsq, core.field field) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[169], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[169].map_attributes(new Object[] {values, span, sum, sumsq, field}));
      }
      public core.Array<T> values() {
        return (core.Array<T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_values(core.Array<T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long span() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_span(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) getAttribute(type.generated_offsets[2]);
      }
      public void set_sum(java.lang.Double v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Double sumsq() {
        return (java.lang.Double) getAttribute(type.generated_offsets[3]);
      }
      public void set_sumsq(java.lang.Double v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public core.field field() {
        return (core.field) getAttribute(type.generated_offsets[4]);
      }
      public void set_field(core.field v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class Queue<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::Queue";

      private Queue(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Queue(core.Array<T> values, java.lang.Long capacity) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[170], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[170].map_attributes(new Object[] {values, capacity}));
      }
      public core.Array<T> values() {
        return (core.Array<T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_values(core.Array<T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long capacity() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_capacity(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
    }
    public static final class Plot extends GreyCat.Object {
      public static final java.lang.String name = "util::Plot";

      private Plot(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Plot() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[171], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[171].map_attributes(new Object[] {}));
      }
    }
    public static final class HistogramStats<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::HistogramStats";

      private HistogramStats(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public HistogramStats(T min, T max, T whisker_low, T whisker_high, T percentile1, T percentile5, T percentile10, T percentile20, T percentile25, T percentile50, T percentile75, T percentile80, T percentile90, T percentile95, T percentile99, java.lang.Double sum, T avg, T std, java.lang.Long size) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[172], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[172].map_attributes(new Object[] {min, max, whisker_low, whisker_high, percentile1, percentile5, percentile10, percentile20, percentile25, percentile50, percentile75, percentile80, percentile90, percentile95, percentile99, sum, avg, std, size}));
      }
      public T min() {
        return (T) getAttribute(type.generated_offsets[0]);
      }
      public void set_min(T v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public T max() {
        return (T) getAttribute(type.generated_offsets[1]);
      }
      public void set_max(T v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public T whisker_low() {
        return (T) getAttribute(type.generated_offsets[2]);
      }
      public void set_whisker_low(T v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public T whisker_high() {
        return (T) getAttribute(type.generated_offsets[3]);
      }
      public void set_whisker_high(T v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public T percentile1() {
        return (T) getAttribute(type.generated_offsets[4]);
      }
      public void set_percentile1(T v) {
        setAttribute(type.generated_offsets[4], v);
      }
      public T percentile5() {
        return (T) getAttribute(type.generated_offsets[5]);
      }
      public void set_percentile5(T v) {
        setAttribute(type.generated_offsets[5], v);
      }
      public T percentile10() {
        return (T) getAttribute(type.generated_offsets[6]);
      }
      public void set_percentile10(T v) {
        setAttribute(type.generated_offsets[6], v);
      }
      public T percentile20() {
        return (T) getAttribute(type.generated_offsets[7]);
      }
      public void set_percentile20(T v) {
        setAttribute(type.generated_offsets[7], v);
      }
      public T percentile25() {
        return (T) getAttribute(type.generated_offsets[8]);
      }
      public void set_percentile25(T v) {
        setAttribute(type.generated_offsets[8], v);
      }
      public T percentile50() {
        return (T) getAttribute(type.generated_offsets[9]);
      }
      public void set_percentile50(T v) {
        setAttribute(type.generated_offsets[9], v);
      }
      public T percentile75() {
        return (T) getAttribute(type.generated_offsets[10]);
      }
      public void set_percentile75(T v) {
        setAttribute(type.generated_offsets[10], v);
      }
      public T percentile80() {
        return (T) getAttribute(type.generated_offsets[11]);
      }
      public void set_percentile80(T v) {
        setAttribute(type.generated_offsets[11], v);
      }
      public T percentile90() {
        return (T) getAttribute(type.generated_offsets[12]);
      }
      public void set_percentile90(T v) {
        setAttribute(type.generated_offsets[12], v);
      }
      public T percentile95() {
        return (T) getAttribute(type.generated_offsets[13]);
      }
      public void set_percentile95(T v) {
        setAttribute(type.generated_offsets[13], v);
      }
      public T percentile99() {
        return (T) getAttribute(type.generated_offsets[14]);
      }
      public void set_percentile99(T v) {
        setAttribute(type.generated_offsets[14], v);
      }
      public java.lang.Double sum() {
        return (java.lang.Double) getAttribute(type.generated_offsets[15]);
      }
      public void set_sum(java.lang.Double v) {
        setAttribute(type.generated_offsets[15], v);
      }
      public T avg() {
        return (T) getAttribute(type.generated_offsets[16]);
      }
      public void set_avg(T v) {
        setAttribute(type.generated_offsets[16], v);
      }
      public T std() {
        return (T) getAttribute(type.generated_offsets[17]);
      }
      public void set_std(T v) {
        setAttribute(type.generated_offsets[17], v);
      }
      public java.lang.Long size() {
        return (java.lang.Long) getAttribute(type.generated_offsets[18]);
      }
      public void set_size(java.lang.Long v) {
        setAttribute(type.generated_offsets[18], v);
      }
    }
    public static final class CustomQuantizer<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::CustomQuantizer";

      private CustomQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public CustomQuantizer(T min, T max, core.Array<T> step_starts, java.lang.Boolean open) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[173], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[173].map_attributes(new Object[] {min, max, step_starts, open}));
      }
      public T min() {
        return (T) getAttribute(type.generated_offsets[0]);
      }
      public void set_min(T v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public T max() {
        return (T) getAttribute(type.generated_offsets[1]);
      }
      public void set_max(T v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Array<T> step_starts() {
        return (core.Array<T>) getAttribute(type.generated_offsets[2]);
      }
      public void set_step_starts(core.Array<T> v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Boolean open() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[3]);
      }
      public void set_open(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
    public static final class QuantizerSlotBound<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::QuantizerSlotBound";

      private QuantizerSlotBound(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public QuantizerSlotBound(T min, T max, T center) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[174], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[174].map_attributes(new Object[] {min, max, center}));
      }
      public T min() {
        return (T) getAttribute(type.generated_offsets[0]);
      }
      public void set_min(T v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public T max() {
        return (T) getAttribute(type.generated_offsets[1]);
      }
      public void set_max(T v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public T center() {
        return (T) getAttribute(type.generated_offsets[2]);
      }
      public void set_center(T v) {
        setAttribute(type.generated_offsets[2], v);
      }
    }
    public static final class Stack<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::Stack";

      private Stack(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Stack(core.Array<T> values) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[175], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[175].map_attributes(new Object[] {values}));
      }
      public core.Array<T> values() {
        return (core.Array<T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_values(core.Array<T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
    }
    public static final class Quantizer<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::Quantizer";

      private Quantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public Quantizer() {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[176], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[176].map_attributes(new Object[] {}));
      }
    }
    public static final class HistogramBin<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::HistogramBin";

      private HistogramBin(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public HistogramBin(util.QuantizerSlotBound<T> bin, java.lang.Long count, java.lang.Double ratio, java.lang.Long cumulative_count, java.lang.Double cumulative_ratio) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[177], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[177].map_attributes(new Object[] {bin, count, ratio, cumulative_count, cumulative_ratio}));
      }
      public util.QuantizerSlotBound<T> bin() {
        return (util.QuantizerSlotBound<T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_bin(util.QuantizerSlotBound<T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public java.lang.Long count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[1]);
      }
      public void set_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Double ratio() {
        return (java.lang.Double) getAttribute(type.generated_offsets[2]);
      }
      public void set_ratio(java.lang.Double v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Long cumulative_count() {
        return (java.lang.Long) getAttribute(type.generated_offsets[3]);
      }
      public void set_cumulative_count(java.lang.Long v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Double cumulative_ratio() {
        return (java.lang.Double) getAttribute(type.generated_offsets[4]);
      }
      public void set_cumulative_ratio(java.lang.Double v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class GaussianProfile<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::GaussianProfile";

      private GaussianProfile(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public GaussianProfile(util.Quantizer<T> quantizer, core.FloatPrecision precision, core.Table<util.GaussianProfileSlot> bins, java.lang.Double value_min, java.lang.Long nb_rejected) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[178], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[178].map_attributes(new Object[] {quantizer, precision, bins, value_min, nb_rejected}));
      }
      public util.Quantizer<T> quantizer() {
        return (util.Quantizer<T>) getAttribute(type.generated_offsets[0]);
      }
      public void set_quantizer(util.Quantizer<T> v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public core.FloatPrecision precision() {
        return (core.FloatPrecision) getAttribute(type.generated_offsets[1]);
      }
      public void set_precision(core.FloatPrecision v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public core.Table<util.GaussianProfileSlot> bins() {
        return (core.Table<util.GaussianProfileSlot>) getAttribute(type.generated_offsets[2]);
      }
      public void set_bins(core.Table<util.GaussianProfileSlot> v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Double value_min() {
        return (java.lang.Double) getAttribute(type.generated_offsets[3]);
      }
      public void set_value_min(java.lang.Double v) {
        setAttribute(type.generated_offsets[3], v);
      }
      public java.lang.Long nb_rejected() {
        return (java.lang.Long) getAttribute(type.generated_offsets[4]);
      }
      public void set_nb_rejected(java.lang.Long v) {
        setAttribute(type.generated_offsets[4], v);
      }
    }
    public static final class LogQuantizer<T> extends GreyCat.Object {
      public static final java.lang.String name = "util::LogQuantizer";

      private LogQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
        super(type, attributes);
      }

      public LogQuantizer(T min, T max, java.lang.Long bins, java.lang.Boolean open) {
        super(GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[179], GreyCat.DEFAULT.libs_by_name.get(gc.std.name).mapped[179].map_attributes(new Object[] {min, max, bins, open}));
      }
      public T min() {
        return (T) getAttribute(type.generated_offsets[0]);
      }
      public void set_min(T v) {
        setAttribute(type.generated_offsets[0], v);
      }
      public T max() {
        return (T) getAttribute(type.generated_offsets[1]);
      }
      public void set_max(T v) {
        setAttribute(type.generated_offsets[1], v);
      }
      public java.lang.Long bins() {
        return (java.lang.Long) getAttribute(type.generated_offsets[2]);
      }
      public void set_bins(java.lang.Long v) {
        setAttribute(type.generated_offsets[2], v);
      }
      public java.lang.Boolean open() {
        return (java.lang.Boolean) getAttribute(type.generated_offsets[3]);
      }
      public void set_open(java.lang.Boolean v) {
        setAttribute(type.generated_offsets[3], v);
      }
    }
  }
  public static final class std extends GreyCat.Library {
    public static final java.lang.String name = "std";

    public java.lang.String name() {
      return name;
    }

    public void configure(java.util.Map<java.lang.String, GreyCat.Loader> loaders, java.util.Map<java.lang.String, GreyCat.Factory> factories) {
      factories.put(core.geo.name, core.geo::new);
      loaders.put(core.geo.name, core.geo::load);
      factories.put(core.VectorIndex.name, core.VectorIndex::new);
      factories.put(core.t3.name, core.t3::new);
      loaders.put(core.t3.name, core.t3::load);
      factories.put(core.t2f.name, core.t2f::new);
      loaders.put(core.t2f.name, core.t2f::load);
      factories.put(core.t4.name, core.t4::new);
      loaders.put(core.t4.name, core.t4::load);
      factories.put(core.GeoBox.name, core.GeoBox::new);
      factories.put(core.t2.name, core.t2::new);
      loaders.put(core.t2.name, core.t2::load);
      factories.put(core.nodeTime.name, core.nodeTime::new);
      loaders.put(core.nodeTime.name, core.nodeTime::load);
      factories.put(core.nodeIndexBucket.name, core.nodeIndexBucket::new);
      factories.put(core.String.name, core.String::new);
      loaders.put(core.String.name, core.String::load);
      factories.put(core.FloatPrecision.name, core.FloatPrecision::new);
      factories.put(core.field.name, core.field::new);
      loaders.put(core.field.name, core.field::load);
      factories.put(core.nodeList.name, core.nodeList::new);
      loaders.put(core.nodeList.name, core.nodeList::load);
      factories.put(core.Tensor.name, core.Tensor::new);
      loaders.put(core.Tensor.name, core.Tensor::load);
      factories.put(core.time.name, core.time::new);
      loaders.put(core.time.name, core.time::load);
      factories.put(core.TensorType.name, core.TensorType::new);
      factories.put(core.DurationUnit.name, core.DurationUnit::new);
      factories.put(core.Map.name, core.Map::new);
      loaders.put(core.Map.name, core.Map::load);
      factories.put(core.VectorVertex.name, core.VectorVertex::new);
      factories.put(core.t4f.name, core.t4f::new);
      loaders.put(core.t4f.name, core.t4f::load);
      factories.put(core.SortOrder.name, core.SortOrder::new);
      factories.put(core.TimeZone.name, core.TimeZone::new);
      factories.put(core.GeoCircle.name, core.GeoCircle::new);
      factories.put(core.type.name, core.type::new);
      loaders.put(core.type.name, core.type::load);
      factories.put(core.SamplingMode.name, core.SamplingMode::new);
      factories.put(core.node.name, core.node::new);
      loaders.put(core.node.name, core.node::load);
      factories.put(core.TableColumnMapping.name, core.TableColumnMapping::new);
      factories.put(core.TensorDistance.name, core.TensorDistance::new);
      factories.put(core.nodeIndex.name, core.nodeIndex::new);
      loaders.put(core.nodeIndex.name, core.nodeIndex::load);
      factories.put(core.Error.name, core.Error::new);
      factories.put(core.GeoPoly.name, core.GeoPoly::new);
      factories.put(core.Table.name, core.Table::new);
      loaders.put(core.Table.name, core.Table::load);
      factories.put(core.str.name, core.str::new);
      loaders.put(core.str.name, core.str::load);
      factories.put(core.duration.name, core.duration::new);
      loaders.put(core.duration.name, core.duration::load);
      factories.put(core.Array.name, core.Array::new);
      loaders.put(core.Array.name, core.Array::load);
      factories.put(core.Tuple.name, core.Tuple::new);
      factories.put(core.MathConstants.name, core.MathConstants::new);
      factories.put(core.nodeTimeCursor.name, core.nodeTimeCursor::new);
      factories.put(core.t3f.name, core.t3f::new);
      loaders.put(core.t3f.name, core.t3f::load);
      factories.put(core.ErrorCode.name, core.ErrorCode::new);
      factories.put(core.ErrorFrame.name, core.ErrorFrame::new);
      factories.put(core.Date.name, core.Date::new);
      factories.put(core.SearchResult.name, core.SearchResult::new);
      factories.put(core.function.name, core.function::new);
      loaders.put(core.function.name, core.function::load);
      factories.put(core.nodeGeo.name, core.nodeGeo::new);
      loaders.put(core.nodeGeo.name, core.nodeGeo::load);
      factories.put(core.Buffer.name, core.Buffer::new);
      loaders.put(core.Buffer.name, core.Buffer::load);
      factories.put(core.NodeInfo.name, core.NodeInfo::new);
      factories.put(core.CalendarUnit.name, core.CalendarUnit::new);
      factories.put(io.CsvColumnStatistics.name, io.CsvColumnStatistics::new);
      factories.put(io.CsvReader.name, io.CsvReader::new);
      factories.put(io.BinReader.name, io.BinReader::new);
      factories.put(io.HttpResponse.name, io.HttpResponse::new);
      factories.put(io.Url.name, io.Url::new);
      factories.put(io.HttpMethod.name, io.HttpMethod::new);
      factories.put(io.Http.name, io.Http::new);
      factories.put(io.HttpRequest.name, io.HttpRequest::new);
      factories.put(io.FileWalker.name, io.FileWalker::new);
      factories.put(io.Writer.name, io.Writer::new);
      factories.put(io.TextWriter.name, io.TextWriter::new);
      factories.put(io.GcbReader.name, io.GcbReader::new);
      factories.put(io.JsonWriter.name, io.JsonWriter::new);
      factories.put(io.CsvAnalysisConfig.name, io.CsvAnalysisConfig::new);
      factories.put(io.XmlReader.name, io.XmlReader::new);
      factories.put(io.SmtpMode.name, io.SmtpMode::new);
      factories.put(io.Csv.name, io.Csv::new);
      factories.put(io.Smtp.name, io.Smtp::new);
      factories.put(io.File.name, io.File::new);
      factories.put(io.Reader.name, io.Reader::new);
      factories.put(io.GcbWriter.name, io.GcbWriter::new);
      factories.put(io.CsvStatistics.name, io.CsvStatistics::new);
      factories.put(io.Email.name, io.Email::new);
      factories.put(io.CsvFormat.name, io.CsvFormat::new);
      factories.put(io.Json.name, io.Json::new);
      factories.put(io.JsonReader.name, io.JsonReader::new);
      factories.put(io.CsvWriter.name, io.CsvWriter::new);
      factories.put(io.CsvSharding.name, io.CsvSharding::new);
      factories.put(io.TextReader.name, io.TextReader::new);
      factories.put(io.SmtpAuth.name, io.SmtpAuth::new);
      factories.put(runtime.McpClientRoots.name, runtime.McpClientRoots::new);
      factories.put(runtime.DateTuple.name, runtime.DateTuple::new);
      factories.put(runtime.LogLevel.name, runtime.LogLevel::new);
      factories.put(runtime.Month.name, runtime.Month::new);
      factories.put(runtime.PeriodicTask.name, runtime.PeriodicTask::new);
      factories.put(runtime.YearlyPeriodicity.name, runtime.YearlyPeriodicity::new);
      factories.put(runtime.License.name, runtime.License::new);
      factories.put(runtime.McpToolsCallParams.name, runtime.McpToolsCallParams::new);
      factories.put(runtime.InfoObject.name, runtime.InfoObject::new);
      factories.put(runtime.OpenApiV3.name, runtime.OpenApiV3::new);
      factories.put(runtime.McpServerResourcesCapabilities.name, runtime.McpServerResourcesCapabilities::new);
      factories.put(runtime.Frame.name, runtime.Frame::new);
      factories.put(runtime.DayOfWeek.name, runtime.DayOfWeek::new);
      factories.put(runtime.OpenIDConnect.name, runtime.OpenIDConnect::new);
      factories.put(runtime.OperationObject.name, runtime.OperationObject::new);
      factories.put(runtime.SecurityEntity.name, runtime.SecurityEntity::new);
      factories.put(runtime.SecurityFields.name, runtime.SecurityFields::new);
      factories.put(runtime.McpContentBlock.name, runtime.McpContentBlock::new);
      factories.put(runtime.Periodicity.name, runtime.Periodicity::new);
      factories.put(runtime.SchemaFormat.name, runtime.SchemaFormat::new);
      factories.put(runtime.DailyPeriodicity.name, runtime.DailyPeriodicity::new);
      factories.put(runtime.RuntimeInfo.name, runtime.RuntimeInfo::new);
      factories.put(runtime.OpenApiVersion.name, runtime.OpenApiVersion::new);
      factories.put(runtime.McpServerToolsCapabilities.name, runtime.McpServerToolsCapabilities::new);
      factories.put(runtime.McpToolsCallResult.name, runtime.McpToolsCallResult::new);
      factories.put(runtime.McpContentType.name, runtime.McpContentType::new);
      factories.put(runtime.MergeStrategy.name, runtime.MergeStrategy::new);
      factories.put(runtime.McpAnnotations.name, runtime.McpAnnotations::new);
      factories.put(runtime.MediaTypeObject.name, runtime.MediaTypeObject::new);
      factories.put(runtime.McpClientCapabilities.name, runtime.McpClientCapabilities::new);
      factories.put(runtime.HeaderObject.name, runtime.HeaderObject::new);
      factories.put(runtime.Task.name, runtime.Task::new);
      factories.put(runtime.Log.name, runtime.Log::new);
      factories.put(runtime.McpServerCapabilities.name, runtime.McpServerCapabilities::new);
      factories.put(runtime.MonthlyPeriodicity.name, runtime.MonthlyPeriodicity::new);
      factories.put(runtime.WeeklyPeriodicity.name, runtime.WeeklyPeriodicity::new);
      factories.put(runtime.Role.name, runtime.Role::new);
      factories.put(runtime.Job.name, runtime.Job::new);
      factories.put(runtime.McpImageContent.name, runtime.McpImageContent::new);
      factories.put(runtime.SchemaObject.name, runtime.SchemaObject::new);
      factories.put(runtime.UserCredential.name, runtime.UserCredential::new);
      factories.put(runtime.SecurityPolicy.name, runtime.SecurityPolicy::new);
      factories.put(runtime.UserGroupPolicy.name, runtime.UserGroupPolicy::new);
      factories.put(runtime.ComponentsObject.name, runtime.ComponentsObject::new);
      factories.put(runtime.McpTool.name, runtime.McpTool::new);
      factories.put(runtime.McpRole.name, runtime.McpRole::new);
      factories.put(runtime.LicenseType.name, runtime.LicenseType::new);
      factories.put(runtime.FixedPeriodicity.name, runtime.FixedPeriodicity::new);
      factories.put(runtime.SchemaType.name, runtime.SchemaType::new);
      factories.put(runtime.Debug.name, runtime.Debug::new);
      factories.put(runtime.McpInitializeParams.name, runtime.McpInitializeParams::new);
      factories.put(runtime.McpPriority.name, runtime.McpPriority::new);
      factories.put(runtime.McpInitializeResult.name, runtime.McpInitializeResult::new);
      factories.put(runtime.McpAudioContent.name, runtime.McpAudioContent::new);
      factories.put(runtime.Scheduler.name, runtime.Scheduler::new);
      factories.put(runtime.McpImplementation.name, runtime.McpImplementation::new);
      factories.put(runtime.System.name, runtime.System::new);
      factories.put(runtime.McpResourceContent.name, runtime.McpResourceContent::new);
      factories.put(runtime.UserGroupPolicyType.name, runtime.UserGroupPolicyType::new);
      factories.put(runtime.OpenApi.name, runtime.OpenApi::new);
      factories.put(runtime.Runtime.name, runtime.Runtime::new);
      factories.put(runtime.RequestBodyObject.name, runtime.RequestBodyObject::new);
      factories.put(runtime.TaskStatus.name, runtime.TaskStatus::new);
      factories.put(runtime.User.name, runtime.User::new);
      factories.put(runtime.ChildProcess.name, runtime.ChildProcess::new);
      factories.put(runtime.McpBaseMetadata.name, runtime.McpBaseMetadata::new);
      factories.put(runtime.Permission.name, runtime.Permission::new);
      factories.put(runtime.McpServerPromptsCapabilities.name, runtime.McpServerPromptsCapabilities::new);
      factories.put(runtime.PathItemObject.name, runtime.PathItemObject::new);
      factories.put(runtime.McpTextContent.name, runtime.McpTextContent::new);
      factories.put(runtime.PeriodicOptions.name, runtime.PeriodicOptions::new);
      factories.put(runtime.UserGroup.name, runtime.UserGroup::new);
      factories.put(runtime.ChildProcessResult.name, runtime.ChildProcessResult::new);
      factories.put(runtime.ResponseCode.name, runtime.ResponseCode::new);
      factories.put(runtime.McpToolsListResult.name, runtime.McpToolsListResult::new);
      factories.put(runtime.ResponseObject.name, runtime.ResponseObject::new);
      factories.put(runtime.McpRequestParams.name, runtime.McpRequestParams::new);
      factories.put(runtime.Variable.name, runtime.Variable::new);
      factories.put(runtime.LogDataUsage.name, runtime.LogDataUsage::new);
      factories.put(runtime.McpToolsListParams.name, runtime.McpToolsListParams::new);
      factories.put(runtime.McpResult.name, runtime.McpResult::new);
      factories.put(util.Random.name, util.Random::new);
      factories.put(util.Histogram.name, util.Histogram::new);
      factories.put(util.MultiQuantizer.name, util.MultiQuantizer::new);
      factories.put(util.Gaussian.name, util.Gaussian::new);
      factories.put(util.Assert.name, util.Assert::new);
      factories.put(util.ProgressTracker.name, util.ProgressTracker::new);
      factories.put(util.GaussianProfileSlot.name, util.GaussianProfileSlot::new);
      factories.put(util.TimeWindow.name, util.TimeWindow::new);
      factories.put(util.LinearQuantizer.name, util.LinearQuantizer::new);
      factories.put(util.Crypto.name, util.Crypto::new);
      factories.put(util.SlidingWindow.name, util.SlidingWindow::new);
      factories.put(util.Queue.name, util.Queue::new);
      factories.put(util.Plot.name, util.Plot::new);
      factories.put(util.HistogramStats.name, util.HistogramStats::new);
      factories.put(util.CustomQuantizer.name, util.CustomQuantizer::new);
      factories.put(util.QuantizerSlotBound.name, util.QuantizerSlotBound::new);
      factories.put(util.Stack.name, util.Stack::new);
      factories.put(util.Quantizer.name, util.Quantizer::new);
      factories.put(util.HistogramBin.name, util.HistogramBin::new);
      factories.put(util.GaussianProfile.name, util.GaussianProfile::new);
      factories.put(util.LogQuantizer.name, util.LogQuantizer::new);
    }
    public void init(GreyCat greycat) {
      mapped = new GreyCat.Type[180];
      mapped[0] = greycat.types_by_name.get(core.geo.name);
      mapped[1] = greycat.types_by_name.get(core.VectorIndex.name);
      if(this.mapped[1] != null){
        this.mapped[1].resolveGeneratedOffsets("values","count","max_level","entry_node_ref","rng","distance");
      }
      mapped[2] = greycat.types_by_name.get(core.t3.name);
      mapped[3] = greycat.types_by_name.get(core.t2f.name);
      mapped[4] = greycat.types_by_name.get(core.t4.name);
      mapped[5] = greycat.types_by_name.get(core.GeoBox.name);
      if(this.mapped[5] != null){
        this.mapped[5].resolveGeneratedOffsets("sw","ne");
      }
      mapped[6] = greycat.types_by_name.get(core.t2.name);
      mapped[7] = greycat.types_by_name.get(core.nodeTime.name);
      mapped[8] = greycat.types_by_name.get(core.nodeIndexBucket.name);
      if(this.mapped[8] != null){
        this.mapped[8].resolveGeneratedOffsets("key","value","next");
      }
      mapped[9] = greycat.types_by_name.get(core.String.name);
      mapped[10] = greycat.types_by_name.get(core.FloatPrecision.name);
      if(this.mapped[10] != null){
        this.mapped[10].resolveGeneratedOffsetWithValues("p1", java.lang.Double.longBitsToDouble(4607182418800017408L),"p10", java.lang.Double.longBitsToDouble(4591870180066957722L),"p100", java.lang.Double.longBitsToDouble(4576918229304087675L),"p1000", java.lang.Double.longBitsToDouble(4562254508917369340L),"p10000", java.lang.Double.longBitsToDouble(4547007122018943789L),"p100000", java.lang.Double.longBitsToDouble(4532020583610935537L),"p1000000", java.lang.Double.longBitsToDouble(4517329193108106637L),"p10000000", java.lang.Double.longBitsToDouble(4502148214488346440L),"p100000000", java.lang.Double.longBitsToDouble(4487126258331716666L),"p1000000000", java.lang.Double.longBitsToDouble(4472406533629990549L),"p10000000000", java.lang.Double.longBitsToDouble(4457293557087583675L));
      }
      mapped[11] = greycat.types_by_name.get(core.field.name);
      mapped[12] = greycat.types_by_name.get(core.nodeList.name);
      mapped[13] = greycat.types_by_name.get(core.Tensor.name);
      mapped[14] = greycat.types_by_name.get(core.time.name);
      mapped[15] = greycat.types_by_name.get(core.TensorType.name);
      if(this.mapped[15] != null){
        this.mapped[15].resolveGeneratedOffsetWithValues("i32", 4L,"i64", 8L,"f32", 4L,"f64", 8L,"c64", 8L,"c128", 16L);
      }
      mapped[16] = greycat.types_by_name.get(core.DurationUnit.name);
      if(this.mapped[16] != null){
        this.mapped[16].resolveGeneratedOffsetWithValues("microseconds", 1L,"milliseconds", 1000L,"seconds", 1000000L,"minutes", 60000000L,"hours", 3600000000L,"days", 86400000000L);
      }
      mapped[17] = greycat.types_by_name.get(core.Map.name);
      mapped[18] = greycat.types_by_name.get(core.VectorVertex.name);
      if(this.mapped[18] != null){
        this.mapped[18].resolveGeneratedOffsets("vector","level_sizes","neighbour_nodes");
      }
      mapped[19] = greycat.types_by_name.get(core.t4f.name);
      mapped[20] = greycat.types_by_name.get(core.SortOrder.name);
      if(this.mapped[20] != null){
        this.mapped[20].resolveGeneratedOffsetWithValues("asc", null,"desc", null);
      }
      mapped[21] = greycat.types_by_name.get(core.TimeZone.name);
      if(this.mapped[21] != null){
        this.mapped[21].resolveGeneratedOffsetWithValues("UTC", null,"Africa/Abidjan", null,"Africa/Accra", null,"Africa/Addis_Ababa", null,"Africa/Algiers", null,"Africa/Asmara", null,"Africa/Asmera", null,"Africa/Bamako", null,"Africa/Bangui", null,"Africa/Banjul", null,"Africa/Bissau", null,"Africa/Blantyre", null,"Africa/Brazzaville", null,"Africa/Bujumbura", null,"Africa/Cairo", null,"Africa/Casablanca", null,"Africa/Ceuta", null,"Africa/Conakry", null,"Africa/Dakar", null,"Africa/Dar_es_Salaam", null,"Africa/Djibouti", null,"Africa/Douala", null,"Africa/El_Aaiun", null,"Africa/Freetown", null,"Africa/Gaborone", null,"Africa/Harare", null,"Africa/Johannesburg", null,"Africa/Juba", null,"Africa/Kampala", null,"Africa/Khartoum", null,"Africa/Kigali", null,"Africa/Kinshasa", null,"Africa/Lagos", null,"Africa/Libreville", null,"Africa/Lome", null,"Africa/Luanda", null,"Africa/Lubumbashi", null,"Africa/Lusaka", null,"Africa/Malabo", null,"Africa/Maputo", null,"Africa/Maseru", null,"Africa/Mbabane", null,"Africa/Mogadishu", null,"Africa/Monrovia", null,"Africa/Nairobi", null,"Africa/Ndjamena", null,"Africa/Niamey", null,"Africa/Nouakchott", null,"Africa/Ouagadougou", null,"Africa/Porto-Novo", null,"Africa/Sao_Tome", null,"Africa/Timbuktu", null,"Africa/Tripoli", null,"Africa/Tunis", null,"Africa/Windhoek", null,"America/Adak", null,"America/Anchorage", null,"America/Anguilla", null,"America/Antigua", null,"America/Araguaina", null,"America/Argentina/Buenos_Aires", null,"America/Argentina/Catamarca", null,"America/Argentina/ComodRivadavia", null,"America/Argentina/Cordoba", null,"America/Argentina/Jujuy", null,"America/Argentina/La_Rioja", null,"America/Argentina/Mendoza", null,"America/Argentina/Rio_Gallegos", null,"America/Argentina/Salta", null,"America/Argentina/San_Juan", null,"America/Argentina/San_Luis", null,"America/Argentina/Tucuman", null,"America/Argentina/Ushuaia", null,"America/Aruba", null,"America/Asuncion", null,"America/Atikokan", null,"America/Atka", null,"America/Bahia", null,"America/Bahia_Banderas", null,"America/Barbados", null,"America/Belem", null,"America/Belize", null,"America/Blanc-Sablon", null,"America/Boa_Vista", null,"America/Bogota", null,"America/Boise", null,"America/Buenos_Aires", null,"America/Cambridge_Bay", null,"America/Campo_Grande", null,"America/Cancun", null,"America/Caracas", null,"America/Catamarca", null,"America/Cayenne", null,"America/Cayman", null,"America/Chicago", null,"America/Chihuahua", null,"America/Ciudad_Juarez", null,"America/Coral_Harbour", null,"America/Cordoba", null,"America/Costa_Rica", null,"America/Coyhaique", null,"America/Creston", null,"America/Cuiaba", null,"America/Curacao", null,"America/Danmarkshavn", null,"America/Dawson", null,"America/Dawson_Creek", null,"America/Denver", null,"America/Detroit", null,"America/Dominica", null,"America/Edmonton", null,"America/Eirunepe", null,"America/El_Salvador", null,"America/Ensenada", null,"America/Fort_Nelson", null,"America/Fort_Wayne", null,"America/Fortaleza", null,"America/Glace_Bay", null,"America/Godthab", null,"America/Goose_Bay", null,"America/Grand_Turk", null,"America/Grenada", null,"America/Guadeloupe", null,"America/Guatemala", null,"America/Guayaquil", null,"America/Guyana", null,"America/Halifax", null,"America/Havana", null,"America/Hermosillo", null,"America/Indiana/Indianapolis", null,"America/Indiana/Knox", null,"America/Indiana/Marengo", null,"America/Indiana/Petersburg", null,"America/Indiana/Tell_City", null,"America/Indiana/Vevay", null,"America/Indiana/Vincennes", null,"America/Indiana/Winamac", null,"America/Indianapolis", null,"America/Inuvik", null,"America/Iqaluit", null,"America/Jamaica", null,"America/Jujuy", null,"America/Juneau", null,"America/Kentucky/Louisville", null,"America/Kentucky/Monticello", null,"America/Knox_IN", null,"America/Kralendijk", null,"America/La_Paz", null,"America/Lima", null,"America/Los_Angeles", null,"America/Louisville", null,"America/Lower_Princes", null,"America/Maceio", null,"America/Managua", null,"America/Manaus", null,"America/Marigot", null,"America/Martinique", null,"America/Matamoros", null,"America/Mazatlan", null,"America/Mendoza", null,"America/Menominee", null,"America/Merida", null,"America/Metlakatla", null,"America/Mexico_City", null,"America/Miquelon", null,"America/Moncton", null,"America/Monterrey", null,"America/Montevideo", null,"America/Montreal", null,"America/Montserrat", null,"America/Nassau", null,"America/New_York", null,"America/Nipigon", null,"America/Nome", null,"America/Noronha", null,"America/North_Dakota/Beulah", null,"America/North_Dakota/Center", null,"America/North_Dakota/New_Salem", null,"America/Nuuk", null,"America/Ojinaga", null,"America/Panama", null,"America/Pangnirtung", null,"America/Paramaribo", null,"America/Phoenix", null,"America/Port-au-Prince", null,"America/Port_of_Spain", null,"America/Porto_Acre", null,"America/Porto_Velho", null,"America/Puerto_Rico", null,"America/Punta_Arenas", null,"America/Rainy_River", null,"America/Rankin_Inlet", null,"America/Recife", null,"America/Regina", null,"America/Resolute", null,"America/Rio_Branco", null,"America/Rosario", null,"America/Santa_Isabel", null,"America/Santarem", null,"America/Santiago", null,"America/Santo_Domingo", null,"America/Sao_Paulo", null,"America/Scoresbysund", null,"America/Shiprock", null,"America/Sitka", null,"America/St_Barthelemy", null,"America/St_Johns", null,"America/St_Kitts", null,"America/St_Lucia", null,"America/St_Thomas", null,"America/St_Vincent", null,"America/Swift_Current", null,"America/Tegucigalpa", null,"America/Thule", null,"America/Thunder_Bay", null,"America/Tijuana", null,"America/Toronto", null,"America/Tortola", null,"America/Vancouver", null,"America/Virgin", null,"America/Whitehorse", null,"America/Winnipeg", null,"America/Yakutat", null,"America/Yellowknife", null,"Antarctica/Casey", null,"Antarctica/Davis", null,"Antarctica/DumontDUrville", null,"Antarctica/Macquarie", null,"Antarctica/Mawson", null,"Antarctica/McMurdo", null,"Antarctica/Palmer", null,"Antarctica/Rothera", null,"Antarctica/South_Pole", null,"Antarctica/Syowa", null,"Antarctica/Troll", null,"Antarctica/Vostok", null,"Arctic/Longyearbyen", null,"Asia/Aden", null,"Asia/Almaty", null,"Asia/Amman", null,"Asia/Anadyr", null,"Asia/Aqtau", null,"Asia/Aqtobe", null,"Asia/Ashgabat", null,"Asia/Ashkhabad", null,"Asia/Atyrau", null,"Asia/Baghdad", null,"Asia/Bahrain", null,"Asia/Baku", null,"Asia/Bangkok", null,"Asia/Barnaul", null,"Asia/Beirut", null,"Asia/Bishkek", null,"Asia/Brunei", null,"Asia/Calcutta", null,"Asia/Chita", null,"Asia/Choibalsan", null,"Asia/Chongqing", null,"Asia/Chungking", null,"Asia/Colombo", null,"Asia/Dacca", null,"Asia/Damascus", null,"Asia/Dhaka", null,"Asia/Dili", null,"Asia/Dubai", null,"Asia/Dushanbe", null,"Asia/Famagusta", null,"Asia/Gaza", null,"Asia/Harbin", null,"Asia/Hebron", null,"Asia/Ho_Chi_Minh", null,"Asia/Hong_Kong", null,"Asia/Hovd", null,"Asia/Irkutsk", null,"Asia/Istanbul", null,"Asia/Jakarta", null,"Asia/Jayapura", null,"Asia/Jerusalem", null,"Asia/Kabul", null,"Asia/Kamchatka", null,"Asia/Karachi", null,"Asia/Kashgar", null,"Asia/Kathmandu", null,"Asia/Katmandu", null,"Asia/Khandyga", null,"Asia/Kolkata", null,"Asia/Krasnoyarsk", null,"Asia/Kuala_Lumpur", null,"Asia/Kuching", null,"Asia/Kuwait", null,"Asia/Macao", null,"Asia/Macau", null,"Asia/Magadan", null,"Asia/Makassar", null,"Asia/Manila", null,"Asia/Muscat", null,"Asia/Nicosia", null,"Asia/Novokuznetsk", null,"Asia/Novosibirsk", null,"Asia/Omsk", null,"Asia/Oral", null,"Asia/Phnom_Penh", null,"Asia/Pontianak", null,"Asia/Pyongyang", null,"Asia/Qatar", null,"Asia/Qostanay", null,"Asia/Qyzylorda", null,"Asia/Rangoon", null,"Asia/Riyadh", null,"Asia/Saigon", null,"Asia/Sakhalin", null,"Asia/Samarkand", null,"Asia/Seoul", null,"Asia/Shanghai", null,"Asia/Singapore", null,"Asia/Srednekolymsk", null,"Asia/Taipei", null,"Asia/Tashkent", null,"Asia/Tbilisi", null,"Asia/Tehran", null,"Asia/Tel_Aviv", null,"Asia/Thimbu", null,"Asia/Thimphu", null,"Asia/Tokyo", null,"Asia/Tomsk", null,"Asia/Ujung_Pandang", null,"Asia/Ulaanbaatar", null,"Asia/Ulan_Bator", null,"Asia/Urumqi", null,"Asia/Ust-Nera", null,"Asia/Vientiane", null,"Asia/Vladivostok", null,"Asia/Yakutsk", null,"Asia/Yangon", null,"Asia/Yekaterinburg", null,"Asia/Yerevan", null,"Atlantic/Azores", null,"Atlantic/Bermuda", null,"Atlantic/Canary", null,"Atlantic/Cape_Verde", null,"Atlantic/Faeroe", null,"Atlantic/Faroe", null,"Atlantic/Jan_Mayen", null,"Atlantic/Madeira", null,"Atlantic/Reykjavik", null,"Atlantic/South_Georgia", null,"Atlantic/St_Helena", null,"Atlantic/Stanley", null,"Australia/ACT", null,"Australia/Adelaide", null,"Australia/Brisbane", null,"Australia/Broken_Hill", null,"Australia/Canberra", null,"Australia/Currie", null,"Australia/Darwin", null,"Australia/Eucla", null,"Australia/Hobart", null,"Australia/LHI", null,"Australia/Lindeman", null,"Australia/Lord_Howe", null,"Australia/Melbourne", null,"Australia/NSW", null,"Australia/North", null,"Australia/Perth", null,"Australia/Queensland", null,"Australia/South", null,"Australia/Sydney", null,"Australia/Tasmania", null,"Australia/Victoria", null,"Australia/West", null,"Australia/Yancowinna", null,"Brazil/Acre", null,"Brazil/DeNoronha", null,"Brazil/East", null,"Brazil/West", null,"CET", null,"CST6CDT", null,"Canada/Atlantic", null,"Canada/Central", null,"Canada/Eastern", null,"Canada/Mountain", null,"Canada/Newfoundland", null,"Canada/Pacific", null,"Canada/Saskatchewan", null,"Canada/Yukon", null,"Chile/Continental", null,"Chile/EasterIsland", null,"Cuba", null,"EET", null,"EST", null,"EST5EDT", null,"Egypt", null,"Eire", null,"Etc/GMT", null,"Etc/GMT+0", null,"Etc/GMT+1", null,"Etc/GMT+10", null,"Etc/GMT+11", null,"Etc/GMT+12", null,"Etc/GMT+2", null,"Etc/GMT+3", null,"Etc/GMT+4", null,"Etc/GMT+5", null,"Etc/GMT+6", null,"Etc/GMT+7", null,"Etc/GMT+8", null,"Etc/GMT+9", null,"Etc/GMT-0", null,"Etc/GMT-1", null,"Etc/GMT-10", null,"Etc/GMT-11", null,"Etc/GMT-12", null,"Etc/GMT-13", null,"Etc/GMT-14", null,"Etc/GMT-2", null,"Etc/GMT-3", null,"Etc/GMT-4", null,"Etc/GMT-5", null,"Etc/GMT-6", null,"Etc/GMT-7", null,"Etc/GMT-8", null,"Etc/GMT-9", null,"Etc/GMT0", null,"Etc/Greenwich", null,"Etc/UCT", null,"Etc/UTC", null,"Etc/Universal", null,"Etc/Zulu", null,"Europe/Amsterdam", null,"Europe/Andorra", null,"Europe/Astrakhan", null,"Europe/Athens", null,"Europe/Belfast", null,"Europe/Belgrade", null,"Europe/Berlin", null,"Europe/Bratislava", null,"Europe/Brussels", null,"Europe/Bucharest", null,"Europe/Budapest", null,"Europe/Busingen", null,"Europe/Chisinau", null,"Europe/Copenhagen", null,"Europe/Dublin", null,"Europe/Gibraltar", null,"Europe/Guernsey", null,"Europe/Helsinki", null,"Europe/Isle_of_Man", null,"Europe/Istanbul", null,"Europe/Jersey", null,"Europe/Kaliningrad", null,"Europe/Kiev", null,"Europe/Kirov", null,"Europe/Kyiv", null,"Europe/Lisbon", null,"Europe/Ljubljana", null,"Europe/London", null,"Europe/Luxembourg", null,"Europe/Madrid", null,"Europe/Malta", null,"Europe/Mariehamn", null,"Europe/Minsk", null,"Europe/Monaco", null,"Europe/Moscow", null,"Europe/Nicosia", null,"Europe/Oslo", null,"Europe/Paris", null,"Europe/Podgorica", null,"Europe/Prague", null,"Europe/Riga", null,"Europe/Rome", null,"Europe/Samara", null,"Europe/San_Marino", null,"Europe/Sarajevo", null,"Europe/Saratov", null,"Europe/Simferopol", null,"Europe/Skopje", null,"Europe/Sofia", null,"Europe/Stockholm", null,"Europe/Tallinn", null,"Europe/Tirane", null,"Europe/Tiraspol", null,"Europe/Ulyanovsk", null,"Europe/Uzhgorod", null,"Europe/Vaduz", null,"Europe/Vatican", null,"Europe/Vienna", null,"Europe/Vilnius", null,"Europe/Volgograd", null,"Europe/Warsaw", null,"Europe/Zagreb", null,"Europe/Zaporozhye", null,"Europe/Zurich", null,"Factory", null,"GB", null,"GB-Eire", null,"GMT", null,"GMT+0", null,"GMT-0", null,"GMT0", null,"Greenwich", null,"HST", null,"Hongkong", null,"Iceland", null,"Indian/Antananarivo", null,"Indian/Chagos", null,"Indian/Christmas", null,"Indian/Cocos", null,"Indian/Comoro", null,"Indian/Kerguelen", null,"Indian/Mahe", null,"Indian/Maldives", null,"Indian/Mauritius", null,"Indian/Mayotte", null,"Indian/Reunion", null,"Iran", null,"Israel", null,"Jamaica", null,"Japan", null,"Kwajalein", null,"Libya", null,"MET", null,"MST", null,"MST7MDT", null,"Mexico/BajaNorte", null,"Mexico/BajaSur", null,"Mexico/General", null,"NZ", null,"NZ-CHAT", null,"Navajo", null,"PRC", null,"PST8PDT", null,"Pacific/Apia", null,"Pacific/Auckland", null,"Pacific/Bougainville", null,"Pacific/Chatham", null,"Pacific/Chuuk", null,"Pacific/Easter", null,"Pacific/Efate", null,"Pacific/Enderbury", null,"Pacific/Fakaofo", null,"Pacific/Fiji", null,"Pacific/Funafuti", null,"Pacific/Galapagos", null,"Pacific/Gambier", null,"Pacific/Guadalcanal", null,"Pacific/Guam", null,"Pacific/Honolulu", null,"Pacific/Johnston", null,"Pacific/Kanton", null,"Pacific/Kiritimati", null,"Pacific/Kosrae", null,"Pacific/Kwajalein", null,"Pacific/Majuro", null,"Pacific/Marquesas", null,"Pacific/Midway", null,"Pacific/Nauru", null,"Pacific/Niue", null,"Pacific/Norfolk", null,"Pacific/Noumea", null,"Pacific/Pago_Pago", null,"Pacific/Palau", null,"Pacific/Pitcairn", null,"Pacific/Pohnpei", null,"Pacific/Ponape", null,"Pacific/Port_Moresby", null,"Pacific/Rarotonga", null,"Pacific/Saipan", null,"Pacific/Samoa", null,"Pacific/Tahiti", null,"Pacific/Tarawa", null,"Pacific/Tongatapu", null,"Pacific/Truk", null,"Pacific/Wake", null,"Pacific/Wallis", null,"Pacific/Yap", null,"Poland", null,"Portugal", null,"ROC", null,"ROK", null,"Singapore", null,"Turkey", null,"UCT", null,"US/Alaska", null,"US/Aleutian", null,"US/Arizona", null,"US/Central", null,"US/East-Indiana", null,"US/Eastern", null,"US/Hawaii", null,"US/Indiana-Starke", null,"US/Michigan", null,"US/Mountain", null,"US/Pacific", null,"US/Samoa", null,"Universal", null,"W-SU", null,"WET", null,"Zulu", null);
      }
      mapped[22] = greycat.types_by_name.get(core.GeoCircle.name);
      if(this.mapped[22] != null){
        this.mapped[22].resolveGeneratedOffsets("center","radius");
      }
      mapped[23] = greycat.types_by_name.get(core.type.name);
      mapped[24] = greycat.types_by_name.get(core.SamplingMode.name);
      if(this.mapped[24] != null){
        this.mapped[24].resolveGeneratedOffsetWithValues("fixed", 0L,"fixed_reg", 1L,"adaptative", 2L,"dense", 3L);
      }
      mapped[25] = greycat.types_by_name.get(core.node.name);
      mapped[26] = greycat.types_by_name.get(core.TableColumnMapping.name);
      if(this.mapped[26] != null){
        this.mapped[26].resolveGeneratedOffsets("column","extractors");
      }
      mapped[27] = greycat.types_by_name.get(core.TensorDistance.name);
      if(this.mapped[27] != null){
        this.mapped[27].resolveGeneratedOffsetWithValues("euclidean", null,"l2sq", null,"cosine", null);
      }
      mapped[28] = greycat.types_by_name.get(core.nodeIndex.name);
      mapped[29] = greycat.types_by_name.get(core.Error.name);
      if(this.mapped[29] != null){
        this.mapped[29].resolveGeneratedOffsets("message","stack");
      }
      mapped[30] = greycat.types_by_name.get(core.GeoPoly.name);
      if(this.mapped[30] != null){
        this.mapped[30].resolveGeneratedOffsets("points");
      }
      mapped[31] = greycat.types_by_name.get(core.Table.name);
      mapped[32] = greycat.types_by_name.get(core.str.name);
      mapped[33] = greycat.types_by_name.get(core.duration.name);
      mapped[34] = greycat.types_by_name.get(core.Array.name);
      mapped[35] = greycat.types_by_name.get(core.Tuple.name);
      if(this.mapped[35] != null){
        this.mapped[35].resolveGeneratedOffsets("x","y");
      }
      mapped[36] = greycat.types_by_name.get(core.MathConstants.name);
      mapped[37] = greycat.types_by_name.get(core.nodeTimeCursor.name);
      if(this.mapped[37] != null){
        this.mapped[37].resolveGeneratedOffsets("n","req_time");
      }
      mapped[38] = greycat.types_by_name.get(core.t3f.name);
      mapped[39] = greycat.types_by_name.get(core.ErrorCode.name);
      if(this.mapped[39] != null){
        this.mapped[39].resolveGeneratedOffsetWithValues("none", 0L,"interrupted", 1L,"await", 2L,"timeout", 6L,"forbidden", 7L,"runtime_error", 8L);
      }
      mapped[40] = greycat.types_by_name.get(core.ErrorFrame.name);
      if(this.mapped[40] != null){
        this.mapped[40].resolveGeneratedOffsets("module","function","line","column");
      }
      mapped[41] = greycat.types_by_name.get(core.Date.name);
      if(this.mapped[41] != null){
        this.mapped[41].resolveGeneratedOffsets("year","month","day","hour","minute","second","microsecond");
      }
      mapped[42] = greycat.types_by_name.get(core.SearchResult.name);
      if(this.mapped[42] != null){
        this.mapped[42].resolveGeneratedOffsets("key","value","distance");
      }
      mapped[43] = greycat.types_by_name.get(core.function.name);
      mapped[44] = greycat.types_by_name.get(core.nodeGeo.name);
      mapped[45] = greycat.types_by_name.get(core.Buffer.name);
      mapped[46] = greycat.types_by_name.get(core.NodeInfo.name);
      if(this.mapped[46] != null){
        this.mapped[46].resolveGeneratedOffsets("size","from","to");
      }
      mapped[47] = greycat.types_by_name.get(core.CalendarUnit.name);
      if(this.mapped[47] != null){
        this.mapped[47].resolveGeneratedOffsetWithValues("year", 0L,"month", 1L,"day", 2L,"hour", 3L,"minute", 4L,"second", 5L,"microsecond", 6L);
      }
      mapped[48] = greycat.types_by_name.get(io.CsvColumnStatistics.name);
      if(this.mapped[48] != null){
        this.mapped[48].resolveGeneratedOffsets("name","example","null_count","bool_count","int_count","float_count","string_count","date_count","date_format_count","enumerable_count","profile");
      }
      mapped[49] = greycat.types_by_name.get(io.CsvReader.name);
      if(this.mapped[49] != null){
        this.mapped[49].resolveGeneratedOffsets("path","pos","format","sharding");
      }
      mapped[50] = greycat.types_by_name.get(io.BinReader.name);
      if(this.mapped[50] != null){
        this.mapped[50].resolveGeneratedOffsets("path","pos");
      }
      mapped[51] = greycat.types_by_name.get(io.HttpResponse.name);
      if(this.mapped[51] != null){
        this.mapped[51].resolveGeneratedOffsets("status_code","headers","content","error_msg");
      }
      mapped[52] = greycat.types_by_name.get(io.Url.name);
      if(this.mapped[52] != null){
        this.mapped[52].resolveGeneratedOffsets("protocol","host","port","path","params","hash");
      }
      mapped[53] = greycat.types_by_name.get(io.HttpMethod.name);
      if(this.mapped[53] != null){
        this.mapped[53].resolveGeneratedOffsetWithValues("GET", null,"HEAD", null,"POST", null,"PUT", null,"DELETE", null,"CONNECT", null,"OPTIONS", null,"TRACE", null,"PATCH", null);
      }
      mapped[54] = greycat.types_by_name.get(io.Http.name);
      mapped[55] = greycat.types_by_name.get(io.HttpRequest.name);
      if(this.mapped[55] != null){
        this.mapped[55].resolveGeneratedOffsets("method","url","headers","body");
      }
      mapped[56] = greycat.types_by_name.get(io.FileWalker.name);
      if(this.mapped[56] != null){
        this.mapped[56].resolveGeneratedOffsets("path");
      }
      mapped[57] = greycat.types_by_name.get(io.Writer.name);
      if(this.mapped[57] != null){
        this.mapped[57].resolveGeneratedOffsets("path","append");
      }
      mapped[58] = greycat.types_by_name.get(io.TextWriter.name);
      if(this.mapped[58] != null){
        this.mapped[58].resolveGeneratedOffsets("path","append");
      }
      mapped[59] = greycat.types_by_name.get(io.GcbReader.name);
      if(this.mapped[59] != null){
        this.mapped[59].resolveGeneratedOffsets("path","pos");
      }
      mapped[60] = greycat.types_by_name.get(io.JsonWriter.name);
      if(this.mapped[60] != null){
        this.mapped[60].resolveGeneratedOffsets("path","append");
      }
      mapped[61] = greycat.types_by_name.get(io.CsvAnalysisConfig.name);
      if(this.mapped[61] != null){
        this.mapped[61].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","row_limit","enumerable_limit","date_check_limit","date_formats");
      }
      mapped[62] = greycat.types_by_name.get(io.XmlReader.name);
      if(this.mapped[62] != null){
        this.mapped[62].resolveGeneratedOffsets("path","pos");
      }
      mapped[63] = greycat.types_by_name.get(io.SmtpMode.name);
      if(this.mapped[63] != null){
        this.mapped[63].resolveGeneratedOffsetWithValues("plain", 0L,"ssl_tls", 1L,"starttls", 2L);
      }
      mapped[64] = greycat.types_by_name.get(io.Csv.name);
      mapped[65] = greycat.types_by_name.get(io.Smtp.name);
      if(this.mapped[65] != null){
        this.mapped[65].resolveGeneratedOffsets("host","port","mode","authenticate","user","pass");
      }
      mapped[66] = greycat.types_by_name.get(io.File.name);
      if(this.mapped[66] != null){
        this.mapped[66].resolveGeneratedOffsets("path","size","last_modification");
      }
      mapped[67] = greycat.types_by_name.get(io.Reader.name);
      if(this.mapped[67] != null){
        this.mapped[67].resolveGeneratedOffsets("path","pos");
      }
      mapped[68] = greycat.types_by_name.get(io.GcbWriter.name);
      if(this.mapped[68] != null){
        this.mapped[68].resolveGeneratedOffsets("path","append");
      }
      mapped[69] = greycat.types_by_name.get(io.CsvStatistics.name);
      if(this.mapped[69] != null){
        this.mapped[69].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","columns","line_count","fail_count","file_count");
      }
      mapped[70] = greycat.types_by_name.get(io.Email.name);
      if(this.mapped[70] != null){
        this.mapped[70].resolveGeneratedOffsets("from","subject","body","body_is_html","to","cc","bcc");
      }
      mapped[71] = greycat.types_by_name.get(io.CsvFormat.name);
      if(this.mapped[71] != null){
        this.mapped[71].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","trim","format","tz","strict","nearest_time");
      }
      mapped[72] = greycat.types_by_name.get(io.Json.name);
      mapped[73] = greycat.types_by_name.get(io.JsonReader.name);
      if(this.mapped[73] != null){
        this.mapped[73].resolveGeneratedOffsets("path","pos");
      }
      mapped[74] = greycat.types_by_name.get(io.CsvWriter.name);
      if(this.mapped[74] != null){
        this.mapped[74].resolveGeneratedOffsets("path","append","format");
      }
      mapped[75] = greycat.types_by_name.get(io.CsvSharding.name);
      if(this.mapped[75] != null){
        this.mapped[75].resolveGeneratedOffsets("id","column","modulo");
      }
      mapped[76] = greycat.types_by_name.get(io.TextReader.name);
      if(this.mapped[76] != null){
        this.mapped[76].resolveGeneratedOffsets("path","pos");
      }
      mapped[77] = greycat.types_by_name.get(io.SmtpAuth.name);
      if(this.mapped[77] != null){
        this.mapped[77].resolveGeneratedOffsetWithValues("none", 0L,"plain", 1L,"login", 2L);
      }
      mapped[78] = greycat.types_by_name.get(runtime.McpClientRoots.name);
      if(this.mapped[78] != null){
        this.mapped[78].resolveGeneratedOffsets("listChanged");
      }
      mapped[79] = greycat.types_by_name.get(runtime.DateTuple.name);
      if(this.mapped[79] != null){
        this.mapped[79].resolveGeneratedOffsets("day","month");
      }
      mapped[80] = greycat.types_by_name.get(runtime.LogLevel.name);
      if(this.mapped[80] != null){
        this.mapped[80].resolveGeneratedOffsetWithValues("error", null,"warn", null,"info", null,"perf", null,"trace", null);
      }
      mapped[81] = greycat.types_by_name.get(runtime.Month.name);
      if(this.mapped[81] != null){
        this.mapped[81].resolveGeneratedOffsetWithValues("Jan", 0L,"Feb", 1L,"Mar", 2L,"Apr", 3L,"May", 4L,"Jun", 5L,"Jul", 6L,"Aug", 7L,"Sep", 8L,"Oct", 9L,"Nov", 10L,"Dec", 11L);
      }
      mapped[82] = greycat.types_by_name.get(runtime.PeriodicTask.name);
      if(this.mapped[82] != null){
        this.mapped[82].resolveGeneratedOffsets("function","periodicity","options","is_active","next_execution","execution_count");
      }
      mapped[83] = greycat.types_by_name.get(runtime.YearlyPeriodicity.name);
      if(this.mapped[83] != null){
        this.mapped[83].resolveGeneratedOffsets("dates","timezone");
      }
      mapped[84] = greycat.types_by_name.get(runtime.License.name);
      if(this.mapped[84] != null){
        this.mapped[84].resolveGeneratedOffsets("name","start","end","company","max_memory","extra_1","extra_2","type");
      }
      mapped[85] = greycat.types_by_name.get(runtime.McpToolsCallParams.name);
      if(this.mapped[85] != null){
        this.mapped[85].resolveGeneratedOffsets("_meta","name","arguments");
      }
      mapped[86] = greycat.types_by_name.get(runtime.InfoObject.name);
      if(this.mapped[86] != null){
        this.mapped[86].resolveGeneratedOffsets("title","version");
      }
      mapped[87] = greycat.types_by_name.get(runtime.OpenApiV3.name);
      if(this.mapped[87] != null){
        this.mapped[87].resolveGeneratedOffsets("openapi","info","paths","components");
      }
      mapped[88] = greycat.types_by_name.get(runtime.McpServerResourcesCapabilities.name);
      if(this.mapped[88] != null){
        this.mapped[88].resolveGeneratedOffsets("subscribe","listChanged");
      }
      mapped[89] = greycat.types_by_name.get(runtime.Frame.name);
      if(this.mapped[89] != null){
        this.mapped[89].resolveGeneratedOffsets("module","type","function","src","line","column","scope");
      }
      mapped[90] = greycat.types_by_name.get(runtime.DayOfWeek.name);
      if(this.mapped[90] != null){
        this.mapped[90].resolveGeneratedOffsetWithValues("Mon", 0L,"Tue", 1L,"Wed", 2L,"Thu", 3L,"Fri", 4L,"Sat", 5L,"Sun", 6L);
      }
      mapped[91] = greycat.types_by_name.get(runtime.OpenIDConnect.name);
      if(this.mapped[91] != null){
        this.mapped[91].resolveGeneratedOffsets("url","clientId");
      }
      mapped[92] = greycat.types_by_name.get(runtime.OperationObject.name);
      if(this.mapped[92] != null){
        this.mapped[92].resolveGeneratedOffsets("tags","description","requestBody","responses");
      }
      mapped[93] = greycat.types_by_name.get(runtime.SecurityEntity.name);
      if(this.mapped[93] != null){
        this.mapped[93].resolveGeneratedOffsets("id","name","activated");
      }
      mapped[94] = greycat.types_by_name.get(runtime.SecurityFields.name);
      if(this.mapped[94] != null){
        this.mapped[94].resolveGeneratedOffsets("email","name","first_name","last_name","roles","groups");
      }
      mapped[95] = greycat.types_by_name.get(runtime.McpContentBlock.name);
      if(this.mapped[95] != null){
        this.mapped[95].resolveGeneratedOffsets("type","_meta","annotations");
      }
      mapped[96] = greycat.types_by_name.get(runtime.Periodicity.name);
      mapped[97] = greycat.types_by_name.get(runtime.SchemaFormat.name);
      if(this.mapped[97] != null){
        this.mapped[97].resolveGeneratedOffsetWithValues("int32", null,"int64", null,"float", null,"double", null,"byte", null,"binary", null,"date", null,"date-time", null,"password", null);
      }
      mapped[98] = greycat.types_by_name.get(runtime.DailyPeriodicity.name);
      if(this.mapped[98] != null){
        this.mapped[98].resolveGeneratedOffsets("hour","minute","second","timezone");
      }
      mapped[99] = greycat.types_by_name.get(runtime.RuntimeInfo.name);
      if(this.mapped[99] != null){
        this.mapped[99].resolveGeneratedOffsets("version","program_version","arch","timezone","license","io_threads","bg_threads","fg_threads","mem_total","mem_worker","disk_data_bytes");
      }
      mapped[100] = greycat.types_by_name.get(runtime.OpenApiVersion.name);
      if(this.mapped[100] != null){
        this.mapped[100].resolveGeneratedOffsetWithValues("3.0.4", null,"3.1.0", null);
      }
      mapped[101] = greycat.types_by_name.get(runtime.McpServerToolsCapabilities.name);
      if(this.mapped[101] != null){
        this.mapped[101].resolveGeneratedOffsets("listChanged");
      }
      mapped[102] = greycat.types_by_name.get(runtime.McpToolsCallResult.name);
      if(this.mapped[102] != null){
        this.mapped[102].resolveGeneratedOffsets("_meta","content","structuredContent","isError");
      }
      mapped[103] = greycat.types_by_name.get(runtime.McpContentType.name);
      if(this.mapped[103] != null){
        this.mapped[103].resolveGeneratedOffsetWithValues("text", null,"image", null,"audio", null,"resource_link", null,"resource", null);
      }
      mapped[104] = greycat.types_by_name.get(runtime.MergeStrategy.name);
      if(this.mapped[104] != null){
        this.mapped[104].resolveGeneratedOffsetWithValues("strict", null,"first_wins", null,"last_wins", null);
      }
      mapped[105] = greycat.types_by_name.get(runtime.McpAnnotations.name);
      if(this.mapped[105] != null){
        this.mapped[105].resolveGeneratedOffsets("audience","priority","lastModified");
      }
      mapped[106] = greycat.types_by_name.get(runtime.MediaTypeObject.name);
      if(this.mapped[106] != null){
        this.mapped[106].resolveGeneratedOffsets("schema");
      }
      mapped[107] = greycat.types_by_name.get(runtime.McpClientCapabilities.name);
      if(this.mapped[107] != null){
        this.mapped[107].resolveGeneratedOffsets("experimental","roots","sampling","elicitation");
      }
      mapped[108] = greycat.types_by_name.get(runtime.HeaderObject.name);
      if(this.mapped[108] != null){
        this.mapped[108].resolveGeneratedOffsets("description","required");
      }
      mapped[109] = greycat.types_by_name.get(runtime.Task.name);
      if(this.mapped[109] != null){
        this.mapped[109].resolveGeneratedOffsets("user_id","task_id","mod","type","fun","creation","start","duration","status","progress");
      }
      mapped[110] = greycat.types_by_name.get(runtime.Log.name);
      if(this.mapped[110] != null){
        this.mapped[110].resolveGeneratedOffsets("level","time","user_id","id","id2","src","data");
      }
      mapped[111] = greycat.types_by_name.get(runtime.McpServerCapabilities.name);
      if(this.mapped[111] != null){
        this.mapped[111].resolveGeneratedOffsets("experimental","logging","completions","prompts","resources","tools");
      }
      mapped[112] = greycat.types_by_name.get(runtime.MonthlyPeriodicity.name);
      if(this.mapped[112] != null){
        this.mapped[112].resolveGeneratedOffsets("days","daily");
      }
      mapped[113] = greycat.types_by_name.get(runtime.WeeklyPeriodicity.name);
      if(this.mapped[113] != null){
        this.mapped[113].resolveGeneratedOffsets("days","daily");
      }
      mapped[114] = greycat.types_by_name.get(runtime.Role.name);
      if(this.mapped[114] != null){
        this.mapped[114].resolveGeneratedOffsets("name","permissions");
      }
      mapped[115] = greycat.types_by_name.get(runtime.Job.name);
      if(this.mapped[115] != null){
        this.mapped[115].resolveGeneratedOffsets("function","arguments");
      }
      mapped[116] = greycat.types_by_name.get(runtime.McpImageContent.name);
      if(this.mapped[116] != null){
        this.mapped[116].resolveGeneratedOffsets("type","_meta","annotations","data","mimeType");
      }
      mapped[117] = greycat.types_by_name.get(runtime.SchemaObject.name);
      if(this.mapped[117] != null){
        this.mapped[117].resolveGeneratedOffsets("$ref","$defs","type","format","nullable","properties","required","items","oneOf","allOf","anyOf","minItems","maxItems","enum","additionalProperties");
      }
      mapped[118] = greycat.types_by_name.get(runtime.UserCredential.name);
      if(this.mapped[118] != null){
        this.mapped[118].resolveGeneratedOffsets("offset","pass");
      }
      mapped[119] = greycat.types_by_name.get(runtime.SecurityPolicy.name);
      if(this.mapped[119] != null){
        this.mapped[119].resolveGeneratedOffsets("entities","credentials","fields","keys","keys_last_refresh");
      }
      mapped[120] = greycat.types_by_name.get(runtime.UserGroupPolicy.name);
      if(this.mapped[120] != null){
        this.mapped[120].resolveGeneratedOffsets("group_id","type");
      }
      mapped[121] = greycat.types_by_name.get(runtime.ComponentsObject.name);
      if(this.mapped[121] != null){
        this.mapped[121].resolveGeneratedOffsets("schemas");
      }
      mapped[122] = greycat.types_by_name.get(runtime.McpTool.name);
      if(this.mapped[122] != null){
        this.mapped[122].resolveGeneratedOffsets("name","title","description","inputSchema","outputSchema","annotations");
      }
      mapped[123] = greycat.types_by_name.get(runtime.McpRole.name);
      if(this.mapped[123] != null){
        this.mapped[123].resolveGeneratedOffsetWithValues("user", null,"assistant", null);
      }
      mapped[124] = greycat.types_by_name.get(runtime.LicenseType.name);
      if(this.mapped[124] != null){
        this.mapped[124].resolveGeneratedOffsetWithValues("community", null,"enterprise", null,"testing", null);
      }
      mapped[125] = greycat.types_by_name.get(runtime.FixedPeriodicity.name);
      if(this.mapped[125] != null){
        this.mapped[125].resolveGeneratedOffsets("every");
      }
      mapped[126] = greycat.types_by_name.get(runtime.SchemaType.name);
      if(this.mapped[126] != null){
        this.mapped[126].resolveGeneratedOffsetWithValues("string", null,"number", null,"integer", null,"boolean", null,"object", null,"array", null,"null", null);
      }
      mapped[127] = greycat.types_by_name.get(runtime.Debug.name);
      if(this.mapped[127] != null){
        this.mapped[127].resolveGeneratedOffsets("id","frames","root");
      }
      mapped[128] = greycat.types_by_name.get(runtime.McpInitializeParams.name);
      if(this.mapped[128] != null){
        this.mapped[128].resolveGeneratedOffsets("_meta","protocolVersion","capabilities","clientInfo");
      }
      mapped[129] = greycat.types_by_name.get(runtime.McpPriority.name);
      if(this.mapped[129] != null){
        this.mapped[129].resolveGeneratedOffsetWithValues("MostImportant", 1L,"LeastImportant", 0L);
      }
      mapped[130] = greycat.types_by_name.get(runtime.McpInitializeResult.name);
      if(this.mapped[130] != null){
        this.mapped[130].resolveGeneratedOffsets("_meta","protocolVersion","capabilities","serverInfo","instructions");
      }
      mapped[131] = greycat.types_by_name.get(runtime.McpAudioContent.name);
      if(this.mapped[131] != null){
        this.mapped[131].resolveGeneratedOffsets("type","_meta","annotations","data","mimeType");
      }
      mapped[132] = greycat.types_by_name.get(runtime.Scheduler.name);
      mapped[133] = greycat.types_by_name.get(runtime.McpImplementation.name);
      if(this.mapped[133] != null){
        this.mapped[133].resolveGeneratedOffsets("name","title","version");
      }
      mapped[134] = greycat.types_by_name.get(runtime.System.name);
      mapped[135] = greycat.types_by_name.get(runtime.McpResourceContent.name);
      if(this.mapped[135] != null){
        this.mapped[135].resolveGeneratedOffsets("type","_meta","annotations","uri","description","mimeType","size");
      }
      mapped[136] = greycat.types_by_name.get(runtime.UserGroupPolicyType.name);
      if(this.mapped[136] != null){
        this.mapped[136].resolveGeneratedOffsetWithValues("read", null,"write", null,"execute", null);
      }
      mapped[137] = greycat.types_by_name.get(runtime.OpenApi.name);
      mapped[138] = greycat.types_by_name.get(runtime.Runtime.name);
      mapped[139] = greycat.types_by_name.get(runtime.RequestBodyObject.name);
      if(this.mapped[139] != null){
        this.mapped[139].resolveGeneratedOffsets("content","required");
      }
      mapped[140] = greycat.types_by_name.get(runtime.TaskStatus.name);
      if(this.mapped[140] != null){
        this.mapped[140].resolveGeneratedOffsetWithValues("empty", null,"waiting", null,"running", null,"await", null,"cancelled", null,"error", null,"ended", null,"ended_with_errors", null,"breakpoint", null);
      }
      mapped[141] = greycat.types_by_name.get(runtime.User.name);
      if(this.mapped[141] != null){
        this.mapped[141].resolveGeneratedOffsets("id","name","activated","full_name","email","role","groups","groups_flags","external");
      }
      mapped[142] = greycat.types_by_name.get(runtime.ChildProcess.name);
      if(this.mapped[142] != null){
        this.mapped[142].resolveGeneratedOffsets("pid");
      }
      mapped[143] = greycat.types_by_name.get(runtime.McpBaseMetadata.name);
      if(this.mapped[143] != null){
        this.mapped[143].resolveGeneratedOffsets("name","title");
      }
      mapped[144] = greycat.types_by_name.get(runtime.Permission.name);
      if(this.mapped[144] != null){
        this.mapped[144].resolveGeneratedOffsets("name","description");
      }
      mapped[145] = greycat.types_by_name.get(runtime.McpServerPromptsCapabilities.name);
      if(this.mapped[145] != null){
        this.mapped[145].resolveGeneratedOffsets("listChanged");
      }
      mapped[146] = greycat.types_by_name.get(runtime.PathItemObject.name);
      if(this.mapped[146] != null){
        this.mapped[146].resolveGeneratedOffsets("description","post");
      }
      mapped[147] = greycat.types_by_name.get(runtime.McpTextContent.name);
      if(this.mapped[147] != null){
        this.mapped[147].resolveGeneratedOffsets("type","_meta","annotations","text");
      }
      mapped[148] = greycat.types_by_name.get(runtime.PeriodicOptions.name);
      if(this.mapped[148] != null){
        this.mapped[148].resolveGeneratedOffsets("activated","start","max_duration");
      }
      mapped[149] = greycat.types_by_name.get(runtime.UserGroup.name);
      if(this.mapped[149] != null){
        this.mapped[149].resolveGeneratedOffsets("id","name","activated");
      }
      mapped[150] = greycat.types_by_name.get(runtime.ChildProcessResult.name);
      if(this.mapped[150] != null){
        this.mapped[150].resolveGeneratedOffsets("code","stdout","stderr");
      }
      mapped[151] = greycat.types_by_name.get(runtime.ResponseCode.name);
      if(this.mapped[151] != null){
        this.mapped[151].resolveGeneratedOffsetWithValues("200", null,"400", null,"404", null);
      }
      mapped[152] = greycat.types_by_name.get(runtime.McpToolsListResult.name);
      if(this.mapped[152] != null){
        this.mapped[152].resolveGeneratedOffsets("_meta","tools");
      }
      mapped[153] = greycat.types_by_name.get(runtime.ResponseObject.name);
      if(this.mapped[153] != null){
        this.mapped[153].resolveGeneratedOffsets("description","headers","content");
      }
      mapped[154] = greycat.types_by_name.get(runtime.McpRequestParams.name);
      if(this.mapped[154] != null){
        this.mapped[154].resolveGeneratedOffsets("_meta");
      }
      mapped[155] = greycat.types_by_name.get(runtime.Variable.name);
      if(this.mapped[155] != null){
        this.mapped[155].resolveGeneratedOffsets("name","value");
      }
      mapped[156] = greycat.types_by_name.get(runtime.LogDataUsage.name);
      if(this.mapped[156] != null){
        this.mapped[156].resolveGeneratedOffsets("read_bytes","read_hits","read_wasted","write_bytes","write_hits","cache_bytes","cache_hits");
      }
      mapped[157] = greycat.types_by_name.get(runtime.McpToolsListParams.name);
      if(this.mapped[157] != null){
        this.mapped[157].resolveGeneratedOffsets("_meta","cursor");
      }
      mapped[158] = greycat.types_by_name.get(runtime.McpResult.name);
      if(this.mapped[158] != null){
        this.mapped[158].resolveGeneratedOffsets("_meta");
      }
      mapped[159] = greycat.types_by_name.get(util.Random.name);
      if(this.mapped[159] != null){
        this.mapped[159].resolveGeneratedOffsets("seed","v");
      }
      mapped[160] = greycat.types_by_name.get(util.Histogram.name);
      if(this.mapped[160] != null){
        this.mapped[160].resolveGeneratedOffsets("quantizer","bins","nb_rejected","nb_accepted","min","max","sum","sumsq");
      }
      mapped[161] = greycat.types_by_name.get(util.MultiQuantizer.name);
      if(this.mapped[161] != null){
        this.mapped[161].resolveGeneratedOffsets("quantizers");
      }
      mapped[162] = greycat.types_by_name.get(util.Gaussian.name);
      if(this.mapped[162] != null){
        this.mapped[162].resolveGeneratedOffsets("sum","sumsq","count","min","max");
      }
      mapped[163] = greycat.types_by_name.get(util.Assert.name);
      mapped[164] = greycat.types_by_name.get(util.ProgressTracker.name);
      if(this.mapped[164] != null){
        this.mapped[164].resolveGeneratedOffsets("start","total","counter","duration","progress","speed","remaining");
      }
      mapped[165] = greycat.types_by_name.get(util.GaussianProfileSlot.name);
      if(this.mapped[165] != null){
        this.mapped[165].resolveGeneratedOffsets("sum","sumsq","count");
      }
      mapped[166] = greycat.types_by_name.get(util.TimeWindow.name);
      if(this.mapped[166] != null){
        this.mapped[166].resolveGeneratedOffsets("values","span","sum","sumsq","field");
      }
      mapped[167] = greycat.types_by_name.get(util.LinearQuantizer.name);
      if(this.mapped[167] != null){
        this.mapped[167].resolveGeneratedOffsets("min","max","bins","open");
      }
      mapped[168] = greycat.types_by_name.get(util.Crypto.name);
      mapped[169] = greycat.types_by_name.get(util.SlidingWindow.name);
      if(this.mapped[169] != null){
        this.mapped[169].resolveGeneratedOffsets("values","span","sum","sumsq","field");
      }
      mapped[170] = greycat.types_by_name.get(util.Queue.name);
      if(this.mapped[170] != null){
        this.mapped[170].resolveGeneratedOffsets("values","capacity");
      }
      mapped[171] = greycat.types_by_name.get(util.Plot.name);
      mapped[172] = greycat.types_by_name.get(util.HistogramStats.name);
      if(this.mapped[172] != null){
        this.mapped[172].resolveGeneratedOffsets("min","max","whisker_low","whisker_high","percentile1","percentile5","percentile10","percentile20","percentile25","percentile50","percentile75","percentile80","percentile90","percentile95","percentile99","sum","avg","std","size");
      }
      mapped[173] = greycat.types_by_name.get(util.CustomQuantizer.name);
      if(this.mapped[173] != null){
        this.mapped[173].resolveGeneratedOffsets("min","max","step_starts","open");
      }
      mapped[174] = greycat.types_by_name.get(util.QuantizerSlotBound.name);
      if(this.mapped[174] != null){
        this.mapped[174].resolveGeneratedOffsets("min","max","center");
      }
      mapped[175] = greycat.types_by_name.get(util.Stack.name);
      if(this.mapped[175] != null){
        this.mapped[175].resolveGeneratedOffsets("values");
      }
      mapped[176] = greycat.types_by_name.get(util.Quantizer.name);
      mapped[177] = greycat.types_by_name.get(util.HistogramBin.name);
      if(this.mapped[177] != null){
        this.mapped[177].resolveGeneratedOffsets("bin","count","ratio","cumulative_count","cumulative_ratio");
      }
      mapped[178] = greycat.types_by_name.get(util.GaussianProfile.name);
      if(this.mapped[178] != null){
        this.mapped[178].resolveGeneratedOffsets("quantizer","precision","bins","value_min","nb_rejected");
      }
      mapped[179] = greycat.types_by_name.get(util.LogQuantizer.name);
      if(this.mapped[179] != null){
        this.mapped[179].resolveGeneratedOffsets("min","max","bins","open");
      }
    }
  }
}
