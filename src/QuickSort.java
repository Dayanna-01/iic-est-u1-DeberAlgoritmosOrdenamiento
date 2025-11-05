public class QuickSort {

    private View vista = new View();
    private boolean mostrarPasos;

    public void ordenar(int[] arreglo, boolean pasos) {
        this.mostrarPasos = pasos;
        quickSort(arreglo, 0, arreglo.length - 1);
    }

    private void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = dividir(arreglo, inicio, fin);

            if (mostrarPasos) {
                System.out.print("Paso: ");
                vista.mostrarArreglo(arreglo);
            }

            quickSort(arreglo, inicio, indicePivote - 1);
            quickSort(arreglo, indicePivote + 1, fin);
        }
    }

    private int dividir(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        return i + 1;
    }
}
