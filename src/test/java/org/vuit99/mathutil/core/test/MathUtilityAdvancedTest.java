package org.vuit99.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.vuit99.mathutil.core.MathUtility;

public class MathUtilityAdvancedTest {
 
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1},
                               {1,1},
                               {2,2},
                               {4,24},
                               {5,120},
                               {6,720}};
        
        return testData;
    }
                                                        //cot 0   cot 1
     @ParameterizedTest
     @MethodSource(value = "initTestData")
  public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
      //assertEquals(68, 68);
      assertEquals(expected, MathUtility.getFactorial(n));
  }
  
}
