public class StringReverse{

    public String recursionVersion(String input){
        return input.length() > 0 ? recursionVersion(input.substring(1)) + input.charAt(0)
            : "";
    }
}
