package ext;

public class Tiger extends Tank {
    private int armor;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void printInfo(Tank tank) {
        super.printInfo(tank);
        System.out.print("Armor: "+getArmor());
    }
}
