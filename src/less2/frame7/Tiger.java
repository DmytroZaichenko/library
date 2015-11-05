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
        System.out.print(" armor: "+getArmor());
    }
}
