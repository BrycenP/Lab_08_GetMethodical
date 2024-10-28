import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth;
        int birthDate;
        int birthHour;
        int birthMin;

        birthMonth = SafeInput.getRangedInt(in, "Please enter your birth month 1-12", 1, 12 );
        if(birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12){
            birthDate = SafeInput.getRangedInt(in, "Please enter the day of the month you were born 1-31", 1, 31);
        } else if (birthMonth == 2) {birthDate = SafeInput.getRangedInt(in, "Please enter the day of the month you were born 1-29", 1, 29);}
        else{
            birthDate = SafeInput.getRangedInt(in, "Please enter the day of the month you were born 1-30", 1, 30);
        }

        birthHour = SafeInput.getRangedInt(in, "Please hour of the day you were born 1 - 24", 1, 24);
        birthMin = SafeInput.getRangedInt(in, "Please enter the minute of the hour you were born 0 - 59", 0, 59);
    }
}
