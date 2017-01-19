/**
 * 
 */
package discogs.style;

/**
 * @author tschepacz
 *
 */
public enum ReggaeStyle implements Style {

	AZONTO("Azonto"),
	BUBBLING("Bubbling"),
	CALYPSO("Calypso"),
	DANCEHALL("Dancehall"),
	DUB("Dub"),
	DUB_POETRY("Dub Poetry"),
	JUNKANOO("Junkanoo"),
	LOVERS_ROCK("Lovers Rock"),
	MENTO("Mento"),
	RAGGA("Ragga"),
	RAPSO("Rapso"),
	REGGAE("Reggae"),
	REGGAE_GOSPEL("Reggae Gospel"),
	REGGAE_POP("Reggae-Pop"),
	ROCKSTEADY("Rocksteady"),
	ROOTS_REGGAE("Roots Reggae"),
	SKA("Ska"),
	SOCA("Soca"),
	STEEL_BAND("Steel Band");
	
	private String style;
	
	ReggaeStyle(String style){
		this.style = style;
	}
}
