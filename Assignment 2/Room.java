public class Room implements CloneableGameEntity<Room> {
    private String name;
    private String description;
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }
    @Override
    public String toString() {
        return "Room{name='" + name + "', description='" + description + "'}";
    }
}
