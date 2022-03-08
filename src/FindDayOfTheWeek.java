public class FindDayOfTheWeek {
    private int daysOfWeekCount = 7;
    private String[] daysOfWeek = new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

    public static void main(String[] args) {

        FindDayOfTheWeek findDayOfTheWeek = new FindDayOfTheWeek();

        System.out.println(findDayOfTheWeek.solution("Wed", 5)); // Mon
        System.out.println(findDayOfTheWeek.solution("Sun", 0)); // Sun
        System.out.println(findDayOfTheWeek.solution("Tue", 28)); // Tue
    }

    public String solution(String S, int K) {

        // find index of S
        int indexOfS = getIndexForDay(S, daysOfWeek);

        // apply module over K to get the offset
        int indexForSPlusK = (indexOfS + K) % daysOfWeekCount;

        return daysOfWeek[indexForSPlusK];
    }

    private int getIndexForDay(String S, String[] daysOfWeek) {
        for (int i=0, c=daysOfWeek.length; i < c; ++i) {
            if (daysOfWeek[i].equals(S)) {
                return i;
            }
        }
        return 0;
    }
}
