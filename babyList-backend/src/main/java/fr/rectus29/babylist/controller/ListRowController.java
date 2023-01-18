package fr.rectus29.babylist.controller;

import fr.rectus29.babylist.model.ListRow;
import fr.rectus29.babylist.repository.ListRowRepository;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/listrows")
public class ListRowController {

    private final ListRowRepository listRowRepository;

    @Autowired
    public ListRowController(ListRowRepository listRowRepository) {
        this.listRowRepository = listRowRepository;
    }

    @GetMapping("")
    public List<ListRowCommand> getAll() {
        return listRowRepository.findAll().stream().map(ListRowCommand::of).toList();
    }

    @Data
    @Accessors(chain = true)
    public static class ListRowCommand {
        private String label;
        private List<String> linkList;
        private String userEmail;

        public static ListRowCommand of(ListRow listRow){
            return new ListRowCommand()
                    .setLabel(listRow.getLabel())
                    .setUserEmail(listRow.getUser() != null ? listRow.getUser().getEmail() : null)
                    .setLinkList(listRow.getLinkList());
        }
    }
}
