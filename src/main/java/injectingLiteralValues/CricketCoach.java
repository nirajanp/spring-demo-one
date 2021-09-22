package injectingLiteralValues;

public class CricketCoach implements Coach {
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String printVal() {
        return emailAddress + " " + team;
    }

}
