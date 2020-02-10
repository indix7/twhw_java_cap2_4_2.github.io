package com;

public class Bus implements Transportation{
    @Override
    public String getName() {
        return "大巴车";
    }

    @Override
    public int getCost() {
        return BUS_COST;
    }
}
