package BotanicaDuminica1.Lectia9;

public class Main {
    static void main() {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 8;
        int poz = 1;

        for(int i = poz; i < n-1; i++){
            a[i] = a[i+1];
        }
        n--;

        for(int i=0; i<n; i++){
            System.out.println("a["+i+"]=" + a[i]);
        }


        int [] arr = new int[10];

        arr[0] = 19;
        arr[1] = 22;
        arr[2] = 44;
        arr[3] = 88;
        arr[4] = 176;

        n = 5;
        poz = 2;
        int val = 11;

        for(int i = n; i > poz; i--){
            arr[i] = arr[i-1];
        }
        arr[poz] = val;
        n++;

        for(int i=0; i<n; i++){
            System.out.println("arr["+i+"]=" + arr[i]);
        }



        int[] x = {1, 2, 3, 4, 5, 6, 1, 2, 3, 3, 2, 1};
        int[] freq = new int [100];

        for(int i =0; i<x.length; i++){
            freq[x[i]]++;
        }

        for(int i=0; i<100; i++){
            if(freq[i]!=0){
                System.out.println("Elementul " + i + " este intalnit de " + freq[i] + "ori");
            }
        }



    }
}
