import java.util.Scanner;

public class ForKelipatan18_1 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        int
        kelipatan, jumlah = 0, counter = 0;

        double
        rataRata;

        System.out.print("\nMasukkan bilangan kelipatan ( 1-9 )     : ");
        kelipatan = sc18.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        rataRata = jumlah / counter;

        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);


    }
    
}