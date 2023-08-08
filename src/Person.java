//  //Create new class (file) called Person and set to public so you can use methods outside of this file!
public class Person {
//    // Construct the person object by declaring public variable named Person(), without any defined parameters
public Person(){
//    // When a new person is created this message will appear
    System.out.println("Created new person!");
}



//     // Private field/property of name for Person object
//    // This is similar to declaring a property without a value for object in JS
    private String name;

//      //Another constructor for a new person object, but passing in a name as an argument!
//    // this keyword will set the (argument= String name) to the private String name; property we just declared above
    public Person(String name){
        this.name = name;
    }



//    //Getters and Setters
//    // Declaring the getName method to get the name of the person object and return a string value
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

//    // set the name of the person object by passing in String name as argument to setName method.
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

//    //Other Methods

//    // Misc. sayHello method to print a message with the person object's name
//    // This checks to see if passing in the argument of String name AND setName method works.
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!", name);
    }

//    // We create a new Person object and call these methods in a main method
//    // It is good practice to create and call in a main method separate from the actual class where you construct the object.




}
