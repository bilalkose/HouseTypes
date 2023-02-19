package main.java.com.bilalkose.housetypes.service.impl;

import main.java.com.bilalkose.housetypes.core.HouseTypesList;
import main.java.com.bilalkose.housetypes.core.HouseTypesListImpl;
import main.java.com.bilalkose.housetypes.model.House;
import main.java.com.bilalkose.housetypes.model.SummerHouse;
import main.java.com.bilalkose.housetypes.model.Villa;
import main.java.com.bilalkose.housetypes.service.HouseTypeService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class HouseTypeServiceImpl implements HouseTypeService {
    private HouseTypesList houseTypesList;
    private static Integer allTypeHousesPriceCount = 0;
    private static DoubleStream.Builder allTypeHousesSquareMeters = DoubleStream.builder();
    private final List<House> houseList;
    private final List<Villa> villaList;
    private final List<SummerHouse> summerHouseList;

    public HouseTypeServiceImpl() {
        this.houseTypesList = new HouseTypesListImpl();
        this.houseList = this.houseTypesList.getHouseList();
        this.villaList = this.houseTypesList.getVillaList();
        this.summerHouseList = this.houseTypesList.getSummerHouseList();
    }

    @Override
    public BigDecimal getTotalPriceOfHouses() {
        BigDecimal totalPriceOfHouse = houseList.stream().map(v -> v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount += totalPriceOfHouse.intValue();
        return totalPriceOfHouse;
    }

    @Override
    public BigDecimal getTotalPriceOfVillas() {
        BigDecimal totalPriceOfVillas = villaList.stream().map(v -> v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount += totalPriceOfVillas.intValue();
        return totalPriceOfVillas;
    }

    @Override
    public BigDecimal getTotalPriceOfSummerHouses() {
        BigDecimal totalPriceOfSummerHouses = summerHouseList.stream().map(v -> v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount += totalPriceOfSummerHouses.intValue();
        return totalPriceOfSummerHouses;
    }

    @Override
    public Integer getTotalPriceOfAllTypeHouses() {
        return allTypeHousesPriceCount;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfHouses() {
        OptionalDouble averageSquareMetersOfHouses = OptionalDouble.of(houseList.stream().filter(h -> h.getSquareMeters() > 0)
                .mapToDouble(h -> h.getSquareMeters()).average().orElse(0));
        allTypeHousesSquareMeters.add(averageSquareMetersOfHouses.getAsDouble());
        return averageSquareMetersOfHouses;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfVillas() {
        OptionalDouble averageSquareMetersOfVillas = OptionalDouble.of(villaList.stream().filter(v -> v.getSquareMeters() > 0)
                .mapToDouble(v -> v.getSquareMeters()).average().orElse(0));
        allTypeHousesSquareMeters.add(averageSquareMetersOfVillas.getAsDouble());
        return averageSquareMetersOfVillas;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfSummerHouses() {
        OptionalDouble averageSquareMetersOfHouses = OptionalDouble.of(summerHouseList.stream().filter(s -> s.getSquareMeters() > 0)
                .mapToDouble(s -> s.getSquareMeters()).average().orElse(0));
        allTypeHousesSquareMeters.add(averageSquareMetersOfHouses.getAsDouble());
        return averageSquareMetersOfHouses;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfAllTypeHouses() {
        return allTypeHousesSquareMeters.build().average();
    }

    @Override
    public void getAllTypeHousesFilterForNumberOfRoomsAndHalls(int numberOfRooms, int numberOfHalls) {
        List<Object> allTypeHousesFilterList = new ArrayList<>();
        // ret unused, otherwise it doesn't compile
        boolean ret = allTypeHousesFilterList.addAll(houseList.stream().filter(h -> h.getNumberOfRooms() == numberOfRooms && h.getNumberOfHalls() == numberOfHalls).toList());
        ret = allTypeHousesFilterList.addAll(villaList.stream().filter(v -> v.getNumberOfRooms() == numberOfRooms && v.getNumberOfHalls() == numberOfHalls).toList());
        ret = allTypeHousesFilterList.addAll(summerHouseList.stream().filter(s -> s.getNumberOfRooms() == numberOfRooms && s.getNumberOfHalls() == numberOfHalls).toList());

        for (Object filter : allTypeHousesFilterList) {
            System.out.println(filter);
        }
    }
}
