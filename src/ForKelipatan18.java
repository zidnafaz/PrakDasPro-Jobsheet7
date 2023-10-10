import java.util.Scanner;

public class ForKelipatan18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        int
        kelipatan, jumlah = 0, counter = 0;

        System.out.print("\nMasukkan bilangan kelipatan ( 1-9 )     : ");
        kelipatan = sc18.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyak bilangan %d dari i sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari i sampai 50 adalah %d\n", kelipatan, jumlah);

    }
    
}