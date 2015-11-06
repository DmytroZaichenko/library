package less2.frame7;

public class Tiger extends Tank {
    private int armor;

    public Tiger(String name, Colors colors, int crew, int maxSpeed, int armor) {
        super(name, colors, crew, maxSpeed);
        this.armor = armor;
    }


    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void printInfo(Tank tank) {
        super.printInfo(tank);
        System.out.println(" armor: "+getArmor());
    }

    @Override
    public void move() {
        super.move();
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Tiger";
    }
}
