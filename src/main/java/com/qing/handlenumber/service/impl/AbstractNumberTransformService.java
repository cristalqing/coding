package com.qing.handlenumber.service.impl;

import com.qing.handlenumber.service.NumberTransformService;
import com.qing.handlenumber.transform.NumberTransformer;

import java.util.List;
/**
 * number transform
 *
 * @author zhangqing
 * @version 1.0.0
 */
public abstract class AbstractNumberTransformService implements NumberTransformService {
    protected String doTransform(List<NumberTransformer> transformers, int number) {
        boolean transformed = false;
        String transformedResult = "";
        for (NumberTransformer transformer: transformers) {
            if (transformer.support(number)) {
                transformedResult += transformer.transform();
                transformed = true;
            }
        }
        return transformed? transformedResult: String.valueOf(number);

    }
}
