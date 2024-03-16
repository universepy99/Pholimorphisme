package Metode_oprasiMatematika;

class AdvancedMathOperation extends MathOperation {
    // Override metode add untuk menghitung penjumlahan dua bilangan floating point
    @Override
    public int add(int a, int b) {
        return (int) (a + b);
    }
}
