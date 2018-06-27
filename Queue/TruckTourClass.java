
public class TruckTourClass
{
	
	static int truckTour(int[][] petrolpumps)
	{
		int start = 0;
		int end = 1;
		int currentpetrol = petrolpumps[start][0] - petrolpumps[start][1];
		
		while(end!=start || currentpetrol <0)
		{
			while(currentpetrol < 0 && start != end)
            {
                currentpetrol -= petrolpumps[start][0] - petrolpumps[start][1];
                start = (start + 1) % (petrolpumps.length);
                 
                if(start == 0)
                    return -1;
            }
          
            currentpetrol += petrolpumps[end][0] - petrolpumps[end][1];
             
            end = (end + 1)% (petrolpumps.length);
        }
		
		return start;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
        int[][] petrolpumps = { {1,5} , {10,3} , {3,4}};              
       int result = truckTour(petrolpumps);
        System.out.println(result);
	}

}
