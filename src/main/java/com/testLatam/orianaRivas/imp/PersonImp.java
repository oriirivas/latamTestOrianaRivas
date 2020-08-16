package com.testLatam.orianaRivas.imp;

import com.testLatam.orianaRivas.controller.PersonController;
import com.testLatam.orianaRivas.model.Person;
import com.testLatam.orianaRivas.model.Poems;
import com.testLatam.orianaRivas.service.IPersonService;
import com.testLatam.orianaRivas.dto.PersonResponse;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.Period;
import java.util.Calendar;

@Service
public class PersonImp implements IPersonService<PersonResponse, Person> {

    /**
     * Use splitName(), calculateBirthday() and getPoem() method
     * to get information need it to response a PersonResponse model
     * Usa los metodos splitName(), calculateBirthday() y getPoem() para retornar un
     * elemento del tipo PersonResponse
     * @param person Person
     * @return personResponse PersonResponse
     * @throws ParseException
     */
    @Override
    public PersonResponse birthdayInfo(Person person) throws ParseException {
        String name = this.splitName(person.getName());
        PersonResponse personResponse = new PersonResponse();
        int age = this.calculateBirthday(person.getBirthdayDate(),1);
        int monthsForBirthDay = this.calculateBirthday(person.getBirthdayDate(),2);
        int daysForBirthday = this.calculateBirthday(person.getBirthdayDate(),3);
        personResponse.setName(name);;
        personResponse.setAge(age);
        personResponse.setNextBirthdayMonths(monthsForBirthDay);
        personResponse.setNextBirthdayDays(daysForBirthday);
        if (monthsForBirthDay == 0 && daysForBirthday == 0){
            personResponse.setPoems(this.getPoem());
        }
        return personResponse;
    }

    /**
     * Slipt all name to get the first name and the last name,
     * if param name is just one word, it is return it.
     * Parte el nombre completo para optener el primer nombre y
     * el primer apellido de la perosona, si solo se recibe un nombre,
     * este mismo retornara.
     * @param name String with all name
     * @return string with just the first name and last name
     */
    public String splitName(String name){
        if(name == null || name ==""){
            return "Sin Nombre";
        }
        String[] parts = name.split(" ");
        if (parts.length < 4 && parts.length>1)
        {
            return parts[0] + " " + parts[1];
        }else if (parts.length==1){
            return parts[0];
        }
        return parts[0] + " " + parts[2];
    }

    /**
     * Calculate the age, days and months until the next birthday.
     * Calcula la edad, los dias y mese que faltas para el proximo cumpleaños.
     * dependiendo del parameto i se retornara una de las opciones,
     * 1 retorna la edad,
     * 2 retorna los meses que falta para el proximo cumpleaños
     * 3 retorna los dias del mes que falta para el proximo cumpleaños
     * @param date String with the date of the birthdat
     * @param i int to specify that it will return, could be
     *          age, days and months until the next birthday
     * @return if i is equals to 1 return the age
     *         if i is equals to 2 return the months until the next birthday
     *         if i is equals to 3 return the days of the month until the next birthday
     * @throws ParseException
     */
    public int calculateBirthday(String date, int i) throws ParseException {
        Calendar today = Calendar.getInstance();
        Calendar birthdayDate = Calendar.getInstance();
        LocalDate now = LocalDate.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = simpleDateFormat.parse(date);
        birthdayDate.setTime(dob);
        int year = birthdayDate.get(Calendar.YEAR);
        int month = birthdayDate.get(Calendar.MONTH) + 1;
        int day = birthdayDate.get(Calendar.DATE);
        LocalDate age = LocalDate.of(year, month, day);
        LocalDate nextBirthday = today.get(Calendar.MONTH)+1 < birthdayDate.get(Calendar.MONTH)+ 1
                ? LocalDate.of(today.get(Calendar.YEAR), month, day)
                : LocalDate.of(today.get(Calendar.YEAR)+1, month, day);
        Period calculateAge = Period.between(age, now);
        Period calculateNextBirthday = Period.between(now,nextBirthday);
        switch (i){
            case 1 : return  calculateAge.getYears();
            case 2 : return  calculateNextBirthday.getMonths();
            case 3 : return  calculateNextBirthday.getDays();
        }
        return 0;
    }

    /**
     * From the list of poems obtained from the getPoems () method,
     * a random number is calculated between zero and the number of items
     * from the list minus one. The poem that is in the position is returned.
     * De la lista de poemas que se optiene del metodo getPoems(),
     * se calcula un numero aleatorio entre cero y la cantidad de items
     * de la lista menos uno. Se retorna el poema que este en la posición
     * calculada.
     * @return Sting with a random poem
     */
    public String getPoem() {
        PersonController pc = new PersonController();
        Poems[]  poemslist = pc.getPoems();
        int i = poemslist.length;
        double poem = Math.floor(Math.random()*i);
        return poemslist[(int) poem].getContent();
    }

}
