package africa.semicolon.hotelManagementSystem.data.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HousekeepingTask {
    private Long taskId;
    private Room room;
    private Staff assignedTo;
    private TaskType taskType;
    private TaskStatus status;
    private Priority priority;
    private LocalDate scheduledDate;
    private LocalDateTime completedAt;
    private String notes;
}
