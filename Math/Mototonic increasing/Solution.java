// https://leetcode.com/problems/monotone-increasing-digits/

class Solution {
    static boolean isMonotone(int n){
        int b = Integer.MAX_VALUE;
        int a = 0;
        while(n > 0){
            a = n%10;  //current
            if(a>b){
                return false;
            }
            b = a;
            n = n/10;
        }      
        return true;
    }
    public static int monotoneIncreasingDigits(int n) {
        int decreased = n;
        int i = 10;
        while(!isMonotone(decreased)){
            decreased = n - (n%i + 1 ); // +1 to obatain 9
            i = i *10;
        }
        return decreased;
    }
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(33221));
    }
}

