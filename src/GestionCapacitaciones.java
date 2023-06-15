import java.util.Scanner;

class GestionCapacitaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos de la capacitación:");
        System.out.print("Día: ");
        String dia = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Duración: ");
        String duracion = scanner.nextLine();
        System.out.print("Cantidad de asistentes: ");
        int cantidadAsistentes = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea pendiente

        String[] nombresAsistentes = new String[cantidadAsistentes];
        int[] calificaciones = new int[cantidadAsistentes];

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.print("Nombre del asistente " + (i + 1) + ": ");
            nombresAsistentes[i] = scanner.nextLine();

            System.out.print("Calificación del asistente " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();

            scanner.nextLine(); // Consumir el salto de línea pendiente
        }

        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion);

        double promedio = calcularPromedio(calificaciones);
        System.out.println("Promedio de notas: " + promedio);

        int calificacionMaxima = obtenerCalificacionMaxima(calificaciones);
        System.out.println("Calificación mayor: " + calificacionMaxima);

        int calificacionMinima = obtenerCalificacionMinima(calificaciones);
        System.out.println("Calificación menor: " + calificacionMinima);
    }

    private static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    private static int obtenerCalificacionMaxima(int[] calificaciones) {
        int maxima = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > maxima) {
                maxima = calificaciones[i];
            }
        }
        return maxima;
    }

    private static int obtenerCalificacionMinima(int[] calificaciones) {
        int minima = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] < minima) {
                minima = calificaciones[i];
            }
        }
        return minima;
    }
}
