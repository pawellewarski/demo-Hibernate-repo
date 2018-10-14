package pl.akademiakodu.demorepo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.demorepo.model.ReservationModel;
import pl.akademiakodu.demorepo.model.forms.ReservationForm;
import pl.akademiakodu.demorepo.model.repositories.ReservationRepository;

import java.sql.Date;
import java.util.Calendar;

@Controller
public class MainController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index(Model model){
//        ReservationModel model = new ReservationModel();
        /*model.setAdres("Warszawa");
        model.setDate(new Date(Calendar.getInstance().getTimeInMillis()));
        model.setFirstname("Paweł");
        model.setLastname("Lewarski");

        reservationRepository.save(model);*/

        model.addAttribute("reservationForm", new ReservationForm());
        return "index";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        /*ReservationModel model = new ReservationModel();
        model.setAdres("Skierniewice");
        model.setDate(new Date(Calendar.getInstance().getTimeInMillis()));
        model.setFirstname("Paweł");
        model.setLastname("Lewarski");

        reservationRepository.save(model);*/
        return "Zapisałem dane z test";
    }



}
