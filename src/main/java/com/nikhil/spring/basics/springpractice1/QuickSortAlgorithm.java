package com.nikhil.spring.basics.springpractice1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements  SortAlgorithm {
    public  int[] sort(int[] numbers){
        return numbers;
    }
}
