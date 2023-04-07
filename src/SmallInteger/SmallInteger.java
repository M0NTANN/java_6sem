package SmallInteger;

import static java.util.stream.IntStream.*;

public class SmallInteger {


    private int val;

    /**
     *----
     * @param val
     */
    public SmallInteger(int val){
        this.val = val;
    }


    /**
     *
     * @param sI introduced number
     */
    public SmallInteger(SmallInteger sI){

        this.val = sI.getVal();
    }


    /**
     *
     * @return introduced number type int
     */
    public int getVal(){
        return val;
    }


    /**
     * This method checks the number for overexcitation
     * @param x introduced number
     * @return number after check
     */
    public static SmallInteger check(SmallInteger x){

        if(x.val > 10000){
            int schet_povt;
            if(x.val > 0) {
                schet_povt = x.val / 10000;
                if((schet_povt%2)==0){
                    sub_cycle(x, schet_povt);
                    x.val = (10000 - x.val);
                    return x;
                } else if ((schet_povt%1)==0) {
                    sub_cycle(x, schet_povt);
                    x.val = (10000 - x.val) * -1;
                    return x;
                }
            }
            if(x.val < 0) {
                schet_povt = (x.val * -1) / 10000;
                if((schet_povt%2)==0){
                    sub_cycle_2(x, schet_povt);
                    x.val = 10000 + x.val;
                    return x;
                } else if ((schet_povt%1)==0) {
                    sub_cycle_2(x, schet_povt);
                    x.val = (10000 + x.val) * -1;
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
    private static void sub_cycle_2(SmallInteger x, int schet_povt) {
        range(1, schet_povt).forEach(i -> x.val = x.val - 10000);
    }

    /**
     * Method with loop for overflow for negative numbers
     * @param x introduced number
     * @param schet_povt how many times the number is greater than the limit
     */
    private static void sub_cycle(SmallInteger x, int schet_povt) {
        range(0, schet_povt).forEachOrdered(i -> x.val = x.val - 10000);
    }


    /**
     * Summation of numbers
     * @param x first introduced number
     * @param y second introduced number
     * @return number after summation
     */
    public static SmallInteger Sum(SmallInteger x, SmallInteger y){

        x = check(x);
        y = check(y);
        int s;
        s = x.val + y.val;
        SmallInteger sv = new SmallInteger(s);
        sv = check(sv);
        return sv;
    }

    /**
     * Number subtraction
     * @param x first introduced number
     * @param y second introduced number
     * @return number after subtraction
     */
    public static SmallInteger sub(SmallInteger x, SmallInteger y){
        int s;
        x = check(x);
        y = check(y);
        s = x.val - y.val;
        SmallInteger sv = new SmallInteger(s);
        sv = check(sv);
        return sv;
    }


    /**
     * Division of numbers
     * @param x first introduced number
     * @param y second introduced number
     * @return number after division
     */
    public static SmallInteger div(SmallInteger x, SmallInteger y){
        int s;
        x = check(x);
        y = check(y);
        s = x.val / y.val;
        SmallInteger sv = new SmallInteger(s);
        sv = check(sv);
        return sv;
    }

    /**
     * Multiplication of numbers
     * @param x first introduced number
     * @param y second introduced number
     * @return number after Multiplicatio
     */
    public static SmallInteger mod(SmallInteger x, SmallInteger y){
        int s;
        x = check(x);
        y = check(y);
        s = x.val % y.val;
        SmallInteger sv = new SmallInteger(s);
        return sv;
    }

 }
