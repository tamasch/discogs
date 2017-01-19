/**
 * 
 */
package discogs;

import java.util.List;

/**
 * @author tschepacz
 *
 */
public class Format {

	private List<FormatType> formatType;
	private List<FormatSize> formatSize;
	private List<FormatSpeed> formatSpeed;
	private List<FormatDescription> formatDescription;
	private List<FormatChannels> formatChannels;
	
	public List<FormatType> getFormatType() {
		return formatType;
	}
	public List<FormatSize> getFormatSize() {
		return formatSize;
	}
	public List<FormatSpeed> getFormatSpeed() {
		return formatSpeed;
	}
	public List<FormatDescription> getFormatDescription() {
		return formatDescription;
	}
	public List<FormatChannels> getFormatChannels() {
		return formatChannels;
	}

}
