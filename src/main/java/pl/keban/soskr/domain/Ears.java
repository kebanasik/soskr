package pl.keban.soskr.domain;

public enum Ears {

	STRAIGHT("71"),
	CURLED("72")
	;
	
	private Ears(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	private String code;
}
