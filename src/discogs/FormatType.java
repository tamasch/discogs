/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatType {
	VINYL("Vinyl"),
	CD("CD"),
	CDR("CDr");
	
	private String name;
	
	FormatType(String name){
		this.name = name;
	}
}
