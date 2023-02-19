package main.java.com.bilalkose.housetypes.core;

import main.java.com.bilalkose.housetypes.model.House;
import main.java.com.bilalkose.housetypes.model.SummerHouse;
import main.java.com.bilalkose.housetypes.model.Villa;

import java.util.List;

public interface HouseTypesList {
    List<House> getHouseList(); //House objects init method
    List<Villa> getVillaList(); //Villa objects init method
    List<SummerHouse> getSummerHouseList(); //Summer House objects init method

}
