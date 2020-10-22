import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//LOL
        Function<String,String> lambdaFunction = (String s1) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i<s1.length();i++){
                if(i%2 ==1){
                    returnVal.append(s1.charAt(i));
                }
            }
            return returnVal.toString();

        };

        Supplier<String> sayLoveJava = () -> "I love Java";

        String supplierResult = sayLoveJava.get();
        System.out.println(supplierResult);


        System.out.println(everySecondCharacter(lambdaFunction,"1234567890"));

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

    }

    public static String everySecondCharacter(Function<String, String> function, String source){
        return function.apply(source);
    }

}


