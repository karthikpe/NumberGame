package com.game.number.processor;

import com.game.number.processor.impl.DivisibleProcessor;
import org.junit.Assert;
import org.junit.Test;

public class NumberProcessorFactoryTest {

    @Test
    public void processorTest() {
        NumberProcessorFactory factory = new NumberProcessorFactory();
        NumberProcessor numberProcessor = factory.getProcessor(ProcessorTypeEnum.DIVISIBLE_PROCESSOR);
        Assert.assertNotNull(numberProcessor);
        Assert.assertTrue(numberProcessor instanceof DivisibleProcessor);
    }
}
