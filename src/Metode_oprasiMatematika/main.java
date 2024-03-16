package Metode_oprasiMatematika;

public class main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println("Hasil penjumlahan 2 angka: " + math.add(5, 7)); // Memanggil metode add dari kelas MathOperation
        System.out.println("Hasil penjumlahan 3 angka: " + math.add(3, 8, 2)); // Memanggil metode overload add dari kelas MathOperation

        AdvancedMathOperation advancedMath = new AdvancedMathOperation();
        System.out.println("Hasil penjumlahan 2 angka (advanced): " + advancedMath.add(5, 7)); // Memanggil metode override add dari kelas AdvancedMathOperation
    }
}
