package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcialarquitectura.repository.jpa.CheckpointRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CheckpointServiceTest {

    @InjectMocks
    CheckpointService service;

    @Mock
    CheckpointRepository checkpointRepository;

    void Dado_checkinDTO_Cuando_checkin_Entonces_(){
        CheckpointDTO dto = new CheckpointDTO("colo","yo", 2);
    }
}
