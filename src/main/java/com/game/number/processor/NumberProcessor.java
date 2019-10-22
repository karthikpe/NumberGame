package com.game.number.processor;

import com.game.number.function.BaseNumber;

import java.util.List;

public interface NumberProcessor {
    String processNumber(int i, List<BaseNumber> numbers);
}
