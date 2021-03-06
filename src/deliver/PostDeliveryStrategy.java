package deliver;

import decorator.Item;

import java.util.LinkedList;

public class PostDeliveryStrategy implements IDelivery {
    public String deliver(LinkedList<Item> items){
        String bouq = "";
        for(Item bou : items){
            bouq += bou.getDescription();
        }
        return bouq;
    }
}
