public class FindDuplicateChar {
    public static void main(String[] args) {

        String str = "Programming";

        char[] array = str.toCharArray();
        System.out.println("The string is " + str);
        System.out.println("The duplicate characters are..");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j] + "");
                    break;

                }


            }
        }
    }}