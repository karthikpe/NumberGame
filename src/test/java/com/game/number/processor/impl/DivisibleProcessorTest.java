package com.game.number.processor.impl;

import com.game.number.function.BaseNumber;
import com.game.number.impl.MagicNumber3;
import com.game.number.impl.MagicNumber5;
import com.game.number.processor.NumberProcessor;
import com.game.number.processor.NumberProcessorFactory;
import com.game.number.processor.ProcessorTypeEnum;
import com.game.number.processor.impl.DivisibleProcessor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DivisibleProcessorTest {

    NumberProcessor numberProcessor = null;

    @Before
    public void setup() {
        NumberProcessorFactory factory = new NumberProcessorFactory();
        numberProcessor = factory.getProcessor(ProcessorTypeEnum.DIVISIBLE_PROCESSOR);
    }

    @Test
    public void numberProcessorFactoryTest() {
        Assert.assertNotNull(numberProcessor);
        Assert.assertTrue(numberProcessor instanceof DivisibleProcessor);
    }


    @Test
    public void divisibleTestFor3() {
        List<BaseNumber> numbers = new ArrayList<>();
        numbers.add(new MagicNumber3());

        String text = numberProcessor.processNumber(3, numbers);
        Assert.assertEquals("Fizz", text);

        text = numberProcessor.processNumber(6, numbers);
        Assert.assertEquals("Fizz", text);
    }

    @Test
    public void divisibleTestFor5() {
        List<BaseNumber> numbers = new ArrayList<>();
        numbers.add(new MagicNumber5());

        String text = numberProcessor.processNumber(5, numbers);
        Assert.assertEquals("Buzz", text);

        text = numberProcessor.processNumber(10, numbers);
        Assert.assertEquals("Buzz", text);
    }

    @Test
    public void divisibleTestFor3And5() {
        List<BaseNumber> numbers = new ArrayList<>();
        numbers.add(new MagicNumber3());
        numbers.add(new MagicNumber5());

        String text = numberProcessor.processNumber(15, numbers);
        Assert.assertEquals("FizzBuzz", text);

        text = numberProcessor.processNumber(45, numbers);
        Assert.assertEquals("FizzBuzz", text);
    }


    @Test
    public void divisibleNumberProcessorTest_numberWithoutImpl() {
        NumberProcessorFactory factory = new NumberProcessorFactory();
        NumberProcessor numberProcessor = factory.getProcessor(ProcessorTypeEnum.DIVISIBLE_PROCESSOR);

        List<BaseNumber> numbers = new ArrayList<>();
        numbers.add(new MagicNumber3());

        String text = numberProcessor.processNumber(2, numbers);
        Assert.assertEquals("2", text);
    }

}
