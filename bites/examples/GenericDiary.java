package bites.examples;

public interface GenericDiary {
    public void addEntry(String entry);
    public void removeEntry(int index);
    public String readEntry(int index);
}
