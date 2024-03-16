interface Audio
{
	void play();
}
interface Video
{
	void play();
}
class YouTube implements Audio,Video
{
	public void play()
	{
		System.out.println("YouTube implements audio and video");
	}
}
class AB5 
{
	public static void main(String[] args) 
	{
		YouTube ref=new YouTube();
		ref.play();
	}
}
