package lpka.prj.hack_wagon.commons.port;

import lpka.prj.hack_wagon.commons.models.BaseEntity;

public interface DeletePort<Entity extends BaseEntity> {
    void delete(Entity entity);
    void deleteById(String id);
}
