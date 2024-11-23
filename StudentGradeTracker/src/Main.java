import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int numSub = sc.nextInt();
        int allmarks[] = new int[numSub];
        if(numSub <= 0){
            System.out.println("Please enter a valid number of the subject");
            return;
        }

        int totalmarks =0;
        int maxmarkpersub = 100;
        for(int i=1; i<=numSub;i++){
            System.out.print("Enter marks in subject "+i);
            int marks = sc.nextInt();
                allmarks[i-1] = marks;
            if(marks <0 || marks > maxmarkpersub){
                System.out.println("Marks should be in the range of0 to 100. Please enter valid marks");
                i--;
            }else{
                totalmarks += marks;
            }
        }

        Double avgPercentage = (double)totalmarks / (numSub * maxmarkpersub)*100;
        avgPercentage = (double) Math.round(avgPercentage);
        System.out.println("Total Marks :"+totalmarks);
        System.out.println("Average Percentage : "+ avgPercentage+"%");
        String grade;
        if(avgPercentage >= 90){
            grade = "A+";
        }else if(avgPercentage >= 80){
            grade = "A";
        }else if(avgPercentage >= 70){
            grade = "B";
        }else if(avgPercentage >= 60){
            grade = "C";
        }else if(avgPercentage >= 50){
            grade = "D";
        }else {
            grade = "F";
        }
        System.out.println("Grade: "+grade);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < allmarks.length; i++) {
            System.out.print(allmarks[i] + " ");
            if (max < allmarks[i]) {
                max = allmarks[i];
            }
            if (min > allmarks[i]) {
                min = allmarks[i];
            }
        }
        System.out.println("\nHighest Marks :"+max);
        System.out.println("Lowest marks: "+min);
    }
}