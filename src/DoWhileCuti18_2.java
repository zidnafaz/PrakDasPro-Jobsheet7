import java.util.Scanner;

public class DoWhileCuti18_2 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        int
        jatahCuti, jumlahHari;

        String
        konfirmasi;

        System.out.print("\nMasukkan jatah cuti                           : ");
        jatahCuti = sc18.nextInt();

        do {
            System.out.print("\nApakah anda ingin mengambil cuti (y/t)?       : ");
            konfirmasi = sc18.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Masukkan jumlah hari                          : ");
                jumlahHari = sc18.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("\nSisa jatah cuti anda adalah " + jatahCuti + " hari");
                } else {
                    System.out.println("\nSisa jatah cuti anda tidak mencukupi");
                    
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);

    }
}
