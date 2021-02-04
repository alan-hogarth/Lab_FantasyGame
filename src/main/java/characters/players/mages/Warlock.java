package characters.players.mages;
import spells.ISpell;
import weapons.IWeapon;

public class Warlock extends Mage {

    private ISpell spell;

    public Warlock(String name, int health, ISpell spell){
        super(name, health);
        this.spell = spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public ISpell getSpell() {
        return this.spell;
    }

}
