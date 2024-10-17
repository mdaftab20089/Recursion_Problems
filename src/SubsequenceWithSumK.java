import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSumK {

    public static void subsequence(int[] arr,int k,int i,int n,List<Integer> list){
        //List<List<Integer>> curr=new ArrayList<>();

        if(i==n){
            int sum=0;
            for(int j=0; j< list.size();j++){
                sum+= list.get(j);
            }
            if(sum==k) System.out.println(list);
            return;
        }
        list.add(arr[i]);
        subsequence(arr,k,i+1,n,list);
        list.remove(list.size()-1);
        subsequence(arr,k,i+1,n,list);

    }
    public static void main(String[] args) {
        int[] arr={3,1,2,1};
        subsequence(arr,2,0,arr.length,new ArrayList<>());
    }
}
