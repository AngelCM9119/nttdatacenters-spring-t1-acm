package com.nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.repository.Person;

/**
 * Implementacion del servicio
 * @author Angel
 *
 */
@Service
public class ServiceImpl implements ServiceI
{
	/** Numero total de plantas */
	public static final int MAX_FLOORS = 3;
	
	/** Numero total de habitaciones */
	public static final int MAX_ROOMS = 2;
	
	/** Edificio */
	private List<List<Person>> building;

	@Override
	public void initBuilding()
	{
		building = new ArrayList<>(MAX_FLOORS);
		
		for(int i = 0; i < MAX_FLOORS; i++)
			building.add(new ArrayList<>(MAX_ROOMS));
	}

	@Override
	public void insertPerson(Person person, int floor, int room)
	{
		if(floor > 0 && floor <= MAX_FLOORS && room > 0 && room <= MAX_ROOMS)
			building.get(floor - 1).add(room - 1, person);
		else
			System.out.println("Número de planta o habitación no válido");
	}
	
	@Override
	public List<Person> getAllPerson()
	{
		List<Person> list = new ArrayList<>();
		
		for(int i = 0; i < MAX_FLOORS; i++)
			for(int j = 0; j < MAX_ROOMS; j++)
				list.add(building.get(i).get(j));
		
		return list;
	}

	@Override
	public Person getPersonByFullname(String name, String lastname)
	{
		for(int i = 0; i < MAX_FLOORS; i++)
			for(int j = 0; j < MAX_ROOMS; j++)
			{
				Person p = building.get(i).get(j);
				
				if(p.getName().equals(name) && p.getLastname().equals(lastname))
					return p;
			}
		
		return null;
	}

	
	
}
