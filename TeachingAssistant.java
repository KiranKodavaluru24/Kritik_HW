public Teaching Assistant implements Student {
    privite String name;
    privite boolean isClone;
    privite String assignedSection;

    public TeachingAssistant(String name, String assignedSection) {
        this.name = name;
        this.assignedSection = assignedSection;
        this.isClone = false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this,name = name;
    }
   public boolean isClone() {
    return isClone;
   }
   public void setIsClone(boolean value) {
    this.isClone = value;
   }
   public String getAssignedSection() {
    return assignedSection;
   }
   public void setAssignedSection(String assignedSection)
   this.assignedSection = assignedSection;
}

