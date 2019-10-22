package com.game.number.impl;

import com.game.number.function.Divisible;
import com.game.number.function.DivisibleOrDigitPresent;

public class MagicNumber3 extends AbstractNumberFunctions implements Divisible, DivisibleOrDigitPresent {
    @Override
    public String displayText() {
        return "Fizz";
    }

    @Override
    public boolean checkDivisible(int num) {
        if(isDivisible(num, 3))
            return true;
        return false;
    }

    @Override
    public boolean checkDivisibleOrDigitPresent(int num) {
        if(isDivisible(num, 3) || isDigitPresent(num, 3))
            return true;
        return false;
    }
}
