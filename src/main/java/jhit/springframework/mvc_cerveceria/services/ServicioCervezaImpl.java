package jhit.springframework.mvc_cerveceria.services;

import jhit.springframework.mvc_cerveceria.web.model.CervezaDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ServicioCervezaImpl implements ServicioCerveza {
    @Override
    public CervezaDto getCervezaById(UUID cervezaId) {
        return CervezaDto.builder()
                .id(cervezaId)
                .nombreCerveza("Estrella de Levante")
                .estiloCerveza("Gose")
                .build();
    }
}
