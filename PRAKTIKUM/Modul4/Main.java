import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double hampiran;
        int orde;
        int x0;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan orde = ");
        orde = input.nextInt();
        System.out.println("masukkan nilai x0 = ");
        x0 = input.nextInt();
        System.out.println("masukkan nilai hampiran menuju x0= ");
        hampiran = input.nextDouble();
        deretTaylor(orde,x0,hampiran);

    }

    public static void deretTaylor(int orde, int x0, double hampiran){
        double hasil=0;
        for (int i=1;i<=orde;i++){
           if (i % 2 == 1){
               hasil = hasil-(Math.pow(hampiran-x0,i)/i);
           }else if (i % 2 == 0){
               hasil = (Math.pow(hampiran-x0,i)/i)+hasil;
           }
        }
        hasil = 0-hasil;
        System.out.println("Maka nilai hampirannya yaitu ="+hasil);
    }
}