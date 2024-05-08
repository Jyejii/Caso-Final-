import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = recursive(1,-2);
        System.out.println(a);
    }
    public static int recursive(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else {
            return a * recursive(a, b - 1);
        }
    }
}
//Este còdigo da error debido a que la recursividad no esta funcionando correctamente ya que nunca se detiene,ya que no tiene definida uan condicion de parada para el caso en que b sea negativo.
