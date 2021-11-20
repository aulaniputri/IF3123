import java.util.Scanner;

public class Obat {
    public static void main(String[] args){
        int pilih, jeniskelamin, umur, beratbadan;
        Scanner input = new Scanner(System.in);

        System.out.println("1). Obat 1 (Pria / Wanita) ");
        System.out.println("2). Obat 2 (Pria) ");
        System.out.println("3). Obat 3 (Pria / Wanita) ");
        System.out.print("Pilih Sebuah Tipe Obat : ");
        pilih = input.nextInt(); 
        
        switch (pilih){
            case 1:
                System.out.println("Jenis Kelamin Pasien");
                System.out.println("1. Pria");
                System.out.println("2. Wanita");
                System.out.print("Pilih Jenis Kelamin : ");
                jeniskelamin = input.nextInt();

                switch(jeniskelamin){
                    case 1:
                        System.out.print("Masukkan Umur Pasien : ");
                        umur = input.nextInt();
                        if(umur > 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan > 150){
                                System.out.println("Mendapatkan Obat Medication 1");
                            } else {
                                System.out.println("Tidak Mendapatkan Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapatkan Obat");
                        }
                    break;
                    case 2:
                        System.out.println("Masukkan Umur Pasien : ");
                        umur = input.nextInt();
                        if(umur < 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan < 150){
                                System.out.println("Mendapatkan Obat Medication 1");
                            } else {
                                System.out.println("Tidak Mendapatkan Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapatkan Obat");
                        }
                    default:
                        System.out.println("Tidak Sesuai Pilihan! Ulangi Kembali!");
                } break;
            case 2:
                System.out.println("Jenis Kelamin Pasien");
                System.out.println("1. Pria");
                System.out.print("Pilih Jenis Kelamin : ");
                jeniskelamin = input.nextInt();

                switch(jeniskelamin){
                    case 1:
                        System.out.print("Masukkan Umur Pasien : ");
                        umur = input.nextInt();
                        if((umur > 21) || (umur < 21)){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan > 150){
                                System.out.println("Mendapatkan Obat Medication 2");
                            } else {
                                System.out.println("Tidak Mendapatkan Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapatkan Obat");
                        }
                    break;
                    default:
                        System.out.println("Tidak Sesuai Pilihan! Ulangi Kembali!");
                } break;
            case 3:
                System.out.println("Jenis Kelamin Pasien");
                System.out.println("1. Pria");
                System.out.println("2. Wanita");
                System.out.print("Pilih Jenis Kelamin : ");
                jeniskelamin = input.nextInt();

                switch(jeniskelamin){
                    case 1:
                        System.out.print("Masukkan Umur Pasien : ");
                        umur = input.nextInt();
                        if(umur < 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan < 150){
                                System.out.println("Mendapatkan Obat Medication 3");
                            } else {
                                System.out.println("Tidak Mendapatkan Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapatkan Obat");
                        }
                    break;
                    case 2:
                        System.out.println("Masukkan Umur Pasien : ");
                        umur = input.nextInt();
                        if(umur < 21){
                            System.out.print("Masukkan Berat Badan : ");
                            beratbadan = input.nextInt();

                            if(beratbadan < 150){
                                System.out.println("Mendapatkan Obat Medication 3");
                            } else {
                                System.out.println("Tidak Mendapatkan Obat");
                            }
                        } else {
                            System.out.println("Tidak Mendapatkan Obat");
                        }
                    default:
                        System.out.println("Tidak Sesuai Pilihan! Ulangi Kembali!");
                } break;
            default:
                System.out.println("Dimohon Input Kembali Sesuai Format!");
        }
    }
}
