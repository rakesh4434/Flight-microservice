package com.brownfield.pss.checkin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brownfield.pss.checkin.entity.CheckInRecord;

@Repository
public interface CheckinRepository extends JpaRepository<CheckInRecord,Long> {

	CheckInRecord findOne(long id);

}
