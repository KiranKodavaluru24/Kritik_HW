public class StudentDemo {
    public static void main(String[] args) {
        FactoryTwin factory = new FactoryTwin();
        Student superStudent = factory.createStudent("super");
        System.out.println(superStudent.getName());

        Student ta = factory.createStudent("ta");
        System.out.println(ta.getName());
    }
}