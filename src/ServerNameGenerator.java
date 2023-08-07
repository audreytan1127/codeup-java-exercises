import java.util.Random;

public class ServerNameGenerator {

   private static String[] arrayOfAdj = {"tall", "tiny", "mini", "graceful", "peaceful", "fulfilling", "breezy", "crumbly", "glistening", "smooth", "lively", "lovely", "yellow", "sunny", "silly"};


   private static String[] arrayOfNouns = {"peach", "gemstones", "universe", "cube", "orb", "flower", "note", "hibiscus", "tea", "kettle", "clouds", "geese", "panda"};

   static Random random = new Random();

//    static String randomAdj = arrayOfAdj[random.nextInt(arrayOfAdj.length)];
//
//   static String randomNoun = arrayOfNouns[random.nextInt(arrayOfNouns.length)];

//   // CLASS WALK THROUGH
   public static String returnRandom(String[] array){
       Random random = new Random();
       int randomIndex = random.nextInt(array.length);
       return array[randomIndex];
   }

    public static void main(String[] args) {
        System.out.printf("Here is generated server name:\n %s-%s\n", returnRandom(arrayOfAdj), returnRandom(arrayOfNouns));

//        System.out.printf("Here is a randomly generated name:\n%s-%s", randomAdj, randomNoun );
    }



}
