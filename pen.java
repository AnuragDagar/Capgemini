public class pen {
    public static void main(String[] args) {
        int totalPens = 14, students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d\n\n",
                          pensPerStudent, remainingPens);
    }
}
