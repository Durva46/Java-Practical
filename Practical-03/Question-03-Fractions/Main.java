import java.util.Objects;
public class Main {
    static class Fraction { final int num,den;
        Fraction(int n,int d){if(d==0)throw new IllegalArgumentException("Denominator cannot be zero");if(d<0){n=-n;d=-d;}int g=gcd(Math.abs(n),d);num=n/g;den=d/g;}
        private static int gcd(int a,int b){while(b!=0){int t=a%b;a=b;b=t;}return a==0?1:a;}
        public String toString(){return num+"/"+den;}
        public boolean equals(Object o){return o instanceof Fraction f&&num==f.num&&den==f.den;}
        public int hashCode(){return Objects.hash(num,den);}
    }
    public static void main(String[] args){Fraction a=new Fraction(2,4),b=new Fraction(1,2),c=new Fraction(3,6);System.out.println(a);System.out.println("a equals b: "+a.equals(b));System.out.println("b equals c: "+b.equals(c));}
}
