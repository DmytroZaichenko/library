package less2.frame7;

public class T34 extends Tank {

    public T34(String name, Colors colors, int crew, int maxSpeed) {
        super(name, colors, crew, maxSpeed);
    }

    @Override
    public void move(Tank tank) {
        System.out.println("Move tank ");
    }
}
