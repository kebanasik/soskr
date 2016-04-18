package pl.keban.soskr.domain;

public enum AmountOfWhite {
	
	VAN("01"),
	HARLEQUIN("02"),
	BICOLOUR("03"),
	MITTED("04"),
	SNOWSHOE("05"),
	OTHER("09")
	;
	
	
	
	private AmountOfWhite(String code){
		this.code = code;
	}
	
	private String code;
}
