package edu.umuc.cmsc495.trackit.models;

/**
 *
 * @author Jacob Poage
 * @version 1.0
 * @since   
 */
public class Employee {

    private String f_name;
    private String l_name;
    private static int lastId = 0;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int id;
    private Department department;
    private Login login;
    private String email;

    /**
     * @param f_name
     * @param l_name
     * @param dept
     */
    public Employee(String f_name, String l_name, Department dept) {
        
        // Setting the ID to the last ID +1, also incrementing last ID
        this.id = ++lastId;
        this.firstName = f_name;
        this.lastName = l_name;
        this.department = dept;
    }

    /**
     * @param f_name
     * @param l_name
     * @param iD
     * @param dept
     * @param emailPrefix
     */
    public Employee(String f_name, String l_name, int iD, Department dept, String emailPrefix) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.id = iD;
        this.department = dept;
        this.email = emailPrefix + "@MGSH.com";

        char[] name = f_name.toCharArray();
        String username = name[0] + l_name;
        //Initial Login setup
        //String username, String password, String email
        setLogin(username, "default", email);
    }

    /**
     * Get the value of f_name
     *
     * @return the value of f_name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of f_name
     *
     * @param firstName new value of f_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the value of l_name
     *
     * @return the value of l_name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of l_name
     *
     * @param lastName new value of l_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of ID
     *
     * @param iD new value of ID
     */
    public void setId(int iD) {
        this.id = iD;
    }

    /**
     * Get the value of department
     *
     * @return the value of department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Set the value of department
     *
     * @param dept new value of department
     */
    public void setDepartment(Department dept) {
        this.department = dept;
    }

    /**
     * Get the value of login
     *
     * @return the value of login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Set the value of login
     *
     * @param username new value of username
     * @param password new value of password
     * @param email new value of email
     */
    private void setLogin(String username, String password, String email) {
        this.login = new Login(username, password, email, null);
    }

    /**
     * Get the value of phoneNumber
     *
     * @return the value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the value of phoneNumber
     *
     * @param phoneNumber new value of phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return String.format("%s %s (Phone: %s Dept: %s)", 
                firstName,
                lastName,
                phoneNumber,
                department);
    }
    
}
