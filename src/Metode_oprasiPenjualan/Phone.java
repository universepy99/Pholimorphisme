package Metode_oprasiPenjualan;

class Phone extends Product {
    // Override metode info untuk menampilkan informasi telepon
    @Override
    public void info() {
        System.out.println("Ini adalah telepon.");
    }

    // Overload metode info untuk menampilkan informasi telepon dengan mereknya
    public void info(String brand) {
        System.out.println("Ini adalah telepon merek " + brand + ".");
    }
}