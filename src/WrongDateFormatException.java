
public class WrongDateFormatException extends Exception{
    String message;
    WrongDateFormatException(){
        message = "You should enter the date in the format DD/MM/YY";
    }
}
