package org.monkey;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * 通过@RunWith将unit test改为Parameterized.class
 * 可将多种测试情况 通过 参数数组 进行测试
 * Created by monkey on 2017/3/23.
 */


@RunWith(Parameterized.class)
public class SquareTest {
    private static Calculator calculator = new Calculator();

    private int param;
    private int result;

    public SquareTest(int param, int result) {
        this.param = param;
        this.result = result;
    }

    @Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{2, 4}, {0, 0}, {-3, 9}});
    }

    @Test
    public void square() {
        calculator.square(param);
        assertEquals(result, calculator.getResult());
    }

}
