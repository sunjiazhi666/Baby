import java.util.ArrayList;
public class Babydriver
	{
	public	static ArrayList<Baby>nursey = new ArrayList<Baby>();

		public static void main(String[] args)
			{
				nursey.add (new Baby ("Scott" , 40.2));
				nursey.add (new Baby ("Kenny" , 9.3));
				
				for(int i = 0 ; i<nursey.size(); i++){
				System.out.println(nursey.get(i).getName());
				System.out.println(nursey.get(i).getWeight());
			}
				
				for(int i = 0; i < nursey.size(); i ++){
				nursey.get(i).setWeight(nursey.get(i).getWeight()-1);
				System.out.println(nursey.get(i).getWeight());
				System.out.println(nursey.get(i).getName());
				}
			}
	}
