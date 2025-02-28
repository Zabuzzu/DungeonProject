public class MUDCombinedDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        builder.setDungeonName("Enchanted Dungeon")
                .addRoom(new Room("Entrance", "The magical entrance to the dungeon"))
                .addNPC(new NPC("Wizard", "A wise old wizard", 40));
        Room prototypeRoom = new Room("Treasure Room", "A room filled with treasure and traps");
        for (int i = 1; i <= 3; i++) {
            Room clonedRoom = prototypeRoom.cloneEntity();
            clonedRoom.setName(prototypeRoom.getName() + " Clone #" + i);
            builder.addRoom(clonedRoom);
        }
        Dungeon dungeon = builder.build();
        System.out.println("=== MUD Combined Demo ===");
        System.out.println(dungeon);
    }
}
