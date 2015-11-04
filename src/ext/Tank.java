package ext;

public class Tank {

    private Colors colors;
    private int crew;
    private int maxSpeed;

    public Tank() {

    }

    public Tank(Colors colors, int crew, int maxSpeed) {
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

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void printInfo(Tank tank){

        System.out.print("tank colors: "+tank.getColors()+
                         " max speed: "+tank.getMaxSpeed()+
                         " crew: "+tank.getCrew());
    }
}
