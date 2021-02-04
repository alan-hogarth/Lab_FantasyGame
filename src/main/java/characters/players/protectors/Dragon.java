package characters.players.protectors;

public class Dragon implements IDefend {

        private int defendValue;

    public Dragon() {
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
