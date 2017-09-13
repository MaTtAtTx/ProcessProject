package sample.model;

public class PlayDohCircle
{
	// Declaration Section
	// Data Member Section
	// NEED TO BE PRIVATE
	private int size;

	public PlayDohCircle()
	{
		this.size = 5;
	}

	public PlayDohCircle(int size)
	{
		this.size = size;
	}
	
	public void setSize(int updateSize)
	{
		this.size = updateSize;
	}
	
	// String must ALWAYS be capitalized
	public String toString()
	{
		String description = "I am a PlayDohCircle and my size is " + size;
		return description;
	}
}
