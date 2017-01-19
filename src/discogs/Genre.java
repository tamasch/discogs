/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum Genre {

	ELECTRONIC("Electronic"),
	HIP_HOP("Hip Hop"),
	JAZZ("Jazz"),
	ROCK("Rock"),
	REGGAE("Reggae"),
	LATIN("Latin"),
	FUNK_SOUL("Funk / Soul"),
	BLUES("Blues"),
	NON_MUSIC("Non-Music"),
	POP("Pop"),
	CLASSICAL("Classical"),
	BRASS_MILITARY("Brass & Military"),
	CHILDREN_S("Children's"),
	FOLK_WORLD_COUNTRY("Folk, World, & Country"),
	STAGE_SCREEN("Stage & Screen");
	
	private String genre;
	
	Genre(String genre){
		this.genre = genre;
	}
}
