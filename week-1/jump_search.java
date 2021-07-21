import java.util.Scanner;

public class jump_search {
    static int x;
    static int jump_search(int arr[],int n,int k){
        int block=(int) Math.sqrt(n);
        int i,j;
        for(i=block;i<n;i+=block){
            x++;
            if(arr[i]==k) return 1;
            else if(arr[i]>k)break;
        }
        i=i-block;
        for(j=0;j<block&&i+j<n;j++){
            x++;
            if(k==arr[i+j]) return 1;
        }
        return 0;
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
            int flag = jump_search(arr,n,k);

            if(flag==1){
                System.out.println("Present "+x);
            }
            else System.out.println("Not Present "+x);
            test--;
        }
    }
}
