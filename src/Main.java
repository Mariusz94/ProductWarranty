import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Product  cucumbers = new Product("cucumbers","good","fresh");

        Guarantee cucumbersIsValid = new Guarantee(cucumbers,"2018-06-03");

        Main main = new Main();
        System.out.println(main.isValid(cucumbersIsValid));

    }
   boolean isValid(Guarantee guarantee){
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       LocalDate date = LocalDate.parse(guarantee.getValidUntil(),formatter);
       if (LocalDate.now().isBefore(date)){
          return true;
       }else{
           guarantee.setProduct(null);
           guarantee.setValidUntil(null);
           return false;
       }
   }
}
