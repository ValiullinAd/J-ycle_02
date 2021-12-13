package ru.netology.stats;

public class StatsService {
    public int arrayMouth(int[] mouthMeaning) {
        int sumOfSale = 0;
        for (int i = 0; i < mouthMeaning.length; i++) {
            sumOfSale += mouthMeaning[i];
        }
        return sumOfSale;
    }

    public int aveSales(int[] mouthMeaning) {
        int averageSale = 0;
        for (int i : mouthMeaning) {
            averageSale = arrayMouth(mouthMeaning) / mouthMeaning.length;
        }
        return averageSale;
    }

    public int findPeakSales(int[] mouthMeaning){
        int currentMax = mouthMeaning[0];
        int topMouth = 0;
        int cellCounter = 0;
        for (int sale : mouthMeaning){
            cellCounter++;
            if (sale >= currentMax){
                currentMax = sale;
                topMouth = cellCounter;
            }
        }
        return topMouth;
    }
    public int findLowSales(int[] mouthMeaning){
        int currentMin = mouthMeaning[0];
        int lowMouth = 0;
        int cellCounter = 0;
        for (int sale : mouthMeaning){
            cellCounter++;
            if (sale <= currentMin){
                currentMin = sale;
                lowMouth = cellCounter;
            }
        }
        return lowMouth;
    }
    public int findSalesLowAve(int[] mouthMeaning){

        int mouth = 0;
        for (int sale : mouthMeaning) {
            if (sale <= aveSales(mouthMeaning)) {
                mouth++;
            }
        }
        return mouth;
    }
    public int findSalesHighAve(int[] mouthMeaning){

        int mouth = 0;
        for (int sale : mouthMeaning) {
            if (sale > aveSales(mouthMeaning)) {
                mouth++;
            }
        }
        return mouth;
    }
}
