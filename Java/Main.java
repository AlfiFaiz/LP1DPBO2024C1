/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 1 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

import java.util.ArrayList;
import java.util.Scanner;

// Kelas program utama
public class Main {
    public static void main(String[] args) {
        // Inisialisasi variabel
        int i, n = 0, menu = 0;
        String nama, partai, bidang;
        int id;

        // ArrayList untuk menyimpan objek DPR
        ArrayList<DPR> anggota = new ArrayList<>();

        // Scanner untuk menerima input
        Scanner scanner = new Scanner(System.in);

        // perulangan menu
        while (menu != 999) {
            // Menampilkan menu utama
            System.out.println("\nDAFTAR MENU");
            System.out.println("1. Menampilkan data");
            System.out.println("2. Menambahkan data");
            System.out.println("3. Mengubah data");
            System.out.println("4. Menghapus data");
            System.out.println("999. Selesai");

            System.out.print("\nSilakan pilih MENU -> ");
            menu = scanner.nextInt();
            System.out.println();

            // menu 1 menampilkan data
            if (menu == 1) {
                if (n == 0) {
                    System.out.println("Tidak Ada Daftar anggota DPR: \n");
                } else {
                  // Menampilkan data dalam bentuk tabel
                    System.out.println("+----+-------+--------+--------+");
                    System.out.println("| ID | Nama  | Bidang | Partai |");
                    System.out.println("+----+-------+--------+--------+");
                    for (i = 0; i < n; i++) {
                        System.out.printf("| %d | %s | %s | %s |\n", anggota.get(i).getId(), anggota.get(i).getNama(), anggota.get(i).getBidang(), anggota.get(i).getPartai());
                    }
                    System.out.println("+----+-------+--------+--------+");
                }
            }
            // menu 2 menambahkan data
            else if (menu == 2) {
                // Memasukkan data anggota baru
                System.out.println("Masukkan Data:");
                System.out.print("ID: ");
                id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Nama: ");
                nama = scanner.nextLine();
                System.out.print("Bidang: ");
                bidang = scanner.nextLine();
                System.out.print("Partai: ");
                partai = scanner.nextLine();
                System.out.println();

                // Menambahkan anggota baru ke dalam ArrayList
                n++;
                anggota.add(new DPR(id, nama, bidang, partai));
                System.out.println("Data berhasil ditambahkan\n");
            } 
            // menu 3 mengubah data
            else if (menu == 3) {
                if (n == 0) {
                    System.out.println("Tidak Ada Daftar anggota DPR: \n");
                } else {
                    int ada = 0;
                    // Memasukkan ID anggota yang ingin diubah
                    System.out.print("Masukkan ID: ");
                    id = scanner.nextInt();
                    for (i = 0; i < n; i++) {
                        if (anggota.get(i).getId() == id) {
                            ada = 1;
                        }
                    }
                    if (ada == 1) {
                        // Memasukkan data baru untuk anggota yang dipilih
                        System.out.print("Masukkan Nama baru: ");
                        scanner.nextLine();
                        nama = scanner.nextLine();
                        System.out.print("Masukkan Bidang baru: ");
                        bidang = scanner.nextLine();
                        System.out.print("Masukkan Partai baru: ");
                        partai = scanner.nextLine();
                        System.out.println();

                        // Mengubah data anggota yang dipilih
                        for (i = 0; i < n; i++) {
                            if (anggota.get(i).getId() == id) {
                                anggota.get(i).setNama(nama);
                                anggota.get(i).setBidang(bidang);
                                anggota.get(i).setPartai(partai);
                            }
                        }

                        System.out.println("Data berhasil diubah\n\n");
                    } else {
                        System.out.println("Tidak Ada Daftar anggota DPR dengan ID " + id + "\n\n");
                    }
                }
            } 
            // menu 4 menghapus data
            else if (menu == 4) {
                int ada = 0;
                if (n == 0) {
                    System.out.println("Tidak Ada Daftar anggota DPR: \n\n");
                } else {
                    // Memasukkan ID anggota yang akan dihapus
                    System.out.print("Masukkan ID yang akan dihapus: ");
                    id = scanner.nextInt();
                    for (i = 0; i < n; i++) {
                        if (anggota.get(i).getId() == id) {
                            ada = 1;
                        }
                    }

                    if (ada == 1) {
                        // Menghapus anggota yang dipilih dari ArrayList
                        for (i = 0; i < n; i++) {
                            if (anggota.get(i).getId() == id) {
                                anggota.remove(i);
                                n--;
                            }
                        }
                        System.out.println("Data dengan ID " + id + " berhasil dihapus\n\n");
                    } else {
                        System.out.println("Tidak Ada Daftar anggota DPR dengan ID " + id + "\n\n");
                    }
                }
            } 
            // Menangani input yang tidak valid
            else if (menu != 999 && menu != 1 && menu != 2 && menu != 3 && menu != 4) {
                System.out.println("Tidak Ada menu nomor " + menu + "\n\n");
            }
        }
        // Menampilkan pesan program selesai
        System.out.println("\nProgram selesai");
    }
}
