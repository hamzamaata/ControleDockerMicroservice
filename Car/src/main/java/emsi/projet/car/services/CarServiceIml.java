package emsi.projet.car.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import emsi.projet.car.entities.Car;
import emsi.projet.car.models.CarResponse;
import emsi.projet.car.repositories.CarRepository;
import jakarta.ws.rs.client.Client;

@Service
public class CarServiceIml implements CarService {
	
	@Autowired
    private CarRepository carRepository;
    @Autowired
    private RestTemplate restTemplate;
    
    private final String URL="http://localhost:8888/SERVICE-CLIENT";
   
    

 
    

    

   
    

    @Override
    public void delete(Long id) throws Exception {
        Car car = carRepository.findById(id).orElseThrow(()->new Exception("Invalid Id"));
        carRepository.delete(car);
    }

   
    

	@Override
	public void save(CarResponse car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CarResponse carResponse, Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}









	@Override
	public CarResponse findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<CarResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}