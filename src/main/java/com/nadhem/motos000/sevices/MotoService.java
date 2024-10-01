package com.nadhem.motos000.sevices;

import com.nadhem.motos000.Moto;
import com.nadhem.motos000.dto.MotoDTO;

import com.nadhem.motos000.Type;

import org.springframework.data.domain.Page;

import java.util.List;

public interface MotoService {
	MotoDTO saveMoto(MotoDTO moto);

	MotoDTO updateMoto(MotoDTO moto);

	void deleteMoto(Moto moto);

	void deleteMotoById(Long id);

	Moto getMoto(Long id);

	List<Moto> getAllMotos();

	Page<Moto> getAllMotosParPage(int page, int size);

    List<Moto> findByNomMoto(String nom);
    List<Moto> findByNomMotoContains(String nom);
    List<Moto> findByNomPrix(String nom, Double prix);
    List<Moto> findByType(Type categorie); // Assuming Type is a valid class or enum
    List<Moto> findByTypeIdType(Long id);
    List<Moto> findByOrderByNomMotoAsc();
    List<Moto> trierMotosNomsPrix();
    MotoDTO convertEntityToDto (Moto moto);
	List<Type> getAllTypes();

    

}
