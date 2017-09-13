package sample.model;

public class PlayDohHexagon
{
	private int weight;

	public PlayDohHexagon()
	{
		this.weight = 25;
	}

	public PlayDohHexagon(int weight)
	{
		this.weight = weight;
	}

	public String toString()
	{
		String description = "I am a hexagon and my weight is " + weight;
		return description;
	}

}
