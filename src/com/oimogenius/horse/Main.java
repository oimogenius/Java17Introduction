package com.oimogenius.horse;

public class Main {
    public static void main(String[] args) {
        // ウマインスタンスを作成
        Horse shiro = new Horse("シロ", 5, 10);
        shiro.run();
        shiro.run();
        int hurdle = 6;
        shiro.jump(hurdle);
        shiro.run();
        hurdle = 15;
        shiro.jump(hurdle);

        // ウマインスタンスを作成
        Horse kuro = new Horse("クロ", 3, 20);
        kuro.run();
        kuro.jump(hurdle);

        kuro.accelerate();
        kuro.decelerate();

        // インスタンス変数はインスタンスを介してアクセスすることができる
        int kuroSpeed = kuro.speed;
        // ローカル変数はアクセスできない
//        int num = kuro.accelerate().num1;
    }
}
