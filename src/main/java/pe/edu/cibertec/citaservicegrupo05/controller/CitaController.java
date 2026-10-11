package pe.edu.cibertec.citaservicegrupo05.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.citaservicegrupo05.dto.AtencionMedicaResponseDTO;
import pe.edu.cibertec.citaservicegrupo05.service.CitaService;

@RestController
@RequestMapping("/api/v1/citas")
@RequiredArgsConstructor
public class CitaController {
    private final CitaService citaService;
    @GetMapping("/{idCita}")
    public ResponseEntity<AtencionMedicaResponseDTO> obtenerCita(@PathVariable Long idCita){
        return ResponseEntity.ok(citaService.obtenerCita(idCita));
    }
}
