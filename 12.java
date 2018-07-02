class Solution {
    public String intToRoman(int num) {
        String[][] R = {
            {"","I","II","III","IV","V","VI","VII","VIII","IX"},
            {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
            {"","M","MM","MMM"},
        };
        //faster for sole thread
        StringBuilder result = new StringBuilder();
        int[] k = new int[4];
        k[0] = num%10/1;
        k[1] = num%100/10;
        k[2] = num%1000/100;
        k[3] = num%10000/1000;
        for(int i=3; i>-1;i--){
            result.append(R[i][k[i]]);
        }
        return result.toString();
    }
}