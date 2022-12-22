package com.nttdata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.repository.Person;
import com.nttdata.services.ServiceI;

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	private ServiceI service;
	
	public static void main(String[] args)
	{
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		service.initBuilding();
		
		Person p1 = new Person();
		p1.setName("Amador");
		p1.setLastname("Rivas");
		service.insertPerson(p1, 1, 1);
		
		Person p2 = new Person();
		p2.setName("Enrique");
		p2.setLastname("Pastor");
		service.insertPerson(p2, 1, 2);
		
		Person p3 = new Person();
		p3.setName("Antonio");
		p3.setLastname("Recio");
		service.insertPerson(p3, 2, 1);
		
		Person p4 = new Person();
		p4.setName("Raquel");
		p4.setLastname("Villanueva");
		service.insertPerson(p4, 2, 2);
		
		Person p5 = new Person();
		p5.setName("Javier");
		p5.setLastname("Maroto");
		service.insertPerson(p5, 3, 1);
		
		Person p6 = new Person();
		p6.setName("Judit");
		p6.setLastname("Becker");
		service.insertPerson(p6, 3, 2);
		
		// muestra todas las personas del edificio
		List<Person> list = service.getAllPerson();		
		System.out.println(list);
		
		// busca una persona por su nombre y apellido
		Person p = service.getPersonByFullname("Antonio", "Recio");
		System.out.println(p);
	}

}
