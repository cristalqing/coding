package com.qing.handlenumber.transform.impl;

import com.qing.handlenumber.transform.NumberTransformer;

/**
 * divided exactly by 5
 *
 * @author zhangqing
 * @version 1.0.0
 */
public class BuzzTransformerImpl implements NumberTransformer {
    /**
     * see if it's divisible by 5
     */
    @Override
    public Boolean support(int number) {
        return number % 5 == 0;
    }

    /**
     * transform
     */
    @Override
    public String transform() {
        return  "Buzz";
    }
}
