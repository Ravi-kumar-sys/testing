package com.demo.testing.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "UserDTO")
public class UserBean {

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "emailId", updatable = true)
	private String emailId;

}
