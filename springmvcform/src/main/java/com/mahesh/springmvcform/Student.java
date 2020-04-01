package com.mahesh.springmvcform;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mahesh
 *
 */

public class Student {

	/* firstName */
	private String firstName;
	/* lastName */
	private String lastName;

	/* country */
	private String country;

	private Map<String, String> countryOption = new HashMap<>();

	/* pgmLanguage */
	private String pgmLanguage;

	/**
	 * No arg constructor
	 */
	public Student() {
		countryOption.put("India", "India");
		countryOption.put("Indonesia", "Indonesia");
		countryOption.put("Russia", "Russia");
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countryOption
	 */
	public Map<String, String> getCountryOption() {
		return countryOption;
	}

	/**
	 * @param countryOption the countryOption to set
	 */
	public void setCountryOption(Map<String, String> countryOption) {
		this.countryOption = countryOption;
	}

	/**
	 * @return the pgmLanguage
	 */
	public String getPgmLanguage() {
		return pgmLanguage;
	}

	/**
	 * @param pgmLanguage the pgmLanguage to set
	 */
	public void setPgmLanguage(String pgmLanguage) {
		this.pgmLanguage = pgmLanguage;
	}

}
