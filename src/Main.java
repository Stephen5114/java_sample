

public class Main {
    public static void main(String[] args) {
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("zhangsan",'m',100);
        allStudents[1] = new Student("lisi",'w',90);
        allStudents[2] = new Student("wangwu",'m',80);
        allStudents[3] = new Student("zhaoliu0",'w',70);
        allStudents[4] = new Student("zhaoliu1",'w',60);
        allStudents[5] = new Student("zhaoliu2",'w',55);
        allStudents[6] = new Student("zhaoliu3",'w',45);
        allStudents[7] = new Student("zhaoliu4",'w',33);
        allStudents[8] = new Student("zhaoliu5",'w',23);
        allStudents[9] = new Student("zhaoliu6",'w',22);

        ClassDataInter cdi = new ClassDatainterImpl1(allStudents);
        cdi.printAllStudentsinfo();
        cdi.printAverageScores();

    }
}