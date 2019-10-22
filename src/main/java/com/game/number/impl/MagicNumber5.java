package com.game.number.impl;

import com.game.number.function.Divisible;
import com.game.number.function.DivisibleOrDigitPresent;

public class MagicNumber5 extends AbstractNumberFunctions implements Divisible, DivisibleOrDigitPresent {
    @Override
    public String displayText() {
        return "Buzz";
    }

    @Override
    public boolean checkDivisible(int num) {
        if(isDivisible(num, 5))
            return true;
        return false;
    }

    @Override
    public boolean checkDivisibleOrDigitPresent(int num) {
        if(isDivisible(num, 5) || isDigitPresent(num, 5))
            return true;
        return false;
    }
}
