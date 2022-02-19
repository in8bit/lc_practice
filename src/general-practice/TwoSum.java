
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] input = {3,2,3};
        int target = 6;
        int[] ans = twoSum(input, target);
        System.out.println(ans[0] +" "+ ans[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> inputMap = new HashMap<Integer, Integer>(); //key = compliment, value = the index of compliment's compliment

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int compliment = target - curr;

            if(inputMap.size() ==0 || !inputMap.containsKey(compliment)){
                inputMap.put(curr, i); // first interation -> add the element as key and its index as the value
            }else{
                result[0] = i;
                result[1] = inputMap.get(compliment);
            }
        }
        return result;
    }
}