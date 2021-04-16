//   Assignment: ASU CSE205 Spring 2021 #8
//         Name: Joseph Kharzo
//      Lecture: (TTH) 1:30-2:45 
//  Description: The class compares two different department object's faculty
//               numbers, and it returns an integer based on the alphabetical order
//               of the two integers.

import java.util.Comparator;

/**
 *
 * @author Joseph
 */
public class FacultyNumberComparator implements Comparator<Department> {
 
    /**
     * Evaluates the integers to find the smallest one. If the first integer is
     * smaller, then a negative number is returned, if the first integer is equal
     * to the second, then 0 is returned, and if first integer is larger, then
     * a positive number is returned.
     * 
     * @param first     A department object
     * @param second    Another department object
     * @return          The difference between the faculty numbers of the objects
     */
    @Override
    public int compare(Department first, Department second){
        
        int sizeDifference = first.getNumOfMembers() - second.getNumOfMembers();
        
        return sizeDifference;
        
    }
    
}
