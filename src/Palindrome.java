public class Palindrome {
    static boolean checkPalindrome(String str){
        int n=str.length();
        if(n==0||n==1) return true;
        int l=0,r=n-1;
        while(l<=r){
            if(str.charAt(l)!= str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    static boolean recursiveCheck(String str,int l,int r){
        if(l>r) return false;
        if(str.charAt(l)!=str.charAt(r)) return true;
        return recursiveCheck(str,l+1,r-1);
    }
    static boolean fun(String s,int i){
        int n=s.length()-1;

        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return fun(s,i+1);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("f"));
        String str="aftab";
        System.out.println(fun(str,0));
    }
}
