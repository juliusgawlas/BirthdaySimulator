/****************************************************
 *     Birthday Paradox Problem Simulation
 *                 
 * Expected output: 
 * (percents could be slightly different)                
 * 
 * With 23 students, there is a 50.79% chance that 
 * at least 2 have the same birthday.
 * 
 * With 70 students, there is a 99.91% chance that
 * at least 2 have the same birthday.
 * 
 * What did you get for 35 students? 
***************************************************/

class Main {
    /** 
     * This method should do the following
     * --> create an array of size 'classSize'
     * --> fill the array with random numbers from 1 to 365
     * --> return true if two or more numbers in the array 
     *     are the same else return false
     */
    public static boolean testRandomClass(int classSize) {
      boolean hasTwoSameBirthdays = false;
      
      // <<< COMPLETE THE CODE, THIS IS JUST A PLACEHOLDER >>>
      
      return hasTwoSameBirthdays;
    }
    /** 
     * This method calls the 'testRandomClass' method within 
     * a for loop 1000 times.  It then prints out the
     * percent of times that at least 2 students have the 
     * same birthday (in other words how many times testRandomClass
     * returned true.
     */
    public static void testProbablity(int classSize) {
        
        // <<< COMPLETE THE CODE >>>
        
    }
    
    /***
     * The main method is complete. 
     */
    public static void main(String[] args) { 
        System.out.println("Testing probablity for 23 people:");
        testProbablity(23); 
        System.out.println("Testing probablity for 40 people:");
        testProbablity(40); 
        System.out.println("Testing probablity for 70 people:");
        testProbablity(70); 
    }
}
