package chapter03;

public class WatchTV {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20 ,false);
		tv.status(); // TV[channel = 10, volume = 32, power = on] 으로 sysout으로 출력되게
		
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();

		tv.power(false);
		tv.status();
		
		

	}

}
