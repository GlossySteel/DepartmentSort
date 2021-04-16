//   Assignment: ASU CSE205 Spring 2021 #8
//         Name: Joseph Kharzo
//      Lecture: (TTH) 1:30-2:45 
//  Description: The DeptManagement class conatins a list of all the departments.
//               The class also contains multiple methods that perform various
//               actions on the department list.

import java.io.Serializable;
import java.util.ArrayList;
//import all other necessary classes

public class DeptManagement implements Serializable
{
    
    // Instance variables
    ArrayList<Department> deptList;
    int deptExistsValue;
    
    // Constructor
    public DeptManagement() {
        deptList = new ArrayList<>();
    }

    /**
     * Checks whether a department object contains the provided department name
     * and university name. Returns the index of the object, if one does exist, and
     * if no object is found, then -1 is returned.
     * 
     * @param deptName          A department name
     * @param universityName    A university name
     * @return                  The result of the search
     */
    public int deptExists(String deptName, String universityName) {

        for (int i = 0; i < deptList.size(); i++) {
            if(deptList.get(i).getDeptName().equals(deptName) && deptList.get(i).getUniversity().equals(universityName)){
                return i;
            }
        }

        return -1;
    }

    /**
     * Checks whether a certain faculty member exists based on their name and
     * academic level. Returns -1 if found and the index of the object if not found.
     * 
     * @param firstName         The first name of the faculty member
     * @param lastName          The last name of the faculty member
     * @param academicLevel     The academic level of the faculty member
     * @return                  The result of the search
     */
    public int facultyExists(String firstName, String lastName, String academicLevel) {

        for (int i = 0; i < deptList.size(); i++) {
            if(deptList.get(i).getFaculty().getFirstName().equals(firstName) && deptList.get(i).getFaculty().getLastName().equals(lastName) && deptList.get(i).getFaculty().getAcademicLevel().equals(academicLevel)){
                return i;
            }
        }

        return -1;
    }

    /**
     * Creates a department object and adds it to the list of department objects,
     * and it returns a boolean value based on whether the action was successful
     * or not.
     * 
     * @param deptName          The name of the department
     * @param university        The name of the university
     * @param numOfMembers      The amount of faculty in the department
     * @param firstName         The first name of the faculty member
     * @param lastName          The last name of the faculty member
     * @param academicLevel     The academic level of the faculty member
     * @return                  False if the department was not added and true if it was
     */
    public boolean addDepartment(String deptName, String university, int numOfMembers, String firstName, String lastName, String academicLevel) {

        deptExistsValue = deptExists(deptName,university);

        if(deptExistsValue != -1){

            return false;

        }else{

            Department newDepartment = new Department( deptName,  university,  numOfMembers,  firstName,  lastName,  academicLevel);

            deptList.add(newDepartment);

            return true;
        }
    }

    //***will remove all departments with the same name and university
    public boolean removeDepartment(String deptName, String universityName) {

        deptExistsValue = deptExists(deptName,universityName);

        if(deptExistsValue == -1){
            return false;
        }else{
            deptList.remove(deptExistsValue);
            return true;
        }

    }

    // The following three methods refer to the Sorts class, and they provide an
    // object for the xComparator. This is each sort occurs based on the department
    // name, the faculty number, or the faculty name.
    public void sortByDepartmentName() {

        DeptNameComparator nameComparator = new DeptNameComparator();

        Sorts.sort(deptList, nameComparator);
    }

    public void sortByFacultyNumbers() {
        FacultyNumberComparator facultyComparator = new FacultyNumberComparator();

        Sorts.sort(deptList, facultyComparator);
    }

    public void sortByDeptFaculty() {
        DeptFacultyComparator facultyComparator = new DeptFacultyComparator();

        Sorts.sort(deptList, facultyComparator);
    }

    // Displays all the department objects that are contained within deptList.
    public String listDepartments() {

        String departmentInformation = "\n";

        if(deptList.isEmpty()){

            departmentInformation = "\nNo Department\n\n";
            return departmentInformation;

        }else{
            for(Department department:deptList){
                departmentInformation += department.toString();
            }
            return departmentInformation += "\n";
        }
    }

    // Empties the list of department objects
    public void closeDeptManagement() {
        deptList.clear();
    }
}
