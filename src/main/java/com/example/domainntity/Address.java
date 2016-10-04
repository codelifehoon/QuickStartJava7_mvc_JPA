package com.example.domainntity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@Table(name="address")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int seq;

	@Column(length=45)
	private String addrnm;

	@Column(length=45)
	private String zipcode;

	//bi-directional one-to-one association to Member
	@JsonIgnore	 //mapper.writeValueAsString json ignore
	@OneToOne(mappedBy="address")
	private Member member;

	public Address() {
	}

	public int getSeq() {
		return this.seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getAddrnm() {
		return this.addrnm;
	}

	public void setAddrnm(String addrnm) {
		this.addrnm = addrnm;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}