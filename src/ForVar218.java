import java.util.Scanner;

public class ForVar218 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        int
        bilangan;

        boolean
        berhenti = false;

        for (; !berhenti ;) {
            System.out.print("Masukkan Bilangan               : ");
            bilangan = sc18.nextInt();
            System.out.println("Bilangan yang anda masukkan     : " + bilangan);

            if (bilangan == 0) {
                berhenti = true;
            }
        }

        System.out.println("Program Berakhir");
    }
}
