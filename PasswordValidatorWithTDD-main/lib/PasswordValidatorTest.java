package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: "+pw+" Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: "+pw+" Expected INVALID but got " + result1);
        }

        // case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
         pw = "ghjjghjf" ;
         PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: "+pw+" Alllower password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: "+pw+" Expected WEAK but got " + result2);
        }

        // case 3: รหัสผ่านมีตัวใหญ่ 1 จะ MEDIUM
         pw = "Ghjjghjf" ;
         PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: "+pw+" has1Upper password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: "+pw+" Expected MEDIUM but got " + result3);

        }
         // case 4:รหัสผ่านมีตัวใหญ่ตัวเล็กผสมกับตัวเลขและอักษรพิเศษจะ STRONG
        pw = "Fh_262GhgAFF&" ;
         PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: "+pw+" มีตัวใหญ่ตัวเล็กและอักษรพิเศษ password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: "+pw+" Expected STRONG but got " + result4);
        }


        System.out.println("--------------------------------");
    }
}
