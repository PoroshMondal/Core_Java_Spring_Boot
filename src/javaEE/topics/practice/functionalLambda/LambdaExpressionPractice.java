package javaEE.topics.practice.functionalLambda;


public class LambdaExpressionPractice {

    public LambdaExpressionPractice(){

    }

    public void practiceLambdaExpression(){
        printThing(
                () -> {
                    System.out.println("Meow");
                }
        );
    }

    static void printThing(com.javaEE.practice.functionalLambda.IPrintable thing){
        thing.print();
    }

    public void practiceLambdaWithParam(){
        printThingWithParam(
                (s) -> {
                    System.out.println("Meow " + s);
                }
        );
    }

    static void printThingWithParam(com.javaEE.practice.functionalLambda.IPrintableWithParam thing){
        thing.printWithParam("IPrint ");
    }

}
