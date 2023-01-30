package main.java.com.bilalkose.housetypes.core;

import main.java.com.bilalkose.housetypes.model.House;
import main.java.com.bilalkose.housetypes.model.SummerHouse;
import main.java.com.bilalkose.housetypes.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HouseTypesListImpl implements HouseTypesList {

    // buraya tüm ev tiplerini getirecek bir metot yazılacak

    @Override
    public List<House> getHouseList() {
        House h1 = new House(BigDecimal.valueOf(100),3,1, 200);
        House h2 = new House(BigDecimal.valueOf(200),4,2,250);
        House h3 = new House(BigDecimal.valueOf(300),5,3,255);
        List<House> houseList = new ArrayList<>();
        houseList.add(h1); houseList.add(h2); houseList.add(h3);
        return houseList;
    }

    @Override
    public List<Villa> getVillaList() {
        Villa v1 = new Villa(BigDecimal.valueOf(100),3,1, 100);
        Villa v2 = new Villa(BigDecimal.valueOf(200),4,2,100);
        Villa v3 = new Villa(BigDecimal.valueOf(300),5,3,150);
        List<Villa> villaList = new ArrayList<>();
        villaList.add(v1); villaList.add(v2); villaList.add(v3);
        return villaList;
    }

    @Override
    public List<SummerHouse> getSummerHouseList() {
        SummerHouse sh1 = new SummerHouse(BigDecimal.valueOf(100),3,1, 100);
        SummerHouse sh2 = new SummerHouse(BigDecimal.valueOf(200),4,2,200);
        SummerHouse sh3 = new SummerHouse(BigDecimal.valueOf(300),5,3,300);
        List<SummerHouse> summerHouseList = new ArrayList<>();
        summerHouseList.add(sh1); summerHouseList.add(sh2); summerHouseList.add(sh3);
        return summerHouseList;
    }
}
