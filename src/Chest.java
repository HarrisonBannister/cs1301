
public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing
	 * which ones are needed and naming them
	 */

	/**
	 * This method is used by the Map class, you won't need to call it yourself
	 * It should result in this chest being locked and storing which key locked it.
	 */
	public void lock(Key theKey) {
	}
	
	/**
	 * If theKey is the same key that was used to lock this chest, then
	 * the chest is unlocked.  Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) {
	}
	
	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	public boolean isLocked() {
	}
	
	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() {
	}
	
	/**
	 * Set the contents of the chest to this string.  You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) {
	}
	
	
	
}
