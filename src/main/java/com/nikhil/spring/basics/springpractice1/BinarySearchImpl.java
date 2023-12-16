package com.nikhil.spring.basics.springpractice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
//  If No setter or constructor  the autowiring is done by type

    // The name is can be used to resolve the conflict if no @Primary but @Primary has higher priority if both are used
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;
//    @Autowired
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
//        super();
//        this.sortAlgorithm=sortAlgorithm;
//    }


//    @Autowired
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[]numbers, int numberToSearch){

        int[] sortedNumbers= sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
