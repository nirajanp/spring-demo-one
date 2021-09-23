package injectingLiteralValues;

public class CricketCoach implements Coach {
    private String emailAddress;
    private String team;
    private String position;
    private int rating;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String printVal() {
        return emailAddress + " " + team
                + "\n " + position + " " + rating;
    }

}
