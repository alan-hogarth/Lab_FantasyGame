package characters.players;

import characters.enemies.Troll;
import characters.players.fighters.Dwarf;
import characters.players.mages.Warlock;
import characters.players.protectors.Dragon;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.IWeapon;
import weapons.Sword;
import characters.enemies.Orc;

import static org.junit.Assert.*;

public class PlayerTest {

    private Dragon dragon;
    private Dwarf dwarf;
    private IWeapon club;
    private Warlock warlock;
    private Orc orc;
    private Troll troll;

    @Before
    public void setUp() throws Exception {
        club = new Club();
        dwarf = new Dwarf("LongeBottom", 10, club);
        orc = new Orc("Klaus", 40, )
    }

    @Test
    public void getName() {
        assertEquals("LongeBottom", dwarf.getName());
    }

    @Test
    public void setName() {
        dwarf.setName("Gary");
        assertEquals("Gary", dwarf.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(10, dwarf.getHealth());
    }

    @Test
    public void setHealth() {
        dwarf.setHealth(100);
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void getWeapon() {
        assertEquals(club, dwarf.getWeapon());
    }

    @Test void setWeapon() {
        IWeapon sword = new Sword();
        dwarf.setWeapon(sword);
        assertEquals(sword, dwarf.getWeapon());
    }

    @Test
    public void warlockFightsTroll(){
        

    }
}