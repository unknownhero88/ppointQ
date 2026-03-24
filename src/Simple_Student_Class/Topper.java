package Simple_Student_Class;

class Topper extends Student {

    Topper(String name, int rollNo, int marks) {
        super(name, rollNo, marks); // calls Student's constructor
    }

    String getScholarship() {
        // TODO: return "₹10,000" or "No scholarship"
    	if(marks >= 90) {
    		return "₹10,000";
    	}
        return "No scholarship";
    }
}
