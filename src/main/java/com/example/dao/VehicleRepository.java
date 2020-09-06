package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import RequestModel.bookVehicle;
import com.example.model.Vehicle_Details;

@CrossOrigin(origins = "http://localhost:4200")
public interface VehicleRepository extends JpaRepository<Vehicle_Details, Integer> {

	@Query("From Vehicle_Details where vehicle_category = '2wheeler' ")
	List<Vehicle_Details> findBy2Wheeler();
	
	@Query("From Vehicle_Details where vehicle_category = '4wheeler' ")
	List<Vehicle_Details> findBy4Wheeler();
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM Vehicle_Details WHERE vehicle_id = ?1",nativeQuery=true)
	int deleteVehicle(int vehicle_id);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE Vehicle_Details SET booking_status='booked',user_id=?1 WHERE vehicle_id=?2 ",nativeQuery=true)
	void bookVehicle1(int user_id, int vehicle_id);

}
