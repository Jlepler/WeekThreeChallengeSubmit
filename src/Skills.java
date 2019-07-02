public class Skills {

    private String skill;
    private String compProfRate;


    public Skills() {}

    public Skills(String skill, String compProRate) {
        this.skill = skill;
        this.compProfRate = compProRate;}


    @Override
    public String toString() {
        return "Skills{" +
                "skill='" + skill + '\'' +
                ", compProfRate='" + compProfRate + '\'' +
                '}';
    }

    public String getSkill () {
            return skill;
        }

        public void setSkill (String skill){
            this.skill = skill;
        }

        public String getCompProRate () {
            return compProfRate;
        }

        public void setCompProRate (String compProRate){
            this.compProfRate = compProfRate;
        }
    }

