/**
 * 
 */
package com.mahesh.springmvcvalidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mahesh.springmvcvalidation.customized.CourseCode;

/**
 * @author Mahesh
 *
 */
public class Customer {

	/* firstName */
	private String firstName;

	/* lastName */
	@NotNull(message = "is Required")
	@Size(min = 1, message = "required")
	private String lastName;

	/* freepasses */
	@NotNull
	@Min(value = 0, message = "must be greater than or equal to 0")
	@Max(value = 10, message = "must be less than or equal to 10")
	private Integer freePasses;

	/* postalCode */
	@Pattern(regexp = "[a-zA-Z0-9]{5}", message = "Only 5 characters")
	private String postalCode;

	@CourseCode(value = "ABC", message = "Course code must start with ABC")
	private String courseCode;

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
	 * @return the freePasses
	 */
	public Integer getFreePasses() {
		return freePasses;
	}

	/**
	 * @param freePasses the freePasses to set
	 */
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
