/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatSpeed {
	
	_8_1_2("8 1/2 RPM"),
	_16_2_3("16 2/3 RPM"),
	_33_1_3("33 1/3 RPM"),
	_45("45 RPM"),
	_78("78 RPM");
	
	private String speed;
	
	FormatSpeed(String speed){
		this.speed = speed;
	}
}
