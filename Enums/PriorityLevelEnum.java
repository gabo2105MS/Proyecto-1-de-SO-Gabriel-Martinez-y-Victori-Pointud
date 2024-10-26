package Enums;

/*
* made by: gabo2105MS
*/

public enum PriorityLevelEnum {
    
    LOW(0),  
    MEDIUM(1), 
    HIGH(2), 
    FIX(3);  
    
    private final int id;

    private PriorityLevelEnum(int id) {
	this.id = id;
    }
    
    public int getId() {
        return id;
    }
}
