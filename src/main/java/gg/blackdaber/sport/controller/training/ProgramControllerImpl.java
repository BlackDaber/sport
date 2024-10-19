package gg.blackdaber.sport.controller.training;

import gg.blackdaber.sport.anotation.SportApiMapping;
import gg.blackdaber.sport.data.program.ProgramType;
import gg.blackdaber.sport.data.training.TrainingType;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

@SportApiMapping(value = "program")
@RestController
public class ProgramControllerImpl implements ProgramController {

    @GetMapping("/{level}")
    public String getAll(
            @PathVariable ProgramType level,
            @RequestParam(required = false) @Parameter TrainingType filter
    ) {
        return "programList" + level.name();
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id) {
        return "programById" + id;
    }

    @GetMapping("/individual")
    public String getIndividual() {
        // TODO: autogenerate by artificial intelligence
        return "individualProgram";
    }
}
