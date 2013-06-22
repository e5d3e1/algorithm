package org.algoritm.main;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/3/13
 * Time: 11:19 AM
 */
public class MainTest {

    @Test
    public void testMain() {
        Main.main(new String[]{});
    }

    @Test
    public void testNewMain() {
        Main main = new Main();
        main.toString();
        Main.main(new String[]{});
    }
}
