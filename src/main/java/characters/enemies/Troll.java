package characters.enemies;

import weapons.IWeapon;

public class Troll extends Enemy {

    private IWeapon trollWeapon;

    public Troll(int health, IWeapon trollWeapon){
        super(health);
        this.trollWeapon = trollWeapon;


    }

}
