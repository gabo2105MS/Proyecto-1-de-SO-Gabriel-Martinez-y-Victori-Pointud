package Enums;

/*
* made by: gabo2105MS
*/

public enum FactionEnum {
    STAR_WARS(0),
    STAR_TREK(1);
	
    private final int id;

    private FactionEnum(int id) {
	this.id = id;
    }
    
    public int getId() {
	return id;
    }
}
