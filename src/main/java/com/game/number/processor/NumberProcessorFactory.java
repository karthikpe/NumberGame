package com.game.number.processor;

import com.game.number.processor.impl.DivisibleOrDigitPresentProcessor;
import com.game.number.processor.impl.DivisibleProcessor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NumberProcessorFactory {

    final static Map<ProcessorTypeEnum, Supplier<NumberProcessor>> map = new HashMap<>();
    static {
        map.put(ProcessorTypeEnum.DIVISIBLE_PROCESSOR, DivisibleProcessor::new);
        map.put(ProcessorTypeEnum.DIVISIBLE_OR_DIGIT_PRESENT_PROCESSOR, DivisibleOrDigitPresentProcessor::new);
    }

    public NumberProcessor getProcessor(ProcessorTypeEnum type) {
        Supplier<NumberProcessor> processor = map.get(type);
        return processor.get();
    }
}
