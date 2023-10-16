package OOPS_Concept.Encaps;

public class Encap001 {

    public static void main(String[] args) {

        VWOLoginClass vwoLoginClass = new VWOLoginClass("admin", "admin");
        //vwoLoginClass.password = "admin";
        vwoLoginClass.setPassword("admin");
        //String pass = vwoLoginClass.getPassword();
//        System.out.println(pass);



        // Checking at the backend

        boolean isLoggedIn = vwoLoginClass.isLoggedIn("admin","admin");
        System.out.println(isLoggedIn);

    }
}
