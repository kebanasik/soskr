package pl.keban.soskr.domain;

public enum EyeColour {

	DEEP_BLUE("61"),
	COPPER_OR_DEEP_ORANGE("62"),
	ODD_EYED("63"),
	GREEN("64"),
	GOLDEN_YELLOW("65"),
	AQUAMARINE("66"),
	INTENSE_DEEP_BLUE("67")
	;
	
	private EyeColour(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	private String code;
}
