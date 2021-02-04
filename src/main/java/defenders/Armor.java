package defenders;

import characters.players.protectors.IDefend;

public class Armor implements IDefend {
    private int defendValue;

    public Armor() {
        this.defendValue = 50;
    }

    public int defend() {
        return this.defendValue;
    }

    public int getDefendValue() {
        return this.defendValue;
    }

    public void setDefendValue(){
        this.defendValue = defendValue;

    }
}
