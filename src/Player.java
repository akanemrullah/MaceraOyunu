import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orijinalHealth;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {

        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler!");
        System.out.println("==================================");

        for (GameChar gameChar : charList) {
            System.out.println("ID: " + gameChar.getId()
                    + "\t Karakter: " + gameChar.getName()
                    + "\t Hasar: " + gameChar.getDamage()
                    + "\t Saglik: " + gameChar.getHealth()
                    + "\t Para: " + gameChar.getMoney());
        }
        System.out.println("==================================");
        System.out.print("Lutfen bir karakter seciniz: ");
        int selectChar = input.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;

            case 2:
                initPlayer(new Archer());
                break;

            case 3:
                initPlayer(new Knight());
                break;

            default:
                initPlayer(new Samurai());
        }

        /*
        System.out.println("Karakter: " + this.getCharName()
        + ", Hasar: " + this.getDamage()
        + ", Saglik: " + this.getHealth()
        + ", Para: " + this.getMoney());
         */
    }

    public void initPlayer(GameChar gamechar) {
        this.setDamage(gamechar.getDamage());
        this.setHealth(gamechar.getHealth());
        this.setOrijinalHealth(gamechar.getHealth());
        this.setMoney(gamechar.getMoney());
        this.setCharName(gamechar.getName());
    }

    public void printInfo(){
        System.out.println("Silahiniz: " + this.getInventory().getWeapon().getName()
                + ", Zirh: " + this.getInventory().getArmor().getName()
                + ", Bloklama: " + this.getInventory().getArmor().getBlock()
                + ", Hasar: " + this.getTotalDamage()
                + ", Saglik: " + this.getHealth()
                + ", Para: " + this.getMoney());
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }
}
