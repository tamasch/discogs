/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatType {

	VINYL("Vinyl"),
	ACETATE("Acetate"),
	FLEXI_DISC("Flexi-disc"),
	LATHE_CUT("Lathe Cut"),
	SHELLAC("Shellac"),
	PATHÉ_DISC("Pathé Disc"),
	EDISON_DISC("Edison Disc"),
	CYLINDER("Cylinder"),
	CD("CD"),
	CDR("CDr"),
	CDV("CDV"),
	DVD("DVD"),
	DVDR("DVDr"),
	HD_DVD("HD DVD"),
	HD_DVD_R("HD DVD-R"),
	BLU_RAY("Blu-ray"),
	BLU_RAY_R("Blu-ray-R"),
	SACD("SACD"),
	_4_TRACK_CARTRIDGE("4-Track Cartridge"),
	_8_TRACK_CARTRIDGE("8-Track Cartridge"),
	CASSETTE("Cassette"),
	PLAYTAPE("PlayTape"),
	TEFIFON("Tefifon"),
	DAT("DAT"),
	DCC("DCC"),
	MICROCASSETTE("Microcassette"),
	REEL_TO_REEL("Reel-To-Reel"),
	BETACAM("Betacam"),
	BETACAM_SP("Betacam SP"),
	BETAMAX("Betamax"),
	MINIDV("MiniDV"),
	U_MATIC("U-matic"),
	VHS("VHS"),
	VIDEO_2000("Video 2000"),
	VIDEO8("Video8"),
	LASERDISC("Laserdisc"),
	SELECTAVISION("SelectaVision"),
	VHD("VHD"),
	WIRE_RECORDING("Wire Recording"),
	MINIDISC("Minidisc"),
	MVD("MVD"),
	UMD("UMD"),
	FLOPPY_DISK("Floppy Disk"),
	FILE("File"),
	MEMORY_STICK("Memory Stick"),
	HYBRID("Hybrid"),
	ALL_MEDIA("All Media"),
	BOX_SET("Box Set");
	
	private String name;
	
	FormatType(String name){
		this.name = name;
	}
}
