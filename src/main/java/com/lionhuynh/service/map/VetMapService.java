package com.lionhuynh.service.map;

import com.lionhuynh.model.Speciality;
import com.lionhuynh.model.Vet;
import com.lionhuynh.service.SpecialitesService;
import com.lionhuynh.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitesService specialitesService;

    @Autowired
    public VetMapService(SpecialitesService specialitesService) {
        this.specialitesService = specialitesService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality saveSpeciality = specialitesService.save(speciality);
                    speciality.setId(saveSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
