interface Switchable { void on(); void off(); default void toggle(){System.out.println("Toggling device...");} }
class Fan implements Switchable { public void on(){System.out.println("Fan is ON");} public void off(){System.out.println("Fan is OFF");} }
class Light implements Switchable { public void on(){System.out.println("Light is ON");} public void off(){System.out.println("Light is OFF");} }
@FunctionalInterface interface SwitchPermission { boolean maySwitchOn(Switchable device,int hour); }
public class Main { public static void main(String[] args){Switchable[] devices={new Fan(),new Light()};for(Switchable d:devices){d.on();d.off();d.toggle();}SwitchPermission p1=new SwitchPermission(){public boolean maySwitchOn(Switchable d,int h){return h>=6&&h<=22;}};SwitchPermission p2=(d,h)->h>=6&&h<=22;System.out.println("Anonymous class: "+p1.maySwitchOn(new Fan(),10));System.out.println("Lambda: "+p2.maySwitchOn(new Light(),23));} }
