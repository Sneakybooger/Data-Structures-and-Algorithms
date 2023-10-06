class Calculate extends Grades {

    @Override
    void GetAverage() {
        double sum = 0;
        double ave = 0;

        for (double grade : StudentGrades) {
            sum += grade;
        }
        ave = sum / StudentGrades.length;
        System.out.printf("Your Average is: %.2f%n", ave);
    }

    @Override
    void GetMaxVal() {
        double max = StudentGrades[0];

        for (double val : StudentGrades) {
            if (max < val) {
                max = val;
            }
        }
        System.out.printf("Your Highest Grade is: %.2f%n", max);
    }

    @Override
    void GetMinVal() {
        double low = StudentGrades[0];

        for (double val : StudentGrades) {
            if (low > val) {
                low = val;
            }
        }
        System.out.printf("Your Lowest Grade is: %.2f%n", low);

    }
}