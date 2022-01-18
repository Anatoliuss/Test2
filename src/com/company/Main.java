package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        String [] a= new String[n];
        int b = 0;
        int c = 0;
        for (int i = 0; i<n; i++){
            if (s[i]=="0"){
                b+=1;

            } else{
                a[c]=s[i];
                c++;
            }
        }
        for (int i = b; i<n; i++){
            a[i]="0";
        }

        System.out.println(Arrays.toString(a));


    }
}
