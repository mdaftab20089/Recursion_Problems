public class NtoOne {

    public static void fun3(int n){
        if(n==0) return;
        System.out.println(n);
        n--;
        fun3(n);
    }
    public static void main(String[] args) {
        fun3(6);
    }
}
