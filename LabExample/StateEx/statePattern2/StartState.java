package statePattern2;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start State");
        context.setState(this);
    }
    public String toString(){
        return "start State";
    }

}
