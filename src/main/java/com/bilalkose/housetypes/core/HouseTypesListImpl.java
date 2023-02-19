package main.java.com.bilalkose.housetypes.core;

import main.java.com.bilalkose.housetypes.model.House;
import main.java.com.bilalkose.housetypes.model.SummerHouse;
import main.java.com.bilalkose.housetypes.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HouseTypesListImpl implements HouseTypesList {

    @Override
    public List<House> getHouseList() {
        House house1 = new House(BigDecimal.valueOf(100),3,1, 120);
        House house2 = new House(BigDecimal.valueOf(500),4,2,190);
        House house3 = new House(BigDecimal.valueOf(950),5,3,250);
        List<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        return houseList;
    }

    @Override
    public List<Villa> getVillaList() {
        Villa villa1 = new Villa(BigDecimal.valueOf(500),5,1, 200);
        Villa villa2 = new Villa(BigDecimal.valueOf(1100),6,2,300);
        Villa villa3 = new Villa(BigDecimal.valueOf(2500),7,3,550);
        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);
        return villaList;
    }

    @Override
    public List<SummerHouse> getSummerHouseList() {
        SummerHouse summerHouse1 = new SummerHouse(BigDecimal.valueOf(750),2,1, 95);
        SummerHouse summerHouse2 = new SummerHouse(BigDecimal.valueOf(1850),5,2,220);
        SummerHouse summerHouse3 = new SummerHouse(BigDecimal.valueOf(4250),8,3,650);
        SummerHouse summerHouse4 = new SummerHouse(BigDecimal.valueOf(4250),3,1,120);
        List<SummerHouse> summerHouseList = new ArrayList<>();
        summerHouseList.add(summerHouse1);
        summerHouseList.add(summerHouse2);
        summerHouseList.add(summerHouse3);
        summerHouseList.add(summerHouse4);
        return summerHouseList;
    }
}
