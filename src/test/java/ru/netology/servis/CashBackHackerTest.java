package ru.netology.servis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashBackHackerTest {
    CashBackHacker service = new CashBackHacker();

    @Test
    public void shouldCountRemain() {


        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountRemainIfZero() {


        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountBorderIfLess() {
        int actual = service.remain(1999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCountBorderIfMore() {


        int actual = service.remain(2001);
        int expected = 999;

        assertEquals(actual, expected);
    }
}