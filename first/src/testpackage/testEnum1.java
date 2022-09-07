package testpackage;

public class testEnum1 {
    public static void main(String[] args) {
        double earthWeight = 175;
        double mass = earthWeight/ Planet.EARTH.surfaceG();
        for (Planet p : Planet.values())
        {
            System.out.printf("Weight on %s is %f%n", p,p.surfaceWeight(mass));
        }
    }
}

//枚举数据类型和行为
enum Planet{
    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.378e6),
    MARS(6.419e+23, 3.393e6),
    NEPTUNE(1.024e+26,2.477e7);

    private final double mass;
    private final double radius;
    private final double surfaceG;
    private static final double G = 6.67300e-11;
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceG = G * mass / (radius * radius);
    }

    public double mass() {return mass;}
    public double radius() {return radius;}
    public double surfaceG() {return surfaceG;}

    public double surfaceWeight(double mass)
    {
        return mass * surfaceG;
    }
}