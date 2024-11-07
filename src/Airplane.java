public class Airplane implements Flyable{

    private String airplaneName;

    private int speed;

    private int altitude;

    public Airplane(String airplaneName, int speed, int altitude) {
        this.airplaneName = airplaneName;
        this.speed = speed;
        this.altitude = altitude;
    }

    @Override
    public void fly_obg() {
        System.out.println("Самолет летит в небе");
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
