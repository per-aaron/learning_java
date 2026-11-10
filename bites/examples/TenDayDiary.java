package bites.examples;

public class TenDayDiary implements GenericDiary {
    String[] entries = new String[10];

    @Override
    public void addEntry(String entry) {
        boolean found = false;
        int counter = 0;
        while (!found) {
            if (this.entries[counter] == null) {
                this.entries[counter] = entry;
                found = true;
            } else {
                counter ++;
            }
        }
    }

    @Override
    public void removeEntry(int index) {
        this.entries[index] = null;
    }

    @Override
    public String readEntry(int index) {
        return this.entries[index];
    }

    public static void main(String[] args) {
        TenDayDiary myDiary = new TenDayDiary();
        myDiary.addEntry("Hello and, again, welcome to the Aperture Science computer-aided enrichment center.");
        myDiary.addEntry("We hope your brief detention in the relaxation vault has been a pleasant one. ");
        myDiary.addEntry("Before we start, however, keep in mind that, although fun and learning are the primary goals of all enrichment center activities, serious injuries may occur.");
        System.out.println(myDiary.readEntry(2));
        myDiary.removeEntry(1);
        System.out.println(myDiary.readEntry(1));
        myDiary.addEntry("Por favor bordón de fallar Muchos gracias de fallar gracias *static*");
        System.out.println(myDiary.readEntry(1));
    }
}
