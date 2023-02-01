import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
    /* Задача 1
    С помощью условного оператора напишите программу, которая выводит в консоль:
    сообщение о том, что человеку 18 или больше лет;
    сообщение, что возраст совершеннолетия еще не наступил и нужно немного подождать.
    При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
     «Если возраст человека равен …, то (вывести в зависимости от результата) он совершеннолетний
     / он не достиг совершеннолетия, нужно немного подождать».
    * */
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он достиг совершеннолетия");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия нужно подождать");
        }
        System.out.println();
    }

    public static void task2() {
            /* Задача 2
        Напишите программу, которая выводит сообщение:«На улице холодно,
        нужно надеть шапку» — если температура ниже 5 градусов.
        «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        При выполнении каждого условия выведите в консоль: «На улице … градусов,
        (вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».
            */
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов можно нужно надеть шапку");
        }
        System.out.println();
    }

    public static void task3() {
        /* Задача 3
         Напишите программу, которая сообщает водителю о том, что:
         скорость превышена, если она больше 60 км/ч;
        превышения скорости нет, если она меньше 60 км/ч.
        При выполнении каждого условия программа должна выводить такое сообщение:
        «Если скорость …, то (вывести в зависимости от результата)
         придется заплатить штраф / можно ездить спокойно».
         *  */
        System.out.println("Задача 3");
        int speed = 70;
        int criticalSpeed = 60;
        if (speed > criticalSpeed) {
            System.out.println("Если скорость равна " + speed + " придется заплатить штраф ");
        } else {
            System.out.println("Если скорость равна " + speed + " можете ездить спокойно ");
        }
        System.out.println();

    }

    public static void task4() {
        /* Задача 4
        Напишите программу, которая помогает определить, в какое учреждение нужно
        отправить человека в зависимости от его возраста:
        Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
        Если человеку больше 18 лет, но меньше 24, то его место в университете.
        А если человеку больше 24, то ему пора ходить на работу.
        При выполнении каждого условия программа должна выводить в консоль
         сообщение в формате: «Если возраст человека равен …, то ему нужно ходить …
         (в зависимости от возраста дописать нужное)».
         * * */
        System.out.println("Задача 4");
        int age = 25;
        int minimalGardenYear = 2;
        int maximumGardenYear = 7;
        int maximumSchoolEar = 18;
        int maximumUniversityYear = 24;
        boolean lableGarden = age >= minimalGardenYear && age < maximumGardenYear;
        boolean lableSchool = age >= maximumGardenYear && age < maximumSchoolEar;
        boolean lableUniversity = age >= maximumSchoolEar && age < maximumUniversityYear;
        boolean lableWork = age >= maximumUniversityYear;
        if (lableGarden) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в садик ");
        }
        if (lableSchool) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу ");
        }
        if (lableUniversity) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет ");
        }
        if (lableWork) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу ");
        }
        System.out.println();
    }

    public static void task5() {
        /* Задача 5
        Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        Если ребенку больше 5, но меньше 14 лет, то он может кататься
        только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение в формате:
        «Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное:
        нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении / без сопровождения взрослого)»
         * * */
        System.out.println("Задача 5");
        int age = 15;
        int ageNoRide = 5;
        int ageRideHuman = 14;
        boolean lableBigHuman = false;
        if (age < ageNoRide) {
            System.out.println("Если возраст ребенка равен " + age + " нельзя кататься на аттракционе");
        }
        if (lableBigHuman = true) {
            if (age >= ageNoRide && age <= ageRideHuman) {
                System.out.println("Если возраст ребенка равен " + age + " можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age + " можно кататься на аттракционе без сопровождении взрослого");
            }

        }
        System.out.println();
    }

    public static void task6() {
        /* Задача 7
         Даны три числа
         int one;
         int two;
         int three;
         С помощью условного оператора и конструкции else напишите программу,
         которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.
         *  */
        System.out.println("Задача 7");
        int one = 45;
        int two = 62;
        int tree = 28;
        int bigNumber = 0;
        if (one > two) {
            bigNumber = one;
        } else {
            bigNumber = two;
        }

        if (bigNumber < tree) {
            bigNumber = tree;
        }

        System.out.println("Нвибольшее число из чисел " + one + ", " + two + ", " + tree + "  равно " + bigNumber);
        System.out.println();
    }


    public static void task7() {
        /* Задача 6
        Вместимость одного вагона поезда — 102 человека.
        Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        С помощью условного оператора и конструкции else
        напишите программу, которая выводит в консоль сообщение о том,
        есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит. * */
        System.out.println("Задача 6");
        int fullPlaces = 102;
        int sittingPlases = 60;
        int busyPlaces = 55;
        if (busyPlaces < fullPlaces) {
            System.out.println("Есть свобоные места в вагоне");
            if (busyPlaces < sittingPlases) {
                System.out.println("В наличии имеются сидячие места");
            } else {
                System.out.println(" В наличии остались только стоячие места");
            }
        } else {
            System.out.println("Свободных мест в вагоне нет");
        }
        System.out.println();
    }
}

