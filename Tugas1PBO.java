import java.util.Scanner;

public class Tugas1PBO {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            System.out.println("----- Sistem Login Library -----");
            System.out.println("1. Login sebagai Mahasiswa");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    loginMahasiswa();
                    break;
                case 2:
                    loginAdmin();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void loginMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        if (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 karakter!");
            return;
        }

        System.out.println("Login sebagai mahasiswa dengan NIM " + nim + " berhasil!");
    }

    private static void loginAdmin() {
        System.out.print("Masukkan Username: ");
        String username = scanner.next();
        System.out.print("Masukkan Password: ");
        String password = scanner.next();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login sebagai admin berhasil!");

        } else {
            System.out.println("Username atau password salah!");
        }
    }
}