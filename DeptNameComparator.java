//   Assignment: ASU CSE205 Spring 2021 #8
//         Name: Joseph Kharzo
//    StudentID: 1218555299
//      Lecture: (TTH) 1:30-2:45 
//  Description: The class compares two different department object's department
//               names, and it returns an integer based on the alphabetical order
//               of the two strings.

import java.util.Comparator;

/**
 *
 * @author Joseph
 */
public class DeptNameComparator implements Comparator<Department> {
    
    /**
     * Compares the department names of two Department objects. If the first name
     * comes first alphabetically, then the method returns a negative number, if 
     * the first name is equal, alphabetically, to the second name, then the method 
     * returns 0, and if the first department name comes last alphabetically, then
     * a positive number, greater than 0, is returned.
     * 
     * @param firstDepartment  A department object
     * @param secondDepartment A second department object
     * @return                 the result of the compareTo() method
     */
    @Override
    public int compare(Department firstDepartment, Department secondDepartment){
        
        int alphabeticalDifference = firstDepartment.getDeptName().compareTo(secondDepartment.getDeptName());
                
        return alphabeticalDifference;
        
    }
    
}
