import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();
        Scanner scanner = new Scanner(System.in);

        rentalManager.addMovie(new Movie("The Matrix", 1999));
        rentalManager.addMovie(new Movie("The Godfather", 1972));
        
        boolean running = true;
        while (running) {
            System.out.println("\n1. Listar Películas");
            System.out.println("2. Arrendar Película");
            System.out.println("3. Devolver Película");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    rentalManager.listMovies();
                    break;
                case 2:
                    System.out.print("Ingrese el título de la película a arrendar: ");
                    String rentTitle = scanner.nextLine();
                    rentalManager.rentMovie(rentTitle);
                    break;
                case 3:
                    System.out.print("Ingrese el título de la película a devolver: ");
                    String returnTitle = scanner.nextLine();
                    rentalManager.returnMovie(returnTitle);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}

