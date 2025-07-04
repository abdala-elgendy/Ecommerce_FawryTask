package Fawry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShippingService {
    public static void ship(List<Shippable> items) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        Map<String, Integer> countMap = new HashMap<>();

        for (Shippable item : items) {
            countMap.put(item.getName(), countMap.getOrDefault(item.getName(), 0) + 1);
            totalWeight += item.getWeight();
        }

        countMap.forEach((name, count) -> System.out.println(count + "x " + name));
        System.out.println("Total package weight " + totalWeight / 1000.0 + "kg");
    }
}
