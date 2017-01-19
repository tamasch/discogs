/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum RockStyle implements Style {

	AOR("AOR"),
	ACID_ROCK("Acid Rock"),
	ACOUSTIC("Acoustic"),
	ALTERNATIVE_ROCK("Alternative Rock"),
	ARENA_ROCK("Arena Rock"),
	ART_ROCK("Art Rock"),
	AVANTGARDE("Avantgarde"),
	BEAT("Beat"),
	BLACK_METAL("Black Metal"),
	BLUES_ROCK("Blues Rock"),
	BRIT_POP("Brit Pop"),
	CLASSIC_ROCK("Classic Rock"),
	COLDWAVE("Coldwave"),
	COUNTRY_ROCK("Country Rock"),
	CRUST("Crust"),
	DEATH_METAL("Death Metal"),
	DEATHCORE("Deathcore"),
	DEATHROCK("Deathrock"),
	DOO_WOP("Doo Wop"),
	DOOM_METAL("Doom Metal"),
	EMO("Emo"),
	ETHEREAL("Ethereal"),
	EXPERIMENTAL("Experimental"),
	FOLK_METAL("Folk Metal"),
	FOLK_ROCK("Folk Rock"),
	FUNK_METAL("Funk Metal"),
	GARAGE_ROCK("Garage Rock"),
	GLAM("Glam"),
	GOTH_ROCK("Goth Rock"),
	GOTHIC_METAL("Gothic Metal"),
	GRINDCORE("Grindcore"),
	GRUNGE("Grunge"),
	HARD_ROCK("Hard Rock"),
	HARDCORE("Hardcore"),
	HEAVY_METAL("Heavy Metal"),
	INDIE_ROCK("Indie Rock"),
	INDUSTRIAL("Industrial"),
	KRAUTROCK("Krautrock"),
	LO_FI("Lo-Fi"),
	LOUNGE("Lounge"),
	MATH_ROCK("Math Rock"),
	MELODIC_DEATH_METAL("Melodic Death Metal"),
	MELODIC_HARDCORE("Melodic Hardcore"),
	METALCORE("Metalcore"),
	MOD("Mod"),
	NEOFOLK("Neofolk"),
	NEW_WAVE("New Wave"),
	NO_WAVE("No Wave"),
	NOISE("Noise"),
	NU_METAL("Nu Metal"),
	OI("Oi"),
	PARODY("Parody"),
	POP_PUNK("Pop Punk"),
	POP_ROCK("Pop Rock"),
	POST_ROCK("Post Rock"),
	POST_HARDCORE("Post-Hardcore"),
	POST_PUNK("Post-Punk"),
	POWER_METAL("Power Metal"),
	POWER_POP("Power Pop"),
	PROG_ROCK("Prog Rock"),
	PROGRESSIVE_METAL("Progressive Metal"),
	PSYCHEDELIC_ROCK("Psychedelic Rock"),
	PSYCHOBILLY("Psychobilly"),
	PUB_ROCK("Pub Rock"),
	PUNK("Punk"),
	ROCK_N_ROLL("Rock & Roll"),
	ROCKABILLY("Rockabilly"),
	SHOEGAZE("Shoegaze"),
	SKA("Ska"),
	SKIFFLE("Skiffle"),
	SLUDGE_METAL("Sludge Metal"),
	SOFT_ROCK("Soft Rock"),
	SOUTHERN_ROCK("Southern Rock"),
	SPACE_ROCK("Space Rock"),
	SPEED_METAL("Speed Metal"),
	STONER_ROCK("Stoner Rock"),
	SURF("Surf"),
	SWAMP_POP("Swamp Pop"),
	SYMPHONIC_ROCK("Symphonic Rock"),
	THRASH("Thrash"),
	VIKING_METAL("Viking Metal");
	
	private String style;
	
	RockStyle(String style){
		this.style = style;
	}
}
