/**Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

 Senaryo
 Kaç tane sayı gireceksiniz: 4
 1. Sayıyı giriniz: 16
 2. Sayıyı giriniz: -22
 3. Sayıyı giriniz: -15
 4. Sayıyı giriniz: 100
 En büyük sayı: 100
 En küçük sayı: -22*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            System.out.print(i+". Sayıyı giriniz: ");
            int num = sc.nextInt();
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("En küçük sayı: "+ min);
        sc.close();
    }
}

