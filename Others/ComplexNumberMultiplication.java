class Solution {
    public String complexNumberMultiply(String a, String b) {
        
        int real1=0, real2=0;   // indexes to hold the real numbers
        int comp1=0, comp2=0;   // indexes to hold the complex numbers
        int i=0, j=0; // indexes to detect where the real and complex numbers are separated by '+'
        StringBuilder builder = new StringBuilder();
        
        //find the index where the real numbers ends (where '+' sign is located)
        while(a.charAt(i) != '+'){
            i++;
        }
        while(b.charAt(j) != '+'){
            j++;
        }
        real1 = Integer.parseInt(a.substring(0,i));
        real2 = Integer.parseInt(b.substring(0,j));
        comp1 = Integer.parseInt(a.substring(i+1, a.length()-1)); //-1 is used to exclude the 'i' in the string 
        comp2 = Integer.parseInt(b.substring(j+1, b.length()-1));
        
        //( 1+1i + 1+1i => (1*1) - (1i*1i) + (1*1i) + (1*1i) ) 
        //                  1    -   (-1) +     1i  +   1i
        //                       0         +        2i
        //                              0+2i
        builder.append( (real1*real2) - (comp1*comp2) + "+" + ((real1*comp2) + (real2*comp1)) + "i");
        
        return builder.toString();
        
    }
}