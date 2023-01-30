package main.java.com.bilalkose.housetypes.service;

import java.math.BigDecimal;
import java.util.OptionalDouble;

public interface HouseTypeService {
    BigDecimal getTotalPriceOfHouses();

    BigDecimal getTotalPriceOfVillas();

    BigDecimal getTotalPriceOfSummerHouses();

    BigDecimal getTotalPriceOfAllTypeHouses();

    OptionalDouble  getAverageSquareMetersOfHouses(); //Evlerin ortalama metrekaresini dönen bir metot

    OptionalDouble  getAverageSquareMetersOfVillas(); //Villaların ortalama metrekaresini dönen bir metot

    OptionalDouble  getAverageSquareMetersOfSummerHouses(); //Yazlıkların ortalama metrekaresini dönen metot

    OptionalDouble  getAverageSquareMetersOfAllTypeHouses(); //Tüm tipteki evlerin ortalama metrekaresini dönen metot

    //Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot
}
