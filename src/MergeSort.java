public class MergeSort {

    private View vista = new View();
    private boolean mostrarPasos;

    public void ordenar(int[] arreglo, boolean pasos) {
        this.mostrarPasos = pasos;
        mergeSort(arreglo, 0, arreglo.length - 1);
    }

    private void mergeSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;

            mergeSort(arreglo, inicio, medio);
            mergeSort(arreglo, medio + 1, fin);

            combinar(arreglo, inicio, medio, fin);

            if (mostrarPasos) {
                System.out.print("Paso: ");
                vista.mostrarArreglo(arreglo);
            }
        }
    }

    private void combinar(int[] arreglo, int inicio, int medio, int fin) {
        int tamañoIzquierda = medio - inicio + 1;
        int tamañoDerecha = fin - medio;

        int[] izquierda = new int[tamañoIzquierda];
        int[] derecha = new int[tamañoDerecha];

        for (int i = 0; i < tamañoIzquierda; i++) {
            izquierda[i] = arreglo[inicio + i];
        }
        for (int j = 0; j < tamañoDerecha; j++) {
            derecha[j] = arreglo[medio + 1 + j];
        }

        int i = 0, j = 0, k = inicio;

        while (i < tamañoIzquierda && j < tamañoDerecha) {
            if (izquierda[i] <= derecha[j]) {
                arreglo[k] = izquierda[i];
                i++;
            } else {
                arreglo[k] = derecha[j];
                j++;
            }
            k++;
        }

        while (i < tamañoIzquierda) {
            arreglo[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < tamañoDerecha) {
            arreglo[k] = derecha[j];
            j++;
            k++;
        }
    }
}
