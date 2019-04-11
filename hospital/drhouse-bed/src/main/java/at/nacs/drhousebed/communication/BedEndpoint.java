package at.nacs.drhousebed.communication;


import at.nacs.drhousebed.logic.BedManeger;
import at.nacs.drhousebed.persistence.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class BedEndpoint {

    private final BedManeger manager;


    @PostMapping
    Patient post(@RequestBody Patient patient) {
        return manager.post(patient);
    }


}
