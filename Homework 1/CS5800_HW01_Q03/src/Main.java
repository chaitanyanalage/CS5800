public class Main {
    public static void main(String[] args) {
        //Instructor
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor dave = new Instructor("Dave", "Johannsen", "8-49");

        //Textbook
        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook crackingTheCodingInterview = new Textbook("Cracking the Coding Interview", "Gayle", "Gayle Laakmann McDowell");

        //First Instructor course and textbook
        Course advancedSoftwareEngineering = new Course("Advanced Software Engineering");
        advancedSoftwareEngineering.addInstructor(nima);
        advancedSoftwareEngineering.addTextbook(cleanCode);

        System.out.println("Advanced Software Engineering Course");
        advancedSoftwareEngineering.printCourseDetails();

        //Second Instructor course and textbook
        advancedSoftwareEngineering.addInstructor(dave);
        advancedSoftwareEngineering.addTextbook(crackingTheCodingInterview);

        System.out.println("\nAdvanced Software Engineering Course Updated");
        advancedSoftwareEngineering.printCourseDetails();
    }
}
