import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class LineReader
{
	  private String         line;    //  Line waiting to be returned by NEXT.
	  private BufferedReader reader;  //  Where to read LINEs from.
	
	//  Constructor. Make a new instance of LINE READER. It reads LINEs from a file
	//  whose pathname is PATH.
	
	  public LineReader(String path)
	  {
	    try
	    {
	      reader = new BufferedReader(new FileReader(path));
	      line = reader.readLine();
	    }
	    catch (IOException ignore)
	    {
	      throw new IllegalArgumentException("Can't open '" + path + "'.");
	    }
	  }
	
	//  HAS NEXT. Test if a LINE is waiting to be returned by NEXT.
	
	  public boolean hasNext()
	  {
	    return line != null;
	  }
	
	//  NEXT. Return the current LINE from PATH and advance to the next LINE, if it
	//  exists.
	
	  public String next()
	  {
	    try
	    {
	      String temp = line;
	      line = reader.readLine();
	      return temp;
	    }
	    catch (IOException ignore)
	    {
	      throw new IllegalStateException("Can't read any more lines.");
	    }
	  }

//  MAIN. Open the file whose pathname is the 0th argument on the command line.
//  Copy that file to SYSTEM.OUT twice. This is included here only for testing,
//  so LINE READER can run as a stand-alone program.
}