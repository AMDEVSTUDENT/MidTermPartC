import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Fantasy");

        // Prompt the user to choose their favorite genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        String genre;

        // Set the genre based on the user's choice
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Fantasy";
                break;
            default:
                genre = "Unknown";
                break;
        }

        // Display a message confirming the creation of the user profile
        System.out.println("User profile created:");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);

        // Close the Scanner object
        scanner.close();
    }
}
