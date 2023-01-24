public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(140.5, 3, "male", "Sary");
        Sheep sheep = new Sheep(25.5, 1, "female", "Karahan");
        Horse horse = new Horse(160.4, 3, "male", "Kashka");
        Farm farm = new Farm("Moscow.vilage Leninska",
                new Cow(140.5, 3, "male", "Sary"),
                new Horse(160.4, 3, "male", "Kashka"),
                new Sheep(25.5, 1, "female", "Karahan"), "Bakyt");

        System.out.println(cow.toString());
        System.out.println(sheep.toString());
        System.out.println(horse.toString());
        System.out.println(farm.toString());

        Farm1 farm1 =new Farm1(new Sheep(35.3,2,"female","rigo"),
                new Sheep(30.2, 3, "female", "Lola"),
                new Sheep(30.2, 3, "male", "pia"),
                new Cow(120.5, 2, "female", "pila"),
                new Cow(120.5, 2, "female", "polo"),
                new Cow(120.5, 2, "female", "sary"),
                new Cow(120.5, 2, "female", "ala"),
                new Cow(150.5, 2, "male", "kara"),
                new Horse(170.3, 3, "female", "lia"),
                new Horse(160.4, 3, "male", "Kashka"));
        System.out.println(farm1.toString());





        Farm2 farm2 = new Farm2(new Sheep(30.1,3,"male","bingo"),
                new Cow(85.3,1,"female","oli"),
                new Horse(145.4,2,"male","royal"));
        System.out.println(farm2);

    }
}