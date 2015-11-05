package less2.frame7;

public class Tank {

    private Colors colors;
    private int crew;
    private int maxSpeed;
    private String name;

    public Tank() {

    }

    public Tank(Colors colors, int crew, int maxSpeed) {
        this.colors = colors;
        this.crew = crew;
        this.maxSpeed = maxSpeed;
    }

    public Tank(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        System.out.print("Name :"+tank.getName()+" colors: ["+tank.getColors()+"] "+
                         "max speed: ["+tank.getMaxSpeed()+"] "+
                         "crew: ["+tank.getCrew()+"] \n");
    }

    public void move(Tank tank){
       // System.out.print();
    }
}
