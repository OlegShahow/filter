package flowers.services.impl;

import flowers.entities.NameOfFlower;
import flowers.repositories.NameOfFlowerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NameOfFlowerService {

    private NameOfFlowerRepository nameOfFlowerRepository;


    public List<NameOfFlower> findAll() {
        return nameOfFlowerRepository.findAll();
    }
}
