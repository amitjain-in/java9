package amit.sandbox.java10;

public class TypeInferenceWithVar {

    //private var hello = "Hello"; //var only applicable at local scope

    public static void main(String[] args) {
        var string = "Hello"; //Uses string literal
        String hello = "Hello"; //Same as above line
        var integer = 1; //It's a primitive not a class wrapper
        var doubleVar = 1.0; //Primitive not a class
        var integerObj = (Integer)1; //Primitive not a class
        System.out.println(string.getClass());
        System.out.println(hello == string);
        //System.out.println(integer.getClass()); //Compiler error
        System.out.println(integerObj.getClass());
        //System.out.println(doubleVar.getClass()); //Compiler error
    }
}
