package mrad.atef.mapper;

import mrad.atef.dto.PlaneDTO;
import mrad.atef.model.Plane;
import org.springframework.stereotype.Component;

@Component
public class PlaneMapper {
    
    public PlaneDTO toDTO(Plane plane) {
        if (plane == null) {
            return null;
        }
        
        return new PlaneDTO(
            plane.getId(),
            plane.getModel(),
            plane.getBrand(),
            plane.getReleaseDate(),
            plane.getStatus()
        );
    }
    
    public Plane toEntity(PlaneDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Plane plane = new Plane();
        plane.setId(dto.getId());
        plane.setModel(dto.getModel());
        plane.setBrand(dto.getBrand());
        plane.setReleaseDate(dto.getReleaseDate());
        plane.setStatus(dto.getStatus());
        
        return plane;
    }
}
