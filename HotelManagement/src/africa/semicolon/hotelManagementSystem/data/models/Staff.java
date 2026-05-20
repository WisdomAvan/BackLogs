package africa.semicolon.hotelManagementSystem.data.models;

import java.time.LocalDate;

public class Staff {
    private Long staffId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private StaffRole role;           // RECEPTIONIST, MANAGER, HOUSEKEEPER
    private String department;
    private LocalDate hireDate;
    private boolean isActive;
    private ShiftType shift;          // MORNING, AFTERNOON, NIGHT
    private String passwordHash;
}
