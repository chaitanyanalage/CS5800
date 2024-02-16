import java.util.ArrayList; 

public class Course {
    private final String courseName;
    private final ArrayList<Instructor> instructors = new ArrayList<>();
    private final ArrayList<Textbook> textbooks = new ArrayList<>();

    //Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        for (int i = 0; i < instructors.size(); i++) {
            Instructor instructor = instructors.get(i);
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
            System.out.println("Office: " + instructor.getOfficeNumber());

            //Verifing whether there exists a textbook aligned with the current instructor
            if (i < textbooks.size()) {
                Textbook textbook = textbooks.get(i);
                System.out.println("Textbook: " + textbook.getTitle());
                System.out.println("By " + textbook.getAuthor());
            }
        }
    }
}
