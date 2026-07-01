package newproject.msaccountreservation.Enum;

public enum AccountStatusType {

    NEW("Счёт создан в БД"),

    IN_CREATION("Запрос на создание счета был отправлен в смежную систему"),

    CREATED("Счёт создан в смежной системе"),

    CANCELLED("Счёт аннулирован"),

    CLOSED("Счёт закрыт");

    private final String description;

    AccountStatusType(String description) {
         this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
