public class MainApp{
      public static void main(String [] args) {
      try
      {
      final int M=2000;
      BloomFilterProject filter =new BloomFilterProject(M);
      LineReader reader = new LineReader("basic.txt");
	      while (reader.hasNext())
	      {
	    	  String words=reader.next();
	    	  //System.out.println(words);
	    	  filter.add(words);
	      }
	     // System.out.println();
	      
	      reader = new LineReader("basic.txt");
	      while (reader.hasNext())
	      {
	    	  String words=reader.next();
	    	  if(!filter.isIn(words))
	    	  { 
	    		  System.out.println(words);
	    	  }
	      }
          System.out.println("Accuracy-->:"+filter.accuracy());
      }
      catch(IllegalArgumentException e)
        {
          System.out.println(e);
        }
      catch(IndexOutOfBoundsException e)
        {
          System.out.println(e);
        }
    }
  }
