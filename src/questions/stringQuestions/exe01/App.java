package questions.stringQuestions.exe01;

public class App {
    public static void main(String[] args) {
        Prefix p1 = new Prefix();

        String[] str1 = {"flower","flow","flight"};
        System.out.println(p1.longestCommonPrefix(str1));

        String[] str2 = new String[3];
        str2[0] = "dog";
        str2[1] = "racecar";
        str2[2] = "car";
        System.out.println(p1.longestCommonPrefix(str2));
    }
}
