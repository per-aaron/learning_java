package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public static void main(String[] args){
        ProgrammingLanguage Python = new ProgrammingLanguage("Python", 1989, "Guido van Rossum");
        ProgrammingLanguage Java = new ProgrammingLanguage("Java", 1995, "James Gosling");
        ProgrammingLanguage Zig = new ProgrammingLanguage("Zig", 2016, "Andrew Kelley");

        System.out.println(Python.name + " " + Python.yearOfCreation.toString() + " " + Python.creator);
        System.out.println(Java.name + " " + Java.yearOfCreation.toString() + " " + Java.creator);
        System.out.println(Zig.name + " " + Zig.yearOfCreation.toString() + " " + Zig.creator);
    }

    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }
}
