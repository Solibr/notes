/**
 * isSquare method returns True, if recieved value vas Square Number,
 * else returns False.
 * Square Number is a result of multiplying integer value by itself.
 */

public class Square {    

    /**
     * In this solution I tried to predict rounding error, especially, if value is a big number
     */
    public static boolean isSquare(int n) {   
        double root = Math.sqrt((double) n);             
        
        // Trying to find sorroundings integer values. It may be the same value, if initial value was SquareNumber
        int rootUp = (int) Math.ceil(root);
        int rootDown = (int) Math.floor(root);
        
        // If some of square from surroundings integer values equals initial value — it was a SquareNumber
        if((int) Math.pow(rootDown, 2.0) == n || (int) Math.pow(rootUp, 2.0) == n) {
            return true;
        } else {
            return false;
        }
    }
}
