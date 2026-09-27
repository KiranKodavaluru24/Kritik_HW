/**
 * Represents a student that can be created and cloned by FactoryTwin.
 * Any class that implements this interface can be produced by the factory
 * without the factory needing to know its concrete type.
 */
public interface Student {

    /**
     * Gets the student's name.
     *
     * @return the student's current name
     */
    String getName();

    /**
     * Sets the student's name.
     *
     * @param name the new name to assign
     */
    void setName(String name);

    /**
     * Checks whether this student is a clone of another student.
     *
     * @return true if this object was created by cloning, false otherwise
     */
    boolean isClone();

    /**
     * Marks whether this student should be considered a clone.
     *
     * @param value true to mark this student as a clone
     */
    void setIsClone(boolean value);
}