package com.nadhem.motos000.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nadhem.motos000.Moto;
import com.nadhem.motos000.Type;

import com.nadhem.motos000.dto.MotoDTO;
import com.nadhem.motos000.repos.TypeRepository;
import com.nadhem.motos000.sevices.MotoService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MotoRESTController {
	@Autowired
	MotoService motoService;
	@GetMapping
	public List<Moto> getAllMotos() {
	return motoService.getAllMotos();
	
	}
	@GetMapping("/{id}")
	public Moto getMotoById(@PathVariable("id") Long id) {
	return motoService.getMoto(id);
	 }
    @PostMapping
    public MotoDTO createMoto(@RequestBody MotoDTO motoDTO) {
        return motoService.saveMoto(motoDTO);
    }
    @PutMapping
    public MotoDTO updateMoto(@RequestBody MotoDTO motoDTO) {
        return motoService.updateMoto(motoDTO);
    }
	
	@DeleteMapping("/{id}")
	public void deleteMoto(@PathVariable("id") Long id)
	{
		motoService.deleteMotoById(id);
	}

	
	@GetMapping("/prodscat/{idtype}")
	public List<Moto> getMotosByCatId(@PathVariable("idtype") Long idtype) {
	return motoService.findByTypeIdType(idtype);
	}
	@GetMapping("/types")
	public List<Type> getAllTypes() {
	    return motoService.getAllTypes();
	}


	

}
