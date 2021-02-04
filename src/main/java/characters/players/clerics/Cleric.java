package characters.players.clerics;

import characters.players.Player;
import potions.IHeal;

public class Cleric extends Player {

    private IHeal healingWeapon;

    public Cleric(String name, int health, IHeal healingWeapon) {
        super(name, health);
        this.healingWeapon = healingWeapon;
    }

    public void setHealingWeapon(IHeal healingWeapon) {
        this.healingWeapon = healingWeapon;
    }

    public IHeal getHealingWeapon() {
        return this.healingWeapon;
    }
}
