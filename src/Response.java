//encoding:utf-8
public class Response {

	private int time = 0;
	public String Response() {
		// TODO Auto-generated method stub
		time++;
		switch(time)
		{
			case 1:
				return "嗯？";
			case 2:
				return "什么事儿？";
			case 3:
				return "说话啊！";
			case 4:
			default:
				return "…";		
		}
	}

}
