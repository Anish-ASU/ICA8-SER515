import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {
        urinals obj = new urinals();
        System.out.println("Take input from \n1. Keyboard\n2. Text file");
        Scanner scan = new Scanner(System.in);
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
            
        }
        //urinals obj = new urinals();
        
    }
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
