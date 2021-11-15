package com.bridgelabz.userrugjunit;

public class Exception {

	public static void main(String[] args) {
		 public boolean validFirstName(String fname) throws UserRegistrationException {
		        try {
		            if (fname.length() == 0)
		                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "First name can not be empty");
		            Pattern pattern = Pattern.compile(NAME_PATTERN);
		            return pattern.matcher(fname).matches();
		        } catch (NullPointerException e) {
		            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "First name cannot be null");
		        }
		    }

		    public boolean validateLastName(String lname) throws UserRegistrationException {
		        try {
		            if (lname.length() == 0)
		                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Last name can not be empty");
		            Pattern pattern = Pattern.compile(NAME_PATTERN);
		            return pattern.matcher(lname).matches();
		        } catch (NullPointerException e) {
		            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Last name cannot be null");
		        }
		    }

		 
		    public boolean validateEmailAddress(String mail) throws UserRegistrationException {
		        try {
		            if (mail.length() == 0)
		                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "E-Mail address can not be empty");
		            Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
		            return pattern.matcher(mail).matches();
		        } catch (NullPointerException e) {
		            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "E-Mail address can not be null");
		        }
		    }

		   
		    public boolean validateMobileNumber(String phoneNumber) throws UserRegistrationException {
		        try {
		            if (phoneNumber.length() == 0)
		                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Mobile number can not be empty");
		            Pattern pattern = Pattern.compile(MOBILE_NUMBER);
		            return pattern.matcher(phoneNumber).matches();
		        } catch (NullPointerException e) {
		            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Mobile number can not be null");
		        }
		    }

		  
		    public boolean validatePassword(String password) throws UserRegistrationException {
		        try {
		            if (password.length() == 0)
		                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "Password can not be empty");
		            Pattern pattern = Pattern.compile(PASSWORD);
		            return pattern.matcher(password).matches();
		        } catch (NullPointerException e) {
		            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Password can not be null");
		        }

		    }
	}

}