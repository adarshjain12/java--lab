import java.util.Scanner;
public class Light{
 boolean isOn;
 void switchOn(){
 isOn=true;
 System.out.println(isOn);
 }
 void switchOff(){
 isOn=false;
 System.out.println(isOn);
 }
 public static void main(String args[]){
 Light led=new Light();
 Light halogen=new Light();
 led.switchOn();
 halogen.switchOff();
 System.out.println(led.isOn);
 }
}




 



