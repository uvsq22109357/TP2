package fr.uvsq.cprog.mvnjunit;


public class Fraction {
    private int num;
    private int denum;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenum() {
        return denum;
    }

    public void setDenum(int denum) {
        this.denum = denum;
    }

    public Fraction() {
        this.num = 0;
        this.denum = 1;
    }

    public  Fraction(int a, int b) {
        num = a;
        denum = b;
    }

    public  Fraction(int a) {
        num = a;
        denum = 1;
    }
    public String ToString(){
        return num + "/" + denum;
    }
    public double ToDouble(){
        return num/denum;
    }
    public void ReducedFraction(){
        int b = denum;
        int a = num;
        int r,q,b;
        for(;;) {
            r=a%b;
            q = (a-r)/b;
            if (r==0) break;
            a=b;
            b=r;
        }
        num= num/b;
        denum=denum/b;
    }

    public Fraction addition(Fraction f){
        Fraction res=new Fraction (num * f.getDenum()+ denum * f.getNum(),
                denum * f.getDenum() );

         res.ReducedFraction();
        return res;
    }
}
