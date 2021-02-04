package potions;

public class Herbs implements IHeal {

    private int boostHealth;

    public Herbs(){
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
