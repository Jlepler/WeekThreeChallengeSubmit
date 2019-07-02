import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Formatter;
import java.lang.Object;
import java.text.Format;

public class ResumeApp {


    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);
        String answerBeg;
        String answer;
        Boolean contResumeApp;
        Boolean contAddResume;
        Boolean contAddWork;
        ArrayList<Resume> resumeDatabase;
        //ArrayList for inside eduAchieve loop
        ArrayList<EduAchieve> eduArray;
        ArrayList<WorkExp> workArray;
        ArrayList<Skills> skillsArray;


        System.out.println("Welcome.");


        /*********Test*******/

//        Name myName = new Name();
//        myName.setName(keyIn.nextLine());
//
//        Resume myResume = new Resume(myName,null,null,null,null,null,null,null,null,null,null,null,null,null);
//
//        System.out.println(myResume.toString());
//
//        System.out.println("Add your name: ");
//        //ADD REFERENCES
//        System.out.println("Do you have any references? If so, please add a reference");
//        answer = keyIn.nextLine();
//        //Change this code to allow one variable of UserResponse to reuse
//        UserResponse Knit = new UserResponse();
//        if (Knit.answerTFPromptTwo(answer) == 1){ ;
//            myName.setReferenceNames(keyIn.nextLine());
//        }
//        EmailAddress myEmail = new EmailAddress(){};

        /********Test*******/

        //First while loop beginning
        do {
            System.out.println("Would you like to add a new resume, or browse/update an existing resume?"); //1 will be add new resume, 2 will be browse existing resume.
            answer = keyIn.nextLine();
            //Initialize class object to use method to convert answer string to integer
            UserResponse j = new UserResponse();

            if (j.answerTFPromptOne(answer) == 1) {
//                Resume newResumeOne = new Resume(){};
            }
            if (contAddResume = true) {
            }
            //Second while loop beginning. This part add values to resume.
            do {
                System.out.println("Please add your full name in First/MI/Last order.");
                Name myName = new Name() {
                };
                myName.setName(keyIn.nextLine());
                System.out.println("Add your email.");
                EmailAddress myEmail = new EmailAddress() {
                };
                myEmail.setEmailAddress(keyIn.nextLine());
                System.out.println("Add your work phone number.");
                PhoneNumber myPhoneNum = new PhoneNumber() {
                };
                myPhoneNum.setPhoneNumber(keyIn.nextLine());
                int tally = 0;
                //declares boolean for next segment
                boolean contAddEdu;
                eduArray = new ArrayList<>();

                do {
                    System.out.println(eduArray.size());
                    System.out.println(tally);
                    contAddEdu = true;
                    System.out.println("Please now add your education achievements.\nDegree?");
                    EduAchieve myAchvmt = new EduAchieve() {
                    };
                    myAchvmt.setDegree(keyIn.nextLine());

                    System.out.println("School name?");
                    myAchvmt.setSchoolName(keyIn.nextLine());

                    System.out.println("Year you graduated?");
                    myAchvmt.setYear(keyIn.nextInt());
                    keyIn.nextLine();
                    System.out.println("Major?");
                    myAchvmt.setMajor(keyIn.nextLine());
                    eduArray.add(tally, myAchvmt);                  //Adds first achievement to array

                    System.out.println("Want to add another achievement?");
                    answer = keyIn.nextLine();
                    if (j.answerTFPromptThree(answer) == 1) {
                        contAddEdu = true;
                        tally++;
                    } else {
                        contAddEdu = false;
                        tally = 0;
                    }
                } while (contAddEdu);
                workArray = new ArrayList();

                do {
                    contAddWork = true;
                    WorkExp myWork = new WorkExp() {
                    };

                    System.out.println("Now add your work experience.");
                    System.out.println("Enter the company name.");
                    myWork.setCompanyName(keyIn.nextLine());

                    System.out.println("Your position at " + myWork.getCompanyName() + "?");
                    myWork.setTitlePosition(keyIn.nextLine());

                    System.out.println("Add job description");
                    myWork.setJobDescription(keyIn.nextLine());

                    System.out.println("Add start date");
                    String dateInput;
                    Date date;
                    try {
                        dateInput = keyIn.nextLine();
                        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
                        date = format.parse(dateInput);
                        myWork.setDateStart(date);
                        System.out.println(date);
                    } catch (ParseException e) {
                    }
                    System.out.println("Add end date");
                    try {
                        dateInput = keyIn.nextLine();
                        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
                        date = format.parse(dateInput);
                        myWork.setDateEnd(date);
                        System.out.println(date);
                    } catch (ParseException e) {
                    }
                    workArray.add(tally, myWork);
                    System.out.println("Do you want to add another work experience entity?");
                    answer = keyIn.nextLine();
                    if (j.answerTFPromptFour(answer) == 1) {
                        contAddWork = true;
                        tally++;
                    } else {
                        contAddWork = false;
                        tally = 0;
                    }
                } while (contAddWork);

                //Declares boolean for next segment
                boolean contAddSkills;
                skillsArray = new ArrayList<>();
                do {
                    contAddSkills = true;
                    Skills mySkill = new Skills(){};

                    System.out.println("Now add your skills");
                    System.out.println("What are you proficient at");
                    mySkill.setSkill(keyIn.nextLine());
                    System.out.println("How proficient are you at " + mySkill.getSkill() + "?");
                    mySkill.setCompProRate(keyIn.nextLine());
                    skillsArray.add(tally, mySkill);
                    System.out.println("Would you like to add another skill?");
                    answer = keyIn.nextLine();
                    if (j.answerTFPromptFive(answer) == 1) {
                        contAddSkills = true;
                        tally++;
                    } else {
                        contAddSkills = false;
                        tally = 0;
                    }
                } while (contAddSkills);
                Resume newResume = new Resume(){};
                newResume.setName(myName);
                newResume.setEmailAddress(myEmail);
                newResume.setPhoneNumber(myPhoneNum);
                newResume.setEducationOne(eduArray.get(0));
                if (eduArray.size() > 1) {
                    newResume.setEducationTwo(eduArray.get(1));
                    if (eduArray.size() > 2) {
                        newResume.setEducationThree(eduArray.get(2));
                    } else {
                        EduAchieve empty1 = new EduAchieve(null,0,null,null);
                        newResume.setEducationThree(empty1);
                    }
                }else{
                    EduAchieve empty = new EduAchieve(null,0,null,null);
                    newResume.setEducationTwo(empty);
                }

                newResume.setCurrentJob(workArray.get(0));
                if (workArray.size() > 1) {
                    newResume.setMostRecentJob(workArray.get(1));
                    if (workArray.size() > 2) {
                        newResume.setPastJobNear(workArray.get(2));
                        if (workArray.size() > 3) {
                            newResume.setPastJobFar(workArray.get(3));
                        }else{
                            WorkExp empty2 = new WorkExp(null,null,null,null,null);
                            newResume.setPastJobFar(null);
                        }
                    }else{
                        WorkExp empty1 = new WorkExp(null,null,null,null,null);
                        newResume.setPastJobNear(null);
                    }
                }else{
                    WorkExp empty = new WorkExp(null,null,null,null,null);
                    newResume.setMostRecentJob(null);
                }
                newResume.setCompOne(skillsArray.get(0));
                if (skillsArray.size() > 1) {
                    newResume.setCompTwo(skillsArray.get(1));
                    if (skillsArray.size() > 2) {
                        newResume.setCompThree(skillsArray.get(2));
                        }else{
                        Skills empty1 = new Skills(null,null);
                        newResume.setCompThree(empty1);
                    }
                    }else{
                    Skills empty = new Skills(null,null);
                    newResume.setCompTwo(empty);
                }

                System.out.println(newResume.toString());


            }while (contAddResume);






        } while (contResumeApp = true);

    }


    public void initializerName(){
        Name name = new Name(){};
    }
}
