package lpka.prj.hack_wagon.commons.port;

import lpka.prj.hack_wagon.commons.models.BaseEntity;
import lpka.prj.hack_wagon.commons.models.BaseFilters;

import java.util.List;

public interface ReadPort<Entity extends BaseEntity, Filters extends BaseFilters> {
    Entity findById(String id);
    List<Entity> findWithFilters(Filters filters);
}
