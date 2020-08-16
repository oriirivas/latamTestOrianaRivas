package com.testLatam.orianaRivas;

import com.testLatam.orianaRivas.dto.PersonResponse;
import com.testLatam.orianaRivas.imp.PersonImp;
import com.testLatam.orianaRivas.model.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.time.LocalDate;

@SpringBootTest
class OrianaRivasApplicationTests {
	PersonImp personImp = new PersonImp();

	/**
	 * test information birthday if today is not his birthday
	 * (age, name, and how many days and moths until his birthday)
	 * Prueba que la informcaión del cumpleaños
	 * (edad, nombre, y cuantos dias y meses falta para el proximo cumpleaños)
	 * @throws ParseException
	 */
	@Test
	public void birthdayInfo() throws ParseException {
		Person person = new Person();
		person.setName("Oriana Isabel Rivas Parra");
		person.setBirthdayDate("1998-02-10");
		PersonResponse result = personImp.birthdayInfo(person);
		PersonResponse expect = new PersonResponse();
		expect.setName("Oriana Rivas");
		expect.setAge(22);
		expect.setNextBirthdayDays(25);
		expect.setNextBirthdayMonths(5);
		Assert.assertEquals(expect.getName(), result.getName());
		Assert.assertEquals(expect.getAge(), result.getAge());
		Assert.assertEquals(expect.getNextBirthdayMonths(), result.getNextBirthdayMonths());
		Assert.assertEquals(expect.getNextBirthdayDays(), result.getNextBirthdayDays());
		Assert.assertEquals(expect.getPoems(), result.getPoems());
	}

	/**
	 * test information birthday if today is his birthday
	 * (age, name, and how many days and moths until his birthday)
	 * Prueba que la informcaión del cumpleaños
	 * (edad, nombre, y cuantos dias y meses falta para el proximo cumpleaños)
	 * @throws ParseException
	 */
	@Test
	public void birthdayInfoisBirthday() throws ParseException {
		Person person = new Person();
		person.setName("Oriana Isabel Rivas Parra");
		LocalDate now = LocalDate.now();
		person.setBirthdayDate(now.toString());
		PersonResponse result = personImp.birthdayInfo(person);
		PersonResponse expect = new PersonResponse();
		expect.setName("Oriana Rivas");
		expect.setAge(0);
		expect.setNextBirthdayDays(0);
		expect.setNextBirthdayMonths(0);
		Assert.assertEquals(expect.getName(), result.getName());
		Assert.assertEquals(expect.getAge(), result.getAge());
		Assert.assertEquals(expect.getNextBirthdayMonths(), result.getNextBirthdayMonths());
		Assert.assertEquals(expect.getNextBirthdayDays(), result.getNextBirthdayDays());
		Assert.assertNotNull(result);
	}

	/**
	 * Test how the name would be split if it has 4 or more words
	 * Prueba como se partirá el nombre si este tiene
	 * 4 palabras o mas
	 */
	@Test
	public void splitName4wordsOrMoreWords() {
		String result = personImp.splitName("Oriana Isabel Rivas Parra");
		Assert.assertEquals("Oriana Rivas", result);
	}
	/**
	 * Test how the name would be split if it has 3 words
	 * Prueba como se partirá el nombre si este tiene
	 * 3 palabras
	 */
	@Test
	public void splitName3words() {
		String result = personImp.splitName("Oriana Rivas Parra");
		Assert.assertEquals("Oriana Rivas", result);
	}
	/**
	 * Test how the name would be split if it has 2 words
	 * Prueba como se partirá el nombre si este tiene
	 * 2 palabras
	 */
	@Test
	public void splitName2words() {
		String result = personImp.splitName("Oriana Rivas");
		Assert.assertEquals("Oriana Rivas", result);
	}
	/**
	 * Test how the name would be split if it has 1 word
	 * Prueba como se partirá el nombre si este tiene
	 * 1 palabra
	 */
	@Test
	public void splitName1word() {
		String result = personImp.splitName("Oriana");
		Assert.assertEquals("Oriana", result);
	}
	/**
	 * Test how the name would be split if it is empty
	 * Prueba como se partirá el nombre si este esta vacio
	 */
	@Test
	public void splitNameNull() {
		String result = personImp.splitName("");
		Assert.assertEquals("Sin Nombre", result);
	}

	/**
	 * test calculating age
	 * prueba calcular la edad
	 * @throws ParseException
	 */
	@Test
	public void calculateBirthday() throws ParseException {
		int result = personImp.calculateBirthday("1974-04-22", 1);
		Assert.assertEquals(46, result);
	}
	/**
	 * test calculating how many months until his next birthday
	 * prueba calcular los meses que faltan para el proximo cumpleaños
	 * @throws ParseException
	 */
	@Test
	public void calculateMonthForBirthday() throws ParseException {
		int result = personImp.calculateBirthday("1974-04-22", 2);
		Assert.assertEquals(8, result);
	}
	/**
	 * test calculating how many days until his next birthday
	 * prueba calcular los dias que faltan para el proximo cumpleaños
	 * @throws ParseException
	 */
	@Test
	public void calculateDaysForBirthday() throws ParseException {
		int result = personImp.calculateBirthday("1974-04-22", 3);
		Assert.assertEquals(6, result);
	}
	/**
	 * test what happe if introduce another option
	 * prueba que pasa si se ingresa otra opción
	 * @throws ParseException
	 */
	@Test
	public void calculateBirthdayWihtOtherOption() throws ParseException {
		int result = personImp.calculateBirthday("1974-04-22", 4);
		Assert.assertEquals(0, result);
	}

	/**
	 * Test if poem was obtained
	 * Prueba si se obtuvo el poema
	 */
	@Test
	public void getPoem() {
		String result = personImp.getPoem();
		Assert.assertNotNull(result);
	}

}
