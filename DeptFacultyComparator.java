//   Assignment: ASU CSE205 Spring 2021 #8
//         Name: Joseph Kharzo
//    StudentID: 1218555299
//      Lecture: (TTH) 1:30-2:45 
//  Description: The class compares two different department object's faculty
//               names, and it returns an integer based on the alphabetical order
//               of the two strings.

import java.util.Comparator;

public class DeptFacultyComparator implements Comparator<Department>
{
	//First we compare the currentFaculty's last name, if they are same, we then compare
	//their first names. The departments should be listed in the alphabetical order of the
	//currentFaculty's last and first names
        @Override
	public int compare(Department first, Department second)
	{
            int alphabeticalDifference = first.getFaculty().getLastName().compareTo(second.getFaculty().getLastName());
            
            if(alphabeticalDifference == 0){
                alphabeticalDifference = first.getFaculty().getFirstName().compareTo(second.getFaculty().getFirstName());
            }
            
            return alphabeticalDifference;

	}
}
