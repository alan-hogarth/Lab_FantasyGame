package potions;

public class Potion implements IHeal{

    private int boostHealth;

    public Potion(){
        this.boostHealth = 40;
    }

    public int getHealth(){
        return boostHealth;
    }


    public void setBoostHealth(int heal){
        this.boostHealth = heal;
    }

    public int improveHealth(){
        return boostHealth;
    }

}
