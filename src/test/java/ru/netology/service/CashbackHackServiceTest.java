package ru.netology.service;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testAddMoney() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 630;

        int actual = cashbackHackService.remain(amount);
        int expected = 370;

        assertEquals(actual, expected);
    }
}


