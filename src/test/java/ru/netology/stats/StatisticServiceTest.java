package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
 //   @CsvSource(
  //          value ={"'test sums',[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]"}
  //  )

    void shouldSumSales() {

        //переменные
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        //тест
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSales() {
        //переменные
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.averageSales(sales);
        //тест
        assertEquals(expected, actual);

    }

    @Test
    void shouldMaxSales() {
        //переменные
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 8;
        double actual = service.maxSales(sales);
        //тест
        assertEquals(expected, actual);

    }

    @Test
    void shouldMinSales() {
        //переменные
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 9;
        double actual = service.minSales(sales);
        //тест
        assertEquals(expected, actual);

    }

    @Test
    void shouldCountLowerAverage() {
        //переменные
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 5;
        double actual = service.countLowerAverage(sales);
        //тест
        assertEquals(expected, actual);

    }

    @Test
    void countUpperAverage() {
        //переменные
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 5;
        double actual = service.countUpperAverage(sales);
        //тест
        assertEquals(expected, actual);

    }
}