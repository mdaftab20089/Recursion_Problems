public class Merge_Sort {
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void Merge(int arr[],int low,int high){
        int mid=low+(high-low)/2;
        if(low>high) return;
        if(arr[low]>arr[mid]) {
            swap(arr[low],arr[mid]);
            Merge(arr,low+1,mid);
        }
    }

    public static void main(String[] args) {

    }
}
