package model.enums;

public enum RoleEnum {
    ADMIN("Admin role vazifasi - ..."),
    DIRECTOR("Director role vazifasi - ..."),
    TEACHER("Teacher role vazifasi - ..."),
    STUDENT("Student role vazifasi - ..."),
    MODERATOR("Moderator role vazifasi - ...");

    final String description;

    RoleEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
