package Example1;

public interface Handler {
    public void nextHandler(Handler nextHandler);
    public void processRequest(Numbers request);
}
