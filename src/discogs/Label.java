/**
 * 
 */
package discogs;

import java.util.List;

/**
 * @author tschepacz
 *
 */
public class Label {

	private float id;
	private String name;
	private List<Label> sublabels;
	private Label parentLabel;
}
