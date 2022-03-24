package com.cg.jpastart.entities;

import javax.persistence.DiscriminatorValue;

@Entity

@DiscriminatorValue("mgr_store")

public class Manager extends employee
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


