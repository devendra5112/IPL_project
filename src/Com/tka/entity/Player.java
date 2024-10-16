package Com.tka.entity;

public class Player {

	private String name;
	private int run;
	private String team;
	private int jurcey;

	public Player() {
		super();
	}

	public Player(String name, int run, String team, int jurcey) {
		super();
		this.name = name;
		this.run = run;
		this.team = team;
		this.jurcey = jurcey;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the run
	 */
	public int getRun() {
		return run;
	}

	/**
	 * @param run the run to set
	 */
	public void setRun(int run) {
		this.run = run;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * @return the jurcey
	 */
	public int getJurcey() {
		return jurcey;
	}

	/**
	 * @param jurcey the jurcey to set
	 */
	public void setJurcey(int jurcey) {
		this.jurcey = jurcey;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", run=" + run + "]";
	}

}
