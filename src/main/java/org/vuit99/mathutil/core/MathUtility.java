
package org.vuit99.mathutil.core;

/**
 *
 * @author NguyenTuanVu
 */
public class MathUtility {
//class nay clone giong class java.util.Math 
 //chưa các hàm static Math.sqrt(), ..
    public static final double PI = 3.14;
    
    //ham getF() la tinh m! = 1.2.3...n
    //0! = 1! = 1
    //ko co giai thua cho so am, neu dua -5! -> chui; nem ra Exception
    //vì giai th?a tang r?t nhanh, 21! long ko chua noi,(Long 18 so 0)
    //20! vua du cho long
    //21! 22! 23! > 20! > CHUI, nem ra Exception
    public static long getFactorial(int n){
        if(n<0 || n > 20){
            throw  new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        }
        if(n == 0 || n == 1)
            return 1;
        long product = 1; //biến lưu dồn các tích
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
            
        
    }
    
    
}
