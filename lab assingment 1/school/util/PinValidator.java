    package util;

public class PinValidator {

    public class Rules {

      
        public boolean isValidFormat(String pin) {

          
            if (pin.length() == 4 && pin.matches("\\d{4}")) {
                return true;
            } else {
                System.out.println("INVALID PIN! Please enter again.");
                return false; // Invalid PIN
            }
        }
    }
}
         