package com;

public class Train implements Transportation {
    @Override
    public String getName() {
        return "火车";
    }

    @Override
    public int getCost() {
        return TRAIN_COST;
    }
}
