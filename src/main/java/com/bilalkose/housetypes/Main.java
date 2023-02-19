package main.java.com.bilalkose.housetypes;
import main.java.com.bilalkose.housetypes.service.impl.HouseTypeServiceImpl;

public class Main {

    public static void main(String[] args) {
        HouseTypeServiceImpl houseTypeServiceImpl = new HouseTypeServiceImpl();
        System.out.println("***** Total Price Of Houses");
        System.out.println(houseTypeServiceImpl.getTotalPriceOfHouses());
        System.out.println("****************************************");

        System.out.println("***** Total Price Of Villas");
        System.out.println(houseTypeServiceImpl.getTotalPriceOfVillas());
        System.out.println("****************************************");

        System.out.println("***** Total Price Of Summer Houses");
        System.out.println(houseTypeServiceImpl.getTotalPriceOfSummerHouses());
        System.out.println("****************************************");

        System.out.println("***** Total Price Of All Type Houses");
        System.out.println(houseTypeServiceImpl.getTotalPriceOfAllTypeHouses());
        System.out.println("****************************************");

        System.out.println("***** Average Square Of Houses");
        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfHouses().getAsDouble());
        System.out.println("****************************************");

        System.out.println("***** Average Square Of Villas");
        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfVillas().getAsDouble());
        System.out.println("****************************************");

        System.out.println("***** Average Square Of Summer Houses");
        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfSummerHouses().getAsDouble());
        System.out.println("****************************************");

        System.out.println("***** Average Square Of All Type Houses");
        System.out.println(houseTypeServiceImpl.getAverageSquareMetersOfAllTypeHouses().getAsDouble());
        System.out.println("****************************************");

        System.out.println("***** All Type Houses of 'Number Of Rooms' and 'Number Of Halls'");
        houseTypeServiceImpl.getAllTypeHousesFilterForNumberOfRoomsAndHalls(3,1);
    }
}
