public class SumOfN {

    static int fun(int i,int n){
        if(i==n) return n;
        return i+fun(i+1,n);
    }
    static int fun2(int n){
        if(n==0) return 0;
        return n+fun2(n-1);
    }
    static void fun3(int n,int sum){
        if(n<1) {
            System.out.println(sum);
            return;
        }
        fun3(n-1,sum+n);
    }
    static int Fact(int n){
        if(n==1) return 1;
        return n*Fact(n-1);
    }

    public static void main(String[] args) {
//        System.out.println(fun(1,5));
//        System.out.println(fun2(5));
//        fun3(5,0);
        System.out.println(Fact(6));
    }
}
