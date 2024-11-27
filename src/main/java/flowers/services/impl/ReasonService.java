package flowers.services.impl;

import flowers.entities.Reason;
import flowers.repositories.ReasonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReasonService {

    private ReasonRepository reasonRepository;

    public List<Reason> findAll() {
        return reasonRepository.findAll();
    }
}
