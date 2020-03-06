import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWrite { 
	
	public FileWrite() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void AppendToFile(String fileName) throws IOException {
		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw);
	    int line_num = 0;
	    int count = 0;
	    Random random = new Random();
	    for(long i = 0; i < 858993451; i++) //858993451 for 6.2gb
        {           
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            count+=word.length;
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));

            }
            out.print(new String(word) + ' ');
            count+=1;
            if (i % 10 == 0){
                out.print(".");
//                writer.print("\n");
                line_num+=1;
                count+=1;
            }
//            if (line_num == randomInt) {
//            	writer.print("\n");
//            	line_num=0;
//            	randomInt = random.nextInt(10);
//            }
        }
	    out.close();
	}


public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub

    long count=0;
    int line_num = 0;
    try{

        File file = new File("C:\\Users\\achyutha.aluru\\Desktop\\Files\\newfile_shortest1.txt");
        PrintWriter writer = new PrintWriter(file, "UTF-8");


        Random random = new Random();
//        int randomInt = random.nextInt(10);
        for(long i = 0; i < 5000; i++) //858993451 for 6.2gb
        {           
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            count+=word.length;
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));

            }
            writer.print(new String(word) + ' ');
            count+=1;
            if (i % 10 == 0){
                writer.print(".");
//                writer.print("\n");
                line_num+=1;
                count+=1;
            }
//            if (line_num == randomInt) {
//            	writer.print("\n");
//            	line_num=0;
//            	randomInt = random.nextInt(10);
//            }
        }
        writer.close();
    } catch (IOException e) {
       // do something
    }
    
    FileWrite fw = new FileWrite();
    fw.AppendToFile("C:\\\\Users\\\\achyutha.aluru\\\\Desktop\\\\Files\\\\newfile_shortest1.txt");
    System.out.println(count);

}
}
