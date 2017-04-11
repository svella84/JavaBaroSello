package packege.barosello.project;

import java.util.ArrayList;

public class BaroSello {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE = "\u001B[34m";

	public ArrayList<String> multiple(ArrayList<String> arrayList) {
		for(int i = 0; i < arrayList.size(); i++){
			if(i != 0 && i % 3 == 0 && i % 5 == 0){
				arrayList.set(i, "BaroSello");
			} else if(i != 0 && i % 3 == 0){
				arrayList.set(i, "Baro");
			} else if(i != 0 && i % 5 == 0){
				arrayList.set(i, "Sello");
			}
		}
		return arrayList;
	}
	
	public ArrayList<String> colorBaro(ArrayList<String> baro) {
		for(int i = 0; i < baro.size(); i++){
			if(baro.get(i).equals("Baro")){
				baro.set(i, ANSI_GREEN + "Baro" + ANSI_RESET);
			}
		}
		return baro;
	}

	public ArrayList<String> colorSello(ArrayList<String> sello) {
		for(int i = 0; i < sello.size(); i++){
			if(sello.get(i).equals("Sello")){
				sello.set(i, ANSI_RED + "Sello" + ANSI_RESET);
			}
		}
		return sello;
	}

	public ArrayList<String> colorBaroSello(ArrayList<String> baroSello) {
		for(int i = 0; i < baroSello.size(); i++){
			if(baroSello.get(i).equals("BaroSello")){
				baroSello.set(i, ANSI_BLUE + "BaroSello" + ANSI_RESET);
			}
		}
		return baroSello;
	}
	
	public void printArrayList(ArrayList<String> baroSello) {
		String result = null;
		result = baroSello.toString().replaceFirst("\\[", "").replaceFirst("\\]", "");
		System.out.println(result);
	}
}
