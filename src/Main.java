import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int risultato= moltiplicazione(3,6);
        System.out.println(risultato);
        String Concatenata=concatena("Epicode",4);
        System.out.println(Concatenata);
        String[] arr={"taylor","short","n","sweet","coicidence"};
        String[] newarr=inserisci(arr,"Carpenter");
        System.out.println(Arrays.toString(newarr));



        //esercizio 2
        Scanner scanner=new Scanner(System.in);
        System.out.println("primo");
        String str1=scanner.nextLine();
        System.out.println("secondo");
        String str2=scanner.nextLine();
        System.out.println("terzo");
        String str3=scanner.nextLine();
        String unite= (str1+str2+str3);
        System.out.println(unite);
        String inverso= (str3+str2+str1);
        System.out.println(inverso);
        scanner.close();

        //esercizio 3
        int perimetro=perimetrorett(2,4);
        System.out.println(perimetro);
        int paridispari=numInt(3);
        System.out.println(paridispari);

        int semiperi=semiperimetro(2,4,4);
        System.out.println(semiperi);
        double areaTotale=areaTri(semiperi,2,3,4);
        System.out.println(areaTotale);

    }

//esercizio 1
    public static  int moltiplicazione(int a, int b){
    return  a*b;}
    public static String concatena (String frase, int c){return frase+c;}
    public static String[] inserisci (String[] arr, String mid){
        String[] newarr= new String[6];
        newarr[0]=arr[0];
        newarr[1]=arr[1];
        newarr[2]=mid;
        newarr[3]=arr[3];
        newarr[4]=arr[2];
        newarr[5]=arr[4];
        return newarr;
    }
//esercizio 3
    public static int perimetrorett(int base, int altezza){return base+base+altezza+altezza;}
    public static int numInt (int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int semiperimetro(int A,int B,int C){return (A+B+C)/2;}
    public static double areaTri (int semiperi,int A,int B, int C){ return Math.sqrt(semiperi * (semiperi - A) * (semiperi - B) * (semiperi - C));}
}