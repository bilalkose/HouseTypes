package main.java.com.bilalkose.housetypes.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;

public interface HouseTypeService {
    BigDecimal getTotalPriceOfHouses();

    BigDecimal getTotalPriceOfVillas();

    BigDecimal getTotalPriceOfSummerHouses();

    BigDecimal getTotalPriceOfAllTypeHouses();

    OptionalDouble  getAverageSquareMetersOfHouses();

    OptionalDouble  getAverageSquareMetersOfVillas();

    OptionalDouble  getAverageSquareMetersOfSummerHouses();

    OptionalDouble  getAverageSquareMetersOfAllTypeHouses();

    List<Object> getAllTypeHousesFilterForNumberOfRoomsAndHalls(int numberOfRooms, int numberOfHalls);
}
