package com.nikhil.spring.basics.springpractice1.basic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Default is Singleton
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
//  If No setter or constructor  the autowiring is done by type

    // The name is can be used to resolve the conflict if no @Primary but @Primary has higher priority if both are used
    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;
    private Logger logger= LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
//        super();
//        this.sortAlgorithm=sortAlZagorithm;
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
    // Runs after all the beans are created
    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }
    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy");
    }
}
