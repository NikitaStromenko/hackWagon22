package lpka.prj.hack_wagon.commons.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Data
@Builder
public class ResponseModel {
    private Object response;
}
