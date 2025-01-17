package test240802.object1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Run1 {
	
	public void fileSave(String fileName) {
		try{
			FileWriter fw = new FileWriter(fileName);
			
			fw.write("사과");
			fw.write(20);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}
	}
	
	public void fileRead() {
		
		try(FileReader fr = new FileReader(fileName);){
			
			System.out.println(fr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
}