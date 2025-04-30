package StringFormatting.StringBuilder;

public class Main {
    public static void main(String[] args) {
        
    
    String helloWorlds = "Hello" + " Worlds";
    helloWorlds.concat(" and Goodbye");

    StringBuilder hellowWorldsBuilder = new StringBuilder("Hello" + " Worlds");
    hellowWorldsBuilder.append(" and Goodbye");
    

        
    printInformation(helloWorlds);
    printInformation(hellowWorldsBuilder);
    


    
    StringBuilder emptyStart = new StringBuilder();
    emptyStart.append("a".repeat(27));

    StringBuilder emptyStart32 = new StringBuilder(32);
    emptyStart32.append("a".repeat(27));

    printInformation(emptyStart);
    printInformation(emptyStart32);
    
    
    StringBuilder builderPlus = new StringBuilder("Hello" + " Worlds");
    builderPlus.append(" and Goodbye");
    builderPlus.deleteCharAt(17).insert(17, 'g');
    System.out.println(builderPlus);

    builderPlus.replace(17, 18, "G");
    System.out.println(builderPlus);

    builderPlus.reverse().setLength(7);
    System.out.println(builderPlus);
    

    
    
    }


    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }

























}
