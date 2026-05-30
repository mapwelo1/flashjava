package me.mapwelo.kami.api.event.events.move;

import lombok.Getter;
import me.mapwelo.kami.api.event.Event;
import net.minecraft.util.math.Vec3d;


public class TravelEvent {

    public static class Pre extends Event {
        private Vec3d input;

        public Pre(Vec3d input)
        {
            this.input = input;
        }


    }
    public static class Post extends Event {
        @Getter
        private Vec3d input;

        public Post(Vec3d input)
        {
            this.input = input;
        }


    }


}
