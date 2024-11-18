package FinalReview;

public class CollegeStudent implements Cloneable, Comparable<CollegeStudent>{
    private int stuID;
    private String name;
    private String major;
    private int ageInYears;

    public CollegeStudent(int stuID, String name, String major, int ageInYears) {
        this.stuID = stuID;
        this.name = name;
        this.major = major;
        this.ageInYears = ageInYears;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FinalReview.CollegeStudent{");
        sb.append("stuID=").append(stuID);
        sb.append(", name='").append(name).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append(", ageInYears=").append(ageInYears);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public CollegeStudent clone(){
        try {
            return (CollegeStudent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(CollegeStudent otherStudent) {
        return this.getName().compareTo(otherStudent.getName());
    }

}
