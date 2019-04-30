package ie.tudublin;

import processing.data.*;

public class Suit
{
  
	private String suit;
    private String attack;
    private String health;
    private String armor;
    private String stealth;
    private String agility;

    public Suit(String suit,String attack, String health, String armor, String stealth, String agility)
    {
        this.suit = suit;
        this.attack = attack;
        this.health = health;
        this.armor = armor;
        this.stealth = stealth;
        this.agility = agility;
    }
    

	public String toString()
    {
        return "\n" + suit + "\n" + attack + "\n" + health + "\n" + armor + "\n" + stealth + "\n" + agility;
    }


    public Suit(TableRow tr)
    {
        
        suit = tr.getString("Suit");
        attack = tr.getString("Attack");
        health = tr.getString("Health");
        armor = tr.getString("Armor");
        stealth = tr.getString("Stealth");
        agility = tr.getString("Agility");
        
        
        //this(tr.getString("Suit"), tr.getString("Attack"), tr.getString("Health"), tr.getString("Armor"), tr.getString("Stealth"),tr.getString("Agility"));
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the attack
     */
    public String getAttack() {
        return attack;
    }

    /**
     * @param attack the attack to set
     */
    public void setAttack(String attack) {
        this.attack = attack;
    }

    /**
     * @return the health
     */
    public String getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * @return the armor
     */
    public String getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(String armor) {
        this.armor = armor;
    }

    /**
     * @return the stealth
     */
    public String getStealth() {
        return stealth;
    }

    /**
     * @param stealth the stealth to set
     */
    public void setStealth(String stealth) {
        this.stealth = stealth;
    }

    /**
     * @return the agility
     */
    public String getAgility() {
        return agility;
    }

    /**
	 * @param agility the agility to set
	 */
	public void setAgility(String agility) {
		this.agility = agility;
    }
}

  