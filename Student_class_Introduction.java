class Student {
    int id ;
    String name ; 

    Student(){}
    Student(int a , String b)
    {
        id = a;
        name = b;
    }
};

public class Student_class_Introduction {

    public static void main(String[] args) {
        Student object = new Student(14554, "Lovish");

        System.out.println(object.id);
        System.out.println(object.name);
    }
}
