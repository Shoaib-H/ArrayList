package com.ipl;

public class Players {
	private String name;
	private int jerseyNo;
	private int runs;
	private int wickets;
	private int matches;

	public Players(String name, int jerseyNo, int runs, int wickets, int matches) {
		super();
		this.name = name;
		this.jerseyNo = jerseyNo;
		this.runs = runs;
		this.wickets = wickets;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Players [Name = " + name + ", JerseyNo = " + jerseyNo + ", Runs = " + runs + ", Wickets = " + wickets
				+ ", Matches = " + matches + "]";
	}

}
