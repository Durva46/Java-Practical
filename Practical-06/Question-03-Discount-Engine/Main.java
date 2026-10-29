import java.util.*;
@FunctionalInterface interface DiscountRule { double apply(double price); }
public class Main { public static void main(String[] args){Scanner sc=new Scanner(System.in);double[] prices={1000,2500,5000,8000};System.out.println("1. 10%  2. 20%  3. Flat 500");int choice=sc.nextInt();DiscountRule rule=switch(choice){case 1->p->p*.90;case 2->p->p*.80;case 3->p->p-500;default->null;};if(rule==null){System.out.println("Invalid choice");return;}for(double p:prices)System.out.println("Original: "+p+" -> Final: "+Math.max(0,rule.apply(p)));sc.close();} }
