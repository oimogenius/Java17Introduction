package com.oimogenius.horse;

public class Main {
    public static void main(String[] args) {
        Horse.printCount();

        // ウマインスタンスを作成
        Horse shiro = new Horse("シロ", 5, 10);
        Horse.printCount();

        // ウマインスタンスを作成
        Horse kuro = new Horse("クロ", 3, 20);
        Horse.printCount();

        kuro.printSpeed();
        kuro.accelerate();
        kuro.decelerate();
    }
}
