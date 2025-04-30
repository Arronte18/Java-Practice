public class methodOverload {
    public static void main(String[] args) {
        System.out.println("Centimeters: " + convertToCentimeter(68));
        System.out.println("Centimeters: " + convertToCentimeter(5, 8));
    }


    public static double convertToCentimeter(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeter(int feet, int inches){
        return ((feet * 12) + inches) * 2.54; // or return convertToCentimeter((feet * 12) + inches);
    }

}
