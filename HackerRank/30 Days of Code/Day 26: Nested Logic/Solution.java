import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Solution {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate dateReturned = LocalDate.of(2020,1,1);
        dateReturned = dateReturned.withDayOfMonth(Integer.parseInt(scanner.next()));
        dateReturned = dateReturned.withMonth(Integer.parseInt(scanner.next()));
        dateReturned = dateReturned.withYear(Integer.parseInt(scanner.next()));
        LocalDate dateDue = LocalDate.of(2020,1,1);
        dateDue = dateDue.withDayOfMonth(Integer.parseInt(scanner.next()));
        dateDue = dateDue.withMonth(Integer.parseInt(scanner.next()));
        dateDue = dateDue.withYear(Integer.parseInt(scanner.next()));
        int diff = (int)dateDue.until(dateReturned, ChronoUnit.DAYS);
        int fine;
        if(diff<=0)
            fine = 0;
        else if(dateDue.getYear() == dateReturned.getYear()){
            if(dateDue.getMonthValue() == dateReturned.getMonthValue())
                fine = 15*diff;
            else
                fine = 500*(dateReturned.getMonthValue()-dateDue.getMonthValue());
        }else
            fine = 10000;
        System.out.println(fine);
    }   
}
