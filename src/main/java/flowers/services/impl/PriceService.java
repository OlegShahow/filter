package flowers.services.impl;

import flowers.entities.Price;
import flowers.repositories.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PriceService {

    private PriceRepository priceRepository;

    public List<Price> findAll() {
        return priceRepository.findAll();
    }
}
