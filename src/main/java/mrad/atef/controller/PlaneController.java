package mrad.atef.controller;

import mrad.atef.dto.PlaneDTO;
import mrad.atef.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/planes")
public class PlaneController {
    
    @Autowired
    private PlaneService planeService;
    
    @GetMapping
    public String listPlanes(Model model) {
        model.addAttribute("planes", planeService.getAllPlanes());
        return "planes/list";
    }
    
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("plane", new PlaneDTO());
        return "planes/form";
    }
    
    @PostMapping
    public String savePlane(@ModelAttribute PlaneDTO planeDTO) {
        planeService.savePlane(planeDTO);
        return "redirect:/planes";
    }
    
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("plane", planeService.getPlaneById(id).orElseThrow());
        return "planes/form";
    }
    
    @GetMapping("/delete/{id}")
    public String deletePlane(@PathVariable Long id) {
        planeService.deletePlane(id);
        return "redirect:/planes";
    }
}
