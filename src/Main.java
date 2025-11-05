import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre: Dayanna Chacha");

        View vista = new View();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n=== MENÚ DE ORDENAMIENTO ===");
            System.out.println("1. Método Merge Sort");
            System.out.println("2. Método Quick Sort");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 3) {
                System.out.println("Saliendo del programa...");
                break;
            }

            int[] numeros = {5, 10, 20, 2, 40, 33, 7, 22, 4, 39, 1};

            System.out.println("\n=== ORDEN ORIGINAL ===");
            vista.mostrarArreglo(numeros);

            System.out.print("¿Deseas ver los pasos? (true/false): ");
            boolean pasos = entrada.nextBoolean();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- MERGE SORT ---");
                    mergeSort.ordenar(numeros, pasos);
                    System.out.println("\nResultado final:");
                    vista.mostrarArreglo(numeros);
                    break;

                case 2:
                    System.out.println("\n--- QUICK SORT ---");
                    quickSort.ordenar(numeros, pasos);
                    System.out.println("\nResultado final:");
                    vista.mostrarArreglo(numeros);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        entrada.close();
    }
}
