package Iterator;

import Things.Lamp;

public class LampGroup implements Aggregate{
	    
	    private Lamp[] lamp;
	    private int num =0;
	    
	    public LampGroup(int num)
	    {
	        this.lamp = new Lamp[num];
	    }
	    
	    public Lamp getLamp(int index)
	    {
	        return lamp[index];
	    }
	    
	    public void AddLamp(Lamp lamp)
	    {
	        this.lamp[num] = lamp;
	        num++;
	    }
	    
	    public int getLength()
	    {
	        return num;
	    }
	    
	    public LampIterator iterator()
	    {
	        return new LampIterator(this);
	    }
	    


}
