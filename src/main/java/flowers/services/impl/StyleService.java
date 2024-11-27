package flowers.services.impl;

import flowers.entities.Style;
import flowers.repositories.StyleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StyleService {

    private StyleRepository styleRepository;

    public List<Style> findAll() {
        return styleRepository.findAll();
    }

}
