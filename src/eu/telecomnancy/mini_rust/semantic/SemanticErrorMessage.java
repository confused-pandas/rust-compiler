package eu.telecomnancy.mini_rust.semantic;

public class SemanticErrorMessage {

    //messages sent when there are semantic errors

    //general
    //div by zero
    public static String divZero(int line){
        return ("Semantic Error line" + line + ": Division by 0");
    }

    //type not defined
    public static String typeError(String type, int line){
        return ("Semantic Error line" + line + ":" + type + "isn't defined on the symbole table");
    }

    //no function main
    public static String missingMain (int line){
        return ("Semantic Error main function is missing");
    }

    //main function with argument
    public static String mainArg (int line){
        return ("Semantic Error main function shouldn't have arguments");
    }

    //.idf not applied on an object
    public static String idfError (int line){
        return ("Semantic Error line" + line + ": .idf must be applied only on objects");
    }


    //variables
    //no type error
    public static String noTypeError(String var,int line) {
        return ("Semantic Error line" + line + ":" +  var + "has no type");
    }

    //no uniqueness of the parameters' names
    public static String nameError (String name, int line) {
        return ("Semantic Error line" + line + ":" + name + "has already been assigned to another parameter");
    }

    //problem type attributed
    public static String wrongType(String var, int line){
        return ("Semantic Error line" + line + ":" + var + "has another type");
    }

    //scale of var
    public static String scaleVar (String var, int line){
        return ("Semantic Error line" + line + ":" + var + "isn't defined on this bloc");
    }

    //size of variable
    public static String sizeVar (String var, int line){
        return ("Semantic Error line" + line + ":" + var + "is too tall" );
    }


    //operations
    //operation errors
    public static String mathOp (int line){
        return ("Semantic Error line" + line + ": mathematic operations should be done with only integers");
    }

    //no boolean after if
    public static String boolIf (int line){
        return ("Semantic Error line" + line + ": there should be booleans after if");
    }

    //no boolean after when
    public static String boolWhen (int line){
        return ("Semantic Error line" + line + ": there should be booleans after while");
    }

    //no boolean after compa
    public static String boolCompa (int line){
        return ("Semantic Error line" + line + ": the comparison must return a boolean");
    }



    //structures
    //no uniqueness of the structures' names
    public static String nameStruct (String name, int line){
        return ("Semantic Error line " + line + ":" + name + "has already been assigned on another structure");
    }

    //wrong type when calling a structure
    public static String typeinStruct (String struct, int line){
        return ("Semantic Error line" + line + ":" + "the wrong type has been attribued to " + struct);
    }

    //wrong number of parameters (structure)
    public static String numberElement(String struct, int line){
        return ("Semantic Error line" + line  + ":" + "the number of " + struct + "parameters isn't correct");
    }

    //the parameter of the structure isn't correct
    public static String wrongElement( String struct, String element, int line) {
        return ("Semantic Error line" + line + ":" + element + "isn't an element of " + struct);
    }


    //functions
    //wrong returned type
    public static String returnError(String func, int line){
        return ("Semantic Error line" + line + ":" + func + "doesn't return the correct type");
    }

    //wrong number of parameters (function)
    public static String numberParam(String func, int number, int line){
        return ("Semantic Error line " + line + ":" + func + "shouldn't have " + number + "parameters");
    }

    //the parameters have the wrong type
    public static String typeParam (String func, String param, int line){
        return ("Semantic Error line" + line + ":" + param + "isn't a correct parameter type of" + func);
    }

    //no uniqueness of functions
    public static String nameFunc (String name, int line ){
        return ("Semantic Error line" + line + ":" + name + "has already been assigned to another function");
    }

    //function doesn't exist
    public static String noDefFunc (String func,int line){
        return ("Semantic Error line" + line + ":" + func + "isn't defined");
    }


    //Vector
    //.len not applied on table
    public static String lenError (int line){
        return ("Semantic Error line" + line + ": .len must be applied only on tables");
    }

    //vectors operations with different types
    public static String typeVecOp (String vect, int line){
        return ("Semantic Error line" + line + ": the operation with " + vect + "is done with the wrong type");
    }

    public static String modifyingConstant(String name, int line) {
        return ("Semantic Error [" + line + "] : trying to modify a constant.");
    }
}
