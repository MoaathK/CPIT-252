package statePattern2;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop State");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }

}
