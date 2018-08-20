//recursion version
class Solution {
    public String countAndSay(int n) {
        String res = recursion(n);
        return res;
    }
    public String recursion(int n){
        if(n==1){
            return "1";
        }
        String str = recursion(n-1);
        StringBuilder ret = new StringBuilder();
        Character c = str.charAt(0);
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                count++;
            }else{
                ret.append(count).append(c);
                c = str.charAt(i);
                count = 1;
            }
        }
        ret.append(count).append(c);
        return ret.toString();
    }
}

//iteration/stack version
//  public class Solution {
//     public String countAndSay(int n) {
//         String s = "1";
//         for(int i = 1; i < n; i++){
//             s = countIdx(s);
//         }
//         return s;
//     }
    
//     public String countIdx(String s){
//         StringBuilder sb = new StringBuilder();
//         char c = s.charAt(0);
//         int count = 1;
//         for(int i = 1; i < s.length(); i++){
//             if(s.charAt(i) == c){
//                 count++;
//             }
//             else
//             {
//                 sb.append(count);
//                 sb.append(c);
//                 c = s.charAt(i);
//                 count = 1;
//             }
//         }
//         sb.append(count);
//         sb.append(c);
//         return sb.toString();
//     }
// }