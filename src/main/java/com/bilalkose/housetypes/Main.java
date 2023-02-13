package main.java.com.bilalkose.housetypes;
import main.java.com.bilalkose.housetypes.service.impl.HouseTypeServiceImpl;

public class Main {

    public static void main(String[] args) {
        HouseTypeServiceImpl houseTypeServiceImpl = new HouseTypeServiceImpl();
        // System.out.println(houseTypeServiceImpl.getTotalPriceOfVillas()); // test

//        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfHouses()); // 235
//        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfVillas()); // 116.6
//        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfSummerHouses()); // 200
//
//        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfAllTypeHouses()); // 183,8

        houseTypeServiceImpl.getAllTypeHousesFilterForNumberOfRoomsAndHalls(3,1);
    }
}
