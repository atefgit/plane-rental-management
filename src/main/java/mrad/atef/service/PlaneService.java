package mrad.atef.service;

import mrad.atef.dto.PlaneDTO;
import mrad.atef.mapper.PlaneMapper;
import mrad.atef.model.Plane;
import mrad.atef.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlaneService {
    
    @Autowired
    private PlaneRepository planeRepository;
    
    @Autowired
    private PlaneMapper planeMapper;
    
    public List<PlaneDTO> getAllPlanes() {
        return planeRepository.findAll()
                .stream()
                .map(planeMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    public Optional<PlaneDTO> getPlaneById(Long id) {
        return planeRepository.findById(id)
                .map(planeMapper::toDTO);
    }
    
    public PlaneDTO savePlane(PlaneDTO planeDTO) {
        Plane plane = planeMapper.toEntity(planeDTO);
        plane = planeRepository.save(plane);
        return planeMapper.toDTO(plane);
    }
    
    public void deletePlane(Long id) {
        planeRepository.deleteById(id);
    }
}
