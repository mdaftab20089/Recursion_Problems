public class NameFive {
    static int count=0;
    public static void fun1(){
//        int count=0;
        if(count==5) return;
        System.out.printf("Aftab \t");
        count++;
        fun1();
    }

    public static void main(String[] args) {
        fun1();
    }
}
