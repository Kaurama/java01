package day22;

public class student {
    String name = "Bayu";
    int age = 0;

    public void introduce(){
        System.out.println("Hii.. my name is " + name);
    }
}

class Studentmain{
    public static void main(String[] args) {
        student student1 = new student();
        student student2 = new student();
        student1.introduce();
        student2.name = "Pandu";
        student1.introduce();
        student2.introduce();
    }
}