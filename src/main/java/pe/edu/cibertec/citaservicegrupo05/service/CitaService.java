package pe.edu.cibertec.citaservicegrupo05.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.cibertec.citaservicegrupo05.dto.AtencionMedicaResponseDTO;
import pe.edu.cibertec.citaservicegrupo05.repository.CitaRepository;

@Service
@RequiredArgsConstructor
public class CitaService {
    private final CitaRepository citaRepository;
    public AtencionMedicaResponseDTO obtenerCita(Long idCita){
        return citaRepository.findById(idCita).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Cita no encontrada: "+idCita));
    }
}
