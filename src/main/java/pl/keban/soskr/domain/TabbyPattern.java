package pl.keban.soskr.domain;

public enum TabbyPattern {

	SHADED("11"),
	SHELL("12"),
	UNSPECIFIED_TABBY("21"),
	BLOTCHED_TABBY("22"),
	MACKEREL_TABBY("23"),
	SPOTTED_TABBY("24"),
	TICKED_TABBY("25")
	;
	
	private TabbyPattern(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	private String code;
}
