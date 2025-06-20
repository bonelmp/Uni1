package exercises;

public enum CoursePhase {
	NOT_STARTED("Course not started yet"), ONGOING("Course is in progress"), FINISHED("Course has ended");

	private final String message;

	CoursePhase(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public static void main(String [] args) {
		for(CoursePhase phase : CoursePhase.values()) {
			System.out.println(phase.name() + ": " + phase.getMessage());
		}
	}
}
