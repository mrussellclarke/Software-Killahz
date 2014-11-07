package hip;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class main {
	
	public static void main(String[] args){
		Dorm slowe = new Dorm(180, "Slowe"); //creates new dorm named Slowe with 180 rooms
		Dorm westTowers = new Dorm(500, "Howard Plaza Towers West"); //creates new dorm named Howard Plaza Towers West with 500 rooms
		
		ComDir kHobson = new ComDir(slowe, "Kenyatta"); //SUPPOSED TO create new community director named Kenyatta who works in Slowe
		ComDir jack = new ComDir(westTowers, "Jack");
		//String privilege = "community director";
				
		//if(privilege=="community director"){
			kHobson.setDorm(slowe);
			kHobson.viewOccupancy(); //error where bottom dorm is assigned to all comdirs, regardless of what occurs in constructor
			jack.viewOccupancy();
		//}
	}
}