package com.game.number.processor.impl;

import com.game.number.function.BaseNumber;
import com.game.number.function.Divisible;
import com.game.number.function.DivisibleOrDigitPresent;
import com.game.number.processor.NumberProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleOrDigitPresentProcessor implements NumberProcessor {
    @Override
    public String processNumber(int num, List<BaseNumber> numbers) {
        String result = String.valueOf(num);

        List<BaseNumber> filteredList = new ArrayList<>();
        for(BaseNumber number: numbers) {
            if(number instanceof DivisibleOrDigitPresent
                    && ((DivisibleOrDigitPresent)number).checkDivisibleOrDigitPresent(num)) {
                filteredList.add(number);
            }
        }
        if(filteredList.size() > 0) {
            result = filteredList.stream().map(BaseNumber::displayText).collect(Collectors.joining());
        }
        return result;
    }
}
