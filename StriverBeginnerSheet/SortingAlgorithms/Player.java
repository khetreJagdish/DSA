import java.util.*;
public class Player{

	public int ranking;
    public String name;
    public int age;

    public Player(int ranking,String name,int age){
    	this.ranking = ranking;
    	this.name = name;
    	this.age = age;
    }
    
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
	}

	public static  Comparator<Player> playerAgeComparator = new Comparator<Player>(){

			@Override
			public int compare(Player p1, Player p2){
				return p1.getAge() - p2.getAge();
			}
   };

	public static void main(String[] args){
		List<Player> footballTeam = new ArrayList<>();
	    Player player3 = new Player(45, "Steven", 24);
	    Player player1 = new Player(59, "John", 20);
	    Player player2 = new Player(67, "Roger", 22);
	    Player player4 = new Player(90, "Ronaldo", 1);
	    footballTeam.add(player3);
	    footballTeam.add(player1);
	    footballTeam.add(player2);
	    footballTeam.add(player4);

	    Player[]  players = new Player[4];
	    players[0] = new Player(45, "Steven", 24);
	    players[1] = new Player(59, "John", 20);
	    players[2] = new Player(67, "Roger", 22);
	    players[3] = new Player(90, "Ronaldo", 1);
	    
	    
	    System.out.println("Before Sorting : " + footballTeam);
    	//Collections.sort(footballTeam, Player.playerAgeComparator);
    	Arrays.sort(players);
    	System.out.println("After Sorting : " + footballTeam);
	}
}

