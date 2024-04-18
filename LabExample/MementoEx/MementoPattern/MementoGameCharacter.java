package MementoPattern;

public class MementoGameCharacter {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        GameManager manager = new GameManager();
        character.setPowerLevel(10);
        manager.saveState(character.save());
        character.setPowerLevel(20);
        manager.saveState(character.save());
        character.restoreFromMemento(manager.getState(0));

    }
}
