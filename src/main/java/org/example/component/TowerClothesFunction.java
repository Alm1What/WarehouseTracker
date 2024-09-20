package org.example.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TowerClothesFunction {

    // Мапа для зберігання одягу
    private Map<Integer, List<String>> warehouse = new HashMap<>();

    // Виводимо всі елементи мапи
    public Map<Integer, List<String>> getWarehouse() {
        for (Map.Entry<Integer, List<String>> entry : warehouse.entrySet()) {
            System.out.println("Tower: " + entry.getKey() + " Contains: " + entry.getValue());
        }
        return warehouse;
    }

    // Додаємо значення до мапи
    public void setWarehouse(int numberTower, String value) {
        if (!warehouse.containsKey(numberTower)) {
            warehouse.put(numberTower, new ArrayList<>());
        }
        warehouse.get(numberTower).add(value);
    }
}
