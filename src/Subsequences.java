import java.util.*;

public class Subsequences {

    public static void subsequence(int i, int arr[], int n, List<Integer> list){
        if(i==n) {
            System.out.println(list);
            return;
        }
        // pick or not pick condition.
        list.add(arr[i]);
        subsequence(i+1,arr,n,list);
        // delete the last added element from the list as we don't want to choose it.
        list.remove(list.size()-1);
        subsequence(i+1,arr,n,list);
    }
    public static void main(String[] args) {
    int[] arr={1,2,3,4};
    subsequence(0,arr, arr.length, new ArrayList<>());
    }
}
