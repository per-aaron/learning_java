package bites.examples;

public class Announcement {
    public static void main(String[] args){
        System.out.printf(Announcement.celebrate());
        Announcement myAnn = new Announcement();
        System.out.println(myAnn.changeOfPlan());
        System.out.println(myAnn.apology());
        System.out.println(myAnn.politeNotice());
        System.out.println(myAnn.helpNeeded());
    }

    public static String celebrate() {
        return "What up now swedes? WOOOOOOOOO! \n";
    }

    public String changeOfPlan() {
        return "Unfortunately there has been a change of plans.";
    }

    public String apology() {
        return "Once again, the Enrichment Center offers its most sincere apologies on the occasion of this unsolvable test environment.";
    }

    public String politeNotice() {
        return "Please be advised that a noticeable taste of blood is not part of any test protocol but is an unintended side effect of the Aperture Science Material Emancipation Grill, which may, in semi- rare cases, emancipate dental fillings, crowns, tooth enamel, and teeth.";
    }

    public String helpNeeded() {
        return "Great job, astronaut, war hero, and/or Olympian! With your help, we're gonna change the world!";
    }
}
