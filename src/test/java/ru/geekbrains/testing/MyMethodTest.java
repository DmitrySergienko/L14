package ru.geekbrains.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ru.geekbrains.MyMethod;

public class MyMethodTest {

    private MyMethod myMethod;

    @BeforeEach
    public void init(){
        myMethod = new MyMethod();
    }
//Test 1
    @Test
    public void test1(){
        int[] referArr = new int[] {1,7};
        int[] checkArr = new int[] {1,2,4,4,2,3,4,1,7};
        int[] result = MyMethod.updArr(checkArr);
    Assertions.assertArrayEquals(referArr,result);
    }
//Test 2
    @Test
    public void test2(){
        int[] referArr = new int[] {3,1,7};
        int[] checkArr = new int[] {1,2,4,4,2,4,3,1,7};
        int[] result = MyMethod.updArr(checkArr);
        Assertions.assertArrayEquals(referArr,result);
    }
//Test 3
    @Test
    public void test3(){
        int[] referArr = new int[] {1,3,1,7};
        int[] checkArr = new int[] {1,2,4,4,4,1,3,1,7};
        int[] result = MyMethod.updArr(checkArr);
        Assertions.assertArrayEquals(referArr,result);
    }
}
