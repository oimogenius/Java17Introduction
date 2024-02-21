package com.oimogenius.horse;

public class Main {
    public static void main(String[] args) {
        // ウマインスタンスを作成
        Horse shiro = new Horse("シロ", 5, 10);
        shiro.run();
        shiro.run();
        int hardle = 6;
        shiro.jump(hardle);
        shiro.run();
        hardle = 15;
        shiro.jump(hardle);

        // ウマインスタンスを作成
        Horse kuro = new Horse("クロ", 3, 20);
        kuro.run();
        kuro.jump(hardle);
    }
}
