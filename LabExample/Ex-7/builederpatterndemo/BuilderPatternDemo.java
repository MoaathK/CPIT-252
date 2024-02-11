package builederpatterndemo;

import java.io.IOException;

public class BuilderPatternDemo {
    public static void main(String[] args) throws IOException {
        OrderBuilder builder = new OrderBuilder();
        OrderedItems orderedItems = builder.preparePizza();
        orderedItems.showItems();
        System.out.println("\n");
        System.out.println("Total Cost : "+orderedItems.getCost());

    }
}
