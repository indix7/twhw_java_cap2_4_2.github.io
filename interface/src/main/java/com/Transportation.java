package com;

public interface Transportation {
    public static final int SELF_COST = 500;
    public static final int BUS_COST = 300;
    public static final int TRAIN_COST = 400;
    public static final int PLANE_COST = 1000;

    public abstract int getCost();
    public abstract String getName();
}
