package org.monkey.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.monkey.CalculatorTest;
import org.monkey.SquareTest;

/**
 * 将所有的unit test整合到一个类运行
 * Created by monkey on 2017/3/23.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, SquareTest.class})
public class AllCalculatorTests{}


