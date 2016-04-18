package pl.keban.soskr.domain;

public enum PointedPattern {

	BURMESE_POINTED("31"),
	TONKINESE_POINTED("32"),
	SIAMESE_POINTED("33")
	;
	
	private PointedPattern(String code){
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	private String code;
}
