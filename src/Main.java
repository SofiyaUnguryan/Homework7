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
        System.out.println("Задача 1");
        int monthlyPayment = 15000;
        int totalSavings = 0;
        int i = 1;
        while (totalSavings < 2_459_000) {
            totalSavings = totalSavings + monthlyPayment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
            i = i + 1;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        for (int n = 10; n >= 1; n = n - 1) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int birthRate = 17;
        int mortalityRate = 8;
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            population = population + population * birthRate / 1000 - population * mortalityRate / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int monthlyPayment = 15000;
        int totalSavings = 0;
        int i = 1;
        while (totalSavings <= 12_000_000) {
            totalSavings = totalSavings + totalSavings * 7 / 100;
            totalSavings = totalSavings + monthlyPayment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
            i = i + 1;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthlyPayment = 15000;
        int totalSavings = 0;
        int i = 1;
        while (totalSavings <= 12_000_000) {
            totalSavings = totalSavings + totalSavings * 7 / 100;
            totalSavings = totalSavings + monthlyPayment;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
            }
            i = i + 1;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int monthlyPayment = 15000;
        int totalSavings = 0;
        int i = 1;
        int totalTime = i * 12 * 9;
        while (i <= totalTime) {
            totalSavings = totalSavings + totalSavings * 7 / 100;
            totalSavings = totalSavings + monthlyPayment;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
            }
            i = i + 1;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int startingPoint = currentYear - 200;
        int endingPoint = currentYear + 100;
        int cometYear = 0;
        while (endingPoint >= cometYear) {
            if (cometYear >= startingPoint) {
                System.out.println(cometYear);
            }
            cometYear = cometYear + 79;
        }
    }
}