/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatSize {
	LP("LP"),
	SIXTEEN("16\"");
	
	private String name;
	
	FormatSize(String name){
		this.name = name;
	}
}
