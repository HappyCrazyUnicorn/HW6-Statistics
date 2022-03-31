package ru.netology.stats;

public class StatisticService {

    //метод расчета суммы
    public long sumSales(long[] sales) {
        //переменные
        long sum = 0; //сумма продаж, изначально = 0
        //расчет
        for (long sale : sales) {
            sum = sale + sum; //добавляем каждый элемент в сумму
        }
        return sum;
    }

    //Метод расчета средних продаж в месяц
    public double averageSales(long[] sales) {
        //переменные
        double average = 0; //изначально среднее равно нулю
        //расчет
        average = sumSales(sales) / sales.length; //среднее равно сумме элементов делить на количество месяцев
        return average;
    }

    //Поиск пикового месяца
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //Поиск месяца с минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Количество месяцев с продажами меньше среднего
    public int countLowerAverage(long[] sales) {
        //переменные
        int countMonth = 0; //количество месяцев
        //расчет
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

    //Количество месяцев с продажами выше среднего
    public int countUpperAverage(long[] sales) {
        //переменные
        int countMonth = 0; //количество месяцев
        //расчет
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

}
