/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum JazzStyle implements Style {

	AFRO_CUBAN_JAZZ("Afro-Cuban Jazz"),
	AFROBEAT("Afrobeat"),
	AVANT_GARDE_JAZZ("Avant-garde Jazz"),
	BIG_BAND("Big Band"),
	BOP("Bop"),
	BOSSA_NOVA("Bossa Nova"),
	CAPE_JAZZ("Cape Jazz"),
	CONTEMPORARY_JAZZ("Contemporary Jazz"),
	COOL_JAZZ("Cool Jazz"),
	DIXIELAND("Dixieland"),
	EASY_LISTENING("Easy Listening"),
	FREE_IMPROVISATION("Free Improvisation"),
	FREE_JAZZ("Free Jazz"),
	FUSION("Fusion"),
	GYPSY_JAZZ("Gypsy Jazz"),
	HARD_BOP("Hard Bop"),
	JAZZ_FUNK("Jazz-Funk"),
	JAZZ_ROCK("Jazz-Rock"),
	LATIN_JAZZ("Latin Jazz"),
	MODAL("Modal"),
	POST_BOP("Post Bop"),
	RAGTIME("Ragtime"),
	SMOOTH_JAZZ("Smooth Jazz"),
	SOUL_JAZZ("Soul-Jazz"),
	SPACE_AGE("Space-Age"),
	SWING("Swing");
	
	private String style;
	
	JazzStyle(String style){
		this.style = style;
	}
}
