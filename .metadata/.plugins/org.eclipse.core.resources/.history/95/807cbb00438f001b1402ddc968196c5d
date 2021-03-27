package timers;

/**
 * Concrete class to provide modules with a way of recording time.
 * @author Andrew McKay
 *
 */
public class Timer implements Timers 
{
	private long startTime;
	private long endTime;
	private long resultTime;
	
	/**
	 * Initialize a Timer object with default values of zero.
	 */
	public Timer()
	{
		setStartTime(0);
		setEndTime(0);
		setResultTime(0);
	}
	
	/**
	 * Retrieves the recorded start-time (in nanoseconds).
	 * @return Timer.startTime
	 */
	public long getStartTime()
	{
		return startTime;
	}
	/**
	 * Sets Timer.startTime to the current time in nanoseconds.
	 */
	public void setStartTime()
	{
		this.startTime = System.nanoTime();
	}
	/**
	 * Sets Timer.startTime to a specific time in nanoseconds.
	 * @param startTime long integer that represents time in nanoseconds
	 */
	public void setStartTime(long startTime)
	{
		this.startTime = startTime;
	}
	
	/**
	 * Retrieves the recorded end-time (in nanoseconds).
	 * @return Timer.endTime
	 */
	public long getEndTime()
	{
		return endTime;
	}
	/**
	 * Sets Timer.endTime to the current time in nanoseconds.
	 */
	public void setEndTime()
	{
		this.endTime = System.nanoTime();
	}
	/**
	 * Sets Timer.endTime to a specific time in nanoseconds.
	 * @param endTime long integer that represents time in nanoseconds
	 */
	public void setEndTime(long endTime)
	{
		this.endTime = endTime;
	}
	
	/**
	 * Retrieves the recorded result time.
	 * @return Timer.resultTime
	 */
	public long getResultTime()
	{
		return resultTime;
	}
	/**
	 * Calculates and sets Timer.resultTime by subtracting the recorded end-time by the recorded start-time.
	 */
	public void setResultTime()
	{
		this.resultTime = getEndTime() - getStartTime();
	}
	/**
	 * Sets Timer.resultTime to a specific time in nanoseconds.
	 * @param resultTime long integer that represents time in nanoseconds
	 */
	public void setResultTime(long resultTime)
	{
		this.resultTime = resultTime;
	}
	
	@Override
	public void startTimer() 
	{
		setStartTime();
	}

	@Override
	public void endTimer() 
	{
		setEndTime();
		setResultTime();
	}

}
