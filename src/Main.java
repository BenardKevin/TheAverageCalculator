import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] students = {{14, 14, 14, 14}, {5, 7, 10, 13}, {10, 20, 13, 18}};
        ArrayList<Double> avgList = new ArrayList<>();

        for (int[] student : students) getAvgStudent(student, avgList);
        System.out.println("Average of each student: " + avgList);

        double avg = getAvgClass(avgList);
        System.out.println("Class average: " + avg);
    }

    private static void getAvgStudent(int[] student, ArrayList<Double> avgList) {
        int sum = 0;
        for (int k : student) sum += k;
        double avg = ((double) sum) / student.length;
        avgList.add(avg);
    }

    private static double getAvgClass(ArrayList<Double> avgList) {
        int sum = 0;
        int size = avgList.size();
        for (Double aDouble : avgList) sum += aDouble;
        return ((double) sum) / size;
    }

}
