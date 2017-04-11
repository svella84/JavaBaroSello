package packege.barosello.project;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	
	public void printOnlyBaroSello(ArrayList<String> arrayList) {
		Map<Integer, String> baroSello = new TreeMap<Integer, String>();

		for(int i = 0; i < arrayList.size(); i++){
			if(arrayList.get(i).equals("BaroSello") || arrayList.get(i).equals(ANSI_BLUE + "BaroSello" + ANSI_RESET)){
				baroSello.put(i, "BaroSello");
			}
		}
		
		System.out.println("BaroSello: " + baroSello.keySet());
	}
	
	public void printInNewOutput(ArrayList<String> arrayList){
		Map<Integer, String> baro = new TreeMap<Integer, String>();
		Map<Integer, String> sello = new TreeMap<Integer, String>();

		for(int i = 0; i < arrayList.size(); i++){
			if(arrayList.get(i).equals("Baro") || arrayList.get(i).equals(ANSI_GREEN + "Baro" + ANSI_RESET)){
				baro.put(i, "Baro");
			} else if (arrayList.get(i).equals("Sello") || arrayList.get(i).equals(ANSI_RED + "Sello" + ANSI_RESET)){
				sello.put(i, "Sello");
			}
		}
		
		System.out.println("Sello: " + sello.keySet());
		
		JFrame frame = new JFrame("Baro & Sello JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setOpaque(true);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel label = new JLabel(
        		"<html>Baro: " + baro.keySet() + "<br>Sello: " + sello.keySet() + "</html>"
                                    , JLabel.CENTER);
        label.setSize(600, 380);
        label.setLocation(10, 10);

        contentPane.add(label);

        frame.setContentPane(contentPane);
        frame.setSize(680, 420);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
	}
}
