import model.Student;

public class classAndObject {
    public static void main(String[] args) {
        Student student = new Student();
        Student studentA = new Student("Ok Day", 19, "Female", "G9777979(2)");
        student.setName("Mama Day");
        student.setGender("Male");
        student.setAge(12);
        student.setIdNum("S12314554(3)");
        System.out.println(student.toString());
        System.out.println(studentA.toString());
    }
}
