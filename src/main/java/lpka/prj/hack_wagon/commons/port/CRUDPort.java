package lpka.prj.hack_wagon.commons.port;

import lpka.prj.hack_wagon.commons.models.BaseEntity;
import lpka.prj.hack_wagon.commons.models.BaseFilters;

public interface CRUDPort<Entity extends BaseEntity, Filters extends BaseFilters>
        extends SavePort<Entity>,
        ReadPort<Entity, Filters>,
        DeletePort<Entity> {
}
