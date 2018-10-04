public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n){
        int result = 0;
        for(int i=0; i<32; i++){
            result <<= 1;
            result += n & 1;//n%2 maybe -1, use bitwise operator
            n >>>= 1;  //unsigned shift, shift all bits
        }
        return result;
    }
}

// public int reverseBits(int n) {
//     int result = 0;
//     for (int i = 0; i < 32; i++) {
//         result += n & 1;
//         n >>>= 1;   // CATCH: must do unsigned shift
//         if (i < 31) // CATCH: for last digit, don't shift!
//             result <<= 1;
//     }
//     return result;
// }