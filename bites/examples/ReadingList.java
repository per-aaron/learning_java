package bites.examples;

public class ReadingList {
    String [] unread = new String[10];

    public static void main(String[] args){
        ReadingList myList = new ReadingList();
        myList.add("The Spectre of Pep");
        myList.add("Open Circuits");
        myList.add("The Gruffalo");
        myList.add("Dragons in a Bage");
        myList.add("The Girl Who Drank the Moon");
        System.out.println(myList.unread[0]);
        System.out.println(myList.unread[1]);
        System.out.println(myList.unread[2]);
        System.out.println(myList.unread[3]);
        System.out.println(myList.unread[4]);
    }

    public void add(String title){
        boolean found = false;
        Integer counter = 0;
        while (!found) {
            if (unread[counter] == null) {
                unread[counter] = title;
                found = true;
            } else {
                counter ++;
            }
        }
    }
}
