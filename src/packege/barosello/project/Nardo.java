package packege.barosello.project;

import java.util.ArrayList;

public class Nardo extends BaroSello{
	
	public ArrayList<String> multiSeven(ArrayList<String> nardo) {
		for(int i = 0; i < nardo.size(); i++){
			if(i != 0 && i % 7 == 0){
				nardo.set(i, "Nardo");
			}
		}
		return nardo;
	}
	
}
