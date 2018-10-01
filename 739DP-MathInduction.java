class Solution {
//MATH INDUCTION - MED
//     public int[] dailyTemperatures(int[] temperatures){
//         Stack<Integer> unresolvedIndex = new Stack<>();
//         int[] result = new int[temperatures.length];
        
//         for(int i=0; i<temperatures.length; i++){
//             while(!unresolvedIndex.isEmpty() && temperatures[unresolvedIndex.peek()] < temperatures[i]){
//                 result[unresolvedIndex.peek()] = i - unresolvedIndex.pop();
//             }
//             unresolvedIndex.push(i);
//         }
//         return result;
//     }
    
//ITERATION -SLOW
//     public int[] dailyTemperatures(int[] temperatures) {
//         int[] result = new int[temperatures.length];
        
//         for(int i=0; i<temperatures.length-1; i++){
//             for(int j=i+1; j<temperatures.length; j++){
//                 if(temperatures[j] > temperatures[i]){
//                     result[i] = j-i;
//                     break;
//                 }        
//             }
//         }
//         return result;
//     }
// }