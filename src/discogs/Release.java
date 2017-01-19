/**
 * 
 */
package discogs;

import java.util.Date;
import java.util.List;

/**
 * @author tschepacz
 *
 */
public class Release {

	private float id;
	private String catalogNumber;
	private String title;
	private List<Artist> artist;
	private Label label;
	private List<Format> format;
	private Country country;
	private Date released;
	private List<Genre> genre;
	private List<Style> style;
	

	public float getId() {
		return id;
	}
	

	public String getTitle() {
		return title;
	}
	

	public List<Artist> getArtist() {
		return artist;
	}
	

	public Label getLabel() {
		return label;
	}
	

	public List<Format> getFormat() {
		return format;
	}
	

	public Country getCountry() {
		return country;
	}

	
	public Date getReleased() {
		return released;
	}
	

	public List<Genre> getGenre() {
		return genre;
	}
	

	public List<Style> getStyle() {
		return style;
	}
}
