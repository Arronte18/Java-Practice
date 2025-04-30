package POJO;

public class Main {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                                    switch(i){
                                        case 1 -> "Mary";
                                        case 2 -> "Josh";
                                        case 3 -> "Anthony";
                                        case 4 -> "Arthur";
                                        case 5 -> "Gwen";
                                        default -> "Anon";
                                    },
                                    "05/11/1985",
                                    "Java Masterclass");
            System.out.println(s);
        }
        
        Student pojoStudent = new Student("S923006", "Anna", "05/11/1985", "JavaMasterClass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Billy", "05/11/1985", "JavaMasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

        
    }
}
