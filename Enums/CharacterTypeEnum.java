package Enums;

/*
* made by: gabo2105MS
*/

public enum CharacterTypeEnum {
    
    SURVEILLANCE(0),
    AGGRESSIVENESS(1),
    HEROISM(2),
    COMMAND(3),
    CUNNING(4),
    EVIL(5),
    NORMAL(6);
    
    private final int id;

    private CharacterTypeEnum(int id) {
	this.id = id;
    }
    
    public static CharacterTypeEnum byId(int id){
        
        for(CharacterTypeEnum chType : CharacterTypeEnum.values()){
            if(chType.getId() == id)
                return chType;
        }
        
        return NORMAL;
    }
    
    public static int getSpecialLimit(){
        
        return EVIL.getId(); 
    }
    
    public static double getEvolPercentage(){
        
        return 0.75;
    }
    
    public static double getNormalPercentage(){
        
        return 0.75;
    }

    public int getId() {
	return id;
    }
}
