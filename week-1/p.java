import java.util.*;
public class p{
    static void linear_search(int arr[],int n,int k){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==k) {
                System.out.println("Present "+(i+1));
                return;
            }
        }
        System.out.println("Not Present "+(i));
        return;
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
            linear_search(arr,n,k);
            test--;
        }
    }
}
