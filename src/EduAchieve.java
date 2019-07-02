public class EduAchieve{

    String schoolName;
    int year;
    String degree;
    String major;

    public EduAchieve(){}

    public EduAchieve(String schoolName, int year, String degree, String major) {
        this.schoolName = schoolName;
        this.year = year;
        this.degree = degree;
        this.major = major;
    }


    @Override
    public String toString() {
        return  degree + " in " +
                major + ",\n" +
                schoolName + ", " +
                year + "\n\n";
    }

    /*******************************************getters/setters***********************************/

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
