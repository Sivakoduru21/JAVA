package Interface;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		System.out.println("please implement security");
	}
	
	static void privacy() {
		System.out.println("please implement privacy");
		
	}
	
	/*
	 * private void commoncode() {
	 * System.out.println("common code to use in the same interface"); //used from java 1.9
	 * 
	 * 
	 * }
	 */
	

}
