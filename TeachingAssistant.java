/**
 * A student type with teaching-assistant responsibilities, assigned to a
 * specific course section. Can be created and cloned by FactoryTwin.
 * Implements the Student interface.
 */
public class TeachingAssistant implements Student {
    private String name;
    private boolean isClone;
    private String assignedSection;

    /**
     * Creates a new, non-clone TeachingAssistant.
     *
     * @param name            the TA's name
     * @param assignedSection the course section this TA supports
     */
    public TeachingAssistant(String name, String assignedSection) {
        this.name = name;
        this.assignedSection = assignedSection;
        this.isClone = false;
    }

    /**
     * Gets this TA's name.
     *
     * @return the current name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets this TA's name.
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

    /**
     * Gets the course section this TA is assigned to.
     *
     * @return the assigned section
     */
    public String getAssignedSection() {
        return assignedSection;
    }

    /**
     * Sets the course section this TA is assigned to.
     *
     * @param assignedSection the new section to assign
     */
    public void setAssignedSection(String assignedSection) {
        this.assignedSection = assignedSection;
    }
}