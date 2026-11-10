package bites.examples;

import java.util.ArrayList;

public class InfiniteDiary implements GenericDiary {
    ArrayList<String> entries = new ArrayList<String>();

    @Override
    public void addEntry(String entry) {
        this.entries.add(entry);
    }

    @Override
    public void removeEntry(int index) {
        this.entries.remove(index);
    }

    @Override
    public String readEntry(int index) {
        return this.entries.get(index);
    }

    public static void main(String[] args) {
        InfiniteDiary myDiary = new InfiniteDiary();
        myDiary.addEntry("Hello and, again, welcome to the Aperture Science computer-aided enrichment center.");
        myDiary.addEntry("We hope your brief detention in the relaxation vault has been a pleasant one. ");
        myDiary.addEntry("Before we start, however, keep in mind that, although fun and learning are the primary goals of all enrichment center activities, serious injuries may occur.");
        System.out.println(myDiary.readEntry(2));
        myDiary.removeEntry(1);
        System.out.println(myDiary.readEntry(1));
    }
}
