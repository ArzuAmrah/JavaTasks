package date;

import java.time.LocalDate;
import java.time.Period;

public class CalculateTheDifferenceBetweenTwoDates {
    public static void main(String[] args) {

     LocalDate startDate = LocalDate.of(1998, 11, 5 );
     LocalDate endDate = LocalDate.of(2000, 11, 27);

     Period period = Period.between(startDate, endDate);

        System.out.println("Iki tarix arasindaki ferq:" + " " + period.getYears() + "il" + " " + period.getMonths() + "ay" + " " + period.getDays() + "gün");

    }
}
