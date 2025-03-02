package jhit.springframework.mvc_cerveceria.services;

import jhit.springframework.mvc_cerveceria.web.model.CervezaDto;

import java.util.UUID;
import java.util.stream.DoubleStream;

public interface ServicioCerveza {
    CervezaDto getCervezaById(UUID cervezaId);
}
