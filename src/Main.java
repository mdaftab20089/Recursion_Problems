public class Main {

    static void fun2(int i,int n){
        if(i>n) return;
        System.out.println(i);
        fun2(i+1,n);
    }
    static void fun3(int n){
        if(n==0) return;
        System.out.println(n);
        fun3(n-1);
    }
    public static void main(String[] args) {
        fun3(6);
    }
}
