public class Name{

    private String name;



        public Name(){}

    public Name(String name){
        this.name = name;
    }



    private void NameInput(String name){

    }



    public String NameToUC(){
        return name.toUpperCase();
    }

    public String NameToLC(){
        return name.toLowerCase();
    }



    @Override
    public String toString(){
        return name;
    }









    /********************************getters/setters********************************************/



//
//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }


}
