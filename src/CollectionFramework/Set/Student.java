package CollectionFramework.Set;

public class Student {

    private String name;
    private Integer age;
    private Integer id;

    public Student(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        Student stu = new Student("Bhushan",25,1);
        System.out.println(stu);
        stu.getAge();
        stu.getName();
        stu.getId();


    }
}