package jhit.springframework.mvc_cerveceria.web.controller;

import jhit.springframework.mvc_cerveceria.services.ServicioCerveza;
import jhit.springframework.mvc_cerveceria.web.model.CervezaDto;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/cerveza")
@RestController
public class CervezaController {

    private final ServicioCerveza sv;

    public CervezaController(ServicioCerveza sv) {
        this.sv = sv;
    }

    @GetMapping({"/{cervezaId}"}) // path del parámetro {contenido}
    public ResponseEntity<CervezaDto> getCerveza(@PathVariable("cervezaId") UUID cervezaId){

        return new ResponseEntity<>(sv.getCervezaById(cervezaId), HttpStatus.OK);
    }
}
