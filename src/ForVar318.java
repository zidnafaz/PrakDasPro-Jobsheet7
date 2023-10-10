import java.util.Scanner;

public class ForVar318 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        int
        bilangan, n;

        boolean
        berhenti = false;

        for (n = 0 ; !berhenti ; n++) {
            System.out.print("Masukkan Bilangan               : ");
            bilangan = sc18.nextInt();
            System.out.println("Bilangan yang anda masukkan     : " + bilangan);

            if (bilangan < n) {
                berhenti = true;
            }
        }

        System.out.println("Program Berakhir");
    }
}
