package idea.project.Task4.Task4.Task4.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class  ArrayListScoreAnalysisandManagementSystem {
    public static void main() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(40);
        scores.add(80);
        scores.add(90);
        scores.add(80);
        scores.add(70);
        scores.add(89);
        scores.add(95);
        scores.add(79);
        scores.add(99);
        scores.add(98);
        scores.add(95);
        scores.add(94);
        scores.add(98);
        scores.add(94);
        scores.add(99);
        System.out.println("Total: "+ scores.size());
        for (int i=0; i< scores.size(); i++ ){
            System.out.println("Score" + i + ": " + scores.get(i));
        }
        int total=0;
        for (int score : scores){
            total += score;
        }
        System.out.println("Total score: "+ total);
        double average = (double) total/scores.size();
        System.out.println("Average:  "+ average);
        int high = scores.get(0);
        for (int number : scores){
            if (number> high){
                high=number;
            }
        }
        System.out.println("Highest Score: "+ high);
        int low =scores.get(0);
        for (int number: scores){
            if(number< low){
                low = number;
            }
        }
        System.out.println("Lowest Score: "+ low);
        int passed = 0;
        int failed = 0;
        int excellent = 0;
        int lowGrades = 0;
        for(int score : scores){
            if (score >= 60){
                passed++;
            }else{
                failed++;
            }
            if (score >= 90){
                excellent++;
            }
            if (score < 50){
                lowGrades++;
            }
        }
        System.out.println("Passed: "+ passed);
        System.out.println("Failed: "+ failed);
        System.out.println("Excellent: "+ excellent);
        System.out.println("Low Grades: "+ lowGrades);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score: ");
        int target = scanner.nextInt();

        boolean found = false;
        int firstIndex = -1;
        int occurrences = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == target) {
                if (!found) {
                    firstIndex = i;
                }
                found = true;
                occurrences++;
            }
        }
        if (found) {
            System.out.println("Score found.");
            System.out.println("First Position: " + firstIndex);
            System.out.println("Occurrences: " + occurrences);
        } else {
            System.out.println("Score not found.");
        }
        System.out.print("Enter index : ");
        int updatedIndex = scanner.nextInt();
        if(updatedIndex>=0 && updatedIndex< scores.size()){
            System.out.print("Enter new score: ");
            int newValue =scanner.nextInt();
            scores.set(updatedIndex,newValue);
            System.out.println("Updated List: \n"+ scores);
        }else{
            System.out.println("Invalid index");
        }
        System.out.println("Before: " + scores);
        System.out.print("Enter Score to remove: ");
        Integer score = scanner.nextInt();
        if (scores.remove(score)) {
            System.out.println("After removing " + score + ": " + scores);
        } else {
            System.out.println("score not found.");
        }
        System.out.print("\nEnter index to remove: ");
        int indexof = scanner.nextInt();
        if (indexof >= 0 && indexof < scores.size()) {
            int removed = scores.remove(indexof);
            System.out.println("After removing " + removed + ": " + scores);
        } else {
            System.out.println("Invalid index.");
        }
        ArrayList<Integer> AscendSortedScores = new ArrayList<>(scores);
        ArrayList<Integer> DescendSortedScores = new ArrayList<>(scores);
        Collections.sort(AscendSortedScores);
        Collections.sort(scores, Collections.reverseOrder());
        System.out.println("Original List: " + scores);
        System.out.println("Ascending: " +AscendSortedScores);
        System.out.println("Descending:  "+DescendSortedScores);
        scores.clear();
        System.out.println("After Clear: " + scores);
        System.out.println("Is Empty: " + scores.isEmpty());

        scanner.close();
    }
}