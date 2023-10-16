package OOPS_Concept.Inherit;

public class Java extends Programming{

    String newFeature;

    Java()
    {

    }
    Java(String feature)
    {
        this.newFeature=feature;
    }

    void printInfoJava()
    {
        System.out.println("This is child Java..");
    }
}
