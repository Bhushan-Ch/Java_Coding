public class FindUppercaseLetterInAstring {
    public static void main(String[] args) {

        String str = "Test Automation";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
            System.out.println(count);
        }
    }
