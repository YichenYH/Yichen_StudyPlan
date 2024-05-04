/*
LOL有很多英雄，比如盲僧，团战可以输，提莫必须死，盖伦，琴女
所有这些英雄，都有一些共同的状态
比如，他们都有名字，hp，护甲，移动速度等等
这样我们就可以设计一种东西，叫做类，代表英雄这样一种事物
类： 英雄(Hero)
状态： 名字, 血量，护甲，移动速度

注: 本例用到了3种数据类型 分别是 String(字符串)，float(浮点数), int(整数)，本章只做简单的使用 ，就不展开了，关于变量知识的详细讲解，将在下个章节展开.
注: 这个类没有主方法，不要试图运行它。 并不是所有的类都是有主方法的。
 */

 public class Hero {
    String HeroName; // 姓名
    float HeroHp; // 血量
    float HeroArmor; // 护甲
    int HeroMoveSpeed; // 移动速度

    /*
     * 一个英雄可以有名称，血量，护甲，移动速度，还有 其他你想到的，
     * 作为新的属性，加入到英雄上面
     * 比如
     * 送了多少次
     * 杀人次数
     * 助攻次数
     * 金钱
     * 补刀数
     * 攻击速度
     * 杀人后说的话
     * 被杀后说的话
     */

    int killed; // 送了多少次
    int kill; // 杀人次数
    int support; // 助攻次数
    int money; // 金钱
    int lastHit; // 补刀数
    int attackSpeed;// 攻击速度
    String wordAfterKill; // 杀人后说的话
    String wordAfterKilled; // 被杀后说的话

    public static void main(String[] args) {
        /*
         * 类就像一个模板，根据这样一个模板，可以创建一个个的具体的英雄
         * 一个个具体的英雄，就叫一个个的对象
         * new Hero() 就是java中创建一个英雄对象的意思
         */

        Hero garen = new Hero();
        garen.HeroName = "盖伦";
        garen.HeroHp = 1000;
        garen.HeroArmor = 80;
        garen.HeroMoveSpeed = 350;
        garen.kill = 7;

        Hero teemo = new Hero();
        teemo.HeroName = "提莫";
        teemo.HeroHp = 800;
        teemo.HeroArmor = 60;
        teemo.HeroMoveSpeed = 350;
        teemo.kill = 0;

        /*
         * int speed 叫做方法的参数
         * 给盖伦增加100的移动速度：
         */

        // 测试盖伦获得200 额外移速
        garen.addHeroMoveSpeed(200);
        System.out.println(garen.HeroMoveSpeed);
        // 测试盖伦超神了
        System.out.println(garen.HeroName+"当前击杀数为"+garen.kill);
        System.out.println(garen.HeroName+"击杀了"+teemo.HeroName);
        garen.kill = garen.kill+1;
        System.out.println(garen.HeroName+"当前击杀数为"+garen.kill);
        if (garen.kill >= 8) {
            garen.legendary();
        }
        //测试盖伦回血100
        System.out.println(garen.HeroName+"当前的血量是："+garen.getHeroHp());
        garen.recovery(100);
        System.out.println(garen.HeroName+"恢复了100HP");
        System.out.println(garen.HeroName+"当前的血量是："+garen.getHeroHp());
    }

    /*
     * 英雄在一些特定情况下，可以增加移动速度
     * 这样我们就通过addSpeed这个方法增加移动速度
     */
    void addHeroMoveSpeed(int addspeed) {
        HeroMoveSpeed = HeroMoveSpeed + addspeed;
    }

    /*
     * 为英雄类Hero设计几个新的方法：
     * 1. 超神 legendary(),无参数，无返回类型
     * 2. 获取当前的血量 getHp(), 无参数，有float类型的返回值
     * 3. 回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
     */
    void legendary() {
        System.out.println("超神了！");
    }

    float getHeroHp() {
        return HeroHp;
    }

    void recovery(float blood) {
        HeroHp = HeroHp + blood;
    }
}