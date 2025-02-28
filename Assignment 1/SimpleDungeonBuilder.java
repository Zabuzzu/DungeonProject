import java.util.ArrayList;
import java.util.List;
public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String dungeonName;
    private List<Room> rooms;
    private List<NPC> npcs;
    public SimpleDungeonBuilder() {
        rooms = new ArrayList<>();
        npcs = new ArrayList<>();
    }
    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.dungeonName = name;
        return this;
    }
    @Override
    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }
    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }
    @Override
    public Dungeon build() {
        return new Dungeon(dungeonName, rooms, npcs);
    }
}
