package orderObserver;

import java.util.List;

class KitchenPrinter implements OrderObserver {
    @Override
    public void orderTaken(Order order) {
        int lineNumber = 1;
        System.out.format("Table Number %d\n", order.getTableNumber());
        for (String line : getDescriptions(order)) {
            System.out.format("%d. %s\n", lineNumber++, line);
        }
        System.out.format("==============\n");
    }

    static List<String> getDescriptions(Order order) {
        return order.getItems().stream().map(Pizza::getDescription).toList();
    }
}
