package characters.players.fighters;

import weapons.IWeapon;

public class Dwarf extends Fighter {

    private IWeapon weapon;

    public Dwarf(String name, int health, IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }
}
