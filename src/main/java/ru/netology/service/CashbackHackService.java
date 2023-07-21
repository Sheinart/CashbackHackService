package ru.netology.service;

public class CashbackHackService {
    private final int boundery = 1000;

    public int remain(int amount) {
        return boundery - amount % boundery;
    }


}
