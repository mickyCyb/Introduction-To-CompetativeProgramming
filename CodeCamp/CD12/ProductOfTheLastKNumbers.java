/**
 * ProductOfTheLastKNumbers
 */
import java.util.*;
public class ProductOfTheLastKNumbers {

    public static void main(String[] args) {
       
    }
}

class ProductOfNumbers {

    ArrayList<Integer> productArray;
    public ProductOfNumbers() {
        productArray = new ArrayList<>();
        add(0);
    }
    
    public void add(int num) {
         if(num >0){           
                productArray.add(productArray.get(productArray.size() -1) * num);
         }
        else{
            productArray.clear();
            productArray.add(1);
        }
    }
    
    public int getProduct(int k) {
        int length = productArray.size();
        if(k < length){
            
            return productArray.get(length - 1) / productArray.get(length - k - 1);
        }
        else{
            return 0;
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */