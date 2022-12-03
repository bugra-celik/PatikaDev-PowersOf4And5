import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i=1,n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        n = scan.nextInt();
       for(i=1;i<2;i ++) {
          for(i=1;i<n;i*=5) {
               System.out.println(i);
           }
           for(i=1;i<n;i *=4){
               System.out.println(i);
           }


        }



    }
}
