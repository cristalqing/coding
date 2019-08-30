package com.qing.handlenumber.transform.impl;

import com.qing.handlenumber.transform.NumberTransformer;

/**
 * divided exactly by 3
 *
 * @author zhangqing
 * @version 1.0.0
 */
public class FizzTransformerImpl implements NumberTransformer {
    /**
     * see if it's divisible by 3
     */
    @Override
    public Boolean support(int number) {
        return number % 3 == 0;
    }

    /**
     * transform
     */
    @Override
    public String transform() {
        return  "Fizz";
    }
}
