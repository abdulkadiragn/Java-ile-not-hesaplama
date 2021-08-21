
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("1.Vize notunuzu giriniz:");
        int vize1 = a.nextInt();
        System.out.println("2.Vize notunuzu giriniz:");
        int vize2 = a.nextInt();
        System.out.println("Final notunuzu giriniz:");
        int finalNot = a.nextInt();
       
        double toplamNot = (vize1 * 0.3) + (vize * 0.3) + (finalNot * 0.4);
        
        if(toplamNot >= 90){
            System.out.println("A aldınız tebrikler");
        }
        else if(toplamNot >= 85){
            System.out.println("B+ aldınız tebrikler");
        }
        else if(toplamNot >= 80){
            System.out.println("B aldınız tebrikler");
        }
        else if(toplamNot >= 75){
            System.out.println("C+ aldınız tebrikler");
        }
        else if(toplamNot >= 70){
            System.out.println("C aldınız tebrikler");
        }
        else if(toplamNot >= 65){
            System.out.println("C- aldınız tebrikler");
        }
        else if(toplamNot >= 60){
            System.out.println("D+ aldınız tebrikler");
        }
        else if(toplamNot >= 55){
            System.out.println("D aldınız tebrikler");
        }
        else if(toplamNot >= 50){
            System.out.println("D- aldınız tebrikler");
        }
        else{
            System.out.println("dersten kaldınız");
        }
    }
}
