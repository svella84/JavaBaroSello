package packege.barosello.project;

import java.util.ArrayList;

public class BaroSello {

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
	
}
