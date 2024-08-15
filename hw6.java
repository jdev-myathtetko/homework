public class hw6 {
    public static void main(String[] args) {
        student abc = new student("abc", 17, "XYZ123");
        System.out.println(abc.name);
        System.out.println(abc.age);
        System.out.println(abc.id);
    }
}

class student {
    String name;
    int age;
    String id;

    public student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
