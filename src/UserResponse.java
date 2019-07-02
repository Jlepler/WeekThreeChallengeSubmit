/*
    Variable Names:
    answerTFPromptOne = method for first answer to "would you like to add new resume...




*/
public class UserResponse {

    //Answer to first prompt in ResumeApp
    private String answer;
    private int tempAnswer;

    public UserResponse() {}


    public UserResponse(String answer) {
            this.answer = answer;
        }


        public void UserResponse () {

        }

        //Returns answer as integer for ResumeApp
        public int answerTFPromptOne (String answer){
            int tempAnswer = 0;
            answer.toLowerCase();
            if (answer.startsWith("add") || answer.startsWith("new")) {
                tempAnswer = 1;
            } else if (answer.startsWith("browse") || answer.startsWith("update")) {
                tempAnswer = 2;
            } else if (answer.equalsIgnoreCase("quit") || answer.equalsIgnoreCase("q")){
                tempAnswer = 3;
            } else {
                tempAnswer = 0;
            }
            return tempAnswer;
        }

        /**********test**********/
        //This is a test method to return int for input of Resume variables
        public int answerTFPromptTwo(String answer){
            int tempAnswer = 0;
            answer.toLowerCase();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
                tempAnswer = 1;
            } else{
                tempAnswer = 0;
            }
            return tempAnswer;
        }

        //method for returning input as an integer. Continue education input
        public int answerTFPromptThree(String answer){
            int tempAnswer = 0;
            answer.toLowerCase();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
                tempAnswer = 1;
            } else {
                tempAnswer = 0;
            }
            return tempAnswer;
        }

        //Method for returning input as an integer. Continue work exp input
        public int answerTFPromptFour(String answer){
            int tempAnswer = 0;
            answer.toLowerCase();
            if (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y")){
                tempAnswer = 1;
            } else{
                tempAnswer = 0;
            }
            return tempAnswer;
        }

        public int answerTFPromptFive(String answer){
            int tempAnswer = 0;
            answer.toLowerCase();
                    if (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y")){
                        tempAnswer = 1;
                    } else {
                        tempAnswer = 0;
                    }
            return tempAnswer;
        }

        /*********test**********/


//    public Boolean answerFirstPrompt(){
//
//        return boolean;
//    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    //DO NOT NEED
//    public int getTempAnswer() {
//        return tempAnswer;
//    }
//
//    public void setTempAnswer(int tempAnswer) {
//        this.tempAnswer = tempAnswer;
//    }




}


