package at.nacs.drhouseadmission;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientEndpoint {

    private final AddmissionID addmissionID;

    @PostMapping()
    Patient post(@RequestBody Patient patient) {
        addmissionID.getID(patient);
        return patient;
    }


}