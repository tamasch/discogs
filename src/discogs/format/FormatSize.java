/**
 * 
 */
package discogs;

/**
 * @author tschepacz
 *
 */
public enum FormatSize {

	LP("LP"),
	_16("16\""),
	_12("12\""),
	_11("11\""),
	_10("10\""),
	_9("9\""),
	_8("8\""),
	_7("7\""),
	_6_1_2("6½\""),
	_6("6\""),
	_5_1_2("5½\""),
	_5("5\""),
	_4("4\""),
	_3_1_2("3½\""),
	_3("3\""),
	_2("2\"");
	
	private String name;
	
	FormatSize(String name){
		this.name = name;
	}
}
