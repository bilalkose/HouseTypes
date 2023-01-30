package main.java.com.bilalkose.housetypes.service.impl;

import main.java.com.bilalkose.housetypes.core.HouseTypesList;
import main.java.com.bilalkose.housetypes.core.HouseTypesListImpl;
import main.java.com.bilalkose.housetypes.model.House;
import main.java.com.bilalkose.housetypes.model.SummerHouse;
import main.java.com.bilalkose.housetypes.model.Villa;
import main.java.com.bilalkose.housetypes.service.HouseTypeService;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class HouseTypeServiceImpl implements HouseTypeService {
    private HouseTypesList houseTypesList;
    private static BigDecimal allTypeHousesPriceCount = BigDecimal.valueOf(0);
    private static DoubleStream.Builder allTypeHousesSquareMeters = DoubleStream.builder();

    public HouseTypeServiceImpl() {
        this.houseTypesList = new HouseTypesListImpl();
    }

    @Override
    public BigDecimal getTotalPriceOfHouses() {
        List<House> houseList = this.houseTypesList.getHouseList();
        BigDecimal totalPriceOfHouse = houseList.stream().map(v->v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount.add(totalPriceOfHouse);
        return totalPriceOfHouse;
    }

    @Override
    public BigDecimal getTotalPriceOfVillas() {
        List<Villa> villaList = this.houseTypesList.getVillaList();
        BigDecimal totalPriceOfVillas = villaList.stream().map(v->v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount.add(totalPriceOfVillas);
        return totalPriceOfVillas;
    }

    @Override
    public BigDecimal getTotalPriceOfSummerHouses() {
        List<SummerHouse> summerHouseList = this.houseTypesList.getSummerHouseList();
        BigDecimal totalPriceOfSummerHouses = summerHouseList.stream().map(v->v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount.add(totalPriceOfSummerHouses);
        return totalPriceOfSummerHouses;
    }

    @Override
    public BigDecimal getTotalPriceOfAllTypeHouses() {
        return allTypeHousesPriceCount;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfHouses() {
        List<House> houseList = this.houseTypesList.getHouseList();
        OptionalDouble averageSquareMetersOfHouses = OptionalDouble.of(houseList.stream().filter(o -> o.getSquareMeters() > 0)
                .mapToDouble(o -> o.getSquareMeters()).average().orElse(0));
        allTypeHousesSquareMeters.add(averageSquareMetersOfHouses.getAsDouble());

        return averageSquareMetersOfHouses;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfVillas() {
        List<Villa> villaList = this.houseTypesList.getVillaList();
        OptionalDouble averageSquareMetersOfVillas = OptionalDouble.of(villaList.stream().filter(o -> o.getSquareMeters() > 0)
                .mapToDouble(o -> o.getSquareMeters()).average().orElse(0));
        allTypeHousesSquareMeters.add(averageSquareMetersOfVillas.getAsDouble());
        return averageSquareMetersOfVillas;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfSummerHouses() {
        List<SummerHouse> summerHouseList = this.houseTypesList.getSummerHouseList();
        OptionalDouble averageSquareMetersOfHouses = OptionalDouble.of(summerHouseList.stream().filter(o -> o.getSquareMeters() > 0)
                .mapToDouble(o -> o.getSquareMeters()).average().orElse(0));
        allTypeHousesSquareMeters.add(averageSquareMetersOfHouses.getAsDouble());
        return averageSquareMetersOfHouses;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfAllTypeHouses() {
        return allTypeHousesSquareMeters.build().average();
    }
}
