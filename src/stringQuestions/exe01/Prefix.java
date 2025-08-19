package stringQuestions.exe01;

public class Prefix {

    public String longestCommonPrefix(String[] strs) {

        String firstString = strs[0];

        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || currentChar != strs[j].charAt(i)){
                    return firstString.substring(0, i);
                }
            }

        }

        return firstString;
    }

}
