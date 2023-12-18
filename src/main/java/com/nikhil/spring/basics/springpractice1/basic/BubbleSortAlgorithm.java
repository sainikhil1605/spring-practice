package com.nikhil.spring.basics.springpractice1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
// @Primary is used to resolve the conflicts for the bean
@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm  implements SortAlgorithm {
    public  int[] sort(int[] numbers){
        return numbers;
    }
}
