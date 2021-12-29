package Iterator;

import Things.Lamp;

public class LampIterator implements Iterator {
	
	 private LampGroup lampGroup;
	    private int index;
	    
	    public LampIterator(LampGroup lampGroup)
	    {
	        this.lampGroup =lampGroup;
	        this.index = 0;
	    }
	    
	    public boolean hasNext()
	    {
	        if(index < lampGroup.getLength())
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	    public Object next()
	    {
	    	Lamp lamp = lampGroup.getLamp(index);
	        index++;
	        return lamp;
	    }
	    
	    
}
