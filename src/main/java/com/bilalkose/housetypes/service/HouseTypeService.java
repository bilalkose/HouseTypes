package main.java.com.bilalkose.housetypes.service;

import java.math.BigDecimal;
import java.util.OptionalDouble;

public interface HouseTypeService {
    // This method returns the total prices of the Houses
    BigDecimal getTotalPriceOfHouses();

    // This method returns the total prices of the Villas
    BigDecimal getTotalPriceOfVillas();

    // This method returns the total prices of the Summer Houses
    BigDecimal getTotalPriceOfSummerHouses();

    // This method returns the total prices of All Type Houses
    Integer getTotalPriceOfAllTypeHouses();

    // This method returns the average square meters of the Houses
    OptionalDouble  getAverageSquareMetersOfHouses();

    // This method returns the average square meters of the Villas
    OptionalDouble  getAverageSquareMetersOfVillas();

    // This method returns the average square meters of the Summer Houses
    OptionalDouble  getAverageSquareMetersOfSummerHouses();

    // This method returns the average square meters of All Type Houses
    OptionalDouble  getAverageSquareMetersOfAllTypeHouses();

    // This method returns the filter for number of rooms and halls
    void getAllTypeHousesFilterForNumberOfRoomsAndHalls(int numberOfRooms, int numberOfHalls);
}
