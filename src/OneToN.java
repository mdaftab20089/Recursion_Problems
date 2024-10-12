public class OneToN {
    static int i=1;
    static void fun2(int n){
        if(i==n+1) return;
        System.out.println(i);
        i++;
        fun2(n);
    }

    public static void main(String[] args) {
        fun2(5);
    }
}
