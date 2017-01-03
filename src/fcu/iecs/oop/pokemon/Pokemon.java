package fcu.iecs.oop.pokemon;

public class Pokemon implements Fightable{

	private String nickname;

	private PokemonType type;

	private int cp;

	public Pokemon(String nickname, PokemonType type, int cp) {
		this.nickname = nickname;
		this.type = type;
		this.cp = cp;
	}

	public String getname(){
		return this.nickname;
	}

	public PokemonType gettype(){
		return this.type;
	}
	
	public void setnickname(){
		this.nickname=nickname;
	}

	public int getcp(){
		return this.cp;
		
	}

	public void setcp(){
		cp+=500;
	}

}
