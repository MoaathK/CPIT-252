package StatePattern1;

public class Poor implements State{
    @Override
    public void saySomething(StateContext sx) {
        System.out.println("I'm Poor currently, and spend much time working");
        sx.changeState(new Rich());

    }
}
