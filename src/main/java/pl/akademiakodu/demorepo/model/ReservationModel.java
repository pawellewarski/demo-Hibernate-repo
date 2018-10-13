package pl.akademiakodu.demorepo.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "reservations")
@Data
@NoArgsConstructor
public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private Date date;
    private String adres;




}
