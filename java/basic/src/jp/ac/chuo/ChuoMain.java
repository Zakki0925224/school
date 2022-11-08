package jp.ac.chuo;

public class ChuoMain {
    public ChuoMain() {
        var h1 = new Hero(100, 0, 100, 0, 1, "Hero");
        var e1 = new Enemy(100, 0, 0, 100, 1, "Enemy");
        h1.showStatus();
        h1.receiveDamage(9999);
        h1.showStatus();

        overloadSample();
    }

    private void overloadSample() {
        var hero = new Hero();
        hero.setHp(29);
        hero.setHp("500");
        System.out.println(hero.getHp());
    }
}
