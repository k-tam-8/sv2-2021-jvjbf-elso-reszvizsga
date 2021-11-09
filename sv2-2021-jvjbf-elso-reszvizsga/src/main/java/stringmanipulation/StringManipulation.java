package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s) {
        String modString = "";
        for (int i = 0; i < s.length(); i += 2) {
            modString += Character.toString(s.charAt(i));
        }
        return modString;
    }
}
