package africa.semicolon.hotelManagementSystem.data.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HousekeepingTask {
    private Long taskId;
    private Room room;                // FK → Room
    private Staff assignedTo;         // FK → Staff
    private TaskType taskType;        // CLEANING, INSPECTION, RESTOCKING, MAINTENANCE
    private TaskStatus status;        // PENDING, IN_PROGRESS, COMPLETED, SKIPPED
    private Priority priority;        // LOW, MEDIUM, HIGH
    private LocalDate scheduledDate;
    private LocalDateTime completedAt;
    private String notes;
}
