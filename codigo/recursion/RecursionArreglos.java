
public class RecursionArreglos {
    public static int sumaRecursiva(int[] a) {
        int sum = 0;
        for (int i = 0; i != a.length; i++) {
            sum = sum + a[i];
        }

        return sum;
    }
}
