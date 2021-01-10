package TaskOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlgoritmSort {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input size array: ");
        int n = Integer.parseInt(in.readLine());
        int[] mass = new int[n];

        System.out.println("Input array: ");
        for(int i = 0; i < n; i++){
            mass[i] = Integer.parseInt(in.readLine());
        }
        System.out.println("Before Sorting : "+ Arrays.toString(mass));
        sort(mass);
        System.out.println("After Sorting : "+ Arrays.toString(mass));
    }

    public static void sort(int... mass){
        int tmp = mass[0];
        for(int i = 0; i < mass.length; i++){
            for(int j = i+1; j < mass.length; j++){
                if(mass[j] < mass[i]){
                    tmp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = tmp;
                }
            }
        }
    }
}
