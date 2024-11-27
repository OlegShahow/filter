package flowers.services.impl;

import flowers.entities.Sex;
import flowers.repositories.SexRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SexService {

    private SexRepository sexRepository;

    public List<Sex> findAll() {
        return sexRepository.findAll();
    }
}
