package com.company;

public interface C18 extends A18,B18 {

    int AB = 1;
    // Attempt to reference field AB in a int.

    @Override
    default void a() {

    }

    @Override
    default void b() {
        A18.super.b();
    }

    public void c();
}
