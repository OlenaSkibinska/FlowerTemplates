package deliver;

import decorator.Item;

import java.util.LinkedList;

public interface IDelivery {
    String deliver(LinkedList<Item> items);
}
