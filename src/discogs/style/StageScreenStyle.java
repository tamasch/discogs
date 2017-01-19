/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum StageScreenStyle implements Style {

	MUSICAL("Musical"),
	SCORE("Score"),
	SOUNDTRACK("Soundtrack"),
	THEME("Theme");
	
	private String style;
	
	private StageScreenStyle(String style) {
		this.style = style;
	}
}
