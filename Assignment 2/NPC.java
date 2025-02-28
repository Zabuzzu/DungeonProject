public class NPC implements CloneableGameEntity<NPC> {
    private String name;
    private String description;
    private int health;
    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
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
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.health);
    }
    @Override
    public String toString() {
        return "NPC{name='" + name + "', description='" + description + "', health=" + health + "}";
    }
}
