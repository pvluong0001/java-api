package luong.lit.api;

import luong.lit.entity.Project;
import luong.lit.repository.ProjectRepository;
import luong.lit.response.DataResponse;
import luong.lit.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping()
    public DataResponse all() {
        return new DataResponse(projectRepository.findAll());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public DataResponse create(@RequestBody Project resource) {
        Project project = projectRepository.save(resource);
        System.out.println(project);

        return new DataResponse(project);
    }
}
