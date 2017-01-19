/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum BrassMilitaryStyle implements Style {

	BRASS_BAND("Brass Band"),
	MARCHES("Marches"),
	MILITARY("Military"),
	PIPE_AND_DRUM("Pipe & Drum");
	
	private String style;
	
	private BrassMilitaryStyle(String style) {
		this.style = style;
	}
}
