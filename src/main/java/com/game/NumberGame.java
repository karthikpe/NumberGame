package com.game;

import com.game.number.function.BaseNumber;
import com.game.number.impl.MagicNumber3;
import com.game.number.impl.MagicNumber5;
import com.game.number.processor.NumberProcessor;
import com.game.number.processor.NumberProcessorFactory;
import com.game.number.processor.ProcessorTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class NumberGame {

    public void stage1() {

        List<BaseNumber> numbers = new ArrayList<>();
        numbers.add(new MagicNumber3());
        numbers.add(new MagicNumber5());

        NumberProcessorFactory factory = new NumberProcessorFactory();
        NumberProcessor numberProcessor = factory.getProcessor(ProcessorTypeEnum.DIVISIBLE_PROCESSOR);
        System.out.println("Stage 1:");
        for(int i=1; i<=100; i++) {
            System.out.println(numberProcessor.processNumber(i, numbers));
        }

        System.out.println("----------------------------------------------");
    }

    public void stage2() {

        List<BaseNumber> numbers = new ArrayList<>();
        numbers.add(new MagicNumber3());
        numbers.add(new MagicNumber5());

        NumberProcessorFactory factory = new NumberProcessorFactory();

        System.out.println("Stage 2:");
        NumberProcessor numberProcessor = factory.getProcessor(ProcessorTypeEnum.DIVISIBLE_OR_DIGIT_PRESENT_PROCESSOR);
        for(int i=1; i<=100; i++) {
            System.out.println(numberProcessor.processNumber(i, numbers));
        }
    }

}
