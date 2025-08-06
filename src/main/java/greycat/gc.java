// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package greycat;

@SuppressWarnings({"unused", "unchecked"})
public final class gc {
	public static final class core {
		public static final class Table<T> extends greycat.std_n.core.Table<T> {
			public static final java.lang.String name = "core::Table";

			public Table(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public Table(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[0]);
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

			public TensorType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public TensorType(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[1], attributes);
			}
			public static TensorType get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static TensorType get(java.lang.String key, GreyCat greycat) {
				return (TensorType) greycat.libs_by_name.get(std.name).mapped[1].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class ErrorFrame extends GreyCat.Object {
			public static final java.lang.String name = "core::ErrorFrame";

			public ErrorFrame(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public ErrorFrame(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[2], attributes);
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
		public static final class Tensor extends greycat.std_n.core.Tensor {
			public static final java.lang.String name = "core::Tensor";

			public Tensor(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public Tensor(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[3]);
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

			public TimeZone(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public TimeZone(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[4], attributes);
			}
			public static TimeZone get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static TimeZone get(java.lang.String key, GreyCat greycat) {
				return (TimeZone) greycat.libs_by_name.get(std.name).mapped[4].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class String extends greycat.std_n.core.String {
			public static final java.lang.String name = "core::String";

			public String(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public String(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[5]);
			}
		}
		public static final class GeoPoly extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoPoly";

			public GeoPoly(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public GeoPoly(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[6], attributes);
			}
			public core.Array<greycat.gc.core.geo> points() {
				return (core.Array<greycat.gc.core.geo>) getAttribute(type.generated_offsets[0]);
			}
			public void set_points(core.Array<greycat.gc.core.geo> v) {
				setAttribute(type.generated_offsets[0], v);
			}
		}
		public static final class t3f extends greycat.std_n.core.t3f {
			public static final java.lang.String name = "core::t3f";

			public t3f(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public t3f(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[7]);
			}
		}
		public static final class geo extends greycat.std_n.core.geo {
			public static final java.lang.String name = "core::geo";

			public geo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public geo(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[8]);
			}
		}
		public static final class field extends greycat.std_n.core.field {
			public static final java.lang.String name = "core::field";

			public field(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public field(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[9]);
			}
		}
		public static final class t2 extends greycat.std_n.core.t2 {
			public static final java.lang.String name = "core::t2";

			public t2(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public t2(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[10]);
			}
		}
		public static final class Buffer extends greycat.std_n.core.Buffer {
			public static final java.lang.String name = "core::Buffer";

			public Buffer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public Buffer(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[11]);
			}
		}
		public static final class nodeTime<T> extends greycat.std_n.core.nodeTime<T> {
			public static final java.lang.String name = "core::nodeTime";

			public nodeTime(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public nodeTime(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[12]);
			}
		}
		public static final class nodeList<T> extends greycat.std_n.core.nodeList<T> {
			public static final java.lang.String name = "core::nodeList";

			public nodeList(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public nodeList(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[13]);
			}
		}
		public static final class duration extends greycat.std_n.core.duration {
			public static final java.lang.String name = "core::duration";

			public duration(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public duration(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[14]);
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

			public ErrorCode(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public ErrorCode(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[15], attributes);
			}
			public static ErrorCode get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static ErrorCode get(java.lang.String key, GreyCat greycat) {
				return (ErrorCode) greycat.libs_by_name.get(std.name).mapped[15].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class nodeTimeCursor<T> extends GreyCat.Object {
			public static final java.lang.String name = "core::nodeTimeCursor";

			public nodeTimeCursor(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public nodeTimeCursor(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[16], attributes);
			}
			public greycat.gc.core.nodeTime<T>  n() {
				return (greycat.gc.core.nodeTime<T> ) getAttribute(type.generated_offsets[0]);
			}
			public void set_n(greycat.gc.core.nodeTime<T>  v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public greycat.gc.core.time req_time() {
				return (greycat.gc.core.time) getAttribute(type.generated_offsets[1]);
			}
			public void set_req_time(greycat.gc.core.time v) {
				setAttribute(type.generated_offsets[1], v);
			}
		}
		public static final class NodeInfo<T> extends GreyCat.Object {
			public static final java.lang.String name = "core::NodeInfo";

			public NodeInfo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public NodeInfo(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[17], attributes);
			}
			public java.lang.Long size() {
				return (java.lang.Long) getAttribute(type.generated_offsets[0]);
			}
			public void set_size(java.lang.Long v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object from() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_from(java.lang.Object v) {
				setAttribute(type.generated_offsets[1], v);
			}
			public java.lang.Object to() {
				return getAttribute(type.generated_offsets[2]);
			}
			public void set_to(java.lang.Object v) {
				setAttribute(type.generated_offsets[2], v);
			}
		}
		public static final class t2f extends greycat.std_n.core.t2f {
			public static final java.lang.String name = "core::t2f";

			public t2f(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public t2f(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[18]);
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
		public static final class type extends greycat.std_n.core.type {
			public static final java.lang.String name = "core::type";

			public type(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public type(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[20]);
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

			public SamplingMode(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SamplingMode(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[21], attributes);
			}
			public static SamplingMode get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static SamplingMode get(java.lang.String key, GreyCat greycat) {
				return (SamplingMode) greycat.libs_by_name.get(std.name).mapped[21].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class SortOrder extends GreyCat.Enum {
			public static final java.lang.String name = "core::SortOrder";

			private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

			static {
				indicesByValues.put("asc", 0);
				indicesByValues.put("desc", 1);
			}

			public SortOrder(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SortOrder(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[22], attributes);
			}
			public static SortOrder get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static SortOrder get(java.lang.String key, GreyCat greycat) {
				return (SortOrder) greycat.libs_by_name.get(std.name).mapped[22].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class Error extends GreyCat.Object {
			public static final java.lang.String name = "core::Error";

			public Error(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Error(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[23], attributes);
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
		public static final class node<T> extends greycat.std_n.core.node<T> {
			public static final java.lang.String name = "core::node";

			public node(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public node(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[24]);
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

			public CalendarUnit(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CalendarUnit(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[25], attributes);
			}
			public static CalendarUnit get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static CalendarUnit get(java.lang.String key, GreyCat greycat) {
				return (CalendarUnit) greycat.libs_by_name.get(std.name).mapped[25].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class Tuple<T,U> extends GreyCat.Object {
			public static final java.lang.String name = "core::Tuple";

			public Tuple(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Tuple(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[26], attributes);
			}
			public java.lang.Object x() {
				return getAttribute(type.generated_offsets[0]);
			}
			public void set_x(java.lang.Object v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object y() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_y(java.lang.Object v) {
				setAttribute(type.generated_offsets[1], v);
			}
		}
		public static final class time extends greycat.std_n.core.time {
			public static final java.lang.String name = "core::time";

			public time(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public time(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[27]);
			}
		}
		public static final class Map<K,V> extends greycat.std_n.core.Map<K,V> {
			public static final java.lang.String name = "core::Map";

			public Map(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public Map(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[28]);
			}
		}
		public static final class nodeIndex<K,V> extends greycat.std_n.core.nodeIndex<K,V> {
			public static final java.lang.String name = "core::nodeIndex";

			public nodeIndex(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public nodeIndex(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[29]);
			}
		}
		public static final class t3 extends greycat.std_n.core.t3 {
			public static final java.lang.String name = "core::t3";

			public t3(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public t3(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[30]);
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

			public DurationUnit(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public DurationUnit(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[31], attributes);
			}
			public static DurationUnit get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static DurationUnit get(java.lang.String key, GreyCat greycat) {
				return (DurationUnit) greycat.libs_by_name.get(std.name).mapped[31].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class Array<T> extends greycat.std_n.core.Array<T> {
			public static final java.lang.String name = "core::Array";

			public Array(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public Array(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[32]);
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

			public FloatPrecision(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public FloatPrecision(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[33], attributes);
			}
			public static FloatPrecision get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static FloatPrecision get(java.lang.String key, GreyCat greycat) {
				return (FloatPrecision) greycat.libs_by_name.get(std.name).mapped[33].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class MathConstants extends GreyCat.Object {
			public static final java.lang.String name = "core::MathConstants";

			public MathConstants(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public MathConstants(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[34], attributes);
			}
		}
		public static final class str extends greycat.std_n.core.str {
			public static final java.lang.String name = "core::str";

			public str(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public str(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[35]);
			}
		}
		public static final class t4 extends greycat.std_n.core.t4 {
			public static final java.lang.String name = "core::t4";

			public t4(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public t4(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[36]);
			}
		}
		public static final class nodeIndexBucket<K,V> extends GreyCat.Object {
			public static final java.lang.String name = "core::nodeIndexBucket";

			public nodeIndexBucket(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public nodeIndexBucket(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[37], attributes);
			}
			public java.lang.Object key() {
				return getAttribute(type.generated_offsets[0]);
			}
			public void set_key(java.lang.Object v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object value() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_value(java.lang.Object v) {
				setAttribute(type.generated_offsets[1], v);
			}
			public core.nodeIndexBucket<T, U>  next() {
				return (core.nodeIndexBucket<T, U> ) getAttribute(type.generated_offsets[2]);
			}
			public void set_next(core.nodeIndexBucket<T, U>  v) {
				setAttribute(type.generated_offsets[2], v);
			}
		}
		public static final class nodeGeo<T> extends greycat.std_n.core.nodeGeo<T> {
			public static final java.lang.String name = "core::nodeGeo";

			public nodeGeo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public nodeGeo(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[38]);
			}
		}
		public static final class function extends greycat.std_n.core.function {
			public static final java.lang.String name = "core::function";

			public function(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}

			public function(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[39]);
			}
		}
		public static final class GeoBox extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoBox";

			public GeoBox(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public GeoBox(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[40], attributes);
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
		public static final class TableColumnMapping extends GreyCat.Object {
			public static final java.lang.String name = "core::TableColumnMapping";

			public TableColumnMapping(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public TableColumnMapping(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[41], attributes);
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
		public static final class GeoCircle extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoCircle";

			public GeoCircle(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public GeoCircle(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[42], attributes);
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
		public static final class Date extends GreyCat.Object {
			public static final java.lang.String name = "core::Date";

			public Date(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Date(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[43], attributes);
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
			public static core.Date from_time(greycat.gc.core.time time, core.TimeZone tz) throws java.io.IOException {
				return from_time(time, tz, GreyCat.DEFAULT);
			}

			public static core.Date from_time(greycat.gc.core.time time, core.TimeZone tz, GreyCat greycat) throws java.io.IOException {
				return (core.Date) greycat.call("core::Date::from_time", time, tz);
			}
		}
	}
	public static final class io {
		public static final class SmtpAuth extends GreyCat.Enum {
			public static final java.lang.String name = "io::SmtpAuth";

			private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

			static {
				indicesByValues.put("none", 0);
				indicesByValues.put("plain", 1);
				indicesByValues.put("login", 2);
			}

			public SmtpAuth(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SmtpAuth(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[44], attributes);
			}
			public static SmtpAuth get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static SmtpAuth get(java.lang.String key, GreyCat greycat) {
				return (SmtpAuth) greycat.libs_by_name.get(std.name).mapped[44].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class Writer<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::Writer";

			public Writer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Writer(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[45], attributes);
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
		public static final class CsvSharding extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvSharding";

			public CsvSharding(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CsvSharding(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[46], attributes);
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
		public static final class Http extends GreyCat.Object {
			public static final java.lang.String name = "io::Http";

			public Http(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Http(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[47], attributes);
			}
		}
		public static final class CsvColumnStatistics extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnStatistics";

			public CsvColumnStatistics(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CsvColumnStatistics(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[48], attributes);
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
			public <T> util.Gaussian<T>  profile() {
				return (util.Gaussian<T> ) getAttribute(type.generated_offsets[10]);
			}
			public <T> void set_profile(util.Gaussian<T>  v) {
				setAttribute(type.generated_offsets[10], v);
			}
		}
		public static final class Url extends GreyCat.Object {
			public static final java.lang.String name = "io::Url";

			public Url(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Url(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[49], attributes);
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
		public static final class GcbReader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::GcbReader";

			public GcbReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public GcbReader(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[50], attributes);
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
		public static final class TextWriter<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::TextWriter";

			public TextWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public TextWriter(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[51], attributes);
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
		public static final class File extends GreyCat.Object {
			public static final java.lang.String name = "io::File";

			public File(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public File(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[52], attributes);
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
		public static final class SmtpMode extends GreyCat.Enum {
			public static final java.lang.String name = "io::SmtpMode";

			private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

			static {
				indicesByValues.put("plain", 0);
				indicesByValues.put("ssl_tls", 1);
				indicesByValues.put("starttls", 2);
			}

			public SmtpMode(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SmtpMode(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[53], attributes);
			}
			public static SmtpMode get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static SmtpMode get(java.lang.String key, GreyCat greycat) {
				return (SmtpMode) greycat.libs_by_name.get(std.name).mapped[53].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class HttpHeader extends GreyCat.Object {
			public static final java.lang.String name = "io::HttpHeader";

			public HttpHeader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public HttpHeader(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[54], attributes);
			}
			public java.lang.String name() {
				return (java.lang.String) getAttribute(type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.String value() {
				return (java.lang.String) getAttribute(type.generated_offsets[1]);
			}
			public void set_value(java.lang.String v) {
				setAttribute(type.generated_offsets[1], v);
			}
		}
		public static final class GcbWriter<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::GcbWriter";

			public GcbWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public GcbWriter(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[55], attributes);
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
		public static final class CsvReader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvReader";

			public CsvReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CsvReader(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[56], attributes);
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
		public static final class CsvStatistics extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvStatistics";

			public CsvStatistics(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CsvStatistics(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[57], attributes);
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
		public static final class CsvAnalysisConfig extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvAnalysisConfig";

			public CsvAnalysisConfig(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CsvAnalysisConfig(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[58], attributes);
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
		public static final class CsvFormat extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvFormat";

			public CsvFormat(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CsvFormat(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[59], attributes);
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
		public static final class Email extends GreyCat.Object {
			public static final java.lang.String name = "io::Email";

			public Email(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Email(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[60], attributes);
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
		public static final class FileWalker extends GreyCat.Object {
			public static final java.lang.String name = "io::FileWalker";

			public FileWalker(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public FileWalker(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[61], attributes);
			}
			public java.lang.String path() {
				return (java.lang.String) getAttribute(type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v) {
				setAttribute(type.generated_offsets[0], v);
			}
		}
		public static final class Json<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::Json";

			public Json(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Json(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[62], attributes);
			}
		}
		public static final class CsvWriter<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvWriter";

			public CsvWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CsvWriter(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[63], attributes);
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
		public static final class JsonReader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::JsonReader";

			public JsonReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public JsonReader(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[64], attributes);
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
		public static final class TextReader extends GreyCat.Object {
			public static final java.lang.String name = "io::TextReader";

			public TextReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public TextReader(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[65], attributes);
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
		public static final class Reader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::Reader";

			public Reader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Reader(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[66], attributes);
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
		public static final class XmlReader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::XmlReader";

			public XmlReader(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public XmlReader(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[67], attributes);
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

			public JsonWriter(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public JsonWriter(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[68], attributes);
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
		public static final class Csv extends GreyCat.Object {
			public static final java.lang.String name = "io::Csv";

			public Csv(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Csv(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[69], attributes);
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

			public Smtp(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Smtp(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[70], attributes);
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
	}
	public static final class runtime {
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
			}

			public TaskStatus(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public TaskStatus(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[71], attributes);
			}
			public static TaskStatus get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static TaskStatus get(java.lang.String key, GreyCat greycat) {
				return (TaskStatus) greycat.libs_by_name.get(std.name).mapped[71].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class Debug extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Debug";

			public Debug(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Debug(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[72], attributes);
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
		public static final class UserGroupPolicy extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserGroupPolicy";

			public UserGroupPolicy(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public UserGroupPolicy(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[73], attributes);
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
		public static final class LogDataUsage extends GreyCat.Object {
			public static final java.lang.String name = "runtime::LogDataUsage";

			public LogDataUsage(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public LogDataUsage(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[74], attributes);
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
		public static final class SecurityFields extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityFields";

			public SecurityFields(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SecurityFields(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[75], attributes);
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
		public static final class UserGroup extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserGroup";

			public UserGroup(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public UserGroup(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[76], attributes);
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
		public static final class Frame extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Frame";

			public Frame(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Frame(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[77], attributes);
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
		public static final class User extends GreyCat.Object {
			public static final java.lang.String name = "runtime::User";

			public User(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public User(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[78], attributes);
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
		public static final class System extends GreyCat.Object {
			public static final java.lang.String name = "runtime::System";

			public System(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public System(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[79], attributes);
			}
		}
		public static final class SecurityEntity extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityEntity";

			public SecurityEntity(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SecurityEntity(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[80], attributes);
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
		public static final class Role extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Role";

			public Role(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Role(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[81], attributes);
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

			public Job(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Job(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[82], attributes);
			}
			public core.function function() {
				return (core.function) getAttribute(type.generated_offsets[0]);
			}
			public void set_function(core.function v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public core.Array<T>  arguments() {
				return (core.Array<T> ) getAttribute(type.generated_offsets[1]);
			}
			public void set_arguments(core.Array<T>  v) {
				setAttribute(type.generated_offsets[1], v);
			}
		}
		public static final class Permission extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Permission";

			public Permission(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Permission(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[83], attributes);
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
		public static final class MergeStrategy extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::MergeStrategy";

			private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

			static {
				indicesByValues.put("strict", 0);
				indicesByValues.put("first_wins", 1);
				indicesByValues.put("last_wins", 2);
			}

			public MergeStrategy(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public MergeStrategy(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[84], attributes);
			}
			public static MergeStrategy get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static MergeStrategy get(java.lang.String key, GreyCat greycat) {
				return (MergeStrategy) greycat.libs_by_name.get(std.name).mapped[84].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class UserCredential extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserCredential";

			public UserCredential(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public UserCredential(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[85], attributes);
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
		public static final class UserGroupPolicyType extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::UserGroupPolicyType";

			private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

			static {
				indicesByValues.put("read", 0);
				indicesByValues.put("write", 1);
				indicesByValues.put("execute", 2);
			}

			public UserGroupPolicyType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public UserGroupPolicyType(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[86], attributes);
			}
			public static UserGroupPolicyType get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static UserGroupPolicyType get(java.lang.String key, GreyCat greycat) {
				return (UserGroupPolicyType) greycat.libs_by_name.get(std.name).mapped[86].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class Log extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Log";

			public Log(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Log(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[87], attributes);
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
		public static final class LicenseType extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::LicenseType";

			private static final java.util.Map<java.lang.String, Integer> indicesByValues = new java.util.HashMap<>();

			static {
				indicesByValues.put("community", 0);
				indicesByValues.put("enterprise", 1);
				indicesByValues.put("testing", 2);
			}

			public LicenseType(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public LicenseType(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[88], attributes);
			}
			public static LicenseType get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static LicenseType get(java.lang.String key, GreyCat greycat) {
				return (LicenseType) greycat.libs_by_name.get(std.name).mapped[88].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class SecurityPolicy extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityPolicy";

			public SecurityPolicy(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SecurityPolicy(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[89], attributes);
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
		public static final class PeriodicTask extends GreyCat.Object {
			public static final java.lang.String name = "runtime::PeriodicTask";

			public PeriodicTask(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public PeriodicTask(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[90], attributes);
			}
			public core.function function() {
				return (core.function) getAttribute(type.generated_offsets[0]);
			}
			public void set_function(core.function v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Long user_id() {
				return (java.lang.Long) getAttribute(type.generated_offsets[1]);
			}
			public void set_user_id(java.lang.Long v) {
				setAttribute(type.generated_offsets[1], v);
			}
			public <T> core.Array<T>  arguments() {
				return (core.Array<T> ) getAttribute(type.generated_offsets[2]);
			}
			public <T> void set_arguments(core.Array<T>  v) {
				setAttribute(type.generated_offsets[2], v);
			}
			public greycat.gc.core.time start() {
				return (greycat.gc.core.time) getAttribute(type.generated_offsets[3]);
			}
			public void set_start(greycat.gc.core.time v) {
				setAttribute(type.generated_offsets[3], v);
			}
			public greycat.gc.core.duration every() {
				return (greycat.gc.core.duration) getAttribute(type.generated_offsets[4]);
			}
			public void set_every(greycat.gc.core.duration v) {
				setAttribute(type.generated_offsets[4], v);
			}
			public static void set(core.Array<runtime.PeriodicTask> tasks) throws java.io.IOException {
				set(tasks, GreyCat.DEFAULT);
			}

			public static void set(core.Array<runtime.PeriodicTask> tasks, GreyCat greycat) throws java.io.IOException {
				greycat.call("runtime::PeriodicTask::set", tasks);
			}
			public static core.Array<runtime.PeriodicTask> all() throws java.io.IOException {
				return all(GreyCat.DEFAULT);
			}

			public static core.Array<runtime.PeriodicTask> all(GreyCat greycat) throws java.io.IOException {
				return (core.Array<runtime.PeriodicTask>) greycat.call("runtime::PeriodicTask::all");
			}
		}
		public static final class License extends GreyCat.Object {
			public static final java.lang.String name = "runtime::License";

			public License(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public License(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[91], attributes);
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
		public static final class OpenIDConnect extends GreyCat.Object {
			public static final java.lang.String name = "runtime::OpenIDConnect";

			public OpenIDConnect(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public OpenIDConnect(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[92], attributes);
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
		public static final class Task extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Task";

			public Task(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Task(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[93], attributes);
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

			public LogLevel(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public LogLevel(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[94], attributes);
			}
			public static LogLevel get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}

			public static LogLevel get(java.lang.String key, GreyCat greycat) {
				return (LogLevel) greycat.libs_by_name.get(std.name).mapped[94].enum_values[indicesByValues.get(key)];
			}
		}
		public static final class Variable extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Variable";

			public Variable(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Variable(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[95], attributes);
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
		public static final class Runtime extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Runtime";

			public Runtime(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Runtime(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[96], attributes);
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
		public static final class RuntimeInfo extends GreyCat.Object {
			public static final java.lang.String name = "runtime::RuntimeInfo";

			public RuntimeInfo(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public RuntimeInfo(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[97], attributes);
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
	}
	public static final class util {
		public static final class HistogramBin<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::HistogramBin";

			public HistogramBin(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public HistogramBin(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[98], attributes);
			}
			public util.QuantizerSlotBound<T>  bin() {
				return (util.QuantizerSlotBound<T> ) getAttribute(type.generated_offsets[0]);
			}
			public void set_bin(util.QuantizerSlotBound<T>  v) {
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
		public static final class TimeWindow<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::TimeWindow";

			public TimeWindow(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public TimeWindow(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[99], attributes);
			}
			public core.Table<core.Tuple<greycat.gc.core.time, java.lang.Object>> values() {
				return (core.Table<core.Tuple<greycat.gc.core.time, java.lang.Object>>) getAttribute(type.generated_offsets[0]);
			}
			public void set_values(core.Table<core.Tuple<greycat.gc.core.time, java.lang.Object>> v) {
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
		public static final class Stack<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Stack";

			public Stack(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Stack(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[100], attributes);
			}
			public core.Array<T>  values() {
				return (core.Array<T> ) getAttribute(type.generated_offsets[0]);
			}
			public void set_values(core.Array<T>  v) {
				setAttribute(type.generated_offsets[0], v);
			}
		}
		public static final class LinearQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::LinearQuantizer";

			public LinearQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public LinearQuantizer(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[101], attributes);
			}
			public java.lang.Object min() {
				return getAttribute(type.generated_offsets[0]);
			}
			public void set_min(java.lang.Object v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object max() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_max(java.lang.Object v) {
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
		public static final class SlidingWindow<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::SlidingWindow";

			public SlidingWindow(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public SlidingWindow(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[102], attributes);
			}
			public core.Array<T>  values() {
				return (core.Array<T> ) getAttribute(type.generated_offsets[0]);
			}
			public void set_values(core.Array<T>  v) {
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
		public static final class GaussianProfile<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::GaussianProfile";

			public GaussianProfile(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public GaussianProfile(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[103], attributes);
			}
			public util.Quantizer<T>  quantizer() {
				return (util.Quantizer<T> ) getAttribute(type.generated_offsets[0]);
			}
			public void set_quantizer(util.Quantizer<T>  v) {
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
		public static final class Quantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Quantizer";

			public Quantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Quantizer(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[104], attributes);
			}
		}
		public static final class HistogramStats<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::HistogramStats";

			public HistogramStats(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public HistogramStats(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[105], attributes);
			}
			public java.lang.Object min() {
				return getAttribute(type.generated_offsets[0]);
			}
			public void set_min(java.lang.Object v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object max() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_max(java.lang.Object v) {
				setAttribute(type.generated_offsets[1], v);
			}
			public java.lang.Object whisker_low() {
				return getAttribute(type.generated_offsets[2]);
			}
			public void set_whisker_low(java.lang.Object v) {
				setAttribute(type.generated_offsets[2], v);
			}
			public java.lang.Object whisker_high() {
				return getAttribute(type.generated_offsets[3]);
			}
			public void set_whisker_high(java.lang.Object v) {
				setAttribute(type.generated_offsets[3], v);
			}
			public java.lang.Object percentile1() {
				return getAttribute(type.generated_offsets[4]);
			}
			public void set_percentile1(java.lang.Object v) {
				setAttribute(type.generated_offsets[4], v);
			}
			public java.lang.Object percentile5() {
				return getAttribute(type.generated_offsets[5]);
			}
			public void set_percentile5(java.lang.Object v) {
				setAttribute(type.generated_offsets[5], v);
			}
			public java.lang.Object percentile10() {
				return getAttribute(type.generated_offsets[6]);
			}
			public void set_percentile10(java.lang.Object v) {
				setAttribute(type.generated_offsets[6], v);
			}
			public java.lang.Object percentile20() {
				return getAttribute(type.generated_offsets[7]);
			}
			public void set_percentile20(java.lang.Object v) {
				setAttribute(type.generated_offsets[7], v);
			}
			public java.lang.Object percentile25() {
				return getAttribute(type.generated_offsets[8]);
			}
			public void set_percentile25(java.lang.Object v) {
				setAttribute(type.generated_offsets[8], v);
			}
			public java.lang.Object percentile50() {
				return getAttribute(type.generated_offsets[9]);
			}
			public void set_percentile50(java.lang.Object v) {
				setAttribute(type.generated_offsets[9], v);
			}
			public java.lang.Object percentile75() {
				return getAttribute(type.generated_offsets[10]);
			}
			public void set_percentile75(java.lang.Object v) {
				setAttribute(type.generated_offsets[10], v);
			}
			public java.lang.Object percentile80() {
				return getAttribute(type.generated_offsets[11]);
			}
			public void set_percentile80(java.lang.Object v) {
				setAttribute(type.generated_offsets[11], v);
			}
			public java.lang.Object percentile90() {
				return getAttribute(type.generated_offsets[12]);
			}
			public void set_percentile90(java.lang.Object v) {
				setAttribute(type.generated_offsets[12], v);
			}
			public java.lang.Object percentile95() {
				return getAttribute(type.generated_offsets[13]);
			}
			public void set_percentile95(java.lang.Object v) {
				setAttribute(type.generated_offsets[13], v);
			}
			public java.lang.Object percentile99() {
				return getAttribute(type.generated_offsets[14]);
			}
			public void set_percentile99(java.lang.Object v) {
				setAttribute(type.generated_offsets[14], v);
			}
			public java.lang.Double sum() {
				return (java.lang.Double) getAttribute(type.generated_offsets[15]);
			}
			public void set_sum(java.lang.Double v) {
				setAttribute(type.generated_offsets[15], v);
			}
			public java.lang.Object avg() {
				return getAttribute(type.generated_offsets[16]);
			}
			public void set_avg(java.lang.Object v) {
				setAttribute(type.generated_offsets[16], v);
			}
			public java.lang.Object std() {
				return getAttribute(type.generated_offsets[17]);
			}
			public void set_std(java.lang.Object v) {
				setAttribute(type.generated_offsets[17], v);
			}
			public java.lang.Long size() {
				return (java.lang.Long) getAttribute(type.generated_offsets[18]);
			}
			public void set_size(java.lang.Long v) {
				setAttribute(type.generated_offsets[18], v);
			}
		}
		public static final class Random extends GreyCat.Object {
			public static final java.lang.String name = "util::Random";

			public Random(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Random(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[106], attributes);
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
		public static final class CustomQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::CustomQuantizer";

			public CustomQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public CustomQuantizer(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[107], attributes);
			}
			public java.lang.Object min() {
				return getAttribute(type.generated_offsets[0]);
			}
			public void set_min(java.lang.Object v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object max() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_max(java.lang.Object v) {
				setAttribute(type.generated_offsets[1], v);
			}
			public core.Array<T>  step_starts() {
				return (core.Array<T> ) getAttribute(type.generated_offsets[2]);
			}
			public void set_step_starts(core.Array<T>  v) {
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

			public QuantizerSlotBound(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public QuantizerSlotBound(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[108], attributes);
			}
			public java.lang.Object min() {
				return getAttribute(type.generated_offsets[0]);
			}
			public void set_min(java.lang.Object v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object max() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_max(java.lang.Object v) {
				setAttribute(type.generated_offsets[1], v);
			}
			public java.lang.Object center() {
				return getAttribute(type.generated_offsets[2]);
			}
			public void set_center(java.lang.Object v) {
				setAttribute(type.generated_offsets[2], v);
			}
		}
		public static final class Assert extends GreyCat.Object {
			public static final java.lang.String name = "util::Assert";

			public Assert(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Assert(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[109], attributes);
			}
		}
		public static final class ProgressTracker extends GreyCat.Object {
			public static final java.lang.String name = "util::ProgressTracker";

			public ProgressTracker(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public ProgressTracker(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[110], attributes);
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

			public GaussianProfileSlot(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public GaussianProfileSlot(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[111], attributes);
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
		public static final class Histogram<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Histogram";

			public Histogram(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Histogram(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[112], attributes);
			}
			public util.Quantizer<T>  quantizer() {
				return (util.Quantizer<T> ) getAttribute(type.generated_offsets[0]);
			}
			public void set_quantizer(util.Quantizer<T>  v) {
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
			public java.lang.Object min() {
				return getAttribute(type.generated_offsets[4]);
			}
			public void set_min(java.lang.Object v) {
				setAttribute(type.generated_offsets[4], v);
			}
			public java.lang.Object max() {
				return getAttribute(type.generated_offsets[5]);
			}
			public void set_max(java.lang.Object v) {
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
		public static final class Queue<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Queue";

			public Queue(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Queue(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[113], attributes);
			}
			public core.Array<T>  values() {
				return (core.Array<T> ) getAttribute(type.generated_offsets[0]);
			}
			public void set_values(core.Array<T>  v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Long capacity() {
				return (java.lang.Long) getAttribute(type.generated_offsets[1]);
			}
			public void set_capacity(java.lang.Long v) {
				setAttribute(type.generated_offsets[1], v);
			}
		}
		public static final class Gaussian<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Gaussian";

			public Gaussian(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Gaussian(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[114], attributes);
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
			public java.lang.Object min() {
				return getAttribute(type.generated_offsets[3]);
			}
			public void set_min(java.lang.Object v) {
				setAttribute(type.generated_offsets[3], v);
			}
			public java.lang.Object max() {
				return getAttribute(type.generated_offsets[4]);
			}
			public void set_max(java.lang.Object v) {
				setAttribute(type.generated_offsets[4], v);
			}
		}
		public static final class Plot extends GreyCat.Object {
			public static final java.lang.String name = "util::Plot";

			public Plot(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Plot(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[115], attributes);
			}
		}
		public static final class Crypto extends GreyCat.Object {
			public static final java.lang.String name = "util::Crypto";

			public Crypto(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public Crypto(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[116], attributes);
			}
		}
		public static final class LogQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::LogQuantizer";

			public LogQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public LogQuantizer(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[117], attributes);
			}
			public java.lang.Object min() {
				return getAttribute(type.generated_offsets[0]);
			}
			public void set_min(java.lang.Object v) {
				setAttribute(type.generated_offsets[0], v);
			}
			public java.lang.Object max() {
				return getAttribute(type.generated_offsets[1]);
			}
			public void set_max(java.lang.Object v) {
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
		public static final class MultiQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::MultiQuantizer";

			public MultiQuantizer(greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}

			public MultiQuantizer(java.lang.Object... attributes) {
				super(GreyCat.DEFAULT.libs_by_name.get(std.name).mapped[118], attributes);
			}
			public core.Array<util.Quantizer> quantizers() {
				return (core.Array<util.Quantizer>) getAttribute(type.generated_offsets[0]);
			}
			public void set_quantizers(core.Array<util.Quantizer> v) {
				setAttribute(type.generated_offsets[0], v);
			}
		}
	}
	public static final class std extends GreyCat.Library {
		public static final java.lang.String name = "std";
		GreyCat.Type[] mapped = null;

		public java.lang.String name() {
			return name;
		}

		public void configure(java.util.Map<java.lang.String, GreyCat.Loader> loaders, java.util.Map<java.lang.String, GreyCat.Factory> factories) {
			factories.put(core.Table.name, core.Table::new);
			loaders.put(core.Table.name, core.Table::load);
			factories.put(core.TensorType.name, core.TensorType::new);
			factories.put(core.ErrorFrame.name, core.ErrorFrame::new);
			factories.put(core.Tensor.name, core.Tensor::new);
			loaders.put(core.Tensor.name, core.Tensor::load);
			factories.put(core.TimeZone.name, core.TimeZone::new);
			factories.put(core.String.name, core.String::new);
			loaders.put(core.String.name, core.String::load);
			factories.put(core.GeoPoly.name, core.GeoPoly::new);
			factories.put(core.t3f.name, core.t3f::new);
			loaders.put(core.t3f.name, core.t3f::load);
			factories.put(core.geo.name, core.geo::new);
			loaders.put(core.geo.name, core.geo::load);
			factories.put(core.field.name, core.field::new);
			loaders.put(core.field.name, core.field::load);
			factories.put(core.t2.name, core.t2::new);
			loaders.put(core.t2.name, core.t2::load);
			factories.put(core.Buffer.name, core.Buffer::new);
			loaders.put(core.Buffer.name, core.Buffer::load);
			factories.put(core.nodeTime.name, core.nodeTime::new);
			loaders.put(core.nodeTime.name, core.nodeTime::load);
			factories.put(core.nodeList.name, core.nodeList::new);
			loaders.put(core.nodeList.name, core.nodeList::load);
			factories.put(core.duration.name, core.duration::new);
			loaders.put(core.duration.name, core.duration::load);
			factories.put(core.ErrorCode.name, core.ErrorCode::new);
			factories.put(core.nodeTimeCursor.name, core.nodeTimeCursor::new);
			factories.put(core.NodeInfo.name, core.NodeInfo::new);
			factories.put(core.t2f.name, core.t2f::new);
			loaders.put(core.t2f.name, core.t2f::load);
			factories.put(core.t4f.name, core.t4f::new);
			loaders.put(core.t4f.name, core.t4f::load);
			factories.put(core.type.name, core.type::new);
			loaders.put(core.type.name, core.type::load);
			factories.put(core.SamplingMode.name, core.SamplingMode::new);
			factories.put(core.SortOrder.name, core.SortOrder::new);
			factories.put(core.Error.name, core.Error::new);
			factories.put(core.node.name, core.node::new);
			loaders.put(core.node.name, core.node::load);
			factories.put(core.CalendarUnit.name, core.CalendarUnit::new);
			factories.put(core.Tuple.name, core.Tuple::new);
			factories.put(core.time.name, core.time::new);
			loaders.put(core.time.name, core.time::load);
			factories.put(core.Map.name, core.Map::new);
			loaders.put(core.Map.name, core.Map::load);
			factories.put(core.nodeIndex.name, core.nodeIndex::new);
			loaders.put(core.nodeIndex.name, core.nodeIndex::load);
			factories.put(core.t3.name, core.t3::new);
			loaders.put(core.t3.name, core.t3::load);
			factories.put(core.DurationUnit.name, core.DurationUnit::new);
			factories.put(core.Array.name, core.Array::new);
			loaders.put(core.Array.name, core.Array::load);
			factories.put(core.FloatPrecision.name, core.FloatPrecision::new);
			factories.put(core.MathConstants.name, core.MathConstants::new);
			factories.put(core.str.name, core.str::new);
			loaders.put(core.str.name, core.str::load);
			factories.put(core.t4.name, core.t4::new);
			loaders.put(core.t4.name, core.t4::load);
			factories.put(core.nodeIndexBucket.name, core.nodeIndexBucket::new);
			factories.put(core.nodeGeo.name, core.nodeGeo::new);
			loaders.put(core.nodeGeo.name, core.nodeGeo::load);
			factories.put(core.function.name, core.function::new);
			loaders.put(core.function.name, core.function::load);
			factories.put(core.GeoBox.name, core.GeoBox::new);
			factories.put(core.TableColumnMapping.name, core.TableColumnMapping::new);
			factories.put(core.GeoCircle.name, core.GeoCircle::new);
			factories.put(core.Date.name, core.Date::new);
			factories.put(io.SmtpAuth.name, io.SmtpAuth::new);
			factories.put(io.Writer.name, io.Writer::new);
			factories.put(io.CsvSharding.name, io.CsvSharding::new);
			factories.put(io.Http.name, io.Http::new);
			factories.put(io.CsvColumnStatistics.name, io.CsvColumnStatistics::new);
			factories.put(io.Url.name, io.Url::new);
			factories.put(io.GcbReader.name, io.GcbReader::new);
			factories.put(io.TextWriter.name, io.TextWriter::new);
			factories.put(io.File.name, io.File::new);
			factories.put(io.SmtpMode.name, io.SmtpMode::new);
			factories.put(io.HttpHeader.name, io.HttpHeader::new);
			factories.put(io.GcbWriter.name, io.GcbWriter::new);
			factories.put(io.CsvReader.name, io.CsvReader::new);
			factories.put(io.CsvStatistics.name, io.CsvStatistics::new);
			factories.put(io.CsvAnalysisConfig.name, io.CsvAnalysisConfig::new);
			factories.put(io.CsvFormat.name, io.CsvFormat::new);
			factories.put(io.Email.name, io.Email::new);
			factories.put(io.FileWalker.name, io.FileWalker::new);
			factories.put(io.Json.name, io.Json::new);
			factories.put(io.CsvWriter.name, io.CsvWriter::new);
			factories.put(io.JsonReader.name, io.JsonReader::new);
			factories.put(io.TextReader.name, io.TextReader::new);
			factories.put(io.Reader.name, io.Reader::new);
			factories.put(io.XmlReader.name, io.XmlReader::new);
			factories.put(io.JsonWriter.name, io.JsonWriter::new);
			factories.put(io.Csv.name, io.Csv::new);
			factories.put(io.Smtp.name, io.Smtp::new);
			factories.put(runtime.TaskStatus.name, runtime.TaskStatus::new);
			factories.put(runtime.Debug.name, runtime.Debug::new);
			factories.put(runtime.UserGroupPolicy.name, runtime.UserGroupPolicy::new);
			factories.put(runtime.LogDataUsage.name, runtime.LogDataUsage::new);
			factories.put(runtime.SecurityFields.name, runtime.SecurityFields::new);
			factories.put(runtime.UserGroup.name, runtime.UserGroup::new);
			factories.put(runtime.Frame.name, runtime.Frame::new);
			factories.put(runtime.User.name, runtime.User::new);
			factories.put(runtime.System.name, runtime.System::new);
			factories.put(runtime.SecurityEntity.name, runtime.SecurityEntity::new);
			factories.put(runtime.Role.name, runtime.Role::new);
			factories.put(runtime.Job.name, runtime.Job::new);
			factories.put(runtime.Permission.name, runtime.Permission::new);
			factories.put(runtime.MergeStrategy.name, runtime.MergeStrategy::new);
			factories.put(runtime.UserCredential.name, runtime.UserCredential::new);
			factories.put(runtime.UserGroupPolicyType.name, runtime.UserGroupPolicyType::new);
			factories.put(runtime.Log.name, runtime.Log::new);
			factories.put(runtime.LicenseType.name, runtime.LicenseType::new);
			factories.put(runtime.SecurityPolicy.name, runtime.SecurityPolicy::new);
			factories.put(runtime.PeriodicTask.name, runtime.PeriodicTask::new);
			factories.put(runtime.License.name, runtime.License::new);
			factories.put(runtime.OpenIDConnect.name, runtime.OpenIDConnect::new);
			factories.put(runtime.Task.name, runtime.Task::new);
			factories.put(runtime.LogLevel.name, runtime.LogLevel::new);
			factories.put(runtime.Variable.name, runtime.Variable::new);
			factories.put(runtime.Runtime.name, runtime.Runtime::new);
			factories.put(runtime.RuntimeInfo.name, runtime.RuntimeInfo::new);
			factories.put(util.HistogramBin.name, util.HistogramBin::new);
			factories.put(util.TimeWindow.name, util.TimeWindow::new);
			factories.put(util.Stack.name, util.Stack::new);
			factories.put(util.LinearQuantizer.name, util.LinearQuantizer::new);
			factories.put(util.SlidingWindow.name, util.SlidingWindow::new);
			factories.put(util.GaussianProfile.name, util.GaussianProfile::new);
			factories.put(util.Quantizer.name, util.Quantizer::new);
			factories.put(util.HistogramStats.name, util.HistogramStats::new);
			factories.put(util.Random.name, util.Random::new);
			factories.put(util.CustomQuantizer.name, util.CustomQuantizer::new);
			factories.put(util.QuantizerSlotBound.name, util.QuantizerSlotBound::new);
			factories.put(util.Assert.name, util.Assert::new);
			factories.put(util.ProgressTracker.name, util.ProgressTracker::new);
			factories.put(util.GaussianProfileSlot.name, util.GaussianProfileSlot::new);
			factories.put(util.Histogram.name, util.Histogram::new);
			factories.put(util.Queue.name, util.Queue::new);
			factories.put(util.Gaussian.name, util.Gaussian::new);
			factories.put(util.Plot.name, util.Plot::new);
			factories.put(util.Crypto.name, util.Crypto::new);
			factories.put(util.LogQuantizer.name, util.LogQuantizer::new);
			factories.put(util.MultiQuantizer.name, util.MultiQuantizer::new);
		}
		public void init(GreyCat greycat) {
			mapped = new GreyCat.Type[119];
			mapped[0] = greycat.types_by_name.get(core.Table.name);
			mapped[1] = greycat.types_by_name.get(core.TensorType.name);
			if(this.mapped[1] != null){
				this.mapped[1].resolveGeneratedOffsetWithValues("i32", 4L,"i64", 8L,"f32", 4L,"f64", 8L,"c64", 8L,"c128", 16L);
			}
			mapped[2] = greycat.types_by_name.get(core.ErrorFrame.name);
			if(this.mapped[2] != null){
				this.mapped[2].resolveGeneratedOffsets("module","function","line","column");
			}
			mapped[3] = greycat.types_by_name.get(core.Tensor.name);
			mapped[4] = greycat.types_by_name.get(core.TimeZone.name);
			if(this.mapped[4] != null){
				this.mapped[4].resolveGeneratedOffsetWithValues("UTC", null,"Africa/Abidjan", null,"Africa/Accra", null,"Africa/Addis_Ababa", null,"Africa/Algiers", null,"Africa/Asmara", null,"Africa/Asmera", null,"Africa/Bamako", null,"Africa/Bangui", null,"Africa/Banjul", null,"Africa/Bissau", null,"Africa/Blantyre", null,"Africa/Brazzaville", null,"Africa/Bujumbura", null,"Africa/Cairo", null,"Africa/Casablanca", null,"Africa/Ceuta", null,"Africa/Conakry", null,"Africa/Dakar", null,"Africa/Dar_es_Salaam", null,"Africa/Djibouti", null,"Africa/Douala", null,"Africa/El_Aaiun", null,"Africa/Freetown", null,"Africa/Gaborone", null,"Africa/Harare", null,"Africa/Johannesburg", null,"Africa/Juba", null,"Africa/Kampala", null,"Africa/Khartoum", null,"Africa/Kigali", null,"Africa/Kinshasa", null,"Africa/Lagos", null,"Africa/Libreville", null,"Africa/Lome", null,"Africa/Luanda", null,"Africa/Lubumbashi", null,"Africa/Lusaka", null,"Africa/Malabo", null,"Africa/Maputo", null,"Africa/Maseru", null,"Africa/Mbabane", null,"Africa/Mogadishu", null,"Africa/Monrovia", null,"Africa/Nairobi", null,"Africa/Ndjamena", null,"Africa/Niamey", null,"Africa/Nouakchott", null,"Africa/Ouagadougou", null,"Africa/Porto-Novo", null,"Africa/Sao_Tome", null,"Africa/Timbuktu", null,"Africa/Tripoli", null,"Africa/Tunis", null,"Africa/Windhoek", null,"America/Adak", null,"America/Anchorage", null,"America/Anguilla", null,"America/Antigua", null,"America/Araguaina", null,"America/Argentina/Buenos_Aires", null,"America/Argentina/Catamarca", null,"America/Argentina/ComodRivadavia", null,"America/Argentina/Cordoba", null,"America/Argentina/Jujuy", null,"America/Argentina/La_Rioja", null,"America/Argentina/Mendoza", null,"America/Argentina/Rio_Gallegos", null,"America/Argentina/Salta", null,"America/Argentina/San_Juan", null,"America/Argentina/San_Luis", null,"America/Argentina/Tucuman", null,"America/Argentina/Ushuaia", null,"America/Aruba", null,"America/Asuncion", null,"America/Atikokan", null,"America/Atka", null,"America/Bahia", null,"America/Bahia_Banderas", null,"America/Barbados", null,"America/Belem", null,"America/Belize", null,"America/Blanc-Sablon", null,"America/Boa_Vista", null,"America/Bogota", null,"America/Boise", null,"America/Buenos_Aires", null,"America/Cambridge_Bay", null,"America/Campo_Grande", null,"America/Cancun", null,"America/Caracas", null,"America/Catamarca", null,"America/Cayenne", null,"America/Cayman", null,"America/Chicago", null,"America/Chihuahua", null,"America/Ciudad_Juarez", null,"America/Coral_Harbour", null,"America/Cordoba", null,"America/Costa_Rica", null,"America/Coyhaique", null,"America/Creston", null,"America/Cuiaba", null,"America/Curacao", null,"America/Danmarkshavn", null,"America/Dawson", null,"America/Dawson_Creek", null,"America/Denver", null,"America/Detroit", null,"America/Dominica", null,"America/Edmonton", null,"America/Eirunepe", null,"America/El_Salvador", null,"America/Ensenada", null,"America/Fort_Nelson", null,"America/Fort_Wayne", null,"America/Fortaleza", null,"America/Glace_Bay", null,"America/Godthab", null,"America/Goose_Bay", null,"America/Grand_Turk", null,"America/Grenada", null,"America/Guadeloupe", null,"America/Guatemala", null,"America/Guayaquil", null,"America/Guyana", null,"America/Halifax", null,"America/Havana", null,"America/Hermosillo", null,"America/Indiana/Indianapolis", null,"America/Indiana/Knox", null,"America/Indiana/Marengo", null,"America/Indiana/Petersburg", null,"America/Indiana/Tell_City", null,"America/Indiana/Vevay", null,"America/Indiana/Vincennes", null,"America/Indiana/Winamac", null,"America/Indianapolis", null,"America/Inuvik", null,"America/Iqaluit", null,"America/Jamaica", null,"America/Jujuy", null,"America/Juneau", null,"America/Kentucky/Louisville", null,"America/Kentucky/Monticello", null,"America/Knox_IN", null,"America/Kralendijk", null,"America/La_Paz", null,"America/Lima", null,"America/Los_Angeles", null,"America/Louisville", null,"America/Lower_Princes", null,"America/Maceio", null,"America/Managua", null,"America/Manaus", null,"America/Marigot", null,"America/Martinique", null,"America/Matamoros", null,"America/Mazatlan", null,"America/Mendoza", null,"America/Menominee", null,"America/Merida", null,"America/Metlakatla", null,"America/Mexico_City", null,"America/Miquelon", null,"America/Moncton", null,"America/Monterrey", null,"America/Montevideo", null,"America/Montreal", null,"America/Montserrat", null,"America/Nassau", null,"America/New_York", null,"America/Nipigon", null,"America/Nome", null,"America/Noronha", null,"America/North_Dakota/Beulah", null,"America/North_Dakota/Center", null,"America/North_Dakota/New_Salem", null,"America/Nuuk", null,"America/Ojinaga", null,"America/Panama", null,"America/Pangnirtung", null,"America/Paramaribo", null,"America/Phoenix", null,"America/Port-au-Prince", null,"America/Port_of_Spain", null,"America/Porto_Acre", null,"America/Porto_Velho", null,"America/Puerto_Rico", null,"America/Punta_Arenas", null,"America/Rainy_River", null,"America/Rankin_Inlet", null,"America/Recife", null,"America/Regina", null,"America/Resolute", null,"America/Rio_Branco", null,"America/Rosario", null,"America/Santa_Isabel", null,"America/Santarem", null,"America/Santiago", null,"America/Santo_Domingo", null,"America/Sao_Paulo", null,"America/Scoresbysund", null,"America/Shiprock", null,"America/Sitka", null,"America/St_Barthelemy", null,"America/St_Johns", null,"America/St_Kitts", null,"America/St_Lucia", null,"America/St_Thomas", null,"America/St_Vincent", null,"America/Swift_Current", null,"America/Tegucigalpa", null,"America/Thule", null,"America/Thunder_Bay", null,"America/Tijuana", null,"America/Toronto", null,"America/Tortola", null,"America/Vancouver", null,"America/Virgin", null,"America/Whitehorse", null,"America/Winnipeg", null,"America/Yakutat", null,"America/Yellowknife", null,"Antarctica/Casey", null,"Antarctica/Davis", null,"Antarctica/DumontDUrville", null,"Antarctica/Macquarie", null,"Antarctica/Mawson", null,"Antarctica/McMurdo", null,"Antarctica/Palmer", null,"Antarctica/Rothera", null,"Antarctica/South_Pole", null,"Antarctica/Syowa", null,"Antarctica/Troll", null,"Antarctica/Vostok", null,"Arctic/Longyearbyen", null,"Asia/Aden", null,"Asia/Almaty", null,"Asia/Amman", null,"Asia/Anadyr", null,"Asia/Aqtau", null,"Asia/Aqtobe", null,"Asia/Ashgabat", null,"Asia/Ashkhabad", null,"Asia/Atyrau", null,"Asia/Baghdad", null,"Asia/Bahrain", null,"Asia/Baku", null,"Asia/Bangkok", null,"Asia/Barnaul", null,"Asia/Beirut", null,"Asia/Bishkek", null,"Asia/Brunei", null,"Asia/Calcutta", null,"Asia/Chita", null,"Asia/Choibalsan", null,"Asia/Chongqing", null,"Asia/Chungking", null,"Asia/Colombo", null,"Asia/Dacca", null,"Asia/Damascus", null,"Asia/Dhaka", null,"Asia/Dili", null,"Asia/Dubai", null,"Asia/Dushanbe", null,"Asia/Famagusta", null,"Asia/Gaza", null,"Asia/Harbin", null,"Asia/Hebron", null,"Asia/Ho_Chi_Minh", null,"Asia/Hong_Kong", null,"Asia/Hovd", null,"Asia/Irkutsk", null,"Asia/Istanbul", null,"Asia/Jakarta", null,"Asia/Jayapura", null,"Asia/Jerusalem", null,"Asia/Kabul", null,"Asia/Kamchatka", null,"Asia/Karachi", null,"Asia/Kashgar", null,"Asia/Kathmandu", null,"Asia/Katmandu", null,"Asia/Khandyga", null,"Asia/Kolkata", null,"Asia/Krasnoyarsk", null,"Asia/Kuala_Lumpur", null,"Asia/Kuching", null,"Asia/Kuwait", null,"Asia/Macao", null,"Asia/Macau", null,"Asia/Magadan", null,"Asia/Makassar", null,"Asia/Manila", null,"Asia/Muscat", null,"Asia/Nicosia", null,"Asia/Novokuznetsk", null,"Asia/Novosibirsk", null,"Asia/Omsk", null,"Asia/Oral", null,"Asia/Phnom_Penh", null,"Asia/Pontianak", null,"Asia/Pyongyang", null,"Asia/Qatar", null,"Asia/Qostanay", null,"Asia/Qyzylorda", null,"Asia/Rangoon", null,"Asia/Riyadh", null,"Asia/Saigon", null,"Asia/Sakhalin", null,"Asia/Samarkand", null,"Asia/Seoul", null,"Asia/Shanghai", null,"Asia/Singapore", null,"Asia/Srednekolymsk", null,"Asia/Taipei", null,"Asia/Tashkent", null,"Asia/Tbilisi", null,"Asia/Tehran", null,"Asia/Tel_Aviv", null,"Asia/Thimbu", null,"Asia/Thimphu", null,"Asia/Tokyo", null,"Asia/Tomsk", null,"Asia/Ujung_Pandang", null,"Asia/Ulaanbaatar", null,"Asia/Ulan_Bator", null,"Asia/Urumqi", null,"Asia/Ust-Nera", null,"Asia/Vientiane", null,"Asia/Vladivostok", null,"Asia/Yakutsk", null,"Asia/Yangon", null,"Asia/Yekaterinburg", null,"Asia/Yerevan", null,"Atlantic/Azores", null,"Atlantic/Bermuda", null,"Atlantic/Canary", null,"Atlantic/Cape_Verde", null,"Atlantic/Faeroe", null,"Atlantic/Faroe", null,"Atlantic/Jan_Mayen", null,"Atlantic/Madeira", null,"Atlantic/Reykjavik", null,"Atlantic/South_Georgia", null,"Atlantic/St_Helena", null,"Atlantic/Stanley", null,"Australia/ACT", null,"Australia/Adelaide", null,"Australia/Brisbane", null,"Australia/Broken_Hill", null,"Australia/Canberra", null,"Australia/Currie", null,"Australia/Darwin", null,"Australia/Eucla", null,"Australia/Hobart", null,"Australia/LHI", null,"Australia/Lindeman", null,"Australia/Lord_Howe", null,"Australia/Melbourne", null,"Australia/NSW", null,"Australia/North", null,"Australia/Perth", null,"Australia/Queensland", null,"Australia/South", null,"Australia/Sydney", null,"Australia/Tasmania", null,"Australia/Victoria", null,"Australia/West", null,"Australia/Yancowinna", null,"Brazil/Acre", null,"Brazil/DeNoronha", null,"Brazil/East", null,"Brazil/West", null,"CET", null,"CST6CDT", null,"Canada/Atlantic", null,"Canada/Central", null,"Canada/Eastern", null,"Canada/Mountain", null,"Canada/Newfoundland", null,"Canada/Pacific", null,"Canada/Saskatchewan", null,"Canada/Yukon", null,"Chile/Continental", null,"Chile/EasterIsland", null,"Cuba", null,"EET", null,"EST", null,"EST5EDT", null,"Egypt", null,"Eire", null,"Etc/GMT", null,"Etc/GMT+0", null,"Etc/GMT+1", null,"Etc/GMT+10", null,"Etc/GMT+11", null,"Etc/GMT+12", null,"Etc/GMT+2", null,"Etc/GMT+3", null,"Etc/GMT+4", null,"Etc/GMT+5", null,"Etc/GMT+6", null,"Etc/GMT+7", null,"Etc/GMT+8", null,"Etc/GMT+9", null,"Etc/GMT-0", null,"Etc/GMT-1", null,"Etc/GMT-10", null,"Etc/GMT-11", null,"Etc/GMT-12", null,"Etc/GMT-13", null,"Etc/GMT-14", null,"Etc/GMT-2", null,"Etc/GMT-3", null,"Etc/GMT-4", null,"Etc/GMT-5", null,"Etc/GMT-6", null,"Etc/GMT-7", null,"Etc/GMT-8", null,"Etc/GMT-9", null,"Etc/GMT0", null,"Etc/Greenwich", null,"Etc/UCT", null,"Etc/UTC", null,"Etc/Universal", null,"Etc/Zulu", null,"Europe/Amsterdam", null,"Europe/Andorra", null,"Europe/Astrakhan", null,"Europe/Athens", null,"Europe/Belfast", null,"Europe/Belgrade", null,"Europe/Berlin", null,"Europe/Bratislava", null,"Europe/Brussels", null,"Europe/Bucharest", null,"Europe/Budapest", null,"Europe/Busingen", null,"Europe/Chisinau", null,"Europe/Copenhagen", null,"Europe/Dublin", null,"Europe/Gibraltar", null,"Europe/Guernsey", null,"Europe/Helsinki", null,"Europe/Isle_of_Man", null,"Europe/Istanbul", null,"Europe/Jersey", null,"Europe/Kaliningrad", null,"Europe/Kiev", null,"Europe/Kirov", null,"Europe/Kyiv", null,"Europe/Lisbon", null,"Europe/Ljubljana", null,"Europe/London", null,"Europe/Luxembourg", null,"Europe/Madrid", null,"Europe/Malta", null,"Europe/Mariehamn", null,"Europe/Minsk", null,"Europe/Monaco", null,"Europe/Moscow", null,"Europe/Nicosia", null,"Europe/Oslo", null,"Europe/Paris", null,"Europe/Podgorica", null,"Europe/Prague", null,"Europe/Riga", null,"Europe/Rome", null,"Europe/Samara", null,"Europe/San_Marino", null,"Europe/Sarajevo", null,"Europe/Saratov", null,"Europe/Simferopol", null,"Europe/Skopje", null,"Europe/Sofia", null,"Europe/Stockholm", null,"Europe/Tallinn", null,"Europe/Tirane", null,"Europe/Tiraspol", null,"Europe/Ulyanovsk", null,"Europe/Uzhgorod", null,"Europe/Vaduz", null,"Europe/Vatican", null,"Europe/Vienna", null,"Europe/Vilnius", null,"Europe/Volgograd", null,"Europe/Warsaw", null,"Europe/Zagreb", null,"Europe/Zaporozhye", null,"Europe/Zurich", null,"Factory", null,"GB", null,"GB-Eire", null,"GMT", null,"GMT+0", null,"GMT-0", null,"GMT0", null,"Greenwich", null,"HST", null,"Hongkong", null,"Iceland", null,"Indian/Antananarivo", null,"Indian/Chagos", null,"Indian/Christmas", null,"Indian/Cocos", null,"Indian/Comoro", null,"Indian/Kerguelen", null,"Indian/Mahe", null,"Indian/Maldives", null,"Indian/Mauritius", null,"Indian/Mayotte", null,"Indian/Reunion", null,"Iran", null,"Israel", null,"Jamaica", null,"Japan", null,"Kwajalein", null,"Libya", null,"MET", null,"MST", null,"MST7MDT", null,"Mexico/BajaNorte", null,"Mexico/BajaSur", null,"Mexico/General", null,"NZ", null,"NZ-CHAT", null,"Navajo", null,"PRC", null,"PST8PDT", null,"Pacific/Apia", null,"Pacific/Auckland", null,"Pacific/Bougainville", null,"Pacific/Chatham", null,"Pacific/Chuuk", null,"Pacific/Easter", null,"Pacific/Efate", null,"Pacific/Enderbury", null,"Pacific/Fakaofo", null,"Pacific/Fiji", null,"Pacific/Funafuti", null,"Pacific/Galapagos", null,"Pacific/Gambier", null,"Pacific/Guadalcanal", null,"Pacific/Guam", null,"Pacific/Honolulu", null,"Pacific/Johnston", null,"Pacific/Kanton", null,"Pacific/Kiritimati", null,"Pacific/Kosrae", null,"Pacific/Kwajalein", null,"Pacific/Majuro", null,"Pacific/Marquesas", null,"Pacific/Midway", null,"Pacific/Nauru", null,"Pacific/Niue", null,"Pacific/Norfolk", null,"Pacific/Noumea", null,"Pacific/Pago_Pago", null,"Pacific/Palau", null,"Pacific/Pitcairn", null,"Pacific/Pohnpei", null,"Pacific/Ponape", null,"Pacific/Port_Moresby", null,"Pacific/Rarotonga", null,"Pacific/Saipan", null,"Pacific/Samoa", null,"Pacific/Tahiti", null,"Pacific/Tarawa", null,"Pacific/Tongatapu", null,"Pacific/Truk", null,"Pacific/Wake", null,"Pacific/Wallis", null,"Pacific/Yap", null,"Poland", null,"Portugal", null,"ROC", null,"ROK", null,"Singapore", null,"Turkey", null,"UCT", null,"US/Alaska", null,"US/Aleutian", null,"US/Arizona", null,"US/Central", null,"US/East-Indiana", null,"US/Eastern", null,"US/Hawaii", null,"US/Indiana-Starke", null,"US/Michigan", null,"US/Mountain", null,"US/Pacific", null,"US/Samoa", null,"Universal", null,"W-SU", null,"WET", null,"Zulu", null);
			}
			mapped[5] = greycat.types_by_name.get(core.String.name);
			mapped[6] = greycat.types_by_name.get(core.GeoPoly.name);
			if(this.mapped[6] != null){
				this.mapped[6].resolveGeneratedOffsets("points");
			}
			mapped[7] = greycat.types_by_name.get(core.t3f.name);
			mapped[8] = greycat.types_by_name.get(core.geo.name);
			if(this.mapped[8] != null){
				this.mapped[8].static_values = new java.lang.Object[]{greycat.createGeo(java.lang.Double.longBitsToDouble(-4587686678796158022L),java.lang.Double.longBitsToDouble(-4582834833316020224L)),greycat.createGeo(java.lang.Double.longBitsToDouble(4635685358058617786L),java.lang.Double.longBitsToDouble(4640537203538755584L))};
			}
			mapped[9] = greycat.types_by_name.get(core.field.name);
			mapped[10] = greycat.types_by_name.get(core.t2.name);
			mapped[11] = greycat.types_by_name.get(core.Buffer.name);
			mapped[12] = greycat.types_by_name.get(core.nodeTime.name);
			mapped[13] = greycat.types_by_name.get(core.nodeList.name);
			mapped[14] = greycat.types_by_name.get(core.duration.name);
			mapped[15] = greycat.types_by_name.get(core.ErrorCode.name);
			if(this.mapped[15] != null){
				this.mapped[15].resolveGeneratedOffsetWithValues("none", 0L,"interrupted", 1L,"await", 2L,"timeout", 6L,"forbidden", 7L,"runtime_error", 8L);
			}
			mapped[16] = greycat.types_by_name.get(core.nodeTimeCursor.name);
			if(this.mapped[16] != null){
				this.mapped[16].resolveGeneratedOffsets("n","req_time");
			}
			mapped[17] = greycat.types_by_name.get(core.NodeInfo.name);
			if(this.mapped[17] != null){
				this.mapped[17].resolveGeneratedOffsets("size","from","to");
			}
			mapped[18] = greycat.types_by_name.get(core.t2f.name);
			mapped[19] = greycat.types_by_name.get(core.t4f.name);
			mapped[20] = greycat.types_by_name.get(core.type.name);
			mapped[21] = greycat.types_by_name.get(core.SamplingMode.name);
			if(this.mapped[21] != null){
				this.mapped[21].resolveGeneratedOffsetWithValues("fixed", 0L,"fixed_reg", 1L,"adaptative", 2L,"dense", 3L);
			}
			mapped[22] = greycat.types_by_name.get(core.SortOrder.name);
			if(this.mapped[22] != null){
				this.mapped[22].resolveGeneratedOffsetWithValues("asc", null,"desc", null);
			}
			mapped[23] = greycat.types_by_name.get(core.Error.name);
			if(this.mapped[23] != null){
				this.mapped[23].resolveGeneratedOffsets("message","stack");
			}
			mapped[24] = greycat.types_by_name.get(core.node.name);
			mapped[25] = greycat.types_by_name.get(core.CalendarUnit.name);
			if(this.mapped[25] != null){
				this.mapped[25].resolveGeneratedOffsetWithValues("year", 0L,"month", 1L,"day", 2L,"hour", 3L,"minute", 4L,"second", 5L,"microsecond", 6L);
			}
			mapped[26] = greycat.types_by_name.get(core.Tuple.name);
			if(this.mapped[26] != null){
				this.mapped[26].resolveGeneratedOffsets("x","y");
			}
			mapped[27] = greycat.types_by_name.get(core.time.name);
			if(this.mapped[27] != null){
				this.mapped[27].static_values = new java.lang.Object[]{greycat.createTime(-9223372036854775808L),greycat.createTime(9223372036854775807L)};
			}
			mapped[28] = greycat.types_by_name.get(core.Map.name);
			mapped[29] = greycat.types_by_name.get(core.nodeIndex.name);
			mapped[30] = greycat.types_by_name.get(core.t3.name);
			mapped[31] = greycat.types_by_name.get(core.DurationUnit.name);
			if(this.mapped[31] != null){
				this.mapped[31].resolveGeneratedOffsetWithValues("microseconds", 1L,"milliseconds", 1000L,"seconds", 1000000L,"minutes", 60000000L,"hours", 3600000000L,"days", 86400000000L);
			}
			mapped[32] = greycat.types_by_name.get(core.Array.name);
			mapped[33] = greycat.types_by_name.get(core.FloatPrecision.name);
			if(this.mapped[33] != null){
				this.mapped[33].resolveGeneratedOffsetWithValues("p1", java.lang.Double.longBitsToDouble(4607182418800017408L),"p10", java.lang.Double.longBitsToDouble(4591870180066957722L),"p100", java.lang.Double.longBitsToDouble(4576918229304087675L),"p1000", java.lang.Double.longBitsToDouble(4562254508917369340L),"p10000", java.lang.Double.longBitsToDouble(4547007122018943789L),"p100000", java.lang.Double.longBitsToDouble(4532020583610935537L),"p1000000", java.lang.Double.longBitsToDouble(4517329193108106637L),"p10000000", java.lang.Double.longBitsToDouble(4502148214488346440L),"p100000000", java.lang.Double.longBitsToDouble(4487126258331716666L),"p1000000000", java.lang.Double.longBitsToDouble(4472406533629990549L),"p10000000000", java.lang.Double.longBitsToDouble(4457293557087583675L));
			}
			mapped[34] = greycat.types_by_name.get(core.MathConstants.name);
			if(this.mapped[34] != null){
				this.mapped[34].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4613303445314885482L),java.lang.Double.longBitsToDouble(4609176140021203710L),java.lang.Double.longBitsToDouble(4601495173785380111L),java.lang.Double.longBitsToDouble(4604418534313441775L),java.lang.Double.longBitsToDouble(4612367379483415830L),java.lang.Double.longBitsToDouble(4614256656552045848L),java.lang.Double.longBitsToDouble(4609753056924675352L),java.lang.Double.longBitsToDouble(4605249457297304857L),java.lang.Double.longBitsToDouble(4599405781057128578L),java.lang.Double.longBitsToDouble(4603909380684499074L),java.lang.Double.longBitsToDouble(4607760587169110893L),java.lang.Double.longBitsToDouble(4609047870845172685L),java.lang.Double.longBitsToDouble(4604544271217802190L)};
			}
			mapped[35] = greycat.types_by_name.get(core.str.name);
			mapped[36] = greycat.types_by_name.get(core.t4.name);
			mapped[37] = greycat.types_by_name.get(core.nodeIndexBucket.name);
			if(this.mapped[37] != null){
				this.mapped[37].resolveGeneratedOffsets("key","value","next");
			}
			mapped[38] = greycat.types_by_name.get(core.nodeGeo.name);
			mapped[39] = greycat.types_by_name.get(core.function.name);
			mapped[40] = greycat.types_by_name.get(core.GeoBox.name);
			if(this.mapped[40] != null){
				this.mapped[40].resolveGeneratedOffsets("sw","ne");
			}
			mapped[41] = greycat.types_by_name.get(core.TableColumnMapping.name);
			if(this.mapped[41] != null){
				this.mapped[41].resolveGeneratedOffsets("column","extractors");
			}
			mapped[42] = greycat.types_by_name.get(core.GeoCircle.name);
			if(this.mapped[42] != null){
				this.mapped[42].resolveGeneratedOffsets("center","radius");
			}
			mapped[43] = greycat.types_by_name.get(core.Date.name);
			if(this.mapped[43] != null){
				this.mapped[43].resolveGeneratedOffsets("year","month","day","hour","minute","second","microsecond");
			}
			mapped[44] = greycat.types_by_name.get(io.SmtpAuth.name);
			if(this.mapped[44] != null){
				this.mapped[44].resolveGeneratedOffsetWithValues("none", 0L,"plain", 1L,"login", 2L);
			}
			mapped[45] = greycat.types_by_name.get(io.Writer.name);
			if(this.mapped[45] != null){
				this.mapped[45].resolveGeneratedOffsets("path","append");
			}
			mapped[46] = greycat.types_by_name.get(io.CsvSharding.name);
			if(this.mapped[46] != null){
				this.mapped[46].resolveGeneratedOffsets("id","column","modulo");
			}
			mapped[47] = greycat.types_by_name.get(io.Http.name);
			mapped[48] = greycat.types_by_name.get(io.CsvColumnStatistics.name);
			if(this.mapped[48] != null){
				this.mapped[48].resolveGeneratedOffsets("name","example","null_count","bool_count","int_count","float_count","string_count","date_count","date_format_count","enumerable_count","profile");
			}
			mapped[49] = greycat.types_by_name.get(io.Url.name);
			if(this.mapped[49] != null){
				this.mapped[49].resolveGeneratedOffsets("protocol","host","port","path","params","hash");
			}
			mapped[50] = greycat.types_by_name.get(io.GcbReader.name);
			if(this.mapped[50] != null){
				this.mapped[50].resolveGeneratedOffsets("path","pos");
			}
			mapped[51] = greycat.types_by_name.get(io.TextWriter.name);
			if(this.mapped[51] != null){
				this.mapped[51].resolveGeneratedOffsets("path","append");
			}
			mapped[52] = greycat.types_by_name.get(io.File.name);
			if(this.mapped[52] != null){
				this.mapped[52].resolveGeneratedOffsets("path","size","last_modification");
			}
			mapped[53] = greycat.types_by_name.get(io.SmtpMode.name);
			if(this.mapped[53] != null){
				this.mapped[53].resolveGeneratedOffsetWithValues("plain", 0L,"ssl_tls", 1L,"starttls", 2L);
			}
			mapped[54] = greycat.types_by_name.get(io.HttpHeader.name);
			if(this.mapped[54] != null){
				this.mapped[54].resolveGeneratedOffsets("name","value");
			}
			mapped[55] = greycat.types_by_name.get(io.GcbWriter.name);
			if(this.mapped[55] != null){
				this.mapped[55].resolveGeneratedOffsets("path","append");
			}
			mapped[56] = greycat.types_by_name.get(io.CsvReader.name);
			if(this.mapped[56] != null){
				this.mapped[56].resolveGeneratedOffsets("path","pos","format","sharding");
			}
			mapped[57] = greycat.types_by_name.get(io.CsvStatistics.name);
			if(this.mapped[57] != null){
				this.mapped[57].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","columns","line_count","fail_count","file_count");
			}
			mapped[58] = greycat.types_by_name.get(io.CsvAnalysisConfig.name);
			if(this.mapped[58] != null){
				this.mapped[58].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","row_limit","enumerable_limit","date_check_limit","date_formats");
			}
			if(this.mapped[58] != null){
				this.mapped[58].static_values = new java.lang.Object[]{100L,100L};
			}
			mapped[59] = greycat.types_by_name.get(io.CsvFormat.name);
			if(this.mapped[59] != null){
				this.mapped[59].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","trim","format","tz","strict","nearest_time");
			}
			mapped[60] = greycat.types_by_name.get(io.Email.name);
			if(this.mapped[60] != null){
				this.mapped[60].resolveGeneratedOffsets("from","subject","body","body_is_html","to","cc","bcc");
			}
			mapped[61] = greycat.types_by_name.get(io.FileWalker.name);
			if(this.mapped[61] != null){
				this.mapped[61].resolveGeneratedOffsets("path");
			}
			mapped[62] = greycat.types_by_name.get(io.Json.name);
			mapped[63] = greycat.types_by_name.get(io.CsvWriter.name);
			if(this.mapped[63] != null){
				this.mapped[63].resolveGeneratedOffsets("path","append","format");
			}
			mapped[64] = greycat.types_by_name.get(io.JsonReader.name);
			if(this.mapped[64] != null){
				this.mapped[64].resolveGeneratedOffsets("path","pos");
			}
			mapped[65] = greycat.types_by_name.get(io.TextReader.name);
			if(this.mapped[65] != null){
				this.mapped[65].resolveGeneratedOffsets("path","pos");
			}
			mapped[66] = greycat.types_by_name.get(io.Reader.name);
			if(this.mapped[66] != null){
				this.mapped[66].resolveGeneratedOffsets("path","pos");
			}
			mapped[67] = greycat.types_by_name.get(io.XmlReader.name);
			if(this.mapped[67] != null){
				this.mapped[67].resolveGeneratedOffsets("path","pos");
			}
			mapped[68] = greycat.types_by_name.get(io.JsonWriter.name);
			if(this.mapped[68] != null){
				this.mapped[68].resolveGeneratedOffsets("path","append");
			}
			mapped[69] = greycat.types_by_name.get(io.Csv.name);
			mapped[70] = greycat.types_by_name.get(io.Smtp.name);
			if(this.mapped[70] != null){
				this.mapped[70].resolveGeneratedOffsets("host","port","mode","authenticate","user","pass");
			}
			mapped[71] = greycat.types_by_name.get(runtime.TaskStatus.name);
			if(this.mapped[71] != null){
				this.mapped[71].resolveGeneratedOffsetWithValues("empty", null,"waiting", null,"running", null,"await", null,"cancelled", null,"error", null,"ended", null,"ended_with_errors", null);
			}
			mapped[72] = greycat.types_by_name.get(runtime.Debug.name);
			if(this.mapped[72] != null){
				this.mapped[72].resolveGeneratedOffsets("id","frames","root");
			}
			mapped[73] = greycat.types_by_name.get(runtime.UserGroupPolicy.name);
			if(this.mapped[73] != null){
				this.mapped[73].resolveGeneratedOffsets("group_id","type");
			}
			mapped[74] = greycat.types_by_name.get(runtime.LogDataUsage.name);
			if(this.mapped[74] != null){
				this.mapped[74].resolveGeneratedOffsets("read_bytes","read_hits","read_wasted","write_bytes","write_hits","cache_bytes","cache_hits");
			}
			mapped[75] = greycat.types_by_name.get(runtime.SecurityFields.name);
			if(this.mapped[75] != null){
				this.mapped[75].resolveGeneratedOffsets("email","name","first_name","last_name","roles","groups");
			}
			mapped[76] = greycat.types_by_name.get(runtime.UserGroup.name);
			if(this.mapped[76] != null){
				this.mapped[76].resolveGeneratedOffsets("id","name","activated");
			}
			mapped[77] = greycat.types_by_name.get(runtime.Frame.name);
			if(this.mapped[77] != null){
				this.mapped[77].resolveGeneratedOffsets("module","type","function","src","line","column","scope");
			}
			mapped[78] = greycat.types_by_name.get(runtime.User.name);
			if(this.mapped[78] != null){
				this.mapped[78].resolveGeneratedOffsets("id","name","activated","full_name","email","role","groups","groups_flags","external");
			}
			mapped[79] = greycat.types_by_name.get(runtime.System.name);
			mapped[80] = greycat.types_by_name.get(runtime.SecurityEntity.name);
			if(this.mapped[80] != null){
				this.mapped[80].resolveGeneratedOffsets("id","name","activated");
			}
			mapped[81] = greycat.types_by_name.get(runtime.Role.name);
			if(this.mapped[81] != null){
				this.mapped[81].resolveGeneratedOffsets("name","permissions");
			}
			mapped[82] = greycat.types_by_name.get(runtime.Job.name);
			if(this.mapped[82] != null){
				this.mapped[82].resolveGeneratedOffsets("function","arguments");
			}
			mapped[83] = greycat.types_by_name.get(runtime.Permission.name);
			if(this.mapped[83] != null){
				this.mapped[83].resolveGeneratedOffsets("name","description");
			}
			mapped[84] = greycat.types_by_name.get(runtime.MergeStrategy.name);
			if(this.mapped[84] != null){
				this.mapped[84].resolveGeneratedOffsetWithValues("strict", null,"first_wins", null,"last_wins", null);
			}
			mapped[85] = greycat.types_by_name.get(runtime.UserCredential.name);
			if(this.mapped[85] != null){
				this.mapped[85].resolveGeneratedOffsets("offset","pass");
			}
			mapped[86] = greycat.types_by_name.get(runtime.UserGroupPolicyType.name);
			if(this.mapped[86] != null){
				this.mapped[86].resolveGeneratedOffsetWithValues("read", null,"write", null,"execute", null);
			}
			mapped[87] = greycat.types_by_name.get(runtime.Log.name);
			if(this.mapped[87] != null){
				this.mapped[87].resolveGeneratedOffsets("level","time","user_id","id","id2","src","data");
			}
			mapped[88] = greycat.types_by_name.get(runtime.LicenseType.name);
			if(this.mapped[88] != null){
				this.mapped[88].resolveGeneratedOffsetWithValues("community", null,"enterprise", null,"testing", null);
			}
			mapped[89] = greycat.types_by_name.get(runtime.SecurityPolicy.name);
			if(this.mapped[89] != null){
				this.mapped[89].resolveGeneratedOffsets("entities","credentials","fields","keys","keys_last_refresh");
			}
			mapped[90] = greycat.types_by_name.get(runtime.PeriodicTask.name);
			if(this.mapped[90] != null){
				this.mapped[90].resolveGeneratedOffsets("function","user_id","arguments","start","every");
			}
			mapped[91] = greycat.types_by_name.get(runtime.License.name);
			if(this.mapped[91] != null){
				this.mapped[91].resolveGeneratedOffsets("name","start","end","company","max_memory","extra_1","extra_2","type");
			}
			mapped[92] = greycat.types_by_name.get(runtime.OpenIDConnect.name);
			if(this.mapped[92] != null){
				this.mapped[92].resolveGeneratedOffsets("url","clientId");
			}
			mapped[93] = greycat.types_by_name.get(runtime.Task.name);
			if(this.mapped[93] != null){
				this.mapped[93].resolveGeneratedOffsets("user_id","task_id","mod","type","fun","creation","start","duration","status","progress");
			}
			mapped[94] = greycat.types_by_name.get(runtime.LogLevel.name);
			if(this.mapped[94] != null){
				this.mapped[94].resolveGeneratedOffsetWithValues("error", null,"warn", null,"info", null,"perf", null,"trace", null);
			}
			mapped[95] = greycat.types_by_name.get(runtime.Variable.name);
			if(this.mapped[95] != null){
				this.mapped[95].resolveGeneratedOffsets("name","value");
			}
			mapped[96] = greycat.types_by_name.get(runtime.Runtime.name);
			mapped[97] = greycat.types_by_name.get(runtime.RuntimeInfo.name);
			if(this.mapped[97] != null){
				this.mapped[97].resolveGeneratedOffsets("version","program_version","arch","timezone","license","io_threads","bg_threads","fg_threads","mem_total","mem_worker","disk_data_bytes");
			}
			mapped[98] = greycat.types_by_name.get(util.HistogramBin.name);
			if(this.mapped[98] != null){
				this.mapped[98].resolveGeneratedOffsets("bin","count","ratio","cumulative_count","cumulative_ratio");
			}
			mapped[99] = greycat.types_by_name.get(util.TimeWindow.name);
			if(this.mapped[99] != null){
				this.mapped[99].resolveGeneratedOffsets("values","span","sum","sumsq","field");
			}
			mapped[100] = greycat.types_by_name.get(util.Stack.name);
			if(this.mapped[100] != null){
				this.mapped[100].resolveGeneratedOffsets("values");
			}
			mapped[101] = greycat.types_by_name.get(util.LinearQuantizer.name);
			if(this.mapped[101] != null){
				this.mapped[101].resolveGeneratedOffsets("min","max","bins","open");
			}
			mapped[102] = greycat.types_by_name.get(util.SlidingWindow.name);
			if(this.mapped[102] != null){
				this.mapped[102].resolveGeneratedOffsets("values","span","sum","sumsq","field");
			}
			mapped[103] = greycat.types_by_name.get(util.GaussianProfile.name);
			if(this.mapped[103] != null){
				this.mapped[103].resolveGeneratedOffsets("quantizer","precision","bins","value_min","nb_rejected");
			}
			mapped[104] = greycat.types_by_name.get(util.Quantizer.name);
			mapped[105] = greycat.types_by_name.get(util.HistogramStats.name);
			if(this.mapped[105] != null){
				this.mapped[105].resolveGeneratedOffsets("min","max","whisker_low","whisker_high","percentile1","percentile5","percentile10","percentile20","percentile25","percentile50","percentile75","percentile80","percentile90","percentile95","percentile99","sum","avg","std","size");
			}
			mapped[106] = greycat.types_by_name.get(util.Random.name);
			if(this.mapped[106] != null){
				this.mapped[106].resolveGeneratedOffsets("seed","v");
			}
			mapped[107] = greycat.types_by_name.get(util.CustomQuantizer.name);
			if(this.mapped[107] != null){
				this.mapped[107].resolveGeneratedOffsets("min","max","step_starts","open");
			}
			mapped[108] = greycat.types_by_name.get(util.QuantizerSlotBound.name);
			if(this.mapped[108] != null){
				this.mapped[108].resolveGeneratedOffsets("min","max","center");
			}
			mapped[109] = greycat.types_by_name.get(util.Assert.name);
			mapped[110] = greycat.types_by_name.get(util.ProgressTracker.name);
			if(this.mapped[110] != null){
				this.mapped[110].resolveGeneratedOffsets("start","total","counter","duration","progress","speed","remaining");
			}
			mapped[111] = greycat.types_by_name.get(util.GaussianProfileSlot.name);
			if(this.mapped[111] != null){
				this.mapped[111].resolveGeneratedOffsets("sum","sumsq","count");
			}
			mapped[112] = greycat.types_by_name.get(util.Histogram.name);
			if(this.mapped[112] != null){
				this.mapped[112].resolveGeneratedOffsets("quantizer","bins","nb_rejected","nb_accepted","min","max","sum","sumsq");
			}
			mapped[113] = greycat.types_by_name.get(util.Queue.name);
			if(this.mapped[113] != null){
				this.mapped[113].resolveGeneratedOffsets("values","capacity");
			}
			mapped[114] = greycat.types_by_name.get(util.Gaussian.name);
			if(this.mapped[114] != null){
				this.mapped[114].resolveGeneratedOffsets("sum","sumsq","count","min","max");
			}
			mapped[115] = greycat.types_by_name.get(util.Plot.name);
			mapped[116] = greycat.types_by_name.get(util.Crypto.name);
			mapped[117] = greycat.types_by_name.get(util.LogQuantizer.name);
			if(this.mapped[117] != null){
				this.mapped[117].resolveGeneratedOffsets("min","max","bins","open");
			}
			mapped[118] = greycat.types_by_name.get(util.MultiQuantizer.name);
			if(this.mapped[118] != null){
				this.mapped[118].resolveGeneratedOffsets("quantizers");
			}
		}
	}
}
