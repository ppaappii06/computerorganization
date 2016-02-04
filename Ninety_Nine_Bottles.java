/**
 * Created by Matt on 2/4/2016.
 */
public class Ninety_Nine_Bottles {
    public static void bottles_on_wall(){
        for(int i = 99; i > 0; i--)
        {
            int bottles = (i - 1);
            String word = " bottles";
            if(i == 1 || bottles == 1){
                word = " bottle";
            }
            System.out.println(i + word + " of beer on the wall, " + i + word + " of beer");
            System.out.println("take one down, pass it around, " + bottles + word + " of beer on the wall");
	/*this is a working program*/
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}
