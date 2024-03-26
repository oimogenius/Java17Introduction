package com.oimogenius.horse;

public class Main {
    public static void main(String[] args) {
        // ウマインスタンスを作成
        Horse shiro = new Horse("シロ", 5, 10);

        // ウマインスタンスを作成
        Horse kuro = new Horse("クロ", 3, 20);
        kuro.run();

        RaceHorse chacha = new RaceHorse("茶々丸", 7, 5);
        chacha.run();
        chacha.printScore();
        chacha.accelerate();
        // 親クラスは子クラスの持ち物を使えない
//        kuro.printScore();
    }
}
