package training;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class soldiers_problem {
	
	public static Scanner r=new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("The sword will move according to this rule: kill the right one and pass to the next one");
		System.out.println("That means, if we had the soldiers 7, 8, 9, and the number 7 has the sword, he will kill the soldier 8 and pass the sword to the soldier 9 and so on");
		System.out.println("First, let's define how many soldiers will be: ");
		int s = r.nextInt();
		System.out.println("What's the name of the soldier that doesn't want to die?");
		r.nextLine();
		String ryan = r.nextLine();
		System.out.println("Finally, where will the sword start(from 1 to the number given above)?");
		int sword = r.nextInt();
		savePrivateRyan(s,ryan,sword);
	}

	private static void savePrivateRyan(int s, String ryan, int sword) 
	{   
		ArrayList<Integer> soldiers=new ArrayList<Integer>();
		for(int i=0; i<s; i++) 
			soldiers.add(i+1);
        sword= sword-1;
        int count = 0;
        int aux = 0;
        ListIterator<Integer> x = soldiers.listIterator(sword);
        while(soldiers.size() > 1)
        {
            if (x.hasNext()==false)
                x = soldiers.listIterator();
 
            while(x.hasNext() && count <= 1)
            {
                aux = x.next();
                count ++;
            }
 
            if (count > 1)
            {
                count = 0;
                x.remove();
                System.out.println("The soldier at position " + aux + " has died!");
            }
        }
		System.out.println("The soldier " + ryan + " must sit at position " +soldiers.get(0) + " to survive!");
	}

}
