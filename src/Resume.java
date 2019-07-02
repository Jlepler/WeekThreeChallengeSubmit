import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class Resume {

    //Will change "name" to something more descriptive
    private Name name;
    private EmailAddress emailAddress;
    private PhoneNumber phoneNumber;
    private EduAchieve educationOne;
    private EduAchieve educationTwo;
    private EduAchieve educationThree;
    private WorkExp currentJob;
    private WorkExp mostRecentJob;
    private WorkExp pastJobNear;
    private WorkExp pastJobFar;
    private Skills compOne;
    private Skills compTwo;
    private Skills compThree;
    private ArrayList<String> resumeArray;

    public Resume(){}


    public void AddResumeApp(){}

    //The object is being saved into Name class, but the Name instance is not transferring over to this constructor

    public Resume(Name name, EmailAddress emailAddress, PhoneNumber phoneNumber,
                        EduAchieve educationOne, EduAchieve educationTwo, EduAchieve educationThree,
                        WorkExp currentJob, WorkExp mostRecentJob, WorkExp pastJobNear, WorkExp pastJobFar,
                        Skills compOne, Skills compTwo, Skills compThree) {

        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.educationOne = educationOne;
        this.educationTwo = educationTwo;
        this.educationThree = educationThree;
        this.currentJob = currentJob;
        this.mostRecentJob = mostRecentJob;
        this.pastJobNear = pastJobNear;
        this.pastJobFar = pastJobFar;
        this.compOne = compOne;
        this.compTwo = compTwo;
        this.compThree = compThree;
    }

    public void updateResume(Name myName, EmailAddress myEmail, PhoneNumber myPhoneNum, EduAchieve myEd, WorkExp myJobs, Skills...args){


    }

    public void ResumetoArray(){


    }

    @Override
    public String toString() {
        return "Resume{" +
                "name=" + name +
                ", emailAddress=" + emailAddress +
                ", phoneNumber=" + phoneNumber +
                ", educationOne=" + educationOne +
                ", educationTwo=" + educationTwo +
                ", educationThree=" + educationThree +
                ", currentJob=" + currentJob +
                ", mostRecentJob=" + mostRecentJob +
                ", pastJobNear=" + pastJobNear +
                ", pastJobFar=" + pastJobFar +
                ", compOne=" + compOne +
                ", compTwo=" + compTwo +
                ", compThree=" + compThree +
                ", resumeArray=" + resumeArray +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "=========================================================\n" +
//                name + "\n" +
//                emailAddress + "\n" +
//                phoneNumber + "\n\n" + "Education\n" +
//                educationOne.getDegree() + " in " +
//                educationOne.getMajor() + ",\n" +
//                educationOne.getSchoolName() + ", " +
//                educationOne.getYear() + "\n\n" +
//                educationOne.getDegree() + " in " +
//                educationOne.getMajor() + ",\n" +
//                educationOne.getSchoolName() + ", " +
//                educationOne.getYear() + "\n\n" +
//                educationOne.getDegree() + " in " +
//                educationOne.getMajor() + ",\n" +
//                educationOne.getSchoolName() + ", " +
//                educationOne.getYear() + "\n\n" +
//                "Experience\n" +
//                currentJob.getTitlePosition() + "\n" +
//                currentJob.getCompanyName() + ", " +
//                currentJob.getDateStart() + " - " +
//                currentJob.getDateEnd() + "\n" +
//                currentJob.getJobDescription() + "\n" +
//                mostRecentJob.getTitlePosition() + "\n" +
//                mostRecentJob.getCompanyName() + ", " +
//                mostRecentJob.getDateStart() + " - " +
//                mostRecentJob.getDateEnd() + "\n" +
//                mostRecentJob.getJobDescription() + "\n" +
//                pastJobNear.getTitlePosition() + "\n" +
//                pastJobNear.getCompanyName() + ", " +
//                pastJobNear.getDateStart() + " - " +
//                pastJobNear.getDateEnd() + "\n" +
//                pastJobNear.getJobDescription() + "\n" +
//                pastJobFar.getTitlePosition() + "\n" +
//                pastJobFar.getCompanyName() + ", " +
//                pastJobFar.getDateStart() + " - " +
//                pastJobFar.getDateEnd() + "\n" +
//                pastJobFar.getJobDescription() + "\n" +
//                "Skills\n\n" +
//                compOne.getSkill() + "\n" + ", " +
//                compOne.getCompProRate() + "\n" +
//                compTwo.getSkill() + "\n" + ", " +
//                compTwo.getCompProRate() + "\n" +
//                compThree.getSkill() + "\n" + ", " +
//                compThree.getCompProRate() + "\n";
//    }




    /*************************************getters/setters***********************************************/


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EduAchieve getEducationOne() {
        return educationOne;
    }

    public void setEducationOne(EduAchieve educationOne) {
        this.educationOne = educationOne;
    }

    public EduAchieve getEducationTwo() {
        return educationTwo;
    }

    public void setEducationTwo(EduAchieve educationTwo) {
        this.educationTwo = educationTwo;
    }

    public EduAchieve getEducationThree() {
        return educationThree;
    }

    public void setEducationThree(EduAchieve educationThree) {
        this.educationThree = educationThree;
    }

    public WorkExp getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(WorkExp currentJob) {
        this.currentJob = currentJob;
    }

    public WorkExp getMostRecentJob() {
        return mostRecentJob;
    }

    public void setMostRecentJob(WorkExp mostRecentJob) {
        this.mostRecentJob = mostRecentJob;
    }

    public WorkExp getPastJobNear() {
        return pastJobNear;
    }

    public void setPastJobNear(WorkExp pastJobNear) {
        this.pastJobNear = pastJobNear;
    }

    public WorkExp getPastJobFar() {
        return pastJobFar;
    }

    public void setPastJobFar(WorkExp pastJobFar) {
        this.pastJobFar = pastJobFar;
    }

    public Skills getCompOne() {
        return compOne;
    }

    public void setCompOne(Skills compOne) {
        this.compOne = compOne;
    }

    public Skills getCompTwo() {
        return compTwo;
    }

    public void setCompTwo(Skills compTwo) {
        this.compTwo = compTwo;
    }

    public Skills getCompThree() {
        return compThree;
    }

    public void setCompThree(Skills compThree) {
        this.compThree = compThree;
    }
}

