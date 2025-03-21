public class ClassDatainterImpl1 implements ClassDataInter{
    private final Student[] students;
    public ClassDatainterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentsinfo() {
        System.out.println("Students Info");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
    }
    @Override
    public void printAverageScores() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("Average Score: " + sum / students.length);
    }
}
