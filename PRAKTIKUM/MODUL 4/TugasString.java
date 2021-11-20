import java.util.*;

public class TugasString {
    public void ReverseString(){
        String huruf, hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        huruf = scanner.nextLine();

        int jumlah = huruf.length();
        int jumlahHuruf = jumlah - 1;
        for (int i = 0; i < jumlah; i++) {
            hasil = hasil + huruf.charAt(jumlahHuruf);
            jumlahHuruf--;
        }
            System.out.println("Hasil reverse string: " + hasil);
    }
}
