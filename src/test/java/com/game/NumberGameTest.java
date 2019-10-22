package com.game;

import org.junit.Test;

public class NumberGameTest {

    @Test
    public void printStage1() {
        NumberGame numberGame = new NumberGame();
        numberGame.stage1();
    }

    @Test
    public void printStage2() {
        NumberGame numberGame = new NumberGame();
        numberGame.stage2();
    }
}
