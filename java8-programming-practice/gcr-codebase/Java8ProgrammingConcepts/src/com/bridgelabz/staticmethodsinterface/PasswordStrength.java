package com.bridgelabz.staticmethodsinterface;

interface SecurityUtils{
	static boolean isStrong(String password) {
		if(password.length()<8) {
			return false;
		}
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		
		for(char ch : password.toCharArray()) {
			if(Character.isUpperCase(ch)) hasUpper = true;
			if(Character.isLowerCase(ch)) hasLower = true;
			if(Character.isDigit(ch)) hasDigit = true;
		}
		return hasUpper && hasLower && hasDigit;
		}
	}

public class PasswordStrength {
	public static void main(String[] args) {
		
		String psw = "Novaaaaa14";
		
		if(SecurityUtils.isStrong(psw)) {
			 System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
		}
		
	}

