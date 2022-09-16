import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,nr,sonuc;
        int totaln = 1;
        int totalr = 1;
        int totalnr = 1;
        int i = 1 ;
        System.out.print("Küme için eleman sayısı giriniz : ");
        n = input.nextInt();
        System.out.print("Kombinasyon parametresi giriniz : ");
        r = input.nextInt();

        while (i<=n){
            totaln *= i;
            i++;
        }
         i = 1;
        while (i<=r){
            totalr *= i;
            i++;
        }
         i = 1;
         nr = n-r;
        while (i<=nr){
            totalnr *= i;
            i++;
        }
        sonuc = totaln / (totalr*totalnr);
        System.out.println("Kombinasyon sonucu :");
        System.out.println(sonuc);
    }
}
