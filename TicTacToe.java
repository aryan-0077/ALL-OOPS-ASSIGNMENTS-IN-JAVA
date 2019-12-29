import java.util.*;

class Player
{
String name;
String password;
int win=0;
int loss=0;
Player(String name,String password)
{
this.name=name;
this.password=password;
}
}
class TicTacToe
{
	static Player player[] = new Player[100];
	static int itr=0;
	public static void main(String args[])
	{
		while(true){
		System.out.println("Press 1 for registering a new player\nPress 2 for play a game\nPress 3 to quit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter player name: ");
			String name = sc.next();
			System.out.println("Enter password: ");
			String password = sc.next();
			player[itr++] = new Player(name,password);	
		}
		else if(option==2)
		{
			System.out.println("Enter username and password for player 1");
			String name1 = sc.next();
			String password1 = sc.next();
			int a1=-1,a2=-1;
			boolean flag=false;
			for(int i=0;i<itr;i++)
			{
				//System.out.println(player[i].name+ " " + player[i].password);
				if((player[i].name).equals(name1) && (player[i].password).equals(password1))
				{
					flag=true;
					a1=i;
				}
			}
			if(flag==false)
				System.out.println("Player is invalid!!!");
			System.out.println("Enter username and password for player 2");
			String name2 = sc.next();
			String password2 = sc.next();
			flag=false;
			for(int i=0;i<itr;i++)
			{
				if((player[i].name).equals(name2) && (player[i].password).equals(password2)){
					flag=true;
					a2=i;
					}
			}
			if(flag==false)
				System.out.println("Player is invalid!!!");
			playGame(player[a1],player[a2]);
		}
		else
			break;
		}
	}
	static void playGame(Player player1,Player player2)
	{
		String matrix[][] = new String[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				matrix[i][j]=" ";
		}
		int count=0;
		while(true)
		{
			if(count==9)
			{
				System.out.println("Match Draw!!!");
				return;
			}
			System.out.println("Enter row position: ");
			int r = sc.nextInt();
			System.out.println("Enter column position: ");
			int c = sc.nextInt();
			if(count%2==0)
			{
				matrix[r][c] = "X";
			}
			else
			{
				matrix[r][c] = "0";
			}
			for(int i=0;i<3;i++)
			{
				System.out.print(matrix[i][0]+" | ");
				System.out.print(matrix[i][1]+" | ");
				System.out.println(matrix[i][2]);
			}
			if(matrix[0][0] == "X" && matrix[0][1] == "X" && matrix[0][2] == "X")
			{
				System.out.println("Player 1 wins!!!");
				player1.win++;
				player2.loss++;
				return;
			}
			if(matrix[0][0] == "0" && matrix[0][1] == "0" && matrix[0][2] == "0")
			{
				System.out.println("Player 2 wins!!!");
				player2.win++;
				player1.loss++;
				return;
			}
			if(matrix[1][0] == "X" && matrix[1][1] == "X" && matrix[1][2] == "X")
			{
				System.out.println("Player 1 wins!!!");
				player1.win++;
				player2.loss++;
				return;
			}
			if(matrix[1][0] == "0" && matrix[1][1] == "0" && matrix[1][2] == "0")
			{
				System.out.println("Player 2 wins!!!");
				player2.win++;
				player1.loss++;
				return;
			}
			if(matrix[2][0] == "X" && matrix[2][1] == "X" && matrix[2][2] == "X")
			{
				System.out.println("Player 1 wins!!!");
				player1.win++;
				player2.loss++;
				return;
			}
			if(matrix[2][0] == "0" && matrix[2][1] == "0" && matrix[2][2] == "0")
			{
				System.out.println("Player 2 wins!!!");
				player2.win++;
				player1.loss++;
				return;
			}
			if(matrix[0][0] == "X" && matrix[0][1] == "X" && matrix[0][2] == "X")
			{
				System.out.println("Player 1 wins!!!");
				player1.win++;
				player2.loss++;
				return;
			}
			if(matrix[0][0] == "0" && matrix[1][0] == "0" && matrix[2][0] == "0")
			{
				System.out.println("Player 2 wins!!!");
				player2.win++;
				player1.loss++;
				return;
			}
			if(matrix[0][1] == "X" && matrix[1][1] == "X" && matrix[1][2] == "X")
			{
				System.out.println("Player 1 wins!!!");
				player1.win++;
				player2.loss++;
				return;
			}
			if(matrix[1][0] == "0" && matrix[1][1] == "0" && matrix[1][2] == "0")
			{
				System.out.println("Player 2 wins!!!");
				player2.win++;
				player1.loss++;
				return;
			}
			if(matrix[2][0] == "X" && matrix[2][1] == "X" && matrix[2][2] == "X")
			{
				System.out.println("Player 1 wins!!!");
				player1.win++;
				player2.loss++;
				return;
			}
			if(matrix[2][0] == "0" && matrix[2][1] == "0" && matrix[2][2] == "0")
			{
				System.out.println("Player 2 wins!!!");
				player2.win++;
				player1.loss++;
				return;
			}
			count++;
		}
	}
}