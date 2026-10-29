interface Notifier { void send(String message); }
interface Urgent { }
class EmailSender implements Notifier,Urgent { public void send(String m){System.out.println("Email: "+m);} }
class SMSSender implements Notifier { public void send(String m){System.out.println("SMS: "+m);} }
public class Main { public static void main(String[] args){Notifier[] senders={new EmailSender(),new SMSSender()};String message="Your order has been shipped.";for(Notifier n:senders){n.send(message);if(n instanceof Urgent)n.send(message);}} }
