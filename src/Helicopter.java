public class Helicopter implements Flyable{

    private String helicopterName;

    private int speed;

    private int altitude;

    public Helicopter(String helicopterName, int speed, int altitude) {
        this.helicopterName = helicopterName;
        this.speed = speed;
        this.altitude = altitude;
    }

    @Override
    public void fly_obg() {
        System.out.println("Вертолет летит в небе");
    }

    public String getHelicopterName() {
        return helicopterName;
    }

    public void setHelicopterName(String helicopterName) {
        this.helicopterName = helicopterName;
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
