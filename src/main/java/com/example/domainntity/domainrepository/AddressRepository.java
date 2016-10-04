package com.example.domainntity.domainrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.domainntity.Address;

public interface AddressRepository extends JpaRepository<Address, String> {

	Address findBySeq(@Param("seq") int seq);
}
