package characters.players;

import characters.players.fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.IWeapon;
import weapons.Sword;

import static org.junit.Assert.*;

public class PlayerTest {

    private Dwarf dwarf;
    private IWeapon club;

    @Before
    public void setUp() throws Exception {
        club = new Club();
        dwarf = new Dwarf("LongeBottom", 10, club);
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
}