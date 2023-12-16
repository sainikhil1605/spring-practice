package com.nikhil.spring.basics.springpractice1;

public class BinarySearchImpl {
    private SortAlgorithm sortAlgorithm;
    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm=sortAlgorithm;
    }
    public int binarySearch(int[]numbers,int numberToSearch){

        int[] sortedNumbers= sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
