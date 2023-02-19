package main.java.com.bilalkose.housetypes.service;

import java.math.BigDecimal;
import java.util.OptionalDouble;

public interface HouseTypeService {
    // Evlerin toplam fiyatlarını dönen bir metot
    BigDecimal getTotalPriceOfHouses();

    // Villaların toplam fiyatlarını dönen bir metot
    BigDecimal getTotalPriceOfVillas();

    // Yazlıkların toplam fiyatlarını dönen metot
    BigDecimal getTotalPriceOfSummerHouses();

    // Tüm tipteki evlerin toplam fiyatını dönen metot
    Integer getTotalPriceOfAllTypeHouses();

    // Evlerin ortalama metrekaresini dönen bir metot
    OptionalDouble  getAverageSquareMetersOfHouses();

    // Villaların ortalama metrekaresini dönen bir metot
    OptionalDouble  getAverageSquareMetersOfVillas();

    // Yazlıkların ortalama metrekaresini dönen metot
    OptionalDouble  getAverageSquareMetersOfSummerHouses();

    // Tüm tipteki evlerin ortalama metrekaresini dönen metot
    OptionalDouble  getAverageSquareMetersOfAllTypeHouses();

    void getAllTypeHousesFilterForNumberOfRoomsAndHalls(int numberOfRooms, int numberOfHalls);
}
