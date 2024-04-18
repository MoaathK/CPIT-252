package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private List<CharacterMemento> savedStates = new ArrayList<>();
    public void saveState(CharacterMemento memento){
        savedStates.add(memento);
    }
    public CharacterMemento getState(int index){
        return savedStates.get(index);
    }

}
