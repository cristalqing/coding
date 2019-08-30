package com.qing.handlenumber.service.impl;

import com.qing.handlenumber.transform.NumberTransformer;
import com.qing.handlenumber.transform.impl.BuzzTransformerImpl;
import com.qing.handlenumber.transform.impl.FizzTransformerImpl;
import com.qing.handlenumber.transform.impl.NewBuzzTransformerImpl;
import com.qing.handlenumber.transform.impl.NewFizzTransformerImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * number transform for new
 *
 * @author zhangqing
 * @version 1.0.0
 */
@Service ("newNumberTransformService")
public class NewNumberTransformServiceImpl extends AbstractNumberTransformService {
    @Override
    public String transformNumber(int number) {
        List<NumberTransformer> transformers = new ArrayList<>();
        transformers.add(new NewFizzTransformerImpl());
        transformers.add(new NewBuzzTransformerImpl());
        return doTransform(transformers, number);
    }
}
