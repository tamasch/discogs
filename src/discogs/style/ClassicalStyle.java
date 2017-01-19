/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum ClassicalStyle implements Style {

	BAROQUE("Baroque"),
	CLASSICAL("Classical"),
	CONTEMPORARY("Contemporary"),
	EARLY("Early"),
	IMPRESSIONIST("Impressionist"),
	MEDIEVAL("Medieval"),
	MODERN("Modern"),
	NEO_CLASSICAL("Neo-Classical"),
	NEO_ROMANTIC("Neo-Romantic"),
	OPERA("Opera"),
	OPERETTA("Operetta"),
	POST_MODERN("Post-Modern"),
	RENAISSANCE("Renaissance"),
	ROMANTIC("Romantic"),
	SERIAL("Serial"),
	TWELVE_TONE("Twelve-tone");
	
	private String style;
	
	private ClassicalStyle(String style) {
		this.style = style;
	}
}
