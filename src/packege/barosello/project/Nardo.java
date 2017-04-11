package packege.barosello.project;

import java.util.ArrayList;

public class Nardo extends BaroSello{
	
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	public ArrayList<String> multiSeven(ArrayList<String> nardo) {
		for(int i = 0; i < nardo.size(); i++){
			if(i != 0 && i % 7 == 0){
				nardo.set(i, "Nardo");
			}
		}
		return nardo;
	}
	
	public ArrayList<String> colorNardo(ArrayList<String> nardo) {
		for(int i = 0; i < nardo.size(); i++){
			if(nardo.get(i).equals("Nardo")){
				nardo.set(i, ANSI_YELLOW + "Nardo" + ANSI_RESET);
			}
		}
		return nardo;
	}	
}
