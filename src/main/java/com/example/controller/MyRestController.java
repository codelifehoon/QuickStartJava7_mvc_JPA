package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domainntity.Address;
import com.example.domainntity.Member;
import com.example.domainntity.domainrepository.AddressRepository;
import com.example.domainntity.domainrepository.MemberRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
@RestController 
public class MyRestController {

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@RequestMapping("/rest/inser/memebr/{memnm}/{age}")
    public String insertMember(Member member) throws JsonProcessingException
    {
		
		ObjectMapper mapper = new ObjectMapper();
		memberRepository.save(member);
		
		return mapper.writeValueAsString(member);
    }
	
	@RequestMapping("/rest/insert/address/{addrnm}/{zipcode}")
	public String insertAddress(Address address) throws JsonProcessingException
    {
		 
		ObjectMapper mapper = new ObjectMapper();
		addressRepository.save(address);
		
		return mapper.writeValueAsString(address);
    }
	
	@RequestMapping("/rest/selectMember/{seq}")
	public String findAddress(Address address) throws JsonProcessingException
    {

		ObjectMapper mapper = new ObjectMapper();
		
		address = addressRepository.findBySeq(address.getSeq());
		
		return  mapper.writeValueAsString(address);
    }
	
	@RequestMapping("/rest/selectCombineMember/{seq}")
	public String selectCombineMember(Member member) throws JsonProcessingException
    {

		ObjectMapper mapper = new ObjectMapper();
		
		member = memberRepository.findBySeq(member.getSeq());
		
		return  mapper.writeValueAsString(member);
    }
	
	 
	
    
}
