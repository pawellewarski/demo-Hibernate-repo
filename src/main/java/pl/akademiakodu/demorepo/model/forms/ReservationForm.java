package pl.akademiakodu.demorepo.model.forms;

import lombok.Getter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ReservationForm {

    @Getter
    private String firstname;
    @Getter
    private String lastname;
    @Getter
    private String date;
    @Getter
    private String adres;


    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

/*//    Stare Podejście
    public Date getFormatedDate(){

        try{
            //YYYY-MM-DD
            return new Date(format.parse(date).getTime())
        } catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }*/

    public LocalDate getFormatedDate(){
        // YYYY-MM-DD

        return LocalDate.parse(String.format(date, format));
    }


}
