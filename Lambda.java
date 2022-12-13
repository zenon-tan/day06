import java.util.List;

public class Lambda {

    public static void apply(Greetings greetings, String value) {

        greetings.hello(value);

    }

    public static void toUpperCase(String str) {
        System.out.printf(">>> %s = %s\n", str, str.toUpperCase());
        // The signature of this method looks like 'hello'
    }

    public static void main(String[] args) {

        // hi is of type Greetings, and since it only has 1 method, Lambda can be applied here

        Greetings hi = (name) -> {

            // Parameter type does not need to be declared (but you can) -> inferring the type from the Greeting interface
            System.out.println("Hello " + name);

        }; 
        // Created a function type has one single parameter of String that does not return any value
        // Since there is ONLY a single method in the Greetings interface, it is that only one
        // It looks at the signature method and not the name

        hi.hello("Satan"); //hi is the iterface, hello is the method in that interface

        List<String> names = List.of("gaga", "madonna", "katy");

        for(String name : names) {
            apply(hi, name);
        }

        toUpperCase("hello, world");

        Greetings reverseCase = Lambda::toUpperCase;
        // Because the mehod signature is similar (any method that fits the signature can be used)
        // It can be executed as long as the method signature is the same

        // System.out.println("To uppercase: " + names);
        for(String name : names) {
    
            apply(reverseCase, name);
        }

        


    }
    
}
