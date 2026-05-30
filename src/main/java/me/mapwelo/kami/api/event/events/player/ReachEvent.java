package me.mapwelo.kami.api.event.events.player;

import lombok.Getter;
import lombok.Setter;
import me.mapwelo.kami.api.event.Event;

/**
 * @see me.mapwelo.kami.mixin.MixinClientPlayerInteractionManager
 */
@Getter
@Setter
public class ReachEvent extends Event {
    public float reach;
    
    public ReachEvent(float reach)
    {
        this.reach = reach;
    }

}
