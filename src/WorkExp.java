import java.util.Date;

public class WorkExp{

    String companyName;
    String titlePosition;
    Date dateStart;
    Date dateEnd;
    String jobDescription;







    public WorkExp(){}


    public WorkExp(String companyName, String titlePosition, Date dateStart, Date dateEnd, String jobDescription) {
        this.companyName = companyName;
        this.titlePosition = titlePosition;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "WorkExp{" +
                "companyName='" + companyName + '\'' +
                ", titlePosition='" + titlePosition + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }

    /**********************************getters/setters*****************************************/

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitlePosition() {
        return titlePosition;
    }

    public void setTitlePosition(String titlePosition) {
        this.titlePosition = titlePosition;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
