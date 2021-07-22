package week2;

import java.util.Scanner;
import java.lang.Math;
public class q3 {
    public static void find(int arr[],int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]-arr[j])==k) count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            find(arr,n,k);
            test--;
        }
    }
}
