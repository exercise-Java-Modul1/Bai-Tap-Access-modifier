package xaydunglopcousre;

public class Course {
    private String name;
    private String[] students = new String[100];
    private int studentsCount = 0;

    public String getName() {
        return name;
    }

    public String[] getCourses() {
        return students;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public Course() {

    }

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(String name) {
        students[studentsCount] = name;
        studentsCount++;
    }

    public void dropStudent(String name) {
        int dem = 1;
        for (int i = 0; i < studentsCount; i++) {
            if (name.equalsIgnoreCase(students[i])) {
                for (int j = 0; j < i; j++) {
                    students[j] = students[j];
                }
                for (int k = i; k < studentsCount; k++) {
                    students[k] = students[k + 1];
                }
                studentsCount--;
                dem++;
            }
        }
        System.out.println("Sinh viên còn lại trong danh sách là " + studentsCount + " gồm:");
        for (int i = 0; i < studentsCount; i++) {
            System.out.println(students[i]);
        }
        if (dem == 1) {
            System.out.println("Sinh viên có tên là " + name + " không tồn tại trong danh sách.");
        }
    }
    public void Clear() {
        int soluong = studentsCount;
        for (int i = 0; i < soluong; i++) {
            students[i] = null;
            studentsCount--;
        }
    }
}
