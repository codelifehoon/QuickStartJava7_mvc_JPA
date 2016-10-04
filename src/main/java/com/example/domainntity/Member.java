package com.example.domainntity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@Table(name="member")
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int seq;

	@Column(length=45)
	private String age;

	@Column(length=45)
	private String memnm;

	//bi-directional one-to-one association to Address
	
	@OneToOne
	@JoinColumn(name="seq", nullable=false, insertable=false, updatable=false)
	private Address address;

	public Member() {
	}

	public int getSeq() {
		return this.seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMemnm() {
		return this.memnm;
	}

	public void setMemnm(String memnm) {
		this.memnm = memnm;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}