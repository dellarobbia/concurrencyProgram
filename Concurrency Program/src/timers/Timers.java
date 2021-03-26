

package timers;

/**
 * Provide modules with a means of recording the length of time for a process.
 * 
 * @author Andrew McKay
 */
public interface Timers 
{
	/**
	 * Starts the Timer
	 */
	void startTimer();
	/**
	 * Ends the Timer
	 */
	void endTimer();
}
