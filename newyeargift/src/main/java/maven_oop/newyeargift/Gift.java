package maven_oop.newyeargift;

import java.util.*;

public class Gift {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of sweets and chocolates in the Gift:");
		int n=sc.nextInt();
		Map<String,Double> hashweight=new HashMap<String,Double>();
		Map<String,Double> hashcost=new HashMap<String,Double>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the sweet:");
			String name=sc.next();
			if(name.equals("Halwa"))
			{
				System.out.println("Enter weight of Halwa:");
				double wt=sc.nextDouble();
				Sweet h=new Halwa();
				h.setWeight(wt);
				h.setCost();
				double cost=h.getCost();
				boolean checkname=hashweight.containsKey(name);
				if(checkname)
				{
					hashweight.put(name,hashweight.get(name)+wt);
					hashcost.put(name,hashcost.get(name)+cost);
				}
				else
				{
					hashweight.put(name,wt);
					hashcost.put(name,cost);
				}
			}
			else if(name.equals("Gulabjam"))
			{
				System.out.println("Enter weight of Gulabjam:");
				double wt=sc.nextDouble();
				Sweet g=new Gulabjam();
				g.setWeight(wt);
				g.setCost();
				double cost=g.getCost();
				boolean checkname=hashweight.containsKey(name);
				if(checkname)
				{
					hashweight.put(name,hashweight.get(name)+wt);
					hashcost.put(name,hashcost.get(name)+cost);
				}
				else
				{
					hashweight.put(name,wt);
					hashcost.put(name,cost);
				}
			}
			else if(name.equals("Palakova"))
			{
				System.out.println("Enter weight of Palakova:");
				double wt=sc.nextDouble();
				Sweet p=new Palakova();
				p.setWeight(wt);
				p.setCost();
				double cost=p.getCost();
				boolean checkname=hashweight.containsKey(name);
				if(checkname)
				{
					hashweight.put(name,hashweight.get(name)+wt);
					hashcost.put(name,hashcost.get(name)+cost);
				}
				else
				{
					hashweight.put(name,wt);
					hashcost.put(name,cost);
				}
			}
			else if(name.equals("Chocolate"))
			{
				System.out.println("Enter no.of chocolates:");
				double wt=sc.nextDouble();
				Sweet ch=new Chocolate();
				ch.setWeight(wt);
				ch.setCost();
				double cost=ch.getCost();
				boolean checkname=hashweight.containsKey(name);
				if(checkname)
				{
					hashweight.put(name,hashweight.get(name)+wt);
					hashcost.put(name,hashcost.get(name)+cost);
				}
				else
				{
					hashweight.put(name,wt);
					hashcost.put(name,cost);
				}
			}
		}
		
		System.out.println("Enter the type to sort the sweets: 1.Based on weight 2.Based on cost");
		int k=sc.nextInt();
		sc.close();
		if(k==1)
		{
			List<Map.Entry<String, Double> > list = new LinkedList<Map.Entry<String, Double> >(hashweight.entrySet()); 
			Collections.sort(list, new Comparator<Map.Entry<String, Double> >() { 
				public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) 
				{ 
				    return (o1.getValue()).compareTo(o2.getValue()); 
				} 
				    });
			HashMap<String, Double> temp = new LinkedHashMap<String, Double>(); 
			for (Map.Entry<String, Double> aa : list) 
			{ 
				 temp.put(aa.getKey(), aa.getValue()); 
			}
			for (Map.Entry<String, Double> en : temp.entrySet())
			{ 
				 System.out.println("Sweet: " + en.getKey() + ", Weight: " + en.getValue());
			} 
		}
		else if(k==2)
		{
			List<Map.Entry<String, Double> > list = new LinkedList<Map.Entry<String, Double> >(hashcost.entrySet()); 
			Collections.sort(list, new Comparator<Map.Entry<String, Double> >() { 
				public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) 
				{ 
				    return (o1.getValue()).compareTo(o2.getValue()); 
				} 
				    });
			HashMap<String, Double> temp = new LinkedHashMap<String, Double>(); 
			for (Map.Entry<String, Double> aa : list) 
			{ 
				 temp.put(aa.getKey(), aa.getValue()); 
			}
			for (Map.Entry<String, Double> en : temp.entrySet())
			{ 
				 System.out.println("Sweet: " + en.getKey() + ", Cost: " + en.getValue());
			} 
		}
	}
}