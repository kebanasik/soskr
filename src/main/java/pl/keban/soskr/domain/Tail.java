package pl.keban.soskr.domain;

public enum Tail {

	RUMPY("51"),
	RUMPY_RISER("52"),
	STUMPY("53"),
	LONGIE("54")
	;
	
	private Tail(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	private String code;
}
