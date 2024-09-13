import java.util.Scanner;

    public class Siakad19 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nama, nim;
            char kelas;
            byte absen;
            double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
            System.out.println("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan NIM: ");
            nim = sc.nextLine();
            System.out.println("Masukkan Kelas: "); 
            kelas = sc.nextLine().charAt(0);
            System.out.println("Masukkan Nomor Absen: ");
            absen = sc.nextByte();
            System.out.println("Masukkan Nilai Kuis: ");
            nilaiKuis = sc.nextDouble();
            System.out.println("Masukkan Nilai Tugas: ");
            nilaiTugas = sc.nextDouble();
            System.out.println("Masukkan Nilai Ujian: ");
            nilaiUjian = sc.nextDouble();
            nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
            System.out.println("Nama: " + nama + "NIM: " + nim);
            System.out.println("Kelas: " + kelas + "Absen: " + absen);
            System.out.println("Nilai Akhir: " + nilaiAkhir);

        }
    }