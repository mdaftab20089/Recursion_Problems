public class OneToNByBackTrack {

    static void fun(int i,int n){
        if(i<1) return;
        fun(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        fun(4,8);
    }
}
