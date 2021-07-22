package week2;

import java.util.Scanner;

public class q2 {
    public static void find(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]==arr[k]){
                        System.out.println((i+1)+", "+(j+1)+", "+(k+1));
                        return;
                    }
                }
            }
        }
        System.out.println("No Sequence Found");
        return;
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
            find(arr,n);
            test--;
        }
    }
}
