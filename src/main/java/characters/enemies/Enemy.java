package characters.enemies;

public abstract class Enemy {

    private int health;

    public Enemy(int health) {
            this.health = health;
    }

    public void decreaseHealth(int damage) {
        this.health -= damage;
    }
}
