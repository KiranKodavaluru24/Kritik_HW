/**
 * Factory responsible for creating and cloning Student instances
 * (SuperStudent and TeachingAssistant), without callers needing to know
 * the concrete class being created.
 */
public class FactoryTwin {

    /**
     * Creates a new Student of the given type.
     *
     * @param studentType the type of student to create; "super" for a
     *                     SuperStudent, "ta" for a TeachingAssistant
     *                     (case-insensitive)
     * @return a newly created, non-clone Student
     * @throws IllegalArgumentException if studentType is null or does not
     *                                   match a known student type
     */
    public Student createStudent(String studentType) {
        if (studentType == null) {
            throw new IllegalArgumentException("Student type cannot be null");
        }
        if (studentType.equalsIgnoreCase("super")) {
            return new SuperStudent("New SuperStudent");
        } else if (studentType.equalsIgnoreCase("ta")) {
            return new TeachingAssistant("New TeachingAssistant", "Unassigned");
        } else {
            throw new IllegalArgumentException("Unrecognized student type: " + studentType);
        }
    }

    /**
     * Creates an independent copy of the given Student. The returned
     * object is a separate instance from studentToClone, so changes to
     * one do not affect the other. The clone's isClone flag is set to true.
     *
     * @param studentToClone the Student to copy
     * @return a new, independent Student with the same data, marked as a clone
     * @throws IllegalArgumentException if studentToClone is null or is not
     *                                   a supported Student type
     */
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
            throw new IllegalArgumentException("Cannot clone: unsupported or null Student");
        }
    }
}