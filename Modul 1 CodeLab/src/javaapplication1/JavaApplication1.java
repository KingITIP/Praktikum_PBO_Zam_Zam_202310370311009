package javaapplication1;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String namaUser = scanner.next();
        
        System.out.print("Jenis Kelamin (L/P): ");
        String kelaminUser = scanner.next();
        
        System.out.print("Masukkan tanggal lahir (Format: yyyy-MM-dd): ");
        String tanggalLahirString = scanner.next();
        
        System.out.println("Nama : " + namaUser);
        if(kelaminUser.equals("p") || kelaminUser.equals ("P")){
            System.out.println("Jenis Kelamin : Perempuan");
        }else if(kelaminUser.equals("l") || kelaminUser.equals ("L")){
            System.out.println("Jenis Kelamin : Laki-Laki");
        }else{
            System.out.println("Jenis Kelamin : Tidak ditemukan");
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString, formatter);

        LocalDate hariIni = LocalDate.now();

        Period perbedaanUmur = Period.between(tanggalLahir, hariIni);
        
        
        System.out.println("Umur Anda adalah " + perbedaanUmur.getYears() + " tahun dan " + perbedaanUmur.getMonths() + " bulan.");

        scanner.close();
    }
}
