package com.qing.handlenumber.transform;
/**
 * based interface
 *
 * @author zhangqing
 * @version 1.0.0
 */
public interface NumberTransformer {
    Boolean support (int number);
    String transform ();
}
