
public class Baby
	{
		private String name;
		private double weight;
		
		public Baby (String n, double w){
			name = n;
			weight = w;
		}
		
		public static void cry (){
			System.out.println("Wahhhhhh!");
		}
		
		public static void pop (){
			System.out.println("What feels good");
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public double getWeight()
			{
				return weight;
			}

		public void setWeight(double weight)
			{
				this.weight = weight;
			}
		
		
	}
