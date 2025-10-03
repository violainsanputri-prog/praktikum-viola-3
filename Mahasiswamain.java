public class Mahasiswa {
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", IPK: " + ipk);
    }
public static void main(String[] args) {
        try {
            System.out.println("Program dimulai.");
            Mahasiswa mhs1 = new Mahasiswa("Viola", 3.5);
            mhs1.tampilkanInfo();

            Mahasiswa mhs2 = new Mahasiswa("Kusti", 4.5); // Ini akan memicu exception
            mhs2.tampilkanInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program selesai.");
    }
}