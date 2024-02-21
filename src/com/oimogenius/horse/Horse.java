package com.oimogenius.horse;

public class Horse {
    /*** インスタンス変数 ***/
    public String name;
    public int speed;
    public int jumpAbility;

    /***
     * コンストラクタ
     * @param name：名前
     * @param speed：スピード
     * @param jumpAbility：ジャンプ力
     */
    public Horse(String name, int speed, int jumpAbility) {
        this.name = name;
        this.speed = speed;
        this.jumpAbility = jumpAbility;
    }

    /*** メソッド ***/
    public void run() {
        System.out.println(name + "は走った！");
    }

    public void jump(int hardle) {
        if (hardle <= jumpAbility) {
            // もしハードルがジャンプ力以下だったら、飛び越える
            System.out.println(name + "はハードルを飛び越えた！");
        } else {
            // それ以外なら立往生する
            System.out.println(name + "は立往生している。。。");
        }
    }
}
