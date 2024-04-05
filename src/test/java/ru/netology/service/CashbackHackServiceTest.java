package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testBoundaryExceeds1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testBoundaryBelow1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testBoundary1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }
}