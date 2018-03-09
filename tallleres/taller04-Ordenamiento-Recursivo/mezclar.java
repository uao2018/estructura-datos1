static void mezclar(int[] datos, int ini, int mitad, int fin) {
        int[] temporal = new int[datos.length];
        for (int i = ini; i <= fin; i++) {
            temporal[i] = datos[i];
        }

        int temporalIzquierda = ini;
        int temporalDerecha = mitad + 1;
        int actual = ini;

        while (temporalIzquierda <= mitad && temporalDerecha <= fin) {
            if (temporal[temporalIzquierda] <= temporal[temporalDerecha]) {
                datos[actual] = temporal[temporalIzquierda];
                temporalIzquierda++;

            } else {
                datos[actual] = temporal[temporalDerecha];
                temporalDerecha++;
            }
            actual++;
        }

        int resto = mitad - temporalIzquierda;
        for (int i = 0; i <= resto; i++) {
            datos[actual + i] = temporal[temporalIzquierda + i];
        }
    }
