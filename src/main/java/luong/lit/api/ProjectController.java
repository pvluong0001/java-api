package luong.lit.api;

import luong.lit.entity.Project;
import luong.lit.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping()
    public Iterable<Project> all() {
        return projectRepository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Project resource) {
        projectRepository.save(resource);
    }
}
