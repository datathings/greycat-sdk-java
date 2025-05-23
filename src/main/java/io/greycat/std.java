// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package io.greycat;
@SuppressWarnings({"unused", "unchecked"})
public final class std extends GreyCat.Library {
	public static final java.lang.String name = "std";
	@Override
	public String name() {
		return name;
	}
	public static final class core {
		public static final class ErrorCode extends GreyCat.Enum {
			public static final java.lang.String name = "core::ErrorCode";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("none", 0);
				put("interrupted", 1);
				put("await", 2);
				put("timeout", 3);
				put("forbidden", 4);
				put("runtime_error", 5);
			}});
			private ErrorCode(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ErrorCode get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static ErrorCode get(java.lang.String key, GreyCat greycat) {
				return (ErrorCode) greycat.libs_by_name.get(std.name).mapped[0].enum_values[indicesByValue.get(key)];
			}
			public ErrorCode(){
				this(GreyCat.DEFAULT);
			}
			public ErrorCode(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[0]);
			}
		}
		public static final class t4 extends std_n.core.t4 {
			public static final java.lang.String name = "core::t4";
			private t4(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public t4(){
				this(GreyCat.DEFAULT);
			}
			public t4(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[1]);
			}
		}
		public static final class Table<T> extends std_n.core.Table<T> {
			public static final java.lang.String name = "core::Table";
			private Table(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public Table(){
				this(GreyCat.DEFAULT);
			}
			public Table(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[2]);
			}
		}
		public static final class t3 extends std_n.core.t3 {
			public static final java.lang.String name = "core::t3";
			private t3(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public t3(){
				this(GreyCat.DEFAULT);
			}
			public t3(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[3]);
			}
		}
		public static final class nodeIndex<K,V> extends std_n.core.nodeIndex<K,V> {
			public static final java.lang.String name = "core::nodeIndex";
			private nodeIndex(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public nodeIndex(){
				this(GreyCat.DEFAULT);
			}
			public nodeIndex(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[4]);
			}
		}
		public static final class GeoCircle extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoCircle";
			private GeoCircle(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.geo center(){
				return (std.core.geo) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_center(std.core.geo v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Double radius(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_radius(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public GeoCircle(std.core.geo center, java.lang.Double radius){
				this(GreyCat.DEFAULT, center, radius);
			}
			public GeoCircle(GreyCat greycat, std.core.geo center, java.lang.Double radius){
				this(greycat.libs_by_name.get(std.name).mapped[5], center, radius);
			}
		}
		public static final class TimeZone extends GreyCat.Enum {
			public static final java.lang.String name = "core::TimeZone";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("UTC", 0);
				put("Africa/Abidjan", 1);
				put("Africa/Accra", 2);
				put("Africa/Addis_Ababa", 3);
				put("Africa/Algiers", 4);
				put("Africa/Asmara", 5);
				put("Africa/Asmera", 6);
				put("Africa/Bamako", 7);
				put("Africa/Bangui", 8);
				put("Africa/Banjul", 9);
				put("Africa/Bissau", 10);
				put("Africa/Blantyre", 11);
				put("Africa/Brazzaville", 12);
				put("Africa/Bujumbura", 13);
				put("Africa/Cairo", 14);
				put("Africa/Casablanca", 15);
				put("Africa/Ceuta", 16);
				put("Africa/Conakry", 17);
				put("Africa/Dakar", 18);
				put("Africa/Dar_es_Salaam", 19);
				put("Africa/Djibouti", 20);
				put("Africa/Douala", 21);
				put("Africa/El_Aaiun", 22);
				put("Africa/Freetown", 23);
				put("Africa/Gaborone", 24);
				put("Africa/Harare", 25);
				put("Africa/Johannesburg", 26);
				put("Africa/Juba", 27);
				put("Africa/Kampala", 28);
				put("Africa/Khartoum", 29);
				put("Africa/Kigali", 30);
				put("Africa/Kinshasa", 31);
				put("Africa/Lagos", 32);
				put("Africa/Libreville", 33);
				put("Africa/Lome", 34);
				put("Africa/Luanda", 35);
				put("Africa/Lubumbashi", 36);
				put("Africa/Lusaka", 37);
				put("Africa/Malabo", 38);
				put("Africa/Maputo", 39);
				put("Africa/Maseru", 40);
				put("Africa/Mbabane", 41);
				put("Africa/Mogadishu", 42);
				put("Africa/Monrovia", 43);
				put("Africa/Nairobi", 44);
				put("Africa/Ndjamena", 45);
				put("Africa/Niamey", 46);
				put("Africa/Nouakchott", 47);
				put("Africa/Ouagadougou", 48);
				put("Africa/Porto-Novo", 49);
				put("Africa/Sao_Tome", 50);
				put("Africa/Timbuktu", 51);
				put("Africa/Tripoli", 52);
				put("Africa/Tunis", 53);
				put("Africa/Windhoek", 54);
				put("America/Adak", 55);
				put("America/Anchorage", 56);
				put("America/Anguilla", 57);
				put("America/Antigua", 58);
				put("America/Araguaina", 59);
				put("America/Argentina/Buenos_Aires", 60);
				put("America/Argentina/Catamarca", 61);
				put("America/Argentina/ComodRivadavia", 62);
				put("America/Argentina/Cordoba", 63);
				put("America/Argentina/Jujuy", 64);
				put("America/Argentina/La_Rioja", 65);
				put("America/Argentina/Mendoza", 66);
				put("America/Argentina/Rio_Gallegos", 67);
				put("America/Argentina/Salta", 68);
				put("America/Argentina/San_Juan", 69);
				put("America/Argentina/San_Luis", 70);
				put("America/Argentina/Tucuman", 71);
				put("America/Argentina/Ushuaia", 72);
				put("America/Aruba", 73);
				put("America/Asuncion", 74);
				put("America/Atikokan", 75);
				put("America/Atka", 76);
				put("America/Bahia", 77);
				put("America/Bahia_Banderas", 78);
				put("America/Barbados", 79);
				put("America/Belem", 80);
				put("America/Belize", 81);
				put("America/Blanc-Sablon", 82);
				put("America/Boa_Vista", 83);
				put("America/Bogota", 84);
				put("America/Boise", 85);
				put("America/Buenos_Aires", 86);
				put("America/Cambridge_Bay", 87);
				put("America/Campo_Grande", 88);
				put("America/Cancun", 89);
				put("America/Caracas", 90);
				put("America/Catamarca", 91);
				put("America/Cayenne", 92);
				put("America/Cayman", 93);
				put("America/Chicago", 94);
				put("America/Chihuahua", 95);
				put("America/Ciudad_Juarez", 96);
				put("America/Coral_Harbour", 97);
				put("America/Cordoba", 98);
				put("America/Costa_Rica", 99);
				put("America/Coyhaique", 100);
				put("America/Creston", 101);
				put("America/Cuiaba", 102);
				put("America/Curacao", 103);
				put("America/Danmarkshavn", 104);
				put("America/Dawson", 105);
				put("America/Dawson_Creek", 106);
				put("America/Denver", 107);
				put("America/Detroit", 108);
				put("America/Dominica", 109);
				put("America/Edmonton", 110);
				put("America/Eirunepe", 111);
				put("America/El_Salvador", 112);
				put("America/Ensenada", 113);
				put("America/Fort_Nelson", 114);
				put("America/Fort_Wayne", 115);
				put("America/Fortaleza", 116);
				put("America/Glace_Bay", 117);
				put("America/Godthab", 118);
				put("America/Goose_Bay", 119);
				put("America/Grand_Turk", 120);
				put("America/Grenada", 121);
				put("America/Guadeloupe", 122);
				put("America/Guatemala", 123);
				put("America/Guayaquil", 124);
				put("America/Guyana", 125);
				put("America/Halifax", 126);
				put("America/Havana", 127);
				put("America/Hermosillo", 128);
				put("America/Indiana/Indianapolis", 129);
				put("America/Indiana/Knox", 130);
				put("America/Indiana/Marengo", 131);
				put("America/Indiana/Petersburg", 132);
				put("America/Indiana/Tell_City", 133);
				put("America/Indiana/Vevay", 134);
				put("America/Indiana/Vincennes", 135);
				put("America/Indiana/Winamac", 136);
				put("America/Indianapolis", 137);
				put("America/Inuvik", 138);
				put("America/Iqaluit", 139);
				put("America/Jamaica", 140);
				put("America/Jujuy", 141);
				put("America/Juneau", 142);
				put("America/Kentucky/Louisville", 143);
				put("America/Kentucky/Monticello", 144);
				put("America/Knox_IN", 145);
				put("America/Kralendijk", 146);
				put("America/La_Paz", 147);
				put("America/Lima", 148);
				put("America/Los_Angeles", 149);
				put("America/Louisville", 150);
				put("America/Lower_Princes", 151);
				put("America/Maceio", 152);
				put("America/Managua", 153);
				put("America/Manaus", 154);
				put("America/Marigot", 155);
				put("America/Martinique", 156);
				put("America/Matamoros", 157);
				put("America/Mazatlan", 158);
				put("America/Mendoza", 159);
				put("America/Menominee", 160);
				put("America/Merida", 161);
				put("America/Metlakatla", 162);
				put("America/Mexico_City", 163);
				put("America/Miquelon", 164);
				put("America/Moncton", 165);
				put("America/Monterrey", 166);
				put("America/Montevideo", 167);
				put("America/Montreal", 168);
				put("America/Montserrat", 169);
				put("America/Nassau", 170);
				put("America/New_York", 171);
				put("America/Nipigon", 172);
				put("America/Nome", 173);
				put("America/Noronha", 174);
				put("America/North_Dakota/Beulah", 175);
				put("America/North_Dakota/Center", 176);
				put("America/North_Dakota/New_Salem", 177);
				put("America/Nuuk", 178);
				put("America/Ojinaga", 179);
				put("America/Panama", 180);
				put("America/Pangnirtung", 181);
				put("America/Paramaribo", 182);
				put("America/Phoenix", 183);
				put("America/Port-au-Prince", 184);
				put("America/Port_of_Spain", 185);
				put("America/Porto_Acre", 186);
				put("America/Porto_Velho", 187);
				put("America/Puerto_Rico", 188);
				put("America/Punta_Arenas", 189);
				put("America/Rainy_River", 190);
				put("America/Rankin_Inlet", 191);
				put("America/Recife", 192);
				put("America/Regina", 193);
				put("America/Resolute", 194);
				put("America/Rio_Branco", 195);
				put("America/Rosario", 196);
				put("America/Santa_Isabel", 197);
				put("America/Santarem", 198);
				put("America/Santiago", 199);
				put("America/Santo_Domingo", 200);
				put("America/Sao_Paulo", 201);
				put("America/Scoresbysund", 202);
				put("America/Shiprock", 203);
				put("America/Sitka", 204);
				put("America/St_Barthelemy", 205);
				put("America/St_Johns", 206);
				put("America/St_Kitts", 207);
				put("America/St_Lucia", 208);
				put("America/St_Thomas", 209);
				put("America/St_Vincent", 210);
				put("America/Swift_Current", 211);
				put("America/Tegucigalpa", 212);
				put("America/Thule", 213);
				put("America/Thunder_Bay", 214);
				put("America/Tijuana", 215);
				put("America/Toronto", 216);
				put("America/Tortola", 217);
				put("America/Vancouver", 218);
				put("America/Virgin", 219);
				put("America/Whitehorse", 220);
				put("America/Winnipeg", 221);
				put("America/Yakutat", 222);
				put("America/Yellowknife", 223);
				put("Antarctica/Casey", 224);
				put("Antarctica/Davis", 225);
				put("Antarctica/DumontDUrville", 226);
				put("Antarctica/Macquarie", 227);
				put("Antarctica/Mawson", 228);
				put("Antarctica/McMurdo", 229);
				put("Antarctica/Palmer", 230);
				put("Antarctica/Rothera", 231);
				put("Antarctica/South_Pole", 232);
				put("Antarctica/Syowa", 233);
				put("Antarctica/Troll", 234);
				put("Antarctica/Vostok", 235);
				put("Arctic/Longyearbyen", 236);
				put("Asia/Aden", 237);
				put("Asia/Almaty", 238);
				put("Asia/Amman", 239);
				put("Asia/Anadyr", 240);
				put("Asia/Aqtau", 241);
				put("Asia/Aqtobe", 242);
				put("Asia/Ashgabat", 243);
				put("Asia/Ashkhabad", 244);
				put("Asia/Atyrau", 245);
				put("Asia/Baghdad", 246);
				put("Asia/Bahrain", 247);
				put("Asia/Baku", 248);
				put("Asia/Bangkok", 249);
				put("Asia/Barnaul", 250);
				put("Asia/Beirut", 251);
				put("Asia/Bishkek", 252);
				put("Asia/Brunei", 253);
				put("Asia/Calcutta", 254);
				put("Asia/Chita", 255);
				put("Asia/Choibalsan", 256);
				put("Asia/Chongqing", 257);
				put("Asia/Chungking", 258);
				put("Asia/Colombo", 259);
				put("Asia/Dacca", 260);
				put("Asia/Damascus", 261);
				put("Asia/Dhaka", 262);
				put("Asia/Dili", 263);
				put("Asia/Dubai", 264);
				put("Asia/Dushanbe", 265);
				put("Asia/Famagusta", 266);
				put("Asia/Gaza", 267);
				put("Asia/Harbin", 268);
				put("Asia/Hebron", 269);
				put("Asia/Ho_Chi_Minh", 270);
				put("Asia/Hong_Kong", 271);
				put("Asia/Hovd", 272);
				put("Asia/Irkutsk", 273);
				put("Asia/Istanbul", 274);
				put("Asia/Jakarta", 275);
				put("Asia/Jayapura", 276);
				put("Asia/Jerusalem", 277);
				put("Asia/Kabul", 278);
				put("Asia/Kamchatka", 279);
				put("Asia/Karachi", 280);
				put("Asia/Kashgar", 281);
				put("Asia/Kathmandu", 282);
				put("Asia/Katmandu", 283);
				put("Asia/Khandyga", 284);
				put("Asia/Kolkata", 285);
				put("Asia/Krasnoyarsk", 286);
				put("Asia/Kuala_Lumpur", 287);
				put("Asia/Kuching", 288);
				put("Asia/Kuwait", 289);
				put("Asia/Macao", 290);
				put("Asia/Macau", 291);
				put("Asia/Magadan", 292);
				put("Asia/Makassar", 293);
				put("Asia/Manila", 294);
				put("Asia/Muscat", 295);
				put("Asia/Nicosia", 296);
				put("Asia/Novokuznetsk", 297);
				put("Asia/Novosibirsk", 298);
				put("Asia/Omsk", 299);
				put("Asia/Oral", 300);
				put("Asia/Phnom_Penh", 301);
				put("Asia/Pontianak", 302);
				put("Asia/Pyongyang", 303);
				put("Asia/Qatar", 304);
				put("Asia/Qostanay", 305);
				put("Asia/Qyzylorda", 306);
				put("Asia/Rangoon", 307);
				put("Asia/Riyadh", 308);
				put("Asia/Saigon", 309);
				put("Asia/Sakhalin", 310);
				put("Asia/Samarkand", 311);
				put("Asia/Seoul", 312);
				put("Asia/Shanghai", 313);
				put("Asia/Singapore", 314);
				put("Asia/Srednekolymsk", 315);
				put("Asia/Taipei", 316);
				put("Asia/Tashkent", 317);
				put("Asia/Tbilisi", 318);
				put("Asia/Tehran", 319);
				put("Asia/Tel_Aviv", 320);
				put("Asia/Thimbu", 321);
				put("Asia/Thimphu", 322);
				put("Asia/Tokyo", 323);
				put("Asia/Tomsk", 324);
				put("Asia/Ujung_Pandang", 325);
				put("Asia/Ulaanbaatar", 326);
				put("Asia/Ulan_Bator", 327);
				put("Asia/Urumqi", 328);
				put("Asia/Ust-Nera", 329);
				put("Asia/Vientiane", 330);
				put("Asia/Vladivostok", 331);
				put("Asia/Yakutsk", 332);
				put("Asia/Yangon", 333);
				put("Asia/Yekaterinburg", 334);
				put("Asia/Yerevan", 335);
				put("Atlantic/Azores", 336);
				put("Atlantic/Bermuda", 337);
				put("Atlantic/Canary", 338);
				put("Atlantic/Cape_Verde", 339);
				put("Atlantic/Faeroe", 340);
				put("Atlantic/Faroe", 341);
				put("Atlantic/Jan_Mayen", 342);
				put("Atlantic/Madeira", 343);
				put("Atlantic/Reykjavik", 344);
				put("Atlantic/South_Georgia", 345);
				put("Atlantic/St_Helena", 346);
				put("Atlantic/Stanley", 347);
				put("Australia/ACT", 348);
				put("Australia/Adelaide", 349);
				put("Australia/Brisbane", 350);
				put("Australia/Broken_Hill", 351);
				put("Australia/Canberra", 352);
				put("Australia/Currie", 353);
				put("Australia/Darwin", 354);
				put("Australia/Eucla", 355);
				put("Australia/Hobart", 356);
				put("Australia/LHI", 357);
				put("Australia/Lindeman", 358);
				put("Australia/Lord_Howe", 359);
				put("Australia/Melbourne", 360);
				put("Australia/NSW", 361);
				put("Australia/North", 362);
				put("Australia/Perth", 363);
				put("Australia/Queensland", 364);
				put("Australia/South", 365);
				put("Australia/Sydney", 366);
				put("Australia/Tasmania", 367);
				put("Australia/Victoria", 368);
				put("Australia/West", 369);
				put("Australia/Yancowinna", 370);
				put("Brazil/Acre", 371);
				put("Brazil/DeNoronha", 372);
				put("Brazil/East", 373);
				put("Brazil/West", 374);
				put("CET", 375);
				put("CST6CDT", 376);
				put("Canada/Atlantic", 377);
				put("Canada/Central", 378);
				put("Canada/Eastern", 379);
				put("Canada/Mountain", 380);
				put("Canada/Newfoundland", 381);
				put("Canada/Pacific", 382);
				put("Canada/Saskatchewan", 383);
				put("Canada/Yukon", 384);
				put("Chile/Continental", 385);
				put("Chile/EasterIsland", 386);
				put("Cuba", 387);
				put("EET", 388);
				put("EST", 389);
				put("EST5EDT", 390);
				put("Egypt", 391);
				put("Eire", 392);
				put("Etc/GMT", 393);
				put("Etc/GMT+0", 394);
				put("Etc/GMT+1", 395);
				put("Etc/GMT+10", 396);
				put("Etc/GMT+11", 397);
				put("Etc/GMT+12", 398);
				put("Etc/GMT+2", 399);
				put("Etc/GMT+3", 400);
				put("Etc/GMT+4", 401);
				put("Etc/GMT+5", 402);
				put("Etc/GMT+6", 403);
				put("Etc/GMT+7", 404);
				put("Etc/GMT+8", 405);
				put("Etc/GMT+9", 406);
				put("Etc/GMT-0", 407);
				put("Etc/GMT-1", 408);
				put("Etc/GMT-10", 409);
				put("Etc/GMT-11", 410);
				put("Etc/GMT-12", 411);
				put("Etc/GMT-13", 412);
				put("Etc/GMT-14", 413);
				put("Etc/GMT-2", 414);
				put("Etc/GMT-3", 415);
				put("Etc/GMT-4", 416);
				put("Etc/GMT-5", 417);
				put("Etc/GMT-6", 418);
				put("Etc/GMT-7", 419);
				put("Etc/GMT-8", 420);
				put("Etc/GMT-9", 421);
				put("Etc/GMT0", 422);
				put("Etc/Greenwich", 423);
				put("Etc/UCT", 424);
				put("Etc/UTC", 425);
				put("Etc/Universal", 426);
				put("Etc/Zulu", 427);
				put("Europe/Amsterdam", 428);
				put("Europe/Andorra", 429);
				put("Europe/Astrakhan", 430);
				put("Europe/Athens", 431);
				put("Europe/Belfast", 432);
				put("Europe/Belgrade", 433);
				put("Europe/Berlin", 434);
				put("Europe/Bratislava", 435);
				put("Europe/Brussels", 436);
				put("Europe/Bucharest", 437);
				put("Europe/Budapest", 438);
				put("Europe/Busingen", 439);
				put("Europe/Chisinau", 440);
				put("Europe/Copenhagen", 441);
				put("Europe/Dublin", 442);
				put("Europe/Gibraltar", 443);
				put("Europe/Guernsey", 444);
				put("Europe/Helsinki", 445);
				put("Europe/Isle_of_Man", 446);
				put("Europe/Istanbul", 447);
				put("Europe/Jersey", 448);
				put("Europe/Kaliningrad", 449);
				put("Europe/Kiev", 450);
				put("Europe/Kirov", 451);
				put("Europe/Kyiv", 452);
				put("Europe/Lisbon", 453);
				put("Europe/Ljubljana", 454);
				put("Europe/London", 455);
				put("Europe/Luxembourg", 456);
				put("Europe/Madrid", 457);
				put("Europe/Malta", 458);
				put("Europe/Mariehamn", 459);
				put("Europe/Minsk", 460);
				put("Europe/Monaco", 461);
				put("Europe/Moscow", 462);
				put("Europe/Nicosia", 463);
				put("Europe/Oslo", 464);
				put("Europe/Paris", 465);
				put("Europe/Podgorica", 466);
				put("Europe/Prague", 467);
				put("Europe/Riga", 468);
				put("Europe/Rome", 469);
				put("Europe/Samara", 470);
				put("Europe/San_Marino", 471);
				put("Europe/Sarajevo", 472);
				put("Europe/Saratov", 473);
				put("Europe/Simferopol", 474);
				put("Europe/Skopje", 475);
				put("Europe/Sofia", 476);
				put("Europe/Stockholm", 477);
				put("Europe/Tallinn", 478);
				put("Europe/Tirane", 479);
				put("Europe/Tiraspol", 480);
				put("Europe/Ulyanovsk", 481);
				put("Europe/Uzhgorod", 482);
				put("Europe/Vaduz", 483);
				put("Europe/Vatican", 484);
				put("Europe/Vienna", 485);
				put("Europe/Vilnius", 486);
				put("Europe/Volgograd", 487);
				put("Europe/Warsaw", 488);
				put("Europe/Zagreb", 489);
				put("Europe/Zaporozhye", 490);
				put("Europe/Zurich", 491);
				put("Factory", 492);
				put("GB", 493);
				put("GB-Eire", 494);
				put("GMT", 495);
				put("GMT+0", 496);
				put("GMT-0", 497);
				put("GMT0", 498);
				put("Greenwich", 499);
				put("HST", 500);
				put("Hongkong", 501);
				put("Iceland", 502);
				put("Indian/Antananarivo", 503);
				put("Indian/Chagos", 504);
				put("Indian/Christmas", 505);
				put("Indian/Cocos", 506);
				put("Indian/Comoro", 507);
				put("Indian/Kerguelen", 508);
				put("Indian/Mahe", 509);
				put("Indian/Maldives", 510);
				put("Indian/Mauritius", 511);
				put("Indian/Mayotte", 512);
				put("Indian/Reunion", 513);
				put("Iran", 514);
				put("Israel", 515);
				put("Jamaica", 516);
				put("Japan", 517);
				put("Kwajalein", 518);
				put("Libya", 519);
				put("MET", 520);
				put("MST", 521);
				put("MST7MDT", 522);
				put("Mexico/BajaNorte", 523);
				put("Mexico/BajaSur", 524);
				put("Mexico/General", 525);
				put("NZ", 526);
				put("NZ-CHAT", 527);
				put("Navajo", 528);
				put("PRC", 529);
				put("PST8PDT", 530);
				put("Pacific/Apia", 531);
				put("Pacific/Auckland", 532);
				put("Pacific/Bougainville", 533);
				put("Pacific/Chatham", 534);
				put("Pacific/Chuuk", 535);
				put("Pacific/Easter", 536);
				put("Pacific/Efate", 537);
				put("Pacific/Enderbury", 538);
				put("Pacific/Fakaofo", 539);
				put("Pacific/Fiji", 540);
				put("Pacific/Funafuti", 541);
				put("Pacific/Galapagos", 542);
				put("Pacific/Gambier", 543);
				put("Pacific/Guadalcanal", 544);
				put("Pacific/Guam", 545);
				put("Pacific/Honolulu", 546);
				put("Pacific/Johnston", 547);
				put("Pacific/Kanton", 548);
				put("Pacific/Kiritimati", 549);
				put("Pacific/Kosrae", 550);
				put("Pacific/Kwajalein", 551);
				put("Pacific/Majuro", 552);
				put("Pacific/Marquesas", 553);
				put("Pacific/Midway", 554);
				put("Pacific/Nauru", 555);
				put("Pacific/Niue", 556);
				put("Pacific/Norfolk", 557);
				put("Pacific/Noumea", 558);
				put("Pacific/Pago_Pago", 559);
				put("Pacific/Palau", 560);
				put("Pacific/Pitcairn", 561);
				put("Pacific/Pohnpei", 562);
				put("Pacific/Ponape", 563);
				put("Pacific/Port_Moresby", 564);
				put("Pacific/Rarotonga", 565);
				put("Pacific/Saipan", 566);
				put("Pacific/Samoa", 567);
				put("Pacific/Tahiti", 568);
				put("Pacific/Tarawa", 569);
				put("Pacific/Tongatapu", 570);
				put("Pacific/Truk", 571);
				put("Pacific/Wake", 572);
				put("Pacific/Wallis", 573);
				put("Pacific/Yap", 574);
				put("Poland", 575);
				put("Portugal", 576);
				put("ROC", 577);
				put("ROK", 578);
				put("Singapore", 579);
				put("Turkey", 580);
				put("UCT", 581);
				put("US/Alaska", 582);
				put("US/Aleutian", 583);
				put("US/Arizona", 584);
				put("US/Central", 585);
				put("US/East-Indiana", 586);
				put("US/Eastern", 587);
				put("US/Hawaii", 588);
				put("US/Indiana-Starke", 589);
				put("US/Michigan", 590);
				put("US/Mountain", 591);
				put("US/Pacific", 592);
				put("US/Samoa", 593);
				put("Universal", 594);
				put("W-SU", 595);
				put("WET", 596);
				put("Zulu", 597);
			}});
			private TimeZone(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static TimeZone get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static TimeZone get(java.lang.String key, GreyCat greycat) {
				return (TimeZone) greycat.libs_by_name.get(std.name).mapped[6].enum_values[indicesByValue.get(key)];
			}
			public TimeZone(){
				this(GreyCat.DEFAULT);
			}
			public TimeZone(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[6]);
			}
		}
		public static final class t2 extends std_n.core.t2 {
			public static final java.lang.String name = "core::t2";
			private t2(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public t2(){
				this(GreyCat.DEFAULT);
			}
			public t2(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[7]);
			}
		}
		public static final class String extends std_n.core.String {
			public static final java.lang.String name = "core::String";
			private String(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public String(){
				this(GreyCat.DEFAULT);
			}
			public String(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[8]);
			}
		}
		public static final class GeoBox extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoBox";
			private GeoBox(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.geo sw(){
				return (std.core.geo) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_sw(std.core.geo v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.geo ne(){
				return (std.core.geo) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_ne(std.core.geo v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public GeoBox(std.core.geo sw, std.core.geo ne){
				this(GreyCat.DEFAULT, sw, ne);
			}
			public GeoBox(GreyCat greycat, std.core.geo sw, std.core.geo ne){
				this(greycat.libs_by_name.get(std.name).mapped[9], sw, ne);
			}
		}
		public static final class t4f extends std_n.core.t4f {
			public static final java.lang.String name = "core::t4f";
			private t4f(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public t4f(){
				this(GreyCat.DEFAULT);
			}
			public t4f(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[10]);
			}
		}
		public static final class field extends std_n.core.field {
			public static final java.lang.String name = "core::field";
			private field(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public field(){
				this(GreyCat.DEFAULT);
			}
			public field(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[11]);
			}
		}
		public static final class CalendarUnit extends GreyCat.Enum {
			public static final java.lang.String name = "core::CalendarUnit";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("year", 0);
				put("month", 1);
				put("day", 2);
				put("hour", 3);
				put("minute", 4);
				put("second", 5);
				put("microsecond", 6);
			}});
			private CalendarUnit(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static CalendarUnit get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static CalendarUnit get(java.lang.String key, GreyCat greycat) {
				return (CalendarUnit) greycat.libs_by_name.get(std.name).mapped[12].enum_values[indicesByValue.get(key)];
			}
			public CalendarUnit(){
				this(GreyCat.DEFAULT);
			}
			public CalendarUnit(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[12]);
			}
		}
		public static final class Buffer extends std_n.core.Buffer {
			public static final java.lang.String name = "core::Buffer";
			private Buffer(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public Buffer(){
				this(GreyCat.DEFAULT);
			}
			public Buffer(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[13]);
			}
		}
		public static final class nodeList<T> extends std_n.core.nodeList<T> {
			public static final java.lang.String name = "core::nodeList";
			private nodeList(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public nodeList(){
				this(GreyCat.DEFAULT);
			}
			public nodeList(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[14]);
			}
		}
		public static final class nodeTime<T> extends std_n.core.nodeTime<T> {
			public static final java.lang.String name = "core::nodeTime";
			private nodeTime(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public nodeTime(){
				this(GreyCat.DEFAULT);
			}
			public nodeTime(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[15]);
			}
		}
		public static final class duration extends std_n.core.duration {
			public static final java.lang.String name = "core::duration";
			private duration(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public duration(){
				this(GreyCat.DEFAULT);
			}
			public duration(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[16]);
			}
		}
		public static final class Tensor extends std_n.core.Tensor {
			public static final java.lang.String name = "core::Tensor";
			private Tensor(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public Tensor(){
				this(GreyCat.DEFAULT);
			}
			public Tensor(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[17]);
			}
		}
		public static final class nodeTimeSingleton extends GreyCat.Object {
			public static final java.lang.String name = "core::nodeTimeSingleton";
			private nodeTimeSingleton(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.time t(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_t(std.core.time v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Object v(){
				return  super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_v(java.lang.Object v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public nodeTimeSingleton(std.core.time t, java.lang.Object v){
				this(GreyCat.DEFAULT, t, v);
			}
			public nodeTimeSingleton(GreyCat greycat, std.core.time t, java.lang.Object v){
				this(greycat.libs_by_name.get(std.name).mapped[18], t, v);
			}
		}
		public static final class NodeInfo<T> extends GreyCat.Object {
			public static final java.lang.String name = "core::NodeInfo";
			private NodeInfo(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long size(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_size(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public T from(){
				return (T) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_from(T v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public T to(){
				return (T) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_to(T v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public NodeInfo(java.lang.Long size, T from, T to){
				this(GreyCat.DEFAULT, size, from, to);
			}
			public NodeInfo(GreyCat greycat, java.lang.Long size, T from, T to){
				this(greycat.libs_by_name.get(std.name).mapped[19], size, from, to);
			}
		}
		public static final class SortOrder extends GreyCat.Enum {
			public static final java.lang.String name = "core::SortOrder";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("asc", 0);
				put("desc", 1);
			}});
			private SortOrder(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static SortOrder get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static SortOrder get(java.lang.String key, GreyCat greycat) {
				return (SortOrder) greycat.libs_by_name.get(std.name).mapped[20].enum_values[indicesByValue.get(key)];
			}
			public SortOrder(){
				this(GreyCat.DEFAULT);
			}
			public SortOrder(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[20]);
			}
		}
		public static final class t3f extends std_n.core.t3f {
			public static final java.lang.String name = "core::t3f";
			private t3f(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public t3f(){
				this(GreyCat.DEFAULT);
			}
			public t3f(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[21]);
			}
		}
		public static final class MathConstants extends GreyCat.Object {
			public static final java.lang.String name = "core::MathConstants";
			private MathConstants(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static java.lang.Double e() {
				return e(GreyCat.DEFAULT);
			}
			public static java.lang.Double e(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double log_2e() {
				return log_2e(GreyCat.DEFAULT);
			}
			public static java.lang.Double log_2e(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double log_10e() {
				return log_10e(GreyCat.DEFAULT);
			}
			public static java.lang.Double log_10e(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[2];
			}
			public static java.lang.Double ln2() {
				return ln2(GreyCat.DEFAULT);
			}
			public static java.lang.Double ln2(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[3];
			}
			public static java.lang.Double ln10() {
				return ln10(GreyCat.DEFAULT);
			}
			public static java.lang.Double ln10(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[4];
			}
			public static java.lang.Double pi() {
				return pi(GreyCat.DEFAULT);
			}
			public static java.lang.Double pi(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[5];
			}
			public static java.lang.Double pi_2() {
				return pi_2(GreyCat.DEFAULT);
			}
			public static java.lang.Double pi_2(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[6];
			}
			public static java.lang.Double pi_4() {
				return pi_4(GreyCat.DEFAULT);
			}
			public static java.lang.Double pi_4(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[7];
			}
			public static java.lang.Double m1_pi() {
				return m1_pi(GreyCat.DEFAULT);
			}
			public static java.lang.Double m1_pi(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[8];
			}
			public static java.lang.Double m2_pi() {
				return m2_pi(GreyCat.DEFAULT);
			}
			public static java.lang.Double m2_pi(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[9];
			}
			public static java.lang.Double m2_sqrt_pi() {
				return m2_sqrt_pi(GreyCat.DEFAULT);
			}
			public static java.lang.Double m2_sqrt_pi(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[10];
			}
			public static java.lang.Double sqrt2() {
				return sqrt2(GreyCat.DEFAULT);
			}
			public static java.lang.Double sqrt2(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[11];
			}
			public static java.lang.Double sqrt1_2() {
				return sqrt1_2(GreyCat.DEFAULT);
			}
			public static java.lang.Double sqrt1_2(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[22];
				return (java.lang.Double) t.static_values[12];
			}
			public MathConstants(){
				this(GreyCat.DEFAULT);
			}
			public MathConstants(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[22]);
			}
		}
		public static final class type extends std_n.core.type {
			public static final java.lang.String name = "core::type";
			private type(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public type(){
				this(GreyCat.DEFAULT);
			}
			public type(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[23]);
			}
		}
		public static final class SamplingMode extends GreyCat.Enum {
			public static final java.lang.String name = "core::SamplingMode";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("fixed", 0);
				put("fixed_reg", 1);
				put("adaptative", 2);
				put("dense", 3);
			}});
			private SamplingMode(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static SamplingMode get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static SamplingMode get(java.lang.String key, GreyCat greycat) {
				return (SamplingMode) greycat.libs_by_name.get(std.name).mapped[24].enum_values[indicesByValue.get(key)];
			}
			public SamplingMode(){
				this(GreyCat.DEFAULT);
			}
			public SamplingMode(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[24]);
			}
		}
		public static final class geo extends std_n.core.geo {
			public static final java.lang.String name = "core::geo";
			private geo(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public geo(){
				this(GreyCat.DEFAULT);
			}
			public geo(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[25]);
			}
		}
		public static final class Map<K,V> extends std_n.core.Map<K,V> {
			public static final java.lang.String name = "core::Map";
			private Map(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public Map(){
				this(GreyCat.DEFAULT);
			}
			public Map(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[26]);
			}
		}
		public static final class Error extends GreyCat.Object {
			public static final java.lang.String name = "core::Error";
			private Error(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String message(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_message(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.Array<std.core.ErrorFrame> stack(){
				return (std.core.Array<std.core.ErrorFrame>) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_stack(std.core.Array<std.core.ErrorFrame> v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Error(java.lang.String message, std.core.Array<std.core.ErrorFrame> stack){
				this(GreyCat.DEFAULT, message, stack);
			}
			public Error(GreyCat greycat, java.lang.String message, std.core.Array<std.core.ErrorFrame> stack){
				this(greycat.libs_by_name.get(std.name).mapped[27], message, stack);
			}
		}
		public static final class nodeTimeCursor<T> extends GreyCat.Object {
			public static final java.lang.String name = "core::nodeTimeCursor";
			private nodeTimeCursor(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.nodeTime<T> n(){
				return (std.core.nodeTime<T>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_n(std.core.nodeTime<T> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.time req_time(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_req_time(std.core.time v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public nodeTimeCursor(std.core.nodeTime<T> n, std.core.time req_time){
				this(GreyCat.DEFAULT, n, req_time);
			}
			public nodeTimeCursor(GreyCat greycat, std.core.nodeTime<T> n, std.core.time req_time){
				this(greycat.libs_by_name.get(std.name).mapped[28], n, req_time);
			}
		}
		public static final class nodeGeo<T> extends std_n.core.nodeGeo<T> {
			public static final java.lang.String name = "core::nodeGeo";
			private nodeGeo(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public nodeGeo(){
				this(GreyCat.DEFAULT);
			}
			public nodeGeo(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[29]);
			}
		}
		public static final class node<T> extends std_n.core.node<T> {
			public static final java.lang.String name = "core::node";
			private node(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public node(){
				this(GreyCat.DEFAULT);
			}
			public node(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[30]);
			}
		}
		public static final class DurationUnit extends GreyCat.Enum {
			public static final java.lang.String name = "core::DurationUnit";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("microseconds", 0);
				put("milliseconds", 1);
				put("seconds", 2);
				put("minutes", 3);
				put("hours", 4);
				put("days", 5);
			}});
			private DurationUnit(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static DurationUnit get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static DurationUnit get(java.lang.String key, GreyCat greycat) {
				return (DurationUnit) greycat.libs_by_name.get(std.name).mapped[31].enum_values[indicesByValue.get(key)];
			}
			public DurationUnit(){
				this(GreyCat.DEFAULT);
			}
			public DurationUnit(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[31]);
			}
		}
		public static final class TableColumnMapping extends GreyCat.Object {
			public static final java.lang.String name = "core::TableColumnMapping";
			private TableColumnMapping(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long column(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_column(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.Array<java.lang.Object> extractors(){
				return (std.core.Array<java.lang.Object>) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_extractors(std.core.Array<java.lang.Object> v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public TableColumnMapping(java.lang.Long column, std.core.Array<java.lang.Object> extractors){
				this(GreyCat.DEFAULT, column, extractors);
			}
			public TableColumnMapping(GreyCat greycat, java.lang.Long column, std.core.Array<java.lang.Object> extractors){
				this(greycat.libs_by_name.get(std.name).mapped[32], column, extractors);
			}
		}
		public static final class TensorType extends GreyCat.Enum {
			public static final java.lang.String name = "core::TensorType";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("i32", 0);
				put("i64", 1);
				put("f32", 2);
				put("f64", 3);
				put("c64", 4);
				put("c128", 5);
			}});
			private TensorType(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static TensorType get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static TensorType get(java.lang.String key, GreyCat greycat) {
				return (TensorType) greycat.libs_by_name.get(std.name).mapped[33].enum_values[indicesByValue.get(key)];
			}
			public TensorType(){
				this(GreyCat.DEFAULT);
			}
			public TensorType(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[33]);
			}
		}
		public static final class Tuple<T,U> extends GreyCat.Object {
			public static final java.lang.String name = "core::Tuple";
			private Tuple(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public T x(){
				return (T) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_x(T v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public U y(){
				return (U) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_y(U v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Tuple(T x, U y){
				this(GreyCat.DEFAULT, x, y);
			}
			public Tuple(GreyCat greycat, T x, U y){
				this(greycat.libs_by_name.get(std.name).mapped[34], x, y);
			}
		}
		public static final class time extends std_n.core.time {
			public static final java.lang.String name = "core::time";
			private time(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public time(){
				this(GreyCat.DEFAULT);
			}
			public time(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[35]);
			}
		}
		public static final class ErrorFrame extends GreyCat.Object {
			public static final java.lang.String name = "core::ErrorFrame";
			private ErrorFrame(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String module(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_module(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String function(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_function(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long line(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_line(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Long column(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_column(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public ErrorFrame(java.lang.String module, java.lang.String function, java.lang.Long line, java.lang.Long column){
				this(GreyCat.DEFAULT, module, function, line, column);
			}
			public ErrorFrame(GreyCat greycat, java.lang.String module, java.lang.String function, java.lang.Long line, java.lang.Long column){
				this(greycat.libs_by_name.get(std.name).mapped[36], module, function, line, column);
			}
		}
		public static final class Array<T> extends std_n.core.Array<T> {
			public static final java.lang.String name = "core::Array";
			private Array(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public Array(){
				this(GreyCat.DEFAULT);
			}
			public Array(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[37]);
			}
		}
		public static final class GeoPoly extends GreyCat.Object {
			public static final java.lang.String name = "core::GeoPoly";
			private GeoPoly(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.Array<std.core.geo> points(){
				return (std.core.Array<std.core.geo>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_points(std.core.Array<std.core.geo> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public GeoPoly(std.core.Array<std.core.geo> points){
				this(GreyCat.DEFAULT, points);
			}
			public GeoPoly(GreyCat greycat, std.core.Array<std.core.geo> points){
				this(greycat.libs_by_name.get(std.name).mapped[38], points);
			}
		}
		public static final class FloatPrecision extends GreyCat.Enum {
			public static final java.lang.String name = "core::FloatPrecision";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("p1", 0);
				put("p10", 1);
				put("p100", 2);
				put("p1000", 3);
				put("p10000", 4);
				put("p100000", 5);
				put("p1000000", 6);
				put("p10000000", 7);
				put("p100000000", 8);
				put("p1000000000", 9);
				put("p10000000000", 10);
			}});
			private FloatPrecision(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static FloatPrecision get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static FloatPrecision get(java.lang.String key, GreyCat greycat) {
				return (FloatPrecision) greycat.libs_by_name.get(std.name).mapped[39].enum_values[indicesByValue.get(key)];
			}
			public FloatPrecision(){
				this(GreyCat.DEFAULT);
			}
			public FloatPrecision(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[39]);
			}
		}
		public static final class t2f extends std_n.core.t2f {
			public static final java.lang.String name = "core::t2f";
			private t2f(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public t2f(){
				this(GreyCat.DEFAULT);
			}
			public t2f(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[40]);
			}
		}
		public static final class Date extends GreyCat.Object {
			public static final java.lang.String name = "core::Date";
			private Date(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long year(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_year(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long month(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_month(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long day(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_day(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Long hour(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_hour(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Long minute(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_minute(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Long second(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_second(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.Long microsecond(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_microsecond(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public static std.core.Date from_time(std.core.time time, std.core.TimeZone tz) throws java.io.IOException {
				return from_time(GreyCat.DEFAULT, time, tz);
			}
			public static std.core.Date from_time(GreyCat greycat, std.core.time time, std.core.TimeZone tz) throws java.io.IOException {
				return (std.core.Date) greycat.call("core::Date::from_time", time, tz);
			}
			public Date(java.lang.Long year, java.lang.Long month, java.lang.Long day, java.lang.Long hour, java.lang.Long minute, java.lang.Long second, java.lang.Long microsecond){
				this(GreyCat.DEFAULT, year, month, day, hour, minute, second, microsecond);
			}
			public Date(GreyCat greycat, java.lang.Long year, java.lang.Long month, java.lang.Long day, java.lang.Long hour, java.lang.Long minute, java.lang.Long second, java.lang.Long microsecond){
				this(greycat.libs_by_name.get(std.name).mapped[41], year, month, day, hour, minute, second, microsecond);
			}
		}
		public static final class function extends std_n.core.function {
			public static final java.lang.String name = "core::function";
			private function(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public function(){
				this(GreyCat.DEFAULT);
			}
			public function(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[42]);
			}
		}
		public static final class str extends std_n.core.str {
			public static final java.lang.String name = "core::str";
			private str(GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public str(){
				this(GreyCat.DEFAULT);
			}
			public str(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[43]);
			}
		}
	}
	public static final class io {
		public static final class SmtpAuth extends GreyCat.Enum {
			public static final java.lang.String name = "io::SmtpAuth";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("none", 0);
				put("plain", 1);
				put("login", 2);
			}});
			private SmtpAuth(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static SmtpAuth get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static SmtpAuth get(java.lang.String key, GreyCat greycat) {
				return (SmtpAuth) greycat.libs_by_name.get(std.name).mapped[44].enum_values[indicesByValue.get(key)];
			}
			public SmtpAuth(){
				this(GreyCat.DEFAULT);
			}
			public SmtpAuth(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[44]);
			}
		}
		public static final class Url extends GreyCat.Object {
			public static final java.lang.String name = "io::Url";
			private Url(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String protocol(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_protocol(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String host(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_host(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long port(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_port(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.core.Map<java.lang.String, java.lang.String> params(){
				return (std.core.Map<java.lang.String, java.lang.String>) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_params(std.core.Map<java.lang.String, java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.String hash(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_hash(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public Url(java.lang.String protocol, java.lang.String host, java.lang.Long port, java.lang.String path, std.core.Map<java.lang.String, java.lang.String> params, java.lang.String hash){
				this(GreyCat.DEFAULT, protocol, host, port, path, params, hash);
			}
			public Url(GreyCat greycat, java.lang.String protocol, java.lang.String host, java.lang.Long port, java.lang.String path, std.core.Map<java.lang.String, java.lang.String> params, java.lang.String hash){
				this(greycat.libs_by_name.get(std.name).mapped[45], protocol, host, port, path, params, hash);
			}
		}
		public static final class File extends GreyCat.Object {
			public static final java.lang.String name = "io::File";
			private File(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long size(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_size(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.core.time last_modification(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_last_modification(std.core.time v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public File(java.lang.String path, java.lang.Long size, std.core.time last_modification){
				this(GreyCat.DEFAULT, path, size, last_modification);
			}
			public File(GreyCat greycat, java.lang.String path, java.lang.Long size, std.core.time last_modification){
				this(greycat.libs_by_name.get(std.name).mapped[46], path, size, last_modification);
			}
		}
		public static final class CsvAnalysisConfig extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvAnalysisConfig";
			private CsvAnalysisConfig(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long header_lines(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_header_lines(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Character separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Character string_delimiter(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_string_delimiter(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Character decimal_separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_decimal_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Character thousands_separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_thousands_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Long row_limit(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_row_limit(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.Long enumerable_limit(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_enumerable_limit(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public java.lang.Long date_check_limit(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_date_check_limit(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public std.core.Array<java.lang.String> date_formats(){
				return (std.core.Array<java.lang.String>) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_date_formats(std.core.Array<java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public static java.lang.Long enumerable_limit_default() {
				return enumerable_limit_default(GreyCat.DEFAULT);
			}
			public static java.lang.Long enumerable_limit_default(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[47];
				return (java.lang.Long) t.static_values[0];
			}
			public static java.lang.Long date_check_limit_default() {
				return date_check_limit_default(GreyCat.DEFAULT);
			}
			public static java.lang.Long date_check_limit_default(GreyCat greycat) {
				final GreyCat.Type t = greycat.libs_by_name.get(std.name).mapped[47];
				return (java.lang.Long) t.static_values[1];
			}
			public CsvAnalysisConfig(java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, java.lang.Long row_limit, java.lang.Long enumerable_limit, java.lang.Long date_check_limit, std.core.Array<java.lang.String> date_formats){
				this(GreyCat.DEFAULT, header_lines, separator, string_delimiter, decimal_separator, thousands_separator, row_limit, enumerable_limit, date_check_limit, date_formats);
			}
			public CsvAnalysisConfig(GreyCat greycat, java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, java.lang.Long row_limit, java.lang.Long enumerable_limit, java.lang.Long date_check_limit, std.core.Array<java.lang.String> date_formats){
				this(greycat.libs_by_name.get(std.name).mapped[47], header_lines, separator, string_delimiter, decimal_separator, thousands_separator, row_limit, enumerable_limit, date_check_limit, date_formats);
			}
		}
		public static final class Writer<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::Writer";
			private Writer(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean append(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_append(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Writer(java.lang.String path, java.lang.Boolean append){
				this(GreyCat.DEFAULT, path, append);
			}
			public Writer(GreyCat greycat, java.lang.String path, java.lang.Boolean append){
				this(greycat.libs_by_name.get(std.name).mapped[48], path, append);
			}
		}
		public static final class GcbWriter<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::GcbWriter";
			private GcbWriter(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean append(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_append(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public GcbWriter(java.lang.String path, java.lang.Boolean append){
				this(GreyCat.DEFAULT, path, append);
			}
			public GcbWriter(GreyCat greycat, java.lang.String path, java.lang.Boolean append){
				this(greycat.libs_by_name.get(std.name).mapped[49], path, append);
			}
		}
		public static final class TextWriter<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::TextWriter";
			private TextWriter(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean append(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_append(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public TextWriter(java.lang.String path, java.lang.Boolean append){
				this(GreyCat.DEFAULT, path, append);
			}
			public TextWriter(GreyCat greycat, java.lang.String path, java.lang.Boolean append){
				this(greycat.libs_by_name.get(std.name).mapped[50], path, append);
			}
		}
		public static final class GcbReader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::GcbReader";
			private GcbReader(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long pos(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_pos(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public GcbReader(java.lang.String path, java.lang.Long pos){
				this(GreyCat.DEFAULT, path, pos);
			}
			public GcbReader(GreyCat greycat, java.lang.String path, java.lang.Long pos){
				this(greycat.libs_by_name.get(std.name).mapped[51], path, pos);
			}
		}
		public static final class SmtpMode extends GreyCat.Enum {
			public static final java.lang.String name = "io::SmtpMode";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("plain", 0);
				put("ssl_tls", 1);
				put("starttls", 2);
			}});
			private SmtpMode(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static SmtpMode get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static SmtpMode get(java.lang.String key, GreyCat greycat) {
				return (SmtpMode) greycat.libs_by_name.get(std.name).mapped[52].enum_values[indicesByValue.get(key)];
			}
			public SmtpMode(){
				this(GreyCat.DEFAULT);
			}
			public SmtpMode(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[52]);
			}
		}
		public static final class CsvColumnStatistics extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvColumnStatistics";
			private CsvColumnStatistics(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Object example(){
				return  super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_example(java.lang.Object v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long null_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_null_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Long bool_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_bool_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Long int_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_int_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Long float_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_float_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.Long string_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_string_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public java.lang.Long date_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_date_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public std.core.Map<java.lang.String, java.lang.Long> date_format_count(){
				return (std.core.Map<java.lang.String, java.lang.Long>) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_date_format_count(std.core.Map<java.lang.String, java.lang.Long> v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public std.core.Map<java.lang.Object, java.lang.Long> enumerable_count(){
				return (std.core.Map<java.lang.Object, java.lang.Long>) super.getAttribute(super.type.generated_offsets[9]);
			}
			public void set_enumerable_count(std.core.Map<java.lang.Object, java.lang.Long> v){
				super.setAttribute(super.type.generated_offsets[9],v);
			}
			public std.util.Gaussian profile(){
				return (std.util.Gaussian) super.getAttribute(super.type.generated_offsets[10]);
			}
			public void set_profile(std.util.Gaussian v){
				super.setAttribute(super.type.generated_offsets[10],v);
			}
			public CsvColumnStatistics(java.lang.String name, java.lang.Object example, java.lang.Long null_count, java.lang.Long bool_count, java.lang.Long int_count, java.lang.Long float_count, java.lang.Long string_count, java.lang.Long date_count, std.core.Map<java.lang.String, java.lang.Long> date_format_count, std.core.Map<java.lang.Object, java.lang.Long> enumerable_count, std.util.Gaussian profile){
				this(GreyCat.DEFAULT, name, example, null_count, bool_count, int_count, float_count, string_count, date_count, date_format_count, enumerable_count, profile);
			}
			public CsvColumnStatistics(GreyCat greycat, java.lang.String name, java.lang.Object example, java.lang.Long null_count, java.lang.Long bool_count, java.lang.Long int_count, java.lang.Long float_count, java.lang.Long string_count, java.lang.Long date_count, std.core.Map<java.lang.String, java.lang.Long> date_format_count, std.core.Map<java.lang.Object, java.lang.Long> enumerable_count, std.util.Gaussian profile){
				this(greycat.libs_by_name.get(std.name).mapped[53], name, example, null_count, bool_count, int_count, float_count, string_count, date_count, date_format_count, enumerable_count, profile);
			}
		}
		public static final class CsvFormat extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvFormat";
			private CsvFormat(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long header_lines(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_header_lines(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Character separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Character string_delimiter(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_string_delimiter(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Character decimal_separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_decimal_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Character thousands_separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_thousands_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Boolean trim(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_trim(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.String format(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_format(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public std.core.TimeZone tz(){
				return (std.core.TimeZone) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_tz(std.core.TimeZone v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public java.lang.Boolean strict(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_strict(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public java.lang.Boolean nearest_time(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[9]);
			}
			public void set_nearest_time(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[9],v);
			}
			public CsvFormat(java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, java.lang.Boolean trim, java.lang.String format, std.core.TimeZone tz, java.lang.Boolean strict, java.lang.Boolean nearest_time){
				this(GreyCat.DEFAULT, header_lines, separator, string_delimiter, decimal_separator, thousands_separator, trim, format, tz, strict, nearest_time);
			}
			public CsvFormat(GreyCat greycat, java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, java.lang.Boolean trim, java.lang.String format, std.core.TimeZone tz, java.lang.Boolean strict, java.lang.Boolean nearest_time){
				this(greycat.libs_by_name.get(std.name).mapped[54], header_lines, separator, string_delimiter, decimal_separator, thousands_separator, trim, format, tz, strict, nearest_time);
			}
		}
		public static final class CsvSharding extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvSharding";
			private CsvSharding(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long column(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_column(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long modulo(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_modulo(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public CsvSharding(java.lang.Long id, java.lang.Long column, java.lang.Long modulo){
				this(GreyCat.DEFAULT, id, column, modulo);
			}
			public CsvSharding(GreyCat greycat, java.lang.Long id, java.lang.Long column, java.lang.Long modulo){
				this(greycat.libs_by_name.get(std.name).mapped[55], id, column, modulo);
			}
		}
		public static final class Email extends GreyCat.Object {
			public static final java.lang.String name = "io::Email";
			private Email(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String from(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_from(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String subject(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_subject(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.String body(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_body(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean body_is_html(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_body_is_html(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.core.Array<java.lang.String> to(){
				return (std.core.Array<java.lang.String>) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_to(std.core.Array<java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public std.core.Array<java.lang.String> cc(){
				return (std.core.Array<java.lang.String>) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_cc(std.core.Array<java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public std.core.Array<java.lang.String> bcc(){
				return (std.core.Array<java.lang.String>) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_bcc(std.core.Array<java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public Email(java.lang.String from, java.lang.String subject, java.lang.String body, java.lang.Boolean body_is_html, std.core.Array<java.lang.String> to, std.core.Array<java.lang.String> cc, std.core.Array<java.lang.String> bcc){
				this(GreyCat.DEFAULT, from, subject, body, body_is_html, to, cc, bcc);
			}
			public Email(GreyCat greycat, java.lang.String from, java.lang.String subject, java.lang.String body, java.lang.Boolean body_is_html, std.core.Array<java.lang.String> to, std.core.Array<java.lang.String> cc, std.core.Array<java.lang.String> bcc){
				this(greycat.libs_by_name.get(std.name).mapped[56], from, subject, body, body_is_html, to, cc, bcc);
			}
		}
		public static final class CsvReader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvReader";
			private CsvReader(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long pos(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_pos(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.io.CsvFormat format(){
				return (std.io.CsvFormat) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_format(std.io.CsvFormat v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public std.io.CsvSharding sharding(){
				return (std.io.CsvSharding) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_sharding(std.io.CsvSharding v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public CsvReader(java.lang.String path, java.lang.Long pos, std.io.CsvFormat format, std.io.CsvSharding sharding){
				this(GreyCat.DEFAULT, path, pos, format, sharding);
			}
			public CsvReader(GreyCat greycat, java.lang.String path, java.lang.Long pos, std.io.CsvFormat format, std.io.CsvSharding sharding){
				this(greycat.libs_by_name.get(std.name).mapped[57], path, pos, format, sharding);
			}
		}
		public static final class Reader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::Reader";
			private Reader(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long pos(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_pos(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Reader(java.lang.String path, java.lang.Long pos){
				this(GreyCat.DEFAULT, path, pos);
			}
			public Reader(GreyCat greycat, java.lang.String path, java.lang.Long pos){
				this(greycat.libs_by_name.get(std.name).mapped[58], path, pos);
			}
		}
		public static final class Http extends GreyCat.Object {
			public static final java.lang.String name = "io::Http";
			private Http(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public Http(){
				this(GreyCat.DEFAULT);
			}
			public Http(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[59]);
			}
		}
		public static final class CsvWriter<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvWriter";
			private CsvWriter(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean append(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_append(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.io.CsvFormat format(){
				return (std.io.CsvFormat) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_format(std.io.CsvFormat v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public CsvWriter(java.lang.String path, java.lang.Boolean append, std.io.CsvFormat format){
				this(GreyCat.DEFAULT, path, append, format);
			}
			public CsvWriter(GreyCat greycat, java.lang.String path, java.lang.Boolean append, std.io.CsvFormat format){
				this(greycat.libs_by_name.get(std.name).mapped[60], path, append, format);
			}
		}
		public static final class TextReader extends GreyCat.Object {
			public static final java.lang.String name = "io::TextReader";
			private TextReader(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long pos(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_pos(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public TextReader(java.lang.String path, java.lang.Long pos){
				this(GreyCat.DEFAULT, path, pos);
			}
			public TextReader(GreyCat greycat, java.lang.String path, java.lang.Long pos){
				this(greycat.libs_by_name.get(std.name).mapped[61], path, pos);
			}
		}
		public static final class CsvStatistics extends GreyCat.Object {
			public static final java.lang.String name = "io::CsvStatistics";
			private CsvStatistics(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long header_lines(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_header_lines(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Character separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Character string_delimiter(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_string_delimiter(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Character decimal_separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_decimal_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Character thousands_separator(){
				return (java.lang.Character) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_thousands_separator(java.lang.Character v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public std.core.Array<std.io.CsvColumnStatistics> columns(){
				return (std.core.Array<std.io.CsvColumnStatistics>) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_columns(std.core.Array<std.io.CsvColumnStatistics> v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.Long line_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_line_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public java.lang.Long fail_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_fail_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public java.lang.Long file_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_file_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public CsvStatistics(java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, std.core.Array<std.io.CsvColumnStatistics> columns, java.lang.Long line_count, java.lang.Long fail_count, java.lang.Long file_count){
				this(GreyCat.DEFAULT, header_lines, separator, string_delimiter, decimal_separator, thousands_separator, columns, line_count, fail_count, file_count);
			}
			public CsvStatistics(GreyCat greycat, java.lang.Long header_lines, java.lang.Character separator, java.lang.Character string_delimiter, java.lang.Character decimal_separator, java.lang.Character thousands_separator, std.core.Array<std.io.CsvColumnStatistics> columns, java.lang.Long line_count, java.lang.Long fail_count, java.lang.Long file_count){
				this(greycat.libs_by_name.get(std.name).mapped[62], header_lines, separator, string_delimiter, decimal_separator, thousands_separator, columns, line_count, fail_count, file_count);
			}
		}
		public static final class JsonWriter<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::JsonWriter";
			private JsonWriter(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean append(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_append(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public JsonWriter(java.lang.String path, java.lang.Boolean append){
				this(GreyCat.DEFAULT, path, append);
			}
			public JsonWriter(GreyCat greycat, java.lang.String path, java.lang.Boolean append){
				this(greycat.libs_by_name.get(std.name).mapped[63], path, append);
			}
		}
		public static final class JsonReader<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::JsonReader";
			private JsonReader(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long pos(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_pos(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public JsonReader(java.lang.String path, java.lang.Long pos){
				this(GreyCat.DEFAULT, path, pos);
			}
			public JsonReader(GreyCat greycat, java.lang.String path, java.lang.Long pos){
				this(greycat.libs_by_name.get(std.name).mapped[64], path, pos);
			}
		}
		public static final class Json<T> extends GreyCat.Object {
			public static final java.lang.String name = "io::Json";
			private Json(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public Json(){
				this(GreyCat.DEFAULT);
			}
			public Json(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[65]);
			}
		}
		public static final class Csv extends GreyCat.Object {
			public static final java.lang.String name = "io::Csv";
			private Csv(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static std.core.Table sample(std.io.CsvReader reader, java.lang.Long max_lines) throws java.io.IOException {
				return sample(GreyCat.DEFAULT, reader, max_lines);
			}
			public static std.core.Table sample(GreyCat greycat, std.io.CsvReader reader, java.lang.Long max_lines) throws java.io.IOException {
				return (std.core.Table) greycat.call("io::Csv::sample", reader, max_lines);
			}
			public static std.io.CsvStatistics analyze(std.core.Array<std.io.File> files, std.io.CsvAnalysisConfig config) throws java.io.IOException {
				return analyze(GreyCat.DEFAULT, files, config);
			}
			public static std.io.CsvStatistics analyze(GreyCat greycat, std.core.Array<std.io.File> files, std.io.CsvAnalysisConfig config) throws java.io.IOException {
				return (std.io.CsvStatistics) greycat.call("io::Csv::analyze", files, config);
			}
			public static java.lang.String generate(std.io.CsvStatistics stats) throws java.io.IOException {
				return generate(GreyCat.DEFAULT, stats);
			}
			public static java.lang.String generate(GreyCat greycat, std.io.CsvStatistics stats) throws java.io.IOException {
				return (java.lang.String) greycat.call("io::Csv::generate", stats);
			}
			public Csv(){
				this(GreyCat.DEFAULT);
			}
			public Csv(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[66]);
			}
		}
		public static final class Smtp extends GreyCat.Object {
			public static final java.lang.String name = "io::Smtp";
			private Smtp(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String host(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_host(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long port(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_port(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.io.SmtpMode mode(){
				return (std.io.SmtpMode) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_mode(std.io.SmtpMode v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public std.io.SmtpAuth authenticate(){
				return (std.io.SmtpAuth) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_authenticate(std.io.SmtpAuth v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.String user(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_user(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.String pass(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_pass(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public Smtp(java.lang.String host, java.lang.Long port, std.io.SmtpMode mode, std.io.SmtpAuth authenticate, java.lang.String user, java.lang.String pass){
				this(GreyCat.DEFAULT, host, port, mode, authenticate, user, pass);
			}
			public Smtp(GreyCat greycat, java.lang.String host, java.lang.Long port, std.io.SmtpMode mode, std.io.SmtpAuth authenticate, java.lang.String user, java.lang.String pass){
				this(greycat.libs_by_name.get(std.name).mapped[67], host, port, mode, authenticate, user, pass);
			}
		}
		public static final class FileWalker extends GreyCat.Object {
			public static final java.lang.String name = "io::FileWalker";
			private FileWalker(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String path(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_path(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public FileWalker(java.lang.String path){
				this(GreyCat.DEFAULT, path);
			}
			public FileWalker(GreyCat greycat, java.lang.String path){
				this(greycat.libs_by_name.get(std.name).mapped[68], path);
			}
		}
		public static final class HttpHeader extends GreyCat.Object {
			public static final java.lang.String name = "io::HttpHeader";
			private HttpHeader(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String value(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_value(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public HttpHeader(java.lang.String name, java.lang.String value){
				this(GreyCat.DEFAULT, name, value);
			}
			public HttpHeader(GreyCat greycat, java.lang.String name, java.lang.String value){
				this(greycat.libs_by_name.get(std.name).mapped[69], name, value);
			}
		}
	}
	public static final class runtime {
		public static final class LogLevel extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::LogLevel";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("error", 0);
				put("warn", 1);
				put("info", 2);
				put("perf", 3);
				put("trace", 4);
			}});
			private LogLevel(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static LogLevel get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static LogLevel get(java.lang.String key, GreyCat greycat) {
				return (LogLevel) greycat.libs_by_name.get(std.name).mapped[70].enum_values[indicesByValue.get(key)];
			}
			public LogLevel(){
				this(GreyCat.DEFAULT);
			}
			public LogLevel(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[70]);
			}
		}
		public static final class RuntimeInfo extends GreyCat.Object {
			public static final java.lang.String name = "runtime::RuntimeInfo";
			private RuntimeInfo(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String version(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_version(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String program_version(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_program_version(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.String arch(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_arch(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public std.core.TimeZone timezone(){
				return (std.core.TimeZone) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_timezone(std.core.TimeZone v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.runtime.License license(){
				return (std.runtime.License) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_license(std.runtime.License v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Long io_threads(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_io_threads(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.Long bg_threads(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_bg_threads(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public java.lang.Long fg_threads(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_fg_threads(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public java.lang.Long mem_total(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_mem_total(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public java.lang.Long mem_worker(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[9]);
			}
			public void set_mem_worker(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[9],v);
			}
			public java.lang.Long disk_data_bytes(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[10]);
			}
			public void set_disk_data_bytes(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[10],v);
			}
			public RuntimeInfo(java.lang.String version, java.lang.String program_version, java.lang.String arch, std.core.TimeZone timezone, std.runtime.License license, java.lang.Long io_threads, java.lang.Long bg_threads, java.lang.Long fg_threads, java.lang.Long mem_total, java.lang.Long mem_worker, java.lang.Long disk_data_bytes){
				this(GreyCat.DEFAULT, version, program_version, arch, timezone, license, io_threads, bg_threads, fg_threads, mem_total, mem_worker, disk_data_bytes);
			}
			public RuntimeInfo(GreyCat greycat, java.lang.String version, java.lang.String program_version, java.lang.String arch, std.core.TimeZone timezone, std.runtime.License license, java.lang.Long io_threads, java.lang.Long bg_threads, java.lang.Long fg_threads, java.lang.Long mem_total, java.lang.Long mem_worker, java.lang.Long disk_data_bytes){
				this(greycat.libs_by_name.get(std.name).mapped[71], version, program_version, arch, timezone, license, io_threads, bg_threads, fg_threads, mem_total, mem_worker, disk_data_bytes);
			}
		}
		public static final class SecurityEntity extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityEntity";
			private SecurityEntity(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean activated(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_activated(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public static java.lang.Long set(std.runtime.SecurityEntity entity) throws java.io.IOException {
				return set(GreyCat.DEFAULT, entity);
			}
			public static java.lang.Long set(GreyCat greycat, std.runtime.SecurityEntity entity) throws java.io.IOException {
				return (java.lang.Long) greycat.call("runtime::SecurityEntity::set", entity);
			}
			public static std.core.Array<std.runtime.SecurityEntity> all() throws java.io.IOException {
				return all(GreyCat.DEFAULT);
			}
			public static std.core.Array<std.runtime.SecurityEntity> all(GreyCat greycat) throws java.io.IOException {
				return (std.core.Array<std.runtime.SecurityEntity>) greycat.call("runtime::SecurityEntity::all");
			}
			public SecurityEntity(java.lang.Long id, java.lang.String name, java.lang.Boolean activated){
				this(GreyCat.DEFAULT, id, name, activated);
			}
			public SecurityEntity(GreyCat greycat, java.lang.Long id, java.lang.String name, java.lang.Boolean activated){
				this(greycat.libs_by_name.get(std.name).mapped[72], id, name, activated);
			}
		}
		public static final class Debug extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Debug";
			private Debug(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.Array<std.runtime.Frame> frames(){
				return (std.core.Array<std.runtime.Frame>) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_frames(std.core.Array<std.runtime.Frame> v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Object root(){
				return  super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_root(java.lang.Object v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public static void resume(java.lang.Long id) throws java.io.IOException {
				resume(GreyCat.DEFAULT, id);
			}
			public static void resume(GreyCat greycat, java.lang.Long id) throws java.io.IOException {
				greycat.call("runtime::Debug::resume", id);
			}
			public static std.runtime.Debug get(java.lang.Long id) throws java.io.IOException {
				return get(GreyCat.DEFAULT, id);
			}
			public static std.runtime.Debug get(GreyCat greycat, java.lang.Long id) throws java.io.IOException {
				return (std.runtime.Debug) greycat.call("runtime::Debug::get", id);
			}
			public static std.core.Array<java.lang.Long> all() throws java.io.IOException {
				return all(GreyCat.DEFAULT);
			}
			public static std.core.Array<java.lang.Long> all(GreyCat greycat) throws java.io.IOException {
				return (std.core.Array<java.lang.Long>) greycat.call("runtime::Debug::all");
			}
			public Debug(java.lang.Long id, std.core.Array<std.runtime.Frame> frames, java.lang.Object root){
				this(GreyCat.DEFAULT, id, frames, root);
			}
			public Debug(GreyCat greycat, java.lang.Long id, std.core.Array<std.runtime.Frame> frames, java.lang.Object root){
				this(greycat.libs_by_name.get(std.name).mapped[73], id, frames, root);
			}
		}
		public static final class Role extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Role";
			private Role(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.Array<java.lang.String> permissions(){
				return (std.core.Array<java.lang.String>) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_permissions(std.core.Array<java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public static std.core.Array<std.runtime.Role> all() throws java.io.IOException {
				return all(GreyCat.DEFAULT);
			}
			public static std.core.Array<std.runtime.Role> all(GreyCat greycat) throws java.io.IOException {
				return (std.core.Array<std.runtime.Role>) greycat.call("runtime::Role::all");
			}
			public Role(java.lang.String name, std.core.Array<java.lang.String> permissions){
				this(GreyCat.DEFAULT, name, permissions);
			}
			public Role(GreyCat greycat, java.lang.String name, std.core.Array<java.lang.String> permissions){
				this(greycat.libs_by_name.get(std.name).mapped[74], name, permissions);
			}
		}
		public static final class Log extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Log";
			private Log(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.runtime.LogLevel level(){
				return (std.runtime.LogLevel) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_level(std.runtime.LogLevel v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.time time(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_time(std.core.time v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long user_id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_user_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Long id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Long id2(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_id2(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.String src(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_src(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.String tag(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_tag(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public java.lang.Object data(){
				return  super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_data(java.lang.Object v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public Log(std.runtime.LogLevel level, std.core.time time, java.lang.Long user_id, java.lang.Long id, java.lang.Long id2, java.lang.String src, java.lang.String tag, java.lang.Object data){
				this(GreyCat.DEFAULT, level, time, user_id, id, id2, src, tag, data);
			}
			public Log(GreyCat greycat, std.runtime.LogLevel level, std.core.time time, java.lang.Long user_id, java.lang.Long id, java.lang.Long id2, java.lang.String src, java.lang.String tag, java.lang.Object data){
				this(greycat.libs_by_name.get(std.name).mapped[75], level, time, user_id, id, id2, src, tag, data);
			}
		}
		public static final class Variable extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Variable";
			private Variable(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Object value(){
				return  super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_value(java.lang.Object v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Variable(java.lang.String name, java.lang.Object value){
				this(GreyCat.DEFAULT, name, value);
			}
			public Variable(GreyCat greycat, java.lang.String name, java.lang.Object value){
				this(greycat.libs_by_name.get(std.name).mapped[76], name, value);
			}
		}
		public static final class OpenIDConnect extends GreyCat.Object {
			public static final java.lang.String name = "runtime::OpenIDConnect";
			private OpenIDConnect(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String url(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_url(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String clientId(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_clientId(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public static std.runtime.OpenIDConnect config() throws java.io.IOException {
				return config(GreyCat.DEFAULT);
			}
			public static std.runtime.OpenIDConnect config(GreyCat greycat) throws java.io.IOException {
				return (std.runtime.OpenIDConnect) greycat.call("runtime::OpenIDConnect::config");
			}
			public OpenIDConnect(java.lang.String url, java.lang.String clientId){
				this(GreyCat.DEFAULT, url, clientId);
			}
			public OpenIDConnect(GreyCat greycat, java.lang.String url, java.lang.String clientId){
				this(greycat.libs_by_name.get(std.name).mapped[77], url, clientId);
			}
		}
		public static final class License extends GreyCat.Object {
			public static final java.lang.String name = "runtime::License";
			private License(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.time start(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_start(std.core.time v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.core.time end(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_end(std.core.time v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.String company(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_company(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Long max_memory(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_max_memory(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Long extra_1(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_extra_1(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.Long extra_2(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_extra_2(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public std.runtime.LicenseType type(){
				return (std.runtime.LicenseType) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_type(std.runtime.LicenseType v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public License(java.lang.String name, std.core.time start, std.core.time end, java.lang.String company, java.lang.Long max_memory, java.lang.Long extra_1, java.lang.Long extra_2, std.runtime.LicenseType type){
				this(GreyCat.DEFAULT, name, start, end, company, max_memory, extra_1, extra_2, type);
			}
			public License(GreyCat greycat, java.lang.String name, std.core.time start, std.core.time end, java.lang.String company, java.lang.Long max_memory, java.lang.Long extra_1, java.lang.Long extra_2, std.runtime.LicenseType type){
				this(greycat.libs_by_name.get(std.name).mapped[78], name, start, end, company, max_memory, extra_1, extra_2, type);
			}
		}
		public static final class UserGroupPolicy extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserGroupPolicy";
			private UserGroupPolicy(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long group_id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_group_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.runtime.UserGroupPolicyType type(){
				return (std.runtime.UserGroupPolicyType) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_type(std.runtime.UserGroupPolicyType v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public UserGroupPolicy(java.lang.Long group_id, std.runtime.UserGroupPolicyType type){
				this(GreyCat.DEFAULT, group_id, type);
			}
			public UserGroupPolicy(GreyCat greycat, java.lang.Long group_id, std.runtime.UserGroupPolicyType type){
				this(greycat.libs_by_name.get(std.name).mapped[79], group_id, type);
			}
		}
		public static final class User extends GreyCat.Object {
			public static final java.lang.String name = "runtime::User";
			private User(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean activated(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_activated(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.String full_name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_full_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.String email(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_email(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.String role(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_role(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public std.core.Array<std.runtime.UserGroupPolicy> groups(){
				return (std.core.Array<std.runtime.UserGroupPolicy>) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_groups(std.core.Array<std.runtime.UserGroupPolicy> v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public java.lang.Long groups_flags(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_groups_flags(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public java.lang.Boolean external(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_external(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public static java.lang.Boolean setPassword(java.lang.String name, java.lang.String pass) throws java.io.IOException {
				return setPassword(GreyCat.DEFAULT, name, pass);
			}
			public static java.lang.Boolean setPassword(GreyCat greycat, java.lang.String name, java.lang.String pass) throws java.io.IOException {
				return (java.lang.Boolean) greycat.call("runtime::User::setPassword", name, pass);
			}
			public static std.core.Array<java.lang.String> permissions() throws java.io.IOException {
				return permissions(GreyCat.DEFAULT);
			}
			public static std.core.Array<java.lang.String> permissions(GreyCat greycat) throws java.io.IOException {
				return (std.core.Array<java.lang.String>) greycat.call("runtime::User::permissions");
			}
			public static std.runtime.User me() throws java.io.IOException {
				return me(GreyCat.DEFAULT);
			}
			public static std.runtime.User me(GreyCat greycat) throws java.io.IOException {
				return (std.runtime.User) greycat.call("runtime::User::me");
			}
			public static java.lang.Long current() throws java.io.IOException {
				return current(GreyCat.DEFAULT);
			}
			public static java.lang.Long current(GreyCat greycat) throws java.io.IOException {
				return (java.lang.Long) greycat.call("runtime::User::current");
			}
			public static java.lang.String renew(java.lang.Boolean use_cookie) throws java.io.IOException {
				return renew(GreyCat.DEFAULT, use_cookie);
			}
			public static java.lang.String renew(GreyCat greycat, java.lang.Boolean use_cookie) throws java.io.IOException {
				return (java.lang.String) greycat.call("runtime::User::renew", use_cookie);
			}
			public static void logout() throws java.io.IOException {
				logout(GreyCat.DEFAULT);
			}
			public static void logout(GreyCat greycat) throws java.io.IOException {
				greycat.call("runtime::User::logout");
			}
			public static java.lang.String tokenLogin(java.lang.String token, java.lang.Boolean use_cookie) throws java.io.IOException {
				return tokenLogin(GreyCat.DEFAULT, token, use_cookie);
			}
			public static java.lang.String tokenLogin(GreyCat greycat, java.lang.String token, java.lang.Boolean use_cookie) throws java.io.IOException {
				return (java.lang.String) greycat.call("runtime::User::tokenLogin", token, use_cookie);
			}
			public static java.lang.String login(java.lang.String credentials, java.lang.Boolean use_cookie) throws java.io.IOException {
				return login(GreyCat.DEFAULT, credentials, use_cookie);
			}
			public static java.lang.String login(GreyCat greycat, java.lang.String credentials, java.lang.Boolean use_cookie) throws java.io.IOException {
				return (java.lang.String) greycat.call("runtime::User::login", credentials, use_cookie);
			}
			public User(java.lang.Long id, java.lang.String name, java.lang.Boolean activated, java.lang.String full_name, java.lang.String email, java.lang.String role, std.core.Array<std.runtime.UserGroupPolicy> groups, java.lang.Long groups_flags, java.lang.Boolean external){
				this(GreyCat.DEFAULT, id, name, activated, full_name, email, role, groups, groups_flags, external);
			}
			public User(GreyCat greycat, java.lang.Long id, java.lang.String name, java.lang.Boolean activated, java.lang.String full_name, java.lang.String email, java.lang.String role, std.core.Array<std.runtime.UserGroupPolicy> groups, java.lang.Long groups_flags, java.lang.Boolean external){
				this(greycat.libs_by_name.get(std.name).mapped[80], id, name, activated, full_name, email, role, groups, groups_flags, external);
			}
		}
		public static final class Job<T> extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Job";
			private Job(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.function function(){
				return (std.core.function) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_function(std.core.function v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.Array arguments(){
				return (std.core.Array) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_arguments(std.core.Array v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Job(std.core.function function, std.core.Array arguments){
				this(GreyCat.DEFAULT, function, arguments);
			}
			public Job(GreyCat greycat, std.core.function function, std.core.Array arguments){
				this(greycat.libs_by_name.get(std.name).mapped[81], function, arguments);
			}
		}
		public static final class SecurityFields extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityFields";
			private SecurityFields(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String email(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_email(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.String first_name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_first_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.String last_name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_last_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.core.Map<java.lang.String, java.lang.String> roles(){
				return (std.core.Map<java.lang.String, java.lang.String>) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_roles(std.core.Map<java.lang.String, java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public std.core.Map<java.lang.String, java.lang.String> groups(){
				return (std.core.Map<java.lang.String, java.lang.String>) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_groups(std.core.Map<java.lang.String, java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public static std.runtime.SecurityFields get() throws java.io.IOException {
				return get(GreyCat.DEFAULT);
			}
			public static std.runtime.SecurityFields get(GreyCat greycat) throws java.io.IOException {
				return (std.runtime.SecurityFields) greycat.call("runtime::SecurityFields::get");
			}
			public static void set(std.runtime.SecurityFields f) throws java.io.IOException {
				set(GreyCat.DEFAULT, f);
			}
			public static void set(GreyCat greycat, std.runtime.SecurityFields f) throws java.io.IOException {
				greycat.call("runtime::SecurityFields::set", f);
			}
			public SecurityFields(java.lang.String email, java.lang.String name, java.lang.String first_name, java.lang.String last_name, std.core.Map<java.lang.String, java.lang.String> roles, std.core.Map<java.lang.String, java.lang.String> groups){
				this(GreyCat.DEFAULT, email, name, first_name, last_name, roles, groups);
			}
			public SecurityFields(GreyCat greycat, java.lang.String email, java.lang.String name, java.lang.String first_name, java.lang.String last_name, std.core.Map<java.lang.String, java.lang.String> roles, std.core.Map<java.lang.String, java.lang.String> groups){
				this(greycat.libs_by_name.get(std.name).mapped[82], email, name, first_name, last_name, roles, groups);
			}
		}
		public static final class TaskStatus extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::TaskStatus";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("empty", 0);
				put("waiting", 1);
				put("running", 2);
				put("await", 3);
				put("cancelled", 4);
				put("error", 5);
				put("ended", 6);
				put("ended_with_errors", 7);
			}});
			private TaskStatus(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static TaskStatus get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static TaskStatus get(java.lang.String key, GreyCat greycat) {
				return (TaskStatus) greycat.libs_by_name.get(std.name).mapped[83].enum_values[indicesByValue.get(key)];
			}
			public TaskStatus(){
				this(GreyCat.DEFAULT);
			}
			public TaskStatus(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[83]);
			}
		}
		public static final class LicenseType extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::LicenseType";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("community", 0);
				put("enterprise", 1);
				put("testing", 2);
			}});
			private LicenseType(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static LicenseType get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static LicenseType get(java.lang.String key, GreyCat greycat) {
				return (LicenseType) greycat.libs_by_name.get(std.name).mapped[84].enum_values[indicesByValue.get(key)];
			}
			public LicenseType(){
				this(GreyCat.DEFAULT);
			}
			public LicenseType(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[84]);
			}
		}
		public static final class Frame extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Frame";
			private Frame(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String module(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_module(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String type(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_type(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.String function(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_function(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.String src(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_src(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Long line(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_line(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Long column(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_column(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public std.core.Array<std.runtime.Variable> scope(){
				return (std.core.Array<std.runtime.Variable>) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_scope(std.core.Array<std.runtime.Variable> v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public Frame(java.lang.String module, java.lang.String type, java.lang.String function, java.lang.String src, java.lang.Long line, java.lang.Long column, std.core.Array<std.runtime.Variable> scope){
				this(GreyCat.DEFAULT, module, type, function, src, line, column, scope);
			}
			public Frame(GreyCat greycat, java.lang.String module, java.lang.String type, java.lang.String function, java.lang.String src, java.lang.Long line, java.lang.Long column, std.core.Array<std.runtime.Variable> scope){
				this(greycat.libs_by_name.get(std.name).mapped[85], module, type, function, src, line, column, scope);
			}
		}
		public static final class UserGroup extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserGroup";
			private UserGroup(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean activated(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_activated(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public UserGroup(java.lang.Long id, java.lang.String name, java.lang.Boolean activated){
				this(GreyCat.DEFAULT, id, name, activated);
			}
			public UserGroup(GreyCat greycat, java.lang.Long id, java.lang.String name, java.lang.Boolean activated){
				this(greycat.libs_by_name.get(std.name).mapped[86], id, name, activated);
			}
		}
		public static final class CallPerf extends GreyCat.Object {
			public static final java.lang.String name = "runtime::CallPerf";
			private CallPerf(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.duration duration(){
				return (std.core.duration) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_duration(std.core.duration v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long bytes_write_disk(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_bytes_write_disk(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long bytes_write_disk_raw(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_bytes_write_disk_raw(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Long bytes_read_disk(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_bytes_read_disk(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Long bytes_read_disk_raw(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_bytes_read_disk_raw(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Long bytes_read_cache(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_bytes_read_cache(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public CallPerf(std.core.duration duration, java.lang.Long bytes_write_disk, java.lang.Long bytes_write_disk_raw, java.lang.Long bytes_read_disk, java.lang.Long bytes_read_disk_raw, java.lang.Long bytes_read_cache){
				this(GreyCat.DEFAULT, duration, bytes_write_disk, bytes_write_disk_raw, bytes_read_disk, bytes_read_disk_raw, bytes_read_cache);
			}
			public CallPerf(GreyCat greycat, std.core.duration duration, java.lang.Long bytes_write_disk, java.lang.Long bytes_write_disk_raw, java.lang.Long bytes_read_disk, java.lang.Long bytes_read_disk_raw, java.lang.Long bytes_read_cache){
				this(greycat.libs_by_name.get(std.name).mapped[87], duration, bytes_write_disk, bytes_write_disk_raw, bytes_read_disk, bytes_read_disk_raw, bytes_read_cache);
			}
		}
		public static final class SecurityPolicy extends GreyCat.Object {
			public static final java.lang.String name = "runtime::SecurityPolicy";
			private SecurityPolicy(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.Array<std.runtime.SecurityEntity> entities(){
				return (std.core.Array<std.runtime.SecurityEntity>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_entities(std.core.Array<std.runtime.SecurityEntity> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.Map<java.lang.String, std.runtime.UserCredential> credentials(){
				return (std.core.Map<java.lang.String, std.runtime.UserCredential>) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_credentials(std.core.Map<java.lang.String, std.runtime.UserCredential> v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.runtime.SecurityFields fields(){
				return (std.runtime.SecurityFields) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_fields(std.runtime.SecurityFields v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public std.core.Map<java.lang.String, java.lang.String> keys(){
				return (std.core.Map<java.lang.String, java.lang.String>) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_keys(std.core.Map<java.lang.String, java.lang.String> v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.core.time keys_last_refresh(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_keys_last_refresh(std.core.time v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public SecurityPolicy(std.core.Array<std.runtime.SecurityEntity> entities, std.core.Map<java.lang.String, std.runtime.UserCredential> credentials, std.runtime.SecurityFields fields, std.core.Map<java.lang.String, java.lang.String> keys, std.core.time keys_last_refresh){
				this(GreyCat.DEFAULT, entities, credentials, fields, keys, keys_last_refresh);
			}
			public SecurityPolicy(GreyCat greycat, std.core.Array<std.runtime.SecurityEntity> entities, std.core.Map<java.lang.String, std.runtime.UserCredential> credentials, std.runtime.SecurityFields fields, std.core.Map<java.lang.String, java.lang.String> keys, std.core.time keys_last_refresh){
				this(greycat.libs_by_name.get(std.name).mapped[88], entities, credentials, fields, keys, keys_last_refresh);
			}
		}
		public static final class Runtime extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Runtime";
			private Runtime(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
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
			public static std.runtime.RuntimeInfo info() throws java.io.IOException {
				return info(GreyCat.DEFAULT);
			}
			public static std.runtime.RuntimeInfo info(GreyCat greycat) throws java.io.IOException {
				return (std.runtime.RuntimeInfo) greycat.call("runtime::Runtime::info");
			}
			public Runtime(){
				this(GreyCat.DEFAULT);
			}
			public Runtime(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[89]);
			}
		}
		public static final class PeriodicTask extends GreyCat.Object {
			public static final java.lang.String name = "runtime::PeriodicTask";
			private PeriodicTask(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.function function(){
				return (std.core.function) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_function(std.core.function v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long user_id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_user_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.core.Array arguments(){
				return (std.core.Array) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_arguments(std.core.Array v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public std.core.time start(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_start(std.core.time v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.core.duration every(){
				return (std.core.duration) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_every(std.core.duration v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public static void set(std.core.Array<std.runtime.PeriodicTask> tasks) throws java.io.IOException {
				set(GreyCat.DEFAULT, tasks);
			}
			public static void set(GreyCat greycat, std.core.Array<std.runtime.PeriodicTask> tasks) throws java.io.IOException {
				greycat.call("runtime::PeriodicTask::set", tasks);
			}
			public static std.core.Array<std.runtime.PeriodicTask> all() throws java.io.IOException {
				return all(GreyCat.DEFAULT);
			}
			public static std.core.Array<std.runtime.PeriodicTask> all(GreyCat greycat) throws java.io.IOException {
				return (std.core.Array<std.runtime.PeriodicTask>) greycat.call("runtime::PeriodicTask::all");
			}
			public PeriodicTask(std.core.function function, java.lang.Long user_id, std.core.Array arguments, std.core.time start, std.core.duration every){
				this(GreyCat.DEFAULT, function, user_id, arguments, start, every);
			}
			public PeriodicTask(GreyCat greycat, std.core.function function, java.lang.Long user_id, std.core.Array arguments, std.core.time start, std.core.duration every){
				this(greycat.libs_by_name.get(std.name).mapped[90], function, user_id, arguments, start, every);
			}
		}
		public static final class UserGroupPolicyType extends GreyCat.Enum {
			public static final java.lang.String name = "runtime::UserGroupPolicyType";
			private final static java.util.Map<java.lang.String, java.lang.Integer> indicesByValue = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.Integer>() {{
				put("read", 0);
				put("write", 1);
				put("execute", 2);
			}});
			private UserGroupPolicyType(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static UserGroupPolicyType get(java.lang.String key) {
				return get(key, GreyCat.DEFAULT);
			}
			public static UserGroupPolicyType get(java.lang.String key, GreyCat greycat) {
				return (UserGroupPolicyType) greycat.libs_by_name.get(std.name).mapped[91].enum_values[indicesByValue.get(key)];
			}
			public UserGroupPolicyType(){
				this(GreyCat.DEFAULT);
			}
			public UserGroupPolicyType(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[91]);
			}
		}
		public static final class System extends GreyCat.Object {
			public static final java.lang.String name = "runtime::System";
			private System(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public System(){
				this(GreyCat.DEFAULT);
			}
			public System(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[92]);
			}
		}
		public static final class UserCredential extends GreyCat.Object {
			public static final java.lang.String name = "runtime::UserCredential";
			private UserCredential(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long offset(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_offset(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String pass(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_pass(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public UserCredential(java.lang.Long offset, java.lang.String pass){
				this(GreyCat.DEFAULT, offset, pass);
			}
			public UserCredential(GreyCat greycat, java.lang.Long offset, java.lang.String pass){
				this(greycat.libs_by_name.get(std.name).mapped[93], offset, pass);
			}
		}
		public static final class Permission extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Permission";
			private Permission(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.String description(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_description(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public static std.core.Array<std.runtime.Permission> all() throws java.io.IOException {
				return all(GreyCat.DEFAULT);
			}
			public static std.core.Array<std.runtime.Permission> all(GreyCat greycat) throws java.io.IOException {
				return (std.core.Array<std.runtime.Permission>) greycat.call("runtime::Permission::all");
			}
			public Permission(java.lang.String name, java.lang.String description){
				this(GreyCat.DEFAULT, name, description);
			}
			public Permission(GreyCat greycat, java.lang.String name, java.lang.String description){
				this(greycat.libs_by_name.get(std.name).mapped[94], name, description);
			}
		}
		public static final class Task extends GreyCat.Object {
			public static final java.lang.String name = "runtime::Task";
			private Task(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long user_id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_user_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long task_id(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_task_id(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.String mod(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_mod(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.String type(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_type(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.String fun(){
				return (java.lang.String) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_fun(java.lang.String v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public std.core.time creation(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_creation(std.core.time v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public std.core.time start(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_start(std.core.time v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public std.core.duration duration(){
				return (std.core.duration) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_duration(std.core.duration v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public std.runtime.TaskStatus status(){
				return (std.runtime.TaskStatus) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_status(std.runtime.TaskStatus v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public java.lang.Double progress(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[9]);
			}
			public void set_progress(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[9],v);
			}
			public static java.lang.Boolean is_running(java.lang.Long task_id) throws java.io.IOException {
				return is_running(GreyCat.DEFAULT, task_id);
			}
			public static java.lang.Boolean is_running(GreyCat greycat, java.lang.Long task_id) throws java.io.IOException {
				return (java.lang.Boolean) greycat.call("runtime::Task::is_running", task_id);
			}
			public static java.lang.Boolean cancel(java.lang.Long task_id) throws java.io.IOException {
				return cancel(GreyCat.DEFAULT, task_id);
			}
			public static java.lang.Boolean cancel(GreyCat greycat, java.lang.Long task_id) throws java.io.IOException {
				return (java.lang.Boolean) greycat.call("runtime::Task::cancel", task_id);
			}
			public static std.core.Array<std.runtime.Task> history(java.lang.Long offset, java.lang.Long max) throws java.io.IOException {
				return history(GreyCat.DEFAULT, offset, max);
			}
			public static std.core.Array<std.runtime.Task> history(GreyCat greycat, java.lang.Long offset, java.lang.Long max) throws java.io.IOException {
				return (std.core.Array<std.runtime.Task>) greycat.call("runtime::Task::history", offset, max);
			}
			public static std.core.Array<std.runtime.Task> running() throws java.io.IOException {
				return running(GreyCat.DEFAULT);
			}
			public static std.core.Array<std.runtime.Task> running(GreyCat greycat) throws java.io.IOException {
				return (std.core.Array<std.runtime.Task>) greycat.call("runtime::Task::running");
			}
			public Task(java.lang.Long user_id, java.lang.Long task_id, java.lang.String mod, java.lang.String type, java.lang.String fun, std.core.time creation, std.core.time start, std.core.duration duration, std.runtime.TaskStatus status, java.lang.Double progress){
				this(GreyCat.DEFAULT, user_id, task_id, mod, type, fun, creation, start, duration, status, progress);
			}
			public Task(GreyCat greycat, java.lang.Long user_id, java.lang.Long task_id, java.lang.String mod, java.lang.String type, java.lang.String fun, std.core.time creation, std.core.time start, std.core.duration duration, std.runtime.TaskStatus status, java.lang.Double progress){
				this(greycat.libs_by_name.get(std.name).mapped[95], user_id, task_id, mod, type, fun, creation, start, duration, status, progress);
			}
		}
	}
	public static final class util {
		public static final class LinearQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::LinearQuantizer";
			private LinearQuantizer(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public T min(){
				return (T) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_min(T v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public T max(){
				return (T) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_max(T v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long bins(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_bins(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean open(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_open(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public LinearQuantizer(T min, T max, java.lang.Long bins, java.lang.Boolean open){
				this(GreyCat.DEFAULT, min, max, bins, open);
			}
			public LinearQuantizer(GreyCat greycat, T min, T max, java.lang.Long bins, java.lang.Boolean open){
				this(greycat.libs_by_name.get(std.name).mapped[96], min, max, bins, open);
			}
		}
		public static final class Gaussian<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Gaussian";
			private Gaussian(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double sum(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_sum(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Double sumsq(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_sumsq(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public T min(){
				return (T) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_min(T v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public T max(){
				return (T) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_max(T v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public Gaussian(java.lang.Double sum, java.lang.Double sumsq, java.lang.Long count, T min, T max){
				this(GreyCat.DEFAULT, sum, sumsq, count, min, max);
			}
			public Gaussian(GreyCat greycat, java.lang.Double sum, java.lang.Double sumsq, java.lang.Long count, T min, T max){
				this(greycat.libs_by_name.get(std.name).mapped[97], sum, sumsq, count, min, max);
			}
		}
		public static final class Stack<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Stack";
			private Stack(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.Array<T> values(){
				return (std.core.Array<T>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_values(std.core.Array<T> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public Stack(std.core.Array<T> values){
				this(GreyCat.DEFAULT, values);
			}
			public Stack(GreyCat greycat, std.core.Array<T> values){
				this(greycat.libs_by_name.get(std.name).mapped[98], values);
			}
		}
		public static final class GaussianProfile<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::GaussianProfile";
			private GaussianProfile(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.util.Quantizer<T> quantizer(){
				return (std.util.Quantizer<T>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_quantizer(std.util.Quantizer<T> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.FloatPrecision precision(){
				return (std.core.FloatPrecision) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_precision(std.core.FloatPrecision v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.core.Table<std.util.GaussianProfileSlot> bins(){
				return (std.core.Table<std.util.GaussianProfileSlot>) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_bins(std.core.Table<std.util.GaussianProfileSlot> v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Double value_min(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_value_min(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Long nb_rejected(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_nb_rejected(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public GaussianProfile(std.util.Quantizer<T> quantizer, std.core.FloatPrecision precision, std.core.Table<std.util.GaussianProfileSlot> bins, java.lang.Double value_min, java.lang.Long nb_rejected){
				this(GreyCat.DEFAULT, quantizer, precision, bins, value_min, nb_rejected);
			}
			public GaussianProfile(GreyCat greycat, std.util.Quantizer<T> quantizer, std.core.FloatPrecision precision, std.core.Table<std.util.GaussianProfileSlot> bins, java.lang.Double value_min, java.lang.Long nb_rejected){
				this(greycat.libs_by_name.get(std.name).mapped[99], quantizer, precision, bins, value_min, nb_rejected);
			}
		}
		public static final class ProgressTracker extends GreyCat.Object {
			public static final java.lang.String name = "util::ProgressTracker";
			private ProgressTracker(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.time start(){
				return (std.core.time) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_start(std.core.time v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long total(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_total(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long counter(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_counter(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public std.core.duration duration(){
				return (std.core.duration) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_duration(std.core.duration v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Double progress(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_progress(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public java.lang.Double speed(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_speed(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public std.core.duration remaining(){
				return (std.core.duration) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_remaining(std.core.duration v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public ProgressTracker(std.core.time start, java.lang.Long total, java.lang.Long counter, std.core.duration duration, java.lang.Double progress, java.lang.Double speed, std.core.duration remaining){
				this(GreyCat.DEFAULT, start, total, counter, duration, progress, speed, remaining);
			}
			public ProgressTracker(GreyCat greycat, std.core.time start, java.lang.Long total, java.lang.Long counter, std.core.duration duration, java.lang.Double progress, java.lang.Double speed, std.core.duration remaining){
				this(greycat.libs_by_name.get(std.name).mapped[100], start, total, counter, duration, progress, speed, remaining);
			}
		}
		public static final class Assert extends GreyCat.Object {
			public static final java.lang.String name = "util::Assert";
			private Assert(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public Assert(){
				this(GreyCat.DEFAULT);
			}
			public Assert(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[101]);
			}
		}
		public static final class MultiQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::MultiQuantizer";
			private MultiQuantizer(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.Array<std.util.Quantizer<T>> quantizers(){
				return (std.core.Array<std.util.Quantizer<T>>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_quantizers(std.core.Array<std.util.Quantizer<T>> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public MultiQuantizer(std.core.Array<std.util.Quantizer<T>> quantizers){
				this(GreyCat.DEFAULT, quantizers);
			}
			public MultiQuantizer(GreyCat greycat, std.core.Array<std.util.Quantizer<T>> quantizers){
				this(greycat.libs_by_name.get(std.name).mapped[102], quantizers);
			}
		}
		public static final class HistogramStats<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::HistogramStats";
			private HistogramStats(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public T min(){
				return (T) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_min(T v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public T max(){
				return (T) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_max(T v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public T whisker_low(){
				return (T) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_whisker_low(T v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public T whisker_high(){
				return (T) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_whisker_high(T v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public T percentile1(){
				return (T) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_percentile1(T v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public T percentile5(){
				return (T) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_percentile5(T v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public T percentile10(){
				return (T) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_percentile10(T v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public T percentile20(){
				return (T) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_percentile20(T v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public T percentile25(){
				return (T) super.getAttribute(super.type.generated_offsets[8]);
			}
			public void set_percentile25(T v){
				super.setAttribute(super.type.generated_offsets[8],v);
			}
			public T percentile50(){
				return (T) super.getAttribute(super.type.generated_offsets[9]);
			}
			public void set_percentile50(T v){
				super.setAttribute(super.type.generated_offsets[9],v);
			}
			public T percentile75(){
				return (T) super.getAttribute(super.type.generated_offsets[10]);
			}
			public void set_percentile75(T v){
				super.setAttribute(super.type.generated_offsets[10],v);
			}
			public T percentile80(){
				return (T) super.getAttribute(super.type.generated_offsets[11]);
			}
			public void set_percentile80(T v){
				super.setAttribute(super.type.generated_offsets[11],v);
			}
			public T percentile90(){
				return (T) super.getAttribute(super.type.generated_offsets[12]);
			}
			public void set_percentile90(T v){
				super.setAttribute(super.type.generated_offsets[12],v);
			}
			public T percentile95(){
				return (T) super.getAttribute(super.type.generated_offsets[13]);
			}
			public void set_percentile95(T v){
				super.setAttribute(super.type.generated_offsets[13],v);
			}
			public T percentile99(){
				return (T) super.getAttribute(super.type.generated_offsets[14]);
			}
			public void set_percentile99(T v){
				super.setAttribute(super.type.generated_offsets[14],v);
			}
			public java.lang.Double sum(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[15]);
			}
			public void set_sum(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[15],v);
			}
			public T avg(){
				return (T) super.getAttribute(super.type.generated_offsets[16]);
			}
			public void set_avg(T v){
				super.setAttribute(super.type.generated_offsets[16],v);
			}
			public T std(){
				return (T) super.getAttribute(super.type.generated_offsets[17]);
			}
			public void set_std(T v){
				super.setAttribute(super.type.generated_offsets[17],v);
			}
			public java.lang.Long size(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[18]);
			}
			public void set_size(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[18],v);
			}
			public HistogramStats(T min, T max, T whisker_low, T whisker_high, T percentile1, T percentile5, T percentile10, T percentile20, T percentile25, T percentile50, T percentile75, T percentile80, T percentile90, T percentile95, T percentile99, java.lang.Double sum, T avg, T std, java.lang.Long size){
				this(GreyCat.DEFAULT, min, max, whisker_low, whisker_high, percentile1, percentile5, percentile10, percentile20, percentile25, percentile50, percentile75, percentile80, percentile90, percentile95, percentile99, sum, avg, std, size);
			}
			public HistogramStats(GreyCat greycat, T min, T max, T whisker_low, T whisker_high, T percentile1, T percentile5, T percentile10, T percentile20, T percentile25, T percentile50, T percentile75, T percentile80, T percentile90, T percentile95, T percentile99, java.lang.Double sum, T avg, T std, java.lang.Long size){
				this(greycat.libs_by_name.get(name).mapped[103], min, max, whisker_low, whisker_high, percentile1, percentile5, percentile10, percentile20, percentile25, percentile50, percentile75, percentile80, percentile90, percentile95, percentile99, sum, avg, std, size);
			}
		}
		public static final class Crypto extends GreyCat.Object {
			public static final java.lang.String name = "util::Crypto";
			private Crypto(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public Crypto(){
				this(GreyCat.DEFAULT);
			}
			public Crypto(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[104]);
			}
		}
		public static final class TimeWindow<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::TimeWindow";
			private TimeWindow(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.Table<std.core.Tuple<std.core.time, T>> values(){
				return (std.core.Table<std.core.Tuple<std.core.time, T>>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_values(std.core.Table<std.core.Tuple<std.core.time, T>> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.duration span(){
				return (std.core.duration) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_span(std.core.duration v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Double sum(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_sum(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Double sumsq(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_sumsq(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.core.field field(){
				return (std.core.field) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_field(std.core.field v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public TimeWindow(std.core.Table<std.core.Tuple<std.core.time, T>> values, std.core.duration span, java.lang.Double sum, java.lang.Double sumsq, std.core.field field){
				this(GreyCat.DEFAULT, values, span, sum, sumsq, field);
			}
			public TimeWindow(GreyCat greycat, std.core.Table<std.core.Tuple<std.core.time, T>> values, std.core.duration span, java.lang.Double sum, java.lang.Double sumsq, std.core.field field){
				this(greycat.libs_by_name.get(std.name).mapped[105], values, span, sum, sumsq, field);
			}
		}
		public static final class Plot extends GreyCat.Object {
			public static final java.lang.String name = "util::Plot";
			private Plot(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public Plot(){
				this(GreyCat.DEFAULT);
			}
			public Plot(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[106]);
			}
		}
		public static final class LogQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::LogQuantizer";
			private LogQuantizer(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public T min(){
				return (T) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_min(T v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public T max(){
				return (T) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_max(T v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long bins(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_bins(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean open(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_open(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public LogQuantizer(T min, T max, java.lang.Long bins, java.lang.Boolean open){
				this(GreyCat.DEFAULT, min, max, bins, open);
			}
			public LogQuantizer(GreyCat greycat, T min, T max, java.lang.Long bins, java.lang.Boolean open){
				this(greycat.libs_by_name.get(std.name).mapped[107], min, max, bins, open);
			}
		}
		public static final class QuantizerSlotBound<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::QuantizerSlotBound";
			private QuantizerSlotBound(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public T min(){
				return (T) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_min(T v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public T max(){
				return (T) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_max(T v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public T center(){
				return (T) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_center(T v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public QuantizerSlotBound(T min, T max, T center){
				this(GreyCat.DEFAULT, min, max, center);
			}
			public QuantizerSlotBound(GreyCat greycat, T min, T max, T center){
				this(greycat.libs_by_name.get(std.name).mapped[108], min, max, center);
			}
		}
		public static final class GaussianProfileSlot extends GreyCat.Object {
			public static final java.lang.String name = "util::GaussianProfileSlot";
			private GaussianProfileSlot(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long sum(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_sum(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long sumsq(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_sumsq(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public GaussianProfileSlot(java.lang.Long sum, java.lang.Long sumsq, java.lang.Long count){
				this(GreyCat.DEFAULT, sum, sumsq, count);
			}
			public GaussianProfileSlot(GreyCat greycat, java.lang.Long sum, java.lang.Long sumsq, java.lang.Long count){
				this(greycat.libs_by_name.get(std.name).mapped[109], sum, sumsq, count);
			}
		}
		public static final class SlidingWindow<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::SlidingWindow";
			private SlidingWindow(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.Array<T> values(){
				return (std.core.Array<T>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_values(std.core.Array<T> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long span(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_span(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Double sum(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_sum(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Double sumsq(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_sumsq(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public std.core.field field(){
				return (std.core.field) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_field(std.core.field v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public SlidingWindow(std.core.Array<T> values, java.lang.Long span, java.lang.Double sum, java.lang.Double sumsq, std.core.field field){
				this(GreyCat.DEFAULT, values, span, sum, sumsq, field);
			}
			public SlidingWindow(GreyCat greycat, std.core.Array<T> values, java.lang.Long span, java.lang.Double sum, java.lang.Double sumsq, std.core.field field){
				this(greycat.libs_by_name.get(std.name).mapped[110], values, span, sum, sumsq, field);
			}
		}
		public static final class HistogramBin<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::HistogramBin";
			private HistogramBin(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.util.QuantizerSlotBound<T> bin(){
				return (std.util.QuantizerSlotBound<T>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_bin(std.util.QuantizerSlotBound<T> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Double ratio(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_ratio(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Long cumulative_count(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_cumulative_count(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public java.lang.Double cumulative_ratio(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_cumulative_ratio(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public HistogramBin(std.util.QuantizerSlotBound<T> bin, java.lang.Long count, java.lang.Double ratio, java.lang.Long cumulative_count, java.lang.Double cumulative_ratio){
				this(GreyCat.DEFAULT, bin, count, ratio, cumulative_count, cumulative_ratio);
			}
			public HistogramBin(GreyCat greycat, std.util.QuantizerSlotBound<T> bin, java.lang.Long count, java.lang.Double ratio, java.lang.Long cumulative_count, java.lang.Double cumulative_ratio){
				this(greycat.libs_by_name.get(std.name).mapped[111], bin, count, ratio, cumulative_count, cumulative_ratio);
			}
		}
		public static final class Random extends GreyCat.Object {
			public static final java.lang.String name = "util::Random";
			private Random(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long seed(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_seed(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Double v(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_v(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Random(java.lang.Long seed, java.lang.Double v){
				this(GreyCat.DEFAULT, seed, v);
			}
			public Random(GreyCat greycat, java.lang.Long seed, java.lang.Double v){
				this(greycat.libs_by_name.get(std.name).mapped[112], seed, v);
			}
		}
		public static final class CustomQuantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::CustomQuantizer";
			private CustomQuantizer(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public T min(){
				return (T) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_min(T v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public T max(){
				return (T) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_max(T v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public std.core.Array<T> step_starts(){
				return (std.core.Array<T>) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_step_starts(std.core.Array<T> v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean open(){
				return (java.lang.Boolean) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_open(java.lang.Boolean v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public CustomQuantizer(T min, T max, std.core.Array<T> step_starts, java.lang.Boolean open){
				this(GreyCat.DEFAULT, min, max, step_starts, open);
			}
			public CustomQuantizer(GreyCat greycat, T min, T max, std.core.Array<T> step_starts, java.lang.Boolean open){
				this(greycat.libs_by_name.get(std.name).mapped[113], min, max, step_starts, open);
			}
		}
		public static final class Histogram<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Histogram";
			private Histogram(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.util.Quantizer<T> quantizer(){
				return (std.util.Quantizer<T>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_quantizer(std.util.Quantizer<T> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public std.core.Array<java.lang.Long> bins(){
				return (std.core.Array<java.lang.Long>) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_bins(std.core.Array<java.lang.Long> v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public java.lang.Long nb_rejected(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[2]);
			}
			public void set_nb_rejected(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[2],v);
			}
			public java.lang.Long nb_accepted(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[3]);
			}
			public void set_nb_accepted(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[3],v);
			}
			public T min(){
				return (T) super.getAttribute(super.type.generated_offsets[4]);
			}
			public void set_min(T v){
				super.setAttribute(super.type.generated_offsets[4],v);
			}
			public T max(){
				return (T) super.getAttribute(super.type.generated_offsets[5]);
			}
			public void set_max(T v){
				super.setAttribute(super.type.generated_offsets[5],v);
			}
			public java.lang.Double sum(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[6]);
			}
			public void set_sum(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[6],v);
			}
			public java.lang.Double sumsq(){
				return (java.lang.Double) super.getAttribute(super.type.generated_offsets[7]);
			}
			public void set_sumsq(java.lang.Double v){
				super.setAttribute(super.type.generated_offsets[7],v);
			}
			public Histogram(std.util.Quantizer<T> quantizer, std.core.Array<java.lang.Long> bins, java.lang.Long nb_rejected, java.lang.Long nb_accepted, T min, T max, java.lang.Double sum, java.lang.Double sumsq){
				this(GreyCat.DEFAULT, quantizer, bins, nb_rejected, nb_accepted, min, max, sum, sumsq);
			}
			public Histogram(GreyCat greycat, std.util.Quantizer<T> quantizer, std.core.Array<java.lang.Long> bins, java.lang.Long nb_rejected, java.lang.Long nb_accepted, T min, T max, java.lang.Double sum, java.lang.Double sumsq){
				this(greycat.libs_by_name.get(std.name).mapped[114], quantizer, bins, nb_rejected, nb_accepted, min, max, sum, sumsq);
			}
		}
		public static final class Quantizer<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Quantizer";
			private Quantizer(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public Quantizer(){
				this(GreyCat.DEFAULT);
			}
			public Quantizer(GreyCat greycat){
				this(greycat.libs_by_name.get(std.name).mapped[115]);
			}
		}
		public static final class Queue<T> extends GreyCat.Object {
			public static final java.lang.String name = "util::Queue";
			private Queue(GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public std.core.Array<T> values(){
				return (std.core.Array<T>) super.getAttribute(super.type.generated_offsets[0]);
			}
			public void set_values(std.core.Array<T> v){
				super.setAttribute(super.type.generated_offsets[0],v);
			}
			public java.lang.Long capacity(){
				return (java.lang.Long) super.getAttribute(super.type.generated_offsets[1]);
			}
			public void set_capacity(java.lang.Long v){
				super.setAttribute(super.type.generated_offsets[1],v);
			}
			public Queue(std.core.Array<T> values, java.lang.Long capacity){
				this(GreyCat.DEFAULT, values, capacity);
			}
			public Queue(GreyCat greycat, std.core.Array<T> values, java.lang.Long capacity){
				this(greycat.libs_by_name.get(std.name).mapped[116], values, capacity);
			}
		}
	}
	@Override
	public void configure(java.util.Map<String, GreyCat.Loader> loaders, java.util.Map<String, GreyCat.Factory> factories) {
		factories.put(core.ErrorCode.name, core.ErrorCode::new);
		factories.put(core.t4.name, core.t4::new);
		loaders.put(core.t4.name, std_n.core.t4::load);
		factories.put(core.Table.name, core.Table::new);
		loaders.put(core.Table.name, std_n.core.Table::load);
		factories.put(core.t3.name, core.t3::new);
		loaders.put(core.t3.name, std_n.core.t3::load);
		factories.put(core.nodeIndex.name, core.nodeIndex::new);
		loaders.put(core.nodeIndex.name, std_n.core.nodeIndex::load);
		factories.put(core.GeoCircle.name, core.GeoCircle::new);
		factories.put(core.TimeZone.name, core.TimeZone::new);
		factories.put(core.t2.name, core.t2::new);
		loaders.put(core.t2.name, std_n.core.t2::load);
		factories.put(core.String.name, core.String::new);
		loaders.put(core.String.name, std_n.core.String::load);
		factories.put(core.GeoBox.name, core.GeoBox::new);
		factories.put(core.t4f.name, core.t4f::new);
		loaders.put(core.t4f.name, std_n.core.t4f::load);
		factories.put(core.field.name, core.field::new);
		loaders.put(core.field.name, std_n.core.field::load);
		factories.put(core.CalendarUnit.name, core.CalendarUnit::new);
		factories.put(core.Buffer.name, core.Buffer::new);
		loaders.put(core.Buffer.name, std_n.core.Buffer::load);
		factories.put(core.nodeList.name, core.nodeList::new);
		loaders.put(core.nodeList.name, std_n.core.nodeList::load);
		factories.put(core.nodeTime.name, core.nodeTime::new);
		loaders.put(core.nodeTime.name, std_n.core.nodeTime::load);
		factories.put(core.duration.name, core.duration::new);
		loaders.put(core.duration.name, std_n.core.duration::load);
		factories.put(core.Tensor.name, core.Tensor::new);
		loaders.put(core.Tensor.name, std_n.core.Tensor::load);
		factories.put(core.nodeTimeSingleton.name, core.nodeTimeSingleton::new);
		factories.put(core.NodeInfo.name, core.NodeInfo::new);
		factories.put(core.SortOrder.name, core.SortOrder::new);
		factories.put(core.t3f.name, core.t3f::new);
		loaders.put(core.t3f.name, std_n.core.t3f::load);
		factories.put(core.MathConstants.name, core.MathConstants::new);
		factories.put(core.type.name, core.type::new);
		loaders.put(core.type.name, std_n.core.type::load);
		factories.put(core.SamplingMode.name, core.SamplingMode::new);
		factories.put(core.geo.name, core.geo::new);
		loaders.put(core.geo.name, std_n.core.geo::load);
		factories.put(core.Map.name, core.Map::new);
		loaders.put(core.Map.name, std_n.core.Map::load);
		factories.put(core.Error.name, core.Error::new);
		factories.put(core.nodeTimeCursor.name, core.nodeTimeCursor::new);
		factories.put(core.nodeGeo.name, core.nodeGeo::new);
		loaders.put(core.nodeGeo.name, std_n.core.nodeGeo::load);
		factories.put(core.node.name, core.node::new);
		loaders.put(core.node.name, std_n.core.node::load);
		factories.put(core.DurationUnit.name, core.DurationUnit::new);
		factories.put(core.TableColumnMapping.name, core.TableColumnMapping::new);
		factories.put(core.TensorType.name, core.TensorType::new);
		factories.put(core.Tuple.name, core.Tuple::new);
		factories.put(core.time.name, core.time::new);
		loaders.put(core.time.name, std_n.core.time::load);
		factories.put(core.ErrorFrame.name, core.ErrorFrame::new);
		factories.put(core.Array.name, core.Array::new);
		loaders.put(core.Array.name, std_n.core.Array::load);
		factories.put(core.GeoPoly.name, core.GeoPoly::new);
		factories.put(core.FloatPrecision.name, core.FloatPrecision::new);
		factories.put(core.t2f.name, core.t2f::new);
		loaders.put(core.t2f.name, std_n.core.t2f::load);
		factories.put(core.Date.name, core.Date::new);
		factories.put(core.function.name, core.function::new);
		loaders.put(core.function.name, std_n.core.function::load);
		factories.put(core.str.name, core.str::new);
		loaders.put(core.str.name, std_n.core.str::load);
		factories.put(io.SmtpAuth.name, io.SmtpAuth::new);
		factories.put(io.Url.name, io.Url::new);
		factories.put(io.File.name, io.File::new);
		factories.put(io.CsvAnalysisConfig.name, io.CsvAnalysisConfig::new);
		factories.put(io.Writer.name, io.Writer::new);
		factories.put(io.GcbWriter.name, io.GcbWriter::new);
		factories.put(io.TextWriter.name, io.TextWriter::new);
		factories.put(io.GcbReader.name, io.GcbReader::new);
		factories.put(io.SmtpMode.name, io.SmtpMode::new);
		factories.put(io.CsvColumnStatistics.name, io.CsvColumnStatistics::new);
		factories.put(io.CsvFormat.name, io.CsvFormat::new);
		factories.put(io.CsvSharding.name, io.CsvSharding::new);
		factories.put(io.Email.name, io.Email::new);
		factories.put(io.CsvReader.name, io.CsvReader::new);
		factories.put(io.Reader.name, io.Reader::new);
		factories.put(io.Http.name, io.Http::new);
		factories.put(io.CsvWriter.name, io.CsvWriter::new);
		factories.put(io.TextReader.name, io.TextReader::new);
		factories.put(io.CsvStatistics.name, io.CsvStatistics::new);
		factories.put(io.JsonWriter.name, io.JsonWriter::new);
		factories.put(io.JsonReader.name, io.JsonReader::new);
		factories.put(io.Json.name, io.Json::new);
		factories.put(io.Csv.name, io.Csv::new);
		factories.put(io.Smtp.name, io.Smtp::new);
		factories.put(io.FileWalker.name, io.FileWalker::new);
		factories.put(io.HttpHeader.name, io.HttpHeader::new);
		factories.put(runtime.LogLevel.name, runtime.LogLevel::new);
		factories.put(runtime.RuntimeInfo.name, runtime.RuntimeInfo::new);
		factories.put(runtime.SecurityEntity.name, runtime.SecurityEntity::new);
		factories.put(runtime.Debug.name, runtime.Debug::new);
		factories.put(runtime.Role.name, runtime.Role::new);
		factories.put(runtime.Log.name, runtime.Log::new);
		factories.put(runtime.Variable.name, runtime.Variable::new);
		factories.put(runtime.OpenIDConnect.name, runtime.OpenIDConnect::new);
		factories.put(runtime.License.name, runtime.License::new);
		factories.put(runtime.UserGroupPolicy.name, runtime.UserGroupPolicy::new);
		factories.put(runtime.User.name, runtime.User::new);
		factories.put(runtime.Job.name, runtime.Job::new);
		factories.put(runtime.SecurityFields.name, runtime.SecurityFields::new);
		factories.put(runtime.TaskStatus.name, runtime.TaskStatus::new);
		factories.put(runtime.LicenseType.name, runtime.LicenseType::new);
		factories.put(runtime.Frame.name, runtime.Frame::new);
		factories.put(runtime.UserGroup.name, runtime.UserGroup::new);
		factories.put(runtime.CallPerf.name, runtime.CallPerf::new);
		factories.put(runtime.SecurityPolicy.name, runtime.SecurityPolicy::new);
		factories.put(runtime.Runtime.name, runtime.Runtime::new);
		factories.put(runtime.PeriodicTask.name, runtime.PeriodicTask::new);
		factories.put(runtime.UserGroupPolicyType.name, runtime.UserGroupPolicyType::new);
		factories.put(runtime.System.name, runtime.System::new);
		factories.put(runtime.UserCredential.name, runtime.UserCredential::new);
		factories.put(runtime.Permission.name, runtime.Permission::new);
		factories.put(runtime.Task.name, runtime.Task::new);
		factories.put(util.LinearQuantizer.name, util.LinearQuantizer::new);
		factories.put(util.Gaussian.name, util.Gaussian::new);
		factories.put(util.Stack.name, util.Stack::new);
		factories.put(util.GaussianProfile.name, util.GaussianProfile::new);
		factories.put(util.ProgressTracker.name, util.ProgressTracker::new);
		factories.put(util.Assert.name, util.Assert::new);
		factories.put(util.MultiQuantizer.name, util.MultiQuantizer::new);
		factories.put(util.HistogramStats.name, util.HistogramStats::new);
		factories.put(util.Crypto.name, util.Crypto::new);
		factories.put(util.TimeWindow.name, util.TimeWindow::new);
		factories.put(util.Plot.name, util.Plot::new);
		factories.put(util.LogQuantizer.name, util.LogQuantizer::new);
		factories.put(util.QuantizerSlotBound.name, util.QuantizerSlotBound::new);
		factories.put(util.GaussianProfileSlot.name, util.GaussianProfileSlot::new);
		factories.put(util.SlidingWindow.name, util.SlidingWindow::new);
		factories.put(util.HistogramBin.name, util.HistogramBin::new);
		factories.put(util.Random.name, util.Random::new);
		factories.put(util.CustomQuantizer.name, util.CustomQuantizer::new);
		factories.put(util.Histogram.name, util.Histogram::new);
		factories.put(util.Quantizer.name, util.Quantizer::new);
		factories.put(util.Queue.name, util.Queue::new);
	}
	@Override
	public void init(GreyCat greycat) {
		this.mapped = new GreyCat.Type[117];
		this.mapped[0] = greycat.types_by_name.get(core.ErrorCode.name);
		if(this.mapped[0] != null){
			this.mapped[0].resolveGeneratedOffsetWithValues("none", 0L,"interrupted", 1L,"await", 2L,"timeout", 6L,"forbidden", 7L,"runtime_error", 8L);
		}
		this.mapped[1] = greycat.types_by_name.get(core.t4.name);
		this.mapped[2] = greycat.types_by_name.get(core.Table.name);
		this.mapped[3] = greycat.types_by_name.get(core.t3.name);
		this.mapped[4] = greycat.types_by_name.get(core.nodeIndex.name);
		this.mapped[5] = greycat.types_by_name.get(core.GeoCircle.name);
		if(this.mapped[5] != null){
			this.mapped[5].resolveGeneratedOffsets("center","radius");
		}
		this.mapped[6] = greycat.types_by_name.get(core.TimeZone.name);
		if(this.mapped[6] != null){
			this.mapped[6].resolveGeneratedOffsetWithValues("UTC", null,"Africa/Abidjan", null,"Africa/Accra", null,"Africa/Addis_Ababa", null,"Africa/Algiers", null,"Africa/Asmara", null,"Africa/Asmera", null,"Africa/Bamako", null,"Africa/Bangui", null,"Africa/Banjul", null,"Africa/Bissau", null,"Africa/Blantyre", null,"Africa/Brazzaville", null,"Africa/Bujumbura", null,"Africa/Cairo", null,"Africa/Casablanca", null,"Africa/Ceuta", null,"Africa/Conakry", null,"Africa/Dakar", null,"Africa/Dar_es_Salaam", null,"Africa/Djibouti", null,"Africa/Douala", null,"Africa/El_Aaiun", null,"Africa/Freetown", null,"Africa/Gaborone", null,"Africa/Harare", null,"Africa/Johannesburg", null,"Africa/Juba", null,"Africa/Kampala", null,"Africa/Khartoum", null,"Africa/Kigali", null,"Africa/Kinshasa", null,"Africa/Lagos", null,"Africa/Libreville", null,"Africa/Lome", null,"Africa/Luanda", null,"Africa/Lubumbashi", null,"Africa/Lusaka", null,"Africa/Malabo", null,"Africa/Maputo", null,"Africa/Maseru", null,"Africa/Mbabane", null,"Africa/Mogadishu", null,"Africa/Monrovia", null,"Africa/Nairobi", null,"Africa/Ndjamena", null,"Africa/Niamey", null,"Africa/Nouakchott", null,"Africa/Ouagadougou", null,"Africa/Porto-Novo", null,"Africa/Sao_Tome", null,"Africa/Timbuktu", null,"Africa/Tripoli", null,"Africa/Tunis", null,"Africa/Windhoek", null,"America/Adak", null,"America/Anchorage", null,"America/Anguilla", null,"America/Antigua", null,"America/Araguaina", null,"America/Argentina/Buenos_Aires", null,"America/Argentina/Catamarca", null,"America/Argentina/ComodRivadavia", null,"America/Argentina/Cordoba", null,"America/Argentina/Jujuy", null,"America/Argentina/La_Rioja", null,"America/Argentina/Mendoza", null,"America/Argentina/Rio_Gallegos", null,"America/Argentina/Salta", null,"America/Argentina/San_Juan", null,"America/Argentina/San_Luis", null,"America/Argentina/Tucuman", null,"America/Argentina/Ushuaia", null,"America/Aruba", null,"America/Asuncion", null,"America/Atikokan", null,"America/Atka", null,"America/Bahia", null,"America/Bahia_Banderas", null,"America/Barbados", null,"America/Belem", null,"America/Belize", null,"America/Blanc-Sablon", null,"America/Boa_Vista", null,"America/Bogota", null,"America/Boise", null,"America/Buenos_Aires", null,"America/Cambridge_Bay", null,"America/Campo_Grande", null,"America/Cancun", null,"America/Caracas", null,"America/Catamarca", null,"America/Cayenne", null,"America/Cayman", null,"America/Chicago", null,"America/Chihuahua", null,"America/Ciudad_Juarez", null,"America/Coral_Harbour", null,"America/Cordoba", null,"America/Costa_Rica", null,"America/Coyhaique", null,"America/Creston", null,"America/Cuiaba", null,"America/Curacao", null,"America/Danmarkshavn", null,"America/Dawson", null,"America/Dawson_Creek", null,"America/Denver", null,"America/Detroit", null,"America/Dominica", null,"America/Edmonton", null,"America/Eirunepe", null,"America/El_Salvador", null,"America/Ensenada", null,"America/Fort_Nelson", null,"America/Fort_Wayne", null,"America/Fortaleza", null,"America/Glace_Bay", null,"America/Godthab", null,"America/Goose_Bay", null,"America/Grand_Turk", null,"America/Grenada", null,"America/Guadeloupe", null,"America/Guatemala", null,"America/Guayaquil", null,"America/Guyana", null,"America/Halifax", null,"America/Havana", null,"America/Hermosillo", null,"America/Indiana/Indianapolis", null,"America/Indiana/Knox", null,"America/Indiana/Marengo", null,"America/Indiana/Petersburg", null,"America/Indiana/Tell_City", null,"America/Indiana/Vevay", null,"America/Indiana/Vincennes", null,"America/Indiana/Winamac", null,"America/Indianapolis", null,"America/Inuvik", null,"America/Iqaluit", null,"America/Jamaica", null,"America/Jujuy", null,"America/Juneau", null,"America/Kentucky/Louisville", null,"America/Kentucky/Monticello", null,"America/Knox_IN", null,"America/Kralendijk", null,"America/La_Paz", null,"America/Lima", null,"America/Los_Angeles", null,"America/Louisville", null,"America/Lower_Princes", null,"America/Maceio", null,"America/Managua", null,"America/Manaus", null,"America/Marigot", null,"America/Martinique", null,"America/Matamoros", null,"America/Mazatlan", null,"America/Mendoza", null,"America/Menominee", null,"America/Merida", null,"America/Metlakatla", null,"America/Mexico_City", null,"America/Miquelon", null,"America/Moncton", null,"America/Monterrey", null,"America/Montevideo", null,"America/Montreal", null,"America/Montserrat", null,"America/Nassau", null,"America/New_York", null,"America/Nipigon", null,"America/Nome", null,"America/Noronha", null,"America/North_Dakota/Beulah", null,"America/North_Dakota/Center", null,"America/North_Dakota/New_Salem", null,"America/Nuuk", null,"America/Ojinaga", null,"America/Panama", null,"America/Pangnirtung", null,"America/Paramaribo", null,"America/Phoenix", null,"America/Port-au-Prince", null,"America/Port_of_Spain", null,"America/Porto_Acre", null,"America/Porto_Velho", null,"America/Puerto_Rico", null,"America/Punta_Arenas", null,"America/Rainy_River", null,"America/Rankin_Inlet", null,"America/Recife", null,"America/Regina", null,"America/Resolute", null,"America/Rio_Branco", null,"America/Rosario", null,"America/Santa_Isabel", null,"America/Santarem", null,"America/Santiago", null,"America/Santo_Domingo", null,"America/Sao_Paulo", null,"America/Scoresbysund", null,"America/Shiprock", null,"America/Sitka", null,"America/St_Barthelemy", null,"America/St_Johns", null,"America/St_Kitts", null,"America/St_Lucia", null,"America/St_Thomas", null,"America/St_Vincent", null,"America/Swift_Current", null,"America/Tegucigalpa", null,"America/Thule", null,"America/Thunder_Bay", null,"America/Tijuana", null,"America/Toronto", null,"America/Tortola", null,"America/Vancouver", null,"America/Virgin", null,"America/Whitehorse", null,"America/Winnipeg", null,"America/Yakutat", null,"America/Yellowknife", null,"Antarctica/Casey", null,"Antarctica/Davis", null,"Antarctica/DumontDUrville", null,"Antarctica/Macquarie", null,"Antarctica/Mawson", null,"Antarctica/McMurdo", null,"Antarctica/Palmer", null,"Antarctica/Rothera", null,"Antarctica/South_Pole", null,"Antarctica/Syowa", null,"Antarctica/Troll", null,"Antarctica/Vostok", null,"Arctic/Longyearbyen", null,"Asia/Aden", null,"Asia/Almaty", null,"Asia/Amman", null,"Asia/Anadyr", null,"Asia/Aqtau", null,"Asia/Aqtobe", null,"Asia/Ashgabat", null,"Asia/Ashkhabad", null,"Asia/Atyrau", null,"Asia/Baghdad", null,"Asia/Bahrain", null,"Asia/Baku", null,"Asia/Bangkok", null,"Asia/Barnaul", null,"Asia/Beirut", null,"Asia/Bishkek", null,"Asia/Brunei", null,"Asia/Calcutta", null,"Asia/Chita", null,"Asia/Choibalsan", null,"Asia/Chongqing", null,"Asia/Chungking", null,"Asia/Colombo", null,"Asia/Dacca", null,"Asia/Damascus", null,"Asia/Dhaka", null,"Asia/Dili", null,"Asia/Dubai", null,"Asia/Dushanbe", null,"Asia/Famagusta", null,"Asia/Gaza", null,"Asia/Harbin", null,"Asia/Hebron", null,"Asia/Ho_Chi_Minh", null,"Asia/Hong_Kong", null,"Asia/Hovd", null,"Asia/Irkutsk", null,"Asia/Istanbul", null,"Asia/Jakarta", null,"Asia/Jayapura", null,"Asia/Jerusalem", null,"Asia/Kabul", null,"Asia/Kamchatka", null,"Asia/Karachi", null,"Asia/Kashgar", null,"Asia/Kathmandu", null,"Asia/Katmandu", null,"Asia/Khandyga", null,"Asia/Kolkata", null,"Asia/Krasnoyarsk", null,"Asia/Kuala_Lumpur", null,"Asia/Kuching", null,"Asia/Kuwait", null,"Asia/Macao", null,"Asia/Macau", null,"Asia/Magadan", null,"Asia/Makassar", null,"Asia/Manila", null,"Asia/Muscat", null,"Asia/Nicosia", null,"Asia/Novokuznetsk", null,"Asia/Novosibirsk", null,"Asia/Omsk", null,"Asia/Oral", null,"Asia/Phnom_Penh", null,"Asia/Pontianak", null,"Asia/Pyongyang", null,"Asia/Qatar", null,"Asia/Qostanay", null,"Asia/Qyzylorda", null,"Asia/Rangoon", null,"Asia/Riyadh", null,"Asia/Saigon", null,"Asia/Sakhalin", null,"Asia/Samarkand", null,"Asia/Seoul", null,"Asia/Shanghai", null,"Asia/Singapore", null,"Asia/Srednekolymsk", null,"Asia/Taipei", null,"Asia/Tashkent", null,"Asia/Tbilisi", null,"Asia/Tehran", null,"Asia/Tel_Aviv", null,"Asia/Thimbu", null,"Asia/Thimphu", null,"Asia/Tokyo", null,"Asia/Tomsk", null,"Asia/Ujung_Pandang", null,"Asia/Ulaanbaatar", null,"Asia/Ulan_Bator", null,"Asia/Urumqi", null,"Asia/Ust-Nera", null,"Asia/Vientiane", null,"Asia/Vladivostok", null,"Asia/Yakutsk", null,"Asia/Yangon", null,"Asia/Yekaterinburg", null,"Asia/Yerevan", null,"Atlantic/Azores", null,"Atlantic/Bermuda", null,"Atlantic/Canary", null,"Atlantic/Cape_Verde", null,"Atlantic/Faeroe", null,"Atlantic/Faroe", null,"Atlantic/Jan_Mayen", null,"Atlantic/Madeira", null,"Atlantic/Reykjavik", null,"Atlantic/South_Georgia", null,"Atlantic/St_Helena", null,"Atlantic/Stanley", null,"Australia/ACT", null,"Australia/Adelaide", null,"Australia/Brisbane", null,"Australia/Broken_Hill", null,"Australia/Canberra", null,"Australia/Currie", null,"Australia/Darwin", null,"Australia/Eucla", null,"Australia/Hobart", null,"Australia/LHI", null,"Australia/Lindeman", null,"Australia/Lord_Howe", null,"Australia/Melbourne", null,"Australia/NSW", null,"Australia/North", null,"Australia/Perth", null,"Australia/Queensland", null,"Australia/South", null,"Australia/Sydney", null,"Australia/Tasmania", null,"Australia/Victoria", null,"Australia/West", null,"Australia/Yancowinna", null,"Brazil/Acre", null,"Brazil/DeNoronha", null,"Brazil/East", null,"Brazil/West", null,"CET", null,"CST6CDT", null,"Canada/Atlantic", null,"Canada/Central", null,"Canada/Eastern", null,"Canada/Mountain", null,"Canada/Newfoundland", null,"Canada/Pacific", null,"Canada/Saskatchewan", null,"Canada/Yukon", null,"Chile/Continental", null,"Chile/EasterIsland", null,"Cuba", null,"EET", null,"EST", null,"EST5EDT", null,"Egypt", null,"Eire", null,"Etc/GMT", null,"Etc/GMT+0", null,"Etc/GMT+1", null,"Etc/GMT+10", null,"Etc/GMT+11", null,"Etc/GMT+12", null,"Etc/GMT+2", null,"Etc/GMT+3", null,"Etc/GMT+4", null,"Etc/GMT+5", null,"Etc/GMT+6", null,"Etc/GMT+7", null,"Etc/GMT+8", null,"Etc/GMT+9", null,"Etc/GMT-0", null,"Etc/GMT-1", null,"Etc/GMT-10", null,"Etc/GMT-11", null,"Etc/GMT-12", null,"Etc/GMT-13", null,"Etc/GMT-14", null,"Etc/GMT-2", null,"Etc/GMT-3", null,"Etc/GMT-4", null,"Etc/GMT-5", null,"Etc/GMT-6", null,"Etc/GMT-7", null,"Etc/GMT-8", null,"Etc/GMT-9", null,"Etc/GMT0", null,"Etc/Greenwich", null,"Etc/UCT", null,"Etc/UTC", null,"Etc/Universal", null,"Etc/Zulu", null,"Europe/Amsterdam", null,"Europe/Andorra", null,"Europe/Astrakhan", null,"Europe/Athens", null,"Europe/Belfast", null,"Europe/Belgrade", null,"Europe/Berlin", null,"Europe/Bratislava", null,"Europe/Brussels", null,"Europe/Bucharest", null,"Europe/Budapest", null,"Europe/Busingen", null,"Europe/Chisinau", null,"Europe/Copenhagen", null,"Europe/Dublin", null,"Europe/Gibraltar", null,"Europe/Guernsey", null,"Europe/Helsinki", null,"Europe/Isle_of_Man", null,"Europe/Istanbul", null,"Europe/Jersey", null,"Europe/Kaliningrad", null,"Europe/Kiev", null,"Europe/Kirov", null,"Europe/Kyiv", null,"Europe/Lisbon", null,"Europe/Ljubljana", null,"Europe/London", null,"Europe/Luxembourg", null,"Europe/Madrid", null,"Europe/Malta", null,"Europe/Mariehamn", null,"Europe/Minsk", null,"Europe/Monaco", null,"Europe/Moscow", null,"Europe/Nicosia", null,"Europe/Oslo", null,"Europe/Paris", null,"Europe/Podgorica", null,"Europe/Prague", null,"Europe/Riga", null,"Europe/Rome", null,"Europe/Samara", null,"Europe/San_Marino", null,"Europe/Sarajevo", null,"Europe/Saratov", null,"Europe/Simferopol", null,"Europe/Skopje", null,"Europe/Sofia", null,"Europe/Stockholm", null,"Europe/Tallinn", null,"Europe/Tirane", null,"Europe/Tiraspol", null,"Europe/Ulyanovsk", null,"Europe/Uzhgorod", null,"Europe/Vaduz", null,"Europe/Vatican", null,"Europe/Vienna", null,"Europe/Vilnius", null,"Europe/Volgograd", null,"Europe/Warsaw", null,"Europe/Zagreb", null,"Europe/Zaporozhye", null,"Europe/Zurich", null,"Factory", null,"GB", null,"GB-Eire", null,"GMT", null,"GMT+0", null,"GMT-0", null,"GMT0", null,"Greenwich", null,"HST", null,"Hongkong", null,"Iceland", null,"Indian/Antananarivo", null,"Indian/Chagos", null,"Indian/Christmas", null,"Indian/Cocos", null,"Indian/Comoro", null,"Indian/Kerguelen", null,"Indian/Mahe", null,"Indian/Maldives", null,"Indian/Mauritius", null,"Indian/Mayotte", null,"Indian/Reunion", null,"Iran", null,"Israel", null,"Jamaica", null,"Japan", null,"Kwajalein", null,"Libya", null,"MET", null,"MST", null,"MST7MDT", null,"Mexico/BajaNorte", null,"Mexico/BajaSur", null,"Mexico/General", null,"NZ", null,"NZ-CHAT", null,"Navajo", null,"PRC", null,"PST8PDT", null,"Pacific/Apia", null,"Pacific/Auckland", null,"Pacific/Bougainville", null,"Pacific/Chatham", null,"Pacific/Chuuk", null,"Pacific/Easter", null,"Pacific/Efate", null,"Pacific/Enderbury", null,"Pacific/Fakaofo", null,"Pacific/Fiji", null,"Pacific/Funafuti", null,"Pacific/Galapagos", null,"Pacific/Gambier", null,"Pacific/Guadalcanal", null,"Pacific/Guam", null,"Pacific/Honolulu", null,"Pacific/Johnston", null,"Pacific/Kanton", null,"Pacific/Kiritimati", null,"Pacific/Kosrae", null,"Pacific/Kwajalein", null,"Pacific/Majuro", null,"Pacific/Marquesas", null,"Pacific/Midway", null,"Pacific/Nauru", null,"Pacific/Niue", null,"Pacific/Norfolk", null,"Pacific/Noumea", null,"Pacific/Pago_Pago", null,"Pacific/Palau", null,"Pacific/Pitcairn", null,"Pacific/Pohnpei", null,"Pacific/Ponape", null,"Pacific/Port_Moresby", null,"Pacific/Rarotonga", null,"Pacific/Saipan", null,"Pacific/Samoa", null,"Pacific/Tahiti", null,"Pacific/Tarawa", null,"Pacific/Tongatapu", null,"Pacific/Truk", null,"Pacific/Wake", null,"Pacific/Wallis", null,"Pacific/Yap", null,"Poland", null,"Portugal", null,"ROC", null,"ROK", null,"Singapore", null,"Turkey", null,"UCT", null,"US/Alaska", null,"US/Aleutian", null,"US/Arizona", null,"US/Central", null,"US/East-Indiana", null,"US/Eastern", null,"US/Hawaii", null,"US/Indiana-Starke", null,"US/Michigan", null,"US/Mountain", null,"US/Pacific", null,"US/Samoa", null,"Universal", null,"W-SU", null,"WET", null,"Zulu", null);
		}
		this.mapped[7] = greycat.types_by_name.get(core.t2.name);
		this.mapped[8] = greycat.types_by_name.get(core.String.name);
		this.mapped[9] = greycat.types_by_name.get(core.GeoBox.name);
		if(this.mapped[9] != null){
			this.mapped[9].resolveGeneratedOffsets("sw","ne");
		}
		this.mapped[10] = greycat.types_by_name.get(core.t4f.name);
		this.mapped[11] = greycat.types_by_name.get(core.field.name);
		this.mapped[12] = greycat.types_by_name.get(core.CalendarUnit.name);
		if(this.mapped[12] != null){
			this.mapped[12].resolveGeneratedOffsetWithValues("year", 0L,"month", 1L,"day", 2L,"hour", 3L,"minute", 4L,"second", 5L,"microsecond", 6L);
		}
		this.mapped[13] = greycat.types_by_name.get(core.Buffer.name);
		this.mapped[14] = greycat.types_by_name.get(core.nodeList.name);
		this.mapped[15] = greycat.types_by_name.get(core.nodeTime.name);
		this.mapped[16] = greycat.types_by_name.get(core.duration.name);
		this.mapped[17] = greycat.types_by_name.get(core.Tensor.name);
		this.mapped[18] = greycat.types_by_name.get(core.nodeTimeSingleton.name);
		if(this.mapped[18] != null){
			this.mapped[18].resolveGeneratedOffsets("t","v");
		}
		this.mapped[19] = greycat.types_by_name.get(core.NodeInfo.name);
		if(this.mapped[19] != null){
			this.mapped[19].resolveGeneratedOffsets("size","from","to");
		}
		this.mapped[20] = greycat.types_by_name.get(core.SortOrder.name);
		if(this.mapped[20] != null){
			this.mapped[20].resolveGeneratedOffsetWithValues("asc", null,"desc", null);
		}
		this.mapped[21] = greycat.types_by_name.get(core.t3f.name);
		this.mapped[22] = greycat.types_by_name.get(core.MathConstants.name);
		if(this.mapped[22] != null){
			this.mapped[22].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4613303445314885482L),java.lang.Double.longBitsToDouble(4609176140021203710L),java.lang.Double.longBitsToDouble(4601495173785380111L),java.lang.Double.longBitsToDouble(4604418534313441775L),java.lang.Double.longBitsToDouble(4612367379483415830L),java.lang.Double.longBitsToDouble(4614256656552045848L),java.lang.Double.longBitsToDouble(4609753056924675352L),java.lang.Double.longBitsToDouble(4605249457297304857L),java.lang.Double.longBitsToDouble(4599405781057128578L),java.lang.Double.longBitsToDouble(4603909380684499074L),java.lang.Double.longBitsToDouble(4607760587169110893L),java.lang.Double.longBitsToDouble(4609047870845172685L),java.lang.Double.longBitsToDouble(4604544271217802190L)};
		}
		this.mapped[23] = greycat.types_by_name.get(core.type.name);
		this.mapped[24] = greycat.types_by_name.get(core.SamplingMode.name);
		if(this.mapped[24] != null){
			this.mapped[24].resolveGeneratedOffsetWithValues("fixed", 0L,"fixed_reg", 1L,"adaptative", 2L,"dense", 3L);
		}
		this.mapped[25] = greycat.types_by_name.get(core.geo.name);
		if(this.mapped[25] != null){
			this.mapped[25].static_values = new java.lang.Object[]{greycat.createGeo(java.lang.Double.longBitsToDouble(-4587686678796158022L),java.lang.Double.longBitsToDouble(-4582834833316020224L)),greycat.createGeo(java.lang.Double.longBitsToDouble(4635685358058617786L),java.lang.Double.longBitsToDouble(4640537203538755584L))};
		}
		this.mapped[26] = greycat.types_by_name.get(core.Map.name);
		this.mapped[27] = greycat.types_by_name.get(core.Error.name);
		if(this.mapped[27] != null){
			this.mapped[27].resolveGeneratedOffsets("message","stack");
		}
		this.mapped[28] = greycat.types_by_name.get(core.nodeTimeCursor.name);
		if(this.mapped[28] != null){
			this.mapped[28].resolveGeneratedOffsets("n","req_time");
		}
		this.mapped[29] = greycat.types_by_name.get(core.nodeGeo.name);
		this.mapped[30] = greycat.types_by_name.get(core.node.name);
		this.mapped[31] = greycat.types_by_name.get(core.DurationUnit.name);
		if(this.mapped[31] != null){
			this.mapped[31].resolveGeneratedOffsetWithValues("microseconds", 1L,"milliseconds", 1000L,"seconds", 1000000L,"minutes", 60000000L,"hours", 3600000000L,"days", 86400000000L);
		}
		this.mapped[32] = greycat.types_by_name.get(core.TableColumnMapping.name);
		if(this.mapped[32] != null){
			this.mapped[32].resolveGeneratedOffsets("column","extractors");
		}
		this.mapped[33] = greycat.types_by_name.get(core.TensorType.name);
		if(this.mapped[33] != null){
			this.mapped[33].resolveGeneratedOffsetWithValues("i32", 4L,"i64", 8L,"f32", 4L,"f64", 8L,"c64", 8L,"c128", 16L);
		}
		this.mapped[34] = greycat.types_by_name.get(core.Tuple.name);
		if(this.mapped[34] != null){
			this.mapped[34].resolveGeneratedOffsets("x","y");
		}
		this.mapped[35] = greycat.types_by_name.get(core.time.name);
		if(this.mapped[35] != null){
			this.mapped[35].static_values = new java.lang.Object[]{greycat.createTime(-9223372036854775808L),greycat.createTime(9223372036854775807L)};
		}
		this.mapped[36] = greycat.types_by_name.get(core.ErrorFrame.name);
		if(this.mapped[36] != null){
			this.mapped[36].resolveGeneratedOffsets("module","function","line","column");
		}
		this.mapped[37] = greycat.types_by_name.get(core.Array.name);
		this.mapped[38] = greycat.types_by_name.get(core.GeoPoly.name);
		if(this.mapped[38] != null){
			this.mapped[38].resolveGeneratedOffsets("points");
		}
		this.mapped[39] = greycat.types_by_name.get(core.FloatPrecision.name);
		if(this.mapped[39] != null){
			this.mapped[39].resolveGeneratedOffsetWithValues("p1", java.lang.Double.longBitsToDouble(4607182418800017408L),"p10", java.lang.Double.longBitsToDouble(4591870180066957722L),"p100", java.lang.Double.longBitsToDouble(4576918229304087675L),"p1000", java.lang.Double.longBitsToDouble(4562254508917369340L),"p10000", java.lang.Double.longBitsToDouble(4547007122018943789L),"p100000", java.lang.Double.longBitsToDouble(4532020583610935537L),"p1000000", java.lang.Double.longBitsToDouble(4517329193108106637L),"p10000000", java.lang.Double.longBitsToDouble(4502148214488346440L),"p100000000", java.lang.Double.longBitsToDouble(4487126258331716666L),"p1000000000", java.lang.Double.longBitsToDouble(4472406533629990549L),"p10000000000", java.lang.Double.longBitsToDouble(4457293557087583675L));
		}
		this.mapped[40] = greycat.types_by_name.get(core.t2f.name);
		this.mapped[41] = greycat.types_by_name.get(core.Date.name);
		if(this.mapped[41] != null){
			this.mapped[41].resolveGeneratedOffsets("year","month","day","hour","minute","second","microsecond");
		}
		this.mapped[42] = greycat.types_by_name.get(core.function.name);
		this.mapped[43] = greycat.types_by_name.get(core.str.name);
		this.mapped[44] = greycat.types_by_name.get(io.SmtpAuth.name);
		if(this.mapped[44] != null){
			this.mapped[44].resolveGeneratedOffsetWithValues("none", 0L,"plain", 1L,"login", 2L);
		}
		this.mapped[45] = greycat.types_by_name.get(io.Url.name);
		if(this.mapped[45] != null){
			this.mapped[45].resolveGeneratedOffsets("protocol","host","port","path","params","hash");
		}
		this.mapped[46] = greycat.types_by_name.get(io.File.name);
		if(this.mapped[46] != null){
			this.mapped[46].resolveGeneratedOffsets("path","size","last_modification");
		}
		this.mapped[47] = greycat.types_by_name.get(io.CsvAnalysisConfig.name);
		if(this.mapped[47] != null){
			this.mapped[47].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","row_limit","enumerable_limit","date_check_limit","date_formats");
		}
		if(this.mapped[47] != null){
			this.mapped[47].static_values = new java.lang.Object[]{100L,100L};
		}
		this.mapped[48] = greycat.types_by_name.get(io.Writer.name);
		if(this.mapped[48] != null){
			this.mapped[48].resolveGeneratedOffsets("path","append");
		}
		this.mapped[49] = greycat.types_by_name.get(io.GcbWriter.name);
		if(this.mapped[49] != null){
			this.mapped[49].resolveGeneratedOffsets("path","append");
		}
		this.mapped[50] = greycat.types_by_name.get(io.TextWriter.name);
		if(this.mapped[50] != null){
			this.mapped[50].resolveGeneratedOffsets("path","append");
		}
		this.mapped[51] = greycat.types_by_name.get(io.GcbReader.name);
		if(this.mapped[51] != null){
			this.mapped[51].resolveGeneratedOffsets("path","pos");
		}
		this.mapped[52] = greycat.types_by_name.get(io.SmtpMode.name);
		if(this.mapped[52] != null){
			this.mapped[52].resolveGeneratedOffsetWithValues("plain", 0L,"ssl_tls", 1L,"starttls", 2L);
		}
		this.mapped[53] = greycat.types_by_name.get(io.CsvColumnStatistics.name);
		if(this.mapped[53] != null){
			this.mapped[53].resolveGeneratedOffsets("name","example","null_count","bool_count","int_count","float_count","string_count","date_count","date_format_count","enumerable_count","profile");
		}
		this.mapped[54] = greycat.types_by_name.get(io.CsvFormat.name);
		if(this.mapped[54] != null){
			this.mapped[54].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","trim","format","tz","strict","nearest_time");
		}
		this.mapped[55] = greycat.types_by_name.get(io.CsvSharding.name);
		if(this.mapped[55] != null){
			this.mapped[55].resolveGeneratedOffsets("id","column","modulo");
		}
		this.mapped[56] = greycat.types_by_name.get(io.Email.name);
		if(this.mapped[56] != null){
			this.mapped[56].resolveGeneratedOffsets("from","subject","body","body_is_html","to","cc","bcc");
		}
		this.mapped[57] = greycat.types_by_name.get(io.CsvReader.name);
		if(this.mapped[57] != null){
			this.mapped[57].resolveGeneratedOffsets("path","pos","format","sharding");
		}
		this.mapped[58] = greycat.types_by_name.get(io.Reader.name);
		if(this.mapped[58] != null){
			this.mapped[58].resolveGeneratedOffsets("path","pos");
		}
		this.mapped[59] = greycat.types_by_name.get(io.Http.name);
		this.mapped[60] = greycat.types_by_name.get(io.CsvWriter.name);
		if(this.mapped[60] != null){
			this.mapped[60].resolveGeneratedOffsets("path","append","format");
		}
		this.mapped[61] = greycat.types_by_name.get(io.TextReader.name);
		if(this.mapped[61] != null){
			this.mapped[61].resolveGeneratedOffsets("path","pos");
		}
		this.mapped[62] = greycat.types_by_name.get(io.CsvStatistics.name);
		if(this.mapped[62] != null){
			this.mapped[62].resolveGeneratedOffsets("header_lines","separator","string_delimiter","decimal_separator","thousands_separator","columns","line_count","fail_count","file_count");
		}
		this.mapped[63] = greycat.types_by_name.get(io.JsonWriter.name);
		if(this.mapped[63] != null){
			this.mapped[63].resolveGeneratedOffsets("path","append");
		}
		this.mapped[64] = greycat.types_by_name.get(io.JsonReader.name);
		if(this.mapped[64] != null){
			this.mapped[64].resolveGeneratedOffsets("path","pos");
		}
		this.mapped[65] = greycat.types_by_name.get(io.Json.name);
		this.mapped[66] = greycat.types_by_name.get(io.Csv.name);
		this.mapped[67] = greycat.types_by_name.get(io.Smtp.name);
		if(this.mapped[67] != null){
			this.mapped[67].resolveGeneratedOffsets("host","port","mode","authenticate","user","pass");
		}
		this.mapped[68] = greycat.types_by_name.get(io.FileWalker.name);
		if(this.mapped[68] != null){
			this.mapped[68].resolveGeneratedOffsets("path");
		}
		this.mapped[69] = greycat.types_by_name.get(io.HttpHeader.name);
		if(this.mapped[69] != null){
			this.mapped[69].resolveGeneratedOffsets("name","value");
		}
		this.mapped[70] = greycat.types_by_name.get(runtime.LogLevel.name);
		if(this.mapped[70] != null){
			this.mapped[70].resolveGeneratedOffsetWithValues("error", null,"warn", null,"info", null,"perf", null,"trace", null);
		}
		this.mapped[71] = greycat.types_by_name.get(runtime.RuntimeInfo.name);
		if(this.mapped[71] != null){
			this.mapped[71].resolveGeneratedOffsets("version","program_version","arch","timezone","license","io_threads","bg_threads","fg_threads","mem_total","mem_worker","disk_data_bytes");
		}
		this.mapped[72] = greycat.types_by_name.get(runtime.SecurityEntity.name);
		if(this.mapped[72] != null){
			this.mapped[72].resolveGeneratedOffsets("id","name","activated");
		}
		this.mapped[73] = greycat.types_by_name.get(runtime.Debug.name);
		if(this.mapped[73] != null){
			this.mapped[73].resolveGeneratedOffsets("id","frames","root");
		}
		this.mapped[74] = greycat.types_by_name.get(runtime.Role.name);
		if(this.mapped[74] != null){
			this.mapped[74].resolveGeneratedOffsets("name","permissions");
		}
		this.mapped[75] = greycat.types_by_name.get(runtime.Log.name);
		if(this.mapped[75] != null){
			this.mapped[75].resolveGeneratedOffsets("level","time","user_id","id","id2","src","tag","data");
		}
		this.mapped[76] = greycat.types_by_name.get(runtime.Variable.name);
		if(this.mapped[76] != null){
			this.mapped[76].resolveGeneratedOffsets("name","value");
		}
		this.mapped[77] = greycat.types_by_name.get(runtime.OpenIDConnect.name);
		if(this.mapped[77] != null){
			this.mapped[77].resolveGeneratedOffsets("url","clientId");
		}
		this.mapped[78] = greycat.types_by_name.get(runtime.License.name);
		if(this.mapped[78] != null){
			this.mapped[78].resolveGeneratedOffsets("name","start","end","company","max_memory","extra_1","extra_2","type");
		}
		this.mapped[79] = greycat.types_by_name.get(runtime.UserGroupPolicy.name);
		if(this.mapped[79] != null){
			this.mapped[79].resolveGeneratedOffsets("group_id","type");
		}
		this.mapped[80] = greycat.types_by_name.get(runtime.User.name);
		if(this.mapped[80] != null){
			this.mapped[80].resolveGeneratedOffsets("id","name","activated","full_name","email","role","groups","groups_flags","external");
		}
		this.mapped[81] = greycat.types_by_name.get(runtime.Job.name);
		if(this.mapped[81] != null){
			this.mapped[81].resolveGeneratedOffsets("function","arguments");
		}
		this.mapped[82] = greycat.types_by_name.get(runtime.SecurityFields.name);
		if(this.mapped[82] != null){
			this.mapped[82].resolveGeneratedOffsets("email","name","first_name","last_name","roles","groups");
		}
		this.mapped[83] = greycat.types_by_name.get(runtime.TaskStatus.name);
		if(this.mapped[83] != null){
			this.mapped[83].resolveGeneratedOffsetWithValues("empty", null,"waiting", null,"running", null,"await", null,"cancelled", null,"error", null,"ended", null,"ended_with_errors", null);
		}
		this.mapped[84] = greycat.types_by_name.get(runtime.LicenseType.name);
		if(this.mapped[84] != null){
			this.mapped[84].resolveGeneratedOffsetWithValues("community", null,"enterprise", null,"testing", null);
		}
		this.mapped[85] = greycat.types_by_name.get(runtime.Frame.name);
		if(this.mapped[85] != null){
			this.mapped[85].resolveGeneratedOffsets("module","type","function","src","line","column","scope");
		}
		this.mapped[86] = greycat.types_by_name.get(runtime.UserGroup.name);
		if(this.mapped[86] != null){
			this.mapped[86].resolveGeneratedOffsets("id","name","activated");
		}
		this.mapped[87] = greycat.types_by_name.get(runtime.CallPerf.name);
		if(this.mapped[87] != null){
			this.mapped[87].resolveGeneratedOffsets("duration","bytes_write_disk","bytes_write_disk_raw","bytes_read_disk","bytes_read_disk_raw","bytes_read_cache");
		}
		this.mapped[88] = greycat.types_by_name.get(runtime.SecurityPolicy.name);
		if(this.mapped[88] != null){
			this.mapped[88].resolveGeneratedOffsets("entities","credentials","fields","keys","keys_last_refresh");
		}
		this.mapped[89] = greycat.types_by_name.get(runtime.Runtime.name);
		this.mapped[90] = greycat.types_by_name.get(runtime.PeriodicTask.name);
		if(this.mapped[90] != null){
			this.mapped[90].resolveGeneratedOffsets("function","user_id","arguments","start","every");
		}
		this.mapped[91] = greycat.types_by_name.get(runtime.UserGroupPolicyType.name);
		if(this.mapped[91] != null){
			this.mapped[91].resolveGeneratedOffsetWithValues("read", null,"write", null,"execute", null);
		}
		this.mapped[92] = greycat.types_by_name.get(runtime.System.name);
		this.mapped[93] = greycat.types_by_name.get(runtime.UserCredential.name);
		if(this.mapped[93] != null){
			this.mapped[93].resolveGeneratedOffsets("offset","pass");
		}
		this.mapped[94] = greycat.types_by_name.get(runtime.Permission.name);
		if(this.mapped[94] != null){
			this.mapped[94].resolveGeneratedOffsets("name","description");
		}
		this.mapped[95] = greycat.types_by_name.get(runtime.Task.name);
		if(this.mapped[95] != null){
			this.mapped[95].resolveGeneratedOffsets("user_id","task_id","mod","type","fun","creation","start","duration","status","progress");
		}
		this.mapped[96] = greycat.types_by_name.get(util.LinearQuantizer.name);
		if(this.mapped[96] != null){
			this.mapped[96].resolveGeneratedOffsets("min","max","bins","open");
		}
		this.mapped[97] = greycat.types_by_name.get(util.Gaussian.name);
		if(this.mapped[97] != null){
			this.mapped[97].resolveGeneratedOffsets("sum","sumsq","count","min","max");
		}
		this.mapped[98] = greycat.types_by_name.get(util.Stack.name);
		if(this.mapped[98] != null){
			this.mapped[98].resolveGeneratedOffsets("values");
		}
		this.mapped[99] = greycat.types_by_name.get(util.GaussianProfile.name);
		if(this.mapped[99] != null){
			this.mapped[99].resolveGeneratedOffsets("quantizer","precision","bins","value_min","nb_rejected");
		}
		this.mapped[100] = greycat.types_by_name.get(util.ProgressTracker.name);
		if(this.mapped[100] != null){
			this.mapped[100].resolveGeneratedOffsets("start","total","counter","duration","progress","speed","remaining");
		}
		this.mapped[101] = greycat.types_by_name.get(util.Assert.name);
		this.mapped[102] = greycat.types_by_name.get(util.MultiQuantizer.name);
		if(this.mapped[102] != null){
			this.mapped[102].resolveGeneratedOffsets("quantizers");
		}
		this.mapped[103] = greycat.types_by_name.get(util.HistogramStats.name);
		if(this.mapped[103] != null){
			this.mapped[103].resolveGeneratedOffsets("min","max","whisker_low","whisker_high","percentile1","percentile5","percentile10","percentile20","percentile25","percentile50","percentile75","percentile80","percentile90","percentile95","percentile99","sum","avg","std","size");
		}
		this.mapped[104] = greycat.types_by_name.get(util.Crypto.name);
		this.mapped[105] = greycat.types_by_name.get(util.TimeWindow.name);
		if(this.mapped[105] != null){
			this.mapped[105].resolveGeneratedOffsets("values","span","sum","sumsq","field");
		}
		this.mapped[106] = greycat.types_by_name.get(util.Plot.name);
		this.mapped[107] = greycat.types_by_name.get(util.LogQuantizer.name);
		if(this.mapped[107] != null){
			this.mapped[107].resolveGeneratedOffsets("min","max","bins","open");
		}
		this.mapped[108] = greycat.types_by_name.get(util.QuantizerSlotBound.name);
		if(this.mapped[108] != null){
			this.mapped[108].resolveGeneratedOffsets("min","max","center");
		}
		this.mapped[109] = greycat.types_by_name.get(util.GaussianProfileSlot.name);
		if(this.mapped[109] != null){
			this.mapped[109].resolveGeneratedOffsets("sum","sumsq","count");
		}
		this.mapped[110] = greycat.types_by_name.get(util.SlidingWindow.name);
		if(this.mapped[110] != null){
			this.mapped[110].resolveGeneratedOffsets("values","span","sum","sumsq","field");
		}
		this.mapped[111] = greycat.types_by_name.get(util.HistogramBin.name);
		if(this.mapped[111] != null){
			this.mapped[111].resolveGeneratedOffsets("bin","count","ratio","cumulative_count","cumulative_ratio");
		}
		this.mapped[112] = greycat.types_by_name.get(util.Random.name);
		if(this.mapped[112] != null){
			this.mapped[112].resolveGeneratedOffsets("seed","v");
		}
		this.mapped[113] = greycat.types_by_name.get(util.CustomQuantizer.name);
		if(this.mapped[113] != null){
			this.mapped[113].resolveGeneratedOffsets("min","max","step_starts","open");
		}
		this.mapped[114] = greycat.types_by_name.get(util.Histogram.name);
		if(this.mapped[114] != null){
			this.mapped[114].resolveGeneratedOffsets("quantizer","bins","nb_rejected","nb_accepted","min","max","sum","sumsq");
		}
		this.mapped[115] = greycat.types_by_name.get(util.Quantizer.name);
		this.mapped[116] = greycat.types_by_name.get(util.Queue.name);
		if(this.mapped[116] != null){
			this.mapped[116].resolveGeneratedOffsets("values","capacity");
		}
	}
}
