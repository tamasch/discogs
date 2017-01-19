/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum PopStyle implements Style {

	BALLAD("Ballad"),
	BOLLYWOOD("Bollywood"),
	BUBBLEGUM("Bubblegum"),
	CHANSON("Chanson"),
	ENKA("Enka"),
	EUROPOP("Europop"),
	INDIE_POP("Indie Pop"),
	J_POP("J-pop"),
	KARAOKE("Karaoke"),
	KAYOKYOKU("Kayōkyoku"),
	LIGHT_MUSIC("Light Music"),
	MUSIC_HALL("Music Hall"),
	NOVELTY("Novelty"),
	PARODY("Parody"),
	SCHLAGER("Schlager"),
	VOCAL("Vocal");
	
	private String style;
	
	private PopStyle(String style) {
		this.style = style;
	}
}
