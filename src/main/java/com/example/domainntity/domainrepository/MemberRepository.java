/**
 * 
 */
package com.example.domainntity.domainrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.domainntity.Address;
import com.example.domainntity.Member;

/**
 * @author codelife
 *
 */
public interface MemberRepository extends JpaRepository<Member, String> {
	Member findBySeq(@Param("seq") int seq);
}
