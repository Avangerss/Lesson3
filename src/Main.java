public class Main {
    public static void main(String[] args) {

        double doni[] = {-1.0, 2.0,3.0};
        int count = 0;
        boolean check = false;
        int sum = 0;


        // 1,2,3 = 6 / 3

        for (double fors : doni) {
            if (fors < 0) {
                check = true;
            } else if (check) {
                sum+=fors;
                count++;
            }
        }
        double average = sum / count;
        System.out.println("Среднее арифметическое - " + average);
    }
}