/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatSpeed {
	
	_8_1_2("8 ½ RPM"),
	_16_2_3("16 ⅔ RPM"),
	_33_1_3("33 ⅓ RPM"),
	_45("45 RPM"),
	_78("78 RPM");
	
	private String speed;
	
	FormatSpeed(String speed){
		this.speed = speed;
	}
}
