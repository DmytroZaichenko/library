package less2.frame7;


public class BT7 extends Tank {

    public BT7(){
    }

    public BT7(String name, Colors colors, int crew, int maxSpeed) {
        super(name, colors, crew, maxSpeed);
    }

    @Override
    public void move() {
        super.move();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BT7";
    }
}
