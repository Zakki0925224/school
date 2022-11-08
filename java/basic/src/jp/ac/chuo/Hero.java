package jp.ac.chuo;

public class Hero implements ICharacter {
    private int hp;
    private int mp;
    private int atk;
    private int def;
    private int level;
    private String name;

    public Hero(int hp, int mp, int atk, int def, int level, String name) {
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.name = name;
    }

    public Hero() {
    }

    public void showStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Lv.: " + this.level);
        System.out.println("HP: " + this.hp);
        System.out.println("MP: " + this.mp);
        System.out.println("ATK: " + this.atk);
        System.out.println("DEF: " + this.def);
    }

    public void receiveDamage(int point) {
        this.hp -= point;
        System.out.println(this.name + "は" + point + "ダメージを受けた");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setHp(String hp) {
        this.hp = Integer.parseInt(hp);
    }
}
