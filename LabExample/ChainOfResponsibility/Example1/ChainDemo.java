package Example1;

public class ChainDemo {
    public static void main(String[] args) {
        Handler handler1 = new Addition();
        Handler handler2 = new Subtraction();
        Handler handler3 = new Multiply();


        handler1.nextHandler(handler2);
        handler2.nextHandler(handler3);

        // Addition
        Numbers request = new Numbers(10,2,"ADD");
        handler1.processRequest(request);

        // Subtraction
        request = new Numbers(10,2,"SUBTRACT");
        handler1.processRequest(request);

        // Multiply
        request = new Numbers(10,2,"MULTIPLY");
        handler1.processRequest(request);
    }
}
