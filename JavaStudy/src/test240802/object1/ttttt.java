package test240802.object1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ttttt {
	public void output() {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt", true);
			fw.write(97);
			fw.write(65);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//IO를 이용하여 기존 파일에 데이터를 이어쓸 수 있도록 
//구현하려 하는데 제대로 실행이 되지 않는다. 
//잘못된 부분을 [원인](20점)에 기술하고, 
//제대로 수정하여 [조치내용](20점)에 기술하시오. (40점)
