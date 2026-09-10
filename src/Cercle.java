public class Cercle extends Figura {
    private double r;

    public Cercle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}