package TheObjectClass;

public class Main {
    
    public static void main(String[] args) {
        
        Student joe = new Student("Joe", 26);
        System.out.println(joe);

        PrimarySchoolStudent timmy = new PrimarySchoolStudent("Timmy", 6, "Billy Bob");
        System.out.println(timmy);
    }
}


class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        //return "Student [name=" + name + ", age=" + age + "]";
        return name + " is " + age;
    }

    // public String toString(){
    //     return super.toString();
    // }

    
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString(); 
    }

    
}