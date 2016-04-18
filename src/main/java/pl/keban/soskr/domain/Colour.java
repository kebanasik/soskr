package pl.keban.soskr.domain;

public enum Colour {
	
	BLACK("n", "black"),
	SEAL("n", "seal"),
	BROWN("n", "brown"),
	RUDDY("n", "ruddy"),
	TAWNY("n", "tawny"),
	BLUE("a", "blue"),
	CHOCOLATE("b", "chocolate"),
	LILAC("c","lilac"),
	RED("d","red"),
	CREAM("e","cream"),
	BLACK_TORTIE("f", "black tortie"),
	BLUE_TORTIE("g", "blue tortie"),
	CHOCOLATE_TORTIE("h", "chocolate tortie"),
	LILAC_TORTIE("j", "lilac tortie"),
	CINNAMON("o", "cinnamon"),
	FAWN("p", "fawn"),
	CINAMON_TORTIE("r", "cinnamon tortie"),
	FAWN_TORTIE("r", "fawn tortie"),
	WHITE("w", "white"),
	AMBER("nt", "amber"),
	LIGHT_AMBER("at", "light amber"),
	RED_BASED_ON_AMBER("dt", "red based on amber"),
	CREAM_BASED_ON_AMBER("et", "cream based on amber"),
	AMBER_TORTIE("ft", "amber tortie"),
	LIGHT_AMBER_TORTIE("gt", "light amber tortie");
	
	private Colour(String code, String description){
		this.code = code;
		this.description = description;
	}
	
	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}

	private String code;
	private String description;
}
