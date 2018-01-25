
public class GeneradorArreglos {
    // Genera un arreglo de numeros aleatorios con "max" elementos
    public int[] generar(int max ) {

        int[] list = new int[max];
        for (int i = 0; i < max; i++) {
            int n = (int) (Math.random() * 1000 + 1);
            list[i] = n;
        }
        return list;
    }
}
