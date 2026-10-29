abstract class Media { String title; Media(String title){this.title=title;} abstract double lateFee(int days); }
class Book extends Media { Book(String t){super(t);} double lateFee(int d){return d*2.0;} }
class DVD extends Media { DVD(String t){super(t);} double lateFee(int d){return d*5.0;} }
class Magazine extends Media { Magazine(String t){super(t);} double lateFee(int d){return d*1.0;} }
public class Main { public static void main(String[] args){Media[] items={new Book("Java"),new DVD("Film"),new Magazine("Science")};double total=0;for(Media m:items){double fee=m.lateFee(3);System.out.println(m.title+": "+fee);total+=fee;}System.out.println("Total fee: "+total);} }
