package com.cg.jpastart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity

@DiscriminatorValue("MGR")


public class Manager extends Employee
{
private static final long serialVersionUID = 1L;

private String depertmentName;

public String getDepertmentName() {
	return depertmentName;
}

public void setDepertmentName(String depertmentName) {
	this.depertmentName = depertmentName;
}


	

}
