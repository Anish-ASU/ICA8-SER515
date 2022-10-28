public class urinals {
    public static void main(String[] args) {
        
    }
    Boolean goodString( String str ) {  // checks to see if valid string 
        int i = 0;
        int j = str.length();
        int err = 0;
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
}
