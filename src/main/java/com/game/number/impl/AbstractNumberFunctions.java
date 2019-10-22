package com.game.number.impl;

public abstract class AbstractNumberFunctions {

    public boolean isDivisible(int num, int div) {
        if(num % div == 0) {
            return true;
        }
        return false;
    }

    public boolean isDigitPresent(int num, int digit)
    {
        while (num > 0)
        {
            if (num % 10 == digit)
                return true;
            num = num / 10;
        }
        return false;
    }
}
