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
    private String phoneNumber;
    private int ID;
    private Department department;
    private Login login;
    private String email;

    /**
     * @param f_name
     * @param l_name
     * @param iD
     * @param dept
     */
    public Employee(String f_name, String l_name, int iD, int dept) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.ID = iD;
        this.department = new Department(dept);
    }

    /**
     * @param f_name
     * @param l_name
     * @param iD
     * @param dept
     * @param emailPrefix
     */
    public Employee(String f_name, String l_name, int iD, int dept, String emailPrefix) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.ID = iD;
        this.department = new Department(dept);
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
    public String getF_name() {
        return f_name;
    }

    /**
     * Set the value of f_name
     *
     * @param f_name new value of f_name
     */
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    /**
     * Get the value of l_name
     *
     * @return the value of l_name
     */
    public String getL_name() {
        return l_name;
    }

    /**
     * Set the value of l_name
     *
     * @param l_name new value of l_name
     */
    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Set the value of ID
     *
     * @param iD new value of ID
     */
    public void setID(int iD) {
        this.ID = iD;
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
    public void setDepartment(int dept) {
        this.department = new Department(dept);
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

}
