package lesson51;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stream {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<Integer>();
        
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            num.add(random.nextInt(10));
        }


        int max = num.get(0);
        int min = num.get(0);


        for(int num1 : num){
            if(num1 > max){
                max = num1;
            }
            if(num1 < min){
                min = num1;
            }
        }

        System.out.println("List numbers " + num);
        System.out.println("Maximum number " + max);
        System.out.println("Minimum number " + min);
    }
}
