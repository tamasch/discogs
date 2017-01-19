/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum FunkSoulStyle implements Style {

	AFROBEAT("Afrobeat"),
	BAYOU_FUNK("Bayou Funk"),
	BOOGIE("Boogie"),
	CONTEMPORARY_R_N_B("Contemporary R&B"),
	DISCO("Disco"),
	FREE_FUNK("Free Funk"),
	FUNK("Funk"),
	GOGO("Gogo"),
	GOSPEL("Gospel"),
	MINNEAPOLIS_SOUND("Minneapolis Sound"),
	NEO_SOUL("Neo Soul"),
	NEW_JACK_SWING("New Jack Swing"),
	P_FUNK("P.Funk"),
	PSYCHEDELIC("Psychedelic"),
	RHYTHM_N_BLUES("Rhythm & Blues"),
	SOUL("Soul"),
	SWINGBEAT("Swingbeat");
	
	private String style;
	
	private FunkSoulStyle(String style) {
		this.style = style;
	}
}
