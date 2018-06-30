package xaydunglopcousre;

public class MainCourse {
    public static void main(String[] args) {
        Course course = new Course();
        course.addStudent("a");
        course.addStudent("b");
        course.addStudent("c");
        course.addStudent("d");
        course.addStudent("e");
        course.addStudent("f");
        course.addStudent("g");
        course.addStudent("h");
        course.addStudent("j");
        System.out.println("Hiện có " + course.getStudentsCount() + " Sinh viên trong danh sách");
        course.dropStudent("c");
        course.Clear();
        System.out.println("Hiện có " + course.getStudentsCount() + " Sinh viên trong danh sách");
    }
}
