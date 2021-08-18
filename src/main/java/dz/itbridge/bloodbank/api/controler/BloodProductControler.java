package dz.itbridge.bloodbank.api.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.itbridge.bloodbank.api.exception.RessourceNotFoundException;
import dz.itbridge.bloodbank.api.model.BloodProductList;
import dz.itbridge.bloodbank.api.repository.BloodProductListRepository;

@RestController
@CrossOrigin("*")
public class BloodProductControler {
	
	@Autowired
	private BloodProductListRepository bloodRepository;
	
	@RequestMapping("/stock")
	public List<BloodProductList> getAllStockProduct () throws RessourceNotFoundException {
		List<BloodProductList> stocks = new ArrayList<>();
		bloodRepository.findAll().forEach(stocks::add);
		return stocks;
	}

}
