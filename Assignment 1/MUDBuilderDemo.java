public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark and gloomy entrance"))
                .addRoom(new Room("Hall", "A long, narrow hall with flickering torches"))
                .addNPC(new NPC("Goblin", "A sneaky goblin", 30))
                .addNPC(new NPC("Orc", "A strong orc warrior", 50))
                .build();
        System.out.println("=== MUD Builder Demo ===");
        System.out.println(dungeon);
    }
}
