import java.sql.SQLOutput;

public class HelloWorld {
    public static void main(String[] args) {

        int myFavoriteNumber = 333;
        System.out.println(myFavoriteNumber);

        String myString = "I love being alive";
        System.out.println(myString);

        float anotherNumber = 3.14f;
        System.out.println(anotherNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);

String stringName = "Audrey";
String otherName = "Leslie";
int number = 32;
        System.out.printf("%s, Hello! %s, Goodbye",number, otherName);
    }
}
