
public class Singleton {
  private static Singleton instance = new Singleton();
  
  private Singleton() {
	  
  }
  
  public static Singleton getInstance() {
	  return instance;
  }

}
class MainClass{
	public static void main(String args[]) {
		Singleton a = Singleton.getInstance();
		
		Singleton b = Singleton.getInstance();
	}
}