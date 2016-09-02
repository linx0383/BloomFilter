
class BitArray{
	  private int[] bitarray;
	  private int M;
	  public BitArray(int M)
	  {
	       if(M<0)
		{
	 	   throw new IllegalArgumentException ("M less than 0");
		}
	       else
		{
	           bitarray=new int[M];
	           this.M=M;
		}
	  }
	  public boolean get(int n)
	  {
		if(n<0||n>=M)
	        {
	          throw new IndexOutOfBoundsException("n less than 0 or n greater than M");
	        }
	        else
		{
	            if(((bitarray[n/32])&((int)Math.pow(2,(n%32))))==0)
		  	{
				return false;
		  	}
	          	else
	          	{
	                	return true;
	          	}
		}
	  }
	  public void set(int n)
	  {
	      if(n<0||n>=M)
	      {
	         throw new IndexOutOfBoundsException("n less than 0 or n greater than M");
	      }
	      else
	      {
	         bitarray[n/32] = (bitarray[n/32])|(int)(Math.pow(2,(n%32)));
	      }
	  }
}
