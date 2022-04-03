package Giris;
import java.util.Scanner;
public class OdevCinzodyagı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dogumyılı;
        System.out.print("dogum yilinizi giriniz: ");
        dogumyılı=input.nextInt();
        int kalan= (dogumyılı%12);
        switch (kalan) {
            case 0:
                System.out.println("cin zodyagi burcunuz : maymun");
                break;
            case 1:
                System.out.println("cin zodyagi burcunuz : horoz");
                break;
            case 2:
                System.out.println("cin zodyagi burcunuz : köpek");
                break;
            case 3:
                System.out.println("cin zodyagi burcunuz : domuz");
                break;
            case 4:
                System.out.println("cin zodyagi burcunuz : fare");
                break;
            case 5:
                System.out.println("cin zodyagi burcunuz : öküz");
                break;
            case 6:
                System.out.println("cin zodyagi burcunuz : kaplan");
                break;
            case 7:
                System.out.println("cin zodyagi burcunuz : tavsan");
            case 8:
                System.out.println("cin zodyagi burcunuz : ejderha");
                break;
            case 9:
                System.out.println("cin zodyagi burcunuz : yılan");
                break;
            case 10:
                System.out.println("cin zodyagi burcunuz : at");
                break;
            case 11:
                System.out.println("cin zodyagi burcunuz : koyun");
            default:
        }
    }

    }


