import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(80);
        inputList.add(20);
        inputList.add(1);
        inputList.add(80);

        List<Integer> answerList = removeDuplicates(inputList);
        for(Integer i : answerList){
            System.out.println(i);
        }
    }
    public static List<Integer> removeDuplicates(List<Integer> inputList){
        List<Integer> answerList = new ArrayList<>();
//        Set<Integer> set = new HashSet<Integer>(inputList);
//        answerList.addAll(set);
//        LinkedHashSet<Integer> set = new LinkedHashSet<>(inputList);
//        answerList.addAll(set); // maintain order of insertion
        SortedSet<Integer> set = new TreeSet<>(inputList);
        answerList.addAll(set);
        
        return answerList;
    }

}
