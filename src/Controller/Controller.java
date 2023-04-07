package Controller;

import static java.util.stream.IntStream.range;



public class Controller {


    public static int check(int x){

        if(x > 10000){
            int schet_povt;
            if(x > 0) {
                schet_povt = x / 10000;
                if((schet_povt%2)==0){
                    sub_cycle(x, schet_povt);
                    x = (10000 - x);
                    return x;
                } else if ((schet_povt%1)==0) {
                    sub_cycle(x, schet_povt);
                    x = (10000 - x) * -1;
                    return x;
                }
            }
            if(x < 0) {
                schet_povt = (x * -1) / 10000;
                if((schet_povt%2)==0){
                    sub_cycle_2(x, schet_povt);
                    x = 10000 + x;
                    return x;
                } else if ((schet_povt%1)==0) {
                    sub_cycle_2(x, schet_povt);
                    x = (10000 + x) * -1;
                    return x;
                }

            }
        }
        return x;
    }
    /**
     * Method with loop for overflow for positive numbers
     * @param x introduced number
     * @param schet_povt how many times the number is greater than the limit
     */
    public static int sub_cycle_2(int x, int schet_povt) {
        for(int i = 1; i <= schet_povt; i++){
            x = x - 10000;
        }
        return x;
        //range(1, schet_povt).(i -> x = x - 10000);
    }

    /**
     * Method with loop for overflow for negative numbers
     * @param x introduced number
     * @param schet_povt how many times the number is greater than the limit
     */
    public static int sub_cycle(int x, int schet_povt) {
        for(int i = 0; i <= schet_povt; i++){
            x = x - 10000;
        }
        return x;
       // range(0, schet_povt).forEachOrdered(i -> x.val = x.val - 10000);
    }
}