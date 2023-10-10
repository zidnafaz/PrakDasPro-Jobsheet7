import java.util.Scanner;

public class WhileGaji18_2 {
    public static void main(String[] args) {
        
        Scanner sc18 = new Scanner(System.in);

        int
        jumlahKaryawan, jumlahJamLembur;

        double
        gajiLembur = 0, totalGajiLembur = 0;

        String
        jabatan;

        System.out.print("Masukkan jumlah karyawan      : ");
        jumlahKaryawan = sc18.nextInt();

        int i = 0;
        
        while (i < jumlahKaryawan) {
            
            System.out.println("\nPilihan jabatan");
            System.out.println("- Direktur");
            System.out.println("- Manager");
            System.out.println("- Karyawan");
            System.out.println("______________________________________");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + "  : ");
            jabatan = sc18.next();
            
            System.out.print("Masukkan jumlah jam lembur      : ");
            jumlahJamLembur = sc18.nextInt();
            i++;
            
            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manager")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                i--;
                gajiLembur = jumlahJamLembur * 0;
            }
            
            totalGajiLembur += gajiLembur;
        }
        
        System.out.println("Total gaji lembur               : " + totalGajiLembur);
    }
}
