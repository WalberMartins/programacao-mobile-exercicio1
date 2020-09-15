package mobile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {
	public static void main(String[] args) {

		Relogio r = new Relogio(28, 2, 2001, 13, 52, 0);
		System.out.println(r);

//		for(int i = 0; i < 86400 * 2; i++) {
//			r.tictac();
//			System.out.println(r);
//		}

		try {
			FileOutputStream fileOut = new FileOutputStream(new File("C:\\Users\\Public\\Relogio.txt"));
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(r);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Relogio RelogiofromFile = null;
		
		try {
			FileInputStream fileIn = new FileInputStream(new File("C:\\Users\\Public\\Relogio.txt"));
			ObjectInputStream in = new ObjectInputStream(fileIn);
			RelogiofromFile = (Relogio) in.readObject();
			in.close();
			fileIn.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			return;
		}
		catch (ClassNotFoundException  e) {
			e.printStackTrace();
			return;
		}
		
		System.out.println(RelogiofromFile);
	}
}
