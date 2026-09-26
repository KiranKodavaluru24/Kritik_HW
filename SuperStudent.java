public class SuperStudent implements Student {
    private String name;
    private boolean isClone;

    public SuperStudent(String name) {
        this.name = name;
        this.isClone = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClone() {
        return isClone;
    }

    public void setIsClone(boolean value) {
        this.isClone = value;
    }
}