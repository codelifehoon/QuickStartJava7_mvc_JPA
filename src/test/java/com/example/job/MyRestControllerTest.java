package com.example.job;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.QuickStartJava7ApplicationTests;
import com.example.domainntity.Address;
import com.example.domainntity.Member;
import com.example.domainntity.domainrepository.AddressRepository;
import com.example.domainntity.domainrepository.MemberRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MyRestControllerTest extends QuickStartJava7ApplicationTests 
{
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	MemberRepository memberRepository;
	
	//@Test
	public void testInsertMember() {
		
	}

	//@Test
	public void testInsertAddress() throws JsonProcessingException {
		
		Address address = new Address();
		ObjectMapper mapper = new ObjectMapper();
		
		address.setAddrnm("aa");
		address.setZipcode("zipcode1");
		addressRepository.save(address);
		System.out.println(mapper.writeValueAsString(address));
		
		}
	
	//@Test
	public void testFindAddress() throws JsonProcessingException {
		
		Address address = new Address();
		ObjectMapper mapper = new ObjectMapper();
		
		address.setAddrnm("aa2");
		address.setZipcode("zipcode2");
		address = addressRepository.save(address);
		
		address = addressRepository.findBySeq(address.getSeq());
		
		System.out.println("###############" +  mapper.writeValueAsString(address));
		
		}
	
	@Test
	
	public void testInsertMemberAddress() throws JsonProcessingException {
		
		Member member = new Member();
		Address address = new Address();
		ObjectMapper mapper = new ObjectMapper();
		
		member.setMemnm("memnm");
		member.setAge("40");
		member =  memberRepository.save(member);
		
		address.setAddrnm("aa2");
		address.setZipcode("zipcode2");
		address.setMember(member);
		address =  addressRepository.save(address);
		
		member = memberRepository.findBySeq(member.getSeq());
		
		System.out.println(mapper.writeValueAsString(member));
		 
		}
	
	

}
