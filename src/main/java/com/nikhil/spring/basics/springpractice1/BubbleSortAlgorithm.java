package com.nikhil.spring.basics.springpractice1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
// @Primary is used to resolve the conflicts for the bean
@Primary
public class BubbleSortAlgorithm  implements  SortAlgorithm{
    public  int[] sort(int[] numbers){
        return numbers;
    }
}
