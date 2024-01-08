
/**
 * Prints a version of 99 Bottles of Beer
 * 
 * @author Michael Depew (@EldieSoft)
 * @version 1.0 1/6/24
 */
public class NinetyNineBottlesOfBeer {
    public static void main(String[] args){
        for (int i = 99; i > 1; i--)
        {
            System.out.print(i);
            System.out.println(" bottles of beer on the wall, ");
            System.out.print(i);
            System.out.println(" bottles of beer. Take one down, pass it around,");
        }
        System.out.println("1 bottle of beer on the wall.");
    }
}
