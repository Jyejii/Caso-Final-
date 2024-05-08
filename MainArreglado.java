import java.util.*;

public class MainArreglado {
    public static void main(String[] args) {
        int a = recursive(1, -2);
        System.out.println(a);
    }

    public static int recursive(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else if (b > 0) {
            return Calculo(a, b);
        } else {
            return 1 / Calculo(a, -b);
        }
    }

    public static int Calculo(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * Calculo(a, b - 1);
        }
    }
}
// este codigo arreglado funciona correctamente ya que se agrego una condicion de parada para el caso en que b sea negativo, y se creo un metodo Calculo para que se encargue de realizar la multiplicacion de a por b.
