package newproject.msaccountreservation.Config;

import lombok.RequiredArgsConstructor;
import newproject.msaccountreservation.Entity.AccountStatus;
import newproject.msaccountreservation.Enum.AccountStatusType;
import newproject.msaccountreservation.Repository.AccountStatusRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class AccountStatusInitializer implements ApplicationRunner {

    private final AccountStatusRepository accountStatusRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) {

        for (AccountStatusType type : AccountStatusType.values()) {

            accountStatusRepository.findByName(type.name())
                    .orElseGet(() -> {
                        AccountStatus status = new AccountStatus();
                        status.setName(type.name());
                        status.setDescription(type.getDescription());
                        return accountStatusRepository.save(status);
                    });
        }
    }
}
