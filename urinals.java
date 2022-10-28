import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class urinals {
    public static void main(String[] args) throws IOException {
        urinals obj = new urinals();
        String rulename = "rule";

        try {
            File myObj = new File("rule.txt");
            if (myObj.createNewFile()) {
                rulename = "rule.txt";
            } else {
                int n = 1;
              while(n !=0){
                File mo = new File("rule"+n+".txt");
                if (mo.createNewFile()){
                    rulename = "rule"+n+".txt";
                    n = 0;
                }
                else{
                    n++;
                }
              }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
            

        System.out.println("Take input from \n1. Keyboard\n2. Text file");
        try (Scanner scan = new Scanner(System.in)) {
            int dec = scan.nextInt();
            if(dec == 1){
                System.out.println("Enter string:");
                String input = scan.next();
                boolean gstring = obj.goodString(input);
                if(gstring == true){
                    int c = obj.countUrinals(input);
                    System.out.printf("%d",c);
                }
                if(gstring == false){
                    System.out.println("The String input is out of bounds.");
                }
            }
            if(dec == 2){
                List<String> li = read("urinal.dat");
                int z = li.size();
                int[] j = new int[z];
                for(int i = 0; i<z;i++){
                    j[i] = obj.countUrinals(li.get(i));

                }
                FileWriter writer = new FileWriter(rulename);
     
     
     for (int i = 0; i < z; i++) {
             writer.write(j[i] + "\n"+ "");
     }
     writer.close();
            }
        }
            
        }
        //urinals obj = new urinals();
        
    public static List<String> read(String filename) throws IOException {
        Path lul = Paths.get(filename);
        if (Files.exists(lul)) {
            
            return Files.readAllLines(lul);
        }
        
            return null;
        
    }
    // public static List<String> write(int[] arr) throws IOException{

    // }
    Boolean goodString( String str ) {  // checks to see if valid string 
        int i = 0;
        int j = str.length();
        String arr[] = str.split("");
        for(i=0;i<j;i++){
            if(arr[i].equals("1")||arr[i].equals("0")){
            }
            else{
                return false;
            }
        }
        return true;
        
   }
   public int countUrinals(String arr){

        
        int len = arr.length();
        String ur[] = arr.split("");
        
        int j = len;
        int i = 0;
        int count = 0;
        int v = 0;
        while(i != j) {
            if (ur[i].equals("1")){
                if(j>i+1){
                    if(ur[i+1].equals("1")){
                    v= -1;
                    return v;}
                }
            }
            if(i == 0){
                if (j == 1){
                    if(ur[i].equals("1")){
                        System.out.println("edge1");
                        return v;
                    }
                    else{
                        System.out.println("edge2");
                        return v + 1;
                    }
                }
                else if(ur[i].equals("0") && ur[i+1].equals("0")){
                    ur[i] = "1";
                    count++;
                }
            }
            else if (i == j-1){
                if(ur[i].equals("0") && ur[i-1].equals("0")){
                    ur[i] = "1";
                    count++;
                
                }
            }
            else {
                if(ur[i].equals("0") && ur[i-1].equals("0") && ur[i+1].equals("0")){
                    ur[i] = "1";
                    count++;
                }
            }
                
            i++;

        }
        return count;

    }
}
