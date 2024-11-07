
public class Main {

    public static void main(String[] args) {
        Flyable airplane = new Airplane("Boeing 777", 700, 10000);
        Flyable helicopter = new Helicopter("Robinson R-44", 220, 630);
        Flyable spacecraft = new Spacecraft("Starship", 21600, 344000);

        airplane.fly_obg();
        helicopter.fly_obg();
        spacecraft.fly_obg();

    }
}
