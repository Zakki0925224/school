package jp.ac.chuo;

public class Hero
{
    public int hp = 1;

    public Hero()
    {

    }

    public void showHp()
    {
        System.out.println("現在のHP: " + this.hp);
    }

    public void receiveDamage(int damagePoint)
    {
        this.hp -= damagePoint;
        System.out.println("Heroは" + damagePoint + "ダメージを受けた");
    }
}
