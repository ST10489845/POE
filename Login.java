/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String username;
    private String password;
    private String cellNumber;

    public Login(String username, String password, String cellNumber) {
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;    
    }

    public boolean checkUsername() { 
        return username.contains("_") && username.length() == 5; 
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*()].*");
    }

    public boolean checkCellPhoneNumber() {
        return cellNumber.length() == 12 && cellNumber.startsWith("+27");
    }

    public String registerUser (boolean isUsernameValid, boolean isPasswordValid) {
        if (isUsernameValid && isPasswordValid) {
            return "REGISTRATION SUCCESSFUL";
        } else if (!isPasswordValid) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";      
        } else if (!isUsernameValid) {
            return "Username is incorrect, please ensure that the username contains an underscore and is exactly five characters in length.";
        }
        return null;
    }

    public boolean loginUser (String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(boolean loginResults) {
        if (loginResults) {
            return "Successful login. Welcome, " + username + "! It is great to see you again.";
        } else {
            return "Login failed. Username or password incorrect, please try again.";
        }
    }
}
