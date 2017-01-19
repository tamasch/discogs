/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum NonMusicStyle implements Style {

	AUDIOBOOK("Audiobook"),
	COMEDY("Comedy"),
	DIALOGUE("Dialogue"),
	EDUCATION("Education"),
	FIELD_RECORDING("Field Recording"),
	INTERVIEW("Interview"),
	MONOLOG("Monolog"),
	MOVIE_EFFECTS("Movie Effects"),
	POETRY("Poetry"),
	POLITICAL("Political"),
	PROMOTIONAL("Promotional"),
	PUBLIC_BROADCAST("Public Broadcast"),
	PUBLIC_SERVICE_ANNOUNCEMENT("Public Service Announcement"),
	RADIOPLAY("Radioplay"),
	RELIGIOUS("Religious"),
	SERMON("Sermon"),
	SOUND_ART("Sound Art"),
	SOUND_POETRY("Sound Poetry"),
	SPECIAL_EFFECTS("Special Effects"),
	SPEECH("Speech"),
	SPOKEN_WORD("Spoken Word"),
	TECHNICAL("Technical"),
	THERAPY("Therapy");
	
	private String style;
	
	private NonMusicStyle(String style) {
		this.style = style;
	}
}
