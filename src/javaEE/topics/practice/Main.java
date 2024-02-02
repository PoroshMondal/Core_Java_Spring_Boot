package javaEE.topics.practice;

import com.javaEE.practice.functionalIF.IShow;
import com.javaEE.practice.functionalIF.IShow2;
import com.javaEE.practice.functionalIF.IShowMultipleParam;
import com.javaEE.practice.functionalIF.IShowMultipleParam2;
import com.javaEE.practice.streamApi.StreamApiPractice;
import javaEE.topics.practice.functionalLambda.LambdaExpressionPractice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // StreamAPI practice
        new StreamApiPractice().practiceStreamApi();

        // Lambda Expression
        LambdaExpressionPractice lm = new LambdaExpressionPractice();
        lm.practiceLambdaExpression();
        lm.practiceLambdaWithParam();

        // Functional Interface Practices
        IShow show = new IShow() {
            @Override
            public void show() {
                System.out.println("Show msg using Functional Interface");
            }
        };
        show.show();

        // Functional Interface with Lambda
        IShow obj = () -> System.out.println("Show msg using Functional Interface using LAMBDA Expression");
        obj.show();

        IShow2 obj2 = i -> System.out.println("Show msg using Parameterized Functional Interface using LAMBDA Expression " + i);
        obj2.show(10);

        IShowMultipleParam obj3 = (i,param, bool) -> {
            System.out.println("Show msg using Parameterized Functional Interface using LAMBDA Expression " + i + " Param: " + param + "Boolean: " + bool);
            System.out.println("Show msg 2nd " + i + " Param: " + param + "Boolean: " + bool);
        };
        obj3.show(10,"Multiple Param Lambda", false);

        /*IShowMultipleParam2 obj4 = new IShowMultipleParam2() {
            @Override
            public int add(int i, int j) {
                return i + j;
            }
        };
        int result = obj4.add(10,15);
        System.out.println("Functional Interface with Lambda: " + result);*/

        IShowMultipleParam2 obj4 = (i,j) -> i + j;
        int result = obj4.add(10,15);
        System.out.println("Functional Interface with Lambda: " + result);

    }

}