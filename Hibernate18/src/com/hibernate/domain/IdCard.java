package com.hibernate.domain;

import java.util.Date;

public class IdCard {

	private int id;
	private Date usefulLife;
	private Person person;//一张卡对应一个人
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getUsefulLife() {
		return usefulLife;
	}
	public void setUsefulLife(Date usefulLife) {
		this.usefulLife = usefulLife;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
