package characters.players.protectors;

public class Ogre implements IDefend {

    private int defendValue;

    public Ogre() {
        this.defendValue = 30;
    }

    public int defend() {
        return defendValue;
    }

    public int getDefendValue() {
        return this.defendValue;
    }

    public void setDefendValue(int defendValue) {
        this.defendValue = defendValue;
    }


}
