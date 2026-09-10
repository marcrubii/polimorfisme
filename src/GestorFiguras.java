import java.util.Arrays;

public class GestorFiguras {

    public static double suma(Figura[] v) {
        double total = 0;
        for (Figura f : v) {
            total += f.area();
        }
        return total;
    }

    public static void sort(Figura[] v) {
        Arrays.sort(v);
    }

    public static void print(Figura[] v) {
        for (Figura f : v) {
            System.out.println(f.getClass().getSimpleName() + " - área: " + f.area());
        }
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Cercle(120);

        double res = suma(v);
        System.out.println("Suma total del área: " + res);

        System.out.println("\n--- Sin ordenar ---");
        print(v);

        sort(v);

        System.out.println("\n--- Ordenados por área ---");
        print(v);
    }
}