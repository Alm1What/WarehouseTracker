package org.example.component;

public class App {

    private TowerClothesFunction towerClothesFunction;
    private MainFunctionClothes mainFunctionClothes;

    public App(final TowerClothesFunction towerClothesFunction, final MainFunctionClothes mainFunctionClothes) {
        this.towerClothesFunction = towerClothesFunction;
        this.mainFunctionClothes = mainFunctionClothes;
    }

    public void startApp() {
        System.out.println("Виберіть представлені дії:");
        mainFunctionClothes.CreateTower();

        // Додаємо значення у мапу
        towerClothesFunction.setWarehouse(1, "Одяг 1");

        // Виводимо мапу
        towerClothesFunction.getWarehouse(); // Тут відбудеться виведення через System.out.println() всередині методу
    }
}
