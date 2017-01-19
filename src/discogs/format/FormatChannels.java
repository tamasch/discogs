/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatChannels {

	STEREO("Stereo"),
	MONO("Mono"),
	QUADRAPHONIC("Quadraphonic"),
	AMBISONIC("Ambisonic");
	
	private String channels;
	
	FormatChannels(String channels){
		this.channels = channels;
	}
}
