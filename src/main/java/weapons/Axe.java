package weapons;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 60;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int attack() {
        return damage;
    }
}
