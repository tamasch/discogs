/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum LatinStyle implements Style {

	AFRO_CUBAN("Afro-Cuban"),
	AXO("Axé"),
	BACHATA("Bachata"),
	BATUCADA("Batucada"),
	BEGUINE("Beguine"),
	BOLERO("Bolero"),
	BOOGALOO("Boogaloo"),
	BOSSANOVA("Bossanova"),
	CHA_CHA("Cha-Cha"),
	CHARANGA("Charanga"),
	COMPAS("Compas"),
	CONJUNTO("Conjunto"),
	COPLA("Copla"),
	CORRIDO("Corrido"),
	CUATRO("Cuatro"),
	CUBANO("Cubano"),
	CUMBIA("Cumbia"),
	DANZON("Danzon"),
	DESCARGA("Descarga"),
	FLAMENCO("Flamenco"),
	FORRO("Forró"),
	GUAGUANCO("Guaguancó"),
	GUAJIRA("Guajira"),
	GUARACHA("Guaracha"),
	JIBARO("Jibaro"),
	JOROPO("Joropo"),
	LAMBADA("Lambada"),
	MPB("MPB"),
	MAMBO("Mambo"),
	MARIACHI("Mariachi"),
	MARIMBA("Marimba"),
	MERENGUE("Merengue"),
	NORTENO("Norteño"),
	NUEVA_CANCION("Nueva Cancion"),
	NUEVA_TROVA("Nueva Trova"),
	PACHANGA("Pachanga"),
	PLENA("Plena"),
	PORRO("Porro"),
	QUECHUA("Quechua"),
	RANCHERA("Ranchera"),
	REGGAETON("Reggaeton"),
	RUMBA("Rumba"),
	SALSA("Salsa"),
	SAMBA("Samba"),
	SON("Son"),
	SON_MONTUNO("Son Montuno"),
	SONERO("Sonero"),
	TANGO("Tango"),
	TEJANO("Tejano"),
	TIMBA("Timba"),
	TROVA("Trova"),
	VALLENATO("Vallenato");
	
	private String style;
	
	LatinStyle(String style){
		this.style = style;
	}
}
