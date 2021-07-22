package week2;
import java.util.Scanner;

public class q1{
    static int binary_search(int arr[],int low,int high,int k){
        int flag=-1,mid = (low+high)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(low>=high){
            return -1;
        }
        else if(arr[mid]<k){
            flag = binary_search(arr,mid+1,high,k);
        }
        else{
            flag = binary_search(arr,low,mid-1,k);
        }
        return flag;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int flag = binary_search(arr,0,n-1,k);
            int count=0;
            if(flag!=-1){
                for(int i=flag;i>(-1)&&arr[i]==k;i--)count++;
                for(int i=flag;i<n&&arr[i]==k;i++)count++;
                count--;
                System.out.println(k+" - "+count);
            }
            else System.out.println("Key Not Present ");
            test--;
        }
    }
}
