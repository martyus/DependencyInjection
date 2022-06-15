package com.version1;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Engine {
    private int revs;

    public void setRevs(int revs) {
        this.revs = revs;
    }

    public int getRevs(){
       return this.revs;
    }

    @PostConstruct
    public void init(){
        System.out.println("Im created!!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bye bye!");
    }
}
