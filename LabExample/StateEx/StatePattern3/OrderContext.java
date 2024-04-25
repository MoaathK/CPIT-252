package StatePattern3;

public class OrderContext {
    private OrderState state;

    public OrderContext(OrderState state) {
        state = new ProcessingState();
    }
    public void setState(OrderState state) {
        this.state = state;
    }
    public void processOrder(){
        state.processOrder(this);

    }
    public void shipOrder(){
        state.shipOrder(this);

    }
    public void deliverOrder(){
        state.deliverOrder(this);

    }
    public void cancelOrder(){
        state.cancelOrder(this);

    }

}
