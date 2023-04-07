package SmallInteger;


import Controller.*;
import View.*;

public class SmallInteger {


    public static int val;

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
    /*public static SmallInteger check(SmallInteger x){

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
    }*/




    /**
     * Summation of numbers
     * @param x first introduced number
     * @param y second introduced number
     * @return number after summation
     */
    public static SmallInteger Sum(SmallInteger x, SmallInteger y){
        int xint = Controller.check(Integer.parseInt(String.valueOf(x.getVal())));
        x = new SmallInteger(xint);
        int yint = Controller.check(Integer.parseInt(String.valueOf(y.getVal())));
        y = new SmallInteger(yint);
        int s;
        s = x.val + y.val;
        SmallInteger sv = new SmallInteger(s);
        int sint = Controller.check(Integer.parseInt(String.valueOf(sv.getVal())));
        sv = new SmallInteger(sint);;
        return sv;
    }

    /**
     * Number subtraction
     * @param x first introduced number
     * @param y second introduced number
     * @return number after subtraction
     */
    public static SmallInteger sub(SmallInteger x, SmallInteger y){
        int xint = Controller.check(Integer.parseInt(String.valueOf(x.getVal())));
        x = new SmallInteger(xint);
        int yint = Controller.check(Integer.parseInt(String.valueOf(y.getVal())));
        y = new SmallInteger(yint);
        int s;
        s = x.val - y.val;
        SmallInteger sv = new SmallInteger(s);
        int sint = Controller.check(Integer.parseInt(String.valueOf(sv.getVal())));
        sv = new SmallInteger(sint);;
        return sv;
    }


    /**
     * Division of numbers
     * @param x first introduced number
     * @param y second introduced number
     * @return number after division
     */
    public static SmallInteger div(SmallInteger x, SmallInteger y){
        int xint = Controller.check(Integer.parseInt(String.valueOf(x.getVal())));
        x = new SmallInteger(xint);
        int yint = Controller.check(Integer.parseInt(String.valueOf(y.getVal())));
        y = new SmallInteger(yint);
        int s;
        s = x.val / y.val;
        SmallInteger sv = new SmallInteger(s);
        int sint = Controller.check(Integer.parseInt(String.valueOf(sv.getVal())));
        sv = new SmallInteger(sint);;
        return sv;
    }

    /**
     * Multiplication of numbers
     * @param x first introduced number
     * @param y second introduced number
     * @return number after Multiplicatio
     */
    public static SmallInteger mod(SmallInteger x, SmallInteger y){
        int xint = Controller.check(Integer.parseInt(String.valueOf(x.getVal())));
        x = new SmallInteger(xint);
        int yint = Controller.check(Integer.parseInt(String.valueOf(y.getVal())));
        y = new SmallInteger(yint);
        int s;
        s = x.val % y.val;
        SmallInteger sv = new SmallInteger(s);
        int sint = Controller.check(Integer.parseInt(String.valueOf(sv.getVal())));
        sv = new SmallInteger(sint);;
        return sv;
    }

 }
