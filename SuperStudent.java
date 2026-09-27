/**
 * A high-performing student type that can be created and cloned by
 * FactoryTwin. Implements the Student interface.
 */
public class SuperStudent implements Student {
    private String name;
    private boolean isClone;

    /**
     * Creates a new, non-clone SuperStudent with the given name.
     *
     * @param name the name to assign to this student
     */
    public SuperStudent(String name) {
        this.name = name;
        this.isClone = false;
    }

    /**
     * Gets this student's name.
     *
     * @return the current name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets this student's name.
     *
     * @param name the new name to assign
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Checks whether this instance is a clone.
     *
     * @return true if this object was created by cloning, false otherwise
     */
    public boolean isClone() {
        return isClone;
    }

    /**
     * Marks whether this instance should be considered a clone.
     *
     * @param value true to mark this instance as a clone
     */
    public void setIsClone(boolean value) {
        this.isClone = value;
    }
}