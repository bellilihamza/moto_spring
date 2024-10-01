package com.nadhem.motos000.sevices;

import com.nadhem.motos000.Type;
import com.nadhem.motos000.dto.MotoDTO;
import com.nadhem.motos000.Moto;
import com.nadhem.motos000.repos.MotoRepository;
import com.nadhem.motos000.repos.TypeRepository;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoServiceImpl implements MotoService {

    @Autowired
    private MotoRepository motoRepository;
    @Autowired
    private TypeRepository typeRepository;

    @Override
    public MotoDTO saveMoto(MotoDTO motoDTO) {
        return convertEntityToDto(motoRepository.save(convertDtoToEntity(motoDTO)));
    }

    @Override
    public MotoDTO updateMoto(MotoDTO motoDTO) {
        return convertEntityToDto(motoRepository.save(convertDtoToEntity(motoDTO)));
    }

    @Override
    public void deleteMoto(Moto moto) {
        motoRepository.delete(moto);
    }

    @Override
    public void deleteMotoById(Long id) {
        motoRepository.deleteById(id);
    }

    @Override
    public List<Moto> getAllMotos() {
        return motoRepository.findAll();
    }

    @Override
    public Page<Moto> getAllMotosParPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return motoRepository.findAll(pageable);
    }

    @Override
    public Moto getMoto(Long id) {
        return motoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Moto> findByNomMoto(String nom) {
        return motoRepository.findByNomMoto(nom);
    }

    @Override
    public List<Moto> findByNomMotoContains(String nom) {
        return motoRepository.findByNomMotoContains(nom);
    }

    @Override
    public List<Moto> findByNomPrix(String nom, Double prix) {
        return motoRepository.findByNomPrix(nom, prix);
    }

    @Override
    public List<Moto> findByType(Type categorie) {
        return motoRepository.findByType(categorie);
    }

    @Override
    public List<Moto> findByTypeIdType(Long id) {
        return motoRepository.findByTypeIdType(id);
    }

    @Override
    public List<Moto> findByOrderByNomMotoAsc() {
        return motoRepository.findByOrderByNomMotoAsc();
    }

    @Override
    public List<Moto> trierMotosNomsPrix() {
        return motoRepository.trierMotosNomsPrix();
    }

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public MotoDTO convertEntityToDto(Moto moto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        MotoDTO motoDTO = modelMapper.map(moto, MotoDTO.class);
        
        // Récupérer le nom de la catégorie (ou autre logique)
        if (moto.getType() != null) {
            motoDTO.setNomCat(moto.getType().getNomType()); // Assurez-vous que Type a un champ nom
        }
        
        return motoDTO;
    }


    // Méthode pour convertir un DTO en entité
    public Moto convertDtoToEntity(MotoDTO motoDTO) {
        Moto moto = new Moto();
        moto = modelMapper.map(motoDTO, Moto.class);
        
        // Si nécessaire, ajouter des traitements spécifiques ici pour nomCat
        if (motoDTO.getNomCat() != null) {
            Type type = new Type();
            type.setNomType(motoDTO.getNomCat());  // Assurez-vous que Type a un champ nom
            moto.setType(type);
        }

        return moto;
    }
    public List<Type> getAllTypes() {
        // Return the list of types from the database or predefined data
        return typeRepository.findAll();
    }

}
