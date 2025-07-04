package lib;

public class PasswordValidator {

    /**
     * โปรแกรมนี้จะตรวจสอบรหัสผ่าน
     * @param case1จะตรวจสอบความสั้นของรหัสผ่าน  case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK case 3: รหัสผ่านมีตัวใหญ่มากกว่าเท่ากับ 1 จะ MEDIUM case 4:รหัสผ่านมีตัวใหญ่ตัวเล็กผสมกันจะ STRONG
     *
     * @return ตัวรหัสผ่านว่ามีความแข็งแรงระดับไหน
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
       if(password==null || password.length() < 8)
            return PasswordStrength.INVALID ;
        
        Boolean hasLower = false ;
        Boolean hasUpper = false ;
        Boolean Number = false ;
        Boolean Ap = false ;

        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
                hasLower = true ;
            else if(Character.isUpperCase(c))
                hasUpper = true ;
            if(Character.isDigit(c))
                    Number = true ;
            if(!Character.isLetterOrDigit(c))
                    Ap = true ;

        }

        if(hasLower && !hasUpper) return PasswordStrength.WEAK ;
        if(hasLower &&  hasUpper && !Ap && !Number) return PasswordStrength.MEDIUM ;
        if(hasUpper && hasLower && Number && Ap) return PasswordStrength.STRONG ;
        return PasswordStrength.INVALID ;
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        //int minLength = 8 // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}