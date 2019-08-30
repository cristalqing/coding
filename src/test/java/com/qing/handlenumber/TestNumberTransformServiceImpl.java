package com.qing.handlenumber;

import com.qing.handlenumber.service.NumberTransformService;
import com.qing.handlenumber.service.impl.DefaultNumberTransformServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * for test
 *
 * @author zhangqing
 * @version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestNumberTransformServiceImpl {
    @Autowired
    private NumberTransformService defaultNumberTransformService;

    @Autowired
    private NumberTransformService newNumberTransformService;

    @Test
    public void testDefaultTransformNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 15, 20, 21, 23, 45);
        List<String> required = Arrays.asList("1", "2", "Fizz", "4", "Buzz",
                "FizzBuzz", "Buzz", "Fizz", "23", "FizzBuzz");
        List<String> result = new ArrayList();
        numbers.stream().forEach(number -> result.add(defaultNumberTransformService.transformNumber(number)));
        Assert.assertArrayEquals(required.toArray(), result.toArray());
    }

    @Test
    public void testNewTransformNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 13, 15, 20, 21, 23, 45, 53);
        List required = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "FizzBuzz",
                "Buzz", "Fizz", "Fizz", "FizzBuzz", "FizzBuzz");
        List<String> result = new ArrayList();
        numbers.stream().forEach(number -> result.add(newNumberTransformService.transformNumber(number)));
        Assert.assertArrayEquals(required.toArray(), result.toArray());
    }
}
