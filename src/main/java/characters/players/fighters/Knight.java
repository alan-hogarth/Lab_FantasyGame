package characters.players.fighters;

import weapons.IWeapon;

public class Knight extends Fighter {

    private IWeapon knightWeapon;

    public Knight(String name, int health, IWeapon knightWeapon){
        super(name, health);
        this.knightWeapon = knightWeapon;
    }

    public void setWeapon(IWeapon weapon){
        this.knightWeapon = weapon;
    }

    public IWeapon getWeapon() {
        return this.knightWeapon;
    }

}
