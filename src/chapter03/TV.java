package chapter03;

public class TV {
	
	private int channel; // 1 ~ 255 까지
	private int volume; // 
	private boolean power;
	
	
	// 상속받은 자식관계인 SmartTV를 위해 부모인 TV클래스에 기본 생성자를 만듬
	public TV()
	{

	}
	
	public TV (int channel, int volume, boolean power)
	{
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void status()
	{
		System.out.println("TV[channel = " + channel + ", volume = " + volume + ", power = " + (power ? "on":"off") + "]");
	}
	
	public void power(boolean on)
	{
		this.power = on;
	}
	
	public void volume(int intvolume)
	{
		if (!power)
		{
			return;
		}
		this.volume = intvolume;
	}
	
	public void volume(boolean up)
	{

//		if (up)
//		{
//			volume(volume + 1);
//		}
//		else
//		{
//			volume(volume - 1);
//		}
		
		volume (volume + (up ? 1 : -1)); 
	}
	
	public void channel(int channel)
	{
		if (!power)
		{
			return;
		}
		if (channel < 1)
		{
			this.channel = 255;
		}
		else if (channel > 255)
		{
			this.channel = 1;
		}
		this.channel = channel;
	}
	
	public void channel(boolean up)
	{
		
//		if (chupdown)
//		{
//			this.channel++;
//		}
//		else
//		{
//			this.channel--;
//		}
		channel (channel + (up ? 1 : -1));
	}
}
