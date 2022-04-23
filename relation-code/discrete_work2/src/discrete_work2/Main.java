package discrete_work2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
	String dwbara="";
		
		do {
		
		System.out.println("please choose one of them ");
		System.out.println("1- represent relation by matrix\n2- find relation in matrix");
		System.out.print("please enter:");
		int q = cin.nextInt();
		
	
		if(q==1)
		{
		
		System.out.print("please enter number of elements for first set:");
		int nset1=cin.nextInt();		
		int set1[] = new int[nset1];
		
		if(nset1!=0)
		{
		System.out.println("please fill first set: ");
		for(int i=0;i<nset1;i++) {
			System.out.print("element "+(i+1)+ " = ");
			set1[i]=cin.nextInt();
		}
		}
		

		System.out.print("please enter number of elements for second set:");
		int nset2=cin.nextInt();		
		int set2[] = new int[nset2];
		
		if(nset2!=0)
		{
		System.out.println("please fill second set: ");
		for(int i=0;i<nset2;i++) {
			System.out.print("element "+(i+1)+ " = ");
			set2[i]=cin.nextInt();		
		}
		
		}
		
		if(nset1!=0 && nset2!=0)
		{
		String repeat="";
		do {
		
				System.out.println("for your relation please choose one of these conditions: ");
				System.out.println("  1- a<b");
				System.out.println("  2- a<b and b is even");
				System.out.println("  3- a<b and a is even");
				System.out.println("  4- a<=b and a is odd and b is odd");
				System.out.println("  5- a>=b+1 ");
				System.out.println("  6- a+b = is a number that is even ");
				System.out.println("  7- a=b ");
				System.out.print("enter the number that you want: ");
				int choice = cin.nextInt();
				System.out.println();
				
		
		
			if(choice == 1)
			{
				int counter=0;
				System.out.println("your relation: ");
				System.out.print("{");
				for(int i=0;i<nset1;i++)
				{
					for(int j=0;j<nset2;j++)
					{
						if(set1[i]<set2[j])
						{
						System.out.print(" ("+set1[i]+ "," +set2[j]+") ");
						counter++;
						}
					}
				}
				
				System.out.print("}");
				if(counter!=0)
				{
					String rel[] = new String[counter];
					int x=0;
					for(int i=0;i<nset1;i++)
					{
						for(int j=0;j<nset2;j++)
						{
							if(set1[i]<set2[j])
							{
								rel[x]=Integer.toString(set1[i])+""+Integer.toString(set2[j]) ;
								x++;
							}
						}
					}
					
					System.out.println();
					System.out.println();
					
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<nset2;i++)
					{
						System.out.print(set2[i]+" ");
					}
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<set2.length;i++)
					{
						System.out.print("- ");
					}
				
					System.out.println();
					
					for(int i=0;i<nset1;i++)
					{
						System.out.print(set1[i] + "| " );
						
						for(int j=0;j<nset2;j++)
						{
							String a = Integer.toString(set1[i])+""+Integer.toString(set2[j]);
							boolean isinclude=false;
							
							for(int k=0;k<counter;k++)
							{
								if(a.equals(rel[k]))
								{
									isinclude=true;
									break;
								}
								
								else
									isinclude=false;
							}
							
							if(isinclude)
								System.out.print(1+" ");
							
							else
								System.out.print(0+" ");
							
							
						}
						System.out.println();
					}
				}
				
				
				
			}
			
			else if(choice == 2)
			{
				int counter=0;
				System.out.println("your relation: ");
				System.out.print("{");
				for(int i=0;i<nset1;i++)
				{
					for(int j=0;j<nset2;j++)
					{
						if(set1[i]<set2[j] && set2[j]%2==0)
						{
						System.out.print(" ("+set1[i]+ "," +set2[j]+") ");
						counter++;
						}
					}
				}
				
				System.out.print("}");
				if(counter!=0)
				{
					String rel[] = new String[counter];
					int x=0;
					for(int i=0;i<nset1;i++)
					{
						for(int j=0;j<nset2;j++)
						{
							if(set1[i]<set2[j] && set2[j]%2==0)
							{
								rel[x]=Integer.toString(set1[i])+""+Integer.toString(set2[j]) ;
								x++;
							}
						}
					}
					
					System.out.println();
					System.out.println();
					
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<nset2;i++)
					{
						System.out.print(set2[i]+" ");
					}
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<set2.length;i++)
					{
						System.out.print("- ");
					}
				
					System.out.println();
					
					for(int i=0;i<nset1;i++)
					{
						System.out.print(set1[i] + "| " );
						
						for(int j=0;j<nset2;j++)
						{
							String a = Integer.toString(set1[i])+""+Integer.toString(set2[j]);
							boolean isinclude=false;
							
							for(int k=0;k<counter;k++)
							{
								if(a.equals(rel[k]))
								{
									isinclude=true;
									break;
								}
								
								else
									isinclude=false;
							}
							
							if(isinclude)
								System.out.print(1+" ");
							
							else
								System.out.print(0+" ");
							
							
						}
						System.out.println();
					}
				}
				
			}
			
			else if(choice == 3)
			{
				int counter=0;
				System.out.println("your relation: ");
				System.out.print("{");
				for(int i=0;i<nset1;i++)
				{
					for(int j=0;j<nset2;j++)
					{
						if(set1[i]<set2[j] && set1[i]%2==0)
						{
						System.out.print(" ("+set1[i]+ "," +set2[j]+") ");
						counter++;
						}
					}
				}
				
				System.out.print("}");
				if(counter!=0)
				{
					String rel[] = new String[counter];
					int x=0;
					for(int i=0;i<nset1;i++)
					{
						for(int j=0;j<nset2;j++)
						{
							if(set1[i]<set2[j] && set1[i]%2==0)
							{
								rel[x]=Integer.toString(set1[i])+""+Integer.toString(set2[j]) ;
								x++;
							}
						}
					}
					
					System.out.println();
					System.out.println();
					
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<nset2;i++)
					{
						System.out.print(set2[i]+" ");
					}
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<set2.length;i++)
					{
						System.out.print("- ");
					}
				
					System.out.println();
					
					for(int i=0;i<nset1;i++)
					{
						System.out.print(set1[i] + "| " );
						
						for(int j=0;j<nset2;j++)
						{
							String a = Integer.toString(set1[i])+""+Integer.toString(set2[j]);
							boolean isinclude=false;
							
							for(int k=0;k<counter;k++)
							{
								if(a.equals(rel[k]))
								{
									isinclude=true;
									break;
								}
								
								else
									isinclude=false;
							}
							
							if(isinclude)
								System.out.print(1+" ");
							
							else
								System.out.print(0+" ");
							
							
						}
						System.out.println();
					}
				}
			}
			
			else if(choice == 4)
			{
				int counter=0;
				System.out.println("your relation: ");
				System.out.print("{");
				for(int i=0;i<nset1;i++)
				{
					for(int j=0;j<nset2;j++)
					{
						if(set1[i]<=set2[j] && set1[i]%2!=0 && set2[j]%2!=0)
						{
						System.out.print(" ("+set1[i]+ "," +set2[j]+") ");
						counter++;
						}
					}
				}
				
				System.out.print("}");
				if(counter!=0)
				{
					String rel[] = new String[counter];
					int x=0;
					for(int i=0;i<nset1;i++)
					{
						for(int j=0;j<nset2;j++)
						{
							if(set1[i]<=set2[j] && set1[i]%2!=0 && set2[j]%2!=0)
							{
								rel[x]=Integer.toString(set1[i])+""+Integer.toString(set2[j]) ;
								x++;
							}
						}
					}
					
					System.out.println();
					System.out.println();
					
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<nset2;i++)
					{
						System.out.print(set2[i]+" ");
					}
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<set2.length;i++)
					{
						System.out.print("- ");
					}
				
					System.out.println();
					
					for(int i=0;i<nset1;i++)
					{
						System.out.print(set1[i] + "| " );
						
						for(int j=0;j<nset2;j++)
						{
							String a = Integer.toString(set1[i])+""+Integer.toString(set2[j]);
							boolean isinclude=false;
							
							for(int k=0;k<counter;k++)
							{
								if(a.equals(rel[k]))
								{
									isinclude=true;
									break;
								}
								
								else
									isinclude=false;
							}
							
							if(isinclude)
								System.out.print(1+" ");
							
							else
								System.out.print(0+" ");
							
							
						}
						System.out.println();
					}
				}
			}
			
			else if(choice == 5)
			{
				int counter=0;
				System.out.println("your relation: ");
				System.out.print("{");
				for(int i=0;i<nset1;i++)
				{
					for(int j=0;j<nset2;j++)
					{
						if(set1[i]>=set2[j]+1 )
						{
						System.out.print(" ("+set1[i]+ "," +set2[j]+") ");
						counter++;
						}
					}
				}
				
				System.out.print("}");
				if(counter!=0)
				{
					String rel[] = new String[counter];
					int x=0;
					for(int i=0;i<nset1;i++)
					{
						for(int j=0;j<nset2;j++)
						{
							if(set1[i]>=set2[j]+1)
							{
								rel[x]=Integer.toString(set1[i])+""+Integer.toString(set2[j]) ;
								x++;
							}
						}
					}
					
					System.out.println();
					System.out.println();
					
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<nset2;i++)
					{
						System.out.print(set2[i]+" ");
					}
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<set2.length;i++)
					{
						System.out.print("- ");
					}
				
					System.out.println();
					
					for(int i=0;i<nset1;i++)
					{
						System.out.print(set1[i] + "| " );
						
						for(int j=0;j<nset2;j++)
						{
							String a = Integer.toString(set1[i])+""+Integer.toString(set2[j]);
							boolean isinclude=false;
							
							for(int k=0;k<counter;k++)
							{
								if(a.equals(rel[k]))
								{
									isinclude=true;
									break;
								}
								
								else
									isinclude=false;
							}
							
							if(isinclude)
								System.out.print(1+" ");
							
							else
								System.out.print(0+" ");
							
							
						}
						System.out.println();
					}
				}
			}
			
			else if(choice == 6)
			{
				int counter=0;
				System.out.println("your relation: ");
				System.out.print("{");
				for(int i=0;i<nset1;i++)
				{
					for(int j=0;j<nset2;j++)
					{
						if((set1[i]+set2[j])%2==0 )
						{
						System.out.print(" ("+set1[i]+ "," +set2[j]+") ");
						counter++;
						}
					}
				}
				
				System.out.print("}");
				if(counter!=0)
				{
					String rel[] = new String[counter];
					int x=0;
					for(int i=0;i<nset1;i++)
					{
						for(int j=0;j<nset2;j++)
						{
							if((set1[i]+set2[j])%2==0)
							{
								rel[x]=Integer.toString(set1[i])+""+Integer.toString(set2[j]) ;
								x++;
							}
						}
					}
					
					System.out.println();
					System.out.println();
					
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<nset2;i++)
					{
						System.out.print(set2[i]+" ");
					}
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<set2.length;i++)
					{
						System.out.print("- ");
					}
				
					System.out.println();
					
					for(int i=0;i<nset1;i++)
					{
						System.out.print(set1[i] + "| " );
						
						for(int j=0;j<nset2;j++)
						{
							String a = Integer.toString(set1[i])+""+Integer.toString(set2[j]);
							boolean isinclude=false;
							
							for(int k=0;k<counter;k++)
							{
								if(a.equals(rel[k]))
								{
									isinclude=true;
									break;
								}
								
								else
									isinclude=false;
							}
							
							if(isinclude)
								System.out.print(1+" ");
							
							else
								System.out.print(0+" ");
							
							
						}
						System.out.println();
					}
				}
			}
			
			else if(choice == 7)
			{
				int counter=0;
				System.out.println("your relation: ");
				System.out.print("{");
				for(int i=0;i<nset1;i++)
				{
					for(int j=0;j<nset2;j++)
					{
						if(set1[i]==set2[j])
						{
						System.out.print(" ("+set1[i]+ "," +set2[j]+") ");
						counter++;
						}
					}
				}
				
				System.out.print("}");
				if(counter!=0)
				{
					String rel[] = new String[counter];
					int x=0;
					for(int i=0;i<nset1;i++)
					{
						for(int j=0;j<nset2;j++)
						{
							if(set1[i]==set2[j])
							{
								rel[x]=Integer.toString(set1[i])+""+Integer.toString(set2[j]) ;
								x++;
							}
						}
					}
					
					System.out.println();
					System.out.println();
					
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<nset2;i++)
					{
						System.out.print(set2[i]+" ");
					}
				
					System.out.println();
					
					System.out.print("   ");
					for(int i=0;i<set2.length;i++)
					{
						System.out.print("- ");
					}
				
					System.out.println();
					
					for(int i=0;i<nset1;i++)
					{
						System.out.print(set1[i] + "| " );
						
						for(int j=0;j<nset2;j++)
						{
							String a = Integer.toString(set1[i])+""+Integer.toString(set2[j]);
							boolean isinclude=false;
							
							for(int k=0;k<counter;k++)
							{
								if(a.equals(rel[k]))
								{
									isinclude=true;
									break;
								}
								
								else
									isinclude=false;
							}
							
							if(isinclude)
								System.out.print(1+" ");
							
							else
								System.out.print(0+" ");
							
							
						}
						System.out.println();
					}
				}
			}
			
			else
			{
				System.out.println("incorrect");
			}
				
			System.out.println();
			System.out.println("you wanna repeat it ? type yes to do it: ");
			repeat=cin.next();
	
		}while(repeat.equals("yes"));
		
		
		System.out.println("End");
		
		}
		
		else
		{
			System.out.println("you cant do relation between 2 sets that one of them is blank");
		}
		
		}
		
		else if(q==2)
		{
			String again ="";
			
			do {
				System.out.println("welcome please choose one of them :");
				System.out.println("1- for one set");
				System.out.println("2- for two set");
				System.out.print("enter : ");
				int halbzhardn = cin.nextInt();
				
				
				if(halbzhardn == 1)
				{
					System.out.print("please enter number of elements : ");
					int nset1=cin.nextInt();
					
					if(nset1 != 0)
					{
					String set1[] = new String[nset1];
					
					System.out.print("please fill it : ");
					for(int i=0 ; i<nset1 ; i++)
					{
						set1[i] = cin.next();
					}
					
					System.out.println("please enter matrix like this using 0 and 1 : ");
					
					System.out.print("  ");
					for(int i=0 ; i<nset1 ; i++)
					{
						System.out.print(set1[i] + " ");
						
					}
					System.out.println();
					
					System.out.print("  ");
					for(int i=0 ; i<nset1 ; i++)
					{
						
						System.out.print("- ");
					}
					System.out.println();
					
					for(int i=0 ; i<nset1 ; i++)
					{
					
						System.out.print(set1[i] + "|");
						for(int j=0 ; j<nset1;j++)
						{
							System.out.print("? ");
						}
						System.out.println();
					}
					
					
					System.out.println();
					
					String matrix[][] = new String[nset1][nset1];
					
					System.out.println("please fill the matrix: ");
					for(int i=0 ; i<nset1 ; i++)
					{
					
						
						for(int j=0 ; j<nset1;j++)
						{
							matrix[i][j] = cin.next();
						}
						
					}
					
					
					System.out.println();
					
					System.out.println("your matrix: ");
					
					System.out.print("  ");
					for(int i=0 ; i<nset1 ; i++)
					{
						System.out.print(set1[i] + " ");
						
					}
					System.out.println();
					
					System.out.print("  ");
					for(int i=0 ; i<nset1 ; i++)
					{
						
						System.out.print("- ");
					}
					System.out.println();
					
					for(int i=0 ; i<nset1 ; i++)
					{
					
						System.out.print(set1[i] + "|");
						for(int j=0 ; j<nset1;j++)
						{
							System.out.print(matrix[i][j]+ " ");
						}
						System.out.println();
					}
					
					boolean iszerom=true;
					
					for(int i=0 ; i<nset1 ; i++)
					{
					
						
						for(int j=0 ; j<nset1;j++)
						{
							
							if(matrix[i][j].equals("1"))
								iszerom=false;
								
						}
						
					}
					
					System.out.println();
					
					if(iszerom==false)
					{
					
					System.out.println("-------------------------------------------------------------------");
					
					System.out.print("your relation = { ");
					for(int i=0 ; i<nset1 ; i++)
					{
					
						
						for(int j=0 ; j<nset1;j++)
						{
							if(matrix[i][j].equals("1"))
							{
								System.out.print("("+set1[i] + ","+set1[j] + ") ");
								
							}
						}
						
					}
					System.out.println("}");
					
					System.out.println();
					
					
					//for reflexive 
					
					System.out.println("is it reflexive? ");
					boolean reflexive = true;
					int isntref=0;
					
					for(int i=0 ; i<nset1;i++)
					{
						if(matrix[i][i].equals("0"))
						{
							reflexive = false;
							if(isntref==0)
								System.out.println("its not reflexive because ( " + set1[i] +"," + set1[i] +" ) does not belong to relation " );
							
							else
								System.out.println("and ( " + set1[i] +"," + set1[i] +" ) does not belong to relation");
							
							
							isntref++;
						}
						
					}
					
					if(reflexive)
						System.out.println("yes its reflexive relation");
					
					
					
					System.out.println();
					
					//for symmetric
					boolean issymm = true;
					System.out.println("is it symmetric ?");
					for(int i=0;i<matrix.length;i++)
					{
						for(int j=0;j<matrix[i].length;j++)
						{
							if(matrix[i][j].equals("1") && matrix[j][i].equals("1"))
							{
								
							}
							
							else if(matrix[i][j].equals("1") && matrix[j][i].equals("0"))
							{
								issymm = false;
								System.out.println("isnt symmetric because ("+ set1[i] +"," + set1[j] + ") belong to relation but ("  + set1[j] +"," +set1[i] +") does not belong to relation" );
								break;
								
							}
							
							if(issymm == false)
								break;
						}
						
						if(issymm == false)
							break;
						
						
					}
					
					if(issymm)
						System.out.println("yes its symmetric relation");
					
					
					System.out.println();
					
					
					// for transitive 
					System.out.println("is it transitive ? ");
					boolean istrans=true;
					
					for(int a=0;a<matrix.length;a++)
					{
						for(int b=0;b<matrix[a].length;b++)
						{
							for(int c=0;c<matrix[a].length;c++)
							{
								if(matrix[a][b].equals("1") && matrix[b][c].equals("1") )
								{
									if(matrix[a][c].equals("1"))
									{
										
									}
									
									else
									{
										istrans=false;
										System.out.println("isnt transitive because (" + set1[a] + "," + set1[b] + ") and (" + set1[b] + "," + set1[c] + ") belong to relation but (" + set1[a] + "," +set1[c] + ") does not belong to relation");
										break;
									}
									
								
								}
								
								if(istrans == false)
									break;
							}
							
							if(istrans == false)
								break;
						}
						
						if(istrans == false)
							break;
					}
					
				
					if(istrans)
						System.out.println("yes its transitive relation");
					
					
					System.out.println();
					
					//for equivalence relation 
					System.out.println("is it equivalence relation ? ");
					
					if(reflexive && issymm && istrans)
						System.out.println("so its eqivalence relation ");
					
					else
					{
						System.out.println("isnt equivalence relation because ");
						
						if(reflexive == false)
							System.out.println("- isnt reflexive");
						
						if(issymm == false)
							System.out.println("- isnt symmetric");
						
						if(istrans == false)
							System.out.println("- isnt transitive");
					}
					
					
					System.out.println();
					
					System.out.println("-------------------------------------------------------------------");
					
					//for domain
					System.out.print("The Domain = { ");
					for(int i=0 ; i<nset1 ; i++)
					{
					
						boolean isd = false;
						
						for(int j=0 ; j<nset1;j++)
						{
							if(matrix[i][j].equals("1"))
							{
							
								isd=true;
							}
						}
						
						if(isd)
							System.out.print("("+set1[i] + ") ");
						
					}
					System.out.println("}");
					
					
					
					//for range 
					System.out.print("The Range = { ");
					for(int i=0 ; i<nset1 ; i++)
					{
					
						boolean isr = false;
					
						
						for(int j=0 ; j<nset1;j++)
						{
							if(matrix[j][i].equals("1"))
							{
							
								isr=true;
							
						    	
							}
						}
						
					
						if(isr)
							System.out.print("("+set1[i] + ") ");
						
					}
					System.out.println("}");
					
					
					
					System.out.println();
					
					}
				
					else
					{
						System.out.println("its zero matrix and we dont have any relation");
					}
					
					
					
					}
					
					
					
					
					
					else 
					{
						System.out.println("its PHI");
					}
					
		
				}
				
				
				else if (halbzhardn == 2)
				{
					System.out.print("please enter number of elements for first set: ");
					int nset1=cin.nextInt();
					
					
					
					System.out.print("please enter number of elements for second set: ");
					int nset2=cin.nextInt();
					
					
					if(nset1 != 0 && nset2!=0)
					{
							
						String set1[] = new String[nset1];
						
						System.out.print("please fill first set : ");
						for(int i=0 ; i<nset1 ; i++)
						{
							set1[i] = cin.next();
						}
						
						
						
						String set2[] = new String[nset2];
						
						System.out.print("please fill second set : ");
						for(int i=0 ; i<nset2 ; i++)
						{
							set2[i] = cin.next();
						}
						
						
						System.out.println("please enter matrix like this using 0 and 1 : ");
						
						System.out.print("  ");
						for(int i=0 ; i<nset2 ; i++)
						{
							System.out.print(set2[i] + " ");
							
						}
						System.out.println();
						
						System.out.print("  ");
						for(int i=0 ; i<nset2 ; i++)
						{
							
							System.out.print("- ");
						}
						System.out.println();
						
						for(int i=0 ; i<nset1 ; i++)
						{
						
							System.out.print(set1[i] + "|");
							for(int j=0 ; j<nset2;j++)
							{
								System.out.print("? ");
							}
							System.out.println();
						}
						
						
						System.out.println();
						
						String matrix[][] = new String[nset1][nset2];
						
						System.out.println("please fill the matrix: ");
						for(int i=0 ; i<nset1 ; i++)
						{
						
							
							for(int j=0 ; j<nset2;j++)
							{
								matrix[i][j] = cin.next();
							}
							
						}
						
						
						System.out.println();
						
						System.out.println("your matrix: ");
						
						System.out.print("  ");
						for(int i=0 ; i<nset2 ; i++)
						{
							System.out.print(set2[i] + " ");
							
						}
						System.out.println();
						
						System.out.print("  ");
						for(int i=0 ; i<nset2 ; i++)
						{
							
							System.out.print("- ");
						}
						System.out.println();
						
						for(int i=0 ; i<nset1 ; i++)
						{
						
							System.out.print(set1[i] + "|");
							for(int j=0 ; j<nset2;j++)
							{
								System.out.print(matrix[i][j]+ " ");
							}
							System.out.println();
						}
						
						
						boolean iszerom=true;
						
						for(int i=0 ; i<nset1 ; i++)
						{
						
							
							for(int j=0 ; j<nset2;j++)
							{
								
								if(matrix[i][j].equals("1"))
									iszerom=false;
									
							}
							
						}
						
						System.out.println();
						
						
						if(iszerom == false)
						{
							System.out.print("your relation = { ");
							for(int i=0 ; i<nset1 ; i++)
							{
							
								
								for(int j=0 ; j<nset2;j++)
								{
									if(matrix[i][j].equals("1"))
									{
										System.out.print("("+set1[i] + ","+set2[j] + ") ");
										
									}
								}
								
							}
							System.out.println("}");
							
							System.out.println();
							
							//for domain
							System.out.print("The Domain = { ");
							for(int i=0 ; i<nset1 ; i++)
							{
							
								boolean isd = false;
								
								for(int j=0 ; j<nset2;j++)
								{
									if(matrix[i][j].equals("1"))
									{
									
										isd=true;
									}
								}
								
								if(isd)
									System.out.print("("+set1[i] + ") ");
								
							}
							System.out.println("}");
							
							
							
							//for range 
							System.out.print("The Range = { ");
							for(int i=0 ; i<nset2 ; i++)
							{
							
								boolean isr = false;
								
								
								for(int j=0 ; j<nset1;j++)
								{
									if(matrix[j][i].equals("1"))
									{
									
										isr=true;
									
								    	
									}
								}
								
							
								if(isr)
									System.out.print("("+set2[i] + ") ");
								
							}
							System.out.println("}");
							
							
							
							System.out.println();
							
						}
						
						
						
						
					}
					
					else
					{
						System.out.println("you can not do relation between 2 sets that one of them is blanck ");
					}
				}
				
				else 
				{
					System.out.println("incorrect!");
				}
				
				System.out.println();
				System.out.println("you wanna repeat it ? type yes to do it: ");
				again=cin.next();
				
				
			}while(again.equalsIgnoreCase("yes"));
			
			System.out.println("End");
			
			
		}
		
		System.out.println();
		System.out.print("you wanna repeat it from first ? type yes to do it: ");
		dwbara=cin.next();
		
		
		}while(dwbara.equals("yes"));
		
		}
		

	}


