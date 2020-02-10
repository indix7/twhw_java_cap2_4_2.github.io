package com;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        selectTransportation();
    }
    public static void selectTransportation() {
        ArrayList<Transportation> transportationList = new ArrayList<>();
        transportationList.add(new Self());
        transportationList.add(new Bus());
        transportationList.add(new Train());
        transportationList.add(new Plane());
        int money = 300;
        showSelectableTransportation(transportationList, money);
    }
    public static void showSelectableTransportation(ArrayList<Transportation> transportationList, int money){
        ArrayList<String> selectableTransportationNames = new ArrayList<>();
        for (Transportation transportation: transportationList) {
            if (money >= transportation.getCost()) {
                selectableTransportationNames.add(transportation.getName());
            }
        }
        System.out.println("可供选择的交通方式有 ： "+selectableTransportationNames);
    }
}
