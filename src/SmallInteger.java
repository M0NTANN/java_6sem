public class SmallInteger {


    private final int max_val = 10000;

    private int val;



    public SmallInteger(int val){
        this.val = val;
    }

    public SmallInteger(SmallInteger sI){

        this.val = sI.getVal();
    }




    public int getVal(){
        return val;
    }
    public static SmallInteger check(SmallInteger x){

        if(x.val > 10000){
            int schet_povt;
            if(x.val > 0) {
                schet_povt = x.val / 10000;
                if((schet_povt%2)==0){
                    for(int i = 0; i < schet_povt; i++){
                        x.val = x.val - 10000;
                    }
                    x.val = (10000 - x.val);
                    return x;
                } else if ((schet_povt%1)==0) {
                    for(int i = 0; i < schet_povt; i++){
                        x.val = x.val - 10000;
                    }
                    x.val = (10000 - x.val) * -1;
                    return x;
                }
            }
            if(x.val < 0) {
                schet_povt = (x.val * -1) / 10000;
                if((schet_povt%2)==0){
                    for(int i = 1; i < schet_povt; i++){
                        x.val = x.val + 10000;
                    }
                    x.val = 10000 + x.val;
                    return x;
                } else if ((schet_povt%1)==0) {
                    for(int i = 1; i < schet_povt; i++){
                        x.val = x.val - 10000;
                    }
                    x.val = (10000 + x.val) * -1;
                    return x;
                }

            }
        }
        return x;
    }



    public static SmallInteger Sum(SmallInteger x, SmallInteger y){

        x = check(x);
        y = check(y);
        int s;
        s = x.val + y.val;
        SmallInteger sv = new SmallInteger(s);
        sv = check(sv);
        return sv;
    }

    public static SmallInteger sub(SmallInteger x, SmallInteger y){
        int s;
        x = check(x);
        y = check(y);
        s = x.val - y.val;
        SmallInteger sv = new SmallInteger(s);
        sv = check(sv);
        return sv;
    }

    public static SmallInteger div(SmallInteger x, SmallInteger y){
        int s;
        x = check(x);
        y = check(y);
        s = x.val / y.val;
        SmallInteger sv = new SmallInteger(s);
        sv = check(sv);
        return sv;
    }

    public static SmallInteger mod(SmallInteger x, SmallInteger y){
        int s;
        x = check(x);
        y = check(y);
        s = x.val % y.val;
        SmallInteger sv = new SmallInteger(s);
        return sv;
    }

 }
