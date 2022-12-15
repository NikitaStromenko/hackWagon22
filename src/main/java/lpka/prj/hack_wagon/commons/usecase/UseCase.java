package lpka.prj.hack_wagon.commons.usecase;

import lpka.prj.hack_wagon.commons.usecase.markers.InputUC;
import lpka.prj.hack_wagon.commons.usecase.markers.OutputUC;

public interface UseCase<Input extends InputUC, Output extends OutputUC> {
    OutputUC execute(Input input);
}
