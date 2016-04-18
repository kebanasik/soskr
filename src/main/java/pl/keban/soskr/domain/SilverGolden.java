package pl.keban.soskr.domain;

public enum SilverGolden {
	SILVER("s"),
	GOLDEN("y");
	
	private SilverGolden(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	private String code;
}
