package com;

public class Self implements Transportation{
    @Override
    public String getName() {
        return "自驾";
    }

    @Override
    public int getCost() {
        return SELF_COST;
    }
}
