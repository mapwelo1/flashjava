package me.mapwelo.kami.api.event.events.move;

import me.mapwelo.kami.api.event.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WalkingForwardEvent extends Event {

    boolean walksForward;

    public WalkingForwardEvent(boolean walksForward)
    {
        this.walksForward = walksForward;
    }
}
