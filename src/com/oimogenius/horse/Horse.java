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

    public void jump(int hurdle) {
        if (hurdle <= jumpAbility) {
            // もしハードルがジャンプ力以下だったら、飛び越える
            System.out.println(name + "はハードルを飛び越えた！");
        } else {
            // それ以外なら立往生する
            System.out.println(name + "は立往生している。。。");
        }
    }

    public void accelerate() {
        // ローカル変数
        // accelerateメソッドの中でしか使えない
        int num1 = 1;
        // インスタンス変数はクラス内のどこでも使える
        speed += num1;
        printSpeed();
    }

    public void decelerate() {
        // accelerateメソッドの外なので使えない
//        speed -= num1;
        int num2 = 1;
        speed -= num2;
        printSpeed();
    }

    public void printSpeed() {
        System.out.println(name + "の現在の速度：" + speed);
    }
}
