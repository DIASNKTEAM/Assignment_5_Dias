package Second;

public class Student {

    private String name;
    private  int age;


    Student (String name, int age){}


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
