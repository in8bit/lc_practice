public class BiValued {
    public static void main(String[] args) {
        System.out.println(new BiValued().getLongestSlice(new int[]{0,5,4,4,5,12}));
    }

    public int getLongestSlice(int[] A) {
        int previous = -1;
        int previous2 = -1;
        int ans = 0;
        int tempCount = 0;
        int repeatCounter = 0;

        for (int current : A) {
            if (current == previous || current == previous2) {
                tempCount ++;
            } else {
                // if the current number is not in our read list it means new series has started, tempCounter value in this case will be
                // how many times previous number repeated before this new number encountered + 1 for current number.
                tempCount = repeatCounter + 1;
            }

            if (current == previous) {
                repeatCounter++;
            } else {
                repeatCounter = 1;

                previous2 = previous;
                previous = current;
            }

            ans = Math.max(tempCount, ans);
        }
        return ans;
    }
}
