package characters.enemies;

import characters.players.Player;
import weapons.IWeapon;

public class Orc extends Player {

    private IWeapon weapon;

    public Orc(String name, int health, IWeapon weapon) {
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
