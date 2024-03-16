package Metode_oprasiPenjualan;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.info(); // Memanggil metode info dari kelas Product

        Phone phone = new Phone();
        phone.info(); // Memanggil metode override info dari kelas Phone
        phone.info("Samsung"); // Memanggil metode overload info dari kelas Phone
    }
}
