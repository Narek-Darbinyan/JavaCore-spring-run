package training1;
import java.util.Scanner;
public class Funkcia {
    public static void main(String[] args) {
     func(3,4);
        readArray();
    }
    public static int [] readArray (){
        int [] array;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
            return arr;

    }
    public static void func (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        System.out.println(result);


    }
    }
