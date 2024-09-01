import java.util.Locale;
import java.util.Scanner;

public class us {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        char Alphabet =input.next().trim().charAt(0);

        System.out.println(Character.toLowerCase(Alphabet));

        switch (Alphabet) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowels");
            default -> System.out.println("Consonent");
        }
    }
}
