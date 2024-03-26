package com.oimogenius.horse;

public class RaceHorse extends Horse {
    public int win;
    public int lose;
    public int draw;

    public RaceHorse(String name, int speed, int jumpAbility) {
        // 親クラスのコンストラクタを呼び出し
        super(name, speed, jumpAbility);
    }

    @Override
    public void run() {
        System.out.println(name + "は駆け抜けた！");
    }

    public void printScore() {
        System.out.println(win + "勝" + lose + "敗" + draw + "引き分け");
    }
}
