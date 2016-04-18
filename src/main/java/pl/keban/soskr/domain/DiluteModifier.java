package pl.keban.soskr.domain;

public enum DiluteModifier {

	MODIFIER("m"),
	CARAMEL_BASED_ON_BLUE("am"),
	CARAMEL_BASED_ON_LILAC("cm"),
	APRICOT_BASED_ON_CREAM("em"),
	CARAMEL_BASED_ON_FAWN("pm"),
	CARAMEL_WHERE_THE_BASE_COLOUR_IS_UNKNOWN("*m");
	
	private DiluteModifier(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	private String code;

}
