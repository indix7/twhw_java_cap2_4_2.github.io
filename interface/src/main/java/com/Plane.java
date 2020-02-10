package com;

public class Plane implements Transportation {
    @Override
    public String getName() {
        return "飞机";
    }

    @Override
    public int getCost() {
        return PLANE_COST;
    }
}
