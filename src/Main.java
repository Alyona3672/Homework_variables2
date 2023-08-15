public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        int intVar = 526548962;
        byte byteVar = 38;
        short shortVar = 11659;
        long longVar = 1534795826426511L;
        float floatVar = 5418.32F;
        double doudleVar = 65213.631556;

        System.out.println("Значение переменной с типом int равно " + intVar);
        System.out.println("Значение переменной с типом byte равно " + byteVar);
        System.out.println("Значение переменной с типом short равно " + shortVar);
        System.out.println("Значение переменной с типом long равно " + longVar);
        System.out.println("Значение переменной с типом float равно " + floatVar);
        System.out.println("Значение переменной с типом double равно " + doudleVar);
    }

    public static void  task2(){
        float var1 = 27.12F;
        long var2 = 987_678_965_549L;
        float var3 = 2.7786F;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;
        System.out.println("Task2 is done");
    }

    public static void  task3(){
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int totalCountOfPaper = 480;
        System.out.println("На каждого ученика расчитано " + (totalCountOfPaper / (teacher1 + teacher2 + teacher3)) + " листов бумаги");
    }

    public static void task4(){
        int bottles = 16;
        int min = 2;
        int period1 = 20 / min * bottles;
        int period2 = 24 * 60 / min * bottles;
        int period3 = 3 * 24 * 60 / min * bottles;
        int period4 = 30 * 24 * 60 / min * bottles;
        System.out.println("За 20 минут машина произвела " + period1 + "штук бутыло");
        System.out.println("За 1 сутки машина произвела " + period2 + "штук бутыло");
        System.out.println("За 3 суток машина произвела " + period3 + "штук бутыло");
        System.out.println("За 1 месяц машина произвела " + period4 + "штук бутыло");

    }

    public static void task5(){
        int pots = 120;
        int whitePots = 2;
        int brownPots = 4;
        int numberOfClasses = pots / (whitePots + brownPots);
        int totalOfWhitePots = whitePots * numberOfClasses;
        int totalBrownPots = brownPots * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalOfWhitePots + " банок белой краски " +
                totalBrownPots + " банок коричневой краски ");
    }

    public static void task6(){
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalSum = bananas + milk + iceCream + eggs;
        System.out.println("Сумма в граммах = " + totalSum);
        System.out.println("сумма в килограммах = " + (totalSum / 1000.0));
    }

    public static void task7(){
        int diffWeightKg = 7;
        int diffWeight = diffWeightKg * 1000;
        int numberOfDays1 = diffWeight / 250;
        int numberOfDays2 = diffWeight / 500;
        System.out.println("Потребуется " + numberOfDays1);
        System.out.println("Потребуется " + numberOfDays2);
        System.out.println("В среднем потребуется " + (numberOfDays1 + numberOfDays2) / 2.0);
    }

    public static void task8(){
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int increasedSalaryMaria = (int) (salaryMaria * 1.1);
        int increasedSalaryDenis = (int) (salaryDenis * 1.1);
        int increasedSalaryKristina = (int) (salaryKristina * 1.1);

        int diffSalaryMaria = increasedSalaryMaria - salaryMaria;
        int diffSalaryDenis = increasedSalaryDenis - salaryDenis;
        int diffSalaryKristina = increasedSalaryKristina - salaryKristina;

        int diffSalaryMariaPerYear = diffSalaryMaria * 12;
        int diffSalaryDenisPerYear = diffSalaryDenis * 12;
        int diffSalaryKristinaPerYear = diffSalaryKristina * 12;
        System.out.println("Маша теперь получает " + increasedSalaryMaria + " рублей. Годовой доход вырос на " +
                diffSalaryMariaPerYear + " рублей ");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " +
                diffSalaryDenisPerYear + " рублей ");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " +
                diffSalaryKristinaPerYear + " рублей");
    }

}



