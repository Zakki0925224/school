package jp.ac.chuo;

public class ChuoMain
{
    public ChuoMain()
    {
        var h1 = new Hero();
        h1.showHp();
        h1.receiveDamage(9999);

        if (h1.hp <= 0)
        {
            System.out.println("Heroはやられてしまった！");
        }
    }
}
