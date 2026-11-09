package bites.examples;

public class ArgsInfo {
    public static void main(String[] args) {
        System.out.println("args below:");
        System.out.println(args);
        System.out.println("This is the default output of a toString call of a JVM array");
        System.out.println("def toString(): String = this.getClass.getName + \"@\" + this.hashCode.toHexString");
        System.out.println("The classname of a string array is [Ljava.lang.String");
        System.out.println("Where [ means its an array");
        System.out.println("L means it can contain object references");
        System.out.println("and all those objects should be instances of java.lang.String");
        System.out.println("The hex at the end is just to help uniquely identify the object, based on memory location");
    }
}
