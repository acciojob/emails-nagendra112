package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        if(oldPassword.equals(this.password) && newPassword.length()>=8){
            //System.out.println(getPassword());
            for(int i=0; i<newPassword.length(); i++){
                char ch = newPassword.charAt(i);
                if(Character.isUpperCase(ch))
                    upperCount++;
                else if(Character.isLowerCase(ch))
                    lowerCount++;
                else if(Character.isDigit(ch))
                    digitCount++;
            }
            if(upperCount>0 && lowerCount>0 && digitCount>0 && (upperCount+lowerCount+digitCount) < newPassword.length()){
                this.password = newPassword;
            }
        }
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
}
