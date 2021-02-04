package weapons;

public class Club implements IWeapon {

    private int damage;

    public Club(){
        this.damage = 20;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int attack(){
        return damage;
    }
}
