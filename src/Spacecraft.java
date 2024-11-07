import java.util.Objects;

public class Spacecraft implements Flyable{

    private String spacecraftName;

    private int speed;

    private int altitude;

    public Spacecraft(String spacecraftName, int speed, int altitude) {
        this.spacecraftName = spacecraftName;
        this.speed = speed;
        this.altitude = altitude;
    }

    @Override
    public void fly_obg() {
        System.out.println("Космический корабль взлетает и выходит на орбиту");
    }

    public String getSpacecraftName() {
        return spacecraftName;
    }

    public void setSpacecraftName(String spacecraftName) {
        this.spacecraftName = spacecraftName;
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
