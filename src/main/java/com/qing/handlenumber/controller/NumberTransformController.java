package com.qing.handlenumber.controller;

import com.qing.handlenumber.service.NumberTransformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/**
 * number transform for interface
 *
 * @author zhangqing
 * @version 1.0.0
 */
@RestController
public class NumberTransformController {
    @Autowired
    private NumberTransformService defaultNumberTransformService;

    @Autowired
    private NumberTransformService newNumberTransformService;

    /**
     * print number method 1
     */
    @RequestMapping ("/print/{start}/{end}")
    public ArrayList printNumber(@PathVariable int start, @PathVariable int end) {
        ArrayList<String> results = new ArrayList<>();
        for (int i = start; i <= end; i++ ) {
            results.add(defaultNumberTransformService.transformNumber(i));
        }
        return results;
    }

    /**
     * print number method 2
     */
    @RequestMapping ("/printByNewRule/{start}/{end}")
    public ArrayList printNumberByNewRule(@PathVariable int start, @PathVariable int end) {
        ArrayList<String> results = new ArrayList<>();
        for (int i = start; i <= end; i++ ) {
            results.add(newNumberTransformService.transformNumber(i));
        }
        return results;
    }

}
