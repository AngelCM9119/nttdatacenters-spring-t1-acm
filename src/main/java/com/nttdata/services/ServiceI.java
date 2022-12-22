package com.nttdata.services;

import java.util.List;

import com.nttdata.repository.Person;

/**
 * Servicio
 * @author Angel
 *
 */
public interface ServiceI
{
	/**
	 * Construye el edificio
	 */
	public void initBuilding();
	
	/**
	 * Inserta una persona en una planta y habitación del edificio
	 * @param floor Planta
	 * @param room Habitación
	 */
	public void insertPerson(Person person, int floor, int room);
	
	/**
	 * Devuelve todas las personas
	 * @return Una lista con todas las personas
	 */
	public List<Person> getAllPerson();

	/**
	 * Devuelve la persona buscada por nombre y apellidos
	 * @param name El nombre de la persona
	 * @param lastname Los apellidos de la persona
	 * @return Un objeto Persona con sus datos
	 */
	public Person getPersonByFullname(String name, String lastname);
}
