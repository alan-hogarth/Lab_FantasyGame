package spells;

public class AvadaKedavra implements ISpell {

    private int damage;

    public AvadaKedavra() {
        this.damage = 50;
    }

    public int cast() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

}