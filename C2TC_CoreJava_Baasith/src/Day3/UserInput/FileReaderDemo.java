package DAY3.USERINPUT;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.net.URL;

	public class FileReaderDemo {

		public static void main(String[] args) throws IOException {
			
			//
			URL resourse = FileReaderDemo.class.getResource("MVIT_TNS.txt");

			if(resourse == null) {
				System.err.println("File not fould");
			}
			
			//converting URL int file object
			File f = new File(resourse.getFile());
			
			//object creation of the file reader
			FileReader fr = new FileReader(f);
			
			//object creation for buffer reader
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine()) != null)
				System.out.println(line);
			
			br.close();
		}

	}
	
