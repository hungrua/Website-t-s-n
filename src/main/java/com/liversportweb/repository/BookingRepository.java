package com.liversportweb.repository;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.liversportweb.entity.BookingEntity;
@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
//	List<BookingEntity> findAllByUserId(Long id);
//	List<BookingEntity> findAllBySportFieldId(Long id);
//	@Query(value = "select * from booking where bookingTime = '?1' and  bookingDate = '?2' ", nativeQuery = true)
	BookingEntity findByBookingTimeAndBookingDate(Time time, Date date);

}
