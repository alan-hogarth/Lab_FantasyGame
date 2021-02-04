package characters.players.mages;

import spells.ISpell;

public class Wizard extends Mage{

    private ISpell spell;

    public Wizard(String name, int health, ISpell spell){
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
