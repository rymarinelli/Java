import java.util.ArrayList;

public class Shopping {
    ArrayList<String> shopping = new ArrayList<String>();;
    int number;
    String item;
	
	public Shopping() {
		shopping = new ArrayList<String>();
	}
	
	public void setItem(String item)
	{
		this.item = item;
	}
	
	public String getItem()
	{
		return item;
		
	}
	
	public void addItem(String item)
	{
		shopping.add(item);
	}
	
	public int numberOfItems()
	{
		return shopping.size();
	}	
	
	public void showItem(int number)
	{
		shopping.get(number);
	}
	
	public void listItems()
	{
	   for(int i = 0; i < shopping.size(); i++)
	   {
		   System.out.println(shopping.get(i));
	   }
	}
}
