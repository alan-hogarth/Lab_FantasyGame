package characters.players;

import characters.enemies.Troll;
import characters.players.fighters.Dwarf;
import characters.players.mages.Warlock;
import characters.players.mages.Wizard;
import characters.players.protectors.Dragon;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.IWeapon;
import weapons.Sword;
import characters.enemies.Orc;
import spells.AvadaKedavra;
import spells.ISpell;

import static org.junit.Assert.*;

public class PlayerTest {

    private Dragon dragon;
    private Dwarf dwarf;
    private IWeapon club;
    private Warlock warlock;
    private Orc orc;
    private Troll troll;
    private Sword sword;
    private Wizard wizard;
    private ISpell avadaKedavra;

    @Before
    public void setUp() throws Exception {
        club = new Club();
        sword = new Sword();
        dwarf = new Dwarf("LongeBottom", 30, club);
        orc = new Orc(50, sword);
        avadaKedavra = new AvadaKedavra();
        wizard = new Wizard("Albus", 100, avadaKedavra);
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
        assertEquals(30, dwarf.getHealth());
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
    public void wizardFightsTroll(){
        wizard = new Wizard("Saruman", 100, avadaKedavra);
        int damage = wizard.getSpell().cast();
        orc.decreaseHealth(damage);
        assertEquals(10, orc.);



    }
}