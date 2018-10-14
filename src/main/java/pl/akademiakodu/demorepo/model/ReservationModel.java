package pl.akademiakodu.demorepo.model;

import lombok.*;
import pl.akademiakodu.demorepo.model.forms.ReservationForm;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity //Logiczny odpowiednik tabeli,
@Table(name = "reservations")
@Data //odpowiednik @Getter; @Setter; @ToString; @EqualsAndHashCode;
@NoArgsConstructor
public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate date;
    private String adres;

    public ReservationModel(ReservationForm form) {
        firstname = form.getFirstname();
        lastname = form.getLastname();
        date = form.getFormatedDate();
        adres = form.getAdres();



    }


}
