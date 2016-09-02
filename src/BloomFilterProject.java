//  LINE READER. Iterator. Read lines from a file as STRINGs.

class BloomFilterProject
	{
	  private BitArray newarray;
	  private int M;
	  public BloomFilterProject (int M)
	  {
		this.M=M;
		if(M<0)
	        {
			throw new IllegalArgumentException ("M less than 0");
	        }
		else
	        {
			newarray = new BitArray(M);
	        }
	  }
	  public int h1(String w)
	  {	
		int a =1;
		for(int i=0;i<w.length();i++)
		{
			a=a*31+w.charAt(i);
		}
	 	return Math.abs(a) % M;
	  
	  }
	  public int h2(String w)
	  {
		int a =7;
		for(int i=0;i<w.length();i++)
		{
			a=a*31+w.charAt(i);
		}
	 	return Math.abs(a) % M;
	  }
	  public int h3(String w)
	  {
		int a=0;
		for(int i=0;i<w.length();i++)
		{
			a=a*31+w.charAt(i);
		}
	 	return Math.abs(a) % M;
	  }
	  public int h4(String w)
	  {
		int a=5;
		for(int i=0;i<w.length();i++)
		{
			a=a*31+w.charAt(i);
		}
	 	return Math.abs(a) % M;
	  }
	  public int h5(String w)
	  {
		int a=0;
		for(int i=0;i<w.length();i++)
		{
			a=a*30+w.charAt(i);
		}
	 	return Math.abs(a) % M;
	  }
	  public void add(String w)
	  {
	  	newarray.set(h1(w));
		newarray.set(h2(w));
		newarray.set(h3(w));
		newarray.set(h4(w));
		newarray.set(h5(w));
	  }
	  public boolean isIn(String w)
	  {
	    return ((newarray.get(h1(w)))&&(newarray.get(h2(w)))&&(newarray.get(h3(w)))&&(newarray.get(h4(w)))&&(newarray.get(h5(w))));
	  }
	  public double accuracy()
	  {
	    double e=2.718281828;
	    int j=5;
	    return Math.pow((1-Math.pow(e,((-j)*850/M))),j);
	  }
}



