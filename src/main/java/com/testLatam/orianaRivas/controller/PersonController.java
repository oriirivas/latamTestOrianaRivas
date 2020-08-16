package com.testLatam.orianaRivas.controller;

import com.testLatam.orianaRivas.imp.PersonImp;
import com.testLatam.orianaRivas.model.Person;
import com.testLatam.orianaRivas.model.Poems;
import com.testLatam.orianaRivas.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @Autowired
    private PersonImp personImp;

    /**
     * Whit the params all name and birthday date return a
     * personResponse PersonResponse (first name and last name, age,
     * how many days and moth until the next birthday and random poem if today
     * is person's birthday)
     * Con los parametros de nombre y fecha de nacimiento retorna personResponse PersonResponse
     * (edad, primer nombre y primer apellido, cuanto falta para su proximo cumpleaños
     * y un poema aleatorio si hoy es el cumpleaños de la persona
     * y si hoy esta cumpliendo años tambien retorna un poema)
     * @param name All name of the person
     * @param date bithday date
     * @return personResponse PersonResponse
     */
    @RequestMapping(value ="/{name}/{date}" ,method = RequestMethod.GET)
    public ResponseEntity<Object> getBirthday2(@PathVariable String name,
                                               @PathVariable String date){
        ResponseEntity<Object> rs = null;
        try{
            if( name != null && date != null){
                Person person = new Person();
                person.setName(name);
                person.setBirthdayDate(date);
                rs = new ResponseEntity<Object>(personImp.birthdayInfo(person), HttpStatus.OK);
            }
        }catch(Exception exception) {
            exception.printStackTrace();
            rs = new ResponseEntity<Object>(Constant.ERROR, HttpStatus.NOT_FOUND);
        }
        return rs;
    }

    /**
     * Get a list of poems form https://www.poemist.com/api/v1/randompoems
     * Trae una lista de poemas desde https://www.poemist.com/api/v1/randompoems
     * @return a list Poems
     */
    public Poems[] getPoems (){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Poems[]> call= restTemplate.getForEntity("https://www.poemist.com/api/v1/randompoems",Poems[].class);
        return call.getBody();

    }



}
