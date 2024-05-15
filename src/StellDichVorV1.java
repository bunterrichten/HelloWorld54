import java.util.Scanner;

public class StellDichVorV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int zahl;
        do {
            System.out.println("Wähle eine Zahl (1-10): ");
            zahl = sc.nextInt();
        } while (zahl < 1 || zahl > 10);
    }
}
