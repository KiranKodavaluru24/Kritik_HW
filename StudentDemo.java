public class StudentDemo {
    public static void main(String[] args) {
        FactoryTwin factory = new FactoryTwin();
        Student superStudent = factory.createStudent("super");
        System.out.println(superStudent.getName());

        Student ta = factory.createStudent("ta");
        System.out.println(ta.getName());

        Student superClone = factory.createStudentClone(superStudent);
        superClone.setName("Changed Name");

        System.out.println("Original: " + superStudent.getName());
        System.out.println("Clone: " + superClone.getName());

        Student taClone = factory.createStudentClone(ta);
        taClone.setName("Changed TA Name");


        System.out.println("Original: " + ta.getName());
        System.out.println("Clone: " + taClone.getName());

        try {
            factory.createStudent("professor");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught error: " + e.getMessage());
        }
    }
}