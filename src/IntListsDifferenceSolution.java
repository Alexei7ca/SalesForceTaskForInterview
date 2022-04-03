import java.util.*;

public class IntListsDifferenceSolution {
    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 3, 3, 4, 6, 5, 4);
        List<Integer> second = Arrays.asList(6, 3, 5, 2, 2);


        List<Integer> difference = first.stream()
                .filter(aObject -> ! second.contains(aObject)).toList();

        List<Integer> difference2 = second.stream()
                .filter(aObject -> !first.contains(aObject)).toList();

        List<Integer> allDiffs = new ArrayList<>();
        allDiffs.addAll(difference);
        allDiffs.addAll(difference2);

        Set<Integer> result = new HashSet<>(allDiffs);
        System.out.println(result);




        //main task
        //Implement a logic that finds difference between "first" and "secord" lists
        // and prints the result to the console:
        // [1, 2, 4]
        //enhanced task
        //** try to come up with solution wich doesn't use set data structure
    }
}
