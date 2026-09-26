public class FactoryTwin {
    public Student createStudent(String studentType) {
        if (studentType.equalsIgnoreCase("super")) {
            return new SuperStudent("New SuperStudent");
        } else if (studentType.equalsIgnoreCase("ta")) {
            return new TeachingAssistant("New TeachingAssistant", "Unassigned");
        } else {
            return null;
        }
    }
    public Student createStudentClone(Student studentToClone) {
         if (studentToClone instanceof SuperStudent) {
            SuperStudent clone = new SuperStudent(studentToClone.getName());
            clone.setIsClone(true);
            return clone;
         } else if (studentToClone instanceof TeachingAssistant) {
            TeachingAssistant original = (TeachingAssistant) studentToClone;
            TeachingAssistant clone = new TeachingAssistant(original.getName(), original.getAssignedSection());
            clone.setIsClone(true);
            return clone;
         } else {
            return null;
         }
    }
}