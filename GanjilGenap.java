public class GanjilGenap {
    /**
     * fungsi ini menentukan apakah sebuah bilangan ganjil atau genap
     *
     * @param bilangan Bilangan yang akan diperiksa
     * @return String "Genap" jika bilangan genap, "Ganjil" jika bilangan ganjil
     */

    public static String CekGanjilGenap(int bilangan){
        if (bilangan % 2 == 0){
            return "Genap";
        } else {
            return "Ganjil";
        }
    }

    public static void main(String[] args) {
        int bilangan = 20; //ganti sesuai dengan yang ingin diperiksa.

        String hasil = CekGanjilGenap(bilangan);

        System.out.println(bilangan + " adalah bilangan " + hasil + ".");
    }
}
