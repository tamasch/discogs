/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum HipHopStyle implements Style {

	BASS_MUSIC("Bass Music"),
	BEATBOX("Beatbox"),
	BONGO_FLAVA("Bongo Flava"),
	BOOM_BAP("Boom Bap"),
	BOUNCE("Bounce"),
	BRITCORE("Britcore"),
	CLOUD_RAP("Cloud Rap"),
	CONSCIOUS("Conscious"),
	CRUNK("Crunk"),
	CUT_UP_DJ("Cut-up/DJ"),
	DJ_BATTLE_TOOL("DJ Battle Tool"),
	ELECTRO("Electro"),
	FAVELA_FUNK("Favela Funk"),
	G_FUNK("G-Funk"),
	GANGSTA("Gangsta"),
	GO_GO("Go-Go"),
	GRIME("Grime"),
	HARDCORE_HIP_HOP("Hardcore Hip-Hop"),
	HIPLIFE("Hiplife"),
	HORRORCORE("Horrorcore"),
	HYPHY("Hyphy"),
	INSTRUMENTAL("Instrumental"),
	JAZZY_HIP_HOP("Jazzy Hip-Hop"),
	KWAITO("Kwaito"),
	MIAMI_BASS("Miami Bass"),
	MOTSWAKO("Motswako"),
	POP_RAP("Pop Rap"),
	RAGGA_HIPHOP("Ragga HipHop"),
	RNB_SWING("RnB/Swing"),
	SCREW("Screw"),
	SPAZA("Spaza"),
	THUG_RAP("Thug Rap"),
	TRAP("Trap"),
	TRIP_HOP("Trip Hop"),
	TURNTABLISM("Turntablism");
	
	private String style;
	
	HipHopStyle(String style){
		this.style = style;
	}
}
