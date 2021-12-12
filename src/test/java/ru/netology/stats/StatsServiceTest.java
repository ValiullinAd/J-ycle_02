package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldArrayMouth() {
        StatsService statsService = new StatsService();
        int[] numMoth  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = statsService.arrayMouth(numMoth);
        assertEquals(expected, actual);
    }
    @Test
    void shouldAveSales() {
        StatsService statsService = new StatsService();
        int[] numMoth  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = statsService.aveSales(numMoth);
        assertEquals(expected, actual);
    }
    @Test
    void shouldPeakSales() {
        StatsService statsService = new StatsService();
        int[] numMoth  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = statsService.findPeakSales(numMoth);
        assertEquals(expected, actual);
    }
    @Test
    void shouldLowSales() {
        StatsService statsService = new StatsService();
        int[] numMoth  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = statsService.findLowSales(numMoth);
        assertEquals(expected, actual);
    }
    @Test
    void shouldSalesLowAve() {
        StatsService statsService = new StatsService();
        int[] numMoth  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = statsService.findSalesLowAve(numMoth);
        assertEquals(expected, actual);
    }
    @Test
    void shouldSalesHighAve() {
        StatsService statsService = new StatsService();
        int[] numMoth  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.findSalesHighAve(numMoth);
        assertEquals(expected, actual);
    }
}