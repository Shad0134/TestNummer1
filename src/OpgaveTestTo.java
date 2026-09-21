import java.util.Scanner;

public class OpgaveTestTo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv et tal: ");
        int number = scanner.nextInt();
        System.out.println("skriv endnu et tal: ");
        int numberTo = scanner.nextInt();
        System.out.println("hvad vil du gøre");
        char tegn = scanner.next().charAt(0);
        if (tegn == '+') {
            System.out.println(number + numberTo);
        } else if (tegn == '*') {
            System.out.println(number * numberTo);
        } else if (tegn == '-') {
            System.out.println(number - numberTo);
        } else if (tegn == '/') {
            System.out.println(number / numberTo);
        }
    }
}
