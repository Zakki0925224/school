package jp.ac.chuo;

public interface ICharacter {
    public void showStatus();

    public void receiveDamage(int point);

    public int getHp();

    public void setHp(int hp);
}
