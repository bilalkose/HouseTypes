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
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class HouseTypeServiceImpl implements HouseTypeService {
    private HouseTypesList houseTypesList;
    private static BigDecimal allTypeHousesPriceCount = BigDecimal.valueOf(0);
    private static DoubleStream.Builder allTypeHousesSquareMeters = DoubleStream.builder();
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public HouseTypeServiceImpl() {
        this.houseTypesList = new HouseTypesListImpl();
        this.houseList = this.houseTypesList.getHouseList();
        this.villaList = this.houseTypesList.getVillaList();
        this.summerHouseList = this.houseTypesList.getSummerHouseList();
    }

    @Override
    public BigDecimal getTotalPriceOfHouses() {
        BigDecimal totalPriceOfHouse = houseList.stream().map(v->v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount.add(totalPriceOfHouse);
        return totalPriceOfHouse;
    }

    @Override
    public BigDecimal getTotalPriceOfVillas() {
        BigDecimal totalPriceOfVillas = villaList.stream().map(v->v.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
        allTypeHousesPriceCount.add(totalPriceOfVillas);
        return totalPriceOfVillas;
    }

    @Override
    public BigDecimal getTotalPriceOfSummerHouses() {
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
    public List<Object> getAllTypeHousesFilterForNumberOfRoomsAndHalls(int numberOfRooms, int numberOfHalls) {
        List<Object> allTypeHousesFilterList = new ArrayList<>();
        allTypeHousesFilterList.add(houseList.stream().filter(h->h.getNumberOfRooms() == numberOfRooms && h.getNumberOfHalls() == numberOfHalls).collect(Collectors.toList()));
        allTypeHousesFilterList.add(villaList.stream().filter(h->h.getNumberOfRooms() == numberOfRooms && h.getNumberOfHalls() == numberOfHalls).collect(Collectors.toList()));
        allTypeHousesFilterList.add(summerHouseList.stream().filter(h->h.getNumberOfRooms() == numberOfRooms && h.getNumberOfHalls() == numberOfHalls).collect(Collectors.toList()));

        for(Object filter: allTypeHousesFilterList){
            System.out.println(filter);
        }

        return allTypeHousesFilterList;


    }


}
