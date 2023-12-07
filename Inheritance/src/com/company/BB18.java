package com.company;

public interface BB18 {

    public void a();

    default void b(){
        System.out.println("BB.b()");
    }
}
