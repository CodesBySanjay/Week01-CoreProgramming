import java.util.*;
public class OTPGenerator {
    public static void main(String[] args) {
        int[] otp = generateOTP();
        if(validateOTP(otp)) System.out.println("The OTPs are unique!");
        else System.out.println("The OTPs are not unique!");
    }
    public static int[] generateOTP() {
        int[] otp = new int[10];
        for (int i = 0; i < 10; i++) {
            otp[i] = 100000 + (int)(Math.random()*900000);
        }
        return otp;
    }
    public static boolean validateOTP(int[] otp) {
        Arrays.sort(otp);
        for(int i=0;i<(otp.length-1);i++){
            if(otp[i]==otp[i+1]) return false;
        }
        return true;
    }
}