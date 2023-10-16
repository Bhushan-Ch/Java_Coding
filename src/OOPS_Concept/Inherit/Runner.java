package OOPS_Concept.Inherit;

public class Runner {
    public static void main(String[] args) {

        Java j = new Java();
        j.printInfoJava();

        Programming p = new Programming();
        p.printInformation();

        Programming p2 = new Java();

    }
}
