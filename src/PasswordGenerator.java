import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+<>?";
        StringBuilder characterSet = new StringBuilder();

        
        System.out.print("How many characters? ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterSet.append(upperCase);
        }

        System.out.print("Include lowercase letters? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterSet.append(lowerCase);
        }

        System.out.print("Include numbers? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterSet.append(numbers);
        }

        System.out.print("Include symbols? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterSet.append(symbols);
        }

       
        if (characterSet.length() == 0) {
            System.out.println("You must select at least one character type.");
            return;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Gerador de senha
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        System.out.println("Generated Password: " + password);
    }
}
