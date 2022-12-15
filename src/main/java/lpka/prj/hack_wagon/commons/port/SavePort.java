package lpka.prj.hack_wagon.commons.port;

import lpka.prj.hack_wagon.commons.models.BaseEntity;

public interface SavePort<Entity extends BaseEntity> {
    Entity create(Entity entity);
}
