package dz.itbridge.bloodbank.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.itbridge.bloodbank.api.model.BloodProductList;

@Repository
public interface BloodProductListRepository extends JpaRepository<BloodProductList, Long> {

}
