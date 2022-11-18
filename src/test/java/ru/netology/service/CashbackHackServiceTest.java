package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void RemainPurchaseAmountToReceiveBonuses() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void RemainPurchaseAmountToReceiveBonusesMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1350;
        int expected = 650;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}