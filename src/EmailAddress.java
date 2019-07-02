public class EmailAddress{

    private String emailAddress;


    public EmailAddress(){}



    public EmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }



    @Override
    public String toString(){
        return emailAddress;
    }



        //MAY USE
//    public void initializerEmail(){
//        EmailAddress email = new EmailAddress(){};
//    }
//    public void initializerAltEmail(){
//        EmailAddress altEmail = new EmailAddress(){};
//
//    }





    /********************************getters/setters*******************************************/


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
