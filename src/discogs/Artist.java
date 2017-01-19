/**
 * 
 */
package discogs;

import java.util.List;

/**
 * @author tschepacz
 *
 */
public class Artist {

	private float id;
	private String name;
	private String realName;
	private List<Artist> aliases;
	private List<String> variations;
	
	public float getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getRealName() {
		return realName;
	}
	
	public List<Artist> getAliases() {
		return aliases;
	}
	
	public List<String> getVariations() {
		return variations;
	} 
}
