package com.nikhil.spring.basics.springpractice1.basic;

import com.nikhil.spring.basics.springpractice1.basic.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public  int[] sort(int[] numbers){
        return numbers;
    }
}
