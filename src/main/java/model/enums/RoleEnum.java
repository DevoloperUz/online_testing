package model.enums;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 9/18/2022
 * Time: 5:44 PM
 */
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
