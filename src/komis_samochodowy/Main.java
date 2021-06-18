package komis_samochodowy;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args){
//	    Car myCar = new Car(1, "Ford", "czarny", "Focus", 15000.0, "Combi");
//	   
//	   String myCarDescription = myCar.toString();
//	    
//	   System.out.println(myCarDescription);
	   
		EventQueue.invokeLater(new Runnable() {
 			@Override
 			public void run() {
 				new MyFrame();
 			}
 		});
	     
//	    
//	    myCar.setID(100);
//	    
//	    System.out.println("A teraz moj samochod ma ID: " + myCar.getID());
//
//	    System.out.println("A teraz moj samochod ma kolor: " + myCar.getColor());	    
	    
	  }
	
	
}
