package com.sweetspot.sweetspot.repo;

import com.sweetspot.sweetspot.entity.SweetDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SweetRepo extends JpaRepository<SweetDAO, Long> {

}
