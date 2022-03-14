package password;

import java.util.Scanner;

public class CreatePassword {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a password: ");
		String password = input.nextLine();

		if ((enoughNumbers(password)) && (hasUppercase(password)) && (hasLowercase(password)) && hasSpecialChar(password)) {
			System.out.println("Password valid and accepted!");
        }

      }

      public static boolean enoughNumbers(String password) {
       boolean enoughNumbers = true;
       if ((password.length() < 7)) {
          System.out.println("Error, Password must have at least seven characters");
          return false;
        } else if ((password.length() > 12)) {
                   System.out.println("Error, Password must have less than 12 characters");
                   return false;
        } else {
                   return true;
        }

       }
      public static boolean hasUppercase(String password) {
                  for (int i = 0; i < password.length(); i++) {
                  if (Character.isUpperCase(password.charAt(i))) {
                 return true;
        }

        }
           System.out.println("Error, Password must contain one Upper case value.");
                    return false;

      }
      public static boolean hasLowercase(String password) {
               for (int i = 0; i < password.length(); i++) {
               if (Character.isLowerCase(password.charAt(i))) {
                  return true;
        }

        }
          System.out.println("Error, Password must contain one Lower case value.");
                 return false;
      }
      public static boolean hasSpecialChar(String password) {
             for (int i = 0; i < password.length(); i++) {
             if (password.contains("!")) {
                 return true;
        }

         }
            System.out.println("Error, Password must contain an !");
                 return false;

      }
}


	

	    
	   
