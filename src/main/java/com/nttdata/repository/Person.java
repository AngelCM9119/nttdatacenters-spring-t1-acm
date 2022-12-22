package com.nttdata.repository;

public class Person
{
	/** Nombre de la persona */
	private String name;
	
	/** Apellidos de la persona */
	private String lastname;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname()
	{
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", lastname=" + lastname + "]";
	}
	
	
}
