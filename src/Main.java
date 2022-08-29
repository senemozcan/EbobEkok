import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayi : ");
        int a = inp.nextInt();
        System.out.print("ikinci Sayi : ");
        int b = inp.nextInt();
        int s, ebob=1, ekok=0;

        if (a<=b) s=b; else s=a;
        //System.out.print(a+" "+b+" "+s);
        for (int i=s; i>=1; i--){
            //System.out.print(a%i+" "+b%i);
            if((a%i==0) && (b%i==0)) {
                ebob=i;
                break;
            }
        }
        System.out.println(a+" ve "+b+" sayilarinin EBOB u : "+ebob);

        ekok = (a*b)/ebob;
        System.out.println(a+" ve "+b+" sayilarinin EKOK u : "+ekok);
    }
}