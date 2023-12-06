package com.company;

abstract class Area extends Object {

    String type;

    public String getType()	{
        return type;
    }

    public abstract int area();
    public abstract int perimeter();
}
