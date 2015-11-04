package ext;

/**
 * Created by admin on 04.11.2015.
 */
public class Tank {

    private Colors colors;
    private String crew;
    private int maxSpeed;

    public Tank() {

    }

    public Tank(Colors colors, String crew, int maxSpeed) {
        this.colors = colors;
        this.crew = crew;
        this.maxSpeed = maxSpeed;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
