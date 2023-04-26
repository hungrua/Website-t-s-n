package com.liversportweb.repository;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
=======
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
import org.springframework.stereotype.Repository;

import com.liversportweb.entity.CommentEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long>{
<<<<<<< HEAD
	
	@Query(value="SELECT * FROM comment where sport_field_id =?", nativeQuery = true)
	List<CommentEntity> findAllBySportFieldId(@Param("sport_field_id") Long id);
=======

>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
}
