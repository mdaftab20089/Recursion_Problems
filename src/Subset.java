import java.util.*;

public class Subset {

    static List<List<Integer>> subset(int[] arr,int n){
        List<List<Integer>> ans=new ArrayList<>();
        // total no of subset;
        int count=1<<n;
        for(int i=0; i<count; i++){
            List<Integer> curr=new ArrayList<>();
            for(int j=0; j<n; j++){
                if((i&(1<<j))!=0) curr.add(arr[j]);
            }
            ans.add(curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,6,6,5,6,5};
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        ans=subset(arr, arr.length);
        Set<List<Integer>> hs=new HashSet<>();
        for(List<Integer> x:ans){
            hs.add(x);
        }
        for(List<Integer> x:hs){
            System.out.println(x);
        }
    }
}
