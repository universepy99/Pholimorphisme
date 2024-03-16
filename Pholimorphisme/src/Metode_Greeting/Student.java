package Metode_Greeting;

class Student extends Person {
    // Override metode greet untuk memberikan salam khusus siswa
    @Override
    public void greet() {
        System.out.println("Halo, selamat datang di sekolah!");
    }

    // Overload metode greet untuk memberikan salam khusus siswa dengan nama
    public void greet(String name) {
        System.out.println("Halo, " + name + ", selamat datang di sekolah!");
    }
}