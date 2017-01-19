/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum FolkWorldCountryStyle implements Style {

	ABORIGINAL("Aboriginal"),
	AFRICAN("African"),
	ANDALUSIAN_CLASSICAL("Andalusian Classical"),
	BANGLADESHI_CLASSICAL("Bangladeshi Classical"),
	BHANGRA("Bhangra"),
	BLUEGRASS("Bluegrass"),
	CAJUN("Cajun"),
	CAMBODIAN_CLASSICAL("Cambodian Classical"),
	CANZONE_NAPOLETANA("Canzone Napoletana"),
	CARNATIC("Carnatic"),
	CATALAN_MUSIC("Catalan Music"),
	CELTIC("Celtic"),
	CHAMAMÉ("Chamamé"),
	CHINESE_CLASSICAL("Chinese Classical"),
	COUNTRY("Country"),
	FADO("Fado"),
	FOLK("Folk"),
	GAGAKU("Gagaku"),
	GAMELAN("Gamelan"),
	GOSPEL("Gospel"),
	GRIOT("Griot"),
	GUARANIA("Guarania"),
	HIGHLIFE("Highlife"),
	HILLBILLY("Hillbilly"),
	HINDUSTANI("Hindustani"),
	HONKY_TONK("Honky Tonk"),
	INDIAN_CLASSICAL("Indian Classical"),
	KASEKO("Kaseko"),
	KERONCONG("Keroncong"),
	KLASIK("Klasik"),
	KLEZMER("Klezmer"),
	KOREAN_COURT_MUSIC("Korean Court Music"),
	LAO_MUSIC("Lao Music"),
	LAIKO("Laïkó"),
	LUK_KRUNG("Luk Krung"),
	LUK_THUNG("Luk Thung"),
	MBALAX("Mbalax"),
	MIN_YO("Min'yō"),
	MIZRAHI("Mizrahi"),
	MOUTH_MUSIC("Mouth Music"),
	MUGHAM("Mugham"),
	NORDIC("Nordic"),
	NEPZENE("Népzene"),
	OTTOMAN_CLASSICAL("Ottoman Classical"),
	OVERTONE_SINGING("Overtone Singing"),
	PACIFIC("Pacific"),
	PERSIAN_CLASSICAL("Persian Classical"),
	PHILIPPINE_CLASSICAL("Philippine Classical"),
	PHLENG_PHUEA_CHIWIT("Phleng Phuea Chiwit"),
	PIOBAIREACHD("Piobaireachd"),
	POLKA("Polka"),
	RAI("Raï"),
	REBETIKO("Rebetiko"),
	ROMANI("Romani"),
	RUNE_SINGING("Rune Singing"),
	SEA_SHANTIES("Sea Shanties"),
	SEPHARDIC("Sephardic"),
	SOUKOUS("Soukous"),
	SAMI_MUSIC("Sámi Music"),
	SEGA("Séga"),
	THAI_CLASSICAL("Thai Classical"),
	VOLKSMUSIK("Volksmusik"),
	WESTERN_SWING("Western Swing"),
	ZOUK("Zouk"),
	ZYDECO("Zydeco"),
	ENTEKHNO("Éntekhno");
	
	private String style;
	
	private FolkWorldCountryStyle(String style) {
		this.style = style;
	}
}
