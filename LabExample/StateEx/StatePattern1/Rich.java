package StatePattern1;

public class Rich implements State{

    @Override
    public void saySomething(StateContext sx) {
        System.out.println("I'm rich currently, and play a lot");
        sx.changeState(new Poor());
    }
}
