

public class ReverseArray {

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void fun(int[] arr,int i,int n){
        if(i==n) return;
        System.out.print(" "+arr[i]);
        fun(arr,i+1,n);

    }
    static void reverse(int[] arr,int i,int n){
        if(i==n) return;
        reverse(arr,i+1,n);
        System.out.print(" "+arr[i]);
    }
    static void reverse2(int[] arr,int l,int r){
        if(l>=r) return;
        swap(arr[l],arr[r]);
        reverse2(arr,l+1,r-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse2(arr, 0,arr.length-1);
        for(int x:arr) System.out.print(" "+x);
    }
}
