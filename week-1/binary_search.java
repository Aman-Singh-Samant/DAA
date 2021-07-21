import java.util.Scanner;

public class binary_search {
    static int x;
    static int binary_search(int arr[],int low,int high,int k){
        int flag=0,mid = (low+high)/2;
        //System.out.println("ppp"+x);
        x++;
        if(arr[mid]==k){
            return 1;
        }
        else if(low>=high){
            return 0;
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
            x=0;
            int flag = binary_search(arr,0,n-1,k);

            if(flag==1){
                System.out.println("Present "+x);
            }
            else System.out.println("Not Present "+x);
            test--;
        }
    }
}
