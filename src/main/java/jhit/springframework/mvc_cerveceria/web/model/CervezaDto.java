package jhit.springframework.mvc_cerveceria.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Jobab H. Izquier Torres
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CervezaDto {

    private UUID id;
    private String nombreCerveza;
    private String estiloCerveza;
    private Long upc; // código universal de procucto en inglés
}
