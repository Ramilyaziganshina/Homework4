public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 10;
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seatPlacе = 60;
        int standPlace = wagonCapacity - seatPlacе;

        int numberOfSeatPassengers = 20;
        int numberOfStandPassengers = 30;

        if (numberOfSeatPassengers < seatPlacе) {
            System.out.println("В вагоне есть " + (seatPlacе - numberOfSeatPassengers) + "сидячих мест");
        } else {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (numberOfStandPassengers < standPlace) {
            System.out.println("В вагоне есть " + (standPlace - numberOfStandPassengers) + " стоячих мест");
        } else {
            System.out.println("В вагоне нет стоячих мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 4;
        int two = 4;
        int three = 5;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else if (one < three) {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else if (two < three) {
                System.out.println("Максимальное число " + three);
            }
        } else if (one > three) {
            System.out.println("Максимальное число " + one);
        } else if (three > one) {
            System.out.println("Максимальное число " + three);
        } else {
            System.out.println("Все числа равны");
        }
    }
}