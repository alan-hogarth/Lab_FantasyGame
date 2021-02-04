package characters.enemies;

import characters.players.Player;
import weapons.IWeapon;

public class Orc extends Enemy {

    private IWeapon weapon;

    public Orc(int health, IWeapon weapon) {
        super(health);
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }
}
