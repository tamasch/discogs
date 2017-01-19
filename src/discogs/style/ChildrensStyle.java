/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum ChildrensStyle implements Style {

	EDUCATIONAL("Educational"),
	NURSERY_RHYMES("Nursery Rhymes"),
	STORY("Story");
	
	private String style;
	
	private ChildrensStyle(String style) {
		this.style = style;
	}
}
