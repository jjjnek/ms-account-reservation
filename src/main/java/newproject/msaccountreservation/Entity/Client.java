package newproject.msaccountreservation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    private UUID id;

    private String fullName;

    private String citizenship;

    private String clientType;

    private String documentNumber;

    private String documentSeries;

    private String documentType;

    private Long mdmCode;

}
