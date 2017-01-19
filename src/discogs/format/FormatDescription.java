/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatDescription {

	ALBUM("Album"),
	MINI_ALBUM("Mini-Album"),
	EP("EP"),
	MAXI_SINGLE("Maxi-Single"),
	SINGLE("Single"),
	COMPILATION("Compilation"),
	CARD_BACKED("Card Backed"),
	CLUB_EDITION("Club Edition"),
	DELUXE_EDITION("Deluxe Edition"),
	ENHANCED("Enhanced"),
	ETCHED("Etched"),
	JUKEBOX("Jukebox"),
	LIMITED_EDITION("Limited Edition"),
	MISPRESS("Mispress"),
	MISPRINT("Misprint"),
	MIXED("Mixed"),
	MIXTAPE("Mixtape"),
	NUMBERED("Numbered"),
	PARTIALLY_MIXED("Partially Mixed"),
	PARTIALLY_UNOFFICIAL("Partially Unofficial"),
	PICTURE_DISC("Picture Disc"),
	PROMO("Promo"),
	REISSUE("Reissue"),
	REMASTERED("Remastered"),
	REPRESS("Repress"),
	SAMPLER("Sampler"),
	SPECIAL_EDITION("Special Edition"),
	TEST_PRESSING("Test Pressing"),
	TRANSCRIPTION("Transcription"),
	UNOFFICIAL_RELEASE("Unofficial Release"),
	WHITE_LABEL("White Label");
	
	private String description;
	
	FormatDescription(String description){
		this.description = description;
	}
}
