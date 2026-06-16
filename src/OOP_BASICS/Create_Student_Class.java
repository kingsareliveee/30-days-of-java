package OOP_BASICS;
class Student{
    String name;
    int age;
    int RollNo;
}
public class Create_Student_Class {

    public static void main(String[] args){
        Student create = new Student();
        create.name ="divyansh";
        create.age =19;
        create.RollNo=10;
        System.out.println(create.name);
        System.out.println(create.age);
        System.out.println(create.RollNo);

    }
}
