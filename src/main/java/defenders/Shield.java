package defenders;

import characters.players.protectors.IDefend;

public class Shield implements IDefend {

    private int defendValue;

    public Shield(){
        this.defendValue = 10;
    }

    public int defend() {
        return defendValue;
    }
}
