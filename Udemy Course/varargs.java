public class varargs {
    public static void main(String... args) {
        System.out.println("hello worlds");

        String[] splStrings = "Hello World Again".split(" ");
        printText(splStrings);

        System.out.println("____________________________");  
        printText("Hello");
        System.out.println("_____________________________");
        printText("Hello", "Again", "Worlds");
        System.out.println("______________________________");
        printText();
        System.out.println("______________________________");
        String[] sArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",", sArray));
        System.out.println();
  }

    private static void printText(String... textList){
        for(String t: textList){
            System.out.println(t);
        }
    }
}
