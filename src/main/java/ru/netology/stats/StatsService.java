package ru.netology.stats;

public class StatsService {
    public int arrayMouth(int[] mouthMeaning) {
        int sumOfSale = 0;
        for (int i = 0; i < mouthMeaning.length; i++) {
            //System.out.println(mouthMeaning [i]);
            sumOfSale += mouthMeaning[i];

        }
        return sumOfSale;
        //System.out.println("Summa " + sumOfSale);
    }

    public int aveSales(int[] mouthMeaning) {
        int allSum = 0;
        int averageSale = 0;
        for (int sale : mouthMeaning) {
            //Плюсуем все ячейки
            allSum += sale;
            //Средняя между суммой сложенных ячеек и кол-ва ячеек
            averageSale = allSum / mouthMeaning.length;
        }
        return averageSale;
    }

    public int findPeakSales(int[] mouthMeaning){
        int currentMax = mouthMeaning[0];
        int topMouth = 0;
        int cellCounter = 0;
        for (int sale : mouthMeaning){
            //считаем ячейки
            cellCounter++;
            //Если цифры в массиве одинаковые > оставит первый месяц >= возьмет последний
            if (sale >= currentMax){
                currentMax = sale;
                //попалось большое число запишем его ячейку
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
            //считаем ячейки
            cellCounter++;
            //Если цифры в массиве одинаковые < оставит первый месяц <= возьмет последний
            if (sale <= currentMin){
                currentMin = sale;
                //попалось большое число запишем его ячейку
                lowMouth = cellCounter;
            }
        }
        return lowMouth;
    }
    public int findSalesLowAve(int[] mouthMeaning){

        int allSum = 0;
        int averageSale = 0;
        int mouth = 0;
        for (int sale : mouthMeaning) {
            //Плюсуем все ячейки
            allSum += sale;
            //Средняя между суммой сложенных ячеек и кол-ва ячеек
            averageSale = allSum / mouthMeaning.length;
        }
        for (int sale : mouthMeaning) {
            //Если "Среднее" включительно то нужен знак = в сравнении
            if (sale <= averageSale) {
                mouth++;
            }
        }
        return mouth;
    }
    public int findSalesHighAve(int[] mouthMeaning){

        int allSum = 0;
        int averageSale = 0;
        int mouth = 0;
        for (int sale : mouthMeaning) {
            //Плюсуем все ячейки
            allSum += sale;
            //Средняя между суммой сложенных ячеек и кол-ва ячеек
            averageSale = allSum / mouthMeaning.length;
        }
        for (int sale : mouthMeaning) {
            //Если "Среднее" не включительно то достаточно "<" или ">"
            if (sale > averageSale) {
                mouth++;
            }
        }
        return mouth;
    }
}
