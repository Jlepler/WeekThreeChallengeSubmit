public class PhoneNumber{

    String phoneNumber;
    String altPhoneNum;


    public PhoneNumber(){









    }


    public PhoneNumber(String phoneNumber, String altPhoneNum) {
        this.phoneNumber = phoneNumber;
        this.altPhoneNum = altPhoneNum;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", altPhoneNum='" + altPhoneNum + '\'' +
                '}';
    }

//MAY NOT USE
//    public void InitializerPhone(){
//        PhoneNumber phoneNumber = new PhoneNumber(){};
//    }











    /************************getters/setters*******************************/



    public String getAltPhoneNum() {
        return altPhoneNum;
    }

    public void setAltPhoneNum(String altPhoneNum) {
        this.altPhoneNum = altPhoneNum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
