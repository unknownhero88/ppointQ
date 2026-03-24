package Simple_Student_Class;

class Student {
    String name;
    int rollNo, marks;

    Student(String name, int rollNo, int marks) {
        // TODO: assign to this.name, this.rollNo, this.marks
    	this.name = name;
    	this.rollNo = rollNo;
    	this.marks = marks;
    }

    String getGrade() {
        // TODO: return "A" / "B" / "C"
    	if(marks >= 80 && marks <= 100) {
    		return "A";
		} else if(marks >= 60) {
			return "B";
		}
    	return "C";
    }

    void display() {
        // TODO: print name | rollNo | marks | grade
    	System.out.println(name + " | Roll: " + rollNo + " | Marks:" + marks + " | Grade " + getGrade());
    }
}
