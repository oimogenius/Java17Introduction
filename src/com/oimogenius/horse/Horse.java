package com.oimogenius.horse;

public class Horse {
    /*** static変数 ***/
    public static int count = 0;

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
        // カウントに１を足す
        count++;
    }

    /*** インスタンスメソッド ***/
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
        // スピードを二乗する
        speed = (int) Math.pow(speed, 2.0);
        printSpeed();
    }

    public void decelerate() {
        // スピードを半分にして四捨五入する
        speed = Math.round(speed / 2.0f);
        printSpeed();
    }

    public void printSpeed() {
        System.out.println(name + "の現在の速度：" + speed);
    }

    public String getNickName(String suffix) {
        // 名前の後ろにsuffixを付けて返却
        return name + suffix;
    }

    /*** staticメソッド ***/
    public static void printCount() {
        System.out.println("現在のウマの数：" + count + "頭");
    }
}
