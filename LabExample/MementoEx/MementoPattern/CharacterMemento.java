package MementoPattern;

public class CharacterMemento {
    private int powerLevel;
    public CharacterMemento(int level){
        this.powerLevel = level;
    }
    public int getPowerLevel(){
        return this.powerLevel;
    }
}
