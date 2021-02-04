package spells;

public class Riddikulus implements ISpell {

    private int damage;

    public Riddikulus(){
        this.damage = 50;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int cast() {
        return damage;
    }
}
