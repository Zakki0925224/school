package jp.ac.chuo;

public class Enemy
{
    public int hp = 1;

    public Enemy()
    {

    }

    public void showHp()
    {
        System.out.println("現在のHP: " + this.hp);
    }
}
