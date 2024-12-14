package Aggregation;

class student {
	private String name;

	public student(String name) {
		this.name = name;
	}

	public String getName(String name) {
		return name;
	}

	public student[] student;
}
class University {
    // Aggregation: University has Students, but Students can exist independently
    private student[] students;
    
    public University(student[] students) {
        this.students = students;
    }
    
    public void displayStudents() {
        for (student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Composition Demo
            //Car myCar = new Car();
            //myCar.drive();
            
            // Aggregation Demo
            student s1 = new student("Alice");
            student s2 = new student("Bob");
            student[] students = {s1, s2};
            
            University university = new University(students);
            university.displayStudents();
        }
    }
}