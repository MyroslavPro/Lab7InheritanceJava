package lab7InheritanceJava;

public class SwimmingPoll{
	
	private int maxVisitorsPerTime;

	private String address;

	private float capacityInLiters;
	
	private float width;
	
	private float length;
	
	private float depth;
	
	private float costPerHour;
	
	public static int hoursOpened;
	
	protected int numberOfTrianers;
	
	protected float costPerHourWithTrainer;
	
	
	
	
	
	public SwimmingPoll(int maxVisitorsPerTime, String address, float capacityInLiters, float width, float length,
			float depth, float costPerHour, int numberOfTrianers, float costPerHourWithTrainer) {
		super();
		setValues(maxVisitorsPerTime, address, capacityInLiters, width, length, depth, costPerHour, numberOfTrianers, costPerHourWithTrainer);
	}

	public SwimmingPoll(int maxVisitorsPerTime, String address, float capacityInLiters, float width) {
		this(maxVisitorsPerTime,address,capacityInLiters,width,0,0,0,0,0);
	}

	public SwimmingPoll() {
		this(0,null,0,0,0,0,0,0,0);
	}

	
	private void setValues(int maxVisitorsPerTime, String address, float capacityInLiters, float width, float length,
			float depth, float costPerHour, int numberOfTrianers, float costPerHourWithTrainer) {
		this.maxVisitorsPerTime = maxVisitorsPerTime;
		this.address = address;
		this.capacityInLiters = capacityInLiters;
		this.width = width;
		this.length = length;
		this.depth = depth;
		this.costPerHour = costPerHour;
		this.numberOfTrianers = numberOfTrianers;
		this.costPerHourWithTrainer = costPerHourWithTrainer;		
	}
	
	public void resetValues(int maxVisitorsPerTime, String address, float capacityInLiters, float width, float length, float depth, float costPerHour, int numberOfTrianers, float costPerHourWithTrainer) {
		setValues(maxVisitorsPerTime, address, capacityInLiters, width, length, depth, costPerHour, numberOfTrianers, costPerHourWithTrainer);
	}
	
	

	public int getMaxVisitorsPerTime() {
		return maxVisitorsPerTime;
	}

	public void setMaxVisitorsPerTime(int maxVisitorsPerTime) {
		this.maxVisitorsPerTime = maxVisitorsPerTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getCapacityInLiters() {
		return capacityInLiters;
	}

	public void setCapacityInLiters(float capacityInLiters) {
		this.capacityInLiters = capacityInLiters;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public float getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(float costPerHour) {
		this.costPerHour = costPerHour;
	}

	public static void printStaticHoursOpened() {
		System.out.println(hoursOpened);
	}
	
	@Override
	public String toString() {
		return "SwimmingPoll [maxVisitorsPerTime=" + maxVisitorsPerTime + ", address=" + address + ", capacityInLiters="
				+ capacityInLiters + ", width=" + width + ", length=" + length + ", depth=" + depth + ", costPerHour="
				+ costPerHour + ", numberOfTrianers=" + numberOfTrianers + ", costPerHourWithTrainer="
				+ costPerHourWithTrainer + "]";
	}
}