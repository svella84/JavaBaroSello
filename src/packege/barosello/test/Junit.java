package packege.barosello.test;

import java.util.ArrayList;

public class Junit {
	
	public static ArrayList<String> stepOne(int val){
		ArrayList<String> arrayList = new ArrayList<String>();

    	for(int i=0 ; i<=val ; i++) {
			arrayList.add(String.valueOf(i));
		}
		
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
	
	public static ArrayList<String> stepTwo(int val) {
		ArrayList<String> arrayList = new ArrayList<String>();

    	for(int i=0 ; i<=val ; i++) {
			arrayList.add(String.valueOf(i));
		}
				
		for(int i = 0; i < arrayList.size(); i++){
			if(i != 0 && i % 7 == 0){
				arrayList.set(i, "Nardo");
			}
		}
		return arrayList;
	}
}
