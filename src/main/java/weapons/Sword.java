package weapons;

public class Sword implements IWeapon {

    private int damage;

    public Sword() {
        this.damage = 50;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int attack() {
        return damage;
    }

}
