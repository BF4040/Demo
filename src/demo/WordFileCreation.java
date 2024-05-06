package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WordFileCreation {
	public static void main(String[] args) {
		
		
		try {
			File file=new File("C:\\eclips/demo3.docx");
			System.out.println(file.createNewFile());
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.flush();
			fileWriter.write("Olive Crypto Systems is a product-based software development and consulting company established in the year 2005, by Mr. Bharavi Gade IIT, Kharagpur, Alumni and architect of many payment solutions. Olive has expertise and special focus on developing payment solution and services based on NPCI platform.");
			fileWriter.write("<table>Employee \tName\tDeportment\tProduct\tCity\tDOJ\tLocation\n"); // Table header
			fileWriter.write("1408\tRajeshkumar Biswal\t\tIT\tUPI\t05-05-2024\tMumbai\n");
			fileWriter.write("1409\tShubham kothare\t\t\tIT\tUPI\t05-05-2024\tHyderabad\n");
			fileWriter.write("1411\tGopichand vilas shingade\tIT\tUPI\t05-05-2024\tMumbai\n</table>");
			fileWriter.close();
			FileReader fileReader=new FileReader(file);
			int fatchChar=fileReader.read();
			while (fatchChar!=-1) {
				System.out.print((char) fatchChar);
				fatchChar=fileReader.read();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
