public class MaxValueByDeletingDigit {
    public static void main(String[] args) {
        int ans = solution(15958);
        System.out.println(ans);
    }
    public static int solution(int N){
        int maxValue = Integer.MIN_VALUE;
        String str = Integer.toString(N);


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='5') {
                String str2 = str.substring(0, i) + str.substring(i + 1);
                int subAns = Integer.parseInt(str2);
                if(subAns> maxValue){
                    maxValue = subAns;
                }else{
                    maxValue = maxValue;
                }
                // maxValue = subAns > maxValue ? subAns : maxValue;
            }
        }

        return maxValue;
    }
}
