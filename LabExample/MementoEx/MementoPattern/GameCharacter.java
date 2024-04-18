package MementoPattern;

public class GameCharacter {
    private int powerLevel = 0;
    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
        System.out.println("Character Power Level: " +this.powerLevel);
    }
    public CharacterMemento save(){
        return new CharacterMemento(powerLevel);
    }
    public void restoreFromMemento(CharacterMemento memento){
        powerLevel = memento.getPowerLevel();
        System.out.println("Restored Power Level: "+powerLevel);
    }
}
