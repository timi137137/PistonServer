package org.pistonmc.api.plugin.event.entity;

import org.pistonmc.api.common.event.Event;
import org.pistonmc.api.plugin.entity.Entity;

public abstract class EntityEvent extends Event {
    private final Entity entity;

    public EntityEvent(Entity entity) {
        super();
        this.entity = entity;
    }

    public EntityEvent(Entity entity, boolean async) {
        super(async);
        this.entity = entity;
    }

    /**
     * 返回触发该事件的实体
     * <br><br>
     * Return the entity that triggered this event
     * @return  触发事件实体
     */
    public Entity getEntity() {
        return entity;
    }
}