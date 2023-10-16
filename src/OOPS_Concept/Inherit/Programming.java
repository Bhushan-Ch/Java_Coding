package OOPS_Concept.Inherit;

public class Programming {

    int version;

    String author;

    Programming()
    {
        System.out.println("I am Default const..");
    }

    Programming(int version, String author)
    {
        this.version=version;
        this.author=author;
    }
    void printInformation()
    {
        System.out.println("This is a programming a language is created by "+author+"Had Version:" +version+"1.2.3");

    }


}
