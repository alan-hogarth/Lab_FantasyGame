package characters.players.fighters;

import weapons.IWeapon;

public class Barbarian extends Fighter {

    private Barbarian barbarian;
    private IWeapon weapon;

    public Barbarian(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon){
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }


}
