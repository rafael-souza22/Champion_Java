package entities;

public class Champion {

	private String name;
	private Integer life;
	private Integer attack;
	private Integer armor;

	public void Champion() {

	}

	public Champion(String name, Integer life, Integer attack, Integer armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion champion) {

		int damage = champion.getAttack() - getArmor();

		if (getArmor() >= damage) {
			life--;
		} else {
			life -= damage;
		}
	}

	public String status() {
		if (life <= 0) {
			return name + ": " + 0 + " de vida" + " (morreu)";
		} else {
			return name + ": " + life + " de vida";
		}
	}
}