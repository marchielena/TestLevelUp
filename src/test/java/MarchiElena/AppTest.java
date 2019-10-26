package MarchiElena;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest {

    @Test
    public void Test1() {
        assertEquals("1808", App.xp_to_target_lvl(0, 5));
    }

    @Test
    public void Test2() {
        assertEquals("29535", App.xp_to_target_lvl(12345, 17)); // = 41880
    }

    @Test
    public void Test3() {
        assertEquals("1", App.xp_to_target_lvl(313, 1)); // = You have already reached level 1.
    }

    @Test
    public void Test4() {
        //assertEquals("Input is invalid","769000000000000", App.xp_to_target_lvl(832696988485, 170));
    }

    //@Test
    public void Test5() {
       //assertEquals("Input is invalid", App.xp_to_target_lvl());
    }

    @Test
    public void Test6() {
        assertEquals("Input is invalid", App.xp_to_target_lvl(31428, 47)); // = 20066823
    }

    @Test
    public void Test7() {
       //assertEquals("Input is invalid", App.xp_to_target_lvl(7392984749, 900));
    }

    @Test
    public void Test8() {
        assertEquals("Input is invalid", App.xp_to_target_lvl(123, 0)); // = You have already reached level 0.
    }

    @Test
    public void Test9() {
        assertEquals("Input is invalid", App.xp_to_target_lvl(-987654321, 99));
    }

    @Test
    public void Test10() {
        assertEquals("Input is invalid", App.xp_to_target_lvl(999999,101)); // = 834351213
    }

    @Test
    public void Test11() {
        assertEquals("You have already reached level 1.",App.xp_to_target_lvl(0, 1));
    }

    @Test
    public void Test12() {
        assertEquals("You have already reached level 4.",App.xp_to_target_lvl(2017, 4)); // = 1196
    }

    @Test
    public void Test13() {
        //assertEquals("You have already reached level 170.",App.xp_to_target_lvl(769832696988485, 170));
    }
}
