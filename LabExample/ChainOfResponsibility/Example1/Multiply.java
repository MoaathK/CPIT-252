package Example1;

public class Multiply implements Handler{
    public Handler nextHandler;
    @Override
    public void nextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;

    }

    @Override
    public void processRequest(Numbers request) {
        if (request.getOperation()  == "MULTIPLY"){
            int number1 = request.getNumber1();
            int number2 = request.getNumber2();
            int sum = number1 * number2;
            System.out.println(number1+ " * " + number2 + " = " + sum);
        }
        else
            nextHandler.processRequest(request);
    }
}
