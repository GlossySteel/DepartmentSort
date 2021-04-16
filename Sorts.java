//   Assignment: ASU CSE205 Spring 2021 #8
//         Name: Joseph Kharzo
//      Lecture: (TTH) 1:30-2:45 
//  Description: Uses a bubble sort to arrange the departments' information.

import java.util.Comparator;
import java.util.ArrayList;

public class Sorts
{
    
    /**
     * A bubble sort that arranges the department arrayList based on the xComparator.
     * The xComparator may refer to the department names, faculty member names, or
     * the faculty numbers.
     * 
     * @param deptList      An arrayList that contains department objects
     * @param xComparator   Refers to any of the information that will be used to sort the list
     */
    public static void sort(ArrayList<Department> deptList, Comparator<Department> xComparator) {

        for (int i = deptList.size() - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if(xComparator.compare(deptList.get(j), deptList.get(j+1)) > 0){
                    swap(deptList,j,j+1);
                }
            }
        }

    } //end sort
    
    /**
     * A helper method that swaps the departments.
     * 
     * @param departments   The arrayList of departments
     * @param firstIndex    The index of the first department object
     * @param secondIndex   The index of the second department object
     */
    public static void swap(ArrayList<Department> departments, int firstIndex, int secondIndex){

        Department temp = departments.get(firstIndex);
        departments.set(firstIndex, departments.get(secondIndex));
        departments.set(secondIndex, temp);



    }
} //end class Sorts
