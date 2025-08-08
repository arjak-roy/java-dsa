import java.util.Stack;
import java.util.Scanner;
class Solution {
    public String reverseWords(String s) {
        // Code here
        int i = 0; 
        int j = 0;
        Stack<String> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char a : s.toCharArray()){
            if (a == '.' && i == j){
                i++;
                j++;
            }
            else if (a != '.'){
                j++;
            }
            else if (a == '.'){
                stk.push(s.substring(i,j));
                i = j+1;
                j++;
                
            }
            
        }
        if(s.charAt(j-1) !='.'){
                stk.push(s.substring(i,j));
        }
        while(!stk.empty()){
            ans.append(stk.pop());
            if(!stk.empty()) ans.append(".");
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(obj.reverseWords(s));
    }
}
