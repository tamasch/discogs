/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum BluesStyle implements Style {

	BOOGIE_WOOGIE("Boogie Woogie"),
	CHICAGO_BLUES("Chicago Blues"),
	COUNTRY_BLUES("Country Blues"),
	DELTA_BLUES("Delta Blues"),
	EAST_COAST_BLUES("East Coast Blues"),
	ELECTRIC_BLUES("Electric Blues"),
	HARMONICA_BLUES("Harmonica Blues"),
	JUMP_BLUES("Jump Blues"),
	LOUISIANA_BLUES("Louisiana Blues"),
	MEMPHIS_BLUES("Memphis Blues"),
	MODERN_ELECTRIC_BLUES("Modern Electric Blues"),
	PIANO_BLUES("Piano Blues"),
	PIEDMONT_BLUES("Piedmont Blues"),
	RHYTHM_N_BLUES("Rhythm & Blues"),
	TEXAS_BLUES("Texas Blues");
	
	private String style;
	
	private BluesStyle(String style) {
		this.style = style;
	}
}
