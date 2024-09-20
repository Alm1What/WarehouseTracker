package org.example;

import org.example.component.App;
import org.example.component.MainFunctionClothes;
import org.example.component.TowerClothesFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        App app = new App(new TowerClothesFunction(), new MainFunctionClothes());


        app.startApp();

    }
}