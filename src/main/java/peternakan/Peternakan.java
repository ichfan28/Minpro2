/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

import hewan.Hewan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Peternakan implements CRUD {
    private ArrayList<Hewan> daftarHewan;

    public Peternakan() {
        this.daftarHewan = new ArrayList<>();
    }

    @Override
    public void tambahHewan(Hewan hewan) {
        daftarHewan.add(hewan);
    }

    @Override
    public void tampilkanHewan() {
        System.out.println("Daftar Hewan di Peternakan:");
        for (Hewan hewan : daftarHewan) {
            System.out.println(hewan);
        }
    }

    @Override
    public void updateHewan(int index, Hewan hewan) {
        if (index >= 0 && index < daftarHewan.size()) {
            daftarHewan.set(index, hewan);
            System.out.println("Hewan berhasil diupdate.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    @Override
    public void hapusHewan(int index) {
        if (index >= 0 && index < daftarHewan.size()) {
            daftarHewan.remove(index);
            System.out.println("Hewan berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public static void main(String[] args) {
        Peternakan peternakan = new Peternakan();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Tampilkan Hewan");
            System.out.println("3. Update Hewan");
            System.out.println("4. Hapus Hewan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama hewan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jenis hewan: ");
                    String jenis = scanner.nextLine();
                    System.out.print("Masukkan umur hewan: ");
                    int umur = scanner.nextInt();
                    peternakan.tambahHewan(new Hewan(nama, jenis, umur));
                    break;

                case 2:
                    peternakan.tampilkanHewan();
                    break;

                case 3:
                    System.out.print("Masukkan index hewan yang ingin diupdate: ");
                    int indexUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama hewan baru: ");
                    String namaUpdate = scanner.nextLine();
                    System.out.print("Masukkan jenis hewan baru: ");
                    String jenisUpdate = scanner.nextLine();
                    System.out.print("Masukkan umur hewan baru: ");
                    int umurUpdate = scanner.nextInt();
                    peternakan.updateHewan(indexUpdate, new Hewan(namaUpdate, jenisUpdate, umurUpdate));
                    break;

                case 4:
                    System.out.print("Masukkan index hewan yang ingin dihapus: ");
                    int indexDelete = scanner.nextInt();
                    peternakan.hapusHewan(indexDelete);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}

