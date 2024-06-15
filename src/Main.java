public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        //2 задание

        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //3 задание

        int speed = 90;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }

        //4 задание

        int age1 = 15;
        if (age1 > 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        if (age1 > 24 ) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }

        //5 задание

        int age2 = 1;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", можно кататься на аттракционе в сопровождении взрослого");
        }
        else if (age2 > 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", можно кататься на аттракционе без сопровождения взрослого");
        }


        //6 задание


        int allPlace = 102;
        int sittingPlace = 60;
        int standingPlace = allPlace - sittingPlace;
        int buySittingPlace = 60;
        int buyStandingPlace = 42;
        if (buySittingPlace == sittingPlace && buyStandingPlace == standingPlace) {
            System.out.println("Все места в вагоне заняты");
        }
        else if (buySittingPlace == sittingPlace && buyStandingPlace < standingPlace) {
            System.out.println("В вагоне остались только стоячие мечста");
        }
        else if (buySittingPlace < sittingPlace && buyStandingPlace == standingPlace) {
            System.out.println("В вагоне остались только сидячие места");
        }
        else if (buySittingPlace < sittingPlace && buyStandingPlace < standingPlace){
            System.out.println("Все места в вагоне свободны");
             }

        //7 задание

        int one = 6;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число: " + one);
        }
        if (two > one && two > three) {
            System.out.println("Самое большое число: " + two);
        }
        else if (three > one && three > two) {
            System.out.println("Самое большое число: " + three);

        }


    }

  


}