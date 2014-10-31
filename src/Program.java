import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time =0;
		Response resp = new Response();
		while(time++<30)
		{
		Scanner sc=new Scanner(System.in);
		String input = sc.next();
		if(input.equals("师傅")||input.equals("师父"))
		{
			System.out.println(resp.Response());
		}
		else if(input.equals("end")||input.equals("exit"))
		{
			return;
		}
		else
		{
			System.out.println(input);
		}
		}
	}

}
